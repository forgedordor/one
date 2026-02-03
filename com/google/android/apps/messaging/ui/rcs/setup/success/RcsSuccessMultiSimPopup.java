package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.crny;
import defpackage.czui;
import defpackage.czus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSuccessMultiSimPopup extends czui {
    public RcsSuccessMultiSimPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.rcs_success_multi_sim_popup, (ViewGroup) this, true);
    }

    @Override // defpackage.czui
    protected final View a() {
        return findViewById(R.id.rcs_success_msim_dismiss_button);
    }

    @Override // defpackage.czui
    protected final void b() {
        TextView textView = (TextView) findViewById(R.id.rcs_success_msim_index);
        TextView textView2 = (TextView) findViewById(R.id.rcs_success_msim_display_name);
        TextView textView3 = (TextView) findViewById(R.id.rcs_success_msim_title);
        TextView textView4 = (TextView) findViewById(R.id.rcs_success_msim_body);
        textView.setText(((czus) this.a).k);
        czus czusVar = (czus) this.a;
        if (czusVar.l == null) {
            czusVar.l = ((crny) czusVar.d.b()).k().r();
        }
        textView2.setText(czusVar.l);
        textView3.setText(((czus) this.a).m);
        textView4.setText(((czus) this.a).n);
        this.a.h(textView4);
    }
}
