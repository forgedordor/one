package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpq implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audc audcVar = (audc) obj;
        ejwl.b(audcVar.e.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aucm aucmVar = (aucm) aucn.a.createBuilder();
        for (aucp aucpVar : new evsz(audcVar.i, audc.a)) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 53, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to add to the client: %s", aucpVar);
            auaw auawVar = (auaw) auax.a.createBuilder();
            auawVar.copyOnWrite();
            auax auaxVar = (auax) auawVar.instance;
            auaxVar.c = aucpVar.g;
            auaxVar.b |= 1;
            aucmVar.a(auawVar);
        }
        for (aucp aucpVar2 : new evsz(audcVar.j, audc.b)) {
            ekrw ekrwVarN2 = a.n();
            ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN2.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventCapabilitiesConverter", "toGroupUpdate", 66, "GroupEventCapabilitiesConverter.java")).t("Group capability from the server to remove from he client: %s", aucpVar2);
            augb augbVar = (augb) augc.a.createBuilder();
            augbVar.copyOnWrite();
            augc augcVar = (augc) augbVar.instance;
            augcVar.c = aucpVar2.g;
            augcVar.b |= 1;
            aucmVar.b(augbVar);
        }
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audcVar.e;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        auexVar.copyOnWrite();
        auey aueyVar2 = (auey) auexVar.instance;
        aucn aucnVar = (aucn) aucmVar.build();
        aucnVar.getClass();
        aueyVar2.f = aucnVar;
        aueyVar2.b |= 8;
        return (auey) auexVar.build();
    }
}
