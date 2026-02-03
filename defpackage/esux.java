package defpackage;

import com.google.frameworks.client.data.android.server.tiktok.bugle.PdfPreviewGeneratorProcessEndpointService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class esux extends lvp implements eyhy {
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
            PdfPreviewGeneratorProcessEndpointService pdfPreviewGeneratorProcessEndpointService = (PdfPreviewGeneratorProcessEndpointService) this;
            ahij ahijVar = (ahij) bb();
            pdfPreviewGeneratorProcessEndpointService.a = ahijVar.a();
            pdfPreviewGeneratorProcessEndpointService.b = (fbuj) ahijVar.b.lG.b();
            pdfPreviewGeneratorProcessEndpointService.c = ahijVar.c();
        }
        super.onCreate();
    }
}
