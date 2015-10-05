package de.fischerprofil.fp.provider;

import android.content.SearchRecentSuggestionsProvider;

import java.util.Random;

public class OrderSuggestionProvider extends SearchRecentSuggestionsProvider {

  public final static String AUTHORITY = OrderSuggestionProvider.class.getName();
  public final static int MODE = SearchRecentSuggestionsProvider.DATABASE_MODE_2LINES
      | SearchRecentSuggestionsProvider.DATABASE_MODE_QUERIES;

  public OrderSuggestionProvider() {
    super();
    setupSuggestions(AUTHORITY, MODE);
  }

  public static final String[] sCheeseStrings = { "a","b" };

  private static Random RANDOM = new Random(System.currentTimeMillis());

  public static String generateRandomSuggestion() {
    return sCheeseStrings[RANDOM.nextInt(sCheeseStrings.length)];
  }

}
