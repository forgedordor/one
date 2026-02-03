package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwos extends dwsl {
    public ejwi a;
    private ejwi b;

    public dwos() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.a = ejudVar;
    }

    @Override // defpackage.dwsl
    public final dwsm a() {
        return new dwot(this.b, this.a);
    }

    @Override // defpackage.dwsl
    public final void b(boolean z) {
        this.b = ejwi.j(Boolean.valueOf(z));
    }
}
