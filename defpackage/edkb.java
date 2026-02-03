package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkb extends edit {
    public ejwi a = ejud.a;
    private ekgb b;
    private ekgb c;
    private eure d;

    @Override // defpackage.edit
    public final ediu a() {
        ekgb ekgbVar;
        eure eureVar;
        ekgb ekgbVar2 = this.b;
        if (ekgbVar2 != null && (ekgbVar = this.c) != null && (eureVar = this.d) != null) {
            return new edkc(ekgbVar2, ekgbVar, this.a, eureVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" images");
        }
        if (this.c == null) {
            sb.append(" collections");
        }
        if (this.d == null) {
            sb.append(" eventLog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edit
    public final void b(Iterable iterable) {
        this.c = ekgb.j(iterable);
    }

    @Override // defpackage.edit
    public final void c(eure eureVar) {
        if (eureVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.d = eureVar;
    }

    @Override // defpackage.edit
    public final void d(Iterable iterable) {
        this.b = ekgb.j(iterable);
    }
}
