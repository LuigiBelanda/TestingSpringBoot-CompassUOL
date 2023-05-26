/*
Este é um exemplo de teste unitário para a classe ClinicServiceImpl utilizando o framework Mockito.
Vamos analisar o código passo a passo:

As anotações @ExtendWith(MockitoExtension.class) indicam que o teste
deve ser executado com a extensão do Mockito para JUnit 5.

As anotações @Mock são usadas para criar instâncias simuladas (mocks)
das dependências da classe ClinicServiceImpl. Neste caso, os mocks são criados para
PetRepository, VetRepository, OwnerRepository e VisitRepository.

A anotação @InjectMocks é usada para injetar automaticamente os mocks nas dependências da
classe ClinicServiceImpl. Isso permite que os mocks sejam utilizados dentro da instância do serviço que está sendo testada.

O método de teste findPetTypes() é anotado com @Test, indicando que é um método de teste a ser executado.

A lista petTypeList é inicializada como uma nova lista vazia. Essa lista será retornada
pelo método findPetTypes() do mock petRepository.

Utilizando o método given(petRepository.findPetTypes()).willReturn(petTypeList),
é definido o comportamento do mock petRepository. Ele irá retornar a lista petTypeList quando o método findPetTypes() for chamado.

A linha Collection<PetType> returnedPetTypes = service.findPetTypes(); chama o método
findPetTypes() do objeto service que está sendo testado e armazena o resultado na variável returnedPetTypes.

A linha then(petRepository).should().findPetTypes(); verifica se o método findPetTypes() do mock
petRepository foi chamado exatamente uma vez. Isso é feito usando o método then() do Mockito.

A linha assertThat(returnedPetTypes).isNotNull(); verifica se a coleção
returnedPetTypes não é nula usando o método isNotNull() do AssertJ. Isso garante que o método findPetTypes()
do objeto service retornou uma coleção válida.

No geral, esse teste verifica se o método findPetTypes() da classe ClinicServiceImpl
retorna uma coleção não nula e se chama corretamente o método findPetTypes() do petRepository.
*/

package org.springframework.samples.petclinic.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class ClinicServiceImplTest {

    @Mock
    PetRepository petRepository;

    @Mock
    VetRepository vetRepository;

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    VisitRepository visitRepository;

    @InjectMocks
    ClinicServiceImpl service;

    @Test
    void findPetTypes() {
        //given
        List<PetType> petTypeList = new ArrayList<>();
        given(petRepository.findPetTypes()).willReturn(petTypeList);

        //when
        Collection<PetType> returnedPetTypes = service.findPetTypes();

        //then
        then(petRepository).should().findPetTypes();
        assertThat(returnedPetTypes).isNotNull();
    }
}