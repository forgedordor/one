package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaov extends easy {
    public String a;
    public String b;
    public eaps c;
    private String d;
    private int e;
    private int f;
    private byte g;

    @Override // defpackage.easy
    public final easz a() {
        String str;
        String str2;
        if (this.g == 3 && (str = this.d) != null && (str2 = this.a) != null) {
            return new earc(str, this.e, this.f, str2, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == null) {
            sb.append(" attributions");
        }
        if ((this.g & 1) == 0) {
            sb.append(" height");
        }
        if ((this.g & 2) == 0) {
            sb.append(" width");
        }
        if (this.a == null) {
            sb.append(" photoReference");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.easy
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.d = str;
    }

    @Override // defpackage.easy
    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.easy
    public final void d(int i) {
        this.f = i;
        this.g = (byte) (this.g | 2);
    }
}
