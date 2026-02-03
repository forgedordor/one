package defpackage;

import android.content.res.AssetFileDescriptor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmnb extends fcyz implements fdat {
    final /* synthetic */ AssetFileDescriptor a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmnb(AssetFileDescriptor assetFileDescriptor, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = assetFileDescriptor;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmnb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.close();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmnb(this.a, fcxyVar);
    }
}
