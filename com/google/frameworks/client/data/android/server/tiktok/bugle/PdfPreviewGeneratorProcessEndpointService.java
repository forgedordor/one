package com.google.frameworks.client.data.android.server.tiktok.bugle;

import android.content.Intent;
import android.os.IBinder;
import defpackage.esty;
import defpackage.esub;
import defpackage.esux;
import defpackage.fbuj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PdfPreviewGeneratorProcessEndpointService extends esux {
    public esty a;
    public fbuj b;
    public esub c;

    @Override // defpackage.lvp, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override // defpackage.esux, defpackage.lvp, android.app.Service
    public final void onCreate() throws ClassNotFoundException {
        super.onCreate();
        this.a.c(this.c.a(true), this.b);
    }
}
