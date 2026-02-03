package defpackage;

import android.content.Intent;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzk implements dofk {
    public final ea a;
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;
    public final fcsu e;
    public final Optional f;
    public final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public uzk(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, fcsu fcsuVar4, Optional optional, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fcsuVar3.getClass();
        fdjxVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.a = eaVar;
        this.b = fcsuVar;
        this.h = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fdjxVar;
        this.e = fcsuVar4;
        this.f = optional;
        this.g = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
    }

    @Override // defpackage.dofk
    public final void a(final dodm dodmVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-814582619);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(dodmVar) : hmlVarC.F(dodmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dodmVar.b) {
            hmlVarC.v(-665456134);
            b(hmlVarC, (i2 >> 3) & 14);
            ((hmw) hmlVarC).ab();
        } else {
            hmlVarC.v(-665414718);
            cuit.a(null, null, false, null, false, hxe.d(615509213, new uze(this), hmlVarC), hmlVarC, 196608, 31);
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: uyy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    uzk uzkVar = this.a;
                    int i4 = i;
                    uzkVar.a(dodmVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-317080228);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            fctx fctxVar = fctx.a;
            hmlVarC.v(5004770);
            boolean zF = hmlVarC.F(this);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zF || objS == hmk.a) {
                objS = new uzh(this, null);
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hob.g(fctxVar, (fdat) objS, hmlVarC);
            final dofj dofjVar = (dofj) hro.a(((dofb) this.i.b()).a, hmlVarC).a();
            boolean z = !((aqab) this.j.b()).a();
            fcsu fcsuVar = this.h;
            eijm eijmVar = (eijm) fcsuVar.b();
            hmlVarC.v(5004770);
            boolean zF2 = hmlVarC.F(this);
            Object objS2 = hmwVar.S();
            if (zF2 || objS2 == hmk.a) {
                objS2 = new fdae() { // from class: uyz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        eilp.a(this.a.a, new Intent("android.intent.action.VIEW", Uri.parse("https://www.google.com/policies/privacy/")));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            fdae fdaeVarA = eijmVar.a("MagicComposeOnboarding.onPrivacyPolicyClick", (fdae) objS2);
            eijm eijmVar2 = (eijm) fcsuVar.b();
            hmlVarC.v(5004770);
            boolean zF3 = hmlVarC.F(this);
            Object objS3 = hmwVar.S();
            if (zF3 || objS3 == hmk.a) {
                objS3 = new fdae() { // from class: uza
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        Uri uri = Uri.parse("https://support.google.com/messages?p=magic_compose");
                        uri.getClass();
                        eilp.a(this.a.a, new Intent("android.intent.action.VIEW", uri));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS3);
            }
            hmwVar.ab();
            fdae fdaeVarA2 = eijmVar2.a("MagicComposeOnboarding.onLearnMoreClick", (fdae) objS3);
            eijm eijmVar3 = (eijm) fcsuVar.b();
            hmlVarC.v(5004770);
            boolean zF4 = hmlVarC.F(this);
            Object objS4 = hmwVar.S();
            if (zF4 || objS4 == hmk.a) {
                objS4 = new fdae() { // from class: uzb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        uzk uzkVar = this.a;
                        ((aijh) uzkVar.c.b()).h(uzkVar.a.A());
                        return fctx.a;
                    }
                };
                hmwVar.af(objS4);
            }
            hmwVar.ab();
            fdae fdaeVarA3 = eijmVar3.a("MagicComposeOnboarding.onSettingsClick", (fdae) objS4);
            eijm eijmVar4 = (eijm) fcsuVar.b();
            hmlVarC.v(-1633490746);
            boolean zF5 = hmlVarC.F(this) | hmlVarC.F(dofjVar);
            Object objS5 = hmwVar.S();
            if (zF5 || objS5 == hmk.a) {
                objS5 = new fdae() { // from class: uzc
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final fdap fdapVar = new fdap() { // from class: uyt
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                uzw uzwVar = (uzw) obj;
                                uzwVar.getClass();
                                uzwVar.n(4);
                                return fctx.a;
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: uyv
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                fdapVar.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                        uzk uzkVar = this.a;
                        uzkVar.f.ifPresent(consumer);
                        dofjVar.e.invoke();
                        auvw.k(uzkVar.d, null, null, new uzj(uzkVar, null), 3);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS5);
            }
            hmwVar.ab();
            fdae fdaeVarA4 = eijmVar4.a("MagicComposeOnboarding.onboardingDismissed", (fdae) objS5);
            eijm eijmVar5 = (eijm) fcsuVar.b();
            hmlVarC.v(5004770);
            boolean zF6 = hmlVarC.F(this);
            Object objS6 = hmwVar.S();
            if (zF6 || objS6 == hmk.a) {
                objS6 = new fdae() { // from class: uzd
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        final fdap fdapVar = new fdap() { // from class: uyw
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) {
                                uzw uzwVar = (uzw) obj;
                                uzwVar.getClass();
                                uzwVar.n(3);
                                return fctx.a;
                            }
                        };
                        Consumer consumer = new Consumer() { // from class: uyx
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                fdapVar.invoke(obj);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                        uzk uzkVar = this.a;
                        uzkVar.f.ifPresent(consumer);
                        ((vbv) uzkVar.b.b()).c(true);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS6);
            }
            hmwVar.ab();
            vbd.b(z, fdaeVarA, fdaeVarA2, fdaeVarA3, fdaeVarA4, eijmVar5.a("MagicComposeOnboarding.userOnboarded", (fdae) objS6), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: uyu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    this.a.b((hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
