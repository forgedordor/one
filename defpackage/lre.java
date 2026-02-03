package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lre implements InputFilter {
    private final TextView a;
    private lpu b;

    public lre(TextView textView) {
        this.a = textView;
    }

    static void a(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = lpz.c().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0) {
                    charSequence = charSequence.subSequence(i, i2);
                } else if (i2 != charSequence.length()) {
                    i = 0;
                    charSequence = charSequence.subSequence(i, i2);
                }
                return lpz.c().j(charSequence, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        lpz lpzVarC = lpz.c();
        if (this.b == null) {
            this.b = new lrd(textView, this);
        }
        lpzVarC.f(this.b);
        return charSequence;
    }
}
