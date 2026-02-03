package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atom implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final cigc b;

    public atom(cigc cigcVar) {
        this.b = cigcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        ejwl.b(audkVar.d.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        aucm aucmVar = (aucm) aucn.a.createBuilder();
        ekhv ekhvVar = new ekhv();
        ekgb ekgbVarC = atrjVar.h().c();
        int size = ekgbVarC.size();
        for (int i = 0; i < size; i++) {
            ekhvVar.c((aucp) this.b.fH().fM((ciga) ekgbVarC.get(i)));
        }
        ekhx ekhxVarG = ekhvVar.g();
        ekhx ekhxVarO = ekhx.o(new evsz(audkVar.g, audk.a));
        ekqg it = ekpg.b(ekhxVarO, ekhxVarG).iterator();
        while (it.hasNext()) {
            aucp aucpVar = (aucp) it.next();
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 68, "GroupFullStateCapabilitiesConverter.java")).t("Found a server capability not present on the client. Generating add capability GroupOperation: %s", aucpVar);
            auaw auawVar = (auaw) auax.a.createBuilder();
            auawVar.copyOnWrite();
            auax auaxVar = (auax) auawVar.instance;
            auaxVar.c = aucpVar.g;
            auaxVar.b |= 1;
            aucmVar.a(auawVar);
        }
        ekqg it2 = ekpg.b(ekhxVarG, ekhxVarO).iterator();
        while (it2.hasNext()) {
            aucp aucpVar2 = (aucp) it2.next();
            ekrw ekrwVarN2 = a.n();
            ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN2.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateCapabilitiesConverter", "toGroupUpdate", 84, "GroupFullStateCapabilitiesConverter.java")).t("Found a client capability not present on the server. Generating remove capability GroupOperation: %s", aucpVar2);
            augb augbVar = (augb) augc.a.createBuilder();
            augbVar.copyOnWrite();
            augc augcVar = (augc) augbVar.instance;
            augcVar.c = aucpVar2.g;
            augcVar.b |= 1;
            aucmVar.b(augbVar);
        }
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audkVar.d;
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
