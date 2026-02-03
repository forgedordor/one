package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpo extends qow {
    private final quh d;
    private final String e;
    private final boolean f;
    private final qpv g;
    private qpv h;

    public qpo(qof qofVar, quh quhVar, que queVar) {
        super(qofVar, quhVar, quc.a(queVar.i), qud.a(queVar.j), queVar.g, queVar.e, queVar.f, queVar.c, queVar.b);
        this.d = quhVar;
        this.e = queVar.a;
        this.f = queVar.h;
        qpv qpvVarA = queVar.d.a();
        this.g = qpvVarA;
        qpvVarA.h(this);
        quhVar.k(qpvVarA);
    }

    @Override // defpackage.qow, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.b) {
            this.g.d = qxcVar;
            return;
        }
        if (obj == qok.K) {
            qpv qpvVar = this.h;
            if (qpvVar != null) {
                this.d.m(qpvVar);
            }
            if (qxcVar == null) {
                this.h = null;
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.h = qqnVar;
            qqnVar.h(this);
            this.d.k(this.g);
        }
    }

    @Override // defpackage.qow, defpackage.qpa
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Paint paint = this.b;
        paint.setColor(((qpw) this.g).k());
        qpv qpvVar = this.h;
        if (qpvVar != null) {
            paint.setColorFilter((ColorFilter) qpvVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.qoy
    public final String g() {
        return this.e;
    }
}
