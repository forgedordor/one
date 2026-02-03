package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exif extends evsn implements evui {
    public static final exif a;
    private static volatile evuo f;
    public String b = "";
    public String c = "";
    public float d;
    public float e;
    private int g;

    static {
        exif exifVar = new exif();
        a = exifVar;
        evsn.registerDefaultInstance(exif.class, exifVar);
    }

    private exif() {
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (iOrdinal == 3) {
            return new exif();
        }
        if (iOrdinal == 4) {
            return new exie();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = f;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (exif.class) {
            evsgVar = f;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                f = evsgVar;
            }
        }
        return evsgVar;
    }
}
