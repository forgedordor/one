package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnq implements fdoc, fdne {
    public Object a = fdny.p;
    public fdiu b;
    final /* synthetic */ fdnw c;

    public fdnq(fdnw fdnwVar) {
        this.c = fdnwVar;
    }

    @Override // defpackage.fdne
    public final void C(fdzf fdzfVar, int i) {
        fdiu fdiuVar = this.b;
        if (fdiuVar != null) {
            fdiuVar.C(fdzfVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8 A[SYNTHETIC] */
    @Override // defpackage.fdoc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdnq.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.fdoc
    public final Object b() throws Throwable {
        Object obj = this.a;
        fdzi fdziVar = fdny.p;
        if (obj == fdziVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.a = fdziVar;
        if (obj != fdny.l) {
            return obj;
        }
        throw fdzh.b(this.c.p());
    }
}
