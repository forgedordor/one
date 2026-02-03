package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chsx extends fcyz implements fdat {
    int a;
    final /* synthetic */ chtk b;
    final /* synthetic */ SelfIdentityId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chsx(chtk chtkVar, SelfIdentityId selfIdentityId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chtkVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chsx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objM;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objM = ((fctk) obj).a;
        } else {
            chtk chtkVar = this.b;
            SelfIdentityId selfIdentityId = this.c;
            this.a = 1;
            objM = chtkVar.m(selfIdentityId, 1, this);
            if (objM == fcylVar) {
                return fcylVar;
            }
        }
        if (true == (objM instanceof fctj)) {
            objM = null;
        }
        return Optional.ofNullable(objM);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chsx(this.b, this.c, fcxyVar);
    }
}
