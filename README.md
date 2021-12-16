## Testing out JDK17 features.
* Makes use of sealed classes.
  * Consumable - Sealed interface, permits Beverage
    * Beverage - Sealed class, permits Tea and Coffee
      * Tea - Final class
      * Coffee - Final class
* Makes use of pattern matching (Preview).
