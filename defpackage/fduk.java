package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fduk implements fdks {
    public final fdum a;
    public final long b;
    public final Object c;
    public final fcxy d;

    public fduk(fdum fdumVar, long j, Object obj, fcxy fcxyVar) {
        this.a = fdumVar;
        this.b = j;
        this.c = obj;
        this.d = fcxyVar;
    }

    @Override // defpackage.fdks
    public final void hz() {
        fdum fdumVar = this.a;
        synchronized (fdumVar) {
            long j = this.b;
            if (j < fdumVar.f()) {
                return;
            }
            Object[] objArr = fdumVar.a;
            objArr.getClass();
            if (fdun.a(objArr, j) == this) {
                fdun.b(objArr, j, fdun.a);
                fdumVar.k();
            }
        }
    }
}
