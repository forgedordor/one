package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doru extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dosd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doru(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        final String str = null;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dosd dosdVar = this.c;
            adgp adgpVarBk = dosdVar.bk();
            addy addyVar = dosdVar.ao;
            if (addyVar == null) {
                fdbq.c("accountSignIn");
                addyVar = null;
            }
            this.a = adgpVarBk;
            this.b = 1;
            obj = addyVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = adgpVarBk;
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str2 = this.c.al;
        if (str2 == null) {
            fdbq.c("mimeType");
        } else {
            str = str2;
        }
        str.getClass();
        ((aivg) obj2).k(new Supplier() { // from class: adgk
            @Override // java.util.function.Supplier
            public final Object get() {
                endl endlVar = (endl) endm.a.createBuilder();
                endlVar.getClass();
                endj endjVar = (endj) endk.a.createBuilder();
                endjVar.getClass();
                endo endoVarA = adgf.a(zBooleanValue, str);
                endjVar.copyOnWrite();
                endk endkVar = (endk) endjVar.instance;
                endkVar.c = endoVarA;
                endkVar.b |= 1;
                evsn evsnVarBuild = endjVar.build();
                evsnVarBuild.getClass();
                endlVar.copyOnWrite();
                endm endmVar = (endm) endlVar.instance;
                endmVar.c = (endk) evsnVarBuild;
                endmVar.b = 1;
                return enrr.a(endlVar);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doru(this.c, fcxyVar);
    }
}
