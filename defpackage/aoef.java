package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoef extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoeg b;
    final /* synthetic */ SelfIdentityId c;
    final /* synthetic */ alqm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoef(aoeg aoegVar, SelfIdentityId selfIdentityId, alqm alqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aoegVar;
        this.c = selfIdentityId;
        this.d = alqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoef) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarE = this.b.e(this.c);
            this.a = 1;
            obj = fdxs.c(eijuVarE, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return null;
        }
        ((aohw) this.b.d.b()).a(((aoer) optional.get()).b(), this.d);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoef(this.b, this.c, this.d, fcxyVar);
    }
}
