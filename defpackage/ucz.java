package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucz implements uck {
    public static final cqce a = cqce.g("BugleCmsFolsom", "EncryptCmsBackupSyncletTask");
    public final auso b;
    private final fcsu c;
    private final fdjx d;

    public ucz(fcsu fcsuVar, fdjx fdjxVar, auso ausoVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        ausoVar.getClass();
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.b = ausoVar;
    }

    @Override // defpackage.uck
    public final /* synthetic */ int a() {
        return 1;
    }

    @Override // defpackage.uck
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ucy(this, null));
    }

    @Override // defpackage.uck
    public final /* synthetic */ Object c(fcxy fcxyVar) {
        return ucj.a();
    }

    @Override // defpackage.uck
    public final String d() {
        return "EncryptCmsBackupSyncletTask";
    }

    @Override // defpackage.uck
    public final int e() {
        return 2;
    }

    public final void f(String str) {
        String strSubstring;
        int iV = fdgn.V(str, ".");
        if (iV == -1) {
            strSubstring = str;
        } else {
            strSubstring = str.substring(iV + 1, str.length());
            strSubstring.getClass();
        }
        a.p("EncryptCmsBackupHandler completed with status ".concat(strSubstring));
        ((ains) this.c.b()).c(str);
    }
}
