package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffnz {
    public static final ffnz a = new ffnz("mceliece348864", 12, 3488, 64, false);
    public static final ffnz b = new ffnz("mceliece348864f", 12, 3488, 64, true);
    public static final ffnz c = new ffnz("mceliece460896", 13, 4608, 96, false);
    public static final ffnz d = new ffnz("mceliece460896f", 13, 4608, 96, true);
    public static final ffnz e = new ffnz("mceliece6688128", 13, 6688, 128, false);
    public static final ffnz f = new ffnz("mceliece6688128f", 13, 6688, 128, true);
    public static final ffnz g = new ffnz("mceliece6960119", 13, 6960, 119, false);
    public static final ffnz h = new ffnz("mceliece6960119f", 13, 6960, 119, true);
    public static final ffnz i = new ffnz("mceliece8192128", 13, 8192, 128, false);
    public static final ffnz j = new ffnz("mceliece8192128f", 13, 8192, 128, true);
    public final String k;
    public final int l;
    public final ffnx m;

    private ffnz(String str, int i2, int i3, int i4, boolean z) {
        this.k = str;
        this.l = i4;
        this.m = new ffnx(i2, i3, i4, z);
    }
}
