package com.google.android.apps.messaging.dittosatellite.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.abdk;
import defpackage.abjq;
import defpackage.abjt;
import defpackage.abki;
import defpackage.abkl;
import defpackage.abkw;
import defpackage.abno;
import defpackage.abru;
import defpackage.aeo;
import defpackage.ahhk;
import defpackage.ahib;
import defpackage.ahkn;
import defpackage.ahng;
import defpackage.ahnh;
import defpackage.ains;
import defpackage.auvh;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cquc;
import defpackage.craf;
import defpackage.crmc;
import defpackage.crmg;
import defpackage.ea;
import defpackage.ecem;
import defpackage.egpr;
import defpackage.ehlc;
import defpackage.ehlf;
import defpackage.ehlg;
import defpackage.ehns;
import defpackage.ehnv;
import defpackage.ehnw;
import defpackage.ehnz;
import defpackage.ehog;
import defpackage.eidc;
import defpackage.eieu;
import defpackage.eifl;
import defpackage.eifp;
import defpackage.eiid;
import defpackage.eiik;
import defpackage.eiiy;
import defpackage.eygg;
import defpackage.eyhj;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.eyie;
import defpackage.eyig;
import defpackage.eyik;
import defpackage.fcsu;
import defpackage.ldn;
import defpackage.len;
import defpackage.ley;
import defpackage.lvc;
import defpackage.lvn;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DittoWebFragment extends abkl implements ehlg, eyhx, ehlc, ehnw, eifl {
    public final lvn a = new lvn(this);
    private boolean ag;
    private abjq d;
    private Context e;

    @Deprecated
    public DittoWebFragment() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return abjq.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final abjq abjqVarH = H();
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.ditto_web_fragment, viewGroup, false);
            if (craf.i) {
                ldn ldnVar = new ldn() { // from class: abjg
                    @Override // defpackage.ldn
                    public final lgt ez(View view, lgt lgtVar) {
                        cqce cqceVar = abjq.a;
                        kzc kzcVarF = lgtVar.f(519);
                        view.setPadding(0, kzcVarF.c, 0, lgtVar.v(8) ? lgtVar.f(8).e : kzcVarF.e);
                        return lgtVar;
                    }
                };
                int[] iArr = ley.a;
                len.k(viewGroup2, ldnVar);
            }
            Intent intent = abjqVarH.a().getIntent();
            String stringExtra = intent.getStringExtra("conversation_id_for_launch");
            cqce cqceVar = abjq.a;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.A("conversationId", stringExtra);
            cqbdVarA.r();
            fcsu fcsuVar = abjqVarH.f;
            if (((Optional) fcsuVar.b()).isPresent()) {
                if (!intent.getBooleanExtra("need_permission", false)) {
                    boolean booleanExtra = intent.getBooleanExtra("show_switcher", false);
                    if (((Optional) fcsuVar.b()).isPresent()) {
                        ((abdk) ((Optional) fcsuVar.b()).get()).h(booleanExtra);
                    }
                } else if (((Optional) fcsuVar.b()).isEmpty()) {
                    cqceVar.r("dittoExtensions is empty.");
                } else {
                    Optional optionalB = ((abdk) ((Optional) fcsuVar.b()).get()).b(abjqVarH.a());
                    if (optionalB.isPresent()) {
                        cqceVar.p("Request to set default sms app.");
                        abjqVarH.e.O(new aeo(), abjqVarH.G).c(optionalB.get());
                    } else {
                        cqceVar.r("defaultSmsAppIntent is empty.");
                    }
                }
            }
            abru abruVar = (abru) abjqVarH.x.b();
            abjqVarH.a();
            if (abruVar.g()) {
                ((ains) abjqVarH.l.b()).c("Bugle.Satellite.Notifications.PermissionsNotGranted.Counts");
                if (craf.f) {
                    ((crmg) abjqVarH.y.b()).g(crmc.NOTIFICATIONS, new abjt(abjqVarH));
                }
            }
            abjqVarH.e(viewGroup2, stringExtra);
            fcsu fcsuVar2 = abjqVarH.i;
            ((Optional) fcsuVar2.b()).ifPresent(new Consumer() { // from class: abjf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    abjq abjqVar = abjqVarH;
                    ((ehac) abjqVar.k.b()).a(((abfv) obj).b(), abjqVar.C);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((Optional) fcsuVar2.b()).ifPresent(new Consumer() { // from class: abji
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    abjq abjqVar = abjqVarH;
                    ((ehac) abjqVar.k.b()).a(((abfv) obj).a(), new abjw(abjqVar, abjqVar.I));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (abno.c(intent)) {
                abjqVarH.c(intent);
            }
            eidc.q();
            return viewGroup2;
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

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abjq H() {
        abjq abjqVar = this.d;
        if (abjqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abjqVar;
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

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.abkl, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.c.b();
        try {
            aY();
            abjq abjqVarH = H();
            cquc cqucVar = abjqVarH.B;
            if (cqucVar != null) {
                cqucVar.a();
                abjqVarH.B = null;
            }
            abki abkiVar = (abki) abjqVarH.j.b();
            cquc cqucVar2 = abkiVar.i;
            if (cqucVar2 != null) {
                cqucVar2.a();
                abkiVar.i = null;
            }
            cquc cqucVar3 = abkiVar.h;
            if (cqucVar3 != null) {
                cqucVar3.a();
                abkiVar.h = null;
            }
            cquc cqucVar4 = abkiVar.j;
            if (cqucVar4 != null) {
                cqucVar4.a();
                abkiVar.j = null;
            }
            Object obj = abjqVarH.v.get();
            ((abkw) obj).e.set(true);
            ((abkw) obj).b.b().k(auvh.b(), ((abkw) obj).d);
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.c.b();
        try {
            bj();
            H().d();
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

    @Override // defpackage.abkl
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [eieu] */
    @Override // defpackage.abkl, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        ea eaVar;
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragment", 85, DittoWebFragment.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragment", 90, DittoWebFragment.class, "CreatePeer");
                        try {
                            eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                        } catch (Throwable th) {
                            th = th;
                            context = eieuVarG2;
                        }
                        try {
                            if (!(eaVar instanceof DittoWebFragment)) {
                                throw new IllegalStateException(a.M(eaVar, abjq.class));
                            }
                            DittoWebFragment dittoWebFragment = (DittoWebFragment) eaVar;
                            ahhk ahhkVar = ((ahib) objBb).c;
                            eyik eyikVar = ahhkVar.aJ;
                            eyik eyikVar2 = ahhkVar.aF;
                            eyik eyikVar3 = ((ahib) objBb).V;
                            eyik eyikVar4 = ((ahib) objBb).W;
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahng ahngVar = ahknVar.b;
                            eyik eyikVar5 = ahngVar.oh;
                            eyik eyikVar6 = ((ahib) objBb).l;
                            ahnh ahnhVar = ahknVar.a;
                            eygg eyggVarA = eyie.a(ahnhVar.LC);
                            eyik eyikVar7 = ahnhVar.aaX;
                            eyik eyikVar8 = ahknVar.lU;
                            eyik eyikVar9 = ahngVar.oj;
                            eyik eyikVar10 = ((ahib) objBb).k;
                            eyik eyikVar11 = ahnhVar.c;
                            eyik eyikVar12 = ahknVar.aI;
                            eygg eyggVarA2 = eyie.a(((ahib) objBb).aa);
                            eyik eyikVar13 = ahknVar.cI;
                            eyik eyikVar14 = ((ahib) objBb).ab;
                            eyik eyikVar15 = ahknVar.db;
                            eyik eyikVar16 = ahknVar.p;
                            this.d = new abjq(dittoWebFragment, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar6, eyggVarA, eyikVar7, eyikVar8, eyikVar9, eyikVar10, eyikVar11, eyikVar12, eyggVarA2, eyikVar13, eyikVar14, eyikVar15, eyikVar16, eyikVar16, ((ahib) objBb).ac, ((ahib) objBb).ad, ahknVar.dj, ahknVar.dz, ahngVar.m, ahhkVar.h);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.a));
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                context.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
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
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
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
            abjq abjqVarH = H();
            ((egpr) abjqVarH.h.b()).j(abjqVarH.F);
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
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
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
    public final void m() {
        this.c.k();
        try {
            bm();
            abjq abjqVarH = H();
            abjqVarH.A = true;
            ((abkw) abjqVarH.v.get()).b();
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

    @Override // defpackage.abkl, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
