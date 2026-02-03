package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.egky;
import defpackage.eyhq;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkq extends egkn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private egks a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public egkq() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return egks.class;
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
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

    @Override // defpackage.egkn, defpackage.ecdo, defpackage.ea
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
            egks egksVarH = H();
            efzn efznVar = egksVarH.a;
            efznVar.a.remove(egksVarH.g);
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

    @Override // defpackage.egkn
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
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

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final egks H() {
        egks egksVar = this.a;
        if (egksVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return egksVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [eieu] */
    @Override // defpackage.egkn, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/NonAccountScopedOGAccountMenuManagerProviderFragment", 83, egkq.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/apps/tiktok/account/ui/onegoogle/NonAccountScopedOGAccountMenuManagerProviderFragment", 88, egkq.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof egkq)) {
                                    throw new IllegalStateException(a.M(eaVar, egks.class));
                                }
                                egkq egkqVar = (egkq) eaVar;
                                ahhk ahhkVar = ((ahib) objBb).c;
                                efzn efznVar = (efzn) ahhkVar.p.b();
                                ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                                ahkn ahknVar = ((ahib) objBb).a;
                                egbf egbfVar = (egbf) ahknVar.a.pG.b();
                                ehrb ehrbVar = (ehrb) ahhkVar.U.b();
                                final Activity activity = (Activity) ahhkVar.d.b();
                                final eglf eglfVarAr = ahhkVar.ar();
                                final eile eileVarAw = ahhkVar.aw();
                                final ejwi ejwiVarJ = ejwi.j("google");
                                dydj dydjVar = new dydj();
                                final dycw dycwVar = new dycw() { // from class: egkt
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        activity.startActivity(new Intent("android.settings.SYNC_SETTINGS"));
                                    }
                                };
                                final String str = "OG: Manage Accounts";
                                dydjVar.c = new dycw() { // from class: eilc
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        eigp eigpVar = eileVarAw.a;
                                        String str2 = str;
                                        dycw dycwVar2 = dycwVar;
                                        egbe egbeVar = (egbe) obj;
                                        eieh eiehVarC = eigpVar.c(str2, "com/google/apps/tiktok/tracing/contrib/onegoogle/OneGoogleTraceCreation", "onClickMenu", 31);
                                        try {
                                            dycwVar2.a(view, egbeVar);
                                            eiehVarC.close();
                                        } catch (Throwable th) {
                                            try {
                                                eiehVarC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                };
                                final dycw dycwVar2 = new dycw() { // from class: egku
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                                        intent.putExtra("account_types", new String[]{"com.google"});
                                        activity.startActivity(intent);
                                    }
                                };
                                final String str2 = "OG: Add Account";
                                dydjVar.b = new dycw() { // from class: eilc
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        eigp eigpVar = eileVarAw.a;
                                        String str22 = str2;
                                        dycw dycwVar22 = dycwVar2;
                                        egbe egbeVar = (egbe) obj;
                                        eieh eiehVarC = eigpVar.c(str22, "com/google/apps/tiktok/tracing/contrib/onegoogle/OneGoogleTraceCreation", "onClickMenu", 31);
                                        try {
                                            dycwVar22.a(view, egbeVar);
                                            eiehVarC.close();
                                        } catch (Throwable th) {
                                            try {
                                                eiehVarC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                };
                                final dycw dycwVar3 = new dycw() { // from class: egkv
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        egbe egbeVar = (egbe) obj;
                                        if (egbeVar != null) {
                                            ejwi ejwiVar = ejwiVarJ;
                                            if (((String) ((ejwt) ejwiVar).a).equals(egbeVar.b().k)) {
                                                Activity activity2 = activity;
                                                Intent intentA = egla.a(egbeVar, 1);
                                                if (intentA.resolveActivity(activity2.getPackageManager()) != null) {
                                                    activity2.startActivityForResult(intentA, 9631);
                                                    return;
                                                } else {
                                                    egla.b(activity2, eglfVarAr.c());
                                                    return;
                                                }
                                            }
                                        }
                                        throw new UnsupportedOperationException("Should only be visible for Google accounts");
                                    }
                                };
                                final String str3 = "OG: My Account";
                                dydjVar.a = new dycw() { // from class: eilc
                                    @Override // defpackage.dycw, defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        eigp eigpVar = eileVarAw.a;
                                        String str22 = str3;
                                        dycw dycwVar22 = dycwVar3;
                                        egbe egbeVar = (egbe) obj;
                                        eieh eiehVarC = eigpVar.c(str22, "com/google/apps/tiktok/tracing/contrib/onegoogle/OneGoogleTraceCreation", "onClickMenu", 31);
                                        try {
                                            dycwVar22.a(view, egbeVar);
                                            eiehVarC.close();
                                        } catch (Throwable th) {
                                            try {
                                                eiehVarC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                };
                                dycy dycyVarA = dydjVar.a();
                                final Activity activity2 = (Activity) ahhkVar.d.b();
                                final eglf eglfVarAr2 = ahhkVar.ar();
                                final eile eileVarAw2 = ahhkVar.aw();
                                final ejwi ejwiVarJ2 = ejwi.j("google");
                                ejud ejudVar = ejud.a;
                                final dxxj dxxjVar = new dxxj() { // from class: eglb
                                    @Override // defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        Activity activity3 = activity2;
                                        eglf eglfVar = eglfVarAr2;
                                        egbe egbeVar = (egbe) obj;
                                        if (egbeVar != null) {
                                            ejwi ejwiVar = ejwiVarJ2;
                                            if (((String) ((ejwt) ejwiVar).a).equals(egbeVar.b().k)) {
                                                Intent intentA = egla.a(egbeVar, 500);
                                                if (intentA.resolveActivity(activity3.getPackageManager()) != null) {
                                                    activity3.startActivityForResult(intentA, 9631);
                                                    return;
                                                } else {
                                                    egla.b(activity3, eglfVar.d());
                                                    return;
                                                }
                                            }
                                        }
                                        egla.b(activity3, eglfVar.d());
                                    }
                                };
                                final String str4 = "OG: Privacy Policy";
                                ejwi ejwiVarJ3 = ejwi.j(new dxxj() { // from class: eild
                                    @Override // defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        eigp eigpVar = eileVarAw2.a;
                                        String str5 = str4;
                                        dxxj dxxjVar2 = dxxjVar;
                                        egbe egbeVar = (egbe) obj;
                                        eieh eiehVarC = eigpVar.c(str5, "com/google/apps/tiktok/tracing/contrib/onegoogle/OneGoogleTraceCreation", "onClick", 40);
                                        try {
                                            dxxjVar2.a(view, egbeVar);
                                            eiehVarC.close();
                                        } catch (Throwable th) {
                                            try {
                                                eiehVarC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                });
                                final dxxj dxxjVar2 = new dxxj() { // from class: eglc
                                    @Override // defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        Activity activity3 = activity2;
                                        eglf eglfVar = eglfVarAr2;
                                        egbe egbeVar = (egbe) obj;
                                        if (egbeVar != null) {
                                            ejwi ejwiVar = ejwiVarJ2;
                                            if (((String) ((ejwt) ejwiVar).a).equals(egbeVar.b().k)) {
                                                Intent intentA = egla.a(egbeVar, 503);
                                                if (intentA.resolveActivity(activity3.getPackageManager()) != null) {
                                                    activity3.startActivityForResult(intentA, 9631);
                                                    return;
                                                } else {
                                                    egla.b(activity3, eglfVar.e());
                                                    return;
                                                }
                                            }
                                        }
                                        egla.b(activity3, eglfVar.e());
                                    }
                                };
                                final String str5 = "OG: Terms of Service";
                                dynf dynfVar = new dynf(ejwiVarJ3, ejwi.j(new dxxj() { // from class: eild
                                    @Override // defpackage.dxxj
                                    public final void a(View view, Object obj) {
                                        eigp eigpVar = eileVarAw2.a;
                                        String str52 = str5;
                                        dxxj dxxjVar22 = dxxjVar2;
                                        egbe egbeVar = (egbe) obj;
                                        eieh eiehVarC = eigpVar.c(str52, "com/google/apps/tiktok/tracing/contrib/onegoogle/OneGoogleTraceCreation", "onClick", 40);
                                        try {
                                            dxxjVar22.a(view, egbeVar);
                                            eiehVarC.close();
                                        } catch (Throwable th) {
                                            try {
                                                eiehVarC.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                }), ejudVar, ejudVar);
                                egac egacVarAq = ahhkVar.aq();
                                ejwi ejwiVarJ4 = ejwi.j("google");
                                eyik eyikVar = ((ahib) objBb).ck;
                                Object objB = eyikVar.b();
                                Object objB2 = eyikVar.b();
                                ahng ahngVar = ahknVar.b;
                                egky egkyVar = (egky) objB2;
                                egky egkyVar2 = (egky) objB;
                                this.a = new egks(egkqVar, efznVar, ehacVar, egbfVar, ehrbVar, dycyVarA, dynfVar, egacVarAq, ejwiVarJ4, egkyVar2, new egky.a(egkyVar, ejwi.j(ahngVar.ph.b()), (egkz) ahngVar.pi.b(), ejwi.j(true)), ahhkVar.ar(), (ScheduledExecutorService) ahknVar.y.b(), (dtah) ahngVar.jW.b());
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.e));
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
            egks egksVarH = H();
            if (bundle == null) {
                egky egkyVar = egksVarH.d;
                egac egacVar = egksVarH.f;
                efwo efwoVarB = egacVar.g() != -1 ? efwo.b(egacVar.g()) : null;
                boolean z = true;
                ejwl.m(!((lvn) egkyVar.a.P()).c.a(lvb.c), "setInitialActiveAccount should only be invoked before or during #onCreate!");
                if (egkyVar.d != null) {
                    z = false;
                }
                ejwl.m(z, "activeAccount has already been set!");
                egkyVar.d = efwoVarB;
            }
            egksVarH.b.b(egksVarH.c.b(), egzr.SAME_DAY, egksVarH.e);
            egksVarH.a.a(egksVarH.g);
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

    @Override // defpackage.egkn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
