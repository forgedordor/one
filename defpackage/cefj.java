package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.net.DittoForegroundService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cefj extends Service implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            DittoForegroundService dittoForegroundService = (DittoForegroundService) this;
            ahij ahijVar = (ahij) bb();
            ahkn ahknVar = ahijVar.b;
            ahnh ahnhVar = ahknVar.a;
            dittoForegroundService.c = (cqzr) ahnhVar.pd.b();
            dittoForegroundService.d = ahknVar.hZ;
            dittoForegroundService.e = ahnhVar.aaZ;
            dittoForegroundService.f = ahknVar.b.bo;
            dittoForegroundService.g = ahijVar.q;
            dittoForegroundService.h = ahnhVar.rK;
            dittoForegroundService.i = ahnhVar.pI;
            dittoForegroundService.j = ahknVar.y;
        }
        super.onCreate();
    }
}
