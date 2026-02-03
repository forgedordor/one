package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efgo extends efgy {
    private ekfw b;
    private ekgb c;
    private evqs d;
    private Optional e = Optional.empty();

    @Override // defpackage.efgy
    public final efgz a() {
        ekfw ekfwVar = this.b;
        if (ekfwVar != null) {
            this.c = ekfwVar.g();
        } else if (this.c == null) {
            int i = ekgb.d;
            this.c = ekoe.a;
        }
        evqs evqsVar = this.d;
        if (evqsVar != null) {
            return new efgp(this.c, evqsVar, this.e);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // defpackage.efgy
    public final ekfw b() {
        if (this.b == null) {
            int i = ekgb.d;
            this.b = new ekfw();
        }
        return this.b;
    }

    @Override // defpackage.efgy
    public final void c(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null content");
        }
        this.d = evqsVar;
    }

    @Override // defpackage.efgy
    public final void d(ebco ebcoVar) {
        this.e = Optional.of(ebcoVar);
    }
}
