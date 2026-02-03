package defpackage;

import com.google.android.ims.filetransfer.http.runnable.GbaBootstrapAuthenticationException;
import org.apache.http.HttpResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfgk implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ dfgl c;

    public dfgk(dfgl dfglVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = dfglVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.d.b(this.a, ((HttpResponse) obj).getStatusLine().getStatusCode(), dhkl.a().longValue() - this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (((Boolean) dfgl.b.a()).booleanValue()) {
            if (!(th instanceof GbaBootstrapAuthenticationException)) {
                dhja.j(th, dfgl.a, "unexpected exception during GBA HTTP request processing", new Object[0]);
                dfgl dfglVar = this.c;
                dfglVar.d.a(ewkx.FILE_TRANSFER_FAILURE_REASON_GBA_UNEXPECTED_EXCEPTION);
                return;
            }
            dhja.j(th, dfgl.a, "GbaBootstrapAuthenticationException from content server %s", this.a);
            dfgl dfglVar2 = this.c;
            dfglVar2.d.a(ewkx.FILE_TRANSFER_FAILURE_REASON_GBA_AUTH_FAILURE);
        }
    }
}
