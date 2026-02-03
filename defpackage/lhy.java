package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lhy {
    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, lhx lhxVar) {
        lca.b(inputConnection, "inputConnection must be non-null");
        lca.b(editorInfo, "editorInfo must be non-null");
        return new lhw(inputConnection, lhxVar);
    }
}
