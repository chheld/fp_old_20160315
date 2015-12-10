package de.fischerprofil.fp.model.company;

import java.util.EventListener;

public interface FirmenlisteGeaendertListener extends EventListener{
    public  void onFirmenlisteGeaendert(String s);
}
