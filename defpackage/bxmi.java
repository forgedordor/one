package defpackage;

import android.app.Service;
import com.google.android.apps.messaging.shared.datamodel.resizing.ResizingServiceAndroidV;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class bxmi extends Service implements eyhy {
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
            ResizingServiceAndroidV resizingServiceAndroidV = (ResizingServiceAndroidV) this;
            ahkn ahknVar = ((ahij) bb()).b;
            ahnh ahnhVar = ahknVar.a;
            resizingServiceAndroidV.b = ahnhVar.Cs;
            resizingServiceAndroidV.c = ahnhVar.Qs;
            resizingServiceAndroidV.d = ahknVar.aI;
        }
        super.onCreate();
    }
}
