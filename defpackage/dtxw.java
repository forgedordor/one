package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxw implements TextWatcher {
    final /* synthetic */ fcsu a;
    final /* synthetic */ dtxx b;

    public dtxw(dtxx dtxxVar, fcsu fcsuVar) {
        this.a = fcsuVar;
        this.b = dtxxVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (((Boolean) this.a.b()).booleanValue()) {
            String strTrim = editable.toString().trim();
            ((ekrd) ((ekrd) dtxx.a.e()).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugListFragmentActionProviderImpl$2", "afterTextChanged", 173, "MddDebugListFragmentActionProviderImpl.java")).t("Updating File Group Filter: %s", strTrim);
            dtxx dtxxVar = this.b;
            ejtj ejtjVar = dtxxVar.f;
            dtxq dtxqVar = dtxxVar.g;
            dtxqVar.d = strTrim;
            ejtjVar.c(ejtj.a(dtxqVar.a()), dtxxVar.b, "MDD.DEBUG.FILTER_ACTION");
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
