package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eawz extends RuntimeException {
    public eawz(String str) {
        super(str);
    }

    public eawz(Throwable th) {
        super("Cobalt registry could not be parsed from base64 string", th);
    }
}
