package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxsn {
    public static final /* synthetic */ bxsm a(bxsj bxsjVar) {
        evsn evsnVarBuild = bxsjVar.build();
        evsnVarBuild.getClass();
        return (bxsm) evsnVarBuild;
    }

    public static final void b(int i, bxsj bxsjVar) {
        bxsjVar.copyOnWrite();
        bxsm bxsmVar = (bxsm) bxsjVar.instance;
        bxsm bxsmVar2 = bxsm.a;
        bxsmVar.c = i - 1;
        bxsmVar.b |= 1;
    }

    public static final void c(int i, bxsj bxsjVar) {
        bxsjVar.copyOnWrite();
        bxsm bxsmVar = (bxsm) bxsjVar.instance;
        bxsm bxsmVar2 = bxsm.a;
        bxsmVar.d = i - 1;
        bxsmVar.b |= 2;
    }
}
