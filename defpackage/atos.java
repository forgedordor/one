package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atos implements atsk {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleGroupManagement");
    private static final aucx c;
    private static final aucx d;
    private static final aucx e;
    private static final aucx f;

    static {
        aucw aucwVar = (aucw) aucx.a.createBuilder();
        aucwVar.copyOnWrite();
        aucx aucxVar = (aucx) aucwVar.instance;
        aucxVar.b |= 1;
        aucxVar.c = false;
        c = (aucx) aucwVar.build();
        aucw aucwVar2 = (aucw) aucx.a.createBuilder();
        aucwVar2.copyOnWrite();
        aucx aucxVar2 = (aucx) aucwVar2.instance;
        aucxVar2.b |= 1;
        aucxVar2.c = true;
        avoe avoeVar = avoe.NONE;
        aucwVar2.copyOnWrite();
        aucx aucxVar3 = (aucx) aucwVar2.instance;
        aucxVar3.d = avoeVar.a();
        aucxVar3.b |= 2;
        d = (aucx) aucwVar2.build();
        aucw aucwVar3 = (aucw) aucx.a.createBuilder();
        aucwVar3.copyOnWrite();
        aucx aucxVar4 = (aucx) aucwVar3.instance;
        aucxVar4.b |= 1;
        aucxVar4.c = true;
        avoe avoeVar2 = avoe.RCS_GROUP_SELF_ONLY;
        aucwVar3.copyOnWrite();
        aucx aucxVar5 = (aucx) aucwVar3.instance;
        aucxVar5.d = avoeVar2.a();
        aucxVar5.b |= 2;
        e = (aucx) aucwVar3.build();
        aucw aucwVar4 = (aucw) aucx.a.createBuilder();
        aucwVar4.copyOnWrite();
        aucx aucxVar6 = (aucx) aucwVar4.instance;
        aucxVar6.b |= 1;
        aucxVar6.c = true;
        avoe avoeVar3 = avoe.RCS_GROUP_NOT_FOUND;
        aucwVar4.copyOnWrite();
        aucx aucxVar7 = (aucx) aucwVar4.instance;
        aucxVar7.d = avoeVar3.a();
        aucxVar7.b |= 2;
        f = (aucx) aucwVar4.build();
    }

    private static void b(String str, atrj atrjVar) {
        ekrw ekrwVarN = b.n();
        ekrwVarN.X(cqnc.r, atrjVar.f().toString());
        ekrwVarN.X(cqnc.N, atrjVar.o());
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateErrorStateConverter", "logExistingErrorState", 242, "GroupFullStateErrorStateConverter.java")).D("#%s existing error state %s", str, atrjVar.d().name());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01af  */
    @Override // defpackage.atsk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.auey a(java.lang.Object r11, defpackage.atrj r12) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atos.a(java.lang.Object, atrj):auey");
    }
}
