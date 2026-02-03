package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejn implements epo, dwy {
    public final /* synthetic */ ejy a;
    private final /* synthetic */ dwy b;

    public ejn(dwy dwyVar, ejy ejyVar) {
        this.a = ejyVar;
        this.b = dwyVar;
    }

    @Override // defpackage.dwy
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.epo
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.epo
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.epo
    public final int d() {
        eji ejiVar = (eji) fcva.T(this.a.d().i());
        if (ejiVar != null) {
            return ejiVar.a;
        }
        return 0;
    }

    @Override // defpackage.epo
    public final void e(int i, int i2) {
        this.a.o(i, i2);
    }

    @Override // defpackage.epo
    public final int f(int i) {
        Object obj;
        eja ejaVarD = this.a.d();
        if (ejaVarD.i().isEmpty()) {
            return 0;
        }
        int iB = b();
        if (i > d() || iB > i) {
            return (ejb.a(ejaVarD) * (i - b())) - c();
        }
        List listI = ejaVarD.i();
        int size = listI.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = listI.get(i2);
            if (((eji) obj).a == i) {
                break;
            }
            i2++;
        }
        eji ejiVar = (eji) obj;
        if (ejiVar == null) {
            return 0;
        }
        return ejiVar.g;
    }
}
