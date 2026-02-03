package defpackage;

import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciql extends fcyz implements fdat {
    final /* synthetic */ ciqt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciql(ciqt ciqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = ciqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciql) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ciqt ciqtVar = this.a;
        return Boolean.valueOf(((long) ((BatteryManager) ciqtVar.p.a()).getIntProperty(4)) < ((Number) ciqtVar.l.b()).longValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciql(this.a, fcxyVar);
    }
}
