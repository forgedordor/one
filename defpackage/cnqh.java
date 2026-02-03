package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnqh implements cmvv {
    private final Context a;
    private final cnqi b;

    public cnqh(Context context, cnqi cnqiVar) {
        context.getClass();
        cnqiVar.getClass();
        this.a = context;
        this.b = cnqiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Uri uri) {
        cnqi cnqiVar = this.b;
        if (cnqiVar.b()) {
            aiiw aiiwVarD = aiiw.d("GOOGLE_MESSAGES_ARCHIVAL_UPDATE");
            String strA = cnqiVar.a();
            strA.getClass();
            aiiwVarD.f(strA);
            Intent intentA = aiiwVarD.a();
            intentA.getClass();
            if (uri != null) {
                intentA.putExtra("com.google.android.apps.messaging.EXTRA_ARCHIVAL_URI", uri);
            }
            this.a.startForegroundService(intentA);
        }
    }

    @Override // defpackage.cmvv
    public final void b(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void c() {
        m(null);
    }

    @Override // defpackage.cmvv
    public final void d(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void e() {
        m(null);
    }

    @Override // defpackage.cmvv
    public final void f() {
        m(null);
    }

    @Override // defpackage.cmvv
    public final void g(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void h(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void i(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void j(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void k(Uri uri) {
        m(uri);
    }

    @Override // defpackage.cmvv
    public final void a(Uri uri, UUID uuid) {
    }
}
