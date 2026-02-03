package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.rcsmigration.RcsMigrationService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahez extends Service implements eyhy {
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
            RcsMigrationService rcsMigrationService = (RcsMigrationService) this;
            ahkn ahknVar = ((ahij) bb()).b;
            ahng ahngVar = ahknVar.b;
            rcsMigrationService.a = ahngVar.pw;
            rcsMigrationService.b = ahknVar.aI;
            rcsMigrationService.c = ahngVar.px;
        }
        super.onCreate();
    }
}
