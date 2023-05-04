package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("WENKWONK to Mercury... exploring Mercury");
    }
    @Override
    public void visit(Mars mars) {
        System.out.println("WENKWONK to Mars... exploring Mars");
    }
    @Override
    public void visit(Saturn saturn) {
        System.out.println("WENKWONK to Saturn... exploring Saturn");
    }    
    @Override
    public void visit(Venus venus) {
        System.out.println("WENKWONK to Venus... exploring Venus");
    }
    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("WENKWONK to Jupiter... exploring Jupiter");
    }
    @Override
    public void visit(Earth earth) {
        System.out.println("WENKWONK to Earth... exploring Earth");
    }
    @Override
    public void visit(Neptune neptune) {
        System.out.println("WENKWONK to Neptune... exploring Neptune");
    }
    @Override
    public void visit(Pluto pluto) {
        System.out.println("WENKWONK to Pluto... exploring Pluto");
    }
    @Override
    public void visit(Uranus uranus) {
        System.out.println("WENKWONK to Uranus... exploring Uranus");
    }
}
