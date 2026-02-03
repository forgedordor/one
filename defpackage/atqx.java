package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atqx implements atru {
    public static final eksp a = eksp.c("BugleGroupManagement");
    private final attm b;
    private final eosc c;

    public atqx(attm attmVar, eosc eoscVar) {
        this.b = attmVar;
        this.c = eoscVar;
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, auey aueyVar) {
        final aucr aucrVar = aueyVar.d;
        if (aucrVar == null) {
            aucrVar = aucr.a;
        }
        return aucr.a.equals(aucrVar) ? eijx.e(cbcw.i()) : this.b.h(conversationIdType).h(new ejvr() { // from class: atqw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                atrj atrjVar = (atrj) obj;
                ekrw ekrwVarN = atqx.a.n();
                ekrwVarN.X(cqnc.r, atrjVar.f().toString());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/EndpointMetadataProcessor", "process", 56, "EndpointMetadataProcessor.java")).q("Updating the RCS conference URI");
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("EndpointMetadataProcessor#process");
                aubq aubqVar = aucrVar.c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                boteVar.N(aubqVar.d);
                boteVar.f(conversationIdType2);
                return cbcw.i();
            }
        }, this.c);
    }
}
