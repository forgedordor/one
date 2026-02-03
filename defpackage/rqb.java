package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqb implements rhy {
    private final byte[] a;

    public rqb(byte[] bArr) {
        rvi.f(bArr);
        this.a = bArr;
    }

    @Override // defpackage.rhy
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.rhy
    public final Class b() {
        return byte[].class;
    }

    @Override // defpackage.rhy
    public final /* synthetic */ Object c() {
        return this.a;
    }

    @Override // defpackage.rhy
    public final void e() {
    }
}
