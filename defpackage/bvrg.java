package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvrg extends fcyz implements fdat {
    int a;
    final /* synthetic */ bvsb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvrg(bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvrg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            bvsb bvsbVar = this.b;
            Object objB = bvsbVar.m.b();
            objB.getClass();
            Iterable iterable = (Iterable) objB;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!((bvmk) it.next()).c()) {
                        return false;
                    }
                }
            }
            cmfo cmfoVarN = bvsbVar.n();
            this.a = 1;
            obj = cmfoVarN.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((bvqr) obj).j);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvrg(this.b, fcxyVar);
    }
}
