package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgso extends fgsu {
    private final StringBuilder a = new StringBuilder();
    private String b;

    public fgso() {
        this.h = 4;
    }

    private final void e() {
        String str = this.b;
        if (str != null) {
            this.a.append(str);
            this.b = null;
        }
    }

    @Override // defpackage.fgsu
    public final void a() {
        r(this.a);
        this.b = null;
    }

    final String b() {
        String str = this.b;
        return str != null ? str : this.a.toString();
    }

    final void c(char c) {
        e();
        this.a.append(c);
    }

    final void d(String str) {
        e();
        StringBuilder sb = this.a;
        if (sb.length() == 0) {
            this.b = str;
        } else {
            sb.append(str);
        }
    }

    public final String toString() {
        return "<!--" + b() + "-->";
    }
}
