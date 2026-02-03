package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kst extends kta {
    public kst(krz krzVar) {
        super(krzVar);
        krzVar.o.d();
        krzVar.p.d();
        this.g = ((ksd) krzVar).e;
    }

    private final void g(ksp kspVar) {
        ksp kspVar2 = this.i;
        kspVar2.j.add(kspVar);
        kspVar.k.add(kspVar2);
    }

    @Override // defpackage.kta
    public final void b() {
        krz krzVar = this.d;
        ksd ksdVar = (ksd) krzVar;
        int i = ksdVar.b;
        int i2 = ksdVar.c;
        float f = ksdVar.a;
        if (ksdVar.e == 1) {
            if (i != -1) {
                ksp kspVar = this.i;
                kspVar.k.add(krzVar.ae.o.i);
                this.d.ae.o.i.j.add(kspVar);
                kspVar.e = i;
            } else if (i2 != -1) {
                ksp kspVar2 = this.i;
                kspVar2.k.add(krzVar.ae.o.j);
                this.d.ae.o.j.j.add(kspVar2);
                kspVar2.e = -i2;
            } else {
                ksp kspVar3 = this.i;
                kspVar3.b = true;
                kspVar3.k.add(krzVar.ae.o.j);
                this.d.ae.o.j.j.add(kspVar3);
            }
            g(this.d.o.i);
            g(this.d.o.j);
            return;
        }
        if (i != -1) {
            ksp kspVar4 = this.i;
            kspVar4.k.add(krzVar.ae.p.i);
            this.d.ae.p.i.j.add(kspVar4);
            kspVar4.e = i;
        } else if (i2 != -1) {
            ksp kspVar5 = this.i;
            kspVar5.k.add(krzVar.ae.p.j);
            this.d.ae.p.j.j.add(kspVar5);
            kspVar5.e = -i2;
        } else {
            ksp kspVar6 = this.i;
            kspVar6.b = true;
            kspVar6.k.add(krzVar.ae.p.j);
            this.d.ae.p.j.j.add(kspVar6);
        }
        g(this.d.p.i);
        g(this.d.p.j);
    }

    @Override // defpackage.kta
    public final void c() {
        krz krzVar = this.d;
        if (((ksd) krzVar).e == 1) {
            krzVar.aj = this.i.f;
        } else {
            krzVar.ak = this.i.f;
        }
    }

    @Override // defpackage.kta
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.kta
    public final boolean e() {
        return false;
    }

    @Override // defpackage.kta, defpackage.ksn
    public final void f() {
        ksp kspVar = this.i;
        if (kspVar.c && !kspVar.i) {
            kspVar.c((int) ((((ksp) kspVar.k.get(0)).f * ((ksd) this.d).a) + 0.5f));
        }
    }
}
