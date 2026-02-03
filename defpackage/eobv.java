package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eobv {
    public static final /* synthetic */ enkm a(enkj enkjVar) {
        evsn evsnVarBuild = enkjVar.build();
        evsnVarBuild.getClass();
        return (enkm) evsnVarBuild;
    }

    public static final void b(int i, enkj enkjVar) {
        enkjVar.copyOnWrite();
        enkm enkmVar = (enkm) enkjVar.instance;
        enkm enkmVar2 = enkm.a;
        enkmVar.d = i - 1;
        enkmVar.b |= 2;
    }

    public static final void c(enkj enkjVar) {
        enkjVar.copyOnWrite();
        enkm enkmVar = (enkm) enkjVar.instance;
        enkm enkmVar2 = enkm.a;
        enkmVar.c = 3;
        enkmVar.b |= 1;
    }
}
