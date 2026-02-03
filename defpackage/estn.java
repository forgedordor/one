package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estn extends fbnl {
    private final Object a = new Object();
    private estl b;
    private final estk c;

    public estn(estk estkVar) {
        this.c = estkVar;
    }

    @Override // defpackage.fbnl
    public final fbnm a() {
        synchronized (this.a) {
            if (this.b != null) {
                return new estm();
            }
            estl estlVar = new estl(this.c);
            this.b = estlVar;
            return estlVar;
        }
    }
}
