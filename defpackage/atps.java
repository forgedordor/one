package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atps implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audc audcVar = (audc) obj;
        ejwl.b(audcVar.e.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audcVar.e;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        aubq aubqVar = aubq.a;
        aubq aubqVar2 = audcVar.q;
        if (aubqVar2 == null) {
            aubqVar2 = aubqVar;
        }
        if (aubqVar.equals(aubqVar2)) {
            return (auey) auexVar.build();
        }
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar3 = audcVar.q;
        if (aubqVar3 == null) {
            aubqVar3 = aubqVar;
        }
        aubp aubpVarB = aubp.b(aubqVar3.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.b(aubpVar.equals(aubpVarB), "When present the group destination endpoint should always be of type GROUP");
        String strN = atrjVar.n();
        aubq aubqVar4 = audcVar.q;
        if (aubqVar4 == null) {
            aubqVar4 = aubqVar;
        }
        if (!strN.equals(aubqVar4.d)) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventEndpointConverter", "toGroupUpdate", 59, "GroupEventEndpointConverter.java")).q("Detected change of the RCS conference URI");
            aucq aucqVar = (aucq) aucr.a.createBuilder();
            aubq aubqVar5 = audcVar.q;
            if (aubqVar5 != null) {
                aubqVar = aubqVar5;
            }
            aucqVar.copyOnWrite();
            aucr aucrVar = (aucr) aucqVar.instance;
            aubqVar.getClass();
            aucrVar.c = aubqVar;
            aucrVar.b |= 1;
            auexVar.copyOnWrite();
            auey aueyVar2 = (auey) auexVar.instance;
            aucr aucrVar2 = (aucr) aucqVar.build();
            aucrVar2.getClass();
            aueyVar2.d = aucrVar2;
            aueyVar2.b |= 2;
        }
        return (auey) auexVar.build();
    }
}
