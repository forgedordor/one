package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxax implements DialogInterface.OnShowListener {
    final /* synthetic */ Context a;
    final /* synthetic */ DebugGServiceKeysItemView b;

    public cxax(DebugGServiceKeysItemView debugGServiceKeysItemView, Context context) {
        this.a = context;
        this.b = debugGServiceKeysItemView;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DebugGServiceKeysItemView debugGServiceKeysItemView = this.b;
        debugGServiceKeysItemView.a.requestFocus();
        debugGServiceKeysItemView.a.selectAll();
        ((InputMethodManager) this.a.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
