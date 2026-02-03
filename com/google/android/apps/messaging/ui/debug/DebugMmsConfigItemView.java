package com.google.android.apps.messaging.ui.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cmtf;
import defpackage.cmtq;
import defpackage.cmuh;
import defpackage.cxbe;
import defpackage.cxbg;
import defpackage.cxbh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMmsConfigItemView extends LinearLayout implements View.OnClickListener, DialogInterface.OnClickListener {
    public TextView a;
    public TextView b;
    public Switch c;
    public String d;
    public cxbh e;
    public EditText f;
    public String g;
    public String h;
    public int i;

    public DebugMmsConfigItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        cxbh cxbhVar = this.e;
        String str = this.d;
        String string = this.f.getText().toString();
        int i2 = this.i;
        cxbe cxbeVar = (cxbe) cxbhVar;
        Bundle bundle = cxbeVar.a.b;
        Object obj = bundle.get(str);
        if (obj != null) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if ((i3 != 0 && i3 != 1 && i3 != 2 && i3 != 3) || obj.equals(string)) {
                return;
            }
        }
        cmuh.x(bundle, i2, str, string);
        cmuh.x(cxbeVar.b.b, i2, str, string);
        cxbeVar.c.put(str, new cmtf(string, cmtq.DEBUG_MENU));
        cxbeVar.notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.text_value);
        this.c = (Switch) findViewById(R.id.switch_button);
        setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = getContext();
        if (this.d.equals("How do I use this debug tool?")) {
            StringBuilder sb = new StringBuilder("This is a list of carrier configs used for the mcc/mnc set in the upper left corner.");
            for (cmtq cmtqVar : cmtq.values()) {
                sb.append(" Configs labeled with \"(");
                sb.append(cmtqVar.j);
                sb.append(")\" come from source: ");
                sb.append(cmtqVar.name());
                sb.append(".");
            }
            new AlertDialog.Builder(context).setTitle("Carrier Config Debug Menu").setMessage(sb.toString()).create().show();
            return;
        }
        int i = this.i;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    new AlertDialog.Builder(context).setTitle(this.g).setMessage(String.valueOf(this.c.isChecked())).setMessage(this.h).create().show();
                    return;
                } else if (i2 != 2 && i2 != 3) {
                    if (i2 == 4 || i2 == 5) {
                        new AlertDialog.Builder(context).setTitle(this.g).setMessage(this.b.getText()).create().show();
                        return;
                    }
                    return;
                }
            }
            EditText editText = new EditText(context);
            this.f = editText;
            editText.setText(this.b.getText());
            this.f.setFocusable(true);
            EditText editText2 = this.f;
            int i3 = this.i;
            if (i3 != 0) {
                editText2.setInputType(i3 == 4 ? 524288 : 3);
                AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(this.g).setView(this.f).setMessage(this.h).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
                alertDialogCreate.setOnShowListener(new cxbg(this, context));
                alertDialogCreate.show();
                return;
            }
            throw null;
        }
        throw null;
    }
}
