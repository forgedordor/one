package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyv extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjzf b;
    final /* synthetic */ dggn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjyv(fcxy fcxyVar, cjzf cjzfVar, dggn dggnVar) {
        super(2, fcxyVar);
        this.b = cjzfVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjyv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cjzf cjzfVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            cjzfVar = (cjzf) this.d;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cjzf cjzfVar2 = this.b;
            this.d = cjzfVar2;
            this.a = 1;
            Object objM = cjzfVar2.m(this);
            if (objM == fcylVar) {
                return fcylVar;
            }
            cjzfVar = cjzfVar2;
            obj = objM;
        }
        Map mapP = cjzfVar.p((cjzm) obj);
        dggn dggnVar = this.c;
        dfir dfirVar = dfir.a;
        dfirVar.getClass();
        return Map.EL.getOrDefault(mapP, dggnVar, dfirVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cjyv cjyvVar = new cjyv(fcxyVar, this.b, this.c);
        cjyvVar.d = obj;
        return cjyvVar;
    }
}
