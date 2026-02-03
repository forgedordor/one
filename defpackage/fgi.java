package defpackage;

import android.view.inputmethod.ExtractedText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgi {
    public static final ExtractedText a(kew kewVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = kewVar.a();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = kewVar.a().length();
        extractedText.partialStartOffset = -1;
        long j = kewVar.c;
        extractedText.selectionStart = jyo.d(j);
        extractedText.selectionEnd = jyo.c(j);
        extractedText.flags = !fdgn.J(kewVar.a(), '\n') ? 1 : 0;
        return extractedText;
    }
}
