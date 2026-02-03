package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eexc extends lcl {
    private final TextInputLayout a;

    public eexc(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    @Override // defpackage.lcl
    public void c(View view, lhg lhgVar) {
        TextView textView;
        super.c(view, lhgVar);
        TextInputLayout textInputLayout = this.a;
        EditText editText = textInputLayout.c;
        CharSequence contentDescription = null;
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence charSequenceD = textInputLayout.d();
        CharSequence charSequenceC = textInputLayout.c();
        CharSequence charSequence = textInputLayout.j ? textInputLayout.i : null;
        int i = textInputLayout.f;
        if (textInputLayout.e && textInputLayout.g && (textView = textInputLayout.h) != null) {
            contentDescription = textView.getContentDescription();
        }
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(charSequenceD);
        boolean z = textInputLayout.p;
        boolean zIsEmpty3 = TextUtils.isEmpty(charSequenceC);
        boolean z2 = !zIsEmpty3;
        boolean z3 = (zIsEmpty3 && TextUtils.isEmpty(contentDescription)) ? false : true;
        String string = !zIsEmpty2 ? charSequenceD.toString() : "";
        eeww eewwVar = textInputLayout.a;
        TextView textView2 = eewwVar.a;
        if (textView2.getVisibility() == 0) {
            lhgVar.E(textView2);
            lhgVar.U(textView2);
        } else {
            lhgVar.U(eewwVar.c);
        }
        if (!zIsEmpty) {
            lhgVar.S(text);
        } else if (!TextUtils.isEmpty(string)) {
            lhgVar.S(string);
            if (!z && charSequence != null) {
                lhgVar.S(string + ", " + charSequence.toString());
            }
        } else if (charSequence != null) {
            lhgVar.S(charSequence);
        }
        if (!TextUtils.isEmpty(string)) {
            lhgVar.D(string);
            lhgVar.P(zIsEmpty);
        }
        if (text == null || text.length() != i) {
            i = -1;
        }
        lhgVar.G(i);
        if (z3) {
            if (true != z2) {
                charSequenceC = contentDescription;
            }
            lhgVar.z(charSequenceC);
        }
        View view2 = textInputLayout.d.o;
        if (view2 != null) {
            lhgVar.E(view2);
        }
        textInputLayout.b.c().v(lhgVar);
    }

    @Override // defpackage.lcl
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        int i = TextInputLayout.s;
        this.a.b.c().w(accessibilityEvent);
    }
}
