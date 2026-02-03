package com.google.android.gms.usagereporting.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.ElCapitanOptions;
import com.google.android.gms.usagereporting.SafetyOptions;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks;
import com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import defpackage.dcfo;
import defpackage.dcfp;
import defpackage.dcgq;
import defpackage.dcib;
import defpackage.dcke;
import defpackage.dcko;
import defpackage.dejh;
import defpackage.dejw;
import defpackage.deka;
import defpackage.dekc;
import defpackage.dekd;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UsageReportingClientImpl extends dcko {
    private final AtomicReference a;

    /* compiled from: PG */
    public static class AbstractCallbacks extends IUsageReportingCallbacks.Stub {
        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCanLog(Status status, boolean z, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onCheckConsents(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetAppWhitelist(Status status, List<String> list) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetCheckboxSettingsPendingIntent(PendingIntent pendingIntent) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetElCapitanOptions(Status status, ElCapitanOptions elCapitanOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetOptInOptions(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetPassedWhitelists(Status status, ConsentInformation consentInformation) {
            throw new IllegalStateException("Not implemented");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onGetSafetyOptions(Status status, SafetyOptions safetyOptions) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onRegisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetAppWhitelist(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetElCapitanOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetOptInOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onSetSafetyOptions(Status status) {
            throw new IllegalStateException("Not implemented.");
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks
        public void onUnregisterOptInOptionsChangedListener(Status status) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* compiled from: PG */
    public static class CanLogCallbacks extends AbstractCallbacks {
    }

    /* compiled from: PG */
    public static final class UsageReportingOptInOptionsChangedListener extends IUsageReportingOptInOptionsChangedListener.Stub {
        private final dcib a;

        public UsageReportingOptInOptionsChangedListener(dcib<dejw> dcibVar) {
            this.a = dcibVar;
        }

        @Override // com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener
        public void onOptInOptionsChanged() {
            this.a.b(new dekd());
        }
    }

    public UsageReportingClientImpl(Context context, Looper looper, dcke dckeVar, dcfo dcfoVar, dcfp dcfpVar) {
        super(context, looper, 41, dckeVar, dcfoVar, dcfpVar);
        this.a = new AtomicReference();
    }

    public final void M(UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener, UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener2, dcgq dcgqVar) {
        dekc dekcVar = new dekc((IUsageReportingService) w(), dcgqVar, usageReportingOptInOptionsChangedListener2);
        if (usageReportingOptInOptionsChangedListener != null) {
            ((IUsageReportingService) w()).unregisterOptInOptionsChangedListenerConnectionless(usageReportingOptInOptionsChangedListener, dekcVar);
        } else if (usageReportingOptInOptionsChangedListener2 == null) {
            dcgqVar.c(Status.a);
        } else {
            ((IUsageReportingService) w()).registerOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener2, dekcVar);
        }
    }

    @Override // defpackage.dcko, com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final int a() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        return IUsageReportingService.Stub.asInterface(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean gq() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] gr() {
        return dejh.f;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, defpackage.dcfc
    public final void m() {
        try {
            UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = (UsageReportingOptInOptionsChangedListener) this.a.getAndSet(null);
            if (usageReportingOptInOptionsChangedListener != null) {
                ((IUsageReportingService) w()).unregisterOptInOptionsChangedListener(usageReportingOptInOptionsChangedListener, new deka());
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.m();
    }
}
