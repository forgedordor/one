package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atuh implements atru {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor");
    public final cilg b;
    private final attm c;
    private final eosc d;

    public atuh(cilg cilgVar, attm attmVar, eosc eoscVar) {
        this.b = cilgVar;
        this.c = attmVar;
        this.d = eoscVar;
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, auey aueyVar) {
        final auev auevVar = aueyVar.g;
        if (auevVar == null) {
            auevVar = auev.a;
        }
        if (auev.a.equals(auevVar)) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor", "process", 54, "SubjectGroupMetadataProcessor.java")).q("No changes to the subject in the group notification");
            return eijx.e(cbcw.i());
        }
        boolean z = true;
        if (auevVar.d && !auevVar.c.isEmpty()) {
            z = false;
        }
        ejwl.b(z, "When the subject deleted flag is true the subject field must be empty");
        return this.c.h(conversationIdType).i(new eooz() { // from class: atug
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                atrj atrjVar = (atrj) obj;
                ekrw ekrwVarE2 = atuh.a.e();
                ekrwVarE2.X(eksq.a, "BugleGroupManagement");
                ekrd ekrdVar2 = (ekrd) ekrwVarE2;
                ekrz ekrzVar = cqnc.s;
                ConversationIdType conversationIdType2 = conversationIdType;
                ekrdVar2.X(ekrzVar, conversationIdType2);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor", "process", 69, "SubjectGroupMetadataProcessor.java")).q("Updating group subject change");
                cili ciliVar = (cili) cilj.a.createBuilder();
                auev auevVar2 = auevVar;
                String str = auevVar2.c;
                ciliVar.copyOnWrite();
                cilj ciljVar = (cilj) ciliVar.instance;
                str.getClass();
                ciljVar.d = str;
                aufb aufbVar = auevVar2.e;
                if (aufbVar == null) {
                    aufbVar = aufb.a;
                }
                aubq aubqVar = aufbVar.c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                String str2 = aubqVar.d;
                ciliVar.copyOnWrite();
                cilj ciljVar2 = (cilj) ciliVar.instance;
                str2.getClass();
                ciljVar2.g = str2;
                aufb aufbVar2 = auevVar2.e;
                if (aufbVar2 == null) {
                    aufbVar2 = aufb.a;
                }
                evvp evvpVar = aufbVar2.d;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                atuh atuhVar = this.a;
                ciliVar.copyOnWrite();
                cilj ciljVar3 = (cilj) ciliVar.instance;
                evvpVar.getClass();
                ciljVar3.f = evvpVar;
                ciljVar3.b |= 1;
                int iE = atrjVar.e().e();
                ciliVar.copyOnWrite();
                ((cilj) ciliVar.instance).i = iE;
                String strA = conversationIdType2.a();
                ciliVar.copyOnWrite();
                cilj ciljVar4 = (cilj) ciliVar.instance;
                strA.getClass();
                ciljVar4.h = strA;
                return atuhVar.b.c((cilj) ciliVar.build());
            }
        }, this.d);
    }
}
