package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpn implements abpm {
    private static final cqce a = cqce.g("Bugle", "JsBridgeRequestHandler");
    private final Map b;

    public abpn(Map map) {
        this.b = map;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        int iB = epph.b(epph.c(eppiVar.b));
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(iB);
        if (map.containsKey(numValueOf)) {
            fcsu fcsuVar = (fcsu) map.get(numValueOf);
            fcsuVar.getClass();
            return ((abpm) fcsuVar.b()).a(eppiVar, eppjVar);
        }
        cqbd cqbdVarB = a.b();
        cqbdVarB.I("No handler registered for JsBridge request");
        cqbdVarB.A("payloadCase", numValueOf);
        cqbdVarB.r();
        return eijx.d(new abpl(exmt.INVALID_ARGUMENT, String.format(Locale.US, "No JsBridge handler registered for payloadCase %d", numValueOf)));
    }
}
