package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atsm implements atru {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor");
    public final attm a;
    public final atuo b;
    private final fdjx d;

    public atsm(attm attmVar, atuo atuoVar, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = attmVar;
        this.b = atuoVar;
        this.d = fdjxVar;
    }

    @Override // defpackage.atru
    public final eiju a(ConversationIdType conversationIdType, auey aueyVar) {
        aueyVar.getClass();
        audr audrVar = aueyVar.h;
        if (audrVar == null) {
            audrVar = audr.a;
        }
        audr audrVar2 = audrVar;
        audrVar2.getClass();
        if (fdbq.f(audr.a, audrVar2)) {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor", "process", 39, "IconUrlMetadataProcessor.kt")).q("No changes to the icon URL in the group notification");
            eiju eijuVarE = eijx.e(cbcw.i());
            eijuVarE.getClass();
            return eijuVarE;
        }
        if (audrVar2.d) {
            String str = audrVar2.c;
            str.getClass();
            if (str.length() != 0) {
                throw new IllegalArgumentException("When the icon URL deleted flag is true the icon URL field must be empty");
            }
        }
        ekrw ekrwVarE2 = c.e();
        ekrwVarE2.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar2 = (ekrd) ekrwVarE2;
        ekrdVar2.X(cqnc.s, conversationIdType);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor", "process", 50, "IconUrlMetadataProcessor.kt")).q("Updating icon URL");
        return auvw.c(this.d, fcyi.a, fdjz.a, new atsl(this, aueyVar, conversationIdType, audrVar2, null));
    }
}
