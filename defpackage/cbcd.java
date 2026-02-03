package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbcd extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbcd(String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbcd) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Map map = (Map) this.a;
        return Boolean.valueOf((map != null ? (cbbk) map.get(this.b) : null) == cbbk.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbcd cbcdVar = new cbcd(this.b, fcxyVar);
        cbcdVar.a = obj;
        return cbcdVar;
    }
}
