package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrx extends lcl {
    final /* synthetic */ EditText a;
    final /* synthetic */ TextView b;

    public ecrx(EditText editText, TextView textView) {
        this.a = editText;
        this.b = textView;
    }

    @Override // defpackage.lcl
    public final void c(View view, lhg lhgVar) {
        super.c(view, lhgVar);
        EditText editText = this.a;
        String string = editText.getText() != null ? editText.getText().toString() : "";
        TextView textView = this.b;
        CharSequence charSequenceQ = a.q(textView.getText() != null ? textView.getText().toString() : "", editText.getHint() != null ? editText.getHint().toString() : "", " ");
        lhgVar.D(charSequenceQ);
        lhgVar.P(string.isEmpty());
        if (string.isEmpty()) {
            lhgVar.S(charSequenceQ);
        } else {
            lhgVar.S(string);
        }
    }
}
