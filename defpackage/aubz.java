package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aubz {
    public static final /* synthetic */ aubx a(aubv aubvVar) {
        evsn evsnVarBuild = aubvVar.build();
        evsnVarBuild.getClass();
        return (aubx) evsnVarBuild;
    }

    public static final void b(String str, aubv aubvVar) {
        aubvVar.copyOnWrite();
        aubx aubxVar = (aubx) aubvVar.instance;
        aubx aubxVar2 = aubx.a;
        aubxVar.b |= 2;
        aubxVar.d = str;
    }

    public static final void c(String str, aubv aubvVar) {
        aubvVar.copyOnWrite();
        aubx aubxVar = (aubx) aubvVar.instance;
        aubx aubxVar2 = aubx.a;
        aubxVar.b |= 1;
        aubxVar.c = str;
    }
}
