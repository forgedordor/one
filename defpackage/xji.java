package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xji extends fcyz implements fdat {
    final /* synthetic */ xjo a;
    final /* synthetic */ RichLocation b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xji(xjo xjoVar, RichLocation richLocation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = xjoVar;
        this.b = richLocation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.e.f(this.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xji(this.a, this.b, fcxyVar);
    }
}
