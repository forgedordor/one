package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqld {
    public static final int a(long j) {
        if (j < 0) {
            return 1;
        }
        if (j < 1048576) {
            return 2;
        }
        if (j < 10485760) {
            return 3;
        }
        if (j < 104857600) {
            return 4;
        }
        if (j < 524288000) {
            return 5;
        }
        if (j < 1073741824) {
            return 6;
        }
        if (j < 2147483648L) {
            return 7;
        }
        if (j < 4294967296L) {
            return 8;
        }
        return j < 8589934592L ? 9 : 10;
    }
}
