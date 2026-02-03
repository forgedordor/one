package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clnw {
    public static final /* synthetic */ clnv a(clnu clnuVar) {
        evsn evsnVarBuild = clnuVar.build();
        evsnVarBuild.getClass();
        return (clnv) evsnVarBuild;
    }

    public static final void b(cloq cloqVar, clnu clnuVar) {
        clnuVar.copyOnWrite();
        clnv clnvVar = (clnv) clnuVar.instance;
        clnv clnvVar2 = clnv.a;
        clnvVar.c = cloqVar;
        clnvVar.b |= 1;
    }
}
