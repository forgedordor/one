package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovj implements TextWatcher {
    final /* synthetic */ dovr a;

    public dovj(dovr dovrVar) {
        this.a = dovrVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
        dovr dovrVar = this.a;
        dpyb dpybVarD = dovrVar.d();
        if (dpybVarD != null) {
            dovrVar.r(dpybVarD, charSequence);
        }
        dovr.t(dovrVar, charSequence, false, 2);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
