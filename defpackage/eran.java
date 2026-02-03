package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eran extends erao {
    public static final eran a = new eran("AES_128_GCM", 1);
    public static final eran b = new eran("AES_256_GCM", 2);
    public static final eran c = new eran("CHACHA20_POLY1305", 3);

    private eran(String str, int i) {
        super(str, i);
    }
}
