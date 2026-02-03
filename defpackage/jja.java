package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jja {
    public static final jja a = new jja();

    private jja() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(jiz.a);
    }
}
