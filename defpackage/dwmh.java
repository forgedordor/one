package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmh extends dwjn {
    private ejwi a;
    private ejwi b;

    public dwmh() {
        ejud ejudVar = ejud.a;
        this.a = ejudVar;
        this.b = ejudVar;
    }

    @Override // defpackage.dwjn
    public final dwjo a() {
        return new dwmi(this.a, this.b);
    }

    @Override // defpackage.dwjn
    public final void b(dwqs dwqsVar) {
        this.a = ejwi.j(dwqsVar);
    }

    @Override // defpackage.dwjn
    public final void c(dwqa dwqaVar) {
        this.b = ejwi.j(dwqaVar);
    }
}
