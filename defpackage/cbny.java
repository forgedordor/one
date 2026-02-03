package defpackage;

import j$.time.Instant;
import j$.util.DateRetargetClass;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbny extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ Instant b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbny(Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cbny) c((cbdg) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(DateRetargetClass.toInstant(((cbdg) this.a).s()).isBefore(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cbny cbnyVar = new cbny(this.b, fcxyVar);
        cbnyVar.a = obj;
        return cbnyVar;
    }
}
