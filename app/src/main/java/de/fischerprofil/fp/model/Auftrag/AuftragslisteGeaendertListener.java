package de.fischerprofil.fp.model.Auftrag;

import java.util.EventListener;

public interface AuftragslisteGeaendertListener extends EventListener{
    public  void onAuftragslisteGeaendert(String l);
}
