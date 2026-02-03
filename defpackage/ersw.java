package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersw {
    public static final ersw a = new ersw("SHA1");
    public static final ersw b = new ersw("SHA256");
    public static final ersw c = new ersw("SHA512");
    private final String d;

    private ersw(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
