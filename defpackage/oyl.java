package defpackage;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyl extends ozf {
    private EditText ag;
    private CharSequence ah;
    private final Runnable ai = new oyk(this);
    private long aj = -1;

    private final EditTextPreference bb() {
        return (EditTextPreference) ba();
    }

    private final void bc(boolean z) {
        this.aj = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // defpackage.ozf
    protected final void aV(View view) {
        super.aV(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.ag = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.ag.setText(this.ah);
        EditText editText2 = this.ag;
        editText2.setSelection(editText2.getText().length());
        bb();
    }

    @Override // defpackage.ozf
    public final void aW(boolean z) {
        if (z) {
            String string = this.ag.getText().toString();
            EditTextPreference editTextPreferenceBb = bb();
            if (editTextPreferenceBb.Q(string)) {
                editTextPreferenceBb.i(string);
            }
        }
    }

    @Override // defpackage.ozf
    protected final void aX() {
        bc(true);
        aY();
    }

    final void aY() {
        long j = this.aj;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.ag;
        if (editText == null || !editText.isFocused()) {
            bc(false);
            return;
        }
        if (((InputMethodManager) this.ag.getContext().getSystemService("input_method")).showSoftInput(this.ag, 0)) {
            bc(false);
            return;
        }
        EditText editText2 = this.ag;
        Runnable runnable = this.ai;
        editText2.removeCallbacks(runnable);
        this.ag.postDelayed(runnable, 50L);
    }

    @Override // defpackage.ozf
    protected final boolean aZ() {
        return true;
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            this.ah = bb().g;
        } else {
            this.ah = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // defpackage.ozf, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.ah);
    }
}
