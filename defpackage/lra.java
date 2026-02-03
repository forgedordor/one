package defpackage;

import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lra {
    public final EditText a;
    public final lrl b;

    public lra(EditText editText) {
        this.a = editText;
        lrl lrlVar = new lrl(editText);
        this.b = lrlVar;
        editText.addTextChangedListener(lrlVar);
        editText.setEditableFactory(lrb.a());
    }
}
