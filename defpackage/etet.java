package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etet extends etev {
    public final byte[] a;

    public etet(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.etev
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.etev
    public final etes b() {
        return new etes(this);
    }
}
