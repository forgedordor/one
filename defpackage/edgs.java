package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edgs {
    private final ejxm a;
    private final List b = new ArrayList();
    private final int c;

    public edgs(fcsu fcsuVar, int i) {
        this.a = (ejxm) fcsuVar.b();
        this.c = i;
    }

    public final eurk a() {
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        eurjVar.a(this.b);
        eurn eurnVar = (eurn) euro.a.createBuilder();
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        euroVar.c = this.c - 1;
        euroVar.b |= 1;
        long jA = this.a.a(TimeUnit.MICROSECONDS);
        eurnVar.copyOnWrite();
        euro euroVar2 = (euro) eurnVar.instance;
        euroVar2.b |= 2;
        euroVar2.d = jA;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar3 = (euro) eurnVar.build();
        euroVar3.getClass();
        eurkVar.d = euroVar3;
        eurkVar.b |= 1;
        return (eurk) eurjVar.build();
    }

    public final eurm b() {
        ejxm ejxmVar = this.a;
        ejxmVar.e();
        ejxmVar.f();
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        eurmVar.c = this.c - 1;
        eurmVar.b |= 1;
        return (eurm) eurlVar.build();
    }

    public final void c(eure eureVar) {
        this.b.add(eureVar);
    }
}
