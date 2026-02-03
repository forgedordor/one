package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxs extends fcyz implements fdat {
    int a;
    final /* synthetic */ emfc b;
    final /* synthetic */ cjya c;
    final /* synthetic */ Optional d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxs(emfc emfcVar, cjya cjyaVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = emfcVar;
        this.c = cjyaVar;
        this.d = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            List listG = fcva.g(emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_PRESENTED, emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED, emfc.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED);
            emfc emfcVar = this.b;
            if (!listG.contains(emfcVar)) {
                throw new IllegalStateException("Check failed.");
            }
            cjya cjyaVar = this.c;
            Optional optional = this.d;
            emfe emfeVar = emfe.PROVISIONING_UI_TYPE_GOOGLE_TOS_BANNER;
            elzz elzzVar = (elzz) fdct.b(optional);
            this.a = 1;
            if (cjyaVar.b(emfeVar, emfcVar, null, elzzVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjxs(this.b, this.c, this.d, fcxyVar);
    }
}
