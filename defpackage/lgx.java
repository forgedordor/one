package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgx extends lha {
    final WindowInsetsController a;
    protected Window b;

    public lgx(Window window) {
        this(window.getInsetsController());
        this.b = window;
    }

    protected final void a(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void b(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.lha
    public final void e() {
        this.a.hide(519);
    }

    @Override // defpackage.lha
    public final void f() {
        this.a.show(519);
    }

    @Override // defpackage.lha
    public final void g(boolean z) {
        if (z) {
            if (this.b != null) {
                a(8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (this.b != null) {
                b(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.lha
    public boolean h() {
        WindowInsetsController windowInsetsController = this.a;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        return (windowInsetsController.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.lha
    public final void i(boolean z) {
        if (z) {
            if (this.b != null) {
                a(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (this.b != null) {
                b(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.lha
    public boolean j() {
        WindowInsetsController windowInsetsController = this.a;
        windowInsetsController.setSystemBarsAppearance(0, 0);
        return (windowInsetsController.getSystemBarsAppearance() & 16) != 0;
    }

    public lgx(WindowInsetsController windowInsetsController) {
        new cvw();
        this.a = windowInsetsController;
    }
}
