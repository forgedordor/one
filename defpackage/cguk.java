package defpackage;

import android.location.Location;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cguk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cgum b;
    final /* synthetic */ Location c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cguk(cgum cgumVar, Location location, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cgumVar;
        this.c = location;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cguk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cgum cgumVar = this.b;
            cguj cgujVar = new cguj(this.c, null);
            this.a = 1;
            if (cgumVar.d.a(cgujVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cguk(this.b, this.c, fcxyVar);
    }
}
