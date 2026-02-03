package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhb {
    public final lha a;

    public lhb(Window window, View view) {
        leb lebVar = new leb(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new lgz(window, this, lebVar);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.a = new lgx(window);
        } else {
            this.a = new lgw(window, lebVar);
        }
    }

    public final void a(boolean z) {
        this.a.i(z);
    }

    public final void b(boolean z) {
        this.a.g(z);
    }

    public final boolean c() {
        return this.a.j();
    }

    public final boolean d() {
        return this.a.h();
    }

    public final void e() {
        this.a.f();
    }

    @Deprecated
    public lhb(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new lgz(windowInsetsController, new leb(windowInsetsController));
        } else {
            this.a = new lgx(windowInsetsController);
        }
    }
}
