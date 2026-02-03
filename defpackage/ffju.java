package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffju {
    private final String a;
    private final String b;

    public ffju(String str) {
        this.a = a.a(str, "-----BEGIN ", "-----");
        this.b = a.a(str, "-----END ", "-----");
    }

    public final boolean a(String str) {
        return str.startsWith(this.b);
    }

    public final boolean b(String str) {
        return str.startsWith(this.a);
    }
}
