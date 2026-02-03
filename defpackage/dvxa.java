package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxa extends dvxe {
    public String a;
    private dvxj b;

    @Override // defpackage.dvxe
    public final dvxf a() {
        dvxj dvxjVar;
        String str = this.a;
        if (str != null && (dvxjVar = this.b) != null) {
            return new dvxb(str, dvxjVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tag");
        }
        if (this.b == null) {
            sb.append(" lighterRetryPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dvxe
    public final void b(dvxj dvxjVar) {
        if (dvxjVar == null) {
            throw new NullPointerException("Null lighterRetryPolicy");
        }
        this.b = dvxjVar;
    }
}
