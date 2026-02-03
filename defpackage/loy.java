package defpackage;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loy {
    private final EditText a;
    private final lph b;

    public loy(EditText editText) {
        this.a = editText;
        lph lphVar = new lph(editText);
        this.b = lphVar;
        editText.addTextChangedListener(lphVar);
        editText.setEditableFactory(loz.a());
    }

    public static final KeyListener c(KeyListener keyListener) {
        return keyListener instanceof lpd ? keyListener : new lpd(keyListener);
    }

    public final InputConnection a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof lpa ? inputConnection : new lpa(this.a, inputConnection, editorInfo);
    }

    public final void b(int i) {
        lcg.h(i, "maxEmojiCount should be greater than 0");
        this.b.a = i;
    }
}
