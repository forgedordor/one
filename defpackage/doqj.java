package defpackage;

import com.google.android.libraries.compose.photos.api.callback.PhotosApiCallbackService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class doqj extends lvp implements eyhy {
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
            ((PhotosApiCallbackService) this).a = new doql(new cgvg(new cgvh(((ahij) bb()).b.b.a.a.rF)));
        }
        super.onCreate();
    }
}
