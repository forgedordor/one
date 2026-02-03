package com.google.android.rcs.client.lifecycle;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import defpackage.cqca;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efao;
import defpackage.efaq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsEngineLifecycleServiceV2 extends efaj<IRcsEngineController> {
    public static final dfny h = dfnv.b("rcs_engine_lifecycle_service_v2_connection_deprecated");

    public RcsEngineLifecycleServiceV2(Context context, efaq efaqVar) {
        super(IRcsEngineController.class, context, efaqVar, 1, Optional.empty());
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult destroy(int i) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).destroy(i);
        } catch (RemoteException | IllegalStateException e) {
            cqca.t(e, "Error while destroying RCS engine for subId=%d.", Integer.valueOf(i));
            throw new efao("Error while initializing RCS engine.", e);
        }
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "RcsEngineLifecycleServiceVersions";
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult initialize(int i, int i2) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).initialize(i, i2);
        } catch (RemoteException | IllegalStateException e) {
            cqca.t(e, "Error while initializing RCS engine for subId=%d.", Integer.valueOf(i));
            throw new efao("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).initializeAndStartRcsTransport(initializeAndStartRcsTransportRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.p("RcsClientLib", e, "Error while initializing RCS transport");
            throw new efao("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).stopAllRcsTransportsExcept(stopAllRcsTransportsExceptRequest);
        } catch (RemoteException | IllegalStateException e) {
            cqca.p("RcsClientLib", e, "Error while initializing RCS transport");
            throw new efao("Error while initializing RCS engine.", e);
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).triggerStartRcsStack(i);
        } catch (RemoteException | IllegalStateException e) {
            cqca.t(e, "Error while starting RCS engine for subId=%d.", Integer.valueOf(i));
            throw new efao("Error while starting RCS engine.");
        }
    }

    public com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) throws efao {
        b();
        try {
            return ((IRcsEngineController) a()).triggerStopRcsStack(i);
        } catch (RemoteException | IllegalStateException e) {
            cqca.t(e, "Error while stopping RCS engine for subId=%d.", Integer.valueOf(i));
            throw new efao("Error while stopping RCS engine.");
        }
    }
}
