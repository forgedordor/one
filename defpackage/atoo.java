package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atoo implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        ejwl.b(audkVar.d.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar = audkVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.b(aubpVar.equals(aubpVarB), "Group destination endpoint should always be of type GROUP");
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audkVar.d;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        String strN = atrjVar.n();
        aubq aubqVar2 = audkVar.f;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        if (!strN.equals(aubqVar2.d)) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateEndpointConverter", "toGroupUpdate", 56, "GroupFullStateEndpointConverter.java")).q("Detected change of the RCS conference URI");
            aucq aucqVar = (aucq) aucr.a.createBuilder();
            aubq aubqVar3 = audkVar.f;
            if (aubqVar3 == null) {
                aubqVar3 = aubq.a;
            }
            aucqVar.copyOnWrite();
            aucr aucrVar = (aucr) aucqVar.instance;
            aubqVar3.getClass();
            aucrVar.c = aubqVar3;
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
