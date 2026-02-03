package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atqp implements atsk {
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
        if (audcVar.k) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.r, atrjVar.f().toString());
            ekrwVarN.X(cqnc.N, atrjVar.o());
            ekrwVarN.X(cqnc.J, atrjVar.m());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 51, "GroupEventSubjectConverter.java")).q("Received a GroupEvent with subject deleted from the server.");
            aueu aueuVar = (aueu) auev.a.createBuilder();
            aueuVar.copyOnWrite();
            auev auevVar = (auev) aueuVar.instance;
            auevVar.b |= 2;
            auevVar.d = true;
            aufb aufbVar = audcVar.r;
            if (aufbVar == null) {
                aufbVar = aufb.a;
            }
            aueuVar.copyOnWrite();
            auev auevVar2 = (auev) aueuVar.instance;
            aufbVar.getClass();
            auevVar2.e = aufbVar;
            auevVar2.b |= 4;
            auexVar.copyOnWrite();
            auey aueyVar2 = (auey) auexVar.instance;
            auev auevVar3 = (auev) aueuVar.build();
            auevVar3.getClass();
            aueyVar2.g = auevVar3;
            aueyVar2.b |= 16;
            return (auey) auexVar.build();
        }
        if ((audcVar.d & 16) == 0) {
            return (auey) auexVar.build();
        }
        ekrw ekrwVarN2 = a.n();
        ekrwVarN2.X(cqnc.r, atrjVar.f().toString());
        ekrwVarN2.X(cqnc.N, atrjVar.o());
        ekrwVarN2.X(cqnc.J, atrjVar.m());
        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSubjectConverter", "toGroupUpdate", 69, "GroupEventSubjectConverter.java")).t("Received a GroupEvent with a Subject update from the server. Updated subject: %s", audcVar.l);
        aueu aueuVar2 = (aueu) auev.a.createBuilder();
        String str2 = audcVar.l;
        aueuVar2.copyOnWrite();
        auev auevVar4 = (auev) aueuVar2.instance;
        str2.getClass();
        auevVar4.b |= 1;
        auevVar4.c = str2;
        aufb aufbVar2 = audcVar.r;
        if (aufbVar2 == null) {
            aufbVar2 = aufb.a;
        }
        aueuVar2.copyOnWrite();
        auev auevVar5 = (auev) aueuVar2.instance;
        aufbVar2.getClass();
        auevVar5.e = aufbVar2;
        auevVar5.b |= 4;
        auexVar.copyOnWrite();
        auey aueyVar3 = (auey) auexVar.instance;
        auev auevVar6 = (auev) aueuVar2.build();
        auevVar6.getClass();
        aueyVar3.g = auevVar6;
        aueyVar3.b |= 16;
        return (auey) auexVar.build();
    }
}
