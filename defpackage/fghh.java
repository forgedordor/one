package defpackage;

import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fghh extends HttpURLConnection {
    private static final String h = "fghh";
    public final fghm a;
    public UrlRequest b;
    public fghj c;
    public fghk d;
    public UrlResponseInfo e;
    public IOException f;
    public boolean g;
    private final CronetEngine i;
    private final List j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private List p;
    private Map q;

    public fghh(URL url, CronetEngine cronetEngine) {
        super(url);
        new ffyu("CronetHttpURLConnection#CronetHttpURLConnection");
        try {
            this.i = cronetEngine;
            this.a = new fghm();
            this.c = new fghj(this);
            this.j = new ArrayList();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final int g(String str) {
        int i = 0;
        while (true) {
            List list = this.j;
            if (i >= list.size()) {
                return -1;
            }
            if (((String) ((Pair) list.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    private final List h() {
        List list = this.p;
        if (list != null) {
            return list;
        }
        this.p = new ArrayList();
        for (Map.Entry<String, String> entry : this.e.getAllHeadersAsList()) {
            if (!entry.getKey().equalsIgnoreCase("Content-Encoding")) {
                this.p.add(new AbstractMap.SimpleImmutableEntry(entry));
            }
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(this.p);
        this.p = listUnmodifiableList;
        return listUnmodifiableList;
    }

    private final Map.Entry i(int i) {
        try {
            k();
            List listH = h();
            if (i >= listH.size()) {
                return null;
            }
            return (Map.Entry) listH.get(i);
        } catch (IOException unused) {
            return null;
        }
    }

    private final Map j() {
        Map map = this.q;
        if (map != null) {
            return map;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Map.Entry entry : h()) {
            ArrayList arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), DesugarCollections.unmodifiableList(arrayList));
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(treeMap);
        this.q = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    private final void k() {
        new ffyu("CronetHttpURLConnection#getResponse");
        try {
            fghk fghkVar = this.d;
            if (fghkVar != null) {
                fghkVar.b();
                this.d.close();
            }
            if (!this.o) {
                m();
                this.a.a();
            }
            if (!this.o) {
                throw new IllegalStateException("No response.");
            }
            IOException iOException = this.f;
            if (iOException != null) {
                throw iOException;
            }
            if (this.e == null) {
                throw new NullPointerException("Response info is null when there is no exception.");
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void l(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int iG = g(str);
        if (iG >= 0) {
            if (!z) {
                throw new UnsupportedOperationException(a.a(str, "Cannot add multiple headers of the same key, ", ". crbug.com/432719."));
            }
            this.j.remove(iG);
        }
        this.j.add(Pair.create(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0 A[Catch: all -> 0x00f8, TryCatch #0 {all -> 0x00f8, blocks: (B:12:0x001a, B:14:0x0036, B:16:0x0040, B:17:0x0044, B:20:0x004a, B:22:0x0057, B:24:0x005d, B:28:0x007a, B:30:0x0080, B:25:0x006f, B:27:0x0075, B:31:0x0085, B:32:0x008b, B:34:0x0091, B:35:0x00a3, B:37:0x00a9, B:38:0x00ac, B:46:0x00c6, B:47:0x00cb, B:57:0x00e4, B:58:0x00e9, B:50:0x00d0, B:52:0x00d6, B:54:0x00dc, B:55:0x00e0, B:41:0x00b8, B:43:0x00be, B:44:0x00c2), top: B:67:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fghh.m():void");
    }

    private final boolean n() {
        return this.chunkLength > 0;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        l(str, str2, false);
    }

    public final void b(int i) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify traffic stats tag after connection is made.");
        }
        this.k = true;
        this.l = i;
    }

    @Override // java.net.URLConnection
    public final void connect() throws ProtocolException {
        getOutputStream();
        m();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.connected) {
            this.b.cancel();
        }
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        try {
            k();
            if (this.e.getHttpStatusCode() >= 400) {
                return this.c;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        Map.Entry entryI = i(i);
        if (entryI == null) {
            return null;
        }
        return (String) entryI.getValue();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        Map.Entry entryI = i(i);
        if (entryI == null) {
            return null;
        }
        return (String) entryI.getKey();
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            k();
            return j();
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws IOException {
        k();
        if (!this.instanceFollowRedirects && this.g) {
            throw new IOException("Cannot read response body of a redirect.");
        }
        if (this.e.getHttpStatusCode() < 400) {
            return this.c;
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws ProtocolException {
        if (this.d == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            }
            if (n()) {
                this.d = new fghd(this.chunkLength, this.a);
                m();
            } else {
                long j = this.fixedContentLength;
                if (this.fixedContentLengthLong != -1) {
                    j = this.fixedContentLengthLong;
                }
                if (j != -1) {
                    this.d = new fghf(j, this.a);
                    m();
                } else {
                    String str = h;
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, "Outputstream is being buffered in memory.");
                    }
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.d = new fghb(this);
                    } else {
                        this.d = new fghb(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.j) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, DesugarCollections.unmodifiableList(arrayList));
        }
        return DesugarCollections.unmodifiableMap(treeMap);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        int iG = g(str);
        if (iG >= 0) {
            return (String) ((Pair) this.j.get(iG)).second;
        }
        return null;
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        k();
        return this.e.getHttpStatusCode();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        k();
        return this.e.getHttpStatusText();
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        Log.d(h, "setConnectTimeout is not supported by CronetHttpURLConnection");
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        l(str, str2, true);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return false;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            k();
            Map mapJ = j();
            if (!mapJ.containsKey(str)) {
                return null;
            }
            return (String) ((List) mapJ.get(str)).get(r3.size() - 1);
        } catch (IOException unused) {
            return null;
        }
    }
}
