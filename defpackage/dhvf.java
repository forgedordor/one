package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvf extends Exception {
    public final evqs a;
    public final dhuo b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dhvf(int i, int i2, String str, Throwable th, dhuo dhuoVar, int i3) {
        evqs evqsVar = (i3 & 16) != 0 ? evqs.b : null;
        dhuoVar = (i3 & 32) != 0 ? dhuo.a : dhuoVar;
        if (i == 0) {
            throw null;
        }
        i2 = (i3 & 2) != 0 ? 2 : i2;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i3 & 8;
        int i5 = i3 & 4;
        th = i4 != 0 ? null : th;
        str = i5 != 0 ? null : str;
        evqsVar.getClass();
        dhuoVar.getClass();
        super(str, th);
        this.c = i;
        this.d = i2;
        this.a = evqsVar;
        this.b = dhuoVar;
    }
}
