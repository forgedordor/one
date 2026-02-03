package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqci extends eqda {
    private evqs a;
    private eqcn b;

    @Override // defpackage.eqda
    public final eqdb a() {
        eqcn eqcnVar;
        evqs evqsVar = this.a;
        if (evqsVar != null && (eqcnVar = this.b) != null) {
            return new eqcj(evqsVar, eqcnVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eqda
    public final void b(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = evqsVar;
    }

    @Override // defpackage.eqda
    public final void c(eqcn eqcnVar) {
        if (eqcnVar == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = eqcnVar;
    }
}
