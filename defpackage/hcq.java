package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcq {
    public static final hyr a = hxu.a(new fdat() { // from class: hco
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hcq hcqVar = (hcq) obj2;
            hyr hyrVar = hcq.a;
            return fcva.g(Float.valueOf(hcqVar.b), Float.valueOf(hcqVar.c()), Float.valueOf(hcqVar.b()));
        }
    }, new fdap() { // from class: hcp
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            List list = (List) obj;
            return new hcq(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    });
    public float b;
    private final hrg c;
    private final hrg d;

    public hcq(float f, float f2, float f3) {
        this.b = f;
        this.c = new hpf(f3);
        this.d = new hpf(f2);
    }

    public final float a() {
        if (this.b == 0.0f) {
            return 0.0f;
        }
        return c() / this.b;
    }

    public final float b() {
        return this.c.c();
    }

    public final float c() {
        return this.d.c();
    }

    public final void d(float f) {
        this.c.h(f);
    }

    public final void e(float f) {
        this.d.h(fddu.e(f, this.b, 0.0f));
    }
}
