package com.google.android.apps.messaging.ui.conversation.compose;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import defpackage.cqca;
import defpackage.cvmf;
import defpackage.cvtl;
import defpackage.cvtn;
import defpackage.eebt;
import defpackage.lhy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlainTextEditText extends cvtl {
    private String[] a;
    private cvmf b;

    public PlainTextEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public final void f(cvmf cvmfVar, String[] strArr) {
        this.b = cvmfVar;
        this.a = strArr;
    }

    @Override // defpackage.qx, android.widget.EditText, android.widget.TextView
    public final Editable getText() {
        Editable text = super.getText();
        text.getClass();
        return text;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eebt.c(this);
    }

    @Override // defpackage.lox, defpackage.qx, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        String[] strArr = this.a;
        if (strArr == null) {
            return inputConnectionOnCreateInputConnection;
        }
        editorInfo.contentMimeTypes = strArr;
        return lhy.a(inputConnectionOnCreateInputConnection, editorInfo, new cvtn(this.b));
    }

    @Override // defpackage.qx, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i != 16908322) {
            return super.onTextContextMenuItem(i);
        }
        int selectionStart = getSelectionStart();
        try {
            boolean zOnTextContextMenuItem = super.onTextContextMenuItem(R.id.paste);
            CharSequence text = getText();
            int selectionStart2 = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            int i2 = selectionStart2 - 1;
            if (selectionStart2 - selectionStart == 1 && text.charAt(i2) == 65532 && (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) != null) {
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                StringBuilder sb = new StringBuilder(text);
                String string = itemAt.getText().toString();
                sb.replace(selectionStart, selectionStart2, string);
                text = sb.toString();
                selectionStart2 = selectionStart + string.length();
                selectionEnd = selectionStart2;
            }
            setText(text.toString(), TextView.BufferType.EDITABLE);
            int length = text.length();
            setSelection(Math.min(selectionStart2, length), Math.min(selectionEnd, length));
            return zOnTextContextMenuItem;
        } catch (RuntimeException e) {
            String message = e.getMessage();
            if (message == null || !message.startsWith("PARAGRAPH span must start at paragraph boundary")) {
                throw e;
            }
            cqca.h("Bugle", e, "Known error pasting text");
            return true;
        }
    }

    @Override // android.widget.EditText
    public final void setSelection(int i, int i2) {
        int length = getText().length();
        if (i > length || i2 > length || i < 0 || i2 < 0) {
            return;
        }
        super.setSelection(i, i2);
    }

    @Override // defpackage.qx, android.widget.EditText, android.widget.TextView
    public final /* bridge */ /* synthetic */ CharSequence getText() {
        return getText();
    }
}
