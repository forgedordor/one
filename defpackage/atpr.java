package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atpr implements atsk {
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
        if ((audcVar.d & 16384) != 0) {
            audg audgVar = audcVar.v;
            if (audgVar == null) {
                audgVar = audg.a;
            }
            audg audgVar2 = audg.a;
            if (!audgVar.equals(audgVar2)) {
                ekrw ekrwVarN = a.n();
                ekrwVarN.X(cqnc.s, atrjVar.f());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventEncryptionStatusConverter", "toGroupUpdate", 54, "GroupEventEncryptionStatusConverter.java")).q("Received a GroupEvent with opaque data, creating GroupUpdate");
                audg audgVar3 = audcVar.v;
                if (audgVar3 != null) {
                    audgVar2 = audgVar3;
                }
                auexVar.copyOnWrite();
                auey aueyVar2 = (auey) auexVar.instance;
                audgVar2.getClass();
                aueyVar2.m = audgVar2;
                aueyVar2.b |= 1024;
                return (auey) auexVar.build();
            }
        }
        return (auey) auexVar.build();
    }
}
