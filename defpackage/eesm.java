package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesm extends eess {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public eesm(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.eess
    public final void a(Matrix matrix, eerq eerqVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((eess) it.next()).a(this.b, eerqVar, i, canvas);
        }
    }
}
