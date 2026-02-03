package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erod {
    public static final erod a = new erod("SHA256");
    public static final erod b = new erod("SHA384");
    public static final erod c = new erod("SHA512");
    public final String d;

    private erod(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
