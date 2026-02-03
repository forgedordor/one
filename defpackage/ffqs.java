package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqs {
    public static final ffqs a = new ffqs(3, 1);
    public static final ffqs b = new ffqs(3, 2);
    public static final ffqs c = new ffqs(3, 3);
    public static final ffqs d = new ffqs(5, 1);
    public static final ffqs e = new ffqs(5, 2);
    public static final ffqs f = new ffqs(5, 3);
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final ffil l;
    public final int m;

    private ffqs(int i, int i2) {
        if (i == 3) {
            this.g = 68;
            this.h = 32;
            this.i = 48;
            this.l = new ffis();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.g = 96;
            this.h = 36;
            this.i = 64;
            this.l = new ffiu();
        }
        int i3 = this.g;
        int i4 = this.h;
        int i5 = this.i;
        this.j = i3 + i4 + i5;
        this.k = i4 + i5;
        this.m = i2;
    }
}
