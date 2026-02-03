package com.google.android.rcs.client.lifecycle;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.cqca;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.efaj;
import defpackage.efao;
import defpackage.efaq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsEngineLifecycleService extends efaj<IRcsEngineTemporaryController> {
    public static final dfny h = dfnv.b("rcs_engine_lifecycle_service_connection_deprecated");

    public RcsEngineLifecycleService(Context context, efaq efaqVar) {
        super(IRcsEngineTemporaryController.class, context, efaqVar, 1, Optional.empty());
    }

    @Override // defpackage.efaj
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.efaj
    public String getRcsServiceMetaDataKey() {
        return "RcsEngineLifecycleServiceVersions";
    }

    public RcsEngineLifecycleServiceResult triggerStartRcsStack(String str) throws efao {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStartRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            cqca.p("RcsClientLib", e, "Error while starting RCS engine.");
            throw new efao("Error while starting RCS engine.");
        }
    }

    public RcsEngineLifecycleServiceResult triggerStopRcsStack(String str) throws efao {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStopRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            cqca.p("RcsClientLib", e, "Error while stopping RCS engine.");
            throw new efao("Error while stopping RCS engine.");
        }
    }
}
