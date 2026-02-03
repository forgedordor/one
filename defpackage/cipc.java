package defpackage;

import android.os.BatteryManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipc extends fcyz implements fdat {
    final /* synthetic */ ciph a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cipc(fcxy fcxyVar, ciph ciphVar) {
        super(2, fcxyVar);
        this.a = ciphVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cipc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ciph ciphVar = this.a;
        return Boolean.valueOf(((long) ((BatteryManager) ciphVar.i.a()).getIntProperty(4)) < ((Number) ciphVar.b.b()).longValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cipc cipcVar = new cipc(fcxyVar, this.a);
        cipcVar.b = obj;
        return cipcVar;
    }
}
