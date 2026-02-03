package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.diagnostics.DiagnosticsService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aazo extends Service implements eyhy {
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
            ((DiagnosticsService) this).a = (cgbn) ((ahij) bb()).b.a.Cs.b();
        }
        super.onCreate();
    }
}
