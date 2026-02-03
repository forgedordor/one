package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountPreference;
import com.google.android.apps.messaging.cloudstore.fi.SyncPreference;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.ehol;
import java.util.Locale;
import trj.a;
import trj.b;
import trj.c;
import trj.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqs extends tsg implements ehlg, eyhx, ehlc, ehnw, eifl {
    private trj aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public tqs() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return trj.class;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
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
    public final trj H() {
        trj trjVar = this.aj;
        if (trjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return trjVar;
    }

    @Override // defpackage.tsg
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

    @Override // defpackage.tsg, defpackage.ecdm, defpackage.ea
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
            H();
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [eieu] */
    @Override // defpackage.tsg, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragment", 97, tqs.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragment", 102, tqs.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            try {
                                if (!(eaVar instanceof tqs)) {
                                    throw new IllegalStateException(a.M(eaVar, trj.class));
                                }
                                tqs tqsVar = (tqs) eaVar;
                                ahkn ahknVar = ((ahhw) objBb).a;
                                ahnh ahnhVar = ahknVar.a;
                                aurx aurxVar = (aurx) ahnhVar.wc.b();
                                eils eilsVar = (eils) ((ahhw) objBb).i.b();
                                ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                                ahjr ahjrVar = ((ahhw) objBb).b;
                                efwo efwoVar = (efwo) ahjrVar.b.b();
                                eigp eigpVar = (eigp) ahjrVar.ac.b();
                                egbf egbfVar = (egbf) ahnhVar.pG.b();
                                cpmi cpmiVar = (cpmi) ahnhVar.afH.b();
                                aijh aijhVar = (aijh) ahnhVar.Uk.b();
                                egpr egprVar = (egpr) ((ahhw) objBb).f.b();
                                eyik eyikVar = ahnhVar.qN;
                                ahng ahngVar = ahknVar.b;
                                this.aj = new trj(tqsVar, aurxVar, eilsVar, ehacVar, efwoVar, eigpVar, egbfVar, cpmiVar, aijhVar, egprVar, eyikVar, ahngVar.U(), ahnhVar.MP, (apqc) ahnhVar.afi.b(), ahnhVar.c, ((ahhw) objBb).j, ahngVar.hc, ((ahhw) objBb).k);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.an, this.al));
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

    @Override // defpackage.aiif, defpackage.ozm
    public final void gh(Bundle bundle, String str) {
        super.gh(bundle, str);
        final trj trjVarH = H();
        tqs tqsVar = trjVarH.c;
        tqsVar.f(R.xml.fi_settings_preferences);
        tqsVar.e().ag();
        tqsVar.e().getClass();
        FiAccountPreference fiAccountPreference = (FiAccountPreference) tqsVar.a(tqsVar.Y(R.string.fi_account_pref_key));
        fiAccountPreference.getClass();
        trjVarH.n = fiAccountPreference;
        trjVarH.n.G(false);
        if (((Boolean) ((cczi) cpyl.m.get()).e()).booleanValue()) {
            FiAccountPreference fiAccountPreference2 = trjVarH.n;
            eigp eigpVar = trjVarH.g;
            fiAccountPreference2.a = new eifs(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "onCreatePreferences", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "FiSettingsFragmentPeer:deleteButtonClick", new View.OnClickListener() { // from class: tre
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final trj trjVar = trjVarH;
                    AlertDialog.Builder message = new AlertDialog.Builder(trjVar.c.z()).setTitle(R.string.fi_settings_delete_backup).setMessage(R.string.fi_settings_delete_backup_message);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tqw
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cqce cqceVar = trj.a;
                            dialogInterface.dismiss();
                        }
                    };
                    eigp eigpVar2 = trjVar.g;
                    message.setNegativeButton(R.string.fi_settings_delete_backup_dialog_neutral, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDeleteBackupConfirmationDialog", 331, "FiSettingsFragmentPeer:deleteBackupConfirmationDialog:negative", onClickListener)).setPositiveButton(R.string.fi_settings_delete_backup_dialog_positive, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDeleteBackupConfirmationDialog", 336, "FiSettingsFragmentPeer:deleteBackupConfirmationDialog:positive", new DialogInterface.OnClickListener() { // from class: tqx
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            trj trjVar2 = trjVar;
                            trjVar2.c(false);
                            trjVar2.a();
                        }
                    })).show();
                }
            });
            fiAccountPreference2.d();
            trjVarH.n.k(new eifs(eigpVar, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "onCreatePreferences", 206, "FiSettingsFragmentPeer:disableSyncButtonClick", new View.OnClickListener() { // from class: trf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final trj trjVar = trjVarH;
                    AlertDialog.Builder message = new AlertDialog.Builder(trjVar.c.z()).setTitle(R.string.fi_settings_disable_multidevice_dialog_title).setMessage(R.string.fi_settings_disable_multidevice_dialog_message);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tqy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cqce cqceVar = trj.a;
                            dialogInterface.dismiss();
                        }
                    };
                    eigp eigpVar2 = trjVar.g;
                    message.setNegativeButton(R.string.fi_settings_disable_multidevice_dialog_negative, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDisableSyncDialog", 309, "FiSettingsFragmentPeer:disableSyncDialog:negative", onClickListener)).setPositiveButton(R.string.fi_settings_disable_multidevice_dialog_positive, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDisableSyncDialog", 314, "FiSettingsFragmentPeer:disableSyncDialog:positive", new DialogInterface.OnClickListener() { // from class: tqz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            trj trjVar2 = trjVar;
                            trjVar2.c(false);
                            trjVar2.b();
                            dialogInterface.dismiss();
                        }
                    })).show();
                }
            }));
        } else {
            trjVarH.n.k(new eifs(trjVarH.g, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "onCreatePreferences", 210, "FiSettingsFragmentPeer:disconnectButtonClick", new View.OnClickListener() { // from class: trg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final trj trjVar = trjVarH;
                    AlertDialog.Builder message = new AlertDialog.Builder(trjVar.c.z()).setTitle(R.string.fi_settings_disable_multidevice_dialog_title).setMessage(R.string.fi_settings_disable_multidevice_dialog_message);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: trc
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cqce cqceVar = trj.a;
                            dialogInterface.dismiss();
                        }
                    };
                    eigp eigpVar2 = trjVar.g;
                    message.setNegativeButton(R.string.fi_settings_disable_multidevice_dialog_negative, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDisableMultideviceDialog", 289, "FiSettingsFragmentPeer:disableMultideviceDialog:negative", onClickListener)).setPositiveButton(R.string.fi_settings_disable_multidevice_dialog_positive, new eigf(eigpVar2, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDisableMultideviceDialog", 294, "FiSettingsFragmentPeer:disableMultideviceDialog:positive", new DialogInterface.OnClickListener() { // from class: trd
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            final trj trjVar2 = trjVar;
                            trjVar2.t = false;
                            AlertDialog.Builder message2 = new AlertDialog.Builder(trjVar2.c.z()).setTitle(R.string.fi_settings_delete_backup).setMessage(R.string.fi_settings_delete_backup_message);
                            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: tqt
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i2) {
                                    cqce cqceVar = trj.a;
                                    dialogInterface2.dismiss();
                                }
                            };
                            final eigp eigpVar3 = trjVar2.g;
                            AlertDialog.Builder positiveButton = message2.setNegativeButton(R.string.fi_settings_delete_backup_dialog_negative, new eigf(eigpVar3, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDeleteBackupsDialog", 354, "FiSettingsFragmentPeer:deleteBackupsDialog:negative", onClickListener2)).setPositiveButton(R.string.fi_settings_delete_backup_dialog_positive, new eigf(eigpVar3, "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer", "showDeleteBackupsDialog", 359, "FiSettingsFragmentPeer:deleteBackupsDialog:positive", new DialogInterface.OnClickListener() { // from class: tra
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i2) {
                                    trjVar2.t = true;
                                    dialogInterface2.dismiss();
                                }
                            }));
                            final DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: trb
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface2) {
                                    trj trjVar3 = trjVar2;
                                    trjVar3.c(false);
                                    if (trjVar3.t) {
                                        trjVar3.a();
                                    } else {
                                        trjVar3.b();
                                    }
                                }
                            };
                            positiveButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: eift
                                public final /* synthetic */ String b = "com/google/android/apps/messaging/cloudstore/fi/FiSettingsFragmentPeer";
                                public final /* synthetic */ String c = "showDeleteBackupsDialog";
                                public final /* synthetic */ String d = "FiSettingsFragmentPeer:deleteBackupsDialog:dismiss";

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface2) {
                                    eigp eigpVar4 = eigpVar3;
                                    String str2 = this.d;
                                    String str3 = this.b;
                                    String str4 = this.c;
                                    DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                                    eieh eiehVarC = eigpVar4.c(str2, str3, str4, 367);
                                    try {
                                        onDismissListener2.onDismiss(dialogInterface2);
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
                            positiveButton.show();
                            dialogInterface.dismiss();
                        }
                    })).show();
                }
            }));
        }
        SyncPreference syncPreference = (SyncPreference) tqsVar.a(tqsVar.Y(R.string.fi_current_sync_pref_key));
        syncPreference.getClass();
        trjVarH.o = syncPreference;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) tqsVar.a(tqsVar.Y(R.string.fi_enable_download_over_wifi_pref_key));
        switchPreferenceCompat.getClass();
        trjVarH.p = switchPreferenceCompat;
        trjVarH.p.G(false);
        trjVarH.p.N(false);
        SwitchPreferenceCompat switchPreferenceCompat2 = trjVarH.p;
        eils eilsVar = trjVarH.e;
        switchPreferenceCompat2.n = new eilq(eilsVar, "FiSettingsFragmentPeer:clickDownloadOverWifiPreference", new oza() { // from class: tqu
            @Override // defpackage.oza
            public final boolean a(Preference preference, Object obj) {
                trj trjVar = trjVarH;
                boolean zEquals = Boolean.TRUE.equals(obj);
                trjVar.p.G(false);
                ause auseVar = (ause) trjVar.z.b();
                trjVar.j.h(egpq.b(auvw.c(auseVar.a, fcyi.a, fdjz.a, new ausd(auseVar, zEquals, null))), new egpo(Boolean.valueOf(zEquals)), trjVar.l);
                return false;
            }
        });
        Preference preferenceA = tqsVar.a(tqsVar.Y(R.string.messages_for_web_preference_key));
        preferenceA.getClass();
        trjVarH.q = preferenceA;
        trjVarH.q.n(tqsVar.Z(R.string.messages_for_web_preference_summary, bvfd.i.e()));
        trjVarH.q.o = new eilr(eilsVar, "FiSettingsFragmentPeer:messagesForWebPreferenceClick", new ozb() { // from class: tqv
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                trj trjVar = trjVarH;
                if (!abxb.b()) {
                    trjVar.i.z(trjVar.c.z());
                    return true;
                }
                aijh aijhVar = trjVar.i;
                tqs tqsVar2 = trjVar.c;
                aijhVar.A(tqsVar2.z(), trjVar.k);
                return true;
            }
        });
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
            trj trjVarH = H();
            if (((Boolean) trj.b.e()).booleanValue()) {
                ((ains) trjVarH.v.b()).c("Bugle.UI.FiSettingsPage.Entered");
            }
            egpr egprVar = trjVarH.j;
            egprVar.j(trjVarH.l);
            egprVar.j(trjVarH.m);
            ehac ehacVar = trjVarH.f;
            aurx aurxVar = trjVarH.d;
            ehacVar.a(aurxVar.e(), trjVarH.new d());
            efwo efwoVar = trjVarH.k;
            if (efwoVar.a() != -1) {
                ehacVar.a(trjVarH.h.a(efwoVar), trjVarH.new a());
            }
            ehacVar.a(aurxVar.e(), trjVarH.new b());
            ehacVar.a(aurxVar.e(), trjVarH.new c());
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
            this.ao = true;
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

    @Override // defpackage.tsg, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
