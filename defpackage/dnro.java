package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnro extends dnse {
    public static final /* synthetic */ int aj = 0;
    private static final ekrg ak = ekrg.c("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen");
    public dnkk a;
    public dnrb ag;
    public dnsj ah;
    public dnsf ai;
    private final dpxe al;
    private final fctc am;
    public ejwi b;
    public dnsk c;
    public dnna d;
    public dnsb e;

    public dnro() {
        super(new dnov(null, null, 255));
        this.al = dpxe.b;
        this.am = fctd.a(new fdae() { // from class: dnrj
            @Override // defpackage.fdae
            public final Object invoke() {
                dnsf dnsfVar;
                final dnro dnroVar = this.a;
                dnsb dnsbVar = dnroVar.e;
                if (dnsbVar == null) {
                    fdbq.c("stateManagerFactory");
                    dnsbVar = null;
                }
                dnsf dnsfVar2 = dnroVar.ai;
                if (dnsfVar2 == null) {
                    fdbq.c("views");
                    dnsfVar = null;
                } else {
                    dnsfVar = dnsfVar2;
                }
                fdae fdaeVar = new fdae() { // from class: dnrf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return dnroVar.bP();
                    }
                };
                fdae fdaeVar2 = new fdae() { // from class: dnrg
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return dnroVar.bM();
                    }
                };
                dnrn dnrnVar = new dnrn(dnroVar);
                dnov dnovVar = (dnov) dnroVar.bC();
                Context context = (Context) dnsbVar.a.b();
                context.getClass();
                ea eaVar = (ea) ((eyig) dnsbVar.b).a;
                fdjx fdjxVar = (fdjx) dnsbVar.c.b();
                fdjxVar.getClass();
                eosc eoscVar = (eosc) dnsbVar.d.b();
                eoscVar.getClass();
                drob drobVar = (drob) dnsbVar.e.b();
                drobVar.getClass();
                dnsd dnsdVar = (dnsd) dnsbVar.f.b();
                dnsdVar.getClass();
                Optional optional = (Optional) dnsbVar.g.b();
                dnsfVar.getClass();
                dnovVar.getClass();
                return new dnsa(context, eaVar, fdjxVar, eoscVar, drobVar, dnsdVar, optional, dnsfVar, fdaeVar, fdaeVar2, dnrnVar, dnovVar);
            }
        });
    }

    public final dnkk a() {
        dnkk dnkkVar = this.a;
        if (dnkkVar != null) {
            return dnkkVar;
        }
        fdbq.c("definitionsService");
        return null;
    }

    @Override // defpackage.dpxs
    public final dpyb aV() {
        dnsj dnsjVar = this.ah;
        if (dnsjVar != null) {
            return dnsjVar;
        }
        ejwi ejwiVar = this.b;
        if (ejwiVar != null) {
            final dnrl dnrlVar = new dnrl(this);
            this.ah = (dnsj) ((ejwt) ejwiVar.b(new ejvr() { // from class: dnrk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = dnro.aj;
                    return dnrlVar.invoke(obj);
                }
            })).a;
        }
        return this.ah;
    }

    @Override // defpackage.dpxo
    protected final void aZ(dpgl dpglVar) {
        ((ekrd) ak.e().h("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen", "applyHugoColors", 111, "GboardEmojiScreen.kt")).t("Applying HugoColors: %s", dpglVar);
        dnsf dnsfVar = this.ai;
        if (dnsfVar == null) {
            fdbq.c("views");
            dnsfVar = null;
        }
        ColorStateList colorStateList = dpglVar.o;
        ImageButton imageButton = dnsfVar.d;
        imageButton.setImageTintList(colorStateList);
        imageButton.setBackgroundColor(dpglVar.n);
        dnsfVar.c.setBackgroundColor(dpglVar.d);
        dnsa dnsaVarB = b();
        Object obj = dnsaVarB.n;
        drqt drqtVar = obj instanceof drqt ? (drqt) obj : null;
        if (drqtVar != null) {
            drqtVar.c(dnsaVarB.m);
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) throws Resources.NotFoundException {
        dpxz dpxzVar;
        view.getClass();
        dnsf dnsfVar = new dnsf((ViewGroup) view);
        ImageButton imageButton = dnsfVar.d;
        imageButton.setVisibility(true != ((dnov) bC()).f ? 8 : 0);
        int dimensionPixelSize = B().getDimensionPixelSize(R.dimen.emoji_tab_height);
        RecyclerView recyclerView = dnsfVar.c;
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), true == ((dnov) bC()).f ? dimensionPixelSize : 0, recyclerView.getPaddingBottom());
        imageButton.setOnClickListener(bA().a("GboardEmojiScreen.backspace#onClick", new View.OnClickListener() { // from class: dnrd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ((dnhl) this.a.bG().invoke()).a.d();
            }
        }));
        this.ai = dnsfVar;
        String strBU = bU();
        if (strBU == null) {
            b().c();
        } else {
            dpyb dpybVarAV = aV();
            if (dpybVarAV != null && (dpxzVar = ((dnsj) dpybVarAV).j) != null) {
                dpxzVar.c(strBU);
            }
        }
        bL();
        bS();
    }

    public final dnsa b() {
        return (dnsa) this.am.a();
    }

    @Override // defpackage.dnse, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        bA().d("GboardEmojiScreen#onAttach", new fdae() { // from class: dnre
            @Override // defpackage.fdae
            public final Object invoke() {
                dnro dnroVar = this.a;
                final dnrb dnrbVar = dnroVar.ag;
                dnna dnnaVar = null;
                if (dnrbVar == null) {
                    fdbq.c("initializer");
                    dnrbVar = null;
                }
                if (dnrbVar.d.a.compareAndSet(false, true)) {
                    dnrbVar.f.d("GboardEmojiLibraryInitializer#init", new fdae() { // from class: dnra
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            dnrb dnrbVar2 = dnrbVar;
                            dnrbVar2.e.a();
                            int i = dnor.a;
                            lat latVar = dnoq.a;
                            latVar.getClass();
                            Context context2 = dnrbVar2.a;
                            los losVar = new los(context2, latVar);
                            losVar.b = true;
                            eosd eosdVar = dnrbVar2.c;
                            if (drmz.b == null) {
                                synchronized (drmz.class) {
                                    if (drmz.b == null) {
                                        drmz.b = new drmz(context2, eosdVar);
                                    }
                                }
                            }
                            drsl drslVar = drsl.instance;
                            if (!drsl.e) {
                                drslVar.l = true;
                                drsj drsjVar = drsj.b;
                                if (!drsjVar.equals(drslVar.j)) {
                                    drslVar.j = drsjVar;
                                    Set set = drslVar.h;
                                    synchronized (set) {
                                        Iterator it = set.iterator();
                                        while (it.hasNext()) {
                                            ((drsk) it.next()).c();
                                        }
                                    }
                                }
                                if (!drsl.e) {
                                    plm.a("EmojiCompatManager.init");
                                    try {
                                        drtr drtrVar = drsl.d;
                                        drtr drtrVar2 = drsl.c;
                                        drtt.c(drslVar, drtrVar, drtrVar2);
                                        if (drsf.a || drslVar.l) {
                                            drslVar.i = SystemClock.elapsedRealtime();
                                            losVar.a(drslVar.g);
                                            lok.h(losVar);
                                            drslVar.k.c((String) drtrVar.b());
                                            drslVar.f = ekgb.n(drsl.b.i((CharSequence) drtrVar2.b()));
                                        } else {
                                            lok.h(new drsi(new loi() { // from class: drsg
                                                @Override // defpackage.loi
                                                public final void a(loj lojVar) {
                                                    ekrg ekrgVar = drsl.a;
                                                    lojVar.a(null);
                                                }
                                            }));
                                        }
                                        drsl.e = true;
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                            }
                            drtk.a(dnrbVar2.b);
                            return fctx.a;
                        }
                    });
                }
                dnna dnnaVar2 = dnroVar.d;
                if (dnnaVar2 == null) {
                    fdbq.c("frecentEmojiProvider");
                } else {
                    dnnaVar = dnnaVar2;
                }
                dnnaVar.a().d();
                return fctx.a;
            }
        });
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        dnsf dnsfVar = this.ai;
        if (dnsfVar != null) {
            return dpvu.a(dnsfVar.a);
        }
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.al;
    }
}
