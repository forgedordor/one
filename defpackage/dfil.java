package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Process;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfil extends dfig {
    private final String a;
    private final int b;
    private final String k;
    private final String l;
    private final dfgs m;

    public dfil(Context context, dfgs dfgsVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, dfdv dfdvVar, String str2, int i, deyb deybVar, String str3, fcsu fcsuVar) {
        super(context, j, str, instantMessageConfiguration, dfifVar, dfdvVar, deybVar, fcsuVar);
        this.a = str2;
        this.b = i;
        this.k = str3;
        this.m = dfgsVar;
        this.l = k(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dfgr j() {
        dfgs dfgsVar = this.m;
        if (Objects.isNull(dfgsVar)) {
            throw null;
        }
        dhja.k("Using HttpDownloadStrategy to download the thumbnail.", new Object[0]);
        dfgsVar.b(this.k, this.a);
        try {
            return (dfgr) dfgsVar.a().get(dfpe.a(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IllegalStateException("Download response future not present", e);
        }
    }

    private static String k(String str) {
        try {
            return new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    private final void l() {
        dfgs dfgsVar = this.m;
        if (Objects.isNull(dfgsVar)) {
            Objects.isNull(null);
        } else {
            dhja.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            dfgsVar.close();
        }
    }

    private final void m(Exception exc, ewkx ewkxVar) {
        dhja.i(exc, "Unable to download thumbnail for HTTP download", new Object[0]);
        this.h.a(ewkxVar);
        b(dfek.e);
    }

    @Override // java.lang.Runnable
    public final void run() {
        deyb deybVar = this.h;
        deybVar.c(2);
        deybVar.c(3);
        try {
            try {
                try {
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    String str = this.l;
                    deybVar.d(str, 2, ekoj.a);
                    long jLongValue = dhkl.a().longValue();
                    dfgr dfgrVarJ = j();
                    deybVar.b(str, dfgrVarJ.a(), dhkl.a().longValue() - jLongValue);
                    Optional optionalC = dfgrVarJ.c();
                    if (!Objects.isNull(this.m) && optionalC.isEmpty()) {
                        throw new IllegalStateException("Input stream not present in the HTTP response obtained from the HttpDownloadStrategy.");
                    }
                    c(g((InputStream) optionalC.get(), this.b), Uri.EMPTY);
                    deybVar.c(6);
                } catch (IllegalStateException e) {
                    m(e, ewkx.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
                }
            } catch (GenericFileTransferException e2) {
                m(e2, e2.a());
            } catch (IOException e3) {
                this.h.e(this.l);
                m(e3, ewkx.FILE_TRANSFER_FAILURE_REASON_HTTP_REQUEST_FAILED);
            }
        } finally {
            l();
            TrafficStats.clearThreadStatsTag();
        }
    }
}
