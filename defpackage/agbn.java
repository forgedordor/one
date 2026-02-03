package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbn implements afyw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler");
    private final Context b;

    public agbn(Context context) {
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        Activity activityA = daiy.a(this.b);
        if (activityA == 0) {
            throw new IllegalArgumentException("CloseConversationNavigationHandler must be created with an activity context.");
        }
        Object objH = activityA instanceof ehlg ? ((ehlg) activityA).H() : null;
        if (objH instanceof afid) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 51, "CloseConversation.kt")).q("Invoking onFinishCurrentConversation on conversation host");
            ((afid) objH).b();
        } else {
            ((ekrd) a.h().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 54, "CloseConversation.kt")).q("Dispatching Close Conversation event.");
            einf.e(agbm.a, activityA);
        }
        return fctx.a;
    }
}
