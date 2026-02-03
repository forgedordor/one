package defpackage;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnip implements dnjm {
    public final EditText a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public TextWatcher d;
    public InputFilter e;

    public dnip(EditText editText) {
        this.a = editText;
    }

    public static final void o(dnjl dnjlVar, List list, fdae fdaeVar) {
        boolean zIsEmpty = list.isEmpty();
        list.add(dnjlVar);
        if (zIsEmpty) {
            fdaeVar.invoke();
        }
    }

    public static final void p(dnjl dnjlVar, List list, fdae fdaeVar) {
        list.remove(dnjlVar);
        if (list.isEmpty()) {
            fdaeVar.invoke();
        }
    }

    @Override // defpackage.dnih
    public final dnjo a() {
        EditText editText = this.a;
        return new dnjo(editText.getSelectionStart(), editText.getSelectionEnd());
    }

    @Override // defpackage.dnih
    public final CharSequence b(boolean z) {
        Editable text = this.a.getText();
        return z ? new SpannableStringBuilder(text) : text.toString();
    }

    @Override // defpackage.dnih
    public final void c(CharSequence charSequence) {
        Editable text = this.a.getText();
        text.getClass();
        if (text.length() > 0) {
            m("\n");
        }
        m(charSequence);
    }

    @Override // defpackage.dnih
    public final void d() {
        this.a.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // defpackage.dnih
    public final void e() {
        throw null;
    }

    @Override // defpackage.dnih
    public final void f(dnnp dnnpVar) {
        SpannableString spannableString = new SpannableString(dnnpVar.b.a());
        spannableString.setSpan(new dnif(dnnpVar), 0, spannableString.length(), 256);
        g(spannableString);
    }

    @Override // defpackage.dnih
    public final void g(CharSequence charSequence) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        editText.getText().replace(selectionStart, editText.getSelectionEnd(), charSequence);
        int length = selectionStart + charSequence.length();
        j(new dnjo(length, length));
    }

    @Override // defpackage.dnih
    public final void i(fddq fddqVar, CharSequence charSequence) {
        this.a.getText().replace(fddqVar.a, fddqVar.b, charSequence);
    }

    @Override // defpackage.dnih
    public final void j(dnjo dnjoVar) {
        EditText editText = this.a;
        int i = dnjoVar.a;
        int length = editText.length();
        editText.setSelection(fddu.g(i, length), fddu.g(dnjoVar.b, length));
    }

    @Override // defpackage.dnih
    public final void k(CharSequence charSequence) {
        EditText editText = this.a;
        editText.setText(charSequence);
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.dnjm
    public final void l(dnjl dnjlVar) {
        throw null;
    }

    public final void m(CharSequence charSequence) {
        EditText editText = this.a;
        editText.getText().append(charSequence);
        editText.setSelection(editText.getText().length());
    }

    @Override // defpackage.dnjm
    public final void n(dnjl dnjlVar) {
        throw null;
    }

    @Override // defpackage.dnih
    public final /* synthetic */ void h() {
    }
}
