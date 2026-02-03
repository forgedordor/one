package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.ajhd;
import defpackage.cpby;
import defpackage.cpch;
import defpackage.dakl;
import defpackage.ehli;
import defpackage.uqq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessTopActionView extends uqq implements View.OnClickListener {
    public cpby a;
    public ajhd b;
    public dakl c;
    public final cpch d;

    /* compiled from: PG */
    public interface a {
        cpch a();
    }

    public BusinessTopActionView(Context context) {
        super(context);
        this.d = ((a) ehli.a(context, a.class)).a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cpby cpbyVar = this.a;
        if (cpbyVar == null) {
            this.b.ak(1, 2, null);
            this.c.i(R.string.business_action_failed_to_launch);
        } else {
            if (!cpbyVar.i()) {
                this.c.i(R.string.business_action_failed_to_launch);
            }
            this.b.ak(this.a.j(), 2, this.a.h());
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
    }

    public BusinessTopActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = ((a) ehli.a(context, a.class)).a();
    }
}
