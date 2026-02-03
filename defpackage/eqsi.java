package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsi {
    public static final eqsi a = new eqsi("ENABLED");
    public static final eqsi b = new eqsi("DISABLED");
    public static final eqsi c = new eqsi("DESTROYED");
    private final String d;

    private eqsi(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
