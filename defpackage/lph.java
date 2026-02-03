package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lph implements TextWatcher {
    private final EditText b;
    private log c;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    private int d = 0;
    private int e = 0;

    public lph(EditText editText) {
        this.b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.b;
        if (editText.isInEditMode()) {
            return;
        }
        int i = this.d;
        int i2 = this.e;
        if (i2 > 0) {
            int iA = lok.b().a();
            if (iA != 0) {
                if (iA == 1) {
                    lok.b().d(editable, i, i + i2, this.a, 0);
                    return;
                } else if (iA != 3) {
                    return;
                }
            }
            lok lokVarB = lok.b();
            if (this.c == null) {
                this.c = new lpg(editText);
            }
            lokVarB.f(this.c);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.d = i;
        if (i2 > i3) {
            i3 = 0;
        }
        this.e = i3;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
