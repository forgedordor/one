package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwom extends dwsf {
    private String a;
    private String b;
    private ekgb c;
    private int d;
    private String e;
    private byte f;

    @Override // defpackage.dwsf
    public final dwsg a() {
        if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.e != null) {
            return new dwon(this.a, this.b, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" messageId");
        }
        if (this.c == null) {
            sb.append(" suggestions");
        }
        if (this.f == 0) {
            sb.append(" renderStyle");
        }
        if (this.e == null) {
            sb.append(" hintText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwsf
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null hintText");
        }
        this.e = str;
    }

    @Override // defpackage.dwsf
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
    }

    @Override // defpackage.dwsf
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.b = str;
    }

    @Override // defpackage.dwsf
    public final void e(int i) {
        this.d = i;
        this.f = (byte) 1;
    }

    @Override // defpackage.dwsf
    public final void f(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null suggestions");
        }
        this.c = ekgbVar;
    }
}
