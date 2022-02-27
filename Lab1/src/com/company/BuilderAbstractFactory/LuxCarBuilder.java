package com.company.BuilderAbstractFactory;

public class LuxCarBuilder implements ILuxCarBuilder{
    private LuxCar car;

    public LuxCarBuilder() {
        this.car = new LuxCar();
    }
    @Override
    public void setMirrors() {
        car.setMirrors("                           (  .'                              : :  :   \".  :..-'   .'    ; \n" +
                "                            )'                                | ;  ; __.'-\"(     .'  .--.: ");
    }

    @Override
    public void setWindows() {
        car.setWindows("                                       .-\"                      l ,-\"\"    \\ \"-.`.          \n" +
                "                                    .-\"                         ; ;        ;   \\ \"\"--.._   \n" +
                "                                  .'                           : :         |    ;      .l  \n" +
                "                            _.._.'                             ; ;  ___    |    ;    .' :  ");
    }

    @Override
    public void setSkeleton() {
        car.setSkeleton("                    ___...-'\"\"\"\"----....____          ______.-' :-/.'       \\_.-'  .' .-.\\l\n" +
                "            __..--\"\"                        \"\"\"\"\"\"\"\"\"\"          /\\\"          ;    / .gs./\\;\n" +
                "        _.-\"                                                   /  ;          |   . d$P\"Tb  \n" +
                "     .-\"\"-,                       ____                        /   |          :   ;:$$   $; \n" +
                "   .'     ;                    ,\"\"    \"\"--..__               /    :          |   $$$;   :$ \n" +
                "  /\"-._  /                     ;       ____..-'    .-\"\"\"-.  /     :          ;  _$$$;   :$ \n" +
                " :     \"\"--.._          ___....+---\"\"\"\"          .'  _._  \\/      |         _:-\" $$$;   :$ ");
    }

    @Override
    public void setWheels() {
        car.setWheels(" ;                                              /  .d$$$b./       ;      .-\".'   :$$$   $P \n" +
                ":            .----...____                      :  dP' `T$P        |   .-\" .' _.gd$$$$b_d$' \n" +
                ";    __...---|    bug    |----....____         | :$     $b        : .'   (.-\"  `T$$$$$$P'  \n" +
                ";  .';       '----...____;       /    \"-.      ; $;     :$;_____..-\"  .-\"                  \n" +
                ": /  :                          /        \\__..-':$       $$ ;-.    .-\"                     \n" +
                " Y    ;                        /          ;     $;       :$;|  `.-\"                        \n" +
                " :    :                       /           |     $$       $$;:.-\"                           \n" +
                " '$$$ggggp...____            /            :     :$;     :$$                                \n" +
                "  $$$$$$$$$$$$   \"\"\"\"----...:________....gggg$$$$$$     $$;                                \n" +
                "  'T$$$$$$$$P'                           T$$$$$$$$$b._.d$P                                 \n" +
                "    `T$$$$P'                              T$$$$$$$$$$$$$P                                  \n" +
                "                                           `T$$$$$$$$$P'");
    }

    @Override
    public void setRoof() {
        car.setRoof("                                                        ___________                        \n" +
                "                                              __..--\"\"\"\"           \"\"\"\"--..__              \n" +
                "                                          _.-\"\"\"\"\"\"\"\"\"\"\"-----...      ______ `.            ");
    }

    public LuxCar getCar() {
        return this.car;
    }
}
