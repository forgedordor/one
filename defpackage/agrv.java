package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agrv implements ajbm {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final Set e;
    private final fdjx f;

    public agrv(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar4.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.f = fdjxVar;
        this.e = fcwm.d(agqp.a, agqp.c, agqp.d, agqp.e, agqp.f);
    }

    @Override // defpackage.ajbm
    public final void a() {
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() || ((Optional) this.b.b()).isEmpty()) {
            return;
        }
        auvw.k(this.f, null, null, new agru(this, null), 3);
    }
}
