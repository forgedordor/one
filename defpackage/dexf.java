package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dexf implements dfhz {
    final /* synthetic */ dexn a;

    public dexf(dexn dexnVar) {
        this.a = dexnVar;
    }

    @Override // defpackage.dfhz
    public final void a(dgyx dgyxVar, long j, String str) {
        String str2;
        ArrayList<ConversationSuggestion> arrayList;
        if (!dgyxVar.q) {
            dhja.q("Discarding incoming RBM Suggestions for container message id '%s' in a P2P session. This is a violation of the RCS spec by the RCS platform. ", dgyxVar.m);
        }
        dexn dexnVar = this.a;
        String strR = dexn.r(dgyxVar);
        if (dhim.e(dgyxVar.h, "application/vnd.gsma.botsuggestion.v1.0+json")) {
            str2 = dgyxVar.m;
            if (TextUtils.isEmpty(str2)) {
                dhja.r(dexn.d, "Ignoring suggested chip list without container message ID: %s", dgyxVar.k);
                return;
            }
            if (dgyxVar.f == null) {
                dhja.r(dexn.d, "Can't parse suggestions, InstantMessage content is null", new Object[0]);
                return;
            }
            arrayList = new ConversationSuggestionsJsonParser().parse(ejwk.b(dgyxVar.a()));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConversationSuggestion conversationSuggestion = arrayList.get(i);
                conversationSuggestion.setRcsMessageId(strR);
                conversationSuggestion.setTargetRcsMessageId(str2);
            }
        } else {
            str2 = null;
            arrayList = null;
        }
        if (Objects.isNull(arrayList) || dhic.a(arrayList) || TextUtils.isEmpty(str2)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, arrayList);
        bundle.putString(RcsIntents.EXTRA_USER_ID, str);
        basd.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, basd.a(strR));
        basd.h(bundle, RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID, basd.a(str2));
        dhjm.c(dexnVar.h, RcsIntents.ACTION_INCOMING_CONVERSATION_SUGGESTIONS_MESSAGE, bundle, dhjl.IMS_CHAT_SESSION_PROVIDER);
    }
}
