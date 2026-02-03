package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbwl implements fcsc {
    private final int a;
    private final dbwk b;

    public dbwl(dbwk dbwkVar, int i) {
        this.b = dbwkVar;
        this.a = i;
    }

    @Override // defpackage.fcsc
    public final void a(Object obj, fcsf fcsfVar) {
        if (this.a != 0) {
            this.b.i((dbxr) obj, fcsfVar);
        } else {
            this.b.h((dbxa) obj, fcsfVar);
        }
    }
}
