package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnn {
    private final fdat a;
    private Matrix b;
    private boolean e;
    private boolean f;
    private final float[] c = iju.f();
    private final float[] d = iju.f();
    private boolean g = true;
    private boolean h = true;

    public jnn(fdat fdatVar) {
        this.a = fdatVar;
    }

    public final long a(Object obj, long j) {
        return !this.h ? iju.a(h(obj), j) : j;
    }

    public final long b(Object obj, long j) {
        float[] fArrG = g(obj);
        if (fArrG == null) {
            return 9187343241974906880L;
        }
        return this.h ? j : iju.a(fArrG, j);
    }

    public final void c() {
        this.e = true;
        this.f = true;
    }

    public final void d(Object obj, ihp ihpVar) {
        float[] fArrH = h(obj);
        if (this.h) {
            return;
        }
        iju.b(fArrH, ihpVar);
    }

    public final void e(Object obj, ihp ihpVar) {
        float[] fArrG = g(obj);
        if (fArrG == null) {
            ihpVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.h) {
                return;
            }
            iju.b(fArrG, ihpVar);
        }
    }

    public final void f() {
        this.e = false;
        this.f = false;
        this.h = true;
        this.g = true;
        iju.c(this.c);
        iju.c(this.d);
    }

    public final float[] g(Object obj) {
        float[] fArr = this.d;
        if (this.f) {
            this.g = jnl.a(h(obj), fArr);
            this.f = false;
        }
        if (this.g) {
            return fArr;
        }
        return null;
    }

    public final float[] h(Object obj) {
        float[] fArr = this.c;
        if (!this.e) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.a(obj, matrix);
        iih.b(fArr, matrix);
        this.e = false;
        this.h = ijv.a(fArr);
        return fArr;
    }
}
