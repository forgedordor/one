package com.google.android.apps.messaging.backup;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FullBackupDataOutput;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.backup.BugleBackupAgent;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ahzu;
import defpackage.ahzv;
import defpackage.akc$$ExternalSyntheticApiModelOutline0;
import defpackage.apot;
import defpackage.apoy;
import defpackage.auml;
import defpackage.aumq;
import defpackage.aurx;
import defpackage.autx;
import defpackage.auvh;
import defpackage.axky;
import defpackage.cpyl;
import defpackage.cqaz;
import defpackage.cqtf;
import defpackage.cqzq;
import defpackage.cqzr;
import defpackage.crac;
import defpackage.crny;
import defpackage.crqu;
import defpackage.crqv;
import defpackage.crra;
import defpackage.didv;
import defpackage.egbf;
import defpackage.egyt;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ekgi;
import defpackage.ekgp;
import defpackage.ekhx;
import defpackage.ekoj;
import defpackage.ekph;
import defpackage.ekrg;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.evxc;
import defpackage.eygg;
import defpackage.fcth;
import defpackage.szg;
import defpackage.szs;
import defpackage.szt;
import defpackage.szv;
import defpackage.tbx;
import defpackage.tbz;
import j$.util.Optional;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BugleBackupAgent extends didv {
    private static final ekrg k = ekrg.c("com/google/android/apps/messaging/backup/BugleBackupAgent");
    public crqv a;
    public crny b;
    public axky c;
    public aurx d;
    public eosc e;
    public eosc f;
    public egyt g;
    public egbf h;
    public ahzu i;
    public crqu j;
    private cqzr n;
    private crac o;
    private tbx p;
    private tbz q;
    private apot r;
    private apoy s;
    private eigp t;
    private final Object l = new Object();
    private Set m = null;
    private boolean u = false;
    private boolean v = true;
    private boolean w = false;
    private boolean x = false;

    /* compiled from: PG */
    public interface a {
        Optional a();
    }

    /* compiled from: PG */
    public interface b {
        eigp b();

        tbx c();

        tbz d();

        ahzv e();

        apot f();

        apoy g();

        aurx h();

        autx i();

        axky j();

        cqzr k();

        crac l();

        crny m();

        crqv n();

        egbf o();

        egyt p();

        eosc q();

        eosc r();

        Boolean s();

        Boolean t();

        crqu u();

        void v();
    }

    private final void k() {
        Set set = this.m;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e((String) it.next());
        }
        this.m = null;
    }

    private final void l() {
        synchronized (this.l) {
            if (!this.u || this.v) {
                b bVar = (b) cqtf.a(b.class);
                this.w = bVar.s().booleanValue();
                this.x = bVar.t().booleanValue();
                this.v = false;
                if (!this.u) {
                    this.a = bVar.n();
                    this.n = bVar.k();
                    this.o = bVar.l();
                    this.b = bVar.m();
                    this.j = bVar.u();
                    this.p = bVar.c();
                    this.q = bVar.d();
                    this.c = bVar.j();
                    this.d = bVar.h();
                    this.e = bVar.q();
                    this.f = bVar.r();
                    this.g = bVar.p();
                    this.h = bVar.o();
                    this.r = bVar.f();
                    this.s = bVar.g();
                    this.t = bVar.b();
                    bVar.i();
                    this.i = bVar.e().a(k, "BugleBackup", "BugleBackup");
                    bVar.v();
                    this.u = true;
                    this.i.g("Dependencies initialized.");
                }
            }
        }
    }

    private final void m() {
        this.i.g("Restoring CmsTimestamp.");
        String strF = this.a.f(getString(R.string.cms_d2d_timestamp_pref_key), null);
        if (strF != null) {
            try {
                this.d.T(evxc.g(strF));
            } catch (ParseException e) {
                this.i.n(e, "Failed to parse timestamp. Skipping restore the D2D Value");
            }
        }
    }

    private final void n(boolean z) {
        this.i.h("Writing D2d flag value %s to preferences.", Boolean.valueOf(z));
        this.a.h(getString(R.string.cms_d2d_flag_pref_key), z);
    }

    private final void o() {
        n(true);
        Boolean bool = false;
        try {
            bool = (Boolean) a().i(new eooz() { // from class: szh
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(false);
                    }
                    final BugleBackupAgent bugleBackupAgent = this.a;
                    return bugleBackupAgent.d.n().h(new ejvr() { // from class: szq
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Optional optional = (Optional) obj2;
                            boolean zIsPresent = optional.isPresent();
                            BugleBackupAgent bugleBackupAgent2 = bugleBackupAgent;
                            if (!zIsPresent) {
                                bugleBackupAgent2.i.k("Device Id is empty. Skipping back up of priorToD2dDeviceId");
                                return false;
                            }
                            bugleBackupAgent2.i.h("Backing up priorToD2dDeviceId with device id: %s", optional.get());
                            bugleBackupAgent2.a.l(bugleBackupAgent2.getString(R.string.prior_to_d2d_device_id_pref_key), (String) optional.get());
                            return true;
                        }
                    }, bugleBackupAgent.e);
                }
            }, this.f).i(new eooz() { // from class: szj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        return eijx.e(false);
                    }
                    final BugleBackupAgent bugleBackupAgent = this.a;
                    return bugleBackupAgent.c.a().i(new eooz() { // from class: szm
                        /* JADX WARN: Type inference failed for: r3v5, types: [cpmc, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            BugleBackupAgent bugleBackupAgent2 = bugleBackupAgent;
                            Optional optionalA = ((BugleBackupAgent.a) ehlh.a(bugleBackupAgent2, BugleBackupAgent.a.class, (efwo) obj2)).a();
                            if (!optionalA.isEmpty()) {
                                return optionalA.get().l();
                            }
                            bugleBackupAgent2.i.k("CloudMessageStoreClient is not present. Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                            return eijx.e(evxc.c);
                        }
                    }, bugleBackupAgent.f).f(fbtf.class, new eooz() { // from class: szn
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            bugleBackupAgent.i.n((fbtf) obj2, "Failed to get timestamp, Will fall back to dailyRetrievedCmsD2dTimestamp if possible");
                            return eijx.e(evxc.c);
                        }
                    }, bugleBackupAgent.f).i(new eooz() { // from class: szo
                        /* JADX WARN: Type inference failed for: r1v2, types: [cmfo, java.lang.Object] */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final BugleBackupAgent bugleBackupAgent2 = bugleBackupAgent;
                            final evvp evvpVar = (evvp) obj2;
                            return bugleBackupAgent2.d.e.get().h().h(new ejvr() { // from class: aura
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    evvp evvpVar2 = ((aumq) obj3).H;
                                    return evvpVar2 == null ? evvp.a : evvpVar2;
                                }
                            }, eoqg.a).h(new ejvr() { // from class: szr
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    evvp evvpVar2 = evvpVar;
                                    evvp evvpVar3 = (evvp) obj3;
                                    evvp evvpVar4 = evxc.a;
                                    evvp evvpVar5 = evxb.a(evvpVar2, evvpVar3) > 0 ? evvpVar2 : evvpVar3;
                                    bugleBackupAgent2.i.j("Between fetched timestamp: %s and dailyRetrievedTimestamp: %s, the mostRecentTimistamp is: %s", evxc.h(evvpVar2), evxc.h(evvpVar3), evxc.h(evvpVar5));
                                    return evvpVar5;
                                }
                            }, bugleBackupAgent2.f);
                        }
                    }, bugleBackupAgent.f).h(new ejvr() { // from class: szp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            BugleBackupAgent bugleBackupAgent2 = bugleBackupAgent;
                            bugleBackupAgent2.a.l(bugleBackupAgent2.getString(R.string.cms_d2d_timestamp_pref_key), evxc.h((evvp) obj2));
                            return Boolean.valueOf(!r4.equals(evxc.c));
                        }
                    }, bugleBackupAgent.f);
                }
            }, this.f).get(((Integer) cpyl.K.e()).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.i.n(e, "Failed to completely set D2d values for Optimized Restore");
        }
        if (bool.booleanValue()) {
            this.i.g("Successfully set optimized CMS Restore Settings");
        } else {
            this.i.g("Failed to set optimized CMS Restore Settings");
        }
    }

    final eiju a() {
        return this.c.a().i(new eooz() { // from class: szk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                BugleBackupAgent bugleBackupAgent = this.a;
                efwo efwoVar = (efwo) obj;
                if (efwoVar != null) {
                    return eiju.g(bugleBackupAgent.g.a(bugleBackupAgent.h.a(efwoVar), egzr.DONT_CARE));
                }
                bugleBackupAgent.i.k("Failed to get linked account. Skipping backing up BnR Account and setting the D2D");
                return eijx.e(egbs.a);
            }
        }, this.e).h(new ejvr() { // from class: szl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                egbs egbsVar = (egbs) obj;
                boolean zEquals = egbsVar.equals(egbs.a);
                BugleBackupAgent bugleBackupAgent = this.a;
                if (zEquals) {
                    bugleBackupAgent.i.k("Failed to get accountInfo. Skipping backing up BnR Account and setting the D2D");
                    return false;
                }
                bugleBackupAgent.a.l(bugleBackupAgent.getString(R.string.bnr_gaia_account_user_id_pref_key), egbsVar.c);
                return true;
            }
        }, this.e);
    }

    final Map b() {
        l();
        if (SubscriptionManager.from(this) == null) {
            this.i.k("Couldn't get a subscription manager. Per-subscription preferences won't be backed up/restored.");
            return ekoj.a;
        }
        try {
            Charset charsetForName = Charset.forName("UTF-8");
            ekgi ekgiVar = new ekgi();
            this.b.o(new szs(this, charsetForName, ekgiVar));
            return ekgiVar.c();
        } catch (UnsupportedCharsetException e) {
            cqaz.p("Device doesn't support UTF-8 encoding. Per-subscription preferences won't be backed up/restored.", e);
            return ekoj.a;
        }
    }

    @Override // defpackage.didv
    protected final Map c() {
        l();
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(this.a.a(), szg.a(this, new ekph(this.p)));
        crra crraVarB = szg.b(this);
        Set set = this.m;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ekgiVar.i((String) it.next(), crraVarB);
            }
        }
        return ekgiVar.c();
    }

    final void d(String str, String str2) {
        l();
        this.i.c("Copying shared preferences from \"%s\" to \"%s\".", str, str2);
        SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = getSharedPreferences(str2, 0).edit();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                i(editorEdit, entry.getKey(), value);
            }
        }
        editorEdit.apply();
    }

    final void e(String str) {
        l();
        this.i.b("Deleting shared preferences \"%s\".", str);
        if (!getSharedPreferences(str, 0).edit().clear().commit()) {
            this.i.l("Failed to clear shared preferences \"%s\".", str);
        }
        if (deleteSharedPreferences(str)) {
            return;
        }
        this.i.l("Failed to delete shared preferences \"%s\".", str);
    }

    final void f() {
        try {
            ((Boolean) a().get(((Integer) cpyl.J.e()).intValue(), TimeUnit.MILLISECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.i.n(e, "Failed to set gaia user id. Skipping backing up BnR Account and setting the D2D value\"");
        }
    }

    @Override // defpackage.didv
    protected final void g(Set set) {
        l();
        this.i.g("onPreferencesRestored started.");
        Map mapB = b();
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : ((ekgp) mapB).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (set.contains(str2)) {
                d(str2, str);
                i2++;
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (str3.startsWith("bugleuniqsub_")) {
                e(str3);
                i++;
            }
        }
        this.i.h("Backup data for %d SIM card(s) was retrieved from the cloud.", Integer.valueOf(i));
        this.i.i("%d out of %d active SIM card(s) was/were restored.", Integer.valueOf(i2), Integer.valueOf(((ekoj) mapB).d));
        this.i.g("onPreferencesRestored finished.");
    }

    @Override // defpackage.didv, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        NotificationChannel notificationChannelF;
        l();
        this.i.g("onBackup started.");
        this.q.a(2);
        l();
        this.i.g("Writing default notification settings to preferences.");
        boolean zL = this.n.l(true);
        this.a.h(getString(R.string.notifications_enabled_pref_key), zL);
        if (zL && (notificationChannelF = this.n.f()) != null) {
            this.a.h(getString(R.string.notification_vibration_pref_key), notificationChannelF.shouldVibrate());
            this.a.l(getString(R.string.notification_sound_pref_key), notificationChannelF.getSound() == null ? null : notificationChannelF.getSound().toString());
        }
        cqaz.i(this.m);
        Map mapB = b();
        ekgp ekgpVar = (ekgp) mapB;
        for (Map.Entry entry : ekgpVar.entrySet()) {
            d((String) entry.getKey(), (String) entry.getValue());
        }
        this.i.h("%d active SIM card(s) will be backed up.", Integer.valueOf(((ekoj) mapB).d));
        this.m = ekhx.o(ekgpVar.values());
        if (this.s.a()) {
            if (autx.n(this.d.c())) {
                this.i.g("CMS Initial Sync is complete, setting optimized restore values");
                o();
            } else {
                this.i.g("CMS Initial Sync is not complete, clearing optimized restore values.");
                n(false);
                this.a.n(getString(R.string.prior_to_d2d_device_id_pref_key));
                this.a.n(getString(R.string.bnr_gaia_account_user_id_pref_key));
                this.a.n(getString(R.string.cms_d2d_timestamp_pref_key));
            }
        }
        if (this.r.a() && Build.VERSION.SDK_INT >= 28 && backupDataOutput != null && (backupDataOutput.getTransportFlags() & 1) != 0) {
            eieh eiehVarC = this.t.c("writeCmsSettingsToPreferences", "com/google/android/apps/messaging/backup/BugleBackupAgent", "onBackup", 269);
            try {
                try {
                    aumq aumqVar = (aumq) this.d.k().get();
                    crqv crqvVar = this.a;
                    String string = getString(R.string.bnr_enabled_status_pref_key);
                    auml aumlVarB = auml.b(aumqVar.r);
                    if (aumlVarB == null) {
                        aumlVarB = auml.UNSPECIFIED_STATUS;
                    }
                    crqvVar.j(string, aumlVarB.h);
                    crqv crqvVar2 = this.a;
                    String string2 = getString(R.string.multi_device_enabled_status_pref_key);
                    auml aumlVarB2 = auml.b(aumqVar.l);
                    if (aumlVarB2 == null) {
                        aumlVarB2 = auml.UNSPECIFIED_STATUS;
                    }
                    crqvVar2.j(string2, aumlVarB2.h);
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (InterruptedException | ExecutionException e) {
                this.i.n(e, "Failed to get cms settings data. Skipping backing up Cms related enabled statuses");
            }
            f();
            eiehVarC.close();
        }
        try {
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        } finally {
            k();
            this.i.g("onBackup finished.");
        }
    }

    @Override // android.app.backup.BackupAgent
    public final void onFullBackup(FullBackupDataOutput fullBackupDataOutput) {
        l();
        try {
            if (!this.w) {
                super.onFullBackup(fullBackupDataOutput);
            } else {
                try {
                    throw new fcth((byte[]) null);
                } catch (InterruptedException | ExecutionException e) {
                    throw new szt(e);
                }
            }
        } finally {
            this.v = true;
        }
    }

    @Override // defpackage.didv, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        l();
        this.q.a(3);
        l();
        this.i.g("Restoring notification channels.");
        if (this.n.f() != null) {
            eygg eyggVar = this.n.a;
            if (((NotificationManager) eyggVar.b()).getNotificationChannels() != null) {
                ArrayList arrayList = new ArrayList(((NotificationManager) eyggVar.b()).getNotificationChannels());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    NotificationChannel notificationChannelM = akc$$ExternalSyntheticApiModelOutline0.m(arrayList.get(i2));
                    if (TextUtils.equals(notificationChannelM.getGroup(), cqzq.CONVERSATIONS.e)) {
                        ((NotificationManager) eyggVar.b()).deleteNotificationChannel(notificationChannelM.getId());
                    }
                }
            }
        } else if (this.a.q(getString(R.string.notifications_enabled_pref_key), getResources().getBoolean(R.bool.notifications_enabled_pref_default))) {
            this.n.b(this.o.c(), this.a.f(getString(R.string.notification_sound_pref_key), null));
        }
        if (this.a.q(getString(R.string.cms_d2d_flag_pref_key), false)) {
            this.d.N();
            this.i.g("Restoring gaia Id.");
            String strF = this.a.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
            if (strF != null) {
                this.d.ae(strF);
            }
            this.i.g("Restoring priorToDeviceId.");
            String strF2 = this.a.f(getString(R.string.prior_to_d2d_device_id_pref_key), null);
            if (strF2 != null) {
                this.i.h("Restoring priorToDeviceId with device id: %s", strF2);
                this.d.af(strF2);
            } else {
                this.i.g("Device Id is empty. Skipping restoring of priorToD2dDeviceId");
            }
            m();
        }
        if (!this.r.a() || Build.VERSION.SDK_INT < 28) {
            return;
        }
        eieh eiehVarC = this.t.c("restoreCmsSettingsToPreferences", "com/google/android/apps/messaging/backup/BugleBackupAgent", "onRestore", 578);
        try {
            this.i.g("Restoring linked account.");
            final String strF3 = this.a.f(getString(R.string.bnr_gaia_account_user_id_pref_key), null);
            auvh.h(strF3 != null ? eiju.g(this.h.f()).h(new ejvr() { // from class: szi
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    for (egbe egbeVar : (List) obj) {
                        String str = strF3;
                        if (egbeVar.b().c.equals(str) && egbeVar.b().k.equals("google")) {
                            BugleBackupAgent bugleBackupAgent = this.a;
                            bugleBackupAgent.i.g("Found account with matching userId");
                            bugleBackupAgent.c.c(egbeVar.a());
                            return null;
                        }
                    }
                    return null;
                }
            }, this.e) : eijx.e(null));
            this.i.g("Restoring cms enabled statuses.");
            auml aumlVarB = auml.b(this.a.d(getString(R.string.bnr_enabled_status_pref_key), 0));
            if (aumlVarB != null) {
                this.d.Q(aumlVarB);
            }
            auml aumlVarB2 = auml.b(this.a.d(getString(R.string.multi_device_enabled_status_pref_key), 0));
            if (aumlVarB2 != null) {
                this.d.ad(aumlVarB2);
            }
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

    @Override // android.app.backup.BackupAgent
    public final void onRestoreFinished() {
        l();
        if (!this.x) {
            super.onRestoreFinished();
            return;
        }
        try {
            this.i.g("Starting deferred restore.");
            szv.a();
        } finally {
            this.v = true;
        }
    }
}
