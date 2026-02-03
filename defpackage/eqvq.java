package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvq {
    public static final eqvq a = new eqvq("ASSUME_AES_GCM");
    public static final eqvq b = new eqvq("ASSUME_XCHACHA20POLY1305");
    public static final eqvq c = new eqvq("ASSUME_CHACHA20POLY1305");
    public static final eqvq d = new eqvq("ASSUME_AES_CTR_HMAC");
    public static final eqvq e = new eqvq("ASSUME_AES_EAX");
    public static final eqvq f = new eqvq("ASSUME_AES_GCM_SIV");
    public final String g;

    private eqvq(String str) {
        this.g = str;
    }

    public final String toString() {
        return this.g;
    }
}
