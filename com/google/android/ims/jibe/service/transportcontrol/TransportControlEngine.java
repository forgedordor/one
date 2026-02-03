package com.google.android.ims.jibe.service.transportcontrol;

import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.dgtw;
import defpackage.dhes;
import defpackage.dhja;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TransportControlEngine extends ITransportControl.Stub {
    private final dgtw a;
    private final dhes b;

    public TransportControlEngine(dgtw dgtwVar, dhes dhesVar) {
        this.a = dgtwVar;
        this.b = dhesVar;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        int i = transportOptions.a;
        if (i == 0) {
            dhja.k("Received start RCS stack request from Bugle", new Object[0]);
            this.a.startRcsStack(this.b.b());
        } else {
            if (i != 1) {
                dhja.q("Unknown transport type: %d", Integer.valueOf(i));
                return new TransportControlServiceResult(12);
            }
            dhja.k("Received stop RCS stack request from Bugle", new Object[0]);
            this.a.stopRcsStack(this.b.b());
        }
        return new TransportControlServiceResult(0);
    }
}
