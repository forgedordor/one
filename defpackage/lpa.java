package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpa extends InputConnectionWrapper {
    private final TextView a;

    public lpa(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = textView;
        lok lokVarB = lok.b();
        if (!lokVarB.g() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        lod lodVar = lokVarB.e;
        Bundle bundle = editorInfo.extras;
        pli pliVar = lodVar.b.a;
        int iB = pliVar.b(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iB != 0 ? pliVar.b.getInt(iB + pliVar.a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", lodVar.c.g);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return loo.c(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return loo.c(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
