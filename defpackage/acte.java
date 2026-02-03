package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acte extends actk {
    public String a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public actm e;
    public actm f;
    private int g;
    private boolean h;
    private CharSequence i;
    private actl j;
    private byte k;

    @Override // defpackage.actk
    public final actn a() {
        String str;
        CharSequence charSequence;
        actm actmVar;
        actl actlVar;
        if (this.k == 3 && (str = this.a) != null && (charSequence = this.i) != null && (actmVar = this.e) != null && (actlVar = this.j) != null) {
            return new actf(str, this.g, this.b, this.c, this.h, charSequence, this.d, actmVar, this.f, actlVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" bannerName");
        }
        if ((this.k & 1) == 0) {
            sb.append(" iconRes");
        }
        if ((this.k & 2) == 0) {
            sb.append(" canIgnore");
        }
        if (this.i == null) {
            sb.append(" negativeButtonText");
        }
        if (this.e == null) {
            sb.append(" negativeButtonOnClickListener");
        }
        if (this.j == null) {
            sb.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.actk
    public final void b(boolean z) {
        this.h = z;
        this.k = (byte) (this.k | 2);
    }

    @Override // defpackage.actk
    public final void c(int i) {
        this.g = i;
        this.k = (byte) (this.k | 1);
    }

    @Override // defpackage.actk
    public final void d(actl actlVar) {
        if (actlVar == null) {
            throw new NullPointerException("Null logger");
        }
        this.j = actlVar;
    }

    @Override // defpackage.actk
    public final void e(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null negativeButtonText");
        }
        this.i = charSequence;
    }
}
