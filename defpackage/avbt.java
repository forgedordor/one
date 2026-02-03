package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avbt {
    private static final eksp a = eksp.c("BugleContacts");
    private final fcsu b;
    private final crnp c;

    public avbt(fcsu fcsuVar, crnp crnpVar) {
        crnpVar.getClass();
        this.b = fcsuVar;
        this.c = crnpVar;
    }

    public final boolean a() {
        int i = avdn.a;
        if (!avdn.a()) {
            ((eksl) a.h()).q("ContactsSyncFeature is not enabled.");
            return false;
        }
        if (!this.c.d()) {
            ((eksl) a.h()).q("Default SMS App is not Bugle.");
            return false;
        }
        if (((crma) this.b.b()).h()) {
            return true;
        }
        ((eksl) a.h()).q("App does not have read contacts permission.");
        return false;
    }
}
