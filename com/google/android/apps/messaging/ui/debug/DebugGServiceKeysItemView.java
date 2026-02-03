package com.google.android.apps.messaging.ui.debug;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cxax;
import defpackage.cxay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugGServiceKeysItemView extends LinearLayout implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener, View.OnLongClickListener {
    public EditText a;
    private TextView b;
    private TextView c;
    private Switch d;
    private String e;
    private String f;
    private cxay g;

    public DebugGServiceKeysItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, defpackage.cxay r10) {
        /*
            r5 = this;
            r5.g = r10
            r5.e = r6
            r5.f = r7
            android.widget.TextView r10 = r5.b
            r10.setText(r6)
            android.widget.TextView r10 = r5.b
            r0 = 0
            r10.setTypeface(r0, r9)
            int r9 = r7.hashCode()
            r10 = 4
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            switch(r9) {
                case -891985903: goto L46;
                case 104431: goto L3c;
                case 3029738: goto L32;
                case 3327612: goto L28;
                case 97526364: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L50
        L1e:
            java.lang.String r9 = "float"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L50
            r9 = r10
            goto L51
        L28:
            java.lang.String r9 = "long"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L50
            r9 = r0
            goto L51
        L32:
            java.lang.String r9 = "bool"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L50
            r9 = r3
            goto L51
        L3c:
            java.lang.String r9 = "int"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L50
            r9 = r1
            goto L51
        L46:
            java.lang.String r9 = "string"
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L50
            r9 = r2
            goto L51
        L50:
            r9 = -1
        L51:
            r4 = 8
            if (r9 == 0) goto L85
            if (r9 == r2) goto L75
            if (r9 == r1) goto L75
            if (r9 == r0) goto L75
            if (r9 == r10) goto L75
            android.widget.TextView r8 = r5.c
            r8.setVisibility(r4)
            android.widget.Switch r8 = r5.d
            r8.setVisibility(r4)
            java.lang.String r8 = "Unexpected keytype: "
            java.lang.String r9 = " key: "
            java.lang.String r6 = defpackage.a.n(r6, r7, r8, r9)
            java.lang.String r7 = "Bugle"
            defpackage.cqca.f(r7, r6)
            return
        L75:
            android.widget.TextView r6 = r5.c
            r6.setVisibility(r3)
            android.widget.Switch r6 = r5.d
            r6.setVisibility(r4)
            android.widget.TextView r6 = r5.c
            r6.setText(r8)
            return
        L85:
            android.widget.Switch r6 = r5.d
            r6.setVisibility(r3)
            android.widget.TextView r6 = r5.c
            r6.setVisibility(r4)
            android.widget.Switch r6 = r5.d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            boolean r7 = r7.booleanValue()
            r6.setChecked(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.debug.DebugGServiceKeysItemView.a(java.lang.String, java.lang.String, java.lang.String, boolean, cxay):void");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.g.a(this.e, this.f, String.valueOf(z));
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.g.a(this.e, this.f, this.a.getText().toString());
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.text_value);
        this.d = (Switch) findViewById(R.id.switch_button);
        setOnClickListener(this);
        this.d.setOnCheckedChangeListener(this);
        setOnLongClickListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder(this.b.getText());
        sb.append(":");
        if (this.f.equals("bool")) {
            sb.append(this.d.isChecked());
        } else {
            sb.append(this.c.getText());
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("P/H flag", sb.toString()));
        return true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if ("bool".equals(this.f)) {
            return;
        }
        Context context = getContext();
        EditText editText = new EditText(context);
        this.a = editText;
        editText.setText(this.c.getText());
        this.a.setFocusable(true);
        if ("int".equals(this.f)) {
            this.a.setInputType(3);
        } else {
            this.a.setInputType(524288);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(this.e).setView(this.a).setPositiveButton(android.R.string.ok, this).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.setOnShowListener(new cxax(this, context));
        alertDialogCreate.show();
    }
}
