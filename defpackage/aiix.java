package defpackage;

import android.app.IntentService;
import com.google.android.apps.messaging.shared.NoConfirmationSmsSendService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class aiix extends IntentService implements eyhy {
    private volatile eyho a;
    private final Object b;
    private boolean c;

    public aiix() {
        super("com.google.android.apps.messaging.shared.NoConfirmationSmsSendService");
        this.b = new Object();
        this.c = false;
    }

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

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((NoConfirmationSmsSendService) this).a = (aypn) ((ahij) bb()).b.b.dN.b();
        }
        super.onCreate();
    }
}
