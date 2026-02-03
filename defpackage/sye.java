package defpackage;

import com.google.android.apps.messaging.auto.MessagingTemplateScreenServiceModule;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sye extends cku implements eyhy {
    private volatile eyho c;
    private final Object d = new Object();
    private boolean e = false;

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.eyhy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new eyho(this);
                }
            }
        }
        return this.c;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.e) {
            this.e = true;
            MessagingTemplateScreenServiceModule messagingTemplateScreenServiceModule = (MessagingTemplateScreenServiceModule) this;
            ahij ahijVar = (ahij) bb();
            messagingTemplateScreenServiceModule.d = ahijVar.c;
            ahkn ahknVar = ahijVar.b;
            messagingTemplateScreenServiceModule.e = ahknVar.oF;
            messagingTemplateScreenServiceModule.f = ahknVar.a.pb;
            messagingTemplateScreenServiceModule.g = ahknVar.b.pr;
        }
        super.onCreate();
    }
}
