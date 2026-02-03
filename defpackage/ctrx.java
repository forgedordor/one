package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctrx extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctsy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctrx(ctsy ctsyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ctsyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctrx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ctsy ctsyVar = this.b;
            ctsyVar.s.d("has_pending_profile_photo_picker_result", true);
            afzc afzcVar = (afzc) ctsyVar.h.b();
            this.a = 1;
            obj = afzcVar.f(ctsyVar.q, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ctsy ctsyVar2 = this.b;
        ctsyVar2.s.d("has_pending_profile_photo_picker_result", false);
        ctsyVar2.h((Uri) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ctrx(this.b, fcxyVar);
    }
}
