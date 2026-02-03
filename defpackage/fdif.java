package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdif implements fdiq {
    private final fdie[] a;

    public fdif(fdie[] fdieVarArr) {
        this.a = fdieVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            fdie[] fdieVarArr = this.a;
            if (i >= fdieVarArr.length) {
                return;
            }
            fdks fdksVar = fdieVarArr[i].a;
            if (fdksVar == null) {
                fdbq.c("handle");
                fdksVar = null;
            }
            fdksVar.hz();
            i++;
        }
    }

    @Override // defpackage.fdiq
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + "]";
    }
}
