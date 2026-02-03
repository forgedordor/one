package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aton implements atsk {
    private static final eksp a = eksp.c("BugleGroupManagement");
    private final fcsu b;

    public aton(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.atsk
    public final /* bridge */ /* synthetic */ auey a(Object obj, atrj atrjVar) {
        audk audkVar = (audk) obj;
        if (!((arob) this.b.b()).a()) {
            return auey.a;
        }
        ejwl.b(audkVar.d.equals(atrjVar.o()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        auex auexVar = (auex) auey.a.createBuilder();
        String str = audkVar.d;
        auexVar.copyOnWrite();
        auey aueyVar = (auey) auexVar.instance;
        str.getClass();
        aueyVar.b |= 1;
        aueyVar.c = str;
        if ((audkVar.c & 2048) != 0) {
            audg audgVar = audkVar.p;
            if (audgVar == null) {
                audgVar = audg.a;
            }
            audg audgVar2 = audg.a;
            if (!audgVar.equals(audgVar2)) {
                ekrw ekrwVarN = a.n();
                ekrwVarN.X(cqnc.s, atrjVar.f());
                ekrwVarN.X(cqnc.N, atrjVar.o());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateEncryptionStatusConverter", "toGroupUpdate", 65, "GroupFullStateEncryptionStatusConverter.java")).q("Received a GroupFullState with opaque data, creating GroupUpdate");
                audg audgVar3 = audkVar.p;
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
