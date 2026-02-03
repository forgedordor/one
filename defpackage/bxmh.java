package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingService;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxmh extends Service implements eyhy {
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

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ResizingService resizingService = (ResizingService) this;
            ahkn ahknVar = ((ahij) bb()).b;
            ahnh ahnhVar = ahknVar.a;
            resizingService.b = (cgbn) ahnhVar.Cs.b();
            resizingService.c = (bxna) ahnhVar.Qs.b();
            resizingService.d = (eigp) ahknVar.aI.b();
        }
        super.onCreate();
    }
}
