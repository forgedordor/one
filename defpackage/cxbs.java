package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxbs implements View.OnClickListener, DialogInterface.OnClickListener {
    public final TextView a;
    public final TextView b;
    public String c;
    public Object d;
    public cxbr e;
    private final DebugPrefsItemView f;
    private EditText g;

    public cxbs(DebugPrefsItemView debugPrefsItemView) {
        this.f = debugPrefsItemView;
        View viewFindViewById = debugPrefsItemView.findViewById(R.id.title);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = debugPrefsItemView.findViewById(R.id.text_value);
        viewFindViewById2.getClass();
        this.b = (TextView) viewFindViewById2;
        debugPrefsItemView.setOnClickListener(this);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object objValueOf;
        dialogInterface.getClass();
        EditText editText = this.g;
        if (editText == null) {
            throw new IllegalStateException("activeEditText null in onClick");
        }
        String str = null;
        this.g = null;
        String string = editText.getText().toString();
        try {
            Object obj = this.d;
            if (obj instanceof String) {
                objValueOf = string;
            } else if (obj instanceof Integer) {
                objValueOf = Integer.valueOf(Integer.parseInt(string));
            } else if (!(obj instanceof Long)) {
                return;
            } else {
                objValueOf = Long.valueOf(Long.parseLong(string));
            }
            cxbr cxbrVar = this.e;
            cxbr cxbrVar2 = cxbrVar;
            if (cxbrVar == null) {
                fdbq.c("listener");
                cxbrVar2 = null;
            }
            String str2 = this.c;
            if (str2 == null) {
                fdbq.c("key");
            } else {
                str = str2;
            }
            cxbrVar2.a(str, objValueOf);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        Object obj = this.d;
        String str = null;
        if (obj instanceof Boolean) {
            obj.getClass();
            Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
            this.d = boolValueOf;
            cxbr cxbrVar = this.e;
            if (cxbrVar == null) {
                fdbq.c("listener");
                cxbrVar = null;
            }
            String str2 = this.c;
            if (str2 == null) {
                fdbq.c("key");
            } else {
                str = str2;
            }
            cxbrVar.a(str, boolValueOf);
            return;
        }
        DebugPrefsItemView debugPrefsItemView = this.f;
        EditText editText = new EditText(debugPrefsItemView.getContext());
        this.g = editText;
        editText.setText(this.b.getText());
        editText.setFocusable(true);
        AlertDialog.Builder builder = new AlertDialog.Builder(debugPrefsItemView.getContext());
        String str3 = this.c;
        if (str3 == null) {
            fdbq.c("key");
            str3 = null;
        }
        builder.setTitle(str3).setView(editText).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }
}
