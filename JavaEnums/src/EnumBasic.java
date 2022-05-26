
     // ENUM outside the Class with SWITCH statement;

 enum levels {
    BEGINNER, AMATEUR, ADVANCED, PRO;
}
 public class EnumBasic {
    public static void main(String[] args) {
        levels l = levels.AMATEUR; // To get value of enum; We directly could use "System.out.println(levels.PRO);"
        System.out.println(l);

        switch (l) {
            case BEGINNER:
                System.out.println("Beginner Level.");
                break;
                case AMATEUR:
                    System.out.println("Amateur Level.");
                    break;
                    case ADVANCED:
                        System.out.println("Advanced Level.");
                        break;
                        case PRO:
                            System.out.println("Professional Level.");
        }
    }
}

// We use ENUM instead of Array of String. We use it for clean codes.
// We use ENUM for things that do not change.
