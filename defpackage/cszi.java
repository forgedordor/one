package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cszi extends fcyz implements fdat {
    final /* synthetic */ Supplier a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cszi(Supplier supplier, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = supplier;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cszi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.VIDEO_CALLING_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eocr eocrVar = (eocr) this.a.get();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eocrVar.getClass();
        ellhVar2.cj = eocrVar;
        ellhVar2.h |= 1048576;
        return ellgVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cszi(this.a, fcxyVar);
    }
}
