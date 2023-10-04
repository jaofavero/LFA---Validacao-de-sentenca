package trabalho.lfa;
/**
 *
 * @author João Favero e Thalys Marques
 */
public class Automatos {
//correto
    public static String A(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        String b = "";
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO && i<end) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'b') {
                ERRO = true;;
            }
            switch (Estado) {
                case 1:
                   if(a.charAt(i) == 'a'){
                       Estado = 2;
                   }else{
                       ERRO = true;
                   }
                   
                    break;
                case 2:
                    if(a.charAt(i) == 'a'){
                       Estado = 2;
                    }else{
                       Estado = 3;
                    }
                    break;
                case 3:
                    if(a.charAt(i) == 'a'){
                       Estado = 2;
                    }else{
                       Estado = 3;
                    }
                    break;
            }
            i++;
        }
        if (ERRO == true) {
            return "erro";
        } else if ( Estado==3){
            return "aceito";
        }else{
            return "erro";
        }
    }
//correto
    public static String B(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'b') {
                return "erro";
            }
            switch (Estado) {
                case 1:
                    if (a.charAt(i) == 'a') {
                        Estado = 2;
                    }
                    i = i + 1;
                    break;
                case 2:
                    if (a.charAt(i) == 'a') {
                        Estado = 3;
                    } else {
                        Estado = 1;
                    }
                    i = i + 1;
                    break;
                case 3:
                    if (a.charAt(i) == 'a') {
                        FIM = true;
                        Estado = 4;
                    } else {
                        Estado = 1;
                    }
                    i = i + 1;
                    break;
                case 4:
                    i = i + 1;
                    break;
            }
            if (FIM == true) {
                return "aceito";
            } else if (i == end) {
                return "erro";
            }
        }
        return null;
    }
//correto
    public static String C(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO) {
            System.out.println("Estado" + Estado);

            if (i == (end)) {
                FIM = true;
                if (a.charAt(i - 1) == ('b') && Estado == 9) {
                    return "aceito";
                } else {
                    return "erro";
                }
            } else {
                if ((a.charAt(i) != ('a') && a.charAt(i) != ('b'))) {
                    ERRO = true;
                    System.out.println("ERRO input");
                    return "erro";
                } else {
                    switch (Estado) {

                        case 0:
                            FIM = true;
                            ERRO = true;
                            System.out.println("ERRO" + i);
                            break;

                        case 1:
                            System.out.println("1");
                            if (a.charAt(i) == ('b')) {
                                if (i == (end - 1)) {
                                    Estado = 0;

                                } else {
                                    Estado = 2;
                                    i = i + 1;
                                }
                            } else {
                                ERRO = true;
                                System.out.println("ERRO");
                            }
                            break;
                        case 2:
                            System.out.println("2");
                            if (a.charAt(i) == ('a')) {
                                Estado = 3;
                                i = i + 1;

                            } else {
                                Estado = 0;
                            }
                            break;
                        case 3:
                            System.out.println("3");
                            if (a.charAt(i) == ('b')) {
                                Estado = 4;
                                i = i + 1;
                            } else {
                                Estado = 0;
                            }

                            break;

                        case 4:
                            System.out.println("4");
                            if (a.charAt(i) == ('a')) {
                                Estado = 5;
                                i = i + 1;
                            } else {
                                Estado = 0;
                            }
                            break;
                        case 5:
                            System.out.println("5");

                            if (a.charAt(i) == ('a')) {
                                Estado = 6;
                                i = i + 1;
                            } else {
                                Estado = 5;
                                i = i + 1;
                            }
                            break;
                        case 6:
                            System.out.println("6");

                            if (a.charAt(i) == ('b')) {
                                Estado = 7;
                                i = i + 1;
                            } else {
                                Estado = 6;
                                i = i + 1;
                            }
                            break;
                        case 7:
                            System.out.println("7");

                            if (a.charAt(i) == ('a')) {
                                Estado = 8;
                                i = i + 1;
                            } else {
                                Estado = 5;
                                i = i + 1;
                            }
                            break;
                        case 8:
                            System.out.println("8");

                            if (a.charAt(i) == ('a')) {
                                Estado = 6;
                                i = i + 1;
                            } else {
                                Estado = 9;
                                i = i + 1;
                            }
                            System.out.println("Estado" + Estado);

                            System.out.println(i + "i e len" + end);
                            break;
                        case 9:
                            System.out.println("9");

                            if (a.charAt(i) == ('b')) {
                                Estado = 5;
                                i = i + 1;
                            } else {
                                if (a.charAt(i) == ('a')) {
                                    Estado = 8;
                                    i = i + 1;
                                }
                            }

                            break;
                    }

                }

            }

        }
        if (ERRO == false) {
            return "aceito";
        } else {
            return "erro";
        }
    }
//correto
    public static String D(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        String b = "";
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'b') {
                return "erro";
            }
            switch (Estado) {
                case 1:
                    if (a.charAt(i) == 'b') {
                        Estado = 2;
                    }
                    i = i + 1;
                    break;
                case 2:
                    if (a.charAt(i) == 'a') {
                        Estado = 3;
                    }
                    i = i + 1;
                    break;
                case 3:
                    if (a.charAt(i) == 'a') {
                        Estado = 1;
                    } else {
                        Estado = 4;
                    }
                    i = i + 1;
                    break;
                case 4:
                    if (a.charAt(i) == 'a') {
                        Estado = 5;
                    } else {
                        Estado = 2;
                    }
                    i = i + 1;
                    break;
                case 5:
                    if (a.charAt(i) == 'b') {
                        Estado = 6;
                    }
                    i = i + 1;
                    break;
                case 6:
                    if (a.charAt(i) == 'a') {
                        Estado = 7;
                    }
                    i = i + 1;
                    break;
                case 7:
                    if (a.charAt(i) == 'b') {
                        Estado = 8;
                    } else {
                        Estado = 5;
                    }
                    i = i + 1;
                    break;
                case 8:
                    if (a.charAt(i) == 'a') {
                        Estado = 9;
                        ERRO = true;
                    } else {
                        Estado = 6;
                    }
                    i = i + 1;
                    break;
                case 9:
                    i = i + 1;
                    break;
            }
            if (i >= end) {
                FIM = true;
            }
        }
        if (ERRO == false) {
            return "aceito";
        } else {
            return "erro";
        }
    }
    //codigo
    public static String E(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO && i<end) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'b') {
                ERRO = true;
            }
            switch (Estado) {
                case 1:
                    if (a.charAt(i) == 'a') {
                        Estado = 1;
                    }else{
                        Estado = 2;
                    }
                    break;
                case 2:
                    if (a.charAt(i) == 'a') {
                        Estado = 3;
                    }else{
                        Estado = 2;
                    }
                    break;
                case 3:
                    if (a.charAt(i) == 'a') {
                        Estado = 1;
                    }else{
                        Estado = 4;
                    }
                    break;
                case 4:
                    if (a.charAt(i) == 'a') {
                        ERRO=true;
                    }else{
                        Estado = 1;
                    }
                    break;
            } 
            i++;
        }
        if (ERRO == true) {
            return "erro";
        } else{
            return "aceito";
        }

    }
    //Correto
    public static String F(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        String b = "";
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO) {
            if (a.charAt(i) != 'a' && a.charAt(i) != 'b') {
                return "erro";
            }
            switch (Estado) {
                case 1:
                    if (a.charAt(i) == 'b') {
                        Estado = 4;
                    } else{
                        Estado = 2;
                    }
                    i = i + 1;
                    break;
                case 2:
                    if (a.charAt(i) == 'b') {
                        Estado = 6;
                    } else{
                        Estado = 3;
                    }
                    i = i + 1;
                    break;
                case 3:
                    if (a.charAt(i) == 'a') {
                        Estado = 2;
                    } else {
                        Estado = 4;
                    }
                    i = i + 1;
                    break;
                case 4:
                    if (a.charAt(i) == 'a') {
                        Estado = 6;
                        ERRO = true;
                    } else {
                        Estado = 5;
                    }
                    i = i + 1;
                    break;
                case 5:
                    if (a.charAt(i) == 'a') {
                        Estado = 6;
                        ERRO = true;
                    } else {
                        Estado = 4;
                    }
                    i = i + 1;
                    break;
                case 6:
                    i = i + 1;
                    break;                
            }
            if (i >= end) {
                FIM = true;
            }
        }
        if (Estado == 4) {
            return "aceito";
        } else {
            return "erro";
        }
    }
    //correto
    public static String G(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO && i<end) {
            if (a.charAt(i) <= 96 && a.charAt(i) >= 123) {
                ERRO = true;
            }
            switch (Estado) {
                case 1:
                    if (a.charAt(i) == 'a') {
                        Estado = 2;
                    } else if(a.charAt(i) == 'b') {
                        Estado = 3;
                    } else{
                        ERRO = true;
                    }
                    i = i + 1;
                    break;
                case 2:
                    if (a.charAt(i) == 'a') {
                        Estado = 5;
                    }
                    i = i + 1;
                    break;
                case 3:
                    if (a.charAt(i) == 'b') {
                        Estado = 6;
                    }
                    i = i + 1;
                    break;
                case 5:
                    if (a.charAt(i) == 'a') {
                        Estado = 2;
                    }
                    i = i + 1;
                    break;
                case 6:
                    if(a.charAt(i) == 'b'){
                        Estado = 3;
                    }
                    i = i + 1;
                    break;
            }
        }
        if (ERRO) {
            return "erro";
        } else {
            return "aceito";
        }
    }
    //correto
    public static String H(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        String b = "";
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO && i<end) {
            if ((!Character.isDigit(a.charAt(i)))) {
                ERRO = true;
            }
            switch (Estado) {
                case 1:
                    if((a.charAt(i) == '0'))
                    {
                        Estado = 2;
                    }else if((a.charAt(i) == '1'))
                    {
                        Estado = 3;
                    }else{
                        ERRO=true;
                    }

                    break;
                case 2:
                    if(Character.getNumericValue(a.charAt(i))%2 == 0) {    
                        Estado = 2;
                    } else {
                        Estado = 4;
                    }    
                    break;
                case 3:
                    if(Character.getNumericValue(a.charAt(i))%2 == 0) {    
                        Estado = 3;
                    } else {
                        Estado = 5;
                    }    
                    break;
                case 4:
                    if(Character.getNumericValue(a.charAt(i))%2 == 0) {    
                        Estado = 4;
                    } else {
                        Estado = 2;
                    }    
                    break;
                case 5:
                    if(Character.getNumericValue(a.charAt(i))%2 == 0) {    
                        Estado = 6;
                    } else {
                        Estado = 3;
                    }    
                    break;
                case 6:
                    if(Character.getNumericValue(a.charAt(i))%2 == 0) {    
                        Estado = 6;
                    } else {
                        Estado = 3;
                    }    
                    break;
            }
            i++;

        }
        if (ERRO == true) {
                return "erro";
        } else if (Estado==2 || Estado==3){
            return "aceito";
        }else{
            return "erro";
        }
    }
    //Correto
    public static String I(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        int i =0;
        int end = a.length();
        while (!ERRO && (i<end)) {
            if ((!Character.isDigit(a.charAt(i))) && (a.charAt(i) < 96 && a.charAt(i) > 123))
            {
                ERRO = true;
            }else if (Character.isDigit(a.charAt(0))) 
            {
                ERRO = true;
            }  
            i++;
            
        }
        if(ERRO)
        {
            return "erro";  
        }else{
            return "aceito";
        }
    }
    //correto
    public static String J(String a) {
        boolean ERRO = false;
        boolean FIM = false;
        String b = "";
        int Estado = 1;
        int i = 0;
        int end = a.length();
        while (!FIM && !ERRO && i<end) {
            if ((!Character.isDigit(a.charAt(i))) && a.charAt(i) != '+'
                    && a.charAt(i) != '-' && a.charAt(i) != 'e' && a.charAt(i) != ',') {
                ERRO = true;
            }
            switch (Estado) {
                case 1:
                    if(a.charAt(i)=='e')
                    {
                        ERRO = true;
                    }else{
                        Estado=2;
                    }
                    break;
                case 2:
                    if((Character.isDigit(a.charAt(i))))
                    {
                        Estado = 2;
                    }else if (a.charAt(i)==',')
                    {
                        Estado = 3;
                    }else if (a.charAt(i)=='e')
                    {
                        Estado = 5;
                    }else{
                        ERRO = true;
                    }
                    break;
                case 3:
                    if((Character.isDigit(a.charAt(i)))){
                        Estado = 4;
                    }else{
                        ERRO = true;
                    }
                    break;
                case 4:
                    if((Character.isDigit(a.charAt(i)))){
                        Estado = 4;
                    }else if (a.charAt(i)=='e')
                    {
                        Estado = 5;
                    }else{
                        ERRO = true;
                    }
                    break;
                case 5:
                    if((Character.isDigit(a.charAt(i)))){
                        Estado = 6;
                    }else{
                        ERRO = true;
                    }
                    break;
                case 6:
                    if((Character.isDigit(a.charAt(i)))){
                        Estado = 6;
                    }else{
                        ERRO = true;
                    }
                    
                    break;
            }
            i++;
        }
        if (ERRO == true) {
                return "erro";
        } else if (Estado==2 || Estado==4 || Estado == 6){
            return "aceito";
        }else{
            return "erro";
        }
    }   
}
