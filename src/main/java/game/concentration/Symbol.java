package game.concentration;

public enum Symbol {
    SYMBOL_EXCLAMARE {
        @Override
        public String toString(){
            return "!";
        }
    },
    SYMBOL_AROND {
        @Override
        public String toString(){
            return "@";
        }
    },
    SYMBOL_DIEZ {
        @Override
        public String toString(){
            return "#";
        }
    },
    SYMBOL_DOLAR {
        @Override
        public String toString(){
            return "$";
        }
    },
    SYMBOL_PROCENT {
        @Override
        public String toString(){
            return "%";
        }
    },
    SYMBOL_SAGETICA {
        @Override
        public String toString(){
            return "^";
        }
    },
    SYMBOL_AND {
        @Override
        public String toString(){
            return "&";
        }
    },
    SYMBOL_STAR {
        @Override
        public String toString(){
            return "*";
        }
    }
}
