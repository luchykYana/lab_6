package enums;

import java.util.List;

public enum PizzaEnum {
    HAWAIIAN("Hawaiian pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.CHICKEN),
            String.valueOf(IngredientsEnum.DOMINO_SAUCE),
            String.valueOf(IngredientsEnum.PINEAPPLE),
            String.valueOf(IngredientsEnum.MOZZARELLA)
    })),
    FIVE_CHEESES("Five cheeses pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.ALFREDO_SAUCE),
            String.valueOf(IngredientsEnum.FETA),
            String.valueOf(IngredientsEnum.MOZZARELLA),
            String.valueOf(IngredientsEnum.BERGER_BLUE),
            String.valueOf(IngredientsEnum.CHEDDAR),
            String.valueOf(IngredientsEnum.PARMESAN)
    })),
    TONY_PEPPERONI("Tony's Pepperoni pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.DOMINO_SAUCE),
            String.valueOf(IngredientsEnum.MOZZARELLA),
            String.valueOf(IngredientsEnum.PEPPERONI)
    })),
    MARGHERITA("Margherita pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.DOMINO_SAUCE),
            String.valueOf(IngredientsEnum.MOZZARELLA),
            String.valueOf(IngredientsEnum.MOZZARELLA)
    })),
    TUSCAN("Tuscan pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.ALFREDO_SAUCE),
            String.valueOf(IngredientsEnum.FETA),
            String.valueOf(IngredientsEnum.MOZZARELLA),
            String.valueOf(IngredientsEnum.CHICKEN),
            String.valueOf(IngredientsEnum.TOMATOES),
            String.valueOf(IngredientsEnum.SPINACH)
    })),
    CARBONARA("Carbonara pizza", List.of(new String[]{
            String.valueOf(IngredientsEnum.ALFREDO_SAUCE),
            String.valueOf(IngredientsEnum.BACON),
            String.valueOf(IngredientsEnum.HAM),
            String.valueOf(IngredientsEnum.MUSHROOMS),
            String.valueOf(IngredientsEnum.ONIONS),
            String.valueOf(IngredientsEnum.MOZZARELLA)
    }));

    private final String name;
    private final List<String> ingredients;

    PizzaEnum(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "enums.PizzaEnum{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
