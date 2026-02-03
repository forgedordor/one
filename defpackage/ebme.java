package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebme {
    public String a;
    public int b;

    public ebme() {
        this.b = 1;
    }

    public static boolean a(String str) {
        return str.charAt(0) == '[' && str.charAt(str.length() + (-1)) == ']';
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ebme)) {
            return ejwh.a(this.a, ((ebme) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ebme(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null host name");
        }
        this.a = str;
        this.b = str.indexOf(58) != -1 ? 3 : 2;
    }
}
