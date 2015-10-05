package de.fischerprofil.fp.model.Kontakt;

import java.util.EventListener;

public interface KontaktlisteGeaendertListener extends EventListener{
    public  void onKontaktlisteGeaendert(String s);
}
