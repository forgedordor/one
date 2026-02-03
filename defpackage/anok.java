package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anok {
    public static final enkm a(int i, int i2) {
        enkj enkjVar = (enkj) enkm.a.createBuilder();
        enkjVar.getClass();
        int i3 = i2 - 1;
        if (i3 == 1) {
            enkjVar.copyOnWrite();
            enkm enkmVar = (enkm) enkjVar.instance;
            enkmVar.c = 1;
            enkmVar.b |= 1;
        } else if (i3 == 2) {
            enkjVar.copyOnWrite();
            enkm enkmVar2 = (enkm) enkjVar.instance;
            enkmVar2.c = 2;
            enkmVar2.b |= 1;
        } else if (i3 != 3) {
            enkjVar.copyOnWrite();
            enkm enkmVar3 = (enkm) enkjVar.instance;
            enkmVar3.c = 4;
            enkmVar3.b |= 1;
        } else {
            enkjVar.copyOnWrite();
            enkm enkmVar4 = (enkm) enkjVar.instance;
            enkmVar4.c = 3;
            enkmVar4.b |= 1;
        }
        int i4 = i - 1;
        if (i4 == 1) {
            enkjVar.copyOnWrite();
            enkm enkmVar5 = (enkm) enkjVar.instance;
            enkmVar5.d = 1;
            enkmVar5.b |= 2;
        } else if (i4 == 2) {
            enkjVar.copyOnWrite();
            enkm enkmVar6 = (enkm) enkjVar.instance;
            enkmVar6.d = 2;
            enkmVar6.b |= 2;
        } else if (i4 != 3) {
            enkjVar.copyOnWrite();
            enkm enkmVar7 = (enkm) enkjVar.instance;
            enkmVar7.d = 4;
            enkmVar7.b |= 2;
        } else {
            enkjVar.copyOnWrite();
            enkm enkmVar8 = (enkm) enkjVar.instance;
            enkmVar8.d = 3;
            enkmVar8.b |= 2;
        }
        evsn evsnVarBuild = enkjVar.build();
        evsnVarBuild.getClass();
        return (enkm) evsnVarBuild;
    }
}
