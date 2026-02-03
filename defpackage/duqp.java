package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqp implements durd {
    private final duoc a;
    private final ecev b;
    private final dtqs c;
    private final String d;
    private final durk e;
    private final dtrw f;
    private final int g;
    private final long h;
    private final String i;
    private final dtpi j;
    private final Executor k;
    private final int l;

    public duqp(duoc duocVar, ecev ecevVar, dtqs dtqsVar, int i, durk durkVar, dtrw dtrwVar, int i2, long j, String str, dtpi dtpiVar, Executor executor) {
        this.a = duocVar;
        this.b = ecevVar;
        this.c = dtqsVar;
        this.l = i;
        this.d = dutx.e(dtqsVar);
        this.e = durkVar;
        this.f = dtrwVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = dtpiVar;
        this.k = executor;
    }

    static ListenableFuture c(duoc duocVar, dtqs dtqsVar, int i, final ecev ecevVar, final Uri uri, final String str, final durk durkVar, final dtpi dtpiVar, Executor executor) {
        return dvaq.e(e(duocVar, duob.a(dtqsVar, i), executor)).g(new eooz() { // from class: duql
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                int i2 = ((dtsh) obj).h;
                ecev ecevVar2 = ecevVar;
                String str2 = str;
                Uri uri2 = uri;
                if (i2 >= dtpiVar.f()) {
                    durk durkVar2 = durkVar;
                    durt.c("%s: Checksum mismatch detected but the has already reached retry limit! Skipping removal for file %s", "DownloaderCallbackImpl", str2);
                    durkVar2.l(1115);
                } else {
                    durt.b("%s: Removing file and marking as corrupted due to checksum mismatch", "DownloaderCallbackImpl");
                    try {
                        ecevVar2.f(uri2);
                    } catch (IOException e) {
                        durt.k(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", str2);
                        return eork.h(e);
                    }
                }
                return eorv.a;
            }
        }, executor);
    }

    static ListenableFuture d(final dtru dtruVar, dtqs dtqsVar, int i, final duoc duocVar, Executor executor) {
        final dtsd dtsdVarA = duob.a(dtqsVar, i);
        return dvaq.e(e(duocVar, dtsdVarA, executor)).g(new eooz() { // from class: duqj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                dtsg dtsgVar = (dtsg) dtshVar.toBuilder();
                dtsgVar.copyOnWrite();
                dtsh dtshVar2 = (dtsh) dtsgVar.instance;
                dtru dtruVar2 = dtruVar;
                dtshVar2.d = dtruVar2.h;
                dtshVar2.b |= 2;
                if (dtruVar2.equals(dtru.CORRUPTED)) {
                    int i2 = dtshVar.h + 1;
                    dtsgVar.copyOnWrite();
                    dtsh dtshVar3 = (dtsh) dtsgVar.instance;
                    dtshVar3.b |= 32;
                    dtshVar3.h = i2;
                }
                return duocVar.h(dtsdVarA, (dtsh) dtsgVar.build());
            }
        }, executor).g(new eooz() { // from class: duqk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eorv.a;
                }
                durt.h("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", dtsdVarA);
                dtov dtovVarA = dtox.a();
                dtovVarA.a = dtow.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return eork.h(dtovVarA.a());
            }
        }, executor);
    }

    private static ListenableFuture e(duoc duocVar, final dtsd dtsdVar, Executor executor) {
        return eika.k(duocVar.e(dtsdVar), new eooz() { // from class: duqo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                dtsh dtshVar = (dtsh) obj;
                if (dtshVar != null) {
                    return eork.i(dtshVar);
                }
                durt.h("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", dtsdVar);
                dtov dtovVarA = dtox.a();
                dtovVarA.a = dtow.SHARED_FILE_NOT_FOUND_ERROR;
                return eork.h(dtovVarA.a());
            }
        }, executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        r0 = r24.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r0.c(r25, new defpackage.ecgy());
        r0.g(r25, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0145, code lost:
    
        defpackage.durt.k(r0, "%s: Failed to apply defrag download transform for file %s.", "DownloaderCallbackImpl", r25);
        r2 = defpackage.dtox.a();
        r2.a = defpackage.dtow.DOWNLOAD_TRANSFORM_IO_ERROR;
        r2.c = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015f, code lost:
    
        throw r2.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0160 A[EDGE_INSN: B:127:0x0160->B:50:0x0160 BREAK  A[LOOP:0: B:40:0x0124->B:147:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.durd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture a(android.net.Uri r25) throws defpackage.dtox, java.io.IOException {
        /*
            Method dump skipped, instructions count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duqp.a(android.net.Uri):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.durd
    public final ListenableFuture b(dtox dtoxVar) {
        durt.c("%s: Failed to download file %s", "DownloaderCallbackImpl", this.d);
        if (dtoxVar.a.equals(dtow.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return d(dtru.CORRUPTED, this.c, this.l, this.a, this.k);
        }
        return d(dtru.DOWNLOAD_FAILED, this.c, this.l, this.a, this.k);
    }
}
