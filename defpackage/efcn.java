package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcn extends effh {
    private String a;
    private int b;

    @Override // defpackage.effh
    public final effi a() {
        String str;
        int i = this.b;
        if (i != 0 && (str = this.a) != null) {
            return new efco(i, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" type");
        }
        if (this.a == null) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.effh
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    @Override // defpackage.effh
    public final void c(int i) {
        if (i == 0) {
            throw new NullPointerException("Null type");
        }
        this.b = i;
    }
}
