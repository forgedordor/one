package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ysq extends fcyz implements fdat {
    final /* synthetic */ yss a;
    final /* synthetic */ MessageId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysq(yss yssVar, MessageId messageId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = yssVar;
        this.b = messageId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ysq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        auvh.f(this.a.d.T(this.b), "Failed to load link preview");
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ysq(this.a, this.b, fcxyVar);
    }
}
