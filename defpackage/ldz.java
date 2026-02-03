package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowInsetsController$OnControllableInsetsChangedListener;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ldz extends ldx {
    private View a;
    private WindowInsetsController b;

    public ldz(View view) {
        super(view);
        this.a = view;
    }

    @Override // defpackage.ldx, defpackage.lea
    public final void a() {
        View view;
        WindowInsetsController windowInsetsController = this.b;
        if (windowInsetsController == null) {
            View view2 = this.a;
            windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.a();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController$OnControllableInsetsChangedListener windowInsetsController$OnControllableInsetsChangedListener = new WindowInsetsController$OnControllableInsetsChangedListener() { // from class: ldy
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                atomicBoolean.set((i & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        if (!atomicBoolean.get() && (view = this.a) != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(windowInsetsController$OnControllableInsetsChangedListener);
        windowInsetsController.hide(WindowInsets.Type.ime());
    }

    @Override // defpackage.ldx, defpackage.lea
    public final void b() {
        if (this.a != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) this.a.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.b;
        if (windowInsetsController == null) {
            View view = this.a;
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.b();
    }

    public ldz(WindowInsetsController windowInsetsController) {
        super(null);
        this.b = windowInsetsController;
    }
}
