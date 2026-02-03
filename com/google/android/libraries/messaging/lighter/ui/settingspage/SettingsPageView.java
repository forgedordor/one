package com.google.android.libraries.messaging.lighter.ui.settingspage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dwyh;
import defpackage.dxdq;
import defpackage.dxdr;
import defpackage.dxdt;
import defpackage.eehg;
import defpackage.fbfm;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SettingsPageView extends LinearLayout implements dxdr {
    public final Switch a;
    private final TextView b;
    private final Toolbar c;

    public SettingsPageView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dwye
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final dxdt dxdtVar = (dxdt) obj;
        this.a.setOnClickListener(new View.OnClickListener() { // from class: dxdu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dxdtVar.a(this.a.a.isChecked());
            }
        });
        this.c.t(new View.OnClickListener() { // from class: dxdv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public SettingsPageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SettingsPageView(Context context, AttributeSet attributeSet, int i) {
        super(dwyh.a(context, fbfm.i()), attributeSet, i);
        inflate(getContext(), R.layout.settings_page_layout, this);
        Switch r5 = (Switch) findViewById(R.id.read_receipt_switch_button);
        this.a = r5;
        TextView textView = (TextView) findViewById(R.id.read_receipt_description);
        this.b = textView;
        this.c = (Toolbar) findViewById(R.id.toolbar);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dxdq.a, i, R.style.LighterSettingsPageView);
        setBackgroundResource(typedArrayObtainStyledAttributes.getResourceId(0, 0));
        setBackgroundColor(eehg.b(this, R.attr.colorSurface));
        r5.setTextColor(typedArrayObtainStyledAttributes.getColor(2, eehg.b(this, R.attr.colorOnSurface)));
        textView.setTextColor(typedArrayObtainStyledAttributes.getColor(1, eehg.b(this, R.attr.colorOnSurfaceVariant)));
        typedArrayObtainStyledAttributes.recycle();
    }
}
