package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxny {
    public static final /* synthetic */ bxnx a(bxnv bxnvVar) {
        evsn evsnVarBuild = bxnvVar.build();
        evsnVarBuild.getClass();
        return (bxnx) evsnVarBuild;
    }

    public static final void b(aubx aubxVar, bxnv bxnvVar) {
        bxnvVar.copyOnWrite();
        bxnx bxnxVar = (bxnx) bxnvVar.instance;
        bxnx bxnxVar2 = bxnx.a;
        bxnxVar.e = aubxVar;
        bxnxVar.b |= 1;
    }

    public static final void c(emki emkiVar, bxnv bxnvVar) {
        bxnvVar.copyOnWrite();
        bxnx bxnxVar = (bxnx) bxnvVar.instance;
        bxnx bxnxVar2 = bxnx.a;
        bxnxVar.g = emkiVar;
        bxnxVar.b |= 4;
    }

    public static final void d(int i, bxnv bxnvVar) {
        bxnvVar.copyOnWrite();
        bxnx bxnxVar = (bxnx) bxnvVar.instance;
        bxnx bxnxVar2 = bxnx.a;
        bxnxVar.c = bxnw.a(i);
    }
}
