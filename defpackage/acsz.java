package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsz implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ actb c;
    final /* synthetic */ View d;

    public acsz(View view, View view2, actb actbVar, View view3) {
        this.a = view;
        this.b = view2;
        this.c = actbVar;
        this.d = view3;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Snackbar snackbarP = Snackbar.p(this.a, R.string.hangouts_syncing_conversations, -2);
        snackbarP.m(this.b);
        snackbarP.i();
        ((acxm) this.c.b.b()).p(snackbarP);
        this.d.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
