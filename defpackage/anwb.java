package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwb extends fcyz implements fdat {
    final /* synthetic */ anwf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwb(anwf anwfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anwfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anwb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        anwf anwfVar = this.a;
        alqm alqmVar = anwfVar.d;
        if (!alqmVar.A()) {
            return Optional.empty();
        }
        ekgb ekgbVarZ = anwf.d(alqmVar.o()).z();
        ekgbVarZ.getClass();
        bktm bktmVar = (bktm) fcva.P(ekgbVarZ);
        if (bktmVar == null) {
            return Optional.empty();
        }
        return Optional.of(new anvx(bktmVar));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anwb(this.a, fcxyVar);
    }
}
