package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrl implements TextWatcher {
    public final EditText a;
    public lpu b;
    public boolean c = true;
    private int d;
    private int e;

    public lrl(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            lpz.c().d(editableText);
            lre.a(editableText, selectionStart, selectionEnd);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && lpz.h()) {
            int i = this.d;
            int i2 = this.e;
            if (i2 > 0) {
                int iB = lpz.c().b();
                if (iB != 0) {
                    if (iB == 1) {
                        lpz.c().k(editable, i, i2 + i, 0);
                        return;
                    } else if (iB != 3) {
                        return;
                    }
                }
                lpz lpzVarC = lpz.c();
                if (this.b == null) {
                    this.b = new lrk(editText);
                }
                lpzVarC.f(this.b);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = i;
        this.e = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
