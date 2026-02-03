package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lem implements View.OnApplyWindowInsetsListener {
    lgt a = null;
    final /* synthetic */ View b;
    final /* synthetic */ ldn c;

    public lem(View view, ldn ldnVar) {
        this.b = view;
        this.c = ldnVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        lgt lgtVarP = lgt.p(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            len.g(windowInsets, this.b);
            if (lgtVarP.equals(this.a)) {
                return this.c.ez(view, lgtVarP).e();
            }
        }
        this.a = lgtVarP;
        lgt lgtVarEz = this.c.ez(view, lgtVarP);
        if (Build.VERSION.SDK_INT >= 30) {
            return lgtVarEz.e();
        }
        int[] iArr = ley.a;
        lel.c(view);
        return lgtVarEz.e();
    }
}
