package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgd {
    private final View a;
    private final Window b;
    private final lhb c;

    public sgd(View view, Window window) {
        view.getClass();
        this.a = view;
        this.b = window;
        this.c = window != null ? new lhb(window, view) : null;
    }

    public final void a(long j, boolean z, fdap fdapVar) {
        fdapVar.getClass();
        lhb lhbVar = this.c;
        if (lhbVar != null) {
            lhbVar.b(z);
        }
        Window window = this.b;
        if (window != null) {
            if (z && (lhbVar == null || !lhbVar.d())) {
                j = ((ije) fdapVar.invoke(new ije(j))).i;
            }
            window.setStatusBarColor(ijg.b(j));
        }
    }

    public final void b(long j, boolean z, fdap fdapVar) {
        Window window;
        fdapVar.getClass();
        lhb lhbVar = this.c;
        if (lhbVar != null) {
            lhbVar.a(z);
        }
        if (Build.VERSION.SDK_INT >= 29 && (window = this.b) != null) {
            window.setNavigationBarContrastEnforced(true);
        }
        Window window2 = this.b;
        if (window2 != null) {
            if (z && (lhbVar == null || !lhbVar.c())) {
                j = ((ije) fdapVar.invoke(new ije(j))).i;
            }
            window2.setNavigationBarColor(ijg.b(j));
        }
    }
}
