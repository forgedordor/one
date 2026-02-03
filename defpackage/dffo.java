package defpackage;

import android.content.Context;
import com.google.android.ims.filetransfer.http.runnable.GenericFileTransferException;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffo extends dfig {
    static final dfny a = dfod.a(177199430);
    private static final byte[] b = new byte[0];
    private final dfgs k;
    private final dgfu l;
    private final String m;
    private final Optional n;
    private final int o;
    private final String p;
    private final String q;
    private final fcsu r;
    private long s;

    public dffo(Context context, dfdv dfdvVar, dgfu dgfuVar, fcsu fcsuVar, dfgs dfgsVar, long j, String str, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, String str2, Optional optional, int i, deyb deybVar, String str3) {
        super(context, j, str, instantMessageConfiguration, dfifVar, dfdvVar, deybVar, fcsuVar);
        this.l = dgfuVar;
        this.m = str2;
        this.n = optional;
        this.o = i;
        this.k = dfgsVar;
        this.p = str3;
        this.q = dfhq.e(str2);
        this.r = fcsuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final dfgr j(Optional optional) throws GenericFileTransferException {
        dhja.k("Using HttpDownloadStrategy to download the file.", new Object[0]);
        if (optional.isPresent()) {
            this.k.c(this.p, this.m, ((Long) optional.get()).longValue());
        } else {
            this.k.b(this.p, this.m);
        }
        try {
            return (dfgr) this.k.a().get(dfpe.a(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (e.getCause() instanceof GenericFileTransferException) {
                throw ((GenericFileTransferException) e.getCause());
            }
            throw new IllegalStateException("Download response future not present", e);
        }
    }

    private final void k(File file) throws IOException {
        if (file.delete()) {
            return;
        }
        this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_DELETE_A_FILE);
        throw new IOException("Unable to delete file " + file.getName() + ". Aborting.");
    }

    private final void l() {
        dfgs dfgsVar = this.k;
        if (Objects.isNull(dfgsVar)) {
            Objects.isNull(null);
        } else {
            dhja.k("Closing the connection in HttpDownloadStrategy", new Object[0]);
            dfgsVar.close();
        }
    }

    private final void m(Exception exc) {
        int i;
        b(dfek.e);
        if (this.j) {
            dhja.o("Download canceled", new Object[0]);
            this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_FILE_TRANSFER_CANCELLED);
            i = 5;
        } else {
            dhja.s(exc, "Unable to download file", new Object[0]);
            this.h.a(ewkx.FILE_TRANSFER_FAILURE_REASON_SESSION_ERROR);
            i = 8;
        }
        d(20013, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02e8 A[Catch: all -> 0x027e, TryCatch #8 {all -> 0x027e, blocks: (B:3:0x0012, B:52:0x01b3, B:88:0x027a, B:89:0x027d, B:95:0x0284, B:97:0x028a, B:99:0x02a2, B:109:0x02cc, B:116:0x02ed, B:110:0x02dc, B:112:0x02e2, B:113:0x02e5, B:114:0x02e8, B:115:0x02eb), top: B:126:0x0012, inners: #10, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02eb A[Catch: all -> 0x027e, TryCatch #8 {all -> 0x027e, blocks: (B:3:0x0012, B:52:0x01b3, B:88:0x027a, B:89:0x027d, B:95:0x0284, B:97:0x028a, B:99:0x02a2, B:109:0x02cc, B:116:0x02ed, B:110:0x02dc, B:112:0x02e2, B:113:0x02e5, B:114:0x02e8, B:115:0x02eb), top: B:126:0x0012, inners: #10, #9 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dffo.run():void");
    }
}
