package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwus extends dwvo {
    public dwsu a;
    public String b;
    private evqs c;
    private int d;
    private int e;
    private String f;
    private byte g;

    @Override // defpackage.dwvo
    public final dwvo a(evqs evqsVar) {
        this.c = evqsVar;
        return this;
    }

    @Override // defpackage.dwvo
    public final dwvp b() {
        dwsu dwsuVar;
        evqs evqsVar;
        String str;
        if (this.g == 3 && (dwsuVar = this.a) != null && (evqsVar = this.c) != null && (str = this.f) != null) {
            return new dwut(dwsuVar, this.b, evqsVar, this.d, this.e, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" mediaId");
        }
        if (this.c == null) {
            sb.append(" thumbnail");
        }
        if ((this.g & 1) == 0) {
            sb.append(" width");
        }
        if ((this.g & 2) == 0) {
            sb.append(" height");
        }
        if (this.f == null) {
            sb.append(" imageDescription");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwvo
    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.dwvo
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null imageDescription");
        }
        this.f = str;
    }

    @Override // defpackage.dwvo
    public final void e(int i) {
        this.d = i;
        this.g = (byte) (this.g | 1);
    }
}
