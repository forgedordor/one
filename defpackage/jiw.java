package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiw {
    public static final jiw a = new jiw();

    private jiw() {
    }

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
