package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.repositories.VetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {
    // Criando o mock
    @Mock
    VetRepository vetRepository;

    // Injetando o mock acima no service abaixo
    @InjectMocks
    VetSDJpaService service;

    // Testando
    @Test
    void deleteById() {
        service.deleteById(1l);

        verify(vetRepository).deleteById(1l);
    }
}