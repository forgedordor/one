package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quj extends quh {
    private final Paint j;
    private final Rect k;
    private final Rect l;
    private final qog m;
    private qpv n;
    private qpv o;

    public quj(qof qofVar, qul qulVar) {
        super(qofVar, qulVar);
        this.j = new qou(3);
        this.k = new Rect();
        this.l = new Rect();
        String str = qulVar.f;
        qnm qnmVar = qofVar.a;
        this.m = qnmVar == null ? null : (qog) qnmVar.c.get(str);
    }

    @Override // defpackage.quh, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.K) {
            if (qxcVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new qqn(qxcVar);
                return;
            }
        }
        if (obj == qok.N) {
            if (qxcVar == null) {
                this.o = null;
            } else {
                this.o = new qqn(qxcVar);
            }
        }
    }

    @Override // defpackage.quh, defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        qog qogVar = this.m;
        if (qogVar != null) {
            float f = qogVar.a;
            float fA = qwz.a();
            rectF.set(0.0f, 0.0f, f * fA, qogVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    @Override // defpackage.quh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r11, android.graphics.Matrix r12, int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.quj.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
