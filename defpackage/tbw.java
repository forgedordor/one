package defpackage;

import com.google.android.apps.messaging.backup.CustomD2DSourceEndpointService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tbw extends lvp implements eyhy {
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
            ((CustomD2DSourceEndpointService) this).a = ahij.d();
        }
        super.onCreate();
    }
}
