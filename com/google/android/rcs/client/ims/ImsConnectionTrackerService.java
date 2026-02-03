package com.google.android.rcs.client.ims;

import android.content.Context;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efal;
import defpackage.efao;
import defpackage.efaq;
import defpackage.ewee;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImsConnectionTrackerService extends efaj<IImsConnectionTracker> {
    public static final dfny h = dfnv.b("ims_connection_tracker_service_deprecated");

    public ImsConnectionTrackerService(Context context, efaq efaqVar, Optional<efal> optional) {
        super(IImsConnectionTracker.class, context, efaqVar, 1, optional);
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "ImsConnectionTrackerServiceVersions";
    }

    public ImsRegistrationState getRegistrationState() throws efao {
        b();
        try {
            return ((IImsConnectionTracker) a()).getRegistrationState();
        } catch (Exception e) {
            throw new efao(e.getMessage());
        }
    }

    @Override // defpackage.efaj
    public ewee getServiceNameLoggingEnum() {
        return ewee.IMS_CONNECTION_TRACKER_SERVICE;
    }

    public boolean isRegistered() throws efao {
        b();
        try {
            return ((IImsConnectionTracker) a()).isRegistered();
        } catch (Exception e) {
            throw new efao(e.getMessage());
        }
    }
}
