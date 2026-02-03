package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrb extends IllegalArgumentException {
    public asrb(String str) {
        super(str);
    }

    static asrb a(String str, Throwable th) {
        return new asrb(String.format("%s cannot be converted into a ChatEndpoint.", str), th);
    }

    private asrb(String str, Throwable th) {
        super(str, th);
    }
}
