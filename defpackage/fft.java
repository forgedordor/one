package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fft {
    public final View a;
    private final fctc b = fctd.b(3, new fdae() { // from class: ffs
        @Override // defpackage.fdae
        public final Object invoke() {
            Object systemService = this.a.a.getContext().getSystemService("input_method");
            systemService.getClass();
            return (InputMethodManager) systemService;
        }
    });

    public fft(View view) {
        this.a = view;
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.b.a();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
