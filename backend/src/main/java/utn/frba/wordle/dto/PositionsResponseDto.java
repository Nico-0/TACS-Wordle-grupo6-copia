package utn.frba.wordle.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Builder

public class PositionsResponseDto {
    List <LadderboardDto> tourneys;
}