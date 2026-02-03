package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgy extends bkm {
    public final bmm a;
    public final big b;
    private final bir c;
    private lvv d;

    public bgy(bir birVar, big bigVar) {
        super(birVar);
        this.d = null;
        this.c = birVar;
        this.b = bigVar;
        this.a = bigVar.b();
        int i = bie.a;
        ((Boolean) blz.c(bigVar, big.d, false)).booleanValue();
        ((Boolean) blz.c(bigVar, big.f, false)).booleanValue();
    }

    public static float d(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0f;
        }
        if (f == f3) {
            return 1.0f;
        }
        if (f == f2) {
            return 0.0f;
        }
        float f4 = 1.0f / f2;
        return ((1.0f / f) - f4) / ((1.0f / f3) - f4);
    }

    public static float y(float f, float f2, float f3) {
        if (f == 1.0f) {
            return f3;
        }
        if (f == 0.0f) {
            return f2;
        }
        double d = 1.0f / f2;
        double d2 = 1.0d / (d + (((1.0f / f3) - d) * f));
        double d3 = f2;
        double d4 = f3;
        if (d2 < d3) {
            d2 = d3;
        } else if (d2 > d4) {
            d2 = d4;
        }
        return (float) d2;
    }

    @Override // defpackage.bkm, defpackage.bir
    public final bir f() {
        return this.c;
    }

    @Override // defpackage.bkm, defpackage.azd
    public final lvv i() {
        return !bov.a(this.a, 6) ? new lvy(0) : this.c.i();
    }

    @Override // defpackage.bkm, defpackage.azd
    public final lvv j() {
        bmm bmmVar = this.a;
        if (!bov.a(bmmVar, 0)) {
            return new lvy(new bqu(1.0f, 1.0f, 1.0f, 0.0f));
        }
        if (bmmVar != null) {
            bir birVar = this.c;
            bdv bdvVar = (bdv) birVar.j().a();
            final Range rangeA = bmmVar.a();
            if (rangeA != null && (((Float) rangeA.getLower()).floatValue() != bdvVar.b() || ((Float) rangeA.getUpper()).floatValue() != bdvVar.a())) {
                if (this.d == null) {
                    this.d = bol.a(birVar.j(), new akv() { // from class: bgx
                        @Override // defpackage.akv
                        public final Object a(Object obj) {
                            bdv bdvVar2 = (bdv) obj;
                            float fC = bdvVar2.c();
                            Range range = rangeA;
                            return new bqu(fC, ((Float) range.getUpper()).floatValue(), ((Float) range.getLower()).floatValue(), bgy.d(bdvVar2.c(), ((Float) range.getLower()).floatValue(), ((Float) range.getUpper()).floatValue()));
                        }
                    });
                }
                return this.d;
            }
        }
        return this.c.j();
    }

    @Override // defpackage.bkm, defpackage.bir
    public final boolean w() {
        int[] iArrF;
        bmm bmmVar = this.a;
        if (bmmVar == null || (iArrF = bmmVar.f()) == null) {
            return super.w();
        }
        for (int i : iArrF) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
