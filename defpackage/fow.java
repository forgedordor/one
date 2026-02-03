package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fow extends fcyz implements fdat {
    int a;
    final /* synthetic */ fqa b;
    final /* synthetic */ ebk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fow(ebk ebkVar, fqa fqaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ebkVar;
        this.b = fqaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fow) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdjx fdjxVar = (fdjx) this.d;
            ArrayList arrayList = new ArrayList();
            ebk ebkVar = this.c;
            fov fovVar = new fov(arrayList, fdjxVar, this.b);
            this.a = 1;
            if (fdum.g((fdum) ebkVar.a, fovVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fow fowVar = new fow(this.c, this.b, fcxyVar);
        fowVar.d = obj;
        return fowVar;
    }
}
