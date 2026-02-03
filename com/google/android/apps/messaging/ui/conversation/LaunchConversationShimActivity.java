package com.google.android.apps.messaging.ui.conversation;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.ajso;
import defpackage.avmp;
import defpackage.cvmz;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LaunchConversationShimActivity extends cvmz {
    public avmp a;
    public fcsu b;

    @Override // defpackage.cvmz, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ConversationId conversationIdA = ((ajso) this.b.b()).a(intent);
        if (conversationIdA != null) {
            startActivity(this.a.q(this, conversationIdA, (MessageCoreData) intent.getParcelableExtra("draft_data"), intent.getBooleanExtra("open_keyboard", false), intent.getExtras()));
        }
        finish();
    }
}
