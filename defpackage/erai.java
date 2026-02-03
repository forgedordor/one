package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erai {
    public static final erai a = new erai("COMPRESSED");
    public static final erai b = new erai("UNCOMPRESSED");
    public static final erai c = new erai("LEGACY_UNCOMPRESSED");
    private final String d;

    private erai(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
