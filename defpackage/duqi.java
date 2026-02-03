package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duqi implements durd {
    public final Context a;
    public final duoc b;
    public final ecev c;
    public final dtvq d;
    public final dtqs e;
    public final dtrc f;
    public final durk g;
    public final dtrw h;
    public final int i;
    public final long j;
    public final String k;
    public final ejwi l;
    public final Executor m;
    public final dtyx n;
    public final int o;
    private final dtpi p;

    public duqi(Context context, duoc duocVar, ecev ecevVar, dtvq dtvqVar, dtqs dtqsVar, int i, dtyx dtyxVar, dtrc dtrcVar, durk durkVar, dtrw dtrwVar, int i2, long j, String str, ejwi ejwiVar, dtpi dtpiVar, Executor executor) {
        this.a = context;
        this.b = duocVar;
        this.c = ecevVar;
        this.d = dtvqVar;
        this.e = dtqsVar;
        this.o = i;
        this.n = dtyxVar;
        this.f = dtrcVar;
        this.g = durkVar;
        this.h = dtrwVar;
        this.i = i2;
        this.j = j;
        this.k = str;
        this.l = ejwiVar;
        this.p = dtpiVar;
        this.m = executor;
    }

    @Override // defpackage.durd
    public final ListenableFuture a(final Uri uri) {
        durt.c("%s: Successfully downloaded delta file %s", "DeltaFileDownloaderCallbackImpl", uri);
        ecev ecevVar = this.c;
        dtrc dtrcVar = this.f;
        if (!duqr.d(ecevVar, uri, dtrcVar.e)) {
            durt.i("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, dtrcVar.e);
            dtov dtovVarA = dtox.a();
            dtovVarA.a = dtow.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            final dtox dtoxVarA = dtovVarA.a();
            duoc duocVar = this.b;
            dtqs dtqsVar = this.e;
            int i = this.o;
            String str = dtrcVar.e;
            durk durkVar = this.g;
            dtpi dtpiVar = this.p;
            Executor executor = this.m;
            return dvaq.e(duqp.c(duocVar, dtqsVar, i, ecevVar, uri, str, durkVar, dtpiVar, executor)).d(IOException.class, new eooz() { // from class: duqf
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    dtoxVarA.addSuppressed((IOException) obj);
                    return eorv.a;
                }
            }, executor).g(new eooz() { // from class: duqg
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eork.h(dtoxVarA);
                }
            }, executor);
        }
        final Uri uriA = duqq.a(uri);
        dtsc dtscVar = (dtsc) dtsd.a.createBuilder();
        dtqk dtqkVar = dtrcVar.g;
        if (dtqkVar == null) {
            dtqkVar = dtqk.a;
        }
        String str2 = dtqkVar.c;
        dtscVar.copyOnWrite();
        dtsd dtsdVar = (dtsd) dtscVar.instance;
        str2.getClass();
        dtsdVar.b |= 4;
        dtsdVar.e = str2;
        int i2 = this.o;
        dtscVar.copyOnWrite();
        dtsd dtsdVar2 = (dtsd) dtscVar.instance;
        dtsdVar2.f = i2 - 1;
        dtsdVar2.b |= 8;
        final dtsd dtsdVar3 = (dtsd) dtscVar.build();
        ListenableFuture listenableFutureE = this.b.e(dtsdVar3);
        eooz eoozVar = new eooz() { // from class: duqe
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws dtyw {
                int i3;
                duqi duqiVar = this.a;
                Uri uri2 = uriA;
                Uri uri3 = uri;
                dtsh dtshVar = (dtsh) obj;
                Uri uriE = null;
                if (dtshVar != null) {
                    dtru dtruVarB = dtru.b(dtshVar.d);
                    if (dtruVarB == null) {
                        dtruVarB = dtru.NONE;
                    }
                    if (dtruVarB == dtru.DOWNLOAD_COMPLETE) {
                        uriE = duto.e(duqiVar.a, duqiVar.o, dtshVar.c, dtsdVar3.e, duqiVar.d, duqiVar.l, false);
                    }
                }
                if (uriE == null) {
                    dtov dtovVarA2 = dtox.a();
                    dtovVarA2.a = dtow.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return eork.h(dtovVarA2.a());
                }
                try {
                    ecev ecevVar2 = duqiVar.c;
                    if (ecevVar2.h(uri2)) {
                        ecevVar2.f(uri2);
                    }
                    dtyx dtyxVar = duqiVar.n;
                    if (!VcDiffFileDecoder.a) {
                        throw new dtyw("VcDiff decoding library is not initialized!");
                    }
                    try {
                        if (!VcDiffFileDecoder.a(dtyxVar.a(uriE), dtyxVar.a(uri3), dtyxVar.a(uri2))) {
                            throw new dtyw("Failed to decode.");
                        }
                        ecevVar2.f(uri3);
                        eoiq eoiqVar = (eoiq) eoir.a.createBuilder();
                        dtrw dtrwVar = duqiVar.h;
                        String str3 = dtrwVar.c;
                        eoiqVar.copyOnWrite();
                        eoir eoirVar = (eoir) eoiqVar.instance;
                        str3.getClass();
                        eoirVar.b = 1 | eoirVar.b;
                        eoirVar.c = str3;
                        int i4 = duqiVar.i;
                        eoiqVar.copyOnWrite();
                        eoir eoirVar2 = (eoir) eoiqVar.instance;
                        eoirVar2.b = 2 | eoirVar2.b;
                        eoirVar2.d = i4;
                        String str4 = dtrwVar.d;
                        eoiqVar.copyOnWrite();
                        eoir eoirVar3 = (eoir) eoiqVar.instance;
                        str4.getClass();
                        eoirVar3.b |= 4;
                        eoirVar3.e = str4;
                        long j = duqiVar.j;
                        eoiqVar.copyOnWrite();
                        eoir eoirVar4 = (eoir) eoiqVar.instance;
                        eoirVar4.b |= 64;
                        eoirVar4.i = j;
                        String str5 = duqiVar.k;
                        eoiqVar.copyOnWrite();
                        eoir eoirVar5 = (eoir) eoiqVar.instance;
                        str5.getClass();
                        eoirVar5.b |= 128;
                        eoirVar5.j = str5;
                        eoir eoirVar6 = (eoir) eoiqVar.build();
                        durk durkVar2 = duqiVar.g;
                        dtqs dtqsVar2 = duqiVar.e;
                        dtrc dtrcVar2 = duqiVar.f;
                        long j2 = dtqsVar2.e;
                        long j3 = dtrcVar2.d;
                        String str6 = dtqsVar2.c;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= dtqsVar2.l.size()) {
                                i3 = 0;
                                break;
                            }
                            int i6 = i5 + 1;
                            if (ejuf.e(((dtrc) dtqsVar2.l.get(i5)).e, dtrcVar2.e)) {
                                i3 = i6;
                                break;
                            }
                            i5 = i6;
                        }
                        durkVar2.o(eoirVar6, 4, j2, j3, str6, i3);
                        return eorv.a;
                    } catch (ecge e) {
                        throw new dtyw(e);
                    }
                } catch (IOException e2) {
                    durt.k(e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", duqiVar.f.c, duqiVar.e.g);
                    duqiVar.d.a();
                    dtov dtovVarA3 = dtox.a();
                    dtovVarA3.a = dtow.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    dtovVarA3.c = e2;
                    return eork.h(dtovVarA3.a());
                }
            }
        };
        Executor executor2 = this.m;
        return eika.k(eika.k(listenableFutureE, eoozVar, executor2), new eooz() { // from class: duqh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                duqi duqiVar = this.a;
                ecev ecevVar2 = duqiVar.c;
                Uri uri2 = uriA;
                dtqs dtqsVar2 = duqiVar.e;
                if (duqr.d(ecevVar2, uri2, dtqsVar2.g)) {
                    return duqp.d(dtru.DOWNLOAD_COMPLETE, dtqsVar2, duqiVar.o, duqiVar.b, duqiVar.m);
                }
                durt.h("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                dtov dtovVarA2 = dtox.a();
                dtovVarA2.a = dtow.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return eork.h(dtovVarA2.a());
            }
        }, executor2);
    }

    @Override // defpackage.durd
    public final ListenableFuture b(dtox dtoxVar) {
        dtqs dtqsVar = this.e;
        durt.c("%s: Failed to download file(delta) %s", "DeltaFileDownloaderCallbackImpl", dtqsVar.g);
        if (dtoxVar.a.equals(dtow.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return duqp.d(dtru.CORRUPTED, dtqsVar, this.o, this.b, this.m);
        }
        return duqp.d(dtru.DOWNLOAD_FAILED, dtqsVar, this.o, this.b, this.m);
    }
}
