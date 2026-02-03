package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnh extends efoc {
    public efnh(String str) {
        super(a(str));
    }

    private static String a(String str) {
        return "Invalid XML field value for :".concat(str);
    }

    public efnh(String str, Throwable th) {
        super(a(str), th);
    }
}
