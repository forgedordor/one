package com.google.android.apps.messaging.rcsmigration;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsmigration.File;
import com.google.android.ims.rcsmigration.IRcsStateProvider;
import com.google.android.ims.rcsmigration.LegacyData;
import com.google.android.ims.rcsmigration.LegacyToken;
import com.google.android.ims.rcsmigration.RcsState;
import com.google.android.ims.rcsmigration.UndeliveredMessage;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.service.JibeService;
import defpackage.arhc;
import defpackage.auvh;
import defpackage.cczr;
import defpackage.cdai;
import defpackage.chud;
import defpackage.cmfe;
import defpackage.dbhe;
import defpackage.dbhg;
import defpackage.dbhi;
import defpackage.dbhr;
import defpackage.dfdj;
import defpackage.dgix;
import defpackage.dgsz;
import defpackage.dhbm;
import defpackage.dhgs;
import defpackage.dhgz;
import defpackage.dhhb;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.dhkz;
import defpackage.dqzg;
import defpackage.eijx;
import defpackage.ekqg;
import defpackage.eosc;
import defpackage.fcsu;
import java.util.ArrayList;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class RcsStateProvider extends IRcsStateProvider.Stub {
    private final Context a;
    private final fcsu b;
    private final eosc c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    /* renamed from: $r8$lambda$FWM-xeGripR0_dMeQQlFKKAds0A, reason: not valid java name */
    public static /* synthetic */ void m279$r8$lambda$FWMxeGripR0_dMeQQlFKKAds0A(RcsStateProvider rcsStateProvider) {
        Boolean bool = true;
        dhhb.g.e(bool);
        dbhg dbhgVar = (dbhg) dhgs.b;
        dbhr dbhrVar = dbhgVar.b;
        ContentResolver contentResolver = dbhi.a;
        String str = dbhgVar.a;
        Bundle bundle = new Bundle();
        bool.getClass();
        bundle.putBoolean(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, true);
        bundle.putString("key", "migration_complete");
        bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, "boolean");
        ekqg ekqgVarListIterator = dbhrVar.c.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ((dqzg) ekqgVarListIterator.next()).a();
        }
        if (contentResolver.call(dbhrVar.a, "put", dbhrVar.b, bundle) == null) {
            Log.e("PreferenceFileAccessor", dbhe.a("call() returned null result; replacing with EMPTY", new Object[0]));
        }
        Context context = rcsStateProvider.a;
        if (dhka.a(context) == 2) {
            dhja.k("Rcs Engine should be running in cs.apk. Stopping JibeService.", new Object[0]);
            fcsu fcsuVar = rcsStateProvider.b;
            ((cmfe) fcsuVar.b()).n();
            dhja.k("JibeService stopped: %b", Boolean.valueOf(context.stopService(new Intent(context, (Class<?>) JibeService.class))));
            ((cmfe) fcsuVar.b()).m();
            dhbm.a().b(context, (dgix) rcsStateProvider.d.b());
        }
    }

    public RcsStateProvider(Context context, fcsu<cmfe> fcsuVar, eosc eoscVar, fcsu<dgix> fcsuVar2, cczr cczrVar, fcsu<cdai> fcsuVar3, fcsu<chud> fcsuVar4, fcsu<dgsz> fcsuVar5, fcsu<arhc> fcsuVar6) {
        cczrVar.a();
        fcsuVar3.b();
        this.a = context;
        this.b = fcsuVar;
        this.c = eoscVar;
        this.d = fcsuVar2;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        dbhi dbhiVar = dhgs.a;
        dbhi.a(context);
    }

    public void allowOrThrow() throws RemoteException {
        if (!((chud) this.e.b()).a(Binder.getCallingUid())) {
            throw new RemoteException("Caller not google signed.");
        }
    }

    public RcsState buildRcsState() {
        LegacyData legacyData;
        dfdj dfdjVar;
        boolean z;
        File fileD;
        String str;
        Context context = this.a;
        int iA = dhka.a(context);
        if (iA == 2) {
            fcsu fcsuVar = this.d;
            dhbm.a();
            dgix dgixVar = (dgix) fcsuVar.b();
            fcsu fcsuVar2 = this.f;
            dhkz.a();
            dhgz dhgzVar = new dhgz(context);
            Configuration.Token tokenK = dgixVar.c().k();
            if (tokenK == null || (str = tokenK.mValue) == null || str.equals("")) {
                tokenK = dgixVar.b();
            }
            LegacyToken legacyToken = new LegacyToken(tokenK.mValue, tokenK.mExpirationTime);
            int i = true != ((dgsz) fcsuVar2.b()).G() ? 0 : 2;
            int i2 = true != ((dgsz) fcsuVar2.b()).H() ? 0 : 2;
            ArrayList arrayList = new ArrayList();
            dfdj dfdjVar2 = new dfdj(context);
            Cursor cursorQuery = dfdjVar2.getReadableDatabase().query("not_yet_delivered_messages", null, null, null, null, null, "timestamp");
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    try {
                        dfdj dfdjVar3 = dfdjVar2;
                        arrayList.add(new UndeliveredMessage(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")), cursorQuery.getString(cursorQuery.getColumnIndex("user_id")), cursorQuery.getString(cursorQuery.getColumnIndex("message_id"))));
                        dfdjVar2 = dfdjVar3;
                    } finally {
                        cursorQuery.close();
                    }
                }
                dfdjVar = dfdjVar2;
                z = false;
            } else {
                dfdjVar = dfdjVar2;
                z = false;
            }
            dfdjVar.close();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String strC = dhbm.c(dgixVar);
            File fileD2 = strC != null ? dhbm.d(context, strC) : null;
            if (fileD2 != null) {
                arrayList3.add(fileD2);
            }
            java.io.File fileStreamPath = context.getFileStreamPath("httpft_pending");
            if (fileStreamPath != null && fileStreamPath.exists() && (fileD = dhbm.d(context, "httpft_pending")) != null) {
                arrayList3.add(fileD);
            }
            String strH = dhgzVar.h();
            boolean z2 = z;
            String strJ = dhgzVar.j();
            long jC = dhgzVar.c();
            Object[] objArr = new Object[1];
            objArr[z2 ? 1 : 0] = i != 0 ? i != 1 ? "GRANTED (2)" : "NOT_REQUIRED (1)" : "NOT_GRANTED (0)";
            dhja.c("Building legacy data, consent value is %s", objArr);
            legacyData = new LegacyData(legacyToken, i, i2, arrayList2, arrayList, arrayList3, strH, strJ, jC);
        } else {
            legacyData = null;
        }
        return new RcsState(iA, legacyData);
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public RcsState getRcsState() throws RemoteException {
        allowOrThrow();
        return buildRcsState();
    }

    @Override // com.google.android.ims.rcsmigration.IRcsStateProvider
    public void onMigrationComplete() throws RemoteException {
        allowOrThrow();
        dhja.k("Migration complete.", new Object[0]);
        auvh.h(eijx.f(new Runnable() { // from class: ahfa
            @Override // java.lang.Runnable
            public final void run() {
                RcsStateProvider.m279$r8$lambda$FWMxeGripR0_dMeQQlFKKAds0A(this.a);
            }
        }, this.c));
    }
}
