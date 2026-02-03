package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epa {
    public final Object a;
    public int c;
    public boolean d;
    public epa f;
    private final epf g;
    public int b = -1;
    public final hox e = new hpl(null, hsi.a);

    public epa(Object obj, epf epfVar) {
        this.a = obj;
        this.g = epfVar;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        if (this.c <= 0) {
            ebs.d("Release should only be called once");
        }
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.g.a.remove(this);
            epa epaVar = this.f;
            if (epaVar != null) {
                epaVar.a();
            }
            this.f = null;
        }
    }

    public final epa b() {
        return (epa) this.e.a();
    }

    public final void c() {
        if (this.d) {
            ebs.d("Pin should not be called on an already disposed item ");
        }
        if (this.c == 0) {
            this.g.a.add(this);
            epa epaVarB = b();
            if (epaVarB != null) {
                epaVarB.c();
            } else {
                epaVarB = null;
            }
            this.f = epaVarB;
        }
        this.c++;
    }
}
