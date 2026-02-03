package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qms extends fcyz implements fdat {
    final /* synthetic */ qjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qms(qjn qjnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = qjnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qms) c((qga) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String str = qmt.a;
        qas qasVarC = qas.c();
        qjn qjnVar = this.a;
        Objects.toString(qjnVar);
        qasVarC.a(str, "Constraints changed for ".concat(String.valueOf(qjnVar)));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qms(this.a, fcxyVar);
    }
}
