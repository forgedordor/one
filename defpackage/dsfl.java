package defpackage;

import android.content.Intent;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfl extends fcyz implements fdat {
    int a;
    final /* synthetic */ dsfm b;
    final /* synthetic */ dsbi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfl(dsfm dsfmVar, dsbi dsbiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dsfmVar;
        this.c = dsbiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsfl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            try {
                if (this.a != 0) {
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    dsfm dsfmVar = this.b;
                    dssw dsswVar = (dssw) dsfmVar.d.b();
                    if (dsswVar == null) {
                        dsbr dsbrVar = dsfmVar.e;
                        dsbi dsbiVar = this.c;
                        dsbrVar.a(dsbiVar, "GrowthKitCallbacks not found.", new Object[0]);
                        dsfmVar.f.e(dsbiVar, evok.PROMO_NOT_SHOWN_CLIENT_CALLBACK_NOT_REGISTERED);
                        return false;
                    }
                    if (!fbcn.b() && dsbe.b(dsfmVar.c)) {
                        dsbr dsbrVar2 = dsfmVar.e;
                        dsbi dsbiVar2 = this.c;
                        dsbrVar2.a(dsbiVar2, "Accessibility is enabled, not displaying.", new Object[0]);
                        dsfmVar.f.e(dsbiVar2, evok.PROMO_NOT_SHOWN_ACCESSIBILITY_ENABLED);
                        return false;
                    }
                    eg egVarA = dsswVar.a();
                    dson dsonVar = dsfmVar.h;
                    if (dsonVar.e()) {
                        dsbr dsbrVar3 = dsfmVar.e;
                        dsbi dsbiVar3 = this.c;
                        dsbrVar3.a(dsbiVar3, "Not showing as a promotion is already presented or being shown.", new Object[0]);
                        dsfmVar.f.e(dsbiVar3, evok.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                        ((eksl) dsfm.a.h()).q("Not showing promotion, as a promotion is already presented or being shown.");
                        return false;
                    }
                    for (String str : dsfm.b) {
                        if (egVarA.a().h(str) != null) {
                            dsbr dsbrVar4 = dsfmVar.e;
                            dsbi dsbiVar4 = this.c;
                            dsbrVar4.a(dsbiVar4, "Not showing as a promotion is already presented.", new Object[0]);
                            dsfmVar.f.e(dsbiVar4, evok.PROMO_NOT_SHOWN_ALREADY_PRESENTING);
                            ((eksl) dsfm.a.h()).t("Not showing promotion, as %s promotion is already presented.", str);
                            return false;
                        }
                    }
                    dsbi dsbiVar5 = this.c;
                    ethk ethkVarC = dsbiVar5.c();
                    etnj etnjVar = ethkVarC.f;
                    if (etnjVar == null) {
                        etnjVar = etnj.a;
                    }
                    etnjVar.getClass();
                    int iB = dsbk.b(etnjVar);
                    etnj etnjVar2 = ethkVarC.f;
                    if (etnjVar2 == null) {
                        etnjVar2 = etnj.a;
                    }
                    etnjVar2.getClass();
                    String str2 = "";
                    if ((etnjVar2.c == 3 ? (etnx) etnjVar2.d : etnx.a).c == 1) {
                        etnx etnxVar = etnjVar2.c == 3 ? (etnx) etnjVar2.d : etnx.a;
                        if (etnxVar.c == 1) {
                            str2 = (String) etnxVar.d;
                        }
                    } else {
                        int i = etnjVar2.c;
                        if (i == 3) {
                            etnx etnxVar2 = (etnx) etnjVar2.d;
                            if (etnxVar2.c == 10) {
                                str2 = (String) etnxVar2.d;
                            }
                        } else if ((i == 5 ? (etoh) etnjVar2.d : etoh.a).c == 1) {
                            etoh etohVar = etnjVar2.c == 5 ? (etoh) etnjVar2.d : etoh.a;
                            if (etohVar.c == 1) {
                                str2 = (String) etohVar.d;
                            }
                        } else if (etnjVar2.c == 5) {
                            etoh etohVar2 = (etoh) etnjVar2.d;
                            if (etohVar2.c == 8) {
                                str2 = (String) etohVar2.d;
                            }
                        } else {
                            str2 = null;
                        }
                    }
                    dssl dsslVar = new dssl();
                    dsslVar.c = iB;
                    dsslVar.a = str2;
                    if (dsslVar.b == null) {
                        dsslVar.b = new ekgi();
                    }
                    ekgi ekgiVar = dsslVar.b;
                    ekgp ekgpVarB = dsbiVar5.b();
                    ekgpVarB.getClass();
                    Iterator it = ekgpVarB.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Object key = entry.getKey();
                        key.getClass();
                        Object value = entry.getValue();
                        value.getClass();
                        ekgiVar.i(dsbk.a((etli) key), (Intent) value);
                    }
                    dssv dssvVarB = dsswVar.b(dsslVar.a());
                    if (!dssvVarB.a) {
                        dsfmVar.e.c(dsbiVar5, "Rejected by GrowthKitCallbacks [%s].", dsswVar.getClass().getSimpleName());
                        dsfmVar.f.o(dsbiVar5, dssvVarB.b);
                        return false;
                    }
                    etns etnsVarA = dspi.a(dsfmVar.c);
                    etnsVarA.getClass();
                    dsonVar.c(dsbiVar5, etnsVarA, egVarA);
                    if (iB == 6) {
                        etnj etnjVar3 = dsbiVar5.c().f;
                        if (etnjVar3 == null) {
                            etnjVar3 = etnj.a;
                        }
                        int iA = etnz.a((etnjVar3.c == 5 ? (etoh) etnjVar3.d : etoh.a).l);
                        if (iA == 0) {
                            iA = 1;
                        }
                        if (iA - 1 == 2) {
                            dsor dsorVar = dsfmVar.i;
                            this.a = 1;
                            if (dsorVar.a(dsbiVar5, this) == fcylVar) {
                                return fcylVar;
                            }
                        }
                    }
                    dsoi dsoiVar = dsfmVar.g;
                    etnj etnjVar4 = ethkVarC.f;
                    if (etnjVar4 == null) {
                        etnjVar4 = etnj.a;
                    }
                    dsoiVar.b(egVarA, dsoiVar.a(egVarA, etnjVar4), dsbiVar5, etnsVarA);
                }
                return true;
            } catch (Exception e) {
                e = e;
                dsfm dsfmVar2 = this.b;
                dsbi dsbiVar6 = this.c;
                dsfmVar2.e.e(dsbiVar6, e, new Object[0]);
                dsfmVar2.f.e(dsbiVar6, evok.PROMO_NOT_SHOWN_INTERNAL_ERROR);
                dsfmVar2.h.d(dsbiVar6);
                return false;
            }
        } catch (Exception e2) {
            e = e2;
            dsfm dsfmVar22 = this.b;
            dsbi dsbiVar62 = this.c;
            dsfmVar22.e.e(dsbiVar62, e, new Object[0]);
            dsfmVar22.f.e(dsbiVar62, evok.PROMO_NOT_SHOWN_INTERNAL_ERROR);
            dsfmVar22.h.d(dsbiVar62);
            return false;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dsfl(this.b, this.c, fcxyVar);
    }
}
