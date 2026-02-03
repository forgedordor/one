package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import defpackage.ehol;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acom extends actd implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    public final lvn a = new lvn(this);
    private final eino ag = new eino();
    private boolean ah;
    private acrt d;
    private Context e;

    @Deprecated
    public acom() {
        ecem.c();
    }

    static acom a(efwo efwoVar) {
        acom acomVar = new acom();
        eyhj.e(acomVar);
        ehok.b(acomVar, efwoVar);
        return acomVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return acrt.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final acrt acrtVarH = H();
            eieu eieuVarK = eiiy.k("HomeFragment#onCreateView");
            try {
                eieu eieuVarK2 = eiiy.k("setupRootView");
                try {
                    ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.home_fragment, viewGroup, false);
                    viewGroup2.setId(R.id.home_fragment);
                    viewGroup2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: acqd
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            View viewFindViewById;
                            acrt acrtVar = acrtVarH;
                            if (!((asgn) acrtVar.bv.b()).a() || !((arkg) acrtVar.bC.b()).a()) {
                                view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                            }
                            View viewFindViewById2 = !abxb.a() ? view.findViewById(R.id.action_bar_overflow) : null;
                            if (viewFindViewById2 != null && (viewFindViewById = view.findViewById(R.id.gk_tooltip_hack)) != null) {
                                viewFindViewById2.getLocationOnScreen(new int[2]);
                                float[] fArr = {r3[0] + (viewFindViewById2.getWidth() / 2), r3[1] + ((viewFindViewById2.getHeight() * 3) / 5)};
                                viewFindViewById.setX(fArr[0]);
                                viewFindViewById.setY(fArr[1]);
                            }
                            return windowInsets;
                        }
                    });
                    View viewFindViewById = acrtVarH.b.fg().findViewById(android.R.id.content);
                    acrtVarH.aJ = new acri(acrtVarH, eiik.b(), new acrs(acrtVarH));
                    viewFindViewById.getViewTreeObserver().addOnPreDrawListener(acrtVarH.aJ);
                    eieuVarK2.close();
                    eieuVarK.close();
                    if (viewGroup2 == null) {
                        acsb.a(this, H());
                    }
                    eidc.q();
                    return viewGroup2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.a;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.c.j();
        try {
            bo(menuItem);
            boolean zE = H().E(menuItem);
            eifpVarJ.close();
            return zE;
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.c.f();
        try {
            aW(i, i2, intent);
            acrt acrtVarH = H();
            if (cpyl.a() && (i == 719461746 || i == 719461747 || i == 719461748 || i == 719461749 || i == 719461750 || i == 719461751)) {
                ((Optional) ((eyig) acrtVarH.au).a).ifPresent(new Consumer() { // from class: acpt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((tmq) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (i == 1 && i2 == -1) {
                ekrw ekrwVarH = acrt.a.h();
                ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActivityResult", 3490, "HomeFragmentPeer.java")).q("successfully set as default sms");
                ((crnp) acrtVarH.bm.b()).c();
                acrtVarH.u();
                acrtVarH.ad.i();
            }
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.actd, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) throws Throwable {
        super.ah(menu, menuInflater);
        H().G(menuInflater);
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ai() {
        DisplayManager.DisplayListener displayListener;
        eifp eifpVarB = this.c.b();
        try {
            aY();
            acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroy", 3310, "HomeFragmentPeer.java")).q("HomeFragment onDestroy called");
            if (!acrtVarH.bB.a()) {
                acrtVarH.j().m();
            }
            acrtVarH.aW.f();
            acop acopVar = acrtVarH.aO;
            if (acopVar != null) {
                acopVar.f();
            }
            cmdo cmdoVar = (cmdo) acrtVarH.o.b();
            eieu eieuVarH = eiiy.h("ScreenDetectionListener.unregister");
            try {
                if (((Boolean) ((cczi) cmdd.a.get()).e()).booleanValue() && (displayListener = (DisplayManager.DisplayListener) cmdoVar.g.getAndSet(null)) != null) {
                    ((cmdi) cmdoVar.b.b()).d(displayListener);
                }
                fczl.a(eieuVarH, null);
                eifpVarB.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void am() {
        agzz agzzVar;
        this.c.k();
        try {
            be();
            acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onPause", 2962, "HomeFragmentPeer.java")).q("HomeFragment onPause called");
            adaw adawVar = (adaw) acrtVarH.y.b();
            aisq aisqVar = adawVar.m;
            if (aisqVar != null) {
                aisqVar.a();
                adawVar.m = null;
            }
            acrtVarH.aZ = false;
            ((badi) acrtVarH.aW.a()).d(false);
            if (acrtVarH.aM.b() && (agzzVar = acrtVarH.aY) != null) {
                acom acomVar = acrtVarH.b;
                agzzVar.f(acomVar.fg());
                agzy agzyVar = acrtVarH.aw;
                acomVar.fg();
                agzt agztVar = agzyVar.k;
                if (agztVar != null) {
                    agztVar.g();
                }
            }
            ((dssz) acrtVarH.h.b()).b();
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onResume", 2482, "HomeFragmentPeer.java")).q("HomeFragment onResume called");
            eieu eieuVarK = eiiy.k("HomeFragment#onResume");
            try {
                ((adaw) acrtVarH.y.b()).a(adaw.b);
                acrtVarH.t.j(4);
                acrtVarH.aZ = true;
                eieu eieuVarK2 = eiiy.k("setDefaultSmsValueAndUpdateUi");
                try {
                    acrtVarH.u();
                    eieuVarK2.close();
                    eieu eieuVarK3 = eiiy.k("setScrolledToNewestConversationIfNeeded");
                    try {
                        acrtVarH.w();
                        eieuVarK3.close();
                        eieuVarK2 = eiiy.k("registerGrowthKitCallbacks");
                        try {
                            ((dssz) acrtVarH.h.b()).a(((acgx) acrtVarH.N.b()).a(acrtVarH.b.fg(), acrtVarH.aw));
                            eieuVarK2.close();
                            final adaw adawVar = (adaw) acrtVarH.y.b();
                            final embg embgVar = (embg) ((embf) embg.a.createBuilder()).build();
                            adawVar.m = ((aisp) adawVar.j.b()).b(173374, Duration.ofMinutes(10L));
                            eijx.f(new Runnable() { // from class: adav
                                @Override // java.lang.Runnable
                                public final void run() {
                                    adaw adawVar2 = adawVar;
                                    if (!((ajhd) adawVar2.g.b()).Y()) {
                                        adaw.e.m("Clearcut loggings are disabled.");
                                        return;
                                    }
                                    embg embgVar2 = embgVar;
                                    emav emavVar = (emav) emaw.a.createBuilder();
                                    emavVar.copyOnWrite();
                                    emaw emawVar = (emaw) emavVar.instance;
                                    embgVar2.getClass();
                                    emawVar.c = embgVar2;
                                    emawVar.b |= 1;
                                    long epochMilli = adawVar2.l.f().toEpochMilli();
                                    emavVar.copyOnWrite();
                                    emaw emawVar2 = (emaw) emavVar.instance;
                                    emawVar2.b |= 2;
                                    emawVar2.d = epochMilli;
                                    emaw emawVar3 = (emaw) emavVar.build();
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.HOME_SCREEN;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar2 = (ellh) ellgVar.instance;
                                    emawVar3.getClass();
                                    ellhVar2.an = emawVar3;
                                    ellhVar2.d |= 512;
                                    ((aill) adawVar2.h.b()).j(ellgVar);
                                }
                            }, adawVar.f);
                            acrtVarH.t.b.compareAndSet(false, true);
                            eieuVarK.close();
                            eifpVarB.close();
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        eieuVarK2.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                eifpVarB.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011c A[Catch: all -> 0x0142, PHI: r17
      0x011c: PHI (r17v1 acse) = (r17v30 acse), (r17v31 acse), (r17v32 acse) binds: [B:13:0x010e, B:15:0x0114, B:17:0x011a] A[DONT_GENERATE, DONT_INLINE], TryCatch #24 {all -> 0x0142, blocks: (B:12:0x00ee, B:14:0x0110, B:16:0x0116, B:21:0x012e, B:25:0x0138, B:18:0x011c, B:20:0x0126), top: B:385:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Type inference failed for: r14v11, types: [android.support.v7.widget.RecyclerView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v3, types: [acvs] */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9, types: [eieu] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v17, types: [eieu] */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8, types: [com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType] */
    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ap(android.view.View r34, android.os.Bundle r35) {
        /*
            Method dump skipped, instructions count: 2659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acom.ap(android.view.View, android.os.Bundle):void");
    }

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acrt H() {
        acrt acrtVar = this.d;
        if (acrtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acrtVar;
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    @Override // defpackage.actd
    protected final /* bridge */ /* synthetic */ ehok e() {
        return new ehof(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r152v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r152v1 */
    /* JADX WARN: Type inference failed for: r152v2, types: [eieu] */
    @Override // defpackage.actd, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/home/HomeFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, acom.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/home/HomeFragment", 106, acom.class, "CreatePeer");
                        try {
                            ahjr ahjrVar = ((ahhw) objBb).b;
                            efwo efwoVar = (efwo) ahjrVar.b.b();
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            try {
                                if (!(eaVar instanceof acom)) {
                                    throw new IllegalStateException(a.M(eaVar, acrt.class));
                                }
                                acom acomVar = (acom) eaVar;
                                ahhe ahheVar = ((ahhw) objBb).d;
                                Activity activity = (Activity) ahheVar.f.b();
                                eyik eyikVar = ((ahhw) objBb).bx;
                                eyik eyikVar2 = ((ahhw) objBb).bC;
                                eyik eyikVar3 = ((ahhw) objBb).bD;
                                Optional optionalOf = Optional.of(ahheVar.C());
                                eyik eyikVar4 = ((ahhw) objBb).bE;
                                eyik eyikVar5 = ((ahhw) objBb).bF;
                                eyik eyikVar6 = ahheVar.D;
                                eyik eyikVar7 = ahheVar.E;
                                eyik eyikVar8 = ahjrVar.pO;
                                eyik eyikVar9 = ((ahhw) objBb).bH;
                                ahkn ahknVar = ((ahhw) objBb).a;
                                ahnh ahnhVar = ahknVar.a;
                                eyik eyikVar10 = ahnhVar.Jd;
                                eyik eyikVar11 = ahknVar.hu;
                                eyik eyikVar12 = ahnhVar.ws;
                                eyik eyikVar13 = ahnhVar.Cp;
                                crmx crmxVar = (crmx) ahnhVar.pB.b();
                                ahng ahngVar = ahknVar.b;
                                eyik eyikVar14 = ahngVar.bX;
                                eyik eyikVar15 = ((ahhw) objBb).bL;
                                eyik eyikVar16 = ((ahhw) objBb).bM;
                                eyik eyikVar17 = ((ahhw) objBb).bP;
                                eyik eyikVar18 = ((ahhw) objBb).bQ;
                                eyik eyikVar19 = ((ahhw) objBb).bR;
                                eyik eyikVar20 = ahnhVar.yw;
                                cogw cogwVar = (cogw) ahknVar.cD.b();
                                eygg eyggVarA = eyie.a(ahheVar.R);
                                eygg eyggVarA2 = eyie.a(((ahhw) objBb).bS);
                                acxj acxjVar = (acxj) ((ahhw) objBb).bY.b();
                                acxl acxlVar = new acxl();
                                eygg eyggVarA3 = eyie.a(((ahhw) objBb).ba);
                                eygg eyggVarA4 = eyie.a(((ahhw) objBb).cf);
                                ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                                ehbb ehbbVar = (ehbb) ((ahhw) objBb).n.b();
                                egpr egprVar = (egpr) ((ahhw) objBb).f.b();
                                eyik eyikVar21 = ahheVar.g;
                                acut acutVarH = ((acuu) ((eyhx) ((ehnu) eyikVar21.b()).a).bb()).h();
                                acutVarH.getClass();
                                eyik eyikVar22 = ahnhVar.tG;
                                eyik eyikVar23 = ((ahhw) objBb).cg;
                                acuw acuwVarN = ahnhVar.N();
                                eyik eyikVar24 = ((ahhw) objBb).ch;
                                eigp eigpVar = (eigp) ahjrVar.ac.b();
                                eyik eyikVar25 = ahjrVar.dx;
                                eygg eyggVarA5 = eyie.a(ahjrVar.pI);
                                eyik eyikVar26 = ahnhVar.Uk;
                                eyik eyikVar27 = ((ahhw) objBb).cl;
                                eyik eyikVar28 = ahnhVar.c;
                                eyik eyikVar29 = ahngVar.iC;
                                eyik eyikVar30 = ahjrVar.oU;
                                eyik eyikVar31 = ((ahhw) objBb).cs;
                                eyik eyikVar32 = ahngVar.hL;
                                eyik eyikVar33 = ((ahhw) objBb).bn;
                                eyik eyikVar34 = ((ahhw) objBb).cu;
                                eyik eyikVar35 = ahknVar.de;
                                agzy agzyVar = (agzy) ((ahhw) objBb).bU.b();
                                eyik eyikVar36 = ahnhVar.BK;
                                Optional.of((czxe) ((ahhw) objBb).aW.b());
                                eyik eyikVar37 = ahnhVar.Ci;
                                eyik eyikVar38 = ((ahhw) objBb).cx;
                                eyik eyikVar39 = ((ahhw) objBb).cA;
                                eygg eyggVarA6 = eyie.a(((ahhw) objBb).cB);
                                ahaa ahaaVar = new ahaa(ahjrVar.ac);
                                eyik eyikVar40 = ahjrVar.dR;
                                eyik eyikVar41 = ahknVar.oj;
                                eyik eyikVar42 = ahjrVar.T;
                                aurx aurxVar = (aurx) ahnhVar.wc.b();
                                eyik eyikVar43 = ahngVar.jk;
                                eyik eyikVar44 = ahknVar.cU;
                                ahkn ahknVar2 = ahngVar.a;
                                ahnh ahnhVar2 = ahknVar2.a;
                                Optional optionalOf2 = Optional.of(new acyn((eosd) ahnhVar2.j.b(), (cogw) ahknVar2.cD.b()));
                                eyik eyikVar45 = ((ahhw) objBb).cD;
                                eyik eyikVar46 = ((ahhw) objBb).cE;
                                daiw daiwVar = new daiw((eosc) ahknVar.p.b(), ahnhVar.qN);
                                eygg eyggVarA7 = eyie.a(ahheVar.Q);
                                eygg eyggVarA8 = eyie.a(((ahhw) objBb).bb);
                                eygg eyggVarA9 = eyie.a(((ahhw) objBb).bc);
                                dzpl dzplVar = (dzpl) ahknVar.gD.b();
                                dzuc dzucVar = (dzuc) ahknVar.cE.b();
                                eyik eyikVar47 = ahngVar.jE;
                                eyik eyikVar48 = ((ahhw) objBb).cF;
                                Optional optional = (Optional) ((ahhw) objBb).cr.b();
                                eyik eyikVar49 = ahnhVar.pB;
                                eigp eigpVar2 = (eigp) ahjrVar.ac.b();
                                apuv apuvVar = new apuv() { // from class: apbw
                                };
                                eyik eyikVar50 = ((ahhw) objBb).cG;
                                eyik eyikVar51 = ((ahhw) objBb).cH;
                                eyik eyikVar52 = ahngVar.jd;
                                eygg eyggVarA10 = eyie.a(((ahhw) objBb).cJ);
                                eyik eyikVar53 = ahknVar.cV;
                                acsw acswVar = new acsw(eyikVar49, eigpVar2, apuvVar, eyikVar50, eyikVar51, eyikVar52, eyggVarA10, eyikVar53);
                                daip daipVarU = ((daio) ((eyhx) ((ehnu) eyikVar21.b()).a).bb()).U();
                                daipVarU.getClass();
                                addo addoVar = new addo(daipVarU, eyie.a(((ahhw) objBb).cB), (fdjx) ahnhVar.m.b());
                                eyik eyikVar54 = ahjrVar.pQ;
                                eyik eyikVar55 = ((ahhw) objBb).cK;
                                eyik eyikVar56 = ((ahhw) objBb).t;
                                eyik eyikVar57 = ((ahhw) objBb).aQ;
                                eyik eyikVar58 = ahnhVar.qi;
                                eyik eyikVar59 = ((ahhw) objBb).cL;
                                eyik eyikVar60 = ((ahhw) objBb).cM;
                                eyik eyikVar61 = ahngVar.ia;
                                adas adasVarJ = ((adax) ((eyhx) ((ehnu) eyikVar21.b()).a).bb()).j();
                                adasVarJ.getClass();
                                eyik eyikVar62 = ((ahhw) objBb).cN;
                                eyik eyikVar63 = ((ahhw) objBb).cO;
                                eyik eyikVar64 = ((ahhw) objBb).cP;
                                eyik eyikVar65 = ahngVar.aa;
                                eyik eyikVar66 = ahjrVar.au;
                                tlt tltVar = (tlt) ahheVar.p.b();
                                ajfx ajfxVar = (ajfx) ahknVar.ij.b();
                                eyik eyikVar67 = ((ahhw) objBb).cQ;
                                eyik eyikVar68 = ((ahhw) objBb).cS;
                                eyik eyikVar69 = ((ahhw) objBb).cT;
                                eyik eyikVar70 = ((ahhw) objBb).cU;
                                eygg eyggVarA11 = eyie.a(((ahhw) objBb).cV);
                                eyik eyikVar71 = ahnhVar2.oO;
                                aoqa aoqaVar = new aoqa(eyikVar71);
                                aoqc aoqcVar = new aoqc(eyikVar71);
                                aoqg aoqgVar = new aoqg(eyikVar71);
                                aoqe aoqeVar = new aoqe(eyikVar71);
                                eyik eyikVar72 = ((ahhw) objBb).aI;
                                eyik eyikVar73 = ahnhVar.ahj;
                                eyik eyikVar74 = ahheVar.K;
                                eyik eyikVar75 = ((ahhw) objBb).cn;
                                eyik eyikVar76 = ahheVar.Z;
                                AtomicBoolean atomicBoolean = (AtomicBoolean) ahngVar.jU.b();
                                eyik eyikVar77 = ((ahhw) objBb).cZ;
                                eyik eyikVar78 = ahngVar.hT;
                                eyik eyikVar79 = ahngVar.jd;
                                eyik eyikVar80 = ((ahhw) objBb).dh;
                                eyik eyikVar81 = ((ahhw) objBb).di;
                                eyik eyikVar82 = ((ahhw) objBb).dj;
                                eyik eyikVar83 = ((ahhw) objBb).dm;
                                eyik eyikVar84 = ahknVar.dz;
                                eyik eyikVar85 = ((ahhw) objBb).dn;
                                eyik eyikVar86 = ahngVar.je;
                                eyik eyikVar87 = ahngVar.hW;
                                eyik eyikVar88 = ahnhVar.tb;
                                eygg eyggVarA12 = eyie.a(((ahhw) objBb).cJ);
                                eygg eyggVarA13 = eyie.a(((ahhw) objBb).dp);
                                eyik eyikVar89 = ahngVar.jw;
                                eygg eyggVarA14 = eyie.a(((ahhw) objBb).dq);
                                eygg eyggVarA15 = eyie.a(((ahhw) objBb).dr);
                                eyik eyikVar90 = ahheVar.ac;
                                eyik eyikVar91 = ((ahhw) objBb).ds;
                                eyik eyikVar92 = ahknVar.cI;
                                eyik eyikVar93 = ((ahhw) objBb).dt;
                                eyik eyikVar94 = ahnhVar.KR;
                                eyik eyikVar95 = ahnhVar.adE;
                                eyik eyikVar96 = ahngVar.jy;
                                eyik eyikVar97 = ((ahhw) objBb).du;
                                eyik eyikVar98 = ahnhVar.BC;
                                eyik eyikVar99 = ahngVar.km;
                                eyik eyikVar100 = ((ahhw) objBb).bz;
                                eyik eyikVar101 = ahnhVar.Uy;
                                eyik eyikVar102 = ahngVar.kn;
                                eyik eyikVar103 = ahngVar.jD;
                                final eyik eyikVar104 = ahnhVar2.oO;
                                this.d = new acrt(efwoVar, acomVar, activity, eyikVar, eyikVar2, eyikVar3, optionalOf, eyikVar4, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyikVar13, crmxVar, eyikVar14, eyikVar15, eyikVar16, eyikVar17, eyikVar18, eyikVar19, eyikVar20, cogwVar, eyggVarA, eyggVarA2, acxjVar, acxlVar, eyggVarA3, eyggVarA4, ehacVar, ehbbVar, egprVar, acutVarH, eyikVar22, eyikVar23, acuwVarN, eyikVar24, eigpVar, eyikVar25, eyggVarA5, eyikVar26, eyikVar27, eyikVar28, eyikVar29, eyikVar30, eyikVar31, eyikVar32, eyikVar33, eyikVar34, eyikVar35, agzyVar, eyikVar36, eyikVar37, eyikVar38, eyikVar39, eyggVarA6, ahaaVar, eyikVar40, eyikVar41, eyikVar42, aurxVar, eyikVar43, eyikVar44, optionalOf2, eyikVar45, eyikVar46, daiwVar, eyggVarA7, eyggVarA8, eyggVarA9, dzplVar, dzucVar, eyikVar47, eyikVar48, optional, acswVar, addoVar, eyikVar54, eyikVar55, eyikVar56, eyikVar57, eyikVar58, eyikVar59, eyikVar60, eyikVar61, adasVarJ, eyikVar62, eyikVar63, eyikVar64, eyikVar65, eyikVar66, tltVar, ajfxVar, eyikVar67, eyikVar68, eyikVar69, eyikVar70, eyggVarA11, aoqaVar, aoqcVar, aoqgVar, aoqeVar, eyikVar72, eyikVar73, eyikVar74, eyikVar75, eyikVar76, atomicBoolean, eyikVar77, eyikVar78, eyikVar79, eyikVar80, eyikVar81, eyikVar82, eyikVar83, eyikVar84, eyikVar85, eyikVar86, eyikVar87, eyikVar88, eyggVarA12, eyggVarA13, eyikVar89, eyggVarA14, eyggVarA15, eyikVar90, eyikVar91, eyikVar92, eyikVar53, eyikVar93, eyikVar94, eyikVar95, eyikVar96, eyikVar97, eyikVar98, eyikVar99, eyikVar100, eyikVar101, eyikVar102, eyikVar103, new arfs() { // from class: arff
                                    @Override // defpackage.arfs
                                    public final boolean a() {
                                        return ((eoth) eyikVar104.b()).a("bugle.move_clear_cache_to_on_stop");
                                    }
                                }, ahngVar.ko);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.a));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    context.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            if (G() != null) {
                acrt acrtVar = this.d;
                eg egVarG = G();
                ekrw ekrwVarH = acrt.a.h();
                ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onAttach", 968, "HomeFragmentPeer.java")).q("HomeFragment onAttach called");
                eieu eieuVarK = eiiy.k("HomeFragment#onAttach");
                try {
                    Bundle bundle = acrtVar.b.m;
                    if (bundle != null) {
                        cdpg cdpgVar = cdpg.HOME;
                        int i = bundle.getInt("conversation_list_mode", cdpgVar.d);
                        if (i == 1) {
                            cdpgVar = cdpg.ARCHIVED;
                        } else if (i == 2) {
                            cdpgVar = cdpg.SPAM_FOLDER;
                        }
                        acrtVar.aM = cdpgVar;
                    } else {
                        acrtVar.aM = cdpg.HOME;
                    }
                    babw babwVar = acrtVar.aW;
                    badj badjVar = (badj) acrtVar.f.b();
                    acrt acrtVarH = acrtVar.h();
                    cdpg cdpgVar2 = acrtVar.aM;
                    fcsu fcsuVar = badjVar.a;
                    fcsu fcsuVar2 = badjVar.b;
                    axgc axgcVar = (axgc) badjVar.c.b();
                    axgcVar.getClass();
                    egVarG.getClass();
                    cdpgVar2.getClass();
                    babwVar.c(new badi(fcsuVar, fcsuVar2, axgcVar, egVarG, acrtVarH, cdpgVar2, Optional.of(false), Optional.empty()));
                    eieuVarK.close();
                } finally {
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            final acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 992, "HomeFragmentPeer.java")).q("HomeFragment onCreate called");
            eieu eieuVarK = eiiy.k("HomeFragment#onCreate");
            try {
                if (((Optional) acrtVarH.aD.b()).isPresent()) {
                    dztc.a.d(new dzfh("HomeScreen"));
                    adas adasVar = acrtVarH.t;
                    adasVar.h();
                    ((abi) acrtVarH.c).P().c(adasVar);
                }
                acrtVarH.t.j(2);
                eieu eieuVarK2 = eiiy.k("HomeFragment#prewarmGlide");
                try {
                    final acog acogVar = (acog) acrtVarH.bq.b();
                    acogVar.a.submit(eiid.k(new Runnable() { // from class: acof
                        @Override // java.lang.Runnable
                        public final void run() {
                            eieu eieuVarK3 = eiiy.k("GlideInitManager#doInitWork");
                            try {
                                ehrb ehrbVar = (ehrb) acogVar.b.b();
                                ehrbVar.g().g(Integer.valueOf(R.drawable.ic_check_circle));
                                eieuVarK3.close();
                            } catch (Throwable th) {
                                try {
                                    eieuVarK3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }));
                    eieuVarK2.close();
                    eieuVarK2 = eiiy.k("HomeFragment#restoreSavedInstance");
                    if (bundle != null) {
                        try {
                            acrtVarH.aN = bundle.getBoolean("returningFromWelcomeActivity");
                            if (((Boolean) ((cczi) cpyl.p.get()).e()).booleanValue()) {
                                Optional optional = (Optional) ((eyig) acrtVarH.at).a;
                                if (optional.isPresent() && bundle.getInt("storageCardState", Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                                    abxq abxqVar = (abxq) optional.get();
                                    bundle.getInt("storageCardState");
                                    bundle.getLong("storageCardCapacityInBytes");
                                    bundle.getLong("storageCardUsageInBytes");
                                    abxqVar.i();
                                }
                            }
                        } finally {
                        }
                    }
                    eieuVarK2.close();
                    eieu eieuVarK3 = eiiy.k("welcomeFlowLaunchCheck");
                    try {
                        if (acrtVarH.aM.b()) {
                            ((Optional) acrtVarH.ab.b()).ifPresentOrElse(new Consumer() { // from class: acpa
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    final acrt acrtVar = acrtVarH;
                                    ((dauj) obj).a(new Callable() { // from class: acou
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            ekrw ekrwVarH2 = acrt.a.h();
                                            ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
                                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1038, "HomeFragmentPeer.java")).q("oobe won't launch");
                                            acrtVar.D.b();
                                            return null;
                                        }
                                    });
                                    ekrw ekrwVarE = acrt.a.e();
                                    ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
                                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1042, "HomeFragmentPeer.java")).q("WelcomeFlowV1EntryPoint registered");
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, new Runnable() { // from class: acpc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ekrw ekrwVarH2 = acrt.a.h();
                                    ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
                                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1045, "HomeFragmentPeer.java")).q("WelcomeFlowV1EntryPoint not registered, oobe won't launch");
                                    acrtVarH.D.b();
                                }
                            });
                        } else {
                            ekrw ekrwVarH2 = acrt.a.h();
                            ekrwVarH2.X(eksq.a, "HomeFragmentFlogger");
                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1050, "HomeFragmentPeer.java")).q("oobe won't launch");
                            acrtVarH.D.b();
                        }
                        eieuVarK3.close();
                        eieu eieuVarK4 = eiiy.k("HomeFragment#setTransitions");
                        try {
                            eieuVarK4.close();
                            eieu eieuVarK5 = eiiy.k("HomeFragment#registerFutureMixins");
                            try {
                                eieu eieuVarK6 = eiiy.k("HomeFragment#blockParticipants");
                                try {
                                    acrtVarH.C.j(acrtVarH.ay);
                                    eieuVarK6.close();
                                    eieu eieuVarK7 = eiiy.k("HomeFragment#reportGroupCallback");
                                    try {
                                        acrtVarH.C.j(acrtVarH.az);
                                        eieuVarK7.close();
                                        eieu eieuVarK8 = eiiy.k("HomeFragment#archiveConversationsCallback");
                                        try {
                                            acrtVarH.C.j(acrtVarH.aA);
                                            eieuVarK8.close();
                                            eieu eieuVarK9 = eiiy.k("HomeFragment#gaiaPromoCallback");
                                            try {
                                                acrtVarH.C.j(acrtVarH.aC);
                                                eieuVarK9.close();
                                                eieu eieuVarK10 = eiiy.k("HomeFragment#devicePairingMixins");
                                                try {
                                                    fcsu fcsuVar = acrtVarH.I;
                                                    if (((Optional) fcsuVar.b()).isPresent()) {
                                                        ((cyqs) ((Optional) fcsuVar.b()).get()).c();
                                                    }
                                                    eieuVarK10.close();
                                                    eieu eieuVarK11 = eiiy.k("HomeFragment#launchOctarineCallback");
                                                    try {
                                                        if (abxb.a()) {
                                                            acrtVarH.C.j(acrtVarH.aB);
                                                        }
                                                        eieuVarK11.close();
                                                        eieu eieuVarK12 = eiiy.k("HomeFragment#autoAttachmentControllerCallback");
                                                        try {
                                                            acrtVarH.C.j(((aomv) acrtVarH.af.b()).d);
                                                            eieuVarK12.close();
                                                            eieu eieuVarK13 = eiiy.k("HomeFragment#bnrEntryPointCallback");
                                                            try {
                                                                Optional optional2 = (Optional) ((eyig) acrtVarH.au).a;
                                                                if (optional2.isPresent()) {
                                                                    ((tmq) optional2.get()).a();
                                                                }
                                                                eieuVarK13.close();
                                                                eieu eieuVarK14 = eiiy.k("HomeFragment#fiEntryPointCallback");
                                                                try {
                                                                    Optional optional3 = (Optional) ((eyig) acrtVarH.av).a;
                                                                    if (optional3.isPresent()) {
                                                                        ((tsi) optional3.get()).b();
                                                                    }
                                                                    eieuVarK14.close();
                                                                    eieu eieuVarK15 = eiiy.k("HomeFragment#accountMenuCardsCallback");
                                                                    try {
                                                                        Optional optional4 = (Optional) ((eyig) acrtVarH.at).a;
                                                                        if (optional4.isPresent()) {
                                                                            ((abxq) optional4.get()).d();
                                                                        }
                                                                        eieuVarK15.close();
                                                                        eieu eieuVarK16 = eiiy.k("HomeFragment#homeMenuExtensionCallback");
                                                                        try {
                                                                            acrtVarH.ac.ifPresent(new Consumer() { // from class: acpd
                                                                                @Override // java.util.function.Consumer
                                                                                /* renamed from: accept */
                                                                                public final void z(Object obj) {
                                                                                    ekgb ekgbVar = ((adba) obj).a;
                                                                                    int size = ekgbVar.size();
                                                                                    for (int i = 0; i < size; i++) {
                                                                                        ((aday) ekgbVar.get(i)).e(acrtVarH.b);
                                                                                    }
                                                                                }

                                                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                                                }
                                                                            });
                                                                            eieuVarK16.close();
                                                                            eieu eieuVarK17 = eiiy.k("HomeFragment#dittoWebActivityResultCallback");
                                                                            try {
                                                                                if (acrtVarH.be.c(bundle)) {
                                                                                    acrtVarH.aK = acrtVarH.b.O(new aeo(), new adi() { // from class: acpe
                                                                                        @Override // defpackage.adi
                                                                                        public final void a(Object obj) {
                                                                                            if (((adh) obj).a == -1) {
                                                                                                ekrw ekrwVarE = acrt.a.e();
                                                                                                ekrwVarE.X(eksq.a, "HomeFragmentFlogger");
                                                                                                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onCreate", 1122, "HomeFragmentPeer.java")).q("Switch to DittoWebActivity finish");
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                                eieuVarK17.close();
                                                                                eieu eieuVarK18 = eiiy.k("HomeFragment#homeBannerCallback");
                                                                                try {
                                                                                    ((Optional) acrtVarH.S.b()).ifPresent(new Consumer() { // from class: acpf
                                                                                        @Override // java.util.function.Consumer
                                                                                        /* renamed from: accept */
                                                                                        public final void z(Object obj) {
                                                                                            Iterator it = ((Set) ((actv) obj).a.b()).iterator();
                                                                                            while (it.hasNext()) {
                                                                                                acrt acrtVar = acrtVarH;
                                                                                                acrtVar.C.j((egps) it.next());
                                                                                            }
                                                                                        }

                                                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                                                        }
                                                                                    });
                                                                                    eieuVarK18.close();
                                                                                    eieu eieuVarK19 = eiiy.k("HomeFragment#blockAndReortSpamCallback");
                                                                                    try {
                                                                                        tlh tlhVar = (tlh) acrtVarH.K.b();
                                                                                        Supplier supplier = new Supplier() { // from class: acpg
                                                                                            @Override // java.util.function.Supplier
                                                                                            public final Object get() {
                                                                                                return acrtVarH.l();
                                                                                            }
                                                                                        };
                                                                                        BlockAndReportSpamCallbacks blockAndReportSpamCallbacks = (BlockAndReportSpamCallbacks) tlhVar.b.b();
                                                                                        blockAndReportSpamCallbacks.k = supplier;
                                                                                        fcsu fcsuVar2 = blockAndReportSpamCallbacks.f;
                                                                                        ((egpr) fcsuVar2.b()).j(blockAndReportSpamCallbacks.i);
                                                                                        ((egpr) fcsuVar2.b()).j(blockAndReportSpamCallbacks.j);
                                                                                        eieuVarK19.close();
                                                                                        eieu eieuVarK20 = eiiy.k("HomeFragment#autoSignInTooltipCallback");
                                                                                        try {
                                                                                            fcsu fcsuVar3 = acrtVarH.ar;
                                                                                            if (((Optional) fcsuVar3.b()).isPresent()) {
                                                                                                ((abzm) ((Optional) fcsuVar3.b()).get()).b();
                                                                                            }
                                                                                            eieuVarK20.close();
                                                                                            eieu eieuVarK21 = eiiy.k("HomeFragment#launchConversationCallback");
                                                                                            try {
                                                                                                ((Optional) acrtVarH.aG.b()).ifPresent(new Consumer() { // from class: acph
                                                                                                    @Override // java.util.function.Consumer
                                                                                                    /* renamed from: accept */
                                                                                                    public final void z(Object obj) {
                                                                                                        ((agwd) obj).d(acrtVarH.aO);
                                                                                                    }

                                                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                                                    }
                                                                                                });
                                                                                                eieuVarK21.close();
                                                                                                eieuVarK5.close();
                                                                                                acrtVarH.R.ifPresent(new Consumer() { // from class: acpi
                                                                                                    @Override // java.util.function.Consumer
                                                                                                    /* renamed from: accept */
                                                                                                    public final void z(Object obj) {
                                                                                                        acrt acrtVar = acrtVarH;
                                                                                                        acyn acynVar = (acyn) obj;
                                                                                                        acynVar.a = (acwj) acrtVar.q.b();
                                                                                                        acrtVar.b.a.c(acynVar);
                                                                                                    }

                                                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                                                    }
                                                                                                });
                                                                                                acom acomVar = acrtVarH.b;
                                                                                                lvn lvnVar = acomVar.a;
                                                                                                lvnVar.c(acrtVarH.U);
                                                                                                lvnVar.c(acrtVarH.ad);
                                                                                                eieu eieuVarK22 = eiiy.k("HomeFragment#registerLocalSubscriptionMixins");
                                                                                                try {
                                                                                                    eieu eieuVarK23 = eiiy.k("HomeFragment#conversationSwipeLocalMixin");
                                                                                                    try {
                                                                                                        eg egVarG = acomVar.G();
                                                                                                        egVarG.getClass();
                                                                                                        acrtVarH.bc = (adcn) new lxo(egVarG).a(adcn.class);
                                                                                                        final adcm adcmVar = (adcm) acrtVarH.z.b();
                                                                                                        adcmVar.e.g(R.id.swipe_action_settings, new cvbl((cvbm) adcmVar.d.b()), new ehay() { // from class: adcl
                                                                                                            @Override // defpackage.ehay
                                                                                                            public final /* synthetic */ void a(Throwable th) {
                                                                                                                ehax.a(th);
                                                                                                            }

                                                                                                            @Override // defpackage.ehay
                                                                                                            public final void b(Object obj) {
                                                                                                                cvbc cvbcVar = (cvbc) ((Optional) obj).orElse(null);
                                                                                                                if (cvbcVar == null) {
                                                                                                                    return;
                                                                                                                }
                                                                                                                adcm adcmVar2 = adcmVar;
                                                                                                                adcmVar2.h = cvbcVar;
                                                                                                                eygg eyggVar = adcmVar2.c;
                                                                                                                Map map = (Map) eyggVar.b();
                                                                                                                cvbb cvbbVarB = cvbb.b(adcmVar2.h.c);
                                                                                                                if (cvbbVarB == null) {
                                                                                                                    cvbbVarB = cvbb.ARCHIVE;
                                                                                                                }
                                                                                                                adcu adcuVar = (adcu) map.get(cvbbVarB);
                                                                                                                if (adcuVar != null) {
                                                                                                                    adcuVar.a().a();
                                                                                                                }
                                                                                                                Map map2 = (Map) eyggVar.b();
                                                                                                                cvbb cvbbVarB2 = cvbb.b(adcmVar2.h.d);
                                                                                                                if (cvbbVarB2 == null) {
                                                                                                                    cvbbVarB2 = cvbb.ARCHIVE;
                                                                                                                }
                                                                                                                adcu adcuVar2 = (adcu) map2.get(cvbbVarB2);
                                                                                                                if (adcuVar2 != null) {
                                                                                                                    adcuVar2.a().a();
                                                                                                                }
                                                                                                            }
                                                                                                        });
                                                                                                        eieuVarK23.close();
                                                                                                        eieu eieuVarK24 = eiiy.k("HomeFragment#gaiaAuthCheckLocalMixin");
                                                                                                        try {
                                                                                                            acrtVarH.B.g(R.id.gaia_auth_check_local_subscription, new cdkq((cdku) acrtVarH.an.b()), new acqw(acrtVarH));
                                                                                                            eieuVarK24.close();
                                                                                                            eieuVarK14 = eiiy.k("HomeFragment#accountMenuEntryPointLocalMixin");
                                                                                                            try {
                                                                                                                Optional optional5 = (Optional) ((eyig) acrtVarH.at).a;
                                                                                                                if (optional5.isPresent()) {
                                                                                                                    ((abxq) optional5.get()).g();
                                                                                                                }
                                                                                                                eieuVarK14.close();
                                                                                                                eieuVarK13 = eiiy.k("HomeFragment#screenDetectionLocalMixin");
                                                                                                                try {
                                                                                                                    final cmdo cmdoVar = (cmdo) acrtVarH.o.b();
                                                                                                                    ehbb ehbbVar = acrtVarH.B;
                                                                                                                    final Context contextA = acrtVarH.b.A();
                                                                                                                    ehbbVar.getClass();
                                                                                                                    eieu eieuVarH = eiiy.h("ScreenDetectionListener.registerDataSource");
                                                                                                                    try {
                                                                                                                        ehbbVar.g(R.id.screen_detection_listener_subscription_id, new cmdn(cmdoVar), new ehay() { // from class: cmdl
                                                                                                                            @Override // defpackage.ehay
                                                                                                                            public final /* synthetic */ void a(Throwable th) {
                                                                                                                                ehax.a(th);
                                                                                                                            }

                                                                                                                            @Override // defpackage.ehay
                                                                                                                            public final void b(Object obj) throws IOException {
                                                                                                                                Integer num;
                                                                                                                                Context context = contextA;
                                                                                                                                Optional optional6 = (Optional) obj;
                                                                                                                                eieu eieuVarH2 = eiiy.h("ScreenDetectionListener.callback");
                                                                                                                                try {
                                                                                                                                    if (!((Boolean) ((cczi) cmdd.a.get()).e()).booleanValue()) {
                                                                                                                                        fczl.a(eieuVarH2, null);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    cmdb cmdbVar = (cmdb) fdct.b(optional6);
                                                                                                                                    cmdo cmdoVar2 = cmdoVar;
                                                                                                                                    if (cmdbVar == null || !cmdbVar.a) {
                                                                                                                                        iv ivVar = (iv) cmdoVar2.f.getAndSet(null);
                                                                                                                                        if (ivVar != null) {
                                                                                                                                            ivVar.dismiss();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        Drawable drawable = context.getDrawable(R.drawable.gs_report_fill1_vd_theme_24);
                                                                                                                                        if (drawable != null) {
                                                                                                                                            drawable.setTint(eehg.d(context, R.attr.colorErrorVariant, "ScreenDetectionListener"));
                                                                                                                                        }
                                                                                                                                        fcsu fcsuVar4 = cmdoVar2.b;
                                                                                                                                        cmdf cmdfVarC = ((cmdi) fcsuVar4.b()).c(cmdbVar);
                                                                                                                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cmdfVarC.a);
                                                                                                                                        Integer num2 = cmdfVarC.b;
                                                                                                                                        if (num2 != null && (num = cmdfVarC.c) != null) {
                                                                                                                                            spannableStringBuilder.setSpan(new StyleSpan(1), num2.intValue(), num.intValue(), 17);
                                                                                                                                        }
                                                                                                                                        eeji eejiVar = new eeji(context);
                                                                                                                                        eejiVar.j(drawable);
                                                                                                                                        eejiVar.u(R.string.screen_detection_dialog_title);
                                                                                                                                        eejiVar.l(spannableStringBuilder);
                                                                                                                                        eejiVar.i(false);
                                                                                                                                        eieuVarH2 = eiiy.h("ScreenDetectionListener.callback.showDialog");
                                                                                                                                        try {
                                                                                                                                            iv ivVarA = eejiVar.a();
                                                                                                                                            fczl.a(eieuVarH2, null);
                                                                                                                                            dztc.a.b(ivVarA.getOwnerActivity());
                                                                                                                                            Window window = ivVarA.getWindow();
                                                                                                                                            if (window != null) {
                                                                                                                                                window.addFlags(2);
                                                                                                                                            }
                                                                                                                                            Window window2 = ivVarA.getWindow();
                                                                                                                                            if (window2 != null) {
                                                                                                                                                window2.setDimAmount(1.0f);
                                                                                                                                            }
                                                                                                                                            cmdoVar2.f.set(ivVarA);
                                                                                                                                        } finally {
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    fczl.a(eieuVarH2, null);
                                                                                                                                } finally {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        fczl.a(eieuVarH, null);
                                                                                                                        eieuVarK13.close();
                                                                                                                        eieuVarK22.close();
                                                                                                                        acrtVarH.ad.j.c(bundle);
                                                                                                                        if (acrtVarH.aM.b()) {
                                                                                                                            addo addoVar = acrtVarH.bD;
                                                                                                                            acom acomVar2 = acrtVarH.b;
                                                                                                                            if (!acrtVarH.A()) {
                                                                                                                                eieu eieuVarA = eiiy.a("HomeToolbarPresenterimpl#preLoadProductSansFont");
                                                                                                                                try {
                                                                                                                                    auvw.k(addoVar.b, null, null, new addn(addoVar, acomVar2, null), 3);
                                                                                                                                    fczl.a(eieuVarA, null);
                                                                                                                                } finally {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                        eieuVarK.close();
                                                                                                                        eidc.q();
                                                                                                                    } finally {
                                                                                                                    }
                                                                                                                } finally {
                                                                                                                }
                                                                                                            } finally {
                                                                                                            }
                                                                                                        } finally {
                                                                                                            try {
                                                                                                                eieuVarK24.close();
                                                                                                            } catch (Throwable th) {
                                                                                                                th.addSuppressed(th);
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        try {
                                                                                                            eieuVarK23.close();
                                                                                                        } catch (Throwable th2) {
                                                                                                            th.addSuppressed(th2);
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                }
                                                                                            } finally {
                                                                                                try {
                                                                                                    eieuVarK21.close();
                                                                                                } catch (Throwable th3) {
                                                                                                    th.addSuppressed(th3);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            try {
                                                                                                eieuVarK20.close();
                                                                                            } catch (Throwable th4) {
                                                                                                th.addSuppressed(th4);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        try {
                                                                                            eieuVarK19.close();
                                                                                        } catch (Throwable th5) {
                                                                                            th.addSuppressed(th5);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    try {
                                                                                        eieuVarK18.close();
                                                                                    } catch (Throwable th6) {
                                                                                        th.addSuppressed(th6);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                try {
                                                                                    eieuVarK17.close();
                                                                                } catch (Throwable th7) {
                                                                                    th.addSuppressed(th7);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            try {
                                                                                eieuVarK16.close();
                                                                            } catch (Throwable th8) {
                                                                                th.addSuppressed(th8);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        try {
                                                                            eieuVarK15.close();
                                                                        } catch (Throwable th9) {
                                                                            th.addSuppressed(th9);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    try {
                                                                        eieuVarK14.close();
                                                                    } catch (Throwable th10) {
                                                                        th.addSuppressed(th10);
                                                                    }
                                                                }
                                                            } finally {
                                                                try {
                                                                    eieuVarK13.close();
                                                                } catch (Throwable th11) {
                                                                    th.addSuppressed(th11);
                                                                }
                                                            }
                                                        } finally {
                                                            try {
                                                                eieuVarK12.close();
                                                            } catch (Throwable th12) {
                                                                th.addSuppressed(th12);
                                                            }
                                                        }
                                                    } finally {
                                                        try {
                                                            eieuVarK11.close();
                                                        } catch (Throwable th13) {
                                                            th.addSuppressed(th13);
                                                        }
                                                    }
                                                } finally {
                                                    try {
                                                        eieuVarK10.close();
                                                    } catch (Throwable th14) {
                                                        th.addSuppressed(th14);
                                                    }
                                                }
                                            } finally {
                                                try {
                                                    eieuVarK9.close();
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                }
                                            }
                                        } finally {
                                            try {
                                                eieuVarK8.close();
                                            } catch (Throwable th16) {
                                                th.addSuppressed(th16);
                                            }
                                        }
                                    } finally {
                                        try {
                                            eieuVarK7.close();
                                        } catch (Throwable th17) {
                                            th.addSuppressed(th17);
                                        }
                                    }
                                } finally {
                                    try {
                                        eieuVarK6.close();
                                    } catch (Throwable th18) {
                                        th.addSuppressed(th18);
                                    }
                                }
                            } finally {
                                try {
                                    eieuVarK5.close();
                                } catch (Throwable th19) {
                                    th.addSuppressed(th19);
                                }
                            }
                        } finally {
                            try {
                                eieuVarK4.close();
                            } catch (Throwable th20) {
                                th.addSuppressed(th20);
                            }
                        }
                    } finally {
                        try {
                            eieuVarK3.close();
                        } catch (Throwable th21) {
                            th.addSuppressed(th21);
                        }
                    }
                } finally {
                    try {
                        eieuVarK2.close();
                    } catch (Throwable th22) {
                        th.addSuppressed(th22);
                    }
                }
            } finally {
            }
        } catch (Throwable th23) {
            try {
                eidc.q();
            } catch (Throwable th24) {
                th23.addSuppressed(th24);
            }
            throw th23;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        boolean zBooleanValue;
        eecx eecxVar;
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onDestroyView", 3275, "HomeFragmentPeer.java")).q("HomeFragment onDestroyView called");
            AppBarLayout appBarLayout = acrtVarH.bD.c;
            if (appBarLayout != null && (eecxVar = acrtVarH.aS) != null) {
                appBarLayout.l(eecxVar);
                acrtVarH.aS = null;
            }
            if (!acrtVarH.aL) {
                acom acomVar = acrtVarH.b;
                acrt.b(acomVar).getViewTreeObserver().removeOnPreDrawListener(acrtVarH.aI);
                acrtVarH.aI = new ViewTreeObserver.OnPreDrawListener() { // from class: acqb
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public final boolean onPreDraw() {
                        return true;
                    }
                };
                acomVar.fg().findViewById(android.R.id.content).getViewTreeObserver().removeOnPreDrawListener(acrtVarH.aJ);
            }
            if (acrtVarH.aM.b()) {
                acrtVarH.j().u(acrtVarH.aQ.Q());
                acsw acswVar = acrtVarH.ad;
                if (acswVar.g() != null) {
                    acxm acxmVarJ = acrtVarH.j();
                    if (acswVar.j.b()) {
                        zBooleanValue = ((Boolean) ((acsi) acswVar.c.b()).a.c()).booleanValue();
                    } else {
                        ExtendedFloatingActionButton extendedFloatingActionButton = acswVar.g;
                        zBooleanValue = extendedFloatingActionButton != null ? extendedFloatingActionButton.r : false;
                    }
                    acxmVarJ.s(Boolean.valueOf(zBooleanValue));
                }
            }
            if (this.Q == null) {
                this.ag.c();
            }
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bk(bundle);
            acrt acrtVarH = H();
            bundle.putBoolean("returningFromWelcomeActivity", acrtVarH.aN);
            if (acrtVarH.aQ != null) {
                acrtVarH.i().M(acrtVarH.aQ.M(), bundle);
            }
            acrtVarH.be.a(bundle);
            acrtVarH.ac.ifPresent(new Consumer() { // from class: acqc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ekgb ekgbVar = ((adba) obj).a;
                    int size = ekgbVar.size();
                    for (int i = 0; i < size; i++) {
                        ((aday) ekgbVar.get(i)).f();
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cczi) cpyl.p.get()).e()).booleanValue()) {
                Optional optional = (Optional) ((eyig) acrtVarH.at).a;
                if (optional.isPresent() && ((abxq) optional.get()).c().isPresent()) {
                    bundle.putInt("storageCardState", ((dyhq) ((abxq) optional.get()).c().get()).ordinal());
                    bundle.putLong("storageCardCapacityInBytes", ((abxq) optional.get()).a());
                    bundle.putLong("storageCardUsageInBytes", ((abxq) optional.get()).b());
                }
            }
            acrtVarH.ad.j.a(bundle);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bl();
            acrt acrtVarH = H();
            if (acrtVarH.bB.a()) {
                acrtVarH.j().n();
            }
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void m() {
        this.c.k();
        try {
            bm();
            acrt acrtVarH = H();
            ekrw ekrwVarH = acrt.a.h();
            ekrwVarH.X(eksq.a, "HomeFragmentFlogger");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onStop", 3264, "HomeFragmentPeer.java")).q("HomeFragment onStop called");
            if (acrtVarH.bB.a()) {
                acrtVarH.j().m();
            }
            acrt.b(acrtVarH.b).clearFocus();
            acrtVarH.j().u(acrtVarH.aQ.Q());
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        acrt acrtVarH = H();
        if (acrtVarH.aR.h() && acrtVarH.aR.a() == 0 && acrtVarH.b.z() != null) {
            acrtVarH.y((ListEmptyView) acrtVarH.aR.b());
        }
        if (configuration != null) {
            acom acomVar = acrtVarH.b;
            int i = configuration.orientation;
            if (acrt.c(acomVar) == null || acrt.c(acomVar).getVisibility() != 0 || acrt.g(acomVar) == null) {
                return;
            }
            boolean z = i == 2 || acomVar.fg().isInMultiWindowMode();
            if (z != (acrt.g(acomVar).getVisibility() == 8)) {
                acrt.g(acomVar).setVisibility(true == z ? 8 : 0);
            }
        }
    }

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.actd, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
