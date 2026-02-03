package defpackage;

import android.R;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.messagedetails.MessageDetailsActivity;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afkr implements efzm {
    final /* synthetic */ afks a;

    public afkr(afks afksVar) {
        this.a = afksVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        efwo efwoVarA = efzkVar.a();
        efwoVarA.getClass();
        MessageDetailsActivity messageDetailsActivity = this.a.b;
        Intent intent = messageDetailsActivity.getIntent();
        intent.getClass();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("mapi_conversation_id", ConversationId.class) : intent.getParcelableExtra("mapi_conversation_id");
        parcelableExtra.getClass();
        ConversationId conversationId = (ConversationId) parcelableExtra;
        Intent intent2 = messageDetailsActivity.getIntent();
        intent2.getClass();
        Parcelable parcelableExtra2 = Build.VERSION.SDK_INT > 33 ? (Parcelable) intent2.getParcelableExtra("MESSAGE_ID", MessageId.class) : intent2.getParcelableExtra("MESSAGE_ID");
        parcelableExtra2.getClass();
        afku afkuVar = new afku();
        eyhj.e(afkuVar);
        ehok.b(afkuVar, efwoVarA);
        Bundle bundle = afkuVar.m;
        bundle.getClass();
        vwp.b(bundle, vwo.a);
        bundle.putParcelable("mapi_conversation_id", conversationId);
        bundle.putParcelable("MESSAGE_ID", (MessageId) parcelableExtra2);
        cg cgVar = new cg(messageDetailsActivity.a());
        cgVar.x(R.id.content, afkuVar, "MessageDetailsFragment");
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        ekrw ekrwVarI = afks.a.i();
        ekrwVarI.X(eksq.a, "MessageDetails");
        ((ekrd) ((ekrd) ekrwVarI).g(efygVar).h("com/google/android/apps/messaging/messagedetails/MessageDetailsActivityPeer$AccountSelectionCallback", "onNoAccountAvailable", 92, "MessageDetailsActivityPeer.kt")).q("Cannot create MessageDetailsActivity because account is not available");
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
