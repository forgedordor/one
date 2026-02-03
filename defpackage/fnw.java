package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnw {
    public final fdae a;
    public final hsf b;
    public final hrg c;
    private final hox d;
    private final hox e;
    private final hox f;

    public fnw(Object obj, fdae fdaeVar) {
        this.a = fdaeVar;
        new AtomicReference(null);
        new feaz();
        hsi hsiVar = hsi.a;
        this.d = new hpl(obj, hsiVar);
        fdae fdaeVar2 = new fdae() { // from class: fnt
            @Override // defpackage.fdae
            public final Object invoke() {
                fnw fnwVar = this.a;
                Object objC = fnwVar.c();
                if (objC != null) {
                    return objC;
                }
                float fA = fnwVar.a();
                if (Float.isNaN(fA)) {
                    return fnwVar.b();
                }
                Object objB = fnwVar.b();
                fnwVar.d();
                float fFloatValue = ((Number) fnwVar.a.invoke()).floatValue();
                if (fA == Float.NaN || Float.isNaN(Float.NaN)) {
                    return objB;
                }
                if (fA > Float.NaN) {
                    if (fFloatValue <= 0.0f) {
                        throw null;
                    }
                    throw null;
                }
                if ((-fFloatValue) >= 0.0f) {
                    throw null;
                }
                throw null;
            }
        };
        hxn hxnVar = hrp.a;
        new hnt(fdaeVar2, null);
        this.b = new hnt(new fdae() { // from class: fnu
            @Override // defpackage.fdae
            public final Object invoke() {
                fnw fnwVar = this.a;
                Object objC = fnwVar.c();
                if (objC != null) {
                    return objC;
                }
                float fA = fnwVar.a();
                if (Float.isNaN(fA)) {
                    return fnwVar.b();
                }
                Object objB = fnwVar.b();
                fnwVar.d();
                if (fA != Float.NaN) {
                    Float.isNaN(Float.NaN);
                }
                return objB;
            }
        }, null);
        this.c = new hpf(Float.NaN);
        new hnt(new fdae() { // from class: fnv
            @Override // defpackage.fdae
            public final Object invoke() {
                fnw fnwVar = this.a;
                fnwVar.d();
                fnwVar.b();
                fnwVar.d();
                fnwVar.b.a();
                float fAbs = Math.abs(Float.NaN);
                float f = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    if (Float.isNaN(fnwVar.a())) {
                        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
                    }
                    float fA = (fnwVar.a() + Float.NaN) / Float.NaN;
                    if (fA < 1.0E-6f) {
                        f = 0.0f;
                    } else if (fA <= 0.999999f) {
                        f = fA;
                    }
                }
                return Float.valueOf(f);
            }
        }, hsiVar);
        new hpf(0.0f);
        this.e = new hpl(null, hsiVar);
        this.f = new hpl(new fqp(fcvp.a), hsiVar);
    }

    public final float a() {
        return this.c.c();
    }

    public final Object b() {
        return this.d.a();
    }

    public final Object c() {
        return this.e.a();
    }

    public final void d() {
    }
}
