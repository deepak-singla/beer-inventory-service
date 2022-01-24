package guru.beer.inventory.service.web.mappers;

import org.mapstruct.Mapper;

import guru.beer.inventory.service.domain.BeerInventory;
import guru.beer.inventory.service.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
