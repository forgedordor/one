package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnf extends dwpz {
    public dwqs a;
    private String b;

    @Override // defpackage.dwpz
    public final dwqa a() {
        String str;
        dwqs dwqsVar = this.a;
        if (dwqsVar != null && (str = this.b) != null) {
            return new dwng(dwqsVar, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" webViewHeader");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwpz
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
