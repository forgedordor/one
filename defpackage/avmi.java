package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avmi extends fcyz implements fdat {
    boolean a;
    Object b;
    int c;
    final /* synthetic */ avmk d;
    final /* synthetic */ WorkerParameters e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avmi(avmk avmkVar, WorkerParameters workerParameters, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = avmkVar;
        this.e = workerParameters;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:7:0x0019, B:37:0x00b6, B:10:0x0022, B:31:0x00a0, B:34:0x00ab, B:11:0x0027, B:26:0x0080, B:12:0x002b, B:20:0x0041, B:22:0x0049, B:24:0x004f, B:17:0x0035), top: B:48:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:7:0x0019, B:37:0x00b6, B:10:0x0022, B:31:0x00a0, B:34:0x00ab, B:11:0x0027, B:26:0x0080, B:12:0x002b, B:20:0x0041, B:22:0x0049, B:24:0x004f, B:17:0x0035), top: B:48:0x0011 }] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avmi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avmi(this.d, this.e, fcxyVar);
    }
}
