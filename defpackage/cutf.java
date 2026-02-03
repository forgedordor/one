package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import cuty.a;
import cuty.c;
import cuty.d;
import cuty.g;
import defpackage.ehol;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutf extends cvbz implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    private cuty aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private final eino ao = new eino();
    private boolean ap;

    @Deprecated
    public cutf() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuty.class;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
            if (viewM == null) {
                cuub.a(this, H());
            }
            eidc.q();
            return viewM;
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
        return this.al;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.an.j();
        try {
            boolean zAM = super.aM(menuItem);
            eifpVarJ.close();
            return zAM;
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

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.an.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final cuty H() {
        cuty cutyVar = this.aj;
        if (cutyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ap) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cutyVar;
    }

    @Override // defpackage.cvbz
    protected final /* bridge */ /* synthetic */ ehok aZ() {
        return new ehof(this, true);
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.an.f();
        try {
            super.af(i, i2, intent);
            H().ao.af(i, i2, intent);
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

    @Override // defpackage.cvbz, defpackage.ecdm, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.an.b();
        try {
            super.ai();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void am() {
        this.an.k();
        try {
            super.am();
            cuty cutyVarH = H();
            cutyVarH.ao.e().q().unregisterOnSharedPreferenceChangeListener(cutyVarH);
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.an.b();
        try {
            super.ao();
            cuty cutyVarH = H();
            cutyVarH.ao.e().q().registerOnSharedPreferenceChangeListener(cutyVarH);
            cutyVarH.g();
            cutyVarH.f();
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

    @Override // defpackage.aiif, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
        try {
            einc.b(this).b = view;
            H();
            cuub.a(this, H());
            super.ap(view, bundle);
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

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.ak == null) {
            this.ak = new ehnz(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.an.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.an.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.an.b = eiikVar;
    }

    @Override // defpackage.aiif
    protected final boolean bj() {
        return true;
    }

    @Override // defpackage.cvbz, defpackage.ea
    public final void g(Context context) {
        eieu eieuVar;
        this.an.k();
        try {
            if (this.ap) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/PerSubscriptionSettingsFragment", 107, cutf.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/PerSubscriptionSettingsFragment", 112, cutf.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahhw) objBb).a;
                            Optional optional = (Optional) ahknVar.ot.b();
                            Optional optionalEmpty = Optional.empty();
                            ahnh ahnhVar = ahknVar.a;
                            ains ainsVar = (ains) ahnhVar.c.b();
                            cmwd cmwdVar = (cmwd) ahnhVar.Wy.b();
                            ayge aygeVar = (ayge) ahnhVar.VZ.b();
                            cmut cmutVar = (cmut) ahnhVar.CL.b();
                            cmum cmumVar = (cmum) ahnhVar.wF.b();
                            crny crnyVar = (crny) ahnhVar.pf.b();
                            crmx crmxVar = (crmx) ahnhVar.pB.b();
                            crqu crquVar = (crqu) ahnhVar.wH.b();
                            eosc eoscVar = (eosc) ahknVar.y.b();
                            aijh aijhVar = (aijh) ahnhVar.Uk.b();
                            cukm cukmVar = (cukm) ((ahhw) objBb).dL.b();
                            ahhe ahheVar = ((ahhw) objBb).d;
                            eieuVar = eieuVarG2;
                            try {
                                eyik eyikVar = ahheVar.o;
                                cupv cupvVar = new cupv(ahnhVar.wF, ahheVar.f, ahnhVar.wI);
                                cmut cmutVar2 = (cmut) ahnhVar.CL.b();
                                eyik eyikVar2 = ahknVar.dj;
                                egyt egytVar = (egyt) eyikVar2.b();
                                cute cuteVar = new cute(cmutVar2, egytVar, (eosc) ahknVar.y.b());
                                ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                                egpr egprVar = (egpr) ((ahhw) objBb).f.b();
                                cuur cuurVar = (cuur) ahnhVar.wI.b();
                                eils eilsVar = (eils) ((ahhw) objBb).i.b();
                                ahjr ahjrVar = ((ahhw) objBb).b;
                                eyik eyikVar3 = ahjrVar.ac;
                                dakl daklVar = (dakl) ahnhVar.BK.b();
                                egzh egzhVar = (egzh) ahknVar.aQ.b();
                                Optional optionalEmpty2 = Optional.empty();
                                Optional optional2 = (Optional) ahheVar.F.b();
                                eyik eyikVar4 = ahknVar.dL;
                                eyik eyikVar5 = ahknVar.id;
                                eyik eyikVar6 = ((ahhw) objBb).dM;
                                eyik eyikVar7 = ahheVar.Q;
                                ahng ahngVar = ahknVar.b;
                                ahkn ahknVar2 = ahngVar.a;
                                ahnh ahnhVar2 = ahknVar2.a;
                                Optional optionalOf = Optional.of(new tqd((aurx) ahnhVar2.wc.b(), (axlf) ahnhVar2.Lw.b(), (eosc) ahknVar2.p.b()));
                                eyik eyikVar8 = ahnhVar.qN;
                                eyik eyikVar9 = ahknVar.mx;
                                Optional optionalOf2 = Optional.of((cknb) ahnhVar.IS.b());
                                tpp tppVar = new tpp((aurx) ahnhVar.wc.b(), (dhes) ahknVar.aP.b(), ahnhVar.qN, (egyt) eyikVar2.b(), (cogw) ahknVar.cD.b(), ahknVar.V(), (eosc) ahknVar.p.b(), (eosc) ahknVar.y.b(), ahnhVar.rd, ahngVar.kv);
                                apqc apqcVar = (apqc) ahnhVar.afi.b();
                                eyik eyikVar10 = ahnhVar.qi;
                                efwo efwoVar = (efwo) ahjrVar.b.b();
                                ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                                if (!(eaVar instanceof cutf)) {
                                    throw new IllegalStateException(a.M(eaVar, cuty.class));
                                }
                                this.aj = new cuty(optional, optionalEmpty, ainsVar, cmwdVar, aygeVar, cmutVar, cmumVar, crnyVar, crmxVar, crquVar, eoscVar, aijhVar, cukmVar, eyikVar, cupvVar, cuteVar, ehacVar, egprVar, cuurVar, eilsVar, eyikVar3, daklVar, egzhVar, optionalEmpty2, optional2, eyikVar4, eyikVar5, eyikVar6, eyikVar7, optionalOf, eyikVar8, eyikVar9, optionalOf2, tppVar, apqcVar, eyikVar10, efwoVar, (cutf) eaVar, (axky) ahnhVar.HN.b(), ahngVar.kw, ((ahhw) objBb).dO);
                                eieuVar.close();
                                this.Z.c(new ehns(this.an, this.al));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    eieuVar.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eieuVar = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lvj lvjVar = this.E;
            if (lvjVar instanceof eifl) {
                eics eicsVar = this.an;
                if (eicsVar.a == null) {
                    eicsVar.e(((eifl) lvjVar).bf(), true);
                }
            }
            eidc.q();
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x034a  */
    @Override // defpackage.aiif, defpackage.ozm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gh(android.os.Bundle r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cutf.gh(android.os.Bundle, java.lang.String):void");
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            cuty cutyVarH = H();
            cutyVarH.v = cutyVarH.new c();
            cutyVarH.w = cutyVarH.new a();
            cutyVarH.ak = cutyVarH.new g();
            cutyVarH.al = cutyVarH.new d();
            egpr egprVar = cutyVarH.V;
            egprVar.j(cutyVarH.v);
            egprVar.j(cutyVarH.w);
            egprVar.j(cutyVarH.ak);
            egprVar.j(cutyVarH.al);
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.an.b();
        try {
            super.i();
            if (this.Q == null) {
                this.ao.c();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.an.a();
        try {
            super.j();
            this.ap = true;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
        try {
            super.k(bundle);
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void m() {
        this.an.k();
        try {
            super.m();
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

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ao.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ao.b(cls, eindVar);
    }

    @Override // defpackage.cvbz, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
