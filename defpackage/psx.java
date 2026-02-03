package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class psx extends psz {
    public final int a;

    public psx(int i) {
        super(a.g(i, "dimension in pixel:"));
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException("Pixel value must be a positive integer.");
        }
    }
}
