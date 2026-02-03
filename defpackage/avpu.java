package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avpu implements ciol {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/conversation/match/ConversationMatcherCacheClearer");
    private final fdjx b;

    public avpu(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
    }

    @Override // defpackage.ciol
    public final eiju a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.i(this.b, new avpt(conversationIdType, null));
    }
}
