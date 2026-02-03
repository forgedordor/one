package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyu extends fcyz implements fdat {
    final /* synthetic */ dlzc a;
    final /* synthetic */ dbgm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlyu(dlzc dlzcVar, dbgm dbgmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlzcVar;
        this.b = dbgmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dlyu) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Map map = this.b.d.c;
        map.getClass();
        this.a.c.a(map);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlyu(this.a, this.b, fcxyVar);
    }
}
