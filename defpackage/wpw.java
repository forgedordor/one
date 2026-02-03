package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wpw extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpw(wqd wqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpw) c((Instant) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        final wqd wqdVar = this.b;
        fdae fdaeVar = new fdae() { // from class: wpv
            @Override // defpackage.fdae
            public final Object invoke() {
                return avnt.a(wqdVar.b);
            }
        };
        this.a = 1;
        Object objC = wqdVar.c(fdaeVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wpw(this.b, fcxyVar);
    }
}
