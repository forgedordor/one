package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erag {
    public static final erag a = new erag("NIST_P256");
    public static final erag b = new erag("NIST_P384");
    public static final erag c = new erag("NIST_P521");
    public static final erag d = new erag("X25519");
    private final String e;

    private erag(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
