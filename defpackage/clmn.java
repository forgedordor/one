package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clmn {
    public static final /* synthetic */ clmm a(clml clmlVar) {
        evsn evsnVarBuild = clmlVar.build();
        evsnVarBuild.getClass();
        return (clmm) evsnVarBuild;
    }

    public static final void b(clnz clnzVar, clml clmlVar) {
        clmlVar.copyOnWrite();
        clmm clmmVar = (clmm) clmlVar.instance;
        clmm clmmVar2 = clmm.a;
        clmmVar.e = clnzVar;
        clmmVar.b |= 4;
    }

    public static final void c(String str, clml clmlVar) {
        clmlVar.copyOnWrite();
        clmm clmmVar = (clmm) clmlVar.instance;
        clmm clmmVar2 = clmm.a;
        clmmVar.b |= 1;
        clmmVar.c = str;
    }
}
