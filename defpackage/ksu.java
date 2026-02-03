package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ksu extends kta {
    public ksu(krz krzVar) {
        super(krzVar);
    }

    private final void g(ksp kspVar) {
        ksp kspVar2 = this.i;
        kspVar2.j.add(kspVar);
        kspVar.k.add(kspVar2);
    }

    @Override // defpackage.kta
    public final void b() {
        krz krzVar = this.d;
        if (krzVar instanceof krv) {
            ksp kspVar = this.i;
            kspVar.b = true;
            krv krvVar = (krv) krzVar;
            int i = krvVar.a;
            boolean z = krvVar.b;
            int i2 = 0;
            if (i == 0) {
                kspVar.l = 4;
                while (i2 < krvVar.aM) {
                    krz krzVar2 = krvVar.aL[i2];
                    if (z || krzVar2.ar != 8) {
                        ksp kspVar2 = krzVar2.o.i;
                        kspVar2.j.add(kspVar);
                        kspVar.k.add(kspVar2);
                    }
                    i2++;
                }
                g(this.d.o.i);
                g(this.d.o.j);
                return;
            }
            if (i == 1) {
                kspVar.l = 5;
                while (i2 < krvVar.aM) {
                    krz krzVar3 = krvVar.aL[i2];
                    if (z || krzVar3.ar != 8) {
                        ksp kspVar3 = krzVar3.o.j;
                        kspVar3.j.add(kspVar);
                        kspVar.k.add(kspVar3);
                    }
                    i2++;
                }
                g(this.d.o.i);
                g(this.d.o.j);
                return;
            }
            if (i == 2) {
                kspVar.l = 6;
                while (i2 < krvVar.aM) {
                    krz krzVar4 = krvVar.aL[i2];
                    if (z || krzVar4.ar != 8) {
                        ksp kspVar4 = krzVar4.p.i;
                        kspVar4.j.add(kspVar);
                        kspVar.k.add(kspVar4);
                    }
                    i2++;
                }
                g(this.d.p.i);
                g(this.d.p.j);
                return;
            }
            if (i != 3) {
                return;
            }
            kspVar.l = 7;
            while (i2 < krvVar.aM) {
                krz krzVar5 = krvVar.aL[i2];
                if (z || krzVar5.ar != 8) {
                    ksp kspVar5 = krzVar5.p.j;
                    kspVar5.j.add(kspVar);
                    kspVar.k.add(kspVar5);
                }
                i2++;
            }
            g(this.d.p.i);
            g(this.d.p.j);
        }
    }

    @Override // defpackage.kta
    public final void c() {
        krz krzVar = this.d;
        if (krzVar instanceof krv) {
            int i = ((krv) krzVar).a;
            if (i == 0 || i == 1) {
                krzVar.aj = this.i.f;
            } else {
                krzVar.ak = this.i.f;
            }
        }
    }

    @Override // defpackage.kta
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.kta
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kta, defpackage.ksn
    public final void f() {
        krv krvVar = (krv) this.d;
        int i = krvVar.a;
        ksp kspVar = this.i;
        Iterator it = kspVar.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((ksp) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            kspVar.c(i3 + krvVar.c);
        } else {
            kspVar.c(i2 + krvVar.c);
        }
    }
}
