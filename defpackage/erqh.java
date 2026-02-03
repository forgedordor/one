package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqh {
    public static final erqh a = new erqh("SHA256");
    public static final erqh b = new erqh("SHA384");
    public static final erqh c = new erqh("SHA512");
    private final String d;

    private erqh(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
