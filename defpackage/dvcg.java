package defpackage;

import j$.util.DesugarCollections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvcg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dvcp b;
    final /* synthetic */ agh c;
    final /* synthetic */ aet d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvcg(dvcp dvcpVar, agh aghVar, aet aetVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dvcpVar;
        this.c = aghVar;
        this.d = aetVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dvcg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dvcp dvcpVar = this.b;
            agh aghVar = this.c;
            aet aetVar = this.d;
            this.a = 1;
            css cssVar = new css((byte[]) null);
            Set setKeySet = DesugarCollections.unmodifiableMap(aetVar.a).keySet();
            for (afv afvVar : aghVar.a()) {
                if (setKeySet.contains(afvVar.k())) {
                    afvVar.getClass();
                    dvcpVar.h(afvVar, cssVar);
                }
            }
            for (afv afvVar2 : aghVar.b()) {
                if (setKeySet.contains(afvVar2.k())) {
                    afvVar2.getClass();
                    dvcpVar.h(afvVar2, cssVar);
                }
            }
            Object objD = dvcpVar.d(cssVar, this);
            if (objD != fcylVar) {
                objD = fctx.a;
            }
            if (objD == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dvcg(this.b, this.c, this.d, fcxyVar);
    }
}
