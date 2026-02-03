package defpackage;

import android.content.Context;
import android.os.ResultReceiver;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daoe {
    public final crqv e;
    public final dakl f;
    private static final cczv g = cdag.p(150629952);
    public static final cqce a = cqce.g("Bugle", "ImeUtil");
    public volatile boolean b = false;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    private final daod h = new daod(this, "last_ime_height");
    private final daod i = new daod(this, "last_ime_height_landscape");
    private final ResultReceiver j = new daoc(this);

    public daoe(crqv crqvVar, dakl daklVar) {
        this.e = crqvVar;
        this.f = daklVar;
    }

    public final int a() {
        return (this.f.l() ? this.i : this.h).a;
    }

    public final void b(danz danzVar) {
        this.c.add(danzVar);
    }

    public final void c(int i) {
        if (this.f.l()) {
            this.i.a(i);
        } else {
            this.h.a(i);
        }
    }

    public final synchronized void d(boolean z) {
        if (z != this.b) {
            this.b = z;
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((danz) arrayList.get(i)).a();
            }
        }
    }

    public final boolean e(Context context, View view) {
        if (context != null && view != null) {
            if (!this.b) {
                return true;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                if (inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, this.j)) {
                    d(false);
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Context context, View view) {
        g(context, view, false);
    }

    public final void g(Context context, View view, boolean z) {
        WindowInsetsController windowInsetsController;
        if (context == null || view == null) {
            return;
        }
        if (!z && craf.d && ((Boolean) g.e()).booleanValue()) {
            if (view.isFocusable() && view.requestFocus() && (windowInsetsController = view.getWindowInsetsController()) != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
                d(true);
                return;
            }
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null && view.isFocusable() && view.requestFocus() && inputMethodManager.showSoftInput(view, 0, this.j)) {
            d(true);
        }
    }
}
