package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ednl {
    public int a = 4;
    public int b = 5;
    public int c = 6;
    private final edgv d;
    private final ejxm e;
    private final ejxm f;

    public ednl(edgv edgvVar, ejxm ejxmVar, ejxm ejxmVar2) {
        this.d = edgvVar;
        this.e = ejxmVar;
        this.f = ejxmVar2;
    }

    public final void a() {
        this.e.f();
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        int i = this.a;
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        edgv edgvVar = this.d;
        eurmVar.c = i2;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
    }

    public final void b(eurd eurdVar) {
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        long jA = this.f.a(TimeUnit.MICROSECONDS);
        eurdVar.copyOnWrite();
        eure eureVar = (eure) eurdVar.instance;
        eure eureVar2 = eure.a;
        eureVar.b |= 1;
        eureVar.e = jA;
        eurjVar.b(eurdVar);
        eurn eurnVar = (eurn) euro.a.createBuilder();
        int i = this.b;
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        edgv edgvVar = this.d;
        euroVar.c = i2;
        euroVar.b |= 1;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar2 = (euro) eurnVar.build();
        euroVar2.getClass();
        eurkVar.d = euroVar2;
        eurkVar.b |= 1;
        edgvVar.c((eurk) eurjVar.build());
    }

    public final void c() {
        ejxm ejxmVar = this.f;
        ejxmVar.e();
        ejxmVar.f();
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        int i = this.b;
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        edgv edgvVar = this.d;
        eurmVar.c = i2;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
    }

    public final void d(eure eureVar) {
        eurj eurjVar = (eurj) eurk.a.createBuilder();
        eurjVar.c(eureVar);
        eurn eurnVar = (eurn) euro.a.createBuilder();
        int i = this.c;
        eurnVar.copyOnWrite();
        euro euroVar = (euro) eurnVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        edgv edgvVar = this.d;
        euroVar.c = i2;
        euroVar.b |= 1;
        eurjVar.copyOnWrite();
        eurk eurkVar = (eurk) eurjVar.instance;
        euro euroVar2 = (euro) eurnVar.build();
        euroVar2.getClass();
        eurkVar.d = euroVar2;
        eurkVar.b |= 1;
        edgvVar.c((eurk) eurjVar.build());
    }

    public final void e() {
        eurl eurlVar = (eurl) eurm.a.createBuilder();
        int i = this.c;
        eurlVar.copyOnWrite();
        eurm eurmVar = (eurm) eurlVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        edgv edgvVar = this.d;
        eurmVar.c = i2;
        eurmVar.b |= 1;
        edgvVar.e((eurm) eurlVar.build());
    }

    public final void f(int i) {
        ejxm ejxmVar = this.e;
        if (ejxmVar.a) {
            edgv edgvVar = this.d;
            eurj eurjVar = (eurj) eurk.a.createBuilder();
            eurd eurdVar = (eurd) eure.a.createBuilder();
            eurx eurxVar = (eurx) eury.a.createBuilder();
            eurxVar.copyOnWrite();
            eury euryVar = (eury) eurxVar.instance;
            euryVar.d = 3;
            euryVar.b |= 2;
            eurxVar.copyOnWrite();
            eury euryVar2 = (eury) eurxVar.instance;
            euryVar2.c = 4;
            euryVar2.b |= 1;
            eurdVar.copyOnWrite();
            eure eureVar = (eure) eurdVar.instance;
            eury euryVar3 = (eury) eurxVar.build();
            euryVar3.getClass();
            eureVar.d = euryVar3;
            eureVar.c = 1;
            ejxmVar.g();
            long jA = ejxmVar.a(TimeUnit.MICROSECONDS);
            eurdVar.copyOnWrite();
            eure eureVar2 = (eure) eurdVar.instance;
            eureVar2.b |= 1;
            eureVar2.e = jA;
            eurb eurbVar = (eurb) eurc.a.createBuilder();
            eurbVar.copyOnWrite();
            eurc eurcVar = (eurc) eurbVar.instance;
            eurcVar.c = i - 1;
            eurcVar.b |= 1;
            eurdVar.copyOnWrite();
            eure eureVar3 = (eure) eurdVar.instance;
            eurc eurcVar2 = (eurc) eurbVar.build();
            eurcVar2.getClass();
            eureVar3.f = eurcVar2;
            eureVar3.b |= 2;
            eurjVar.b(eurdVar);
            eurn eurnVar = (eurn) euro.a.createBuilder();
            int i2 = this.a;
            eurnVar.copyOnWrite();
            euro euroVar = (euro) eurnVar.instance;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            euroVar.c = i3;
            euroVar.b |= 1;
            eurjVar.copyOnWrite();
            eurk eurkVar = (eurk) eurjVar.instance;
            euro euroVar2 = (euro) eurnVar.build();
            euroVar2.getClass();
            eurkVar.d = euroVar2;
            eurkVar.b |= 1;
            edgvVar.c((eurk) eurjVar.build());
        }
    }
}
