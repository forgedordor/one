package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mka extends mjg implements mlc, mnn {
    public final met f;
    public final boolean g;
    public Gainmap h;
    public int i;
    public boolean j;
    public boolean k;
    private final ekgb m;
    private final ekgb n;
    private final float[][] o;
    private final float[][] p;
    private final float[] q;
    private final float[] r;
    private final float[] s;
    private final int t;
    private ekgb u;
    private static final ekgb l = ekgb.u(new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f});
    public static final float[] d = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    public static final float[] e = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};

    private mka(met metVar, ekgb ekgbVar, ekgb ekgbVar2, boolean z) {
        super(z, 1);
        this.f = metVar;
        this.m = ekgbVar;
        this.n = ekgbVar2;
        this.g = z;
        this.o = (float[][]) Array.newInstance((Class<?>) Float.TYPE, ekgbVar.size(), 16);
        this.p = (float[][]) Array.newInstance((Class<?>) Float.TYPE, ekgbVar2.size(), 16);
        this.q = mev.B();
        this.r = mev.B();
        this.s = new float[16];
        this.u = l;
        this.i = -1;
        int iMax = 9729;
        for (int i = 0; i < ekgbVar.size(); i++) {
            iMax = Math.max(iMax, ((mmg) ekgbVar.get(i)).d());
        }
        this.t = iMax;
    }

    public static met l(Context context, String str, String str2) {
        try {
            met metVar = new met(context, str, str2);
            metVar.g("uTexTransformationMatrix", mev.B());
            return metVar;
        } catch (IOException | meu e2) {
            throw new mcw(e2);
        }
    }

    public static mka m(Context context, List list, List list2, boolean z) {
        return new mka(l(context, "shaders/vertex_shader_transformation_es2.glsl", true != list2.isEmpty() ? "shaders/fragment_shader_transformation_es2.glsl" : "shaders/fragment_shader_copy_es2.glsl"), ekgb.n(list), ekgb.n(list2), z);
    }

    public static mka n(Context context, List list, List list2, mag magVar, int i) {
        boolean zI = mag.i(magVar);
        boolean z = true;
        String str = true != zI ? "shaders/vertex_shader_transformation_es2.glsl" : "shaders/vertex_shader_transformation_es3.glsl";
        boolean z2 = i == 2;
        met metVarL = l(context, str, zI ? "shaders/fragment_shader_oetf_es3.glsl" : z2 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i2 = magVar.e;
        if (zI) {
            if (i2 != 7) {
                if (i2 == 6) {
                    i2 = 6;
                } else {
                    z = false;
                }
            }
            mee.a(z);
            metVarL.h("uOutputColorTransfer", i2);
        } else if (z2) {
            if (i2 != 3) {
                if (i2 == 10) {
                    i2 = 10;
                } else {
                    z = false;
                }
            }
            mee.a(z);
            metVarL.h("uOutputColorTransfer", i2);
        }
        return new mka(metVarL, ekgb.n(list), ekgb.n(list2), zI);
    }

    public static mka o(met metVar, mag magVar, mag magVar2, ekgb ekgbVar) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = magVar.c;
        boolean zI = mag.i(magVar);
        boolean z4 = (i == 1 || i == 2) && magVar2.c == 6;
        int i2 = magVar2.e;
        int i3 = 7;
        if (zI) {
            if (i2 == 3) {
                i2 = 10;
            }
            if (i2 == 1 || i2 == 10 || i2 == 6) {
                i3 = i2;
            } else {
                if (i2 != 7) {
                    i3 = i2;
                    z3 = false;
                }
                mee.a(z3);
                metVar.h("uOutputColorTransfer", i3);
            }
            z3 = true;
            mee.a(z3);
            metVar.h("uOutputColorTransfer", i3);
        } else if (z4) {
            if (i2 == 1 || i2 == 6) {
                z2 = true;
            } else if (i2 == 7) {
                z2 = true;
                i2 = 7;
            } else {
                z2 = false;
            }
            mee.a(z2);
            metVar.h("uOutputColorTransfer", i2);
        } else {
            metVar.h("uSdrWorkingColorSpace", 0);
            if (i2 == 3) {
                z = true;
            } else if (i2 == 1) {
                i2 = 1;
                z = true;
            } else {
                z = false;
            }
            mee.a(z);
            metVar.h("uOutputColorTransfer", i2);
        }
        int i4 = ekgb.d;
        return new mka(metVar, ekgbVar, ekoe.a, zI || z4);
    }

    private static boolean p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                int length = fArr4.length;
                mee.d(length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, length);
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.mjg
    public final mft a(int i, int i2) {
        return mmu.a(i, i2, this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mjg
    public final void b(int i, long j) throws mcw {
        boolean z;
        char c;
        boolean z2;
        ekgb ekgbVar = this.n;
        char c2 = 2;
        int i2 = 16;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, ekgbVar.size(), 16);
        for (int i3 = 0; i3 < ekgbVar.size(); i3++) {
            fArr[i3] = ((mnp) ekgbVar.get(i3)).d();
        }
        if (p(this.p, fArr)) {
            float[] fArr2 = this.r;
            mev.w(fArr2);
            for (int i4 = 0; i4 < ekgbVar.size(); i4++) {
                float[] fArr3 = this.s;
                Matrix.multiplyMM(fArr3, 0, ((mnp) ekgbVar.get(i4)).d(), 0, fArr2, 0);
                System.arraycopy(fArr3, 0, fArr2, 0, 16);
            }
            z = true;
        } else {
            z = false;
        }
        ekgb ekgbVar2 = this.m;
        float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, ekgbVar2.size(), 16);
        for (int i5 = 0; i5 < ekgbVar2.size(); i5++) {
            fArr4[i5] = ((mmg) ekgbVar2.get(i5)).h();
        }
        float[][] fArr5 = this.o;
        int i6 = 6;
        if (p(fArr5, fArr4)) {
            float[] fArr6 = this.q;
            mev.w(fArr6);
            this.u = l;
            int length = fArr5.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    c = c2;
                    float[] fArr7 = this.s;
                    Matrix.invertM(fArr7, 0, fArr6, 0);
                    this.u = mmu.b(fArr7, this.u);
                    break;
                }
                float[] fArr8 = fArr5[i7];
                int i8 = i7;
                float[] fArr9 = this.s;
                Matrix.multiplyMM(fArr9, 0, fArr8, 0, fArr6, 0);
                System.arraycopy(fArr9, 0, fArr6, 0, i2);
                ekgb ekgbVarB = mmu.b(fArr8, this.u);
                mee.b(((ekoe) ekgbVarB).c >= 3, "A polygon must have at least 3 vertices.");
                ekfw ekfwVar = new ekfw();
                ekfwVar.j(ekgbVarB);
                float[][] fArr10 = mmu.a;
                int i9 = 0;
                while (i9 < i6) {
                    float[] fArr11 = fArr10[i9];
                    ekgb ekgbVarG = ekfwVar.g();
                    ekfw ekfwVar2 = new ekfw();
                    char c3 = c2;
                    int i10 = 0;
                    while (true) {
                        int i11 = ((ekoe) ekgbVarG).c;
                        if (i10 < i11) {
                            float[] fArr12 = (float[]) ekgbVarG.get(i10);
                            float[] fArr13 = (float[]) ekgbVarG.get(((i11 + i10) - 1) % i11);
                            if (mmu.c(fArr12, fArr11)) {
                                if (!mmu.c(fArr13, fArr11)) {
                                    float[] fArrD = mmu.d(fArr11, fArr11, fArr13, fArr12);
                                    if (!Arrays.equals(fArr12, fArrD)) {
                                        ekfwVar2.h(fArrD);
                                    }
                                }
                                ekfwVar2.h(fArr12);
                            } else if (mmu.c(fArr13, fArr11)) {
                                float[] fArrD2 = mmu.d(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr13, fArrD2)) {
                                    ekfwVar2.h(fArrD2);
                                }
                            }
                            i10++;
                        }
                    }
                    i9++;
                    c2 = c3;
                    ekfwVar = ekfwVar2;
                    i6 = 6;
                }
                c = c2;
                ekgb ekgbVarG2 = ekfwVar.g();
                this.u = ekgbVarG2;
                if (((ekoe) ekgbVarG2).c < 3) {
                    break;
                }
                i7 = i8 + 1;
                c2 = c;
                i2 = 16;
                i6 = 6;
            }
            z2 = true;
        } else {
            c = 2;
            z2 = false;
        }
        boolean z3 = z || z2;
        if (((ekoe) this.u).c < 3) {
            return;
        }
        if (this.j && !z3 && this.k) {
            return;
        }
        try {
            met metVar = this.f;
            metVar.j();
            if (this.h != null) {
                if (Build.VERSION.SDK_INT < 34) {
                    throw new IllegalStateException("Gainmaps not supported under API 34.");
                }
                metVar.i("uGainmapTexSampler", this.i, 1);
                Gainmap gainmap = this.h;
                Bitmap.Config config = gainmap.getGainmapContents().getConfig();
                Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                float[] gamma = gainmap.getGamma();
                int i12 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[c] == 1.0f) ? 1 : 0;
                int i13 = (mmd.a(gamma) && mmd.a(gainmap.getRatioMax()) && mmd.a(gainmap.getRatioMin())) ? 1 : 0;
                metVar.h("uGainmapIsAlpha", config == config2 ? 1 : 0);
                metVar.h("uNoGamma", i12);
                metVar.h("uSingleChannel", i13);
                metVar.g("uLogRatioMin", mmd.b(gainmap.getRatioMin()));
                metVar.g("uLogRatioMax", mmd.b(gainmap.getRatioMax()));
                metVar.g("uEpsilonSdr", gainmap.getEpsilonSdr());
                metVar.g("uEpsilonHdr", gainmap.getEpsilonHdr());
                metVar.g("uGainmapGamma", gamma);
                metVar.f("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
                metVar.f("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
                mev.m();
            }
            int i14 = this.t;
            Map map = metVar.a;
            mes mesVar = (mes) map.get("uTexSampler");
            mee.f(mesVar);
            mesVar.b(i, 0);
            mesVar.h = i14;
            metVar.g("uTransformationMatrix", this.q);
            float[] fArr14 = this.r;
            mes mesVar2 = (mes) map.get("uRgbMatrix");
            if (mesVar2 != null) {
                mesVar2.a(fArr14);
            }
            ekgb ekgbVar3 = this.u;
            int[] iArr = mev.a;
            int i15 = ((ekoe) ekgbVar3).c;
            float[] fArr15 = new float[i15 * 4];
            for (int i16 = 0; i16 < i15; i16++) {
                System.arraycopy(ekgbVar3.get(i16), 0, fArr15, i16 * 4, 4);
            }
            metVar.k(fArr15);
            metVar.d();
            GLES20.glDrawArrays(6, 0, ((ekoe) this.u).c);
            mev.m();
            this.k = true;
        } catch (meu e2) {
            throw new mcw(e2, null);
        }
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void e() throws mcw {
        super.e();
        try {
            this.f.e();
            int i = this.i;
            if (i != -1) {
                mev.q(i);
            }
        } catch (meu e2) {
            throw new mcw(e2);
        }
    }

    @Override // defpackage.mjg
    public final boolean k() {
        return (this.k && this.j) ? false : true;
    }
}
