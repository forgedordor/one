package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public final class kea {
    public final View a;
    public final leb b;
    private final fctc c = fctd.b(3, new kdz(this));

    public kea(View view) {
        this.a = view;
        this.b = new leb(view);
    }

    public final InputMethodManager a() {
        return (InputMethodManager) this.c.a();
    }

    public final void b(int i, int i2, int i3, int i4) {
        a().updateSelection(this.a, i, i2, i3, i4);
    }
}
