package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhhl {
    private final dhkr a;
    private final crny b;
    private final Object c = new Object();
    private ConnectivityManager.NetworkCallback d = null;

    public dhhl(Context context, crny crnyVar) {
        this.a = dhkq.f(context);
        this.b = crnyVar;
    }

    public final Network a() {
        crny crnyVar = this.b;
        crnyVar.i();
        Network network = null;
        if (!crnyVar.i().A()) {
            return null;
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
        try {
            synchronized (this.c) {
                dhhk dhhkVar = new dhhk(settableFutureCreate);
                this.d = dhhkVar;
                try {
                    ((dhkq) this.a).a.requestNetwork(networkRequestBuild, dhhkVar);
                } catch (SecurityException e) {
                    throw new dhkf("ACCESS_NETWORK_STATE permission is missing.", e);
                }
            }
            network = (Network) settableFutureCreate.r(10L, TimeUnit.SECONDS);
        } catch (dhkf e2) {
            dhja.i(e2, "Do not have required permission to get mobile network.", new Object[0]);
        } catch (TimeoutException e3) {
            dhja.i(e3, "Timeout when trying to get mobile network.", new Object[0]);
        } catch (Exception e4) {
            dhja.i(e4, "Exception when trying to get mobile network.", new Object[0]);
        }
        dhja.o("Got mobile network: %s", network);
        if (network == null) {
            b();
        }
        return network;
    }

    public final void b() {
        synchronized (this.c) {
            ConnectivityManager.NetworkCallback networkCallback = this.d;
            if (networkCallback != null) {
                try {
                    this.a.h(networkCallback);
                } catch (Exception e) {
                    dhja.i(e, "Exception when trying close network.", new Object[0]);
                }
                this.d = null;
            }
        }
    }
}
