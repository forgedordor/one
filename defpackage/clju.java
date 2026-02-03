package defpackage;

import com.google.android.apps.messaging.shared.satelliteapi.endpointservice.GrpcEndpointService;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clju extends lvp implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyho(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.lvp, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            bb();
            ((GrpcEndpointService) this).a = ahij.d();
        }
        super.onCreate();
    }
}
