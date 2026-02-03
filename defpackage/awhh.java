package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awhh {
    private final ekgp a;

    public awhh(Map map) {
        this.a = ekgp.j(map);
    }

    public final eiju a(awhi awhiVar, int i, alqm alqmVar) {
        ekgp ekgpVar = this.a;
        ejwl.f(ekgpVar.containsKey(awhiVar), "No mapping for %s CapabilitiesGetter", awhiVar);
        awhg awhgVar = (awhg) ekgpVar.get(awhiVar);
        awhgVar.getClass();
        return awhgVar.a(i, alqmVar);
    }
}
