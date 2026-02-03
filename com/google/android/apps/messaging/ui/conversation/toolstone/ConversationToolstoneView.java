package com.google.android.apps.messaging.ui.conversation.toolstone;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.baeb;
import defpackage.cpdw;
import defpackage.cwuh;
import defpackage.fcsu;
import defpackage.fdbk;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationToolstoneView extends cwuh {
    public fcsu a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationToolstoneView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        new cpdw(this, R.id.toolstone_stub, R.id.toolstone_inflated);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationToolstoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        fcsu fcsuVar = this.a;
        if (fcsuVar == null) {
            fdbq.c("conversationMessageDataFactory");
            fcsuVar = null;
        }
        ((baeb) fcsuVar.b()).a();
    }

    public /* synthetic */ ConversationToolstoneView(Context context, AttributeSet attributeSet, int i, fdbk fdbkVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
