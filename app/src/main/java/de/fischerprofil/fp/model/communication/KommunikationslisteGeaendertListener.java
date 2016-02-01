package de.fischerprofil.fp.model.communication;

import java.util.EventListener;

public interface KommunikationslisteGeaendertListener extends EventListener{
    public  void onKommunikationslisteGeaendert(String s);
}
