package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qoz implements qpa, qpi, qpq, qsu {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final qof g;
    private List h;
    private qqm i;

    public qoz(qof qofVar, quh quhVar, qua quaVar, qnm qnmVar) {
        qtj qtjVar;
        String str = quaVar.a;
        boolean z = quaVar.c;
        List list = quaVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            qoy qoyVarA = ((qto) list.get(i2)).a(qofVar, qnmVar, quhVar);
            if (qoyVarA != null) {
                arrayList.add(qoyVarA);
            }
        }
        List list2 = quaVar.b;
        while (true) {
            if (i >= list2.size()) {
                qtjVar = null;
                break;
            }
            qto qtoVar = (qto) list2.get(i);
            if (qtoVar instanceof qtj) {
                qtjVar = (qtj) qtoVar;
                break;
            }
            i++;
        }
        this(qofVar, quhVar, str, z, arrayList, qtjVar);
    }

    @Override // defpackage.qsu
    public final void a(Object obj, qxc qxcVar) {
        qqm qqmVar = this.i;
        if (qqmVar != null) {
            qqmVar.e(obj, qxcVar);
        }
    }

    @Override // defpackage.qpa
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        qqm qqmVar = this.i;
        if (qqmVar != null) {
            matrix2.preConcat(qqmVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) r6.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof qpa) {
                ((qpa) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        qqm qqmVar = this.i;
        if (qqmVar != null) {
            matrix2.preConcat(qqmVar.a());
        }
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qoy qoyVar = (qoy) list.get(size);
            if (qoyVar instanceof qpa) {
                ((qpa) qoyVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.qpq
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.qsu
    public final void e(qst qstVar, int i, List list, qst qstVar2) {
        String str = this.e;
        if (!qstVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            qstVar2 = qstVar2.b(str);
            if (qstVar.d(str, i)) {
                list.add(qstVar2.c(this));
            }
        }
        if (!qstVar.f(str, i)) {
            return;
        }
        int iA = i + qstVar.a(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            qoy qoyVar = (qoy) list2.get(i2);
            if (qoyVar instanceof qsu) {
                ((qsu) qoyVar).e(qstVar, iA, list, qstVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.qoy
    public final void f(List list, List list2) {
        List list3 = this.a;
        ArrayList arrayList = new ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qoy qoyVar = (qoy) list3.get(size);
            qoyVar.f(arrayList, list3.subList(0, size));
            arrayList.add(qoyVar);
        }
    }

    @Override // defpackage.qoy
    public final String g() {
        throw null;
    }

    final Matrix h() {
        qqm qqmVar = this.i;
        if (qqmVar != null) {
            return qqmVar.a();
        }
        Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.qpi
    public final Path i() {
        Matrix matrix = this.b;
        matrix.reset();
        qqm qqmVar = this.i;
        if (qqmVar != null) {
            matrix.set(qqmVar.a());
        }
        Path path = this.c;
        path.reset();
        if (!this.f) {
            List list = this.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                qoy qoyVar = (qoy) list.get(size);
                if (qoyVar instanceof qpi) {
                    path.addPath(((qpi) qoyVar).i(), matrix);
                }
            }
        }
        return path;
    }

    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.a;
                if (i >= list.size()) {
                    break;
                }
                qoy qoyVar = (qoy) list.get(i);
                if (qoyVar instanceof qpi) {
                    this.h.add((qpi) qoyVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public qoz(qof qofVar, quh quhVar, String str, boolean z, List list, qtj qtjVar) {
        new qou();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = qofVar;
        this.f = z;
        this.a = list;
        if (qtjVar != null) {
            qqm qqmVar = new qqm(qtjVar);
            this.i = qqmVar;
            qqmVar.c(quhVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qoy qoyVar = (qoy) list.get(size);
            if (qoyVar instanceof qpf) {
                arrayList.add((qpf) qoyVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((qpf) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
