package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import defpackage.elrk;
import defpackage.ull;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationStartView extends ull {
    public ContactIconView a;

    public ConversationStartView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        inflate(getContext(), R.layout.conversation_start_view, this);
        this.a = (ContactIconView) findViewById(R.id.contact_icon);
        this.a.q = elrk.BIZINFO_SOURCE_CONVERSATION_START;
    }

    public ConversationStartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public ConversationStartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}
