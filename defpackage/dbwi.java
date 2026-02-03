package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbwi implements fcsc {
    private final int a;
    private final dbwh b;

    public dbwi(dbwh dbwhVar, int i) {
        this.b = dbwhVar;
        this.a = i;
    }

    @Override // defpackage.fcsc
    public final void a(Object obj, fcsf fcsfVar) {
        int i = this.a;
        if (i == 0) {
            this.b.f((dbww) obj, fcsfVar);
        } else if (i != 1) {
            this.b.d((dbwo) obj, fcsfVar);
        } else {
            this.b.e((dbws) obj, fcsfVar);
        }
    }
}
