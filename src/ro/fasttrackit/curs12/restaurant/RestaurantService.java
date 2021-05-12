package ro.fasttrackit.curs12.restaurant;

import java.util.*;

public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(Collection<Restaurant> restaurants) {
        this.restaurants.addAll(restaurants);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Map<RestaurantType, List<Restaurant>> groupByType() {
        Map<RestaurantType, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<Restaurant> existingList = result.get(restaurant.getType());
            if (existingList == null) {
                existingList = new ArrayList<>();
            }
            existingList.add(restaurant);
            result.put(restaurant.getType(), existingList);
        }
        return result;
    }

    public Map<String, RestaurantType> mapRestaurantToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<String, String> mapRestaurantToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }

        return result;
    }

}
