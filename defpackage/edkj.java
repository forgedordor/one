package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkj extends edjb {
    public ejwi a = ejud.a;
    private ekgb b;
    private eure c;

    @Override // defpackage.edjb
    public final edjc a() {
        eure eureVar;
        ekgb ekgbVar = this.b;
        if (ekgbVar != null && (eureVar = this.c) != null) {
            return new edkk(ekgbVar, this.a, eureVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" interests");
        }
        if (this.c == null) {
            sb.append(" eventLog");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edjb
    public final void b(eure eureVar) {
        if (eureVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.c = eureVar;
    }

    @Override // defpackage.edjb
    public final void c(Iterable iterable) {
        this.b = ekgb.j(iterable);
    }
}
