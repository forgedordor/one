package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnq implements mmt {
    public final float a = 1.0f;
    public final float b = 1.0f;
    public final float c;
    private final Matrix d;
    private Matrix e;

    public mnq(float f) {
        this.c = f;
        Matrix matrix = new Matrix();
        this.d = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // defpackage.mme
    public final /* bridge */ /* synthetic */ mmk b(Context context, boolean z) {
        return f(context, z);
    }

    @Override // defpackage.mme
    public final boolean c(int i, int i2) {
        mft mftVarE = e(i, i2);
        Matrix matrix = this.e;
        mee.g(matrix);
        return matrix.isIdentity() && i == mftVarE.c && i2 == mftVarE.d;
    }

    @Override // defpackage.mmg
    public final /* synthetic */ int d() {
        return 9729;
    }

    @Override // defpackage.mmg
    public final mft e(int i, int i2) {
        mee.b(i > 0, "inputWidth must be positive");
        mee.b(i2 > 0, "inputHeight must be positive");
        Matrix matrix = this.d;
        this.e = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new mft(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.e.preScale(f3, 1.0f);
        this.e.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.e.mapPoints(fArr2);
            fMin = Math.min(fMin, fArr2[0]);
            fMax = Math.max(fMax, fArr2[0]);
            fMin2 = Math.min(fMin2, fArr2[1]);
            fMax2 = Math.max(fMax2, fArr2[1]);
        }
        float f4 = (fMax - fMin) / 2.0f;
        float f5 = (fMax2 - fMin2) / 2.0f;
        this.e.postScale(1.0f / f4, 1.0f / f5);
        return new mft(Math.round(f * f4), Math.round(f2 * f5));
    }

    @Override // defpackage.mmg
    public final /* synthetic */ mjg f(Context context, boolean z) {
        return mmf.a(this, context, z);
    }

    @Override // defpackage.mmt
    public final Matrix g() {
        Matrix matrix = this.e;
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
