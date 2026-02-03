package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwad extends dwba {
    public dwbc a;
    private String b;

    @Override // defpackage.dwba
    public final dwbd a() {
        dwbc dwbcVar;
        String str = this.b;
        if (str != null && (dwbcVar = this.a) != null) {
            return new dwae(str, dwbcVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" pushId");
        }
        if (this.a == null) {
            sb.append(" oneOfType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwba
    public final void b(dwbc dwbcVar) {
        this.a = dwbcVar;
    }

    @Override // defpackage.dwba
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null pushId");
        }
        this.b = str;
    }
}
