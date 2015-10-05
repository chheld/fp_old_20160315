package de.fischerprofil.fp.model.order;

import java.util.EventListener;

public interface AuftragslisteGeaendertListener extends EventListener{
    public  void onAuftragslisteGeaendert(String l);
}
