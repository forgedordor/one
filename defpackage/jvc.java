package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvc {
    public final jvf a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public jvc(jvf jvfVar, long j, int i, int i2) {
        boolean z;
        this.a = jvfVar;
        this.b = i;
        if (kil.d(j) != 0 || kil.c(j) != 0) {
            kfq.b("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = jvfVar.d;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            jvk jvkVar = (jvk) list.get(i4);
            juh juhVar = new juh((kfz) jvkVar.a, this.b - i3, i2, kim.k(0, kil.b(j), kil.h(j) ? fddu.f(kil.a(j) - jvm.a(f), 0) : kil.a(j), 5));
            float fB = juhVar.b() + f;
            int iG = i3 + juhVar.g();
            arrayList.add(new jvj(juhVar, jvkVar.b, jvkVar.c, i3, iG, f, fB));
            z = true;
            if (juhVar.j() || (iG == this.b && i4 != fcva.e(this.a.d))) {
                i3 = iG;
                f = fB;
                break;
            } else {
                i4++;
                i3 = iG;
                f = fB;
            }
        }
        z = false;
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = kil.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            jvj jvjVar = (jvj) arrayList.get(i5);
            List list2 = ((juh) jvjVar.a).d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                ihu ihuVar = (ihu) list2.get(i6);
                arrayList3.add(ihuVar != null ? jvjVar.h(ihuVar) : null);
            }
            fcva.y(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = fcva.ah(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public static /* synthetic */ void o(jvc jvcVar, ijb ijbVar, long j, iko ikoVar, khl khlVar, ina inaVar) {
        ijbVar.l();
        List list = jvcVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jvi jviVar = ((jvj) list.get(i)).a;
            jviVar.m(ijbVar, j, ikoVar, khlVar, inaVar);
            ijbVar.o(0.0f, jviVar.b());
        }
        ijbVar.j();
    }

    public static /* synthetic */ void p(jvc jvcVar, ijb ijbVar, iiy iiyVar, float f, iko ikoVar, khl khlVar, ina inaVar) {
        ijbVar.l();
        List list = jvcVar.h;
        int i = 0;
        if (list.size() <= 1) {
            int size = list.size();
            while (i < size) {
                jvi jviVar = ((jvj) list.get(i)).a;
                jviVar.n(ijbVar, iiyVar, f, ikoVar, khlVar, inaVar);
                ijbVar.o(0.0f, jviVar.b());
                i++;
            }
        } else {
            int size2 = list.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i2 = 0; i2 < size2; i2++) {
                jvi jviVar2 = ((jvj) list.get(i2)).a;
                fB += jviVar2.b();
                fMax = Math.max(fMax, jviVar2.f());
            }
            Shader shaderB = ((ikm) iiyVar).b((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size3 = list.size();
            while (i < size3) {
                jvi jviVar3 = ((jvj) list.get(i)).a;
                jviVar3.n(ijbVar, new iiz(shaderB), f, ikoVar, khlVar, inaVar);
                ijbVar.o(0.0f, jviVar3.b());
                matrix.setTranslate(0.0f, -jviVar3.b());
                shaderB.setLocalMatrix(matrix);
                i++;
            }
        }
        ijbVar.j();
    }

    public final float a(int i) {
        m(i);
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        return jvjVar.a(((juh) jviVar).b.c(jvjVar.f(i)));
    }

    public final float b(int i) {
        m(i);
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        return ((juh) jviVar).b.d(jvjVar.f(i));
    }

    public final float c(int i) {
        m(i);
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        return jvjVar.a(((juh) jviVar).b.e(jvjVar.f(i)));
    }

    public final float d(int i) {
        m(i);
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        return ((juh) jviVar).b.e.getLineWidth(jvjVar.f(i));
    }

    public final int e(int i, boolean z) {
        int iK;
        m(i);
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        int iF = jvjVar.f(i);
        if (z) {
            jzj jzjVar = ((juh) jviVar).b;
            Layout layout = jzjVar.e;
            if (jzl.c(layout, iF) && jzjVar.b == TextUtils.TruncateAt.END) {
                iK = layout.getLineStart(iF) + layout.getEllipsisStart(iF);
            } else {
                jzb jzbVarP = jzjVar.p();
                Layout layout2 = jzbVarP.a;
                iK = jzbVarP.d(layout2.getLineEnd(iF), layout2.getLineStart(iF));
            }
        } else {
            iK = ((juh) jviVar).b.k(iF);
        }
        return jvjVar.c(iK);
    }

    public final int f(int i) {
        jvj jvjVar = (jvj) this.h.get(i >= j().a() ? fcva.e(this.h) : i < 0 ? 0 : jvh.a(this.h, i));
        return jvjVar.d(((juh) jvjVar.a).b.l(jvjVar.e(i)));
    }

    public final int g(float f) {
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.c(list, f));
        if (jvjVar.b() == 0) {
            return jvjVar.d;
        }
        return jvjVar.d(((juh) jvjVar.a).b.m((int) (f - jvjVar.f)));
    }

    public final int h(long j) {
        List list = this.h;
        jvj jvjVar = (jvj) list.get(jvh.c(list, Float.intBitsToFloat((int) (j & 4294967295L))));
        if (jvjVar.b() == 0) {
            return jvjVar.b;
        }
        jvi jviVar = jvjVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(r3) - jvjVar.f) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        jzj jzjVar = ((juh) jviVar).b;
        int iM = jzjVar.m(iIntBitsToFloat);
        return jvjVar.c(jzjVar.e.getOffsetForHorizontal(iM, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + (-jzjVar.a(iM))));
    }

    public final long i(ihu ihuVar, int i, jyf jyfVar) {
        List list = this.h;
        int iC = jvh.c(list, ihuVar.c);
        float f = ((jvj) list.get(iC)).g;
        float f2 = ihuVar.e;
        if (f >= f2 || iC == fcva.e(list)) {
            jvj jvjVar = (jvj) list.get(iC);
            return jvjVar.g(jvjVar.a.h(jvjVar.i(ihuVar), i, jyfVar), true);
        }
        int iC2 = jvh.c(list, f2);
        long j = jyo.a;
        long jG = j;
        while (jyo.h(jG, j) && iC <= iC2) {
            jvj jvjVar2 = (jvj) list.get(iC);
            jG = jvjVar2.g(jvjVar2.a.h(jvjVar2.i(ihuVar), i, jyfVar), true);
            iC++;
        }
        if (jyo.h(jG, j)) {
            return j;
        }
        long jG2 = j;
        while (jyo.h(jG2, j) && iC <= iC2) {
            jvj jvjVar3 = (jvj) list.get(iC2);
            jG2 = jvjVar3.g(jvjVar3.a.h(jvjVar3.i(ihuVar), i, jyfVar), true);
            iC2--;
        }
        return jyo.h(jG2, j) ? jG : jyp.a(jyo.e(jG), jyo.a(jG2));
    }

    public final juo j() {
        return this.a.a;
    }

    public final void k(int i) {
        if (i < 0 || i >= j().b.length()) {
            kfq.b("offset(" + i + ") is out of bounds [0, " + j().a() + ')');
        }
    }

    public final void l(int i) {
        if (i < 0 || i > j().b.length()) {
            kfq.b("offset(" + i + ") is out of bounds [0, " + j().a() + ']');
        }
    }

    public final void m(int i) {
        if (i < 0 || i >= this.f) {
            kfq.b("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')');
        }
    }

    public final void n(final long j, final float[] fArr) {
        k(jyo.d(j));
        l(jyo.c(j));
        final fdcg fdcgVar = new fdcg();
        fdcgVar.a = 0;
        final fdcf fdcfVar = new fdcf();
        jvh.d(this.h, j, new fdap() { // from class: jva
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jvi jviVar;
                float fC;
                float fD;
                jvj jvjVar = (jvj) obj;
                int iD = jvjVar.b;
                long j2 = j;
                if (iD <= jyo.d(j2)) {
                    iD = jyo.d(j2);
                }
                int iC = jvjVar.c;
                if (iC >= jyo.c(j2)) {
                    iC = jyo.c(j2);
                }
                fdcg fdcgVar2 = fdcgVar;
                long jA = jyp.a(jvjVar.e(iD), jvjVar.e(iC));
                jvi jviVar2 = jvjVar.a;
                int i = fdcgVar2.a;
                int iD2 = jyo.d(jA);
                int iC2 = jyo.c(jA);
                jzj jzjVar = ((juh) jviVar2).b;
                int length = jzjVar.r().length();
                if (iD2 < 0) {
                    kfq.b("startOffset must be > 0");
                }
                if (iD2 >= length) {
                    kfq.b("startOffset must be less than text length");
                }
                if (iC2 <= iD2) {
                    kfq.b("endOffset must be greater than startOffset");
                }
                if (iC2 > length) {
                    kfq.b("endOffset must be smaller or equal to text length");
                }
                float[] fArr2 = fArr;
                if (fArr2.length - i < (iC2 - iD2) * 4) {
                    kfq.b("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int iL = jzjVar.l(iD2);
                int iL2 = jzjVar.l(iC2 - 1);
                jyx jyxVar = new jyx(jzjVar);
                if (iL <= iL2) {
                    while (true) {
                        int iN = jzjVar.n(iL);
                        int iK = jzjVar.k(iL);
                        int iMax = Math.max(iD2, iN);
                        int iMin = Math.min(iC2, iK);
                        float fE = jzjVar.e(iL);
                        float fC2 = jzjVar.c(iL);
                        jviVar = jviVar2;
                        int i2 = i;
                        boolean z = jzjVar.o(iL) == 1;
                        while (iMax < iMin) {
                            int i3 = iMax + 1;
                            boolean zS = jzjVar.s(iMax);
                            if (z && !zS) {
                                fC = jyxVar.a(iMax);
                                fD = jyxVar.b(i3);
                            } else if (z) {
                                fD = jyxVar.c(iMax);
                                fC = jyxVar.d(i3);
                            } else if (zS) {
                                fD = jyxVar.a(iMax);
                                fC = jyxVar.b(i3);
                            } else {
                                fC = jyxVar.c(iMax);
                                fD = jyxVar.d(i3);
                            }
                            fArr2[i2] = fC;
                            fArr2[i2 + 1] = fE;
                            fArr2[i2 + 2] = fD;
                            fArr2[i2 + 3] = fC2;
                            i2 += 4;
                            iMax = i3;
                        }
                        if (iL == iL2) {
                            break;
                        }
                        iL++;
                        jviVar2 = jviVar;
                        i = i2;
                    }
                } else {
                    jviVar = jviVar2;
                }
                int iB = fdcgVar2.a + (jyo.b(jA) * 4);
                int i4 = fdcgVar2.a;
                while (true) {
                    fdcf fdcfVar2 = fdcfVar;
                    if (i4 >= iB) {
                        fdcgVar2.a = iB;
                        fdcfVar2.a += jviVar.b();
                        return fctx.a;
                    }
                    int i5 = i4 + 1;
                    float f = fArr2[i5];
                    float f2 = fdcfVar2.a;
                    fArr2[i5] = f + f2;
                    int i6 = i4 + 3;
                    fArr2[i6] = fArr2[i6] + f2;
                    i4 += 4;
                }
            }
        });
    }
}
