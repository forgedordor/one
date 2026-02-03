package com.google.android.libraries.messaging.lighter;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import defpackage.cdpo;
import defpackage.cdpp;
import defpackage.cdpq;
import defpackage.cdpr;
import defpackage.cdps;
import defpackage.dvhb;
import defpackage.dvhc;
import defpackage.dvhd;
import defpackage.dvhp;
import defpackage.dvhv;
import defpackage.dvie;
import defpackage.dvin;
import defpackage.dvio;
import defpackage.dvip;
import defpackage.dviq;
import defpackage.dviw;
import defpackage.dviy;
import defpackage.dvjb;
import defpackage.dvjd;
import defpackage.dvjj;
import defpackage.dvkp;
import defpackage.dvkv;
import defpackage.dvli;
import defpackage.dvlj;
import defpackage.dvll;
import defpackage.dvop;
import defpackage.dvoq;
import defpackage.dvor;
import defpackage.dvpk;
import defpackage.dvpn;
import defpackage.dvpv;
import defpackage.dvpy;
import defpackage.dvrd;
import defpackage.dvre;
import defpackage.dvtk;
import defpackage.dvtl;
import defpackage.dvtm;
import defpackage.dvxh;
import defpackage.dvxm;
import defpackage.dvyx;
import defpackage.dwcm;
import defpackage.dwcq;
import defpackage.dwdg;
import defpackage.dwdh;
import defpackage.dwdo;
import defpackage.dwds;
import defpackage.dwdt;
import defpackage.dwdz;
import defpackage.dwhr;
import defpackage.dwxd;
import defpackage.dzzh;
import defpackage.ejud;
import defpackage.ejvr;
import defpackage.ejwi;
import defpackage.ekgb;
import defpackage.ekoe;
import defpackage.eooq;
import defpackage.eoqg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Lighter implements dvhb {
    private static Lighter c;
    public final Context a;
    public final dviq b;
    private final dvjj d;
    private final dwcm e;
    private final dvyx f;
    private final dviw g;
    private final dvip h;
    private final dvin i;
    private final dviy j;
    private final Map k;
    private final dvrd l;
    private final dvio m;
    private final dvjd n;
    private final dwxd o;
    private final dvhd optionalLighterPackageInitializer;
    private final dvll p;
    private final dvoq q;
    private final dvtm r;
    private final dvpy s;

    private Lighter(cdpo cdpoVar, Context context, cdpp cdppVar, cdpq cdpqVar, cdpr cdprVar, cdps cdpsVar, ejwi ejwiVar, dvhd dvhdVar, ejwi ejwiVar2, ejwi ejwiVar3, Map map) {
        dvop dvopVar;
        dvpk dvpkVar;
        dvpn dvpnVar;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = dvjj.c();
        dzzh.f(applicationContext);
        dvtm dvtmVar = new dvtm(new dvre(applicationContext));
        this.r = dvtmVar;
        dvtk dvtkVar = new dvtk(applicationContext, dvtmVar);
        this.o = dvtkVar;
        if (dvhp.a == null) {
            dvhp.a = new dvhp(map);
        }
        dvyx dvyxVarA = dvyx.a(applicationContext);
        this.f = dvyxVarA;
        dvrd dvrdVar = new dvrd(applicationContext, dvyxVarA, ejwiVar3, ejwiVar);
        this.l = dvrdVar;
        HashMap map2 = new HashMap();
        this.k = map2;
        dvxh.a();
        dwcm dwcmVar = new dwcm(applicationContext, cdpoVar, new dvxm());
        this.e = dwcmVar;
        dwds dwdsVar = new dwds(applicationContext, dwcmVar, dvjj.c());
        dwdo dwdoVar = new dwdo(dwcmVar, applicationContext, map2);
        dwdh dwdhVar = new dwdh(dwcmVar, applicationContext);
        dwdg dwdgVar = new dwdg(dwcmVar);
        dwdt dwdtVar = new dwdt(dwcmVar);
        dvie.b();
        dvpk dvpkVar2 = new dvpk(map2, dwdsVar, dvtkVar, cdppVar, cdprVar, dvyxVarA, cdpsVar);
        dvop dvopVar2 = new dvop(applicationContext, dwdoVar, dvrdVar, new dvlj(dvrdVar), map2, dvyxVarA);
        dvli dvliVar = new dvli(applicationContext, dvrdVar, dwdhVar, dvyxVarA);
        dvpv dvpvVar = new dvpv(dwdoVar, dvrdVar);
        dvkp dvkpVar = new dvkp(dvrdVar, dwdgVar, new dvtl(applicationContext));
        int i = dvor.a;
        dvie.b();
        dvyx.a(applicationContext);
        dvll dvllVar = new dvll();
        dvpn dvpnVar2 = new dvpn(dvrdVar, dvyxVarA, dvopVar2);
        dwcmVar.e = dvpkVar2;
        dwcmVar.g = cdpqVar;
        dwcq dwcqVar = new dwcq(dwcmVar, applicationContext, dvyxVarA, map2);
        if (dvkv.a == null) {
            dvpkVar = dvpkVar2;
            dvopVar = dvopVar2;
            dvpnVar = dvpnVar2;
            dvkv.a = new dvkv(dvrdVar, dwcqVar, dvkpVar, dvopVar, dvyxVarA, cdpsVar);
        } else {
            dvopVar = dvopVar2;
            dvpkVar = dvpkVar2;
            dvpnVar = dvpnVar2;
        }
        dvhv.a("LitBstrpCntrl", "Initializing BootstrapController Instance");
        dvkv dvkvVar = dvkv.a;
        if (dvkvVar == null) {
            dvhv.c("LitBstrpCntrl", "No instance available, call initialize first.");
            throw new IllegalArgumentException("No instance available, please call initialize first.");
        }
        this.m = dvkvVar;
        dvpkVar.h = dvkvVar;
        dvpkVar.e = dvopVar;
        dvopVar.n = dvliVar;
        dvopVar.o = dvkpVar;
        dvopVar.p = dvpvVar;
        this.g = dvpkVar;
        this.b = dvopVar;
        this.h = dvliVar;
        this.i = dvkpVar;
        this.p = dvllVar;
        this.q = new dvoq();
        this.j = dvpvVar;
        this.s = new dvpy(dwdtVar);
        this.n = dvpnVar;
        this.optionalLighterPackageInitializer = dvhdVar;
        ekgb ekgbVar = dvhdVar.a;
        int i2 = ((ekoe) ekgbVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            dvhc dvhcVar = (dvhc) ekgbVar.get(i3);
            for (dwdz dwdzVar : dvhcVar.b(this.e, this.l, this.a)) {
                this.k.put(dwdzVar.b(), dwdzVar);
            }
            this.d.b(dvhcVar.a());
        }
        eooq.f(this.g.a(), new ejvr() { // from class: dvha
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String str;
                ekgb ekgbVar2 = (ekgb) obj;
                dvia.b();
                dcfe dcfeVar = ddys.a;
                Lighter lighter = this.a;
                Context context2 = lighter.a;
                new ddzn(context2).c(dvjw.a(context2), dvjs.a(context2).b, new String[]{"LIGHTER_ANDROID"}, null).s(new defb() { // from class: dvjx
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        if (defnVar.m()) {
                            dvhv.e("PhenotypeApiImplV12", "Phenotype registration succeeded");
                        } else {
                            dvhv.c("PhenotypeApiImplV12", "Phenotype registration failed");
                        }
                    }
                });
                Iterator<E> it = ekgbVar2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    }
                    dwje dwjeVar = (dwje) it.next();
                    if (dwpj.EMAIL.equals(((dwiq) dwjeVar.c().f()).c)) {
                        str = ((dwiq) dwjeVar.c().f()).a;
                        break;
                    }
                }
                dvhv.a("PhenotypeApiImplV12", "Retrieve experiment configurations");
                new dvjy(new ddzn(context2), dvjw.a(context2)).e(str, 3);
                lighter.b.c(ekgbVar2);
                return null;
            }
        }, eoqg.a);
    }

    public static synchronized Lighter j(cdpo cdpoVar, Context context, cdpp cdppVar, cdpq cdpqVar, cdpr cdprVar, cdps cdpsVar, dvjb dvjbVar, dvhd dvhdVar, Map map) {
        ejwi ejwiVarJ;
        ejud ejudVar;
        ejwiVarJ = ejwi.j(dvjbVar);
        ejudVar = ejud.a;
        return m(cdpoVar, context, cdppVar, cdpqVar, cdprVar, cdpsVar, ejwiVarJ, dvhdVar, ejudVar, ejudVar, ejudVar, map);
    }

    private static synchronized Lighter m(cdpo cdpoVar, Context context, cdpp cdppVar, cdpq cdpqVar, cdpr cdprVar, cdps cdpsVar, ejwi ejwiVar, dvhd dvhdVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, Map map) {
        Lighter lighter = c;
        if (lighter == null) {
            Lighter lighter2 = new Lighter(cdpoVar, context, cdppVar, cdpqVar, cdprVar, cdpsVar, ejwiVar, dvhdVar, ejwiVar2, ejwiVar3, map);
            c = lighter2;
            if (lighter2.optionalLighterPackageInitializer != null) {
                return lighter2;
            }
            lighter = lighter2;
        }
        return lighter;
    }

    @Override // defpackage.dvhb
    public final dvin a() {
        return this.i;
    }

    @Override // defpackage.dvhb
    public final dvip b() {
        return this.h;
    }

    @Override // defpackage.dvhb
    public final dviq c() {
        return this.b;
    }

    @Override // defpackage.dvhb
    public final dviw d() {
        return this.g;
    }

    @Override // defpackage.dvhb
    public final dviy e() {
        return this.j;
    }

    @Override // defpackage.dvhb
    public final dvjd f() {
        return this.n;
    }

    protected final void finalize() {
        eooq.f(this.g.a(), new ejvr() { // from class: dvgz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvhv.a("Lighter", "finalizing");
                this.a.b.f((ekgb) obj);
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.dvhb
    public final dwhr g() {
        return this.f;
    }

    @Override // defpackage.dvhb
    public final dvll h() {
        return this.p;
    }

    @Override // defpackage.dvhb
    public final dvoq i() {
        return this.q;
    }

    @Override // defpackage.dvhb
    public final dvpy l() {
        return this.s;
    }

    @Override // defpackage.dvhb
    public final void k() {
    }
}
