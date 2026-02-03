package defpackage;

import com.google.frameworks.client.data.android.server.tiktok.bugle.RcsProcessEndpointService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esuy extends lvp implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
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
            RcsProcessEndpointService rcsProcessEndpointService = (RcsProcessEndpointService) this;
            ahij ahijVar = (ahij) bb();
            rcsProcessEndpointService.a = ahijVar.a();
            rcsProcessEndpointService.b = (fbuj) ahijVar.b.lG.b();
            rcsProcessEndpointService.c = ahijVar.c();
        }
        super.onCreate();
    }
}
