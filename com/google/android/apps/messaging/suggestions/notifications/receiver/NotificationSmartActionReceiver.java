package com.google.android.apps.messaging.suggestions.notifications.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.suggestions.notifications.receiver.NotificationSmartActionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajso;
import defpackage.auvh;
import defpackage.avmp;
import defpackage.bajg;
import defpackage.barn;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cufd;
import defpackage.cufo;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.fcsu;
import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NotificationSmartActionReceiver extends cufo {
    private static final cqce i = cqce.g("Bugle", "NotificationSmartActionReceiver");
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    public fcsu h;

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("NotificationSmartActionReceiver Receive broadcast", "com/google/android/apps/messaging/suggestions/notifications/receiver/NotificationSmartActionReceiver", "beginRootTrace", 74);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        cqce cqceVar = i;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("processBroadcast.");
        cqbdVarC.A("intent", intent);
        cqbdVarC.r();
        if ("com.google.android.apps.messaging.accept_suggestion".equals(intent.getAction())) {
            ConversationIdType conversationIdTypeB = barn.b(intent.getStringExtra("conversation_id"));
            ConversationId conversationIdA = ((ajso) this.e.b()).a(intent);
            if (conversationIdA == null) {
                conversationIdA = InvalidConversationId.a;
            }
            final String stringExtra = intent.getStringExtra("suggestion_id");
            cqbd cqbdVarC2 = cqceVar.c();
            cqbdVarC2.I("accepting suggestion");
            cqbdVarC2.A("conversationId", conversationIdTypeB);
            cqbdVarC2.A("suggestionId", stringExtra);
            cqbdVarC2.r();
            if (!conversationIdTypeB.b() && stringExtra != null) {
                eijx.g(new Callable() { // from class: cufp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Optional optionalD = ((crif) this.a.f.b()).d(stringExtra);
                        if (optionalD.isEmpty()) {
                            throw new IllegalStateException("Suggestion to be logged does not exist");
                        }
                        return (SuggestionData) optionalD.get();
                    }
                }, (Executor) this.g.b()).i(new eooz() { // from class: cufq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        NotificationSmartActionReceiver notificationSmartActionReceiver = this.a;
                        SuggestionData suggestionData = (SuggestionData) obj;
                        ((crif) notificationSmartActionReceiver.f.b()).n(suggestionData, ezai.CLICKED);
                        return ((crbi) notificationSmartActionReceiver.d.b()).m(suggestionData, elqn.P2P_SUGGESTION_CLICK, eyzv.NOTIFICATION_VIEW);
                    }
                }, (Executor) this.h.b()).k(auvh.b(), eoqg.a);
                ((cufd) this.b.b()).a.put(conversationIdTypeB, stringExtra);
                ((avmp) this.c.b()).E(context, conversationIdA, new bajg(intent.getExtras()));
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.NotificationSmartActionReceiver.Latency";
    }
}
