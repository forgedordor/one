package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aocu extends fcyz implements fdat {
    int a;
    final /* synthetic */ aocw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aocu(aocw aocwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aocwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aocu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aocw aocwVar = this.b;
            this.a = 1;
            obj = aocwVar.i(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable((aoer) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aocu(this.b, fcxyVar);
    }
}
