import java.util.*;

public class OnlineStoreSearch {
    public static void main(String[] args) {
        Item[] catalog = {
            new Item(201, "Backpack", "Accessories"),
            new Item(202, "Notebook", "Stationery"),
            new Item(203, "Headphones", "Electronics"),
            new Item(204, "Water Bottle", "Kitchenware"),
            new Item(205, "Smartwatch", "Electronics")
        };

        String searchItem = "Headphones";
        System.out.println("Searching for: " + searchItem);

        Item foundLinear = SearchHelper.findItemLinear(catalog, searchItem);
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Item not found"));

        Arrays.sort(catalog, Comparator.comparing(Item::getName));

        Item foundBinary = SearchHelper.findItemBinary(catalog, searchItem);
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Item not found"));

        showTimeComplexity();
    }

    private static void showTimeComplexity() {
        System.out.println("\n--- Time Complexity ---");
        System.out.println("Linear Search  : Best - O(1), Average - O(n), Worst - O(n)");
        System.out.println("Binary Search  : Best - O(1), Average - O(log n), Worst - O(log n)");
        System.out.println("Note: Binary Search only works on sorted data.");
    }
}

class Item {
    private int id;
    private String name;
    private String category;

    public Item(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " - " + name + " [" + category + "]";
    }
}

class SearchHelper {
    public static Item findItemLinear(Item[] items, String targetName) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(targetName)) {
                return item;
            }
        }
        return null;
    }

    public static Item findItemBinary(Item[] sortedItems, String targetName) {
        int start = 0;
        int end = sortedItems.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int compare = sortedItems[mid].getName().compareToIgnoreCase(targetName);

            if (compare == 0) {
                return sortedItems[mid];
            } else if (compare < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return null;
    }
}
