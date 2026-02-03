package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class max {
    public final mau a;
    public final long b;

    public max(mau mauVar, long j) {
        mee.b(mauVar.E != null, "format colorInfo must be set");
        int i = mauVar.v;
        mee.b(i > 0, a.g(i, "format width must be positive, but is: "));
        int i2 = mauVar.w;
        mee.b(i2 > 0, a.g(i2, "format height must be positive, but is: "));
        this.a = mauVar;
        this.b = j;
    }
}
