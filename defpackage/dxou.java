package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxou extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dxpb d;
    final /* synthetic */ Bundle e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxou(dxpb dxpbVar, Bundle bundle, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dxpbVar;
        this.e = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxou) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0140  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxou.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxou(this.d, this.e, fcxyVar);
    }
}
