package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qui extends quh {
    public boolean j;
    private qpv k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public qui(qof qofVar, qul qulVar, List list, qnm qnmVar) {
        quh quhVar;
        quh quiVar;
        String str;
        super(qofVar, qulVar);
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        qsz qszVar = qulVar.r;
        if (qszVar != null) {
            qpv qpvVarA = qszVar.a();
            this.k = qpvVarA;
            k(qpvVarA);
            this.k.h(this);
        } else {
            this.k = null;
        }
        ctz ctzVar = new ctz(qnmVar.h.size());
        int size = list.size() - 1;
        quh quhVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < ctzVar.b(); i++) {
                    quh quhVar3 = (quh) ctzVar.d(ctzVar.c(i));
                    if (quhVar3 != null && (quhVar = (quh) ctzVar.d(quhVar3.c.e)) != null) {
                        quhVar3.f = quhVar;
                    }
                }
                return;
            }
            qul qulVar2 = (qul) list.get(size);
            int i2 = qulVar2.w;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                quiVar = new qui(qofVar, qulVar2, (List) qnmVar.b.get(qulVar2.f), qnmVar);
            } else if (i3 == 1) {
                quiVar = new quo(qofVar, qulVar2);
            } else if (i3 == 2) {
                quiVar = new quj(qofVar, qulVar2);
            } else if (i3 == 3) {
                quiVar = new qum(qofVar, qulVar2);
            } else if (i3 == 4) {
                quiVar = new qun(qofVar, qulVar2, this, qnmVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                qws.a("Unknown layer type ".concat(str));
                quiVar = null;
            } else {
                quiVar = new qus(qofVar, qulVar2);
            }
            if (quiVar != null) {
                ctzVar.h(quiVar.c.d, quiVar);
                if (quhVar2 != null) {
                    quhVar2.e = quiVar;
                    quhVar2 = null;
                } else {
                    this.l.add(0, quiVar);
                    int i4 = qulVar2.x;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        quhVar2 = quiVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.quh, defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        super.a(obj, qxcVar);
        if (obj == qok.E) {
            if (qxcVar == null) {
                qpv qpvVar = this.k;
                if (qpvVar != null) {
                    qpvVar.d = null;
                    return;
                }
                return;
            }
            qqn qqnVar = new qqn(qxcVar);
            this.k = qqnVar;
            qqnVar.h(this);
            k(this.k);
        }
    }

    @Override // defpackage.quh, defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.m;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((quh) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.quh
    public final void l(Canvas canvas, Matrix matrix, int i) throws Throwable {
        qul qulVar = this.c;
        float f = qulVar.n;
        RectF rectF = this.n;
        rectF.set(0.0f, 0.0f, f, qulVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                qnc.a();
                return;
            } else if ((!this.j && "__container".equals(qulVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((quh) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.quh
    public final void n(qst qstVar, int i, List list, qst qstVar2) {
        int i2 = 0;
        while (true) {
            List list2 = this.l;
            if (i2 >= list2.size()) {
                return;
            }
            ((quh) list2.get(i2)).e(qstVar, i, list, qstVar2);
            i2++;
        }
    }

    @Override // defpackage.quh
    public final void o(float f) {
        super.o(f);
        if (this.k != null) {
            float fB = this.b.a.b() + 0.01f;
            qnm qnmVar = this.c.b;
            f = ((((Float) this.k.e()).floatValue() * qnmVar.l) - qnmVar.j) / fB;
        }
        if (this.k == null) {
            qul qulVar = this.c;
            f -= qulVar.m / qulVar.b.b();
        }
        qul qulVar2 = this.c;
        float f2 = qulVar2.l;
        if (f2 != 0.0f && !"__container".equals(qulVar2.c)) {
            f /= f2;
        }
        List list = this.l;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((quh) list.get(size)).o(f);
            }
        }
    }
}
