package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdno extends fcyz implements fdat {
    final /* synthetic */ Map a;
    final /* synthetic */ Map b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdno(Map map, Map map2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = map;
        this.b = map2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdno) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            ConversationIdType conversationIdType = (ConversationIdType) entry.getKey();
            akbj akbjVar = (akbj) entry.getValue();
            if (fdbq.f(akbjVar, this.b.get(conversationIdType))) {
                ekrw ekrwVarE = cdoa.a.e();
                ekrwVarE.X(eksq.a, "BugleTrustedContacts");
                ekrd ekrdVar = (ekrd) ekrwVarE;
                ekrdVar.X(cqnc.S, "ParentAllowlistUpdateHandler");
                ekrdVar.X(cqnc.s, conversationIdType);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$findConversationsNeedUpdateV3$2", "invokeSuspend", 358, "ParentAllowlistUpdateHandler.kt")).q("No conversation parent state update on this conversation.");
            } else {
                akbk akbkVar = akbjVar.a;
                if (akbkVar == akbk.b) {
                    ekrw ekrwVarE2 = cdoa.a.e();
                    ekrwVarE2.X(eksq.a, "BugleTrustedContacts");
                    ekrd ekrdVar2 = (ekrd) ekrwVarE2;
                    ekrdVar2.X(cqnc.S, "ParentAllowlistUpdateHandler");
                    ekrdVar2.X(cqnc.s, conversationIdType);
                    ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$findConversationsNeedUpdateV3$2", "invokeSuspend", 367, "ParentAllowlistUpdateHandler.kt")).q("Conversation is trusted by parents.");
                    hashSet.add(conversationIdType);
                } else {
                    ekrw ekrwVarE3 = cdoa.a.e();
                    ekrwVarE3.X(eksq.a, "BugleTrustedContacts");
                    ekrd ekrdVar3 = (ekrd) ekrwVarE3;
                    ekrdVar3.X(cqnc.S, "ParentAllowlistUpdateHandler");
                    ekrdVar3.X(cqnc.s, conversationIdType);
                    ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/kids/handler/ParentAllowlistUpdateHandler$findConversationsNeedUpdateV3$2", "invokeSuspend", 374, "ParentAllowlistUpdateHandler.kt")).t("Conversation is not trusted by parents with supervision state: %s", akbkVar.name());
                    map.put(conversationIdType, akbjVar);
                }
            }
        }
        return new cdnl(hashSet, map);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdno(this.a, this.b, fcxyVar);
    }
}
