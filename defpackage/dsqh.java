package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsqh extends dn {
    public static final eksp ag = eksp.c("GnpSdk");
    public Map ai;
    public dsoq aj;
    public dxgk ak;
    public Context al;
    public dsqg am;
    public dsbi an;
    public dsom ap;
    public ahnd aq;
    private Handler ar;
    private etns as;
    boolean ah = false;
    public Boolean ao = false;

    public static dsqh aV(dsbi dsbiVar, etns etnsVar) {
        dsqh dsqhVar = new dsqh();
        Bundle bundle = new Bundle();
        bundle.putParcelable("promo_context", dsbiVar);
        bundle.putInt("theme", etnsVar.d);
        dsqhVar.at(bundle);
        return dsqhVar;
    }

    private final dsog aW(dsbi dsbiVar) {
        etnj etnjVar = dsbiVar.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        Map map = this.ai;
        etni etniVarB = etni.b(etnjVar.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        fcsu fcsuVar = (fcsu) map.get(etniVarB);
        if (fcsuVar != null) {
            return (dsog) fcsuVar.b();
        }
        ((eksl) ((eksl) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "getDialogBuilder", 222, "PromoUiDialogFragment.java")).t("DialogBuilder called with a non-dialog uiType: %s", etnjVar);
        this.ap.b(dsbiVar, dsoo.FAILED_UNSUPPORTED_UI);
        return null;
    }

    private final void aX(final dsoh dsohVar, final eg egVar, final dsbi dsbiVar) {
        ArrayList arrayList = dsohVar.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setOnClickListener(new View.OnClickListener() { // from class: dsqc
                /* JADX WARN: Removed duplicated region for block: B:56:0x01c6 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:3:0x0013, B:6:0x0031, B:8:0x003f, B:9:0x0041, B:11:0x004d, B:12:0x004f, B:13:0x0058, B:15:0x005e, B:23:0x0079, B:25:0x0093, B:27:0x009a, B:26:0x0098, B:28:0x00a5, B:30:0x00ca, B:31:0x00f1, B:33:0x00f7, B:34:0x011e, B:36:0x0128, B:37:0x0156, B:39:0x015a, B:40:0x0185, B:42:0x018b, B:44:0x0191, B:46:0x0198, B:48:0x019c, B:50:0x01a3, B:52:0x01ab, B:53:0x01ad, B:55:0x01b3, B:57:0x01e5, B:49:0x01a1, B:45:0x0196, B:56:0x01c6, B:58:0x01ed), top: B:67:0x0013 }] */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r10) {
                    /*
                        Method dump skipped, instructions count: 530
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dsqc.onClick(android.view.View):void");
                }
            });
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((drzh) ((fcsu) dxkg.a(context).fL().get(dsqh.class)).b()).a(this);
            this.ah = true;
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) ag.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "onAttach", '{', "PromoUiDialogFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Dialog dialog = null;
        if (this.ah) {
            eg egVarG = G();
            dsbi dsbiVar = this.an;
            etns etnsVar = this.as;
            dsog dsogVarAW = aW(dsbiVar);
            if (dsogVarAW != null) {
                etnj etnjVar = dsbiVar.c().f;
                if (etnjVar == null) {
                    etnjVar = etnj.a;
                }
                dsoh dsohVarA = dsogVarAW.a(egVarG, etnjVar, etnsVar, new Runnable() { // from class: dsqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        dsqh dsqhVar = this.a;
                        if (!dsqhVar.ao.booleanValue()) {
                            dsqhVar.ap.b(dsqhVar.an, dsoo.SUCCESS);
                        }
                        dsqhVar.ao = true;
                    }
                });
                if (dsohVarA == null) {
                    ((eksl) ((eksl) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "buildDialog", 168, "PromoUiDialogFragment.java")).q("Failed to build dialog.");
                    this.ap.b(dsbiVar, dsoo.FAILED_UNKNOWN);
                } else {
                    aX(dsohVarA, egVarG, dsbiVar);
                    dialog = dsohVarA.a;
                }
            }
        }
        if (dialog != null) {
            return dialog;
        }
        final iv ivVarCreate = new iu(z()).create();
        this.ar.post(new Runnable() { // from class: dsqd
            @Override // java.lang.Runnable
            public final void run() {
                ivVarCreate.dismiss();
            }
        });
        return ivVarCreate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ar = new Handler();
        this.ao = Boolean.valueOf(bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED"));
        if (this.ah) {
            Bundle bundle2 = this.m;
            bundle2.setClassLoader(dsbi.class.getClassLoader());
            this.an = (dsbi) bundle2.getParcelable("promo_context");
            this.as = etns.b(bundle2.getInt("theme", etns.UNSPECIFIED.d));
        }
        etnj etnjVar = this.an.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        if (Collection.EL.stream((etnjVar.c == 2 ? (etly) etnjVar.d : etly.a).h).anyMatch(new Predicate() { // from class: dsqb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                etlk etlkVar = (etlk) obj;
                eksp ekspVar = dsqh.ag;
                etla etlaVar = etlkVar.c == 14 ? (etla) etlkVar.d : etla.a;
                return (etlaVar.b == 3 ? (etme) etlaVar.c : etme.a).d;
            }
        })) {
            dsqg dsqgVar = (dsqg) new lxo(this).a(dsqg.class);
            this.am = dsqgVar;
            dsbi dsbiVar = this.an;
            ahnd ahndVar = this.aq;
            if (dsqgVar.a != null || dsbiVar.e() == null) {
                return;
            }
            etnj etnjVar2 = dsbiVar.c().f;
            if (etnjVar2 == null) {
                etnjVar2 = etnj.a;
            }
            Stream streamFilter = Collection.EL.stream((etnjVar2.c == 2 ? (etly) etnjVar2.d : etly.a).h).filter(new Predicate() { // from class: dsqf
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    etlk etlkVar = (etlk) obj;
                    etla etlaVar = etlkVar.c == 14 ? (etla) etlkVar.d : etla.a;
                    return !(etlaVar.b == 3 ? (etme) etlaVar.c : etme.a).c.isEmpty();
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) streamFilter.collect(ekcv.a);
            if (ekgbVar.size() > 1) {
                ((eksl) ((eksl) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment$AuthCustomTabsViewModel", "initializeAndPrefetchAuthToken", 335, "PromoUiDialogFragment.java")).q("Found more than one action with in-app browser redirect, using the first one.");
            }
            etlk etlkVar = (etlk) ekgbVar.get(0);
            String strE = dsbiVar.e();
            etla etlaVar = etlkVar.c == 14 ? (etla) etlkVar.d : etla.a;
            etme etmeVar = etlaVar.b == 3 ? (etme) etlaVar.c : etme.a;
            ahkn ahknVar = ahndVar.a.a;
            String str = etmeVar.c;
            Context context = (Context) ahknVar.t.b();
            ahnh ahnhVar = ahknVar.a;
            dsqgVar.a = new dxlj(context, (fdjx) ahnhVar.m.b(), (dxlw) ahnhVar.vq.b(), (dxtx) ahknVar.hg.b(), strE, str);
            etla etlaVar2 = etlkVar.c == 14 ? (etla) etlkVar.d : etla.a;
            if ((etlaVar2.b == 3 ? (etme) etlaVar2.c : etme.a).d) {
                dxlh dxlhVar = dsqgVar.a;
                eksp ekspVar = dxlj.a;
                dxlj dxljVar = (dxlj) dxlhVar;
                ((eksl) ekspVar.h()).D("Prefetching auth token for account: %s, url: %s", dxljVar.f, dxljVar.g);
                if (dxljVar.h != null) {
                    ((eksl) ekspVar.h()).q("Auth token job was already started, skipping prefetch");
                } else {
                    dxljVar.h = fdil.c(dxljVar.c, null, new dxli(dxljVar, null), 3);
                }
            }
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.ao.booleanValue());
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ap.a(this.an, etjv.DISMISSED);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dsog dsogVarAW = aW(this.an);
        if (dsogVarAW == null) {
            return;
        }
        eg egVarG = G();
        Dialog dialog = this.d;
        etnj etnjVar = this.an.c().f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        dsoh dsohVarB = dsogVarAW.b(egVarG, dialog, etnjVar, this.as, configuration);
        if (dsohVarB != null) {
            aX(dsohVarB, G(), this.an);
        } else {
            ((eksl) ((eksl) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "onConfigurationChanged", 140, "PromoUiDialogFragment.java")).q("Failed to build dialog.");
            this.ap.b(this.an, dsoo.FAILED_UNKNOWN);
        }
    }
}
