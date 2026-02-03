package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asvd extends asvf {
    private String a;
    private String b;

    @Override // defpackage.asvf
    public final asvg a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new asve(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" serviceId");
        }
        if (this.b == null) {
            sb.append(" version");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.asvf
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null serviceId");
        }
        this.a = str;
    }

    @Override // defpackage.asvf
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str;
    }
}
