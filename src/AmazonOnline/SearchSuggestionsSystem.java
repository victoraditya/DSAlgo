package AmazonOnline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchSuggestionsSystem {

    public static void main(String[] args) {

        String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        String searchWord = "mouse";

        String[] products1 = {"bags", "baggage", "banner", "box", "cloths"};
        String searchWord1 = "bags";

        SearchSuggestionsSystem searchSuggestionsSystem = new SearchSuggestionsSystem();
        List<List<String>> finalProducts = searchSuggestionsSystem.suggestedProducts(products, searchWord);
        System.out.println(finalProducts);

        List<List<String>> finalProducts1 = searchSuggestionsSystem.suggestedProducts(products1, searchWord1);
        System.out.println(finalProducts1);

    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<String> listOfProducts = Arrays.asList(products);
        List<List<String>> finalProducts = new ArrayList<>();

        for (int i = 0; i <= searchWord.length(); i++) {
            String begins = searchWord.substring(0, i);
            List<String> newList = listOfProducts.stream().filter(prd -> prd.startsWith(begins)).collect(Collectors.toList());

            finalProducts.add(newList.size() >= 3 ? newList.subList(0, 3) : newList);
        }
        finalProducts.remove(0);
        return finalProducts;
    }

}
