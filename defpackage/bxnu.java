package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnu {
    public static final /* synthetic */ bxnt a(bxns bxnsVar) {
        evsn evsnVarBuild = bxnsVar.build();
        evsnVarBuild.getClass();
        return (bxnt) evsnVarBuild;
    }

    public static final void b(String str, bxns bxnsVar) {
        bxnsVar.copyOnWrite();
        bxnt bxntVar = (bxnt) bxnsVar.instance;
        bxnt bxntVar2 = bxnt.a;
        bxntVar.b |= 1;
        bxntVar.c = str;
    }

    public static final void c(long j, bxns bxnsVar) {
        bxnsVar.copyOnWrite();
        bxnt bxntVar = (bxnt) bxnsVar.instance;
        bxnt bxntVar2 = bxnt.a;
        bxntVar.b |= 2;
        bxntVar.d = j;
    }
}
