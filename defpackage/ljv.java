package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljv extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljv(List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ljv) c((lkj) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            lkj lkjVar = (lkj) this.b;
            List list = this.c;
            ljz ljzVar = lka.a;
            this.a = 1;
            if (ljzVar.a(list, lkjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ljv ljvVar = new ljv(this.c, fcxyVar);
        ljvVar.b = obj;
        return ljvVar;
    }
}
