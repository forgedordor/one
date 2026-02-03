package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emx {
    public final int a;
    public final int b;
    public final Object c;

    public emx(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
        if (i < 0) {
            ebs.c("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        ebs.c("size should be > 0");
    }
}
