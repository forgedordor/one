package defpackage;

import android.app.job.JobService;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionJobService;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayoq extends JobService implements eyhy {
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
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ActionJobService actionJobService = (ActionJobService) this;
            ahkn ahknVar = ((ahij) bb()).b;
            ahnh ahnhVar = ahknVar.a;
            actionJobService.b = (ayoe) ahnhVar.wO.b();
            actionJobService.c = (eigp) ahknVar.aI.b();
            actionJobService.d = ahnhVar.wQ;
            actionJobService.e = ahknVar.p;
        }
        super.onCreate();
    }
}
