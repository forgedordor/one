package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class add extends adj {
    private final acm a;

    public add(acm acmVar) {
        this.a = acmVar;
    }

    @Override // defpackage.adj
    public final void a(Object obj, kun kunVar) {
        adj adjVar = this.a.a;
        if (adjVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        adjVar.a(obj, kunVar);
    }

    @Override // defpackage.adj
    @fcsv
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
