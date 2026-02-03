package defpackage;

import android.app.Service;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class duvi extends Service implements eyhy {
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
            ((duvh) this).a = (duut) ((ahij) bb()).b.a.JP.b();
        }
        super.onCreate();
    }
}
