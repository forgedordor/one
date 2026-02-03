package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpv implements atsk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter");
    private final fcsu b;

    public atpv(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.atsk
    public final /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audc audcVar = (audc) obj;
        audcVar.getClass();
        if (!((area) this.b.b()).a()) {
            auey aueyVar = auey.a;
            aueyVar.getClass();
            return aueyVar;
        }
        if (!fdbq.f(audcVar.e, atrjVar.o())) {
            throw new IllegalArgumentException("Mismatch between the RCS conversation Id from the GroupEvent and ConversationsTable");
        }
        auex auexVar = (auex) auey.a.createBuilder();
        auexVar.getClass();
        String str = audcVar.e;
        str.getClass();
        auez.b(str, auexVar);
        auey aueyVarA = auez.a(auexVar);
        if (audcVar.m) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarE;
            ekrdVar.X(cqnc.s, atrjVar.f());
            ekrdVar.X(cqnc.N, atrjVar.o());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter", "toGroupUpdate", 53, "GroupEventIconUrlConverter.kt")).q("Received a GroupEvent with icon URL deleted from the server.");
            auex auexVar2 = (auex) aueyVarA.toBuilder();
            auexVar2.getClass();
            audq audqVar = (audq) audr.a.createBuilder();
            audqVar.getClass();
            auds.d(true, audqVar);
            aufb aufbVar = audcVar.r;
            if (aufbVar == null) {
                aufbVar = aufb.a;
            }
            aufbVar.getClass();
            auds.b(aufbVar, audqVar);
            auez.c(auds.a(audqVar), auexVar2);
            return auez.a(auexVar2);
        }
        if ((audcVar.d & 64) == 0) {
            return aueyVarA;
        }
        ekrw ekrwVarE2 = a.e();
        ekrwVarE2.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar2 = (ekrd) ekrwVarE2;
        ekrdVar2.X(cqnc.s, atrjVar.f());
        ekrdVar2.X(cqnc.N, atrjVar.o());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventIconUrlConverter", "toGroupUpdate", 68, "GroupEventIconUrlConverter.kt")).q("Received a GroupEvent with an icon URL update from the server.");
        auex auexVar3 = (auex) aueyVarA.toBuilder();
        auexVar3.getClass();
        audq audqVar2 = (audq) audr.a.createBuilder();
        audqVar2.getClass();
        String str2 = audcVar.n;
        str2.getClass();
        auds.c(str2, audqVar2);
        aufb aufbVar2 = audcVar.r;
        if (aufbVar2 == null) {
            aufbVar2 = aufb.a;
        }
        aufbVar2.getClass();
        auds.b(aufbVar2, audqVar2);
        auez.c(auds.a(audqVar2), auexVar3);
        return auez.a(auexVar3);
    }
}
