package DeclarationsAndAccessModifier;

private class ClassLevelModifierFinal {
    public static void main(String[] args) {
        
    }
}
/*-------------------------------
 * Whenever we are writing our own classes we have to provide some information
 * about our class to the JVM like
 *  1)Whether this class can be accessible from anywhere or not
 * 2) whether child class creation is possible or not
 * 3)Whether object creatin is possible or not
 * WE can specify these information by using appropriate modifier
 *  ------------------------------
 * The only applicable modifiers for top level classes are
 * public, default, final, abstract , strictFp
 * 
 * But for inner classes the applicable modifiers are top level classes + private , protected , static
 */