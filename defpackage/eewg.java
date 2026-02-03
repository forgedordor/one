package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eewg {
    final /* synthetic */ eewj a;

    public eewg(eewj eewjVar) {
        this.a = eewjVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        eewj eewjVar = this.a;
        EditText editText = eewjVar.j;
        if (editText == textInputLayout.c) {
            return;
        }
        if (editText != null) {
            editText.removeTextChangedListener(eewjVar.k);
            if (eewjVar.j.getOnFocusChangeListener() == eewjVar.c().d()) {
                eewjVar.j.setOnFocusChangeListener(null);
            }
        }
        eewjVar.j = textInputLayout.c;
        EditText editText2 = eewjVar.j;
        if (editText2 != null) {
            editText2.addTextChangedListener(eewjVar.k);
        }
        eewjVar.c().g(eewjVar.j);
        eewjVar.n(eewjVar.c());
    }
}
