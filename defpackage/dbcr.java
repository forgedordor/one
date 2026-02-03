package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbcr implements fcsc {
    private final int a;
    private final dbcs b;

    public dbcr(dbcs dbcsVar, int i) {
        this.b = dbcsVar;
        this.a = i;
    }

    @Override // defpackage.fcsc
    public final void a(Object obj, fcsf fcsfVar) {
        int i = this.a;
        if (i == 0) {
            this.b.b((dbco) obj, fcsfVar);
        } else if (i != 1) {
            this.b.d(fcsfVar);
        } else {
            this.b.c(fcsfVar);
        }
    }
}
