package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvb extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ wvc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvb(wvc wvcVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = wvcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wvb wvbVar = new wvb(this.d, (fcxy) obj3);
        wvbVar.b = (ajlk) obj;
        wvbVar.c = (ekgb) obj2;
        return wvbVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r9 = this.b;
            ?? r1 = this.c;
            wvc wvcVar = this.d;
            if (!wvc.b(r9)) {
                ekrw ekrwVarG = wvc.a.g();
                ekrwVarG.X(eksq.a, "BugleMentions");
                ekrd ekrdVar = (ekrd) ekrwVarG;
                ekrdVar.X(cqnc.t, r9.d());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/DefaultMentionSuggestionsResolver$mentionTrie$2$2", "invokeSuspend", 61, "DefaultMentionSuggestionsResolver.kt")).q("Conversation doesn't support mentions, generating empty MentionTrie");
                return cimb.a;
            }
            wvx wvxVar = wvcVar.c;
            ConversationId conversationIdD = r9.d();
            conversationIdD.getClass();
            this.b = null;
            this.a = 1;
            ekrw ekrwVarG2 = wvx.a.g();
            ekrwVarG2.X(eksq.a, "BugleMentions");
            ekrd ekrdVar2 = (ekrd) ekrwVarG2;
            ekrdVar2.X(cqnc.t, conversationIdD);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/mentions/MentionTrieFactory", "create", 30, "MentionTrieFactory.kt")).r("Generating MentionTrie with %d recipients", r1.size());
            obj = eicj.a(wvxVar.b, new wvw(r1, null), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return (cimb) obj;
    }
}
