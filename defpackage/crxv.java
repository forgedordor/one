package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crxv extends fcyz implements fdat {
    int a;
    final /* synthetic */ crxy b;
    final /* synthetic */ cryl c;
    final /* synthetic */ csdl d;
    final /* synthetic */ eoeo e;
    final /* synthetic */ int f;
    final /* synthetic */ eoff g;
    final /* synthetic */ csdo h;
    final /* synthetic */ eykc i;
    final /* synthetic */ csdn j;
    final /* synthetic */ String k;
    final /* synthetic */ String l;
    final /* synthetic */ cspj m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxv(crxy crxyVar, cspj cspjVar, cryl crylVar, csdl csdlVar, eoeo eoeoVar, int i, eoff eoffVar, csdo csdoVar, eykc eykcVar, csdn csdnVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = crxyVar;
        this.m = cspjVar;
        this.c = crylVar;
        this.d = csdlVar;
        this.e = eoeoVar;
        this.f = i;
        this.g = eoffVar;
        this.h = csdoVar;
        this.i = eykcVar;
        this.j = csdnVar;
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crxv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        crxv crxvVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            crxvVar = this;
        } else {
            cryk crykVar = (cryk) this.b.a.b();
            cspj cspjVar = this.m;
            cryl crylVar = this.c;
            this.a = 1;
            crxvVar = this;
            obj = crykVar.k(cspjVar.c, cspjVar.e, cspjVar.f, crylVar, crxvVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        crxy crxyVar = crxvVar.b;
        csdl csdlVar = crxvVar.d;
        eoeo eoeoVar = crxvVar.e;
        int i2 = crxvVar.f;
        eoff eoffVar = crxvVar.g;
        eofc eofcVar = (eofc) obj;
        eoel eoelVarA = crxy.a(csdlVar, eoeoVar, i2);
        eoelVarA.copyOnWrite();
        eoem eoemVar = (eoem) eoelVarA.instance;
        eoem eoemVar2 = eoem.a;
        eoemVar.e = eoffVar.a();
        eoemVar.b |= 4;
        float fA = crxvVar.h.a();
        eoelVarA.copyOnWrite();
        eoem eoemVar3 = (eoem) eoelVarA.instance;
        eoemVar3.b |= 8;
        eoemVar3.f = fA;
        eykc eykcVar = crxvVar.i;
        eoelVarA.copyOnWrite();
        eoem eoemVar4 = (eoem) eoelVarA.instance;
        eoemVar4.g = eykcVar.a();
        eoemVar4.b |= 16;
        Set set = crxvVar.j.a;
        ArrayList arrayList = new ArrayList(fcva.p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((csdl) it.next()).a());
        }
        eoelVarA.a(arrayList);
        String str = crxvVar.k;
        eoelVarA.copyOnWrite();
        eoem eoemVar5 = (eoem) eoelVarA.instance;
        eoemVar5.b |= 128;
        eoemVar5.k = str;
        cczi ccziVar = crtr.a;
        if (crtr.h().booleanValue()) {
            String str2 = crxvVar.l;
            eoelVarA.copyOnWrite();
            eoem eoemVar6 = (eoem) eoelVarA.instance;
            eoemVar6.b |= 256;
            eoemVar6.l = str2;
        }
        eoem eoemVar7 = (eoem) eoelVarA.build();
        eofcVar.copyOnWrite();
        eofe eofeVar = (eofe) eofcVar.instance;
        eofe eofeVar2 = eofe.a;
        eoemVar7.getClass();
        eofeVar.d = eoemVar7;
        eofeVar.c = 4;
        cryb crybVar = (cryb) crxyVar.b.b();
        eoea eoeaVar = (eoea) eoeb.a.createBuilder();
        eoeaVar.copyOnWrite();
        eoeb eoebVar = (eoeb) eoeaVar.instance;
        eofe eofeVar3 = (eofe) eofcVar.build();
        eofeVar3.getClass();
        eoebVar.c = eofeVar3;
        eoebVar.b = 1;
        evsn evsnVarBuild = eoeaVar.build();
        evsnVarBuild.getClass();
        crybVar.b((eoeb) evsnVarBuild);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crxv(this.b, this.m, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, fcxyVar);
    }
}
