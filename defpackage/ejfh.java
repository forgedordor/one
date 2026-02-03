package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejfh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ejfj c;
    final /* synthetic */ Bitmap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejfh(ejfj ejfjVar, Bitmap bitmap, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ejfjVar;
        this.d = bitmap;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejfh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0278  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejfh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ejfh(this.c, this.d, fcxyVar);
    }
}
