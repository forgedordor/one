package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
enum ejzs {
    STRONG,
    SOFT,
    WEAK;

    final ejvp a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return ejvm.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return ejvn.a;
        }
        throw null;
    }
}
