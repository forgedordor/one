package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vnw extends fcyz implements fdat {
    int a;
    final /* synthetic */ vod b;
    final /* synthetic */ ResolvedRecipient c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnw(vod vodVar, ResolvedRecipient resolvedRecipient, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vodVar;
        this.c = resolvedRecipient;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vnw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vod vodVar = this.b;
            eiju eijuVarB = ((ajln) vodVar.e.b()).B(vodVar.c.d(), this.c, crvz.d);
            eijuVarB.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vnw(this.b, this.c, fcxyVar);
    }
}
