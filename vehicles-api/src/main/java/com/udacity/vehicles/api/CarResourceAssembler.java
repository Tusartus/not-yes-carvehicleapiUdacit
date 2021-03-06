package com.udacity.vehicles.api;

import com.udacity.vehicles.domain.car.Car;
//import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;



import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

/**
 * Maps the CarController to the Car class using HATEOAS
 */
@Component
public class CarResourceAssembler implements RepresentationModelAssembler<Car, EntityModel<Car>> {
    /*
    @Override
    public Resource<Car> toResource(Car car) {
        return new Resource<>(car,
                linkTo(methodOn(CarController.class).get(car.getId())).withSelfRel(),
                linkTo(methodOn(CarController.class).list()).withRel("cars"));

    }
    */
      @Override
     public EntityModel<Car> toModel(Car car) {

        EntityModel<Car> modelCar = EntityModel.of(car,
              linkTo(methodOn(CarController.class).get(car.getId())).withSelfRel(),
              linkTo(methodOn(CarController.class).list()).withRel("cars"));

        return modelCar;

        }



}
