package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.bagf;
import defpackage.bagg;
import defpackage.einb;
import defpackage.einm;
import defpackage.uqu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSettingsOptionItemView extends uqu {
    public TextView a;
    public TextView b;
    public SwitchCompat c;
    public bagf d;
    public bagg e;
    public einm f;

    /* compiled from: PG */
    public final class a implements einb {
        public final bagf a;

        public a(bagf bagfVar) {
            this.a = bagfVar;
        }
    }

    public ConversationSettingsOptionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (SwitchCompat) findViewById(R.id.switch_button);
        bagf bagfVarA = this.e.a(getContext());
        this.d = bagfVarA;
        this.f.b(this, new a(bagfVarA));
    }
}
