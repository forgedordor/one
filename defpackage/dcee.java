package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcee extends dcec {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public dcee(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.dcec
    public final byte[] c() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}
