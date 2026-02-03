package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eftg implements Runnable {
    final /* synthetic */ efth a;

    public eftg(efth efthVar) {
        this.a = efthVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        efth efthVar = this.a;
        View viewPeekDecorView = efthVar.b.peekDecorView();
        if (viewPeekDecorView != null) {
            efte efteVar = efti.a;
            viewPeekDecorView.setSystemUiVisibility(viewPeekDecorView.getSystemUiVisibility() & (-5635));
            return;
        }
        int i = efthVar.c - 1;
        efthVar.c = i;
        if (i >= 0) {
            efthVar.a.post(efthVar.d);
        } else {
            efti.a.d("Cannot get decor view of window: ".concat(String.valueOf(String.valueOf(efthVar.b))));
        }
    }
}
