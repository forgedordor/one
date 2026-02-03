package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewu extends eewk {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public eewu(eewj eewjVar, int i) {
        super(eewjVar);
        this.b = R.drawable.design_password_eye;
        this.c = new View.OnClickListener() { // from class: eewt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eewu eewuVar = this.a;
                EditText editText = eewuVar.a;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                if (eewuVar.k()) {
                    eewuVar.a.setTransformationMethod(null);
                } else {
                    eewuVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    eewuVar.a.setSelection(selectionEnd);
                }
                eewuVar.x();
            }
        };
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.eewk
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.eewk
    public final int b() {
        return this.b;
    }

    @Override // defpackage.eewk
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.eewk
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.eewk
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.eewk
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.eewk
    public final boolean s() {
        return true;
    }

    @Override // defpackage.eewk
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.eewk
    public final void y() {
        x();
    }
}
