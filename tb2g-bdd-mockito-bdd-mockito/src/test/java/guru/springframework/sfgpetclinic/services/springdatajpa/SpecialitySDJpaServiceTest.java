package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    @Mock
    SpecialtyRepository specialtyRepository;

    @InjectMocks
    SpecialitySDJpaService service;

    @Test
    void testDeleteByObject() {
        // Given
        Speciality speciality = new Speciality();

        // When
        service.delete(speciality);

        // Then
        then(specialtyRepository).should().delete(any(Speciality.class));
    }

    // BDD
    @Test
    void findByIdBddTest() {
        // given
        Speciality speciality = new Speciality();
        given(specialtyRepository.findById(1L)).willReturn(Optional.of(speciality));

        // When
        Speciality foundSpecialty = service.findById(1L);

        // Then
        assertThat(foundSpecialty).isNotNull();
        then(specialtyRepository).should().findById(anyLong());
        // Garantindo que specialityRepository não terá mais nenhuma execução / iteração
        then(specialtyRepository).shouldHaveNoMoreInteractions();
    }

    @Test
    void deleteById() {
        // Given - none

        // When
        service.deleteById(1l);
        service.deleteById(1l);

        // Then
        then(specialtyRepository).should(times(2)).deleteById(1L);
    }

    @Test
    void deleteByIdAtLeast() {
        // Given - none

        // When
        service.deleteById(1l);
        service.deleteById(1l);

        // Then
        then(specialtyRepository).should(atLeastOnce()).deleteById(1L);
    }

    @Test
    void deleteByIdAtMost() {
        // Given - none

        // When
        service.deleteById(1l);
        service.deleteById(1l);

        // Then
        then(specialtyRepository).should(atMost(5)).deleteById(1L);
    }

    @Test
    void deleteByIdNever() {
        // Given - none

        // When
        service.deleteById(1l);
        service.deleteById(1l);

        // Then
        then(specialtyRepository).should(atLeastOnce()).deleteById(1L);
        then(specialtyRepository).should(never()).deleteById(5L);
    }

    @Test
    void testDelete() {
        // When
        service.delete(new Speciality());

        // Then
        then(specialtyRepository).should().delete(any());
    }
}