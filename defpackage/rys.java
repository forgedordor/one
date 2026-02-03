package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rys extends ryt {
    float a;
    final float b;
    final RectF c = new RectF();
    final /* synthetic */ ryv d;

    public rys(ryv ryvVar, float f, float f2) {
        this.d = ryvVar;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ryt
    public final void a(String str) {
        ryv ryvVar = this.d;
        if (ryvVar.i()) {
            Rect rect = new Rect();
            ryvVar.d.d.getTextBounds(str, 0, str.length(), rect);
            RectF rectF = new RectF(rect);
            rectF.offset(this.a, this.b);
            this.c.union(rectF);
        }
        this.a += ryvVar.d.d.measureText(str);
    }

    @Override // defpackage.ryt
    public final boolean b(ryd rydVar) {
        if (!(rydVar instanceof rye)) {
            return true;
        }
        rye ryeVar = (rye) rydVar;
        rxs rxsVarA = rydVar.t.a(ryeVar.a);
        if (rxsVarA == null) {
            ryv.e("TextPath path reference '%s' not found", ryeVar.a);
            return false;
        }
        rxa rxaVar = (rxa) rxsVarA;
        Path path = new ryn(rxaVar.a).a;
        Matrix matrix = rxaVar.e;
        if (matrix != null) {
            path.transform(matrix);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.c.union(rectF);
        return false;
    }
}
