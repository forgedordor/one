package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxep {
    public final dxeo a;
    public final int b;
    public final String c;
    public final String d = null;
    public final Throwable e;

    public dxep(dxeo dxeoVar, int i, String str, String str2, Throwable th) {
        this.a = dxeoVar;
        this.b = i;
        this.c = str;
        this.e = th;
    }

    public static dxep a(dxeo dxeoVar, Throwable th) {
        return new dxep(dxeoVar, -1, th.getMessage(), null, th);
    }
}
