package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspd implements dsoj, dson {
    public final fcyh d;
    public final eygg e;
    public final String f;
    public final dsbr g;
    public final dsah h;
    public final dsoq i;
    private final fcsu k;
    public static final eksp a = eksp.c("GnpSdk");
    private static final Set j = new LinkedHashSet();
    public static final Map b = new LinkedHashMap();
    public static final Map c = new LinkedHashMap();

    public dspd(fcyh fcyhVar, eygg eyggVar, String str, dsbr dsbrVar, dsah dsahVar, dsoq dsoqVar, fcsu fcsuVar) {
        fcyhVar.getClass();
        eyggVar.getClass();
        str.getClass();
        dsbrVar.getClass();
        dsahVar.getClass();
        dsoqVar.getClass();
        fcsuVar.getClass();
        this.d = fcyhVar;
        this.e = eyggVar;
        this.f = str;
        this.g = dsbrVar;
        this.h = dsahVar;
        this.i = dsoqVar;
        this.k = fcsuVar;
    }

    @Override // defpackage.dsoj
    public final Object a(dsbi dsbiVar, etjv etjvVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.d, new dspb(etjvVar, this, dsbiVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dsoj
    public final Object b(dsbi dsbiVar, dsoo dsooVar, fcxy fcxyVar) {
        Object objA = fdin.a(this.d, new dspc(dsbiVar, this, dsooVar, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dson
    public final void c(dsbi dsbiVar, etns etnsVar, eg egVar) {
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        String strB = dskj.b(ethtVar);
        b.put(strB, etnsVar);
        c.put(strB, egVar);
        Set set = j;
        strB.getClass();
        set.add(strB);
    }

    @Override // defpackage.dson
    public final void d(dsbi dsbiVar) {
        etht ethtVar = dsbiVar.c().c;
        if (ethtVar == null) {
            ethtVar = etht.a;
        }
        String strB = dskj.b(ethtVar);
        j.remove(strB);
        b.remove(strB);
        c.remove(strB);
    }

    @Override // defpackage.dson
    public final boolean e() {
        return fcva.ay(j);
    }

    public final void f(dsbi dsbiVar, dsoo dsooVar) {
        if (((dssw) this.k.b()) == null) {
            ((eksl) a.j()).q("Can't report an impression to collaborator as no callback was provided");
            return;
        }
        dssl dsslVar = new dssl();
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        etnjVar.getClass();
        dsslVar.c = dsbk.b(etnjVar);
        dssu dssuVarA = dsslVar.a();
        if (dsooVar == dsoo.SUCCESS) {
            a.o().t("Reporting an impression to the collaborator's callback - %s", dssuVarA);
        } else {
            a.o().t("Reporting rendering failure to the collaborator's callback - %s", dssuVarA);
            dsooVar.toString();
        }
    }
}
