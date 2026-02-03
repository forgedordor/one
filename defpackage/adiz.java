package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adiz implements agzt {
    public static final eksp a = eksp.c("BugleInAppUpdate");
    public final fcsu b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    adjw h;
    public final Context i;
    public final eosc j;
    public adix k;
    private agzy l;

    public adiz(eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Context context, fcsu fcsuVar5, eosc eoscVar2) {
        this.c = eoscVar;
        this.b = fcsuVar;
        this.e = fcsuVar2;
        this.d = fcsuVar3;
        this.f = fcsuVar4;
        this.i = context;
        this.g = fcsuVar5;
        this.j = eoscVar2;
    }

    @Override // defpackage.agzt
    public final eiju b() {
        return ((adjc) this.e.b()).b().h(new ejvr() { // from class: adiv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Optional) obj).isPresent());
            }
        }, this.c);
    }

    @Override // defpackage.agzt
    public final void c(agzy agzyVar, ViewGroup viewGroup) {
        this.l = agzyVar;
    }

    @Override // defpackage.agzt
    public final void d() {
        this.l.b();
    }

    @Override // defpackage.agzt
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        h((eg) context);
        return true;
    }

    @Override // defpackage.agzt
    public final int f() {
        return 10;
    }

    public final void h(final eg egVar) {
        auvh.h(((adjc) this.e.b()).b().i(new eooz() { // from class: adiu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 136, "InAppUpdatePresenterImpl.java")).q("Start update flow decision: no update.");
                    return eijx.e(null);
                }
                final eg egVar2 = egVar;
                final adiz adizVar = this.a;
                adizVar.h = (adjw) optional.get();
                adjw adjwVar = adizVar.h;
                eexu eexuVar = adjwVar.b;
                eeyg eeygVar = adjwVar.a;
                if (eexuVar.d == 11) {
                    ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 145, "InAppUpdatePresenterImpl.java")).q("Update downloaded. Prompting user to install.");
                    adizVar.i(egVar2);
                    return eijx.e(null);
                }
                int i = ((eeys) eeygVar).a;
                int i2 = i ^ 1;
                if (i2 != 0) {
                    adizVar.k = new adix(adizVar, egVar2);
                    eexy eexyVar = (eexy) adizVar.b.b();
                    adix adixVar = adizVar.k;
                    adixVar.getClass();
                    eexyVar.c(adixVar);
                }
                boolean z = 1 == i2;
                ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 158, "InAppUpdatePresenterImpl.java")).r("Started update flow, flow type: %s", i);
                if (eexuVar.c == 3) {
                    ((adja) adizVar.d.b()).b(13, z);
                }
                fcsu fcsuVar = adizVar.f;
                if (((apve) fcsuVar.b()).a()) {
                    int i3 = adizVar.h.c;
                    int i4 = i3 == 0 ? 2 : i3 == 1 ? 3 : 4;
                    adja adjaVar = (adja) adizVar.d.b();
                    emxl emxlVar = (emxl) emxp.a.createBuilder();
                    emxlVar.copyOnWrite();
                    emxp emxpVar = (emxp) emxlVar.instance;
                    emxpVar.c = 1;
                    emxpVar.b |= 1;
                    int i5 = 1 == i2 ? 2 : 3;
                    emxlVar.copyOnWrite();
                    emxp emxpVar2 = (emxp) emxlVar.instance;
                    emxpVar2.d = i5 - 1;
                    emxpVar2.b |= 2;
                    emxlVar.copyOnWrite();
                    emxp emxpVar3 = (emxp) emxlVar.instance;
                    emxpVar3.f = i4 - 1;
                    emxpVar3.b |= 8;
                    adjaVar.a((emxp) emxlVar.build());
                } else {
                    ((adja) adizVar.d.b()).b(2, z);
                }
                return eiju.g(drgi.a(((eexy) adizVar.b.b()).b(eexuVar, egVar2, eeygVar))).i(new eooz() { // from class: adio
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        int i6;
                        adjv adjvVar;
                        int iIntValue = ((Integer) obj2).intValue();
                        final adiz adizVar2 = adizVar;
                        fcsu fcsuVar2 = adizVar2.f;
                        boolean zA = ((apve) fcsuVar2.b()).a();
                        Optional optional2 = optional;
                        if (zA && ((adjw) optional2.get()).c == 0) {
                            adizVar2.d();
                        }
                        boolean z2 = 1 == (((eeys) adizVar2.h.a).a ^ 1);
                        if (iIntValue == -1) {
                            ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 242, "InAppUpdatePresenterImpl.java")).q("Update prompt accepted.");
                            ((adja) adizVar2.d.b()).b(3, z2);
                        } else {
                            if (iIntValue == 0) {
                                ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 246, "InAppUpdatePresenterImpl.java")).q("Update prompt declined.");
                                adizVar2.j();
                                fcsu fcsuVar3 = adizVar2.d;
                                ((adja) fcsuVar3.b()).b(4, z2);
                                if (((apve) fcsuVar2.b()).a() && optional2.isPresent()) {
                                    final eg egVar3 = egVar2;
                                    if (!egVar3.isDestroyed() && (i6 = ((adjw) optional2.get()).c) != 0) {
                                        if (i6 - 1 != 0) {
                                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: adis
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                                    adiz adizVar3 = adizVar2;
                                                    ((adja) adizVar3.d.b()).b(21, false);
                                                    dialogInterface.dismiss();
                                                    adizVar3.d();
                                                    ahwd ahwdVar = (ahwd) adizVar3.g.b();
                                                    auvh.h(auvw.c(ahwdVar.h, fcyi.a, fdjz.a, new ahvv(ahwdVar, null)));
                                                }
                                            };
                                            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: adit
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                                    adiz adizVar3 = adizVar2;
                                                    ((adja) adizVar3.d.b()).b(20, false);
                                                    dialogInterface.dismiss();
                                                    adizVar3.h(egVar3);
                                                }
                                            };
                                            ((adja) fcsuVar3.b()).b(19, false);
                                            Context context = adizVar2.i;
                                            adjvVar = new adjv(context.getString(R.string.update_to_restore_backup_warning_reprompt_dialog_title), context.getText(R.string.update_to_restore_backup_warning_reprompt_dialog_subtext), context.getString(R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context.getString(R.string.update_to_restore_backup_warning_reprompt_dialog_negative_button_caption), onClickListener, onClickListener2);
                                        } else {
                                            DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: adiq
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                                    adiz adizVar3 = adizVar2;
                                                    ((adja) adizVar3.d.b()).b(18, false);
                                                    dialogInterface.dismiss();
                                                    adizVar3.d();
                                                    ahwd ahwdVar = (ahwd) adizVar3.g.b();
                                                    auvh.h(auvw.c(ahwdVar.h, fcyi.a, fdjz.a, new ahvu(ahwdVar, null)));
                                                }
                                            };
                                            DialogInterface.OnClickListener onClickListener4 = new DialogInterface.OnClickListener() { // from class: adir
                                                @Override // android.content.DialogInterface.OnClickListener
                                                public final void onClick(DialogInterface dialogInterface, int i7) {
                                                    adiz adizVar3 = adizVar2;
                                                    ((adja) adizVar3.d.b()).b(17, false);
                                                    dialogInterface.dismiss();
                                                    adizVar3.h(egVar3);
                                                }
                                            };
                                            ((adja) fcsuVar3.b()).b(16, false);
                                            Context context2 = adizVar2.i;
                                            adjvVar = new adjv(qxq.a(context2.getString(R.string.update_to_restore_backup_warning_initial_dialog_title_v2), "7", 7), context2.getText(R.string.update_to_restore_backup_warning_initial_dialog_subtext_v2), context2.getString(R.string.update_to_restore_backup_warning_dialog_positive_button_caption_v2), context2.getString(R.string.update_to_restore_backup_warning_initial_dialog_negative_button_caption), onClickListener3, onClickListener4);
                                        }
                                        adin.a(egVar3, adjvVar);
                                        return ((adjc) adizVar2.e.b()).d();
                                    }
                                }
                                return ((adjc) adizVar2.e.b()).c(z2);
                            }
                            if (iIntValue == 1) {
                                ((eksl) ((eksl) adiz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "handleUpdateTaskResult", 267, "InAppUpdatePresenterImpl.java")).q("Update prompt activity failed");
                                adizVar2.j();
                                ((adja) adizVar2.d.b()).b(5, z2);
                                return ((adjc) adizVar2.e.b()).c(z2);
                            }
                        }
                        return eijx.e(null);
                    }
                }, ((apve) fcsuVar.b()).a() ? adizVar.j : adizVar.c).e(Throwable.class, new ejvr() { // from class: adip
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        ((eksl) ((eksl) ((eksl) adiz.a.j()).g((Throwable) obj2)).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "launchUpdateFlow", 191, "InAppUpdatePresenterImpl.java")).q("Could not start update flow due to error.");
                        return null;
                    }
                }, adizVar.c);
            }
        }, this.c));
        egVar.P().c(new adiy(this));
    }

    public final void i(eg egVar) {
        Snackbar snackbarP = Snackbar.p(egVar.getWindow().getDecorView().getRootView(), R.string.install_update_snackbar_text, -2);
        snackbarP.v(R.string.install_update_snackbar_action_text, new View.OnClickListener() { // from class: adiw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "showInstallUpdateSnackbar", 363, "InAppUpdatePresenterImpl.java")).q("User accepted complete update prompt.");
                adiz adizVar = this.a;
                adizVar.j();
                ((adja) adizVar.d.b()).b(15, true);
                ((eexy) adizVar.b.b()).e();
            }
        });
        snackbarP.i();
    }

    public final void j() {
        if (this.k == null) {
            return;
        }
        eexy eexyVar = (eexy) this.b.b();
        adix adixVar = this.k;
        adixVar.getClass();
        eexyVar.d(adixVar);
        this.k = null;
    }

    @Override // defpackage.agzt
    public final /* synthetic */ int n() {
        return agzs.a();
    }

    @Override // defpackage.agzt
    public final /* synthetic */ void g() {
    }
}
