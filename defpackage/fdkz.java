package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdkz implements Runnable, Comparable, fdks, fdzr {
    public volatile Object _heap;
    private int a = -1;
    public long b;

    public fdkz(long j) {
        this.b = j;
    }

    @Override // defpackage.fdzr
    public final int b() {
        return this.a;
    }

    @Override // defpackage.fdzr
    public final fdzq c() {
        Object obj = this._heap;
        if (obj instanceof fdzq) {
            return (fdzq) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long j = this.b - ((fdkz) obj).b;
        if (j > 0) {
            return 1;
        }
        return j >= 0 ? 0 : -1;
    }

    @Override // defpackage.fdzr
    public final void d(fdzq fdzqVar) {
        if (this._heap == fdld.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = fdzqVar;
    }

    @Override // defpackage.fdzr
    public final void e(int i) {
        this.a = i;
    }

    @Override // defpackage.fdks
    public final void hz() {
        synchronized (this) {
            Object obj = this._heap;
            fdzi fdziVar = fdld.a;
            if (obj == fdziVar) {
                return;
            }
            fdla fdlaVar = obj instanceof fdla ? (fdla) obj : null;
            if (fdlaVar != null) {
                synchronized (fdlaVar) {
                    if (c() != null) {
                        int iB = b();
                        boolean z = fdkb.a;
                        fdlaVar.d(iB);
                    }
                }
            }
            this._heap = fdziVar;
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.b + "]";
    }
}
