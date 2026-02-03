package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmf {
    public static int a(long j) {
        if (j <= 0) {
            return 2;
        }
        if (j < 10240) {
            return 3;
        }
        if (j < 102400) {
            return 4;
        }
        if (j < 512000) {
            return 5;
        }
        if (j < 1048576) {
            return 6;
        }
        if (j < 5242880) {
            return 8;
        }
        if (j < 10485760) {
            return 9;
        }
        if (j < 20971520) {
            return 11;
        }
        if (j < 31457280) {
            return 12;
        }
        if (j < 41943040) {
            return 13;
        }
        if (j < 52428800) {
            return 14;
        }
        if (j < 78643200) {
            return 15;
        }
        return j < 104857600 ? 16 : 17;
    }
}
