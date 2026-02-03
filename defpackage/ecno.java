package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecno {
    private final StringBuilder a;

    public ecno(String str) {
        StringBuilder sb = new StringBuilder();
        this.a = sb;
        sb.append("CREATE TEMP TRIGGER ");
        sb.append(str);
        sb.append(" ");
    }

    public final ecnp a() {
        return new ecnp(this.a.toString());
    }

    public final void b(int i) {
        this.a.append(i);
    }

    public final void c(String str) {
        this.a.append(str);
    }
}
