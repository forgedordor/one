package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yb extends uk {
    final /* synthetic */ yc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(yc ycVar, Context context) {
        super(context);
        this.f = ycVar;
    }

    @Override // defpackage.uk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.uk, defpackage.wr
    protected final void i(View view, wp wpVar) {
        yc ycVar = this.f;
        RecyclerView recyclerView = ycVar.a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrC = ycVar.c(recyclerView.o, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iD = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (iD > 0) {
            wpVar.b(i, i2, iD, this.b);
        }
    }
}
