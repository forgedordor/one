package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qun extends quh {
    private final qoz j;
    private final qui k;

    public qun(qof qofVar, qul qulVar, qui quiVar, qnm qnmVar) {
        super(qofVar, qulVar);
        this.k = quiVar;
        qoz qozVar = new qoz(qofVar, this, new qua("__container", qulVar.a, false), qnmVar);
        this.j = qozVar;
        qozVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.quh, defpackage.qpa
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.quh
    public final qtm i() {
        qtm qtmVarI = super.i();
        return qtmVarI != null ? qtmVarI : this.k.i();
    }

    @Override // defpackage.quh
    public final qvg j() {
        qvg qvgVarJ = super.j();
        return qvgVarJ != null ? qvgVarJ : this.k.j();
    }

    @Override // defpackage.quh
    public final void l(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.quh
    public final void n(qst qstVar, int i, List list, qst qstVar2) {
        this.j.e(qstVar, i, list, qstVar2);
    }
}
