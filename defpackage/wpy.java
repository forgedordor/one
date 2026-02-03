package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wpy extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wqd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpy(wqd wqdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = wqdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpy) c((Instant) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Instant instant;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            instant = (Instant) this.b;
            final wqd wqdVar = this.c;
            fdae fdaeVar = new fdae() { // from class: wpx
                @Override // defpackage.fdae
                public final Object invoke() {
                    return avnt.c(wqdVar.b);
                }
            };
            this.b = instant;
            this.a = 1;
            obj = wqdVar.c(fdaeVar, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            Object obj2 = this.b;
            fctl.b(obj);
            return obj2;
        }
        instant = (Instant) this.b;
        fctl.b(obj);
        wqd wqdVar2 = this.c;
        this.b = obj;
        this.a = 2;
        Object objA = fdin.a(wqdVar2.c, new wqc(instant, wqdVar2, null), this);
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        return objA != fcylVar ? obj : fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wpy wpyVar = new wpy(this.c, fcxyVar);
        wpyVar.b = obj;
        return wpyVar;
    }
}
