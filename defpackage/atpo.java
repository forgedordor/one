package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpo implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        ejwl.b(audkVar.d.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audkVar.d;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        if ((audkVar.c & 16) == 0) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 58, "GroupFullStateSubjectConverter.java")).q("Skipping group subject change because subject missing in group full state notification");
            return (auey) auexVar.build();
        }
        auet auetVar = audkVar.i;
        if (auetVar == null) {
            auetVar = auet.a;
        }
        String strM = atrjVar.m();
        String str2 = auetVar.c;
        if (cikv.a(str2, strM, atrjVar.g())) {
            ekrw ekrwVarN2 = a.n();
            ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN2.X(cqnc.N, atrjVar.o());
            ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSubjectConverter", "toGroupUpdate", 75, "GroupFullStateSubjectConverter.java")).D("Server subject (%s) and client subject (%s) do not match. Generating subject update GroupEvent.", str2, strM);
            aueu aueuVar = (aueu) auev.a.createBuilder();
            aueuVar.copyOnWrite();
            auev auevVar = (auev) aueuVar.instance;
            str2.getClass();
            auevVar.b |= 1;
            auevVar.c = str2;
            boolean zIsEmpty = str2.isEmpty();
            aueuVar.copyOnWrite();
            auev auevVar2 = (auev) aueuVar.instance;
            auevVar2.b |= 2;
            auevVar2.d = zIsEmpty;
            aufb aufbVar = auetVar.d;
            if (aufbVar == null) {
                aufbVar = aufb.a;
            }
            aueuVar.copyOnWrite();
            auev auevVar3 = (auev) aueuVar.instance;
            aufbVar.getClass();
            auevVar3.e = aufbVar;
            auevVar3.b |= 4;
            auexVar.copyOnWrite();
            auey aueyVar2 = (auey) auexVar.instance;
            auev auevVar4 = (auev) aueuVar.build();
            auevVar4.getClass();
            aueyVar2.g = auevVar4;
            aueyVar2.b |= 16;
        }
        return (auey) auexVar.build();
    }
}
