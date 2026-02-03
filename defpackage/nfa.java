package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfa extends nih {
    private final mcm b;

    public nfa(nif nifVar, mcm mcmVar) {
        super(nifVar);
        this.b = mcmVar;
    }

    @Override // defpackage.nih, defpackage.nik
    public final mau a(int i) {
        return this.b.a(this.a.e(i));
    }

    @Override // defpackage.nih, defpackage.nif
    public final mau b() {
        return this.b.a(this.a.f());
    }

    @Override // defpackage.nih, defpackage.nik
    public final mcm c() {
        return this.b;
    }

    @Override // defpackage.nih
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof nfa)) {
            return this.b.equals(((nfa) obj).b);
        }
        return false;
    }

    @Override // defpackage.nih
    public final int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }
}
