package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wye extends fcyz implements fdat {
    int a;
    final /* synthetic */ wyf b;
    final /* synthetic */ Instant c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wye(wyf wyfVar, Instant instant, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wyfVar;
        this.c = instant;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wye) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            wyf wyfVar = this.b;
            Instant instant = this.c;
            this.a = 1;
            if (wyfVar.c(instant, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new wye(this.b, this.c, fcxyVar);
    }
}
