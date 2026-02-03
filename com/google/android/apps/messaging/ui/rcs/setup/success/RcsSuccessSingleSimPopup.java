package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.czui;
import defpackage.czus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSuccessSingleSimPopup extends czui {
    public RcsSuccessSingleSimPopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.rcs_success_single_sim_popup, (ViewGroup) this, true);
    }

    @Override // defpackage.czui
    protected final View a() {
        return findViewById(R.id.rcs_success_dismiss_button);
    }

    @Override // defpackage.czui
    public final void b() {
        TextView textView = (TextView) findViewById(R.id.rcs_success_title);
        TextView textView2 = (TextView) findViewById(R.id.rcs_success_body);
        textView.setText(((czus) this.a).m);
        textView2.setText(((czus) this.a).n);
        this.a.h(textView2);
    }
}
