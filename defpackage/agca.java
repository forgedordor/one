package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agca implements afyw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler");
    private final Context b;
    private final fcsu c;

    public agca(Context context, fcsu fcsuVar) {
        fcsuVar.getClass();
        this.b = context;
        this.c = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        agbs agbsVar = ((agbq) afzvVar).a;
        boolean z = agbsVar.e;
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "Bugle");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 50, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
        Context context = this.b;
        Activity activityA = daiy.a(context);
        if (activityA == 0) {
            throw new IllegalArgumentException("ConversationNavigationHandler must be created with an activity context.");
        }
        Object objH = activityA instanceof ehlg ? ((ehlg) activityA).H() : null;
        if ((objH instanceof afid) && ((Boolean) ctif.a.e()).booleanValue() && !z) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "Bugle");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 58, "Conversation.kt")).t("Navigating w/main activity fragment host, RBM: %s", false);
            ((afid) objH).a(agbsVar);
        } else {
            ekrw ekrwVarH3 = ekrgVar.h();
            ekrwVarH3.X(ekrzVar, "Bugle");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/navigation/targets/ConversationNavigationHandler", "navigate", 61, "Conversation.kt")).t("Navigating w/activity, RBM: %s", Boolean.valueOf(z));
            avmp avmpVar = (avmp) this.c.b();
            ConversationId conversationId = agbsVar.a;
            bato batoVar = new bato(agbsVar.d);
            Bundle bundle = new Bundle();
            if (agbsVar.b) {
                bundle.putBoolean("render_add_recipient_button", true);
            }
            if (agbsVar.c) {
                bundle.putBoolean("delete_empty_conversation_on_back", true);
            }
            int i = agbsVar.g;
            if (i == 2) {
                bundle.putBoolean("via_start_chat_intent", true);
            } else if (i == 3) {
                bundle.putBoolean("via_share_intent", true);
            }
            avmpVar.F(context, conversationId, batoVar, bundle, Optional.empty());
        }
        if (agbsVar.f) {
            activityA.finish();
        }
        return fctx.a;
    }
}
