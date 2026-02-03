package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esop extends esou {
    public ekhv a;
    private ejwi b = ejud.a;
    private ekhx c;

    @Override // defpackage.esou
    public final esov a() {
        ekhv ekhvVar = this.a;
        if (ekhvVar != null) {
            this.c = ekhvVar.g();
        } else if (this.c == null) {
            this.c = ekon.a;
        }
        return new esoq(this.b, this.c);
    }

    @Override // defpackage.esou
    public final void b(ekhx ekhxVar) {
        this.b = ejwi.j(ekhxVar);
    }
}
