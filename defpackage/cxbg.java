package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbg implements DialogInterface.OnShowListener {
    final /* synthetic */ Context a;
    final /* synthetic */ DebugMmsConfigItemView b;

    public cxbg(DebugMmsConfigItemView debugMmsConfigItemView, Context context) {
        this.a = context;
        this.b = debugMmsConfigItemView;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        DebugMmsConfigItemView debugMmsConfigItemView = this.b;
        debugMmsConfigItemView.f.requestFocus();
        debugMmsConfigItemView.f.selectAll();
        ((InputMethodManager) this.a.getSystemService("input_method")).toggleSoftInput(1, 0);
    }
}
