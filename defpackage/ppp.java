package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppp {
    public final String a;
    public final String b;
    public final ppo c;

    public ppp(String str, ppo ppoVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.a = "www.google.com";
        this.b = str;
        this.c = ppoVar;
    }
}
