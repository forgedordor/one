package defpackage;

import com.google.android.apps.messaging.shared.util.block.BlockedNumbersJob;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpij extends fcyz implements fdat {
    final /* synthetic */ cpik a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpij(cpik cpikVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cpikVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpij) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cpik cpikVar = this.a;
        ((cpii) cpikVar.b.b()).d();
        BlockedNumbersJob.c(cpikVar.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpij(this.a, fcxyVar);
    }
}
