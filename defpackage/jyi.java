package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyi {
    public final jyh a;
    public final jvc b;
    public final long c;
    public final float d;
    public final float e;
    public final List f;

    public jyi(jyh jyhVar, jvc jvcVar, long j) {
        this.a = jyhVar;
        this.b = jvcVar;
        this.c = j;
        float fA = 0.0f;
        this.d = jvcVar.h.isEmpty() ? 0.0f : ((jvj) jvcVar.h.get(0)).a.a();
        if (!jvcVar.h.isEmpty()) {
            jvj jvjVar = (jvj) fcva.S(jvcVar.h);
            fA = jvjVar.a(jvjVar.a.d());
        }
        this.e = fA;
        this.f = jvcVar.g;
    }

    public final float a(int i, boolean z) {
        jvc jvcVar = this.b;
        jvcVar.l(i);
        jvj jvjVar = (jvj) jvcVar.h.get(i == jvcVar.j().a() ? fcva.e(jvcVar.h) : jvh.a(jvcVar.h, i));
        return jvjVar.a.c(jvjVar.e(i), z);
    }

    public final float b(int i) {
        return this.b.a(i);
    }

    public final float c(int i) {
        jvc jvcVar = this.b;
        jvcVar.m(i);
        List list = jvcVar.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        int iF = jvjVar.f(i);
        jzj jzjVar = ((juh) jviVar).b;
        return jzjVar.e.getLineLeft(iF) + (iF == jzjVar.f + (-1) ? jzjVar.h : 0.0f);
    }

    public final float d(int i) {
        jvc jvcVar = this.b;
        jvcVar.m(i);
        List list = jvcVar.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        int iF = jvjVar.f(i);
        jzj jzjVar = ((juh) jviVar).b;
        return jzjVar.e.getLineRight(iF) + (iF == jzjVar.f + (-1) ? jzjVar.i : 0.0f);
    }

    public final float e(int i) {
        return this.b.c(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyi)) {
            return false;
        }
        jyi jyiVar = (jyi) obj;
        return fdbq.f(this.a, jyiVar.a) && fdbq.f(this.b, jyiVar.b) && kjg.e(this.c, jyiVar.c) && this.d == jyiVar.d && this.e == jyiVar.e && fdbq.f(this.f, jyiVar.f);
    }

    public final int f() {
        return this.b.f;
    }

    public final int g(int i, boolean z) {
        return this.b.e(i, z);
    }

    public final int h(int i) {
        return this.b.f(i);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + kjf.a(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode();
    }

    public final int i(float f) {
        return this.b.g(f);
    }

    public final int j(int i) {
        jvc jvcVar = this.b;
        jvcVar.m(i);
        List list = jvcVar.h;
        jvj jvjVar = (jvj) list.get(jvh.b(list, i));
        jvi jviVar = jvjVar.a;
        return jvjVar.c(((juh) jviVar).b.n(jvjVar.f(i)));
    }

    public final int k(long j) {
        return this.b.h(j);
    }

    public final long l(int i) {
        int iB;
        int iA;
        jvc jvcVar = this.b;
        jvcVar.l(i);
        jvj jvjVar = (jvj) jvcVar.h.get(i == jvcVar.j().a() ? fcva.e(jvcVar.h) : jvh.a(jvcVar.h, i));
        jvi jviVar = jvjVar.a;
        int iE = jvjVar.e(i);
        jzt jztVarQ = ((juh) jviVar).b.q();
        if (jztVarQ.h(jztVarQ.b(iE))) {
            jztVarQ.c(iE);
            iB = iE;
            while (iB != -1) {
                if (jztVarQ.h(iB) && !jztVarQ.e(iB)) {
                    break;
                }
                iB = jztVarQ.b(iB);
            }
        } else {
            jztVarQ.c(iE);
            iB = jztVarQ.g(iE) ? (!jztVarQ.f(iE) || jztVarQ.d(iE)) ? jztVarQ.b(iE) : iE : jztVarQ.d(iE) ? jztVarQ.b(iE) : -1;
        }
        if (iB == -1) {
            iB = iE;
        }
        if (jztVarQ.e(jztVarQ.a(iE))) {
            jztVarQ.c(iE);
            iA = iE;
            while (iA != -1) {
                if (!jztVarQ.h(iA) && jztVarQ.e(iA)) {
                    break;
                }
                iA = jztVarQ.a(iA);
            }
        } else {
            jztVarQ.c(iE);
            iA = jztVarQ.d(iE) ? (!jztVarQ.f(iE) || jztVarQ.g(iE)) ? jztVarQ.a(iE) : iE : jztVarQ.g(iE) ? jztVarQ.a(iE) : -1;
        }
        if (iA != -1) {
            iE = iA;
        }
        long jA = jyp.a(iB, iE);
        long j = jyo.a;
        return jvjVar.g(jA, false);
    }

    public final ihu m(int i) {
        float fG;
        float fG2;
        float f;
        float f2;
        jvc jvcVar = this.b;
        jvcVar.k(i);
        List list = jvcVar.h;
        jvj jvjVar = (jvj) list.get(jvh.a(list, i));
        jvi jviVar = jvjVar.a;
        int iE = jvjVar.e(i);
        if (iE < 0 || iE >= ((juh) jviVar).c.length()) {
            kfq.b("offset(" + iE + ") is out of bounds [0," + ((juh) jviVar).c.length() + ')');
        }
        jzj jzjVar = ((juh) jviVar).b;
        int i2 = iE + 1;
        int iL = jzjVar.l(iE);
        float fE = jzjVar.e(iL);
        float fC = jzjVar.c(iL);
        boolean z = jzjVar.o(iL) == 1;
        boolean zIsRtlCharAt = jzjVar.e.isRtlCharAt(iE);
        if (!z || zIsRtlCharAt) {
            if (z) {
                f = jzjVar.g(iE, false);
                f2 = jzjVar.g(i2, true);
            } else if (zIsRtlCharAt) {
                f = jzjVar.f(iE, false);
                f2 = jzjVar.f(i2, true);
            } else {
                fG = jzjVar.g(iE, false);
                fG2 = jzjVar.g(i2, true);
            }
            float f3 = f2;
            fG2 = f;
            fG = f3;
        } else {
            fG = jzjVar.f(iE, false);
            fG2 = jzjVar.f(i2, true);
        }
        RectF rectF = new RectF(fG, fE, fG2, fC);
        return jvjVar.h(new ihu(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final ihu n(int i) {
        jvc jvcVar = this.b;
        jvcVar.l(i);
        jvj jvjVar = (jvj) jvcVar.h.get(i == jvcVar.j().a() ? fcva.e(jvcVar.h) : jvh.a(jvcVar.h, i));
        jvi jviVar = jvjVar.a;
        int iE = jvjVar.e(i);
        if (iE < 0 || iE > ((juh) jviVar).c.length()) {
            kfq.b("offset(" + iE + ") is out of bounds [0," + ((juh) jviVar).c.length() + ']');
        }
        jzj jzjVar = ((juh) jviVar).b;
        float f = jzjVar.f(iE, false);
        int iL = jzjVar.l(iE);
        return jvjVar.h(new ihu(f, jzjVar.e(iL), f, jzjVar.c(iL)));
    }

    public final ikd o(final int i, final int i2) {
        jvc jvcVar = this.b;
        if (i < 0 || i > i2 || i2 > jvcVar.j().b.length()) {
            kfq.b("Start(" + i + ") or End(" + i2 + ") is out of range [0.." + jvcVar.j().b.length() + "), or start > end!");
        }
        byte[] bArr = null;
        if (i == i2) {
            return new iik(bArr);
        }
        final iik iikVar = new iik(bArr);
        List list = jvcVar.h;
        long jA = jyp.a(i, i2);
        long j = jyo.a;
        jvh.d(list, jA, new fdap() { // from class: jvb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                jvj jvjVar = (jvj) obj;
                jvi jviVar = jvjVar.a;
                int iE = jvjVar.e(i);
                int iE2 = jvjVar.e(i2);
                if (iE < 0 || iE > iE2 || iE2 > ((juh) jviVar).c.length()) {
                    kfq.b("start(" + iE + ") or end(" + iE2 + ") is out of range [0.." + ((juh) jviVar).c.length() + "], or start > end!");
                }
                Path path = new Path();
                jzj jzjVar = ((juh) jviVar).b;
                jzjVar.e.getSelectionPath(iE, iE2, path);
                int i3 = jzjVar.g;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i3);
                }
                ikd ikdVar = iikVar;
                iik iikVar2 = new iik(path);
                float f = jvjVar.f;
                iikVar2.o((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                ikdVar.r(iikVar2);
                return fctx.a;
            }
        });
        return iikVar;
    }

    public final jyi p(jyh jyhVar, long j) {
        return new jyi(jyhVar, this.b, j);
    }

    public final boolean q() {
        jvc jvcVar = this.b;
        if (jvcVar.c) {
            return true;
        }
        return ((float) ((int) (this.c & 4294967295L))) < jvcVar.e;
    }

    public final boolean r() {
        return ((float) ((int) (this.c >> 32))) < this.b.d || q();
    }

    public final int t(int i) {
        jvc jvcVar = this.b;
        jvcVar.l(i);
        jvj jvjVar = (jvj) jvcVar.h.get(i == jvcVar.j().a() ? fcva.e(jvcVar.h) : jvh.a(jvcVar.h, i));
        return jvjVar.a.l(jvjVar.e(i));
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) kjg.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }

    public final int u(int i) {
        jvc jvcVar = this.b;
        jvcVar.l(i);
        jvj jvjVar = (jvj) jvcVar.h.get(i == jvcVar.j().a() ? fcva.e(jvcVar.h) : jvh.a(jvcVar.h, i));
        jvi jviVar = jvjVar.a;
        int iE = jvjVar.e(i);
        jzj jzjVar = ((juh) jviVar).b;
        return jzjVar.o(jzjVar.l(iE)) == 1 ? 1 : 2;
    }
}
