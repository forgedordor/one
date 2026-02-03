package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chtg extends fcyz implements fdat {
    int a;
    final /* synthetic */ chtk b;
    final /* synthetic */ SelfIdentityId c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chtg(fcxy fcxyVar, chtk chtkVar, SelfIdentityId selfIdentityId) {
        super(2, fcxyVar);
        this.b = chtkVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chtg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
            objM = chtkVar.m(selfIdentityId, 2, this);
            if (objM == fcylVar) {
                return fcylVar;
            }
        }
        fctl.b(objM);
        return objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chtg chtgVar = new chtg(fcxyVar, this.b, this.c);
        chtgVar.d = obj;
        return chtgVar;
    }
}
