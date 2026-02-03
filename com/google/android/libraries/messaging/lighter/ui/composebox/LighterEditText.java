package com.google.android.libraries.messaging.lighter.ui.composebox;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.lhx;
import defpackage.lhy;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LighterEditText extends TextInputEditText {
    private static final String[] a = {"image/*"};

    public LighterEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, defpackage.qx, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.contentMimeTypes = a;
        return lhy.a(inputConnectionOnCreateInputConnection, editorInfo, new lhx() { // from class: dwzf
            @Override // defpackage.lhx
            public final boolean a(lia liaVar, int i, Bundle bundle) {
                Context context = this.a.getContext();
                Toast.makeText(context, context.getString(R.string.IMAGE_DISABLED_FOR_APP_TOAST_MESSAGE, context.getString(R.string.BUSINESS_MESSAGING)), 1).show();
                return true;
            }
        });
    }

    @Override // defpackage.qx, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getDescription().hasMimeType("text/html")) {
                return true;
            }
            if (primaryClip.getItemCount() > 0 && primaryClip.getItemAt(0).getUri() != null) {
                return true;
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }
}
