package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgr {
    private final ejxm a;
    private final eurd b;

    public edgr(ejxm ejxmVar, eurd eurdVar) {
        this.a = ejxmVar;
        this.b = eurdVar;
    }

    public final eure a() {
        long jA = this.a.a(TimeUnit.MICROSECONDS);
        eurd eurdVar = this.b;
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eure eureVar2 = eure.a;
        eureVar.b |= 1;
        eureVar.e = jA;
        return (eure) eurdVar.build();
    }

    public final void b() {
        ejxm ejxmVar = this.a;
        ejxmVar.e();
        ejxmVar.f();
    }
}
