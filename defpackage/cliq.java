package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cliq extends fcyz implements fdat {
    int a;
    final /* synthetic */ WorkerParameters b;
    final /* synthetic */ clir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cliq(WorkerParameters workerParameters, clir clirVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = workerParameters;
        this.c = clirVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cliq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cliq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cliq(this.b, this.c, fcxyVar);
    }
}
