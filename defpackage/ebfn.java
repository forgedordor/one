package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebfn {
    public final ekgp a;

    public ebfn(Map map) {
        this.a = ekgp.j(map);
    }

    public final ebfl a() {
        fcsu fcsuVar = (fcsu) this.a.get(ebfm.MSRP_CLIENT);
        fcsuVar.getClass();
        return (ebfl) fcsuVar.b();
    }

    public final ebfl b() {
        fcsu fcsuVar = (fcsu) this.a.get(ebfm.MSRP_SERVER);
        fcsuVar.getClass();
        return (ebfl) fcsuVar.b();
    }
}
