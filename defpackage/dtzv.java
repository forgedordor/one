package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzv implements dtzo {
    public final dxfd a;
    public final dxfe b;
    private final Context c;
    private final ecev d;
    private final Executor e;

    public dtzv(Context context, dxfd dxfdVar, dxfe dxfeVar, ecev ecevVar, Executor executor) {
        this.c = context;
        this.a = dxfdVar;
        this.b = dxfeVar;
        this.d = ecevVar;
        this.e = executor;
    }

    @Override // defpackage.dtzo
    public final ListenableFuture a(dtzh dtzhVar) {
        dtyz dtyzVar = (dtyz) dtzhVar;
        final String str = dtyzVar.a;
        final ejwi ejwiVar = dtyzVar.b;
        return eika.j(eika.i(new eooy() { // from class: dtzt
            @Override // defpackage.eooy
            public final ListenableFuture a() throws ProtocolException {
                String str2 = str;
                durt.c("%s: Fetch the latest ETag; url = %s", "OffroadFileDownloader", str2);
                HttpURLConnection httpURLConnectionA = this.a.b.a(str2);
                httpURLConnectionA.setRequestMethod("HEAD");
                ejwi ejwiVarI = ejwiVar;
                if (ejwiVarI.g()) {
                    httpURLConnectionA.setRequestProperty("If-None-Match", (String) ejwiVarI.c());
                }
                try {
                    httpURLConnectionA.connect();
                    int responseCode = httpURLConnectionA.getResponseCode();
                    if (responseCode == 304) {
                        durt.b("%s: Got HTTP_RESPONSE_NOT_MODIFIED, reuse cache.", "OffroadFileDownloader");
                    } else {
                        if (responseCode != 200) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.ANDROID_DOWNLOADER_HTTP_ERROR;
                            dtovVarA.b = a.g(responseCode, "Http request failed; code = ");
                            return eork.h(dtovVarA.a());
                        }
                        durt.b("%s: Got HTTP_RESPONSE_OK, updating cache.", "OffroadFileDownloader");
                        ejwiVarI = ejwi.i(httpURLConnectionA.getHeaderField("ETag"));
                    }
                    httpURLConnectionA.disconnect();
                    return eork.i(ejwiVarI);
                } catch (IOException e) {
                    dtov dtovVarA2 = dtox.a();
                    dtovVarA2.a = dtow.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                    dtovVarA2.b = a.v(str2, "Failed while connecting to ");
                    dtovVarA2.c = e;
                    return eork.h(dtovVarA2.a());
                } finally {
                    httpURLConnectionA.disconnect();
                }
            }
        }, this.e), new ejvr() { // from class: dtzs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ejwi ejwiVar2 = (ejwi) obj;
                boolean z = true;
                if (ejwiVar2.g() && ejwiVar.equals(ejwiVar2)) {
                    z = false;
                }
                if (ejwiVar2 != null) {
                    return new dtza(z, ejwiVar2);
                }
                throw new NullPointerException("Null freshETagOptional");
            }
        }, eoqg.a);
    }

    @Override // defpackage.dtzo
    public final ListenableFuture b(final dtzn dtznVar) {
        dtze dtzeVar = (dtze) dtznVar;
        Uri uri = dtzeVar.a;
        final String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        try {
            final File parentFile = ecfm.a(uri, new ecfc(this.c)).getParentFile();
            parentFile.getClass();
            try {
                final ecgr ecgrVar = (ecgr) this.d.c(((dtze) dtznVar).a, new ecgs());
                return kol.a(new koi() { // from class: dtzu
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.koi
                    public final Object a(kog kogVar) {
                        dtzq dtzqVar = new dtzq(kogVar);
                        dtze dtzeVar2 = (dtze) dtznVar;
                        final dtzv dtzvVar = this.a;
                        dxfd dxfdVar = dtzvVar.a;
                        String str = dtzeVar2.b;
                        ecgr ecgrVar2 = ecgrVar;
                        final File file = parentFile;
                        final String str2 = lastPathSegment;
                        dxes dxesVar = new dxes(dxfdVar, str, file, str2, dtzqVar, ecgrVar2);
                        dxesVar.i = null;
                        if (dtzl.c == dtzeVar2.c) {
                            dxesVar.g(dxer.WIFI_OR_CELLULAR);
                        } else {
                            dxesVar.g(dxer.WIFI_ONLY);
                        }
                        int i = dtzeVar2.d;
                        if (i > 0) {
                            dxesVar.j = i;
                        }
                        ekgb ekgbVar = dtzeVar2.e;
                        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
                            Pair pair = (Pair) ekgbVar.get(i2);
                            dxesVar.e.t((String) pair.first, (String) pair.second);
                        }
                        kogVar.a(new Runnable() { // from class: dtzr
                            @Override // java.lang.Runnable
                            public final void run() {
                                dtzvVar.a.d(file, str2);
                            }
                        }, eoqg.a);
                        boolean zL = dxesVar.d.l(dxesVar);
                        durt.d("%s: Data download scheduled for file: %s enqueued: %s", "OffroadFileDownloader", str, Boolean.valueOf(zL));
                        if (!zL) {
                            dtov dtovVarA = dtox.a();
                            dtovVarA.a = dtow.DUPLICATE_REQUEST_ERROR;
                            dtovVarA.b = "Duplicate request for: ".concat(str);
                            kogVar.c(dtovVarA.a());
                        }
                        return "Data download scheduled for file ".concat(str);
                    }
                });
            } catch (IOException e) {
                durt.k(e, "%s: Unable to create mobstore ResponseWriter for file %s", "OffroadFileDownloader", dtzeVar.a);
                dtov dtovVarA = dtox.a();
                dtovVarA.a = dtow.UNABLE_TO_CREATE_MOBSTORE_RESPONSE_WRITER_ERROR;
                dtovVarA.c = e;
                return eork.h(dtovVarA.a());
            }
        } catch (IOException e2) {
            durt.h("%s: The file uri is malformed, uri = %s", "OffroadFileDownloader", dtzeVar.a);
            dtov dtovVarA2 = dtox.a();
            dtovVarA2.a = dtow.MALFORMED_FILE_URI_ERROR;
            dtovVarA2.c = e2;
            return eork.h(dtovVarA2.a());
        }
    }
}
