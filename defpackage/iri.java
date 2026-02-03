package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iri {
    public final ivy a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final cuu f = new cuu((byte[]) null);
    public final irr g = new irr();
    public final cun h = new cun(10);

    public iri(ivy ivyVar) {
        this.a = ivyVar;
    }

    public final void a() {
        if (this.d) {
            this.d = true;
        } else {
            this.g.d.g();
        }
    }

    public final void b() {
        if (this.b) {
            this.c = true;
            return;
        }
        hum humVar = this.g.d;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((irq) objArr[i2]).a();
        }
        a();
    }

    public final void c(icr icrVar) {
        if (this.b) {
            this.e = true;
            this.f.h(icrVar);
            return;
        }
        irr irrVar = this.g;
        cuu cuuVar = irrVar.e;
        cuuVar.c();
        cuuVar.h(irrVar);
        while (cuuVar.p()) {
            irr irrVar2 = (irr) cuuVar.a(cuuVar.c - 1);
            int i = 0;
            while (true) {
                hum humVar = irrVar2.d;
                if (i < humVar.b) {
                    irq irqVar = (irq) humVar.a[i];
                    if (fdbq.f(irqVar.a, icrVar)) {
                        humVar.m(irqVar);
                        irqVar.a();
                    } else {
                        cuuVar.h(irqVar);
                        i++;
                    }
                }
            }
        }
    }
}
