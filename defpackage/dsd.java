package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsd {
    public final fdap a = new fdap() { // from class: drw
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return true;
        }
    };
    public final dok b = new dok();
    public final hox c;
    public final dsc d;
    public final hrg e;
    public final hrg f;
    private final hox g;
    private final hox h;
    private final hsf i;
    private final hox j;

    public dsd(Object obj) {
        hsi hsiVar = hsi.a;
        this.g = new hpl(obj, hsiVar);
        this.h = new hpl(obj, hsiVar);
        fdae fdaeVar = new fdae() { // from class: drx
            @Override // defpackage.fdae
            public final Object invoke() {
                dsd dsdVar = this.a;
                Object objE = dsdVar.e();
                if (objE != null) {
                    return objE;
                }
                if (Float.isNaN(dsdVar.a())) {
                    return dsdVar.d();
                }
                Object objB = dsdVar.k().b(dsdVar.a());
                return objB == null ? dsdVar.d() : objB;
            }
        };
        hxn hxnVar = hrp.a;
        this.i = new hnt(fdaeVar, null);
        this.e = new hpf(Float.NaN);
        new hnt(new fdae() { // from class: dry
            @Override // defpackage.fdae
            public final Object invoke() {
                dsd dsdVar = this.a;
                float fA = dsdVar.k().a(dsdVar.f());
                float fA2 = dsdVar.k().a(dsdVar.g()) - fA;
                float fAbs = Math.abs(fA2);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fC = (dsdVar.c() - fA) / fA2;
                    if (fC < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fC <= 0.999999f) {
                        f = fC;
                    }
                }
                return Float.valueOf(f);
            }
        }, hsiVar);
        this.f = new hpf(0.0f);
        this.j = new hpl(null, hsiVar);
        this.c = new hpl(new dst(fcvo.a, new float[0]), hsiVar);
        this.d = new dsc(this);
    }

    public static /* synthetic */ Object l(dsd dsdVar, fdau fdauVar, fcxy fcxyVar) {
        Object objA = dsdVar.b.a(dod.a, new dsb(dsdVar, fdauVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final float a() {
        return this.e.c();
    }

    public final float b(float f) {
        Float fValueOf;
        float fA = (Float.isNaN(a()) ? 0.0f : a()) + f;
        float[] fArr = k().a;
        Float fValueOf2 = null;
        int i = 1;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float fMin = fArr[0];
            int iZ = fcur.z(fArr);
            if (iZ > 0) {
                int i2 = 1;
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == iZ) {
                        break;
                    }
                    i2++;
                }
            }
            fValueOf = Float.valueOf(fMin);
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : Float.NaN;
        float[] fArr2 = k().a;
        if (fArr2.length != 0) {
            float fMax = fArr2[0];
            int iZ2 = fcur.z(fArr2);
            if (iZ2 > 0) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i]);
                    if (i == iZ2) {
                        break;
                    }
                    i++;
                }
            }
            fValueOf2 = Float.valueOf(fMax);
        }
        return fddu.e(fA, fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : Float.NaN);
    }

    public final float c() {
        if (Float.isNaN(a())) {
            ebs.d("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return a();
    }

    public final Object d() {
        return this.g.a();
    }

    public final Object e() {
        return this.j.a();
    }

    public final Object f() {
        return this.h.a();
    }

    public final Object g() {
        return this.i.a();
    }

    public final void h(Object obj) {
        this.g.b(obj);
    }

    public final void i(Object obj) {
        this.j.b(obj);
    }

    public final void j(Object obj) {
        this.h.b(obj);
    }

    public final dst k() {
        return (dst) this.c.a();
    }
}
