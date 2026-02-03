package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avfp extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ avgc d;
    final /* synthetic */ List e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avfp(avgc avgcVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = avgcVar;
        this.e = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a A[LOOP:2: B:38:0x0154->B:40:0x015a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cc A[LOOP:0: B:51:0x01c6->B:53:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9 A[LOOP:1: B:55:0x01e3->B:57:0x01e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0205  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avfp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avfp avfpVar = new avfp(this.d, this.e, fcxyVar);
        avfpVar.f = obj;
        return avfpVar;
    }
}
