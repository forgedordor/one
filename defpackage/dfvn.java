package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvn extends dfwd {
    public int a;
    private dgzn b;

    @Override // defpackage.dfwd
    public final dfwe a() {
        dgzn dgznVar;
        int i = this.a;
        if (i != 0 && (dgznVar = this.b) != null) {
            return new dfvo(i, dgznVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" action");
        }
        if (this.b == null) {
            sb.append(" session");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dfwd
    public final void b(dgzn dgznVar) {
        if (dgznVar == null) {
            throw new NullPointerException("Null session");
        }
        this.b = dgznVar;
    }
}
