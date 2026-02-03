package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlp implements vdy {
    public final fcsu a;
    public final afzc b;
    private final fcsu c;
    private final fdpl d;
    private final Set e;

    public vlp(fcsu fcsuVar, fcsu fcsuVar2, afzc afzcVar) {
        afzcVar.getClass();
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.b = afzcVar;
        Object objB = fcsuVar.b();
        objB.getClass();
        Optional optional = (Optional) objB;
        this.d = new vlo(optional.isEmpty() ? new fdpu(false) : ((vlk) optional.get()).b, this);
        this.e = fcwm.b(zqx.b);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
