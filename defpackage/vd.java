package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class vd extends uk {
    final /* synthetic */ ve f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(ve veVar, Context context) {
        super(context);
        this.f = veVar;
    }

    @Override // defpackage.uk
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.uk
    protected final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.uk, defpackage.wr
    protected final void i(View view, wp wpVar) {
        ve veVar = this.f;
        int[] iArrC = veVar.c(veVar.a.o, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iD = d(Math.max(Math.abs(i), Math.abs(i2)));
        if (iD > 0) {
            wpVar.b(i, i2, iD, this.b);
        }
    }
}
