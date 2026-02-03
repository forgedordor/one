package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuw extends dwvy {
    private ekgb a;
    private ejwi b = ejud.a;

    @Override // defpackage.dwvy
    public final dwvz a() {
        if (this.a != null) {
            return new dwux(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: components");
    }

    @Override // defpackage.dwvy
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null components");
        }
        this.a = ekgbVar;
    }

    @Override // defpackage.dwvy
    public final void c(int i) {
        this.b = ejwi.j(Integer.valueOf(i));
    }
}
