package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class annl extends fcyz implements fdat {
    int a;
    final /* synthetic */ annn b;
    final /* synthetic */ Instant c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public annl(annn annnVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = annnVar;
        this.c = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((annl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        annn annnVar = this.b;
        Instant instant = this.c;
        this.a = 1;
        if (annnVar.b(instant, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new annl(this.b, this.c, fcxyVar);
    }
}
