package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaab extends RuntimeException {
    public final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public eaab(int i, String str, Throwable th) {
        String strValueOf;
        if (str != null) {
            strValueOf = i + ": " + str;
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, th);
        this.a = i;
    }
}
