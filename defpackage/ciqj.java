package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciqj extends fcyz implements fdat {
    final /* synthetic */ ciqt a;
    final /* synthetic */ SelfIdentityId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciqj(ciqt ciqtVar, SelfIdentityId selfIdentityId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
        this.b = selfIdentityId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.j.e(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciqj(this.a, this.b, fcxyVar);
    }
}
