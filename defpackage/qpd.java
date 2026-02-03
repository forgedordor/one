package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpd implements qpa, qpq, qpg {
    float a;
    private final String b;
    private final boolean c;
    private final quh d;
    private final ctz e = new ctz();
    private final ctz f = new ctz();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final qpv k;
    private final qpv l;
    private final qpv m;
    private final qpv n;
    private qpv o;
    private qqn p;
    private final qof q;
    private final int r;
    private qpv s;
    private qpy t;
    private final int u;

    public qpd(qof qofVar, qnm qnmVar, quh quhVar, qtq qtqVar) {
        Path path = new Path();
        this.g = path;
        this.h = new qou(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = quhVar;
        this.b = qtqVar.f;
        this.c = qtqVar.g;
        this.q = qofVar;
        this.u = qtqVar.h;
        path.setFillType(qtqVar.a);
        this.r = (int) (qnmVar.a() / 32.0f);
        qpv qpvVarA = qtqVar.b.a();
        this.k = qpvVarA;
        qpvVarA.h(this);
        quhVar.k(qpvVarA);
        qpv qpvVarA2 = qtqVar.c.a();
        this.l = qpvVarA2;
        qpvVarA2.h(this);
        quhVar.k(qpvVarA2);
        qpv qpvVarA3 = qtqVar.d.a();
        this.m = qpvVarA3;
        qpvVarA3.h(this);
        quhVar.k(qpvVarA3);
        qpv qpvVarA4 = qtqVar.e.a();
        this.n = qpvVarA4;
        qpvVarA4.h(this);
        quhVar.k(qpvVarA4);
        if (quhVar.i() != null) {
            qpv qpvVarA5 = quhVar.i().a.a();
            this.s = qpvVarA5;
            qpvVarA5.h(this);
            quhVar.k(this.s);
        }
        if (quhVar.j() != null) {
            this.t = new qpy(this, quhVar, quhVar.j());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.c * f2);
        int iRound3 = Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        qqn qqnVar = this.p;
        if (qqnVar != null) {
            Integer[] numArr = (Integer[]) qqnVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        qpy qpyVar;
        qpy qpyVar2;
        qpy qpyVar3;
        qpy qpyVar4;
        qpy qpyVar5;
        if (obj == qok.d) {
            this.l.d = qxcVar;
            return;
        }
        if (obj == qok.K) {
            qpv qpvVar = this.o;
            if (qpvVar != null) {
                this.d.m(qpvVar);
            }
            if (qxcVar == null) {
                this.o = null;
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.o = qqnVar;
            qqnVar.h(this);
            this.d.k(this.o);
            return;
        }
        if (obj == qok.L) {
            qqn qqnVar2 = this.p;
            if (qqnVar2 != null) {
                this.d.m(qqnVar2);
            }
            if (qxcVar == null) {
                this.p = null;
                return;
            }
            this.e.g();
            this.f.g();
            qqn qqnVar3 = new qqn(qxcVar);
            this.p = qqnVar3;
            qqnVar3.h(this);
            this.d.k(this.p);
            return;
        }
        if (obj == qok.j) {
            qpv qpvVar2 = this.s;
            if (qpvVar2 != null) {
                qpvVar2.d = qxcVar;
                return;
            }
            qqn qqnVar4 = new qqn(qxcVar);
            this.s = qqnVar4;
            qqnVar4.h(this);
            this.d.k(this.s);
            return;
        }
        if (obj == qok.e && (qpyVar5 = this.t) != null) {
            qpyVar5.b(qxcVar);
            return;
        }
        if (obj == qok.G && (qpyVar4 = this.t) != null) {
            qpyVar4.f(qxcVar);
            return;
        }
        if (obj == qok.H && (qpyVar3 = this.t) != null) {
            qpyVar3.c(qxcVar);
            return;
        }
        if (obj == qok.I && (qpyVar2 = this.t) != null) {
            qpyVar2.e(qxcVar);
        } else {
            if (obj != qok.J || (qpyVar = this.t) == null) {
                return;
            }
            qpyVar.g(qxcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    @Override // defpackage.qpa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r21, android.graphics.Matrix r22, int r23) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpd.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((qpi) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.qpq
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        qwu.d(qstVar, i, list, qstVar2, this);
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qoy qoyVar = (qoy) list2.get(i);
            if (qoyVar instanceof qpi) {
                this.j.add((qpi) qoyVar);
            }
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.b;
    }
}
