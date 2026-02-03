package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ebf extends fcyz implements fdat {
    int a;
    final /* synthetic */ hox b;
    final /* synthetic */ ebk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebf(ebk ebkVar, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ebkVar;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ebf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ArrayList arrayList = new ArrayList();
            ebk ebkVar = this.c;
            ebe ebeVar = new ebe(arrayList, this.b);
            this.a = 1;
            if (fdum.g((fdum) ebkVar.a, ebeVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ebf(this.c, this.b, fcxyVar);
    }
}
