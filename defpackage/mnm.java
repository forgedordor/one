package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnm implements mmt {
    public final int a;
    public final int b;
    public float c;
    private final int d;
    private float e;
    private float f;
    private Matrix g;

    public mnm(int i, int i2, float f, int i3) {
        boolean z = true;
        if (f != -1.0f) {
            if (i == -1) {
                i = -1;
            } else {
                z = false;
            }
        }
        mee.b(z, "width and aspect ratio should not both be set");
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = i3;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = new Matrix();
    }

    public static mnm i(int i, int i2) {
        mee.b(i > 0, a.e(i, "width ", " must be positive"));
        mee.b(i2 > 0, a.e(i2, "height ", " must be positive"));
        mee.b(true, "invalid layout 0");
        return new mnm(i, i2, -1.0f, 9729);
    }

    @Override // defpackage.mme
    public final /* bridge */ /* synthetic */ mmk b(Context context, boolean z) {
        return f(context, z);
    }

    @Override // defpackage.mme
    public final boolean c(int i, int i2) {
        e(i, i2);
        Matrix matrix = this.g;
        mee.g(matrix);
        return matrix.isIdentity() && i == Math.round(this.e) && i2 == Math.round(this.f);
    }

    @Override // defpackage.mmg
    public final int d() {
        return this.d;
    }

    @Override // defpackage.mmg
    public final mft e(int i, int i2) {
        int i3;
        mee.b(i > 0, "inputWidth must be positive");
        mee.b(i2 > 0, "inputHeight must be positive");
        Matrix matrix = new Matrix();
        this.g = matrix;
        float f = i;
        this.e = f;
        float f2 = i2;
        this.f = f2;
        int i4 = this.a;
        if (i4 != -1 && (i3 = this.b) != -1) {
            this.c = i4 / i3;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                f2 = this.f;
                f = this.c * f2;
                this.e = f;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                f = this.e;
                f2 = f / this.c;
                this.f = f2;
            }
        }
        int i5 = this.b;
        if (i5 != -1) {
            float f5 = i5;
            if (i4 != -1) {
                this.e = i4;
                this.f = f5;
            } else {
                this.e = (f * f5) / f2;
                this.f = f5;
            }
        }
        return new mft(Math.round(this.e), Math.round(this.f));
    }

    @Override // defpackage.mmg
    public final /* synthetic */ mjg f(Context context, boolean z) {
        return mmf.a(this, context, z);
    }

    @Override // defpackage.mmt
    public final Matrix g() {
        Matrix matrix = this.g;
        mee.h(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.mmg
    public final /* synthetic */ float[] h() {
        return mms.a(this);
    }

    @Override // defpackage.map
    public final /* synthetic */ void a() {
    }
}
