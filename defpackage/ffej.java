package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.security.Permission;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffej extends HttpURLConnection implements fexl {
    feyy a;
    final ffei b;
    final feyl c;
    feyn d;
    boolean e;
    fexk f;
    long g;
    public final Object h;
    fezh i;
    boolean j;
    Proxy k;
    feyk l;
    private fezh m;
    private Throwable n;

    public ffej(URL url, feyy feyyVar) {
        super(url);
        this.b = new ffei(this);
        this.c = new feyl();
        this.g = -1L;
        this.h = new Object();
        this.j = true;
        this.a = feyyVar;
    }

    private final fexk e() throws ProtocolException, MalformedURLException, NumberFormatException {
        ffem ffenVar;
        int length;
        int iCodePointAt;
        fexk fexkVar = this.f;
        if (fexkVar != null) {
            return fexkVar;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!ffeq.f(this.method)) {
                throw new ProtocolException(String.valueOf(this.method).concat(" does not support writing"));
            }
        }
        feyl feylVar = this.c;
        if (feylVar.a("User-Agent") == null) {
            String strG = ffeq.g();
            if (strG != null) {
                int iCharCount = 0;
                while (true) {
                    length = strG.length();
                    if (iCharCount >= length) {
                        break;
                    }
                    iCodePointAt = strG.codePointAt(iCharCount);
                    if (iCodePointAt <= 31 || iCodePointAt >= 127) {
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                ffez ffezVar = new ffez();
                ffezVar.V(strG, 0, iCharCount);
                ffezVar.W(63);
                while (true) {
                    iCharCount += Character.charCount(iCodePointAt);
                    if (iCharCount >= length) {
                        break;
                    }
                    iCodePointAt = strG.codePointAt(iCharCount);
                    ffezVar.W((iCodePointAt <= 31 || iCodePointAt >= 127) ? 63 : iCodePointAt);
                }
                strG = ffezVar.n();
            } else {
                strG = "ObsoleteUrlFactory";
            }
            feylVar.e("User-Agent", strG);
        }
        if (ffeq.f(this.method)) {
            if (feylVar.a(ffho.a) == null) {
                feylVar.e(ffho.a, "application/x-www-form-urlencoded");
            }
            long j = -1;
            if (this.g == -1 && this.chunkLength <= 0) {
                z = false;
            }
            String strA = feylVar.a("Content-Length");
            long j2 = this.g;
            if (j2 != -1) {
                j = j2;
            } else if (strA != null) {
                j = Long.parseLong(strA);
            }
            ffenVar = z ? new ffen(j) : new ffeg(j);
            ffenVar.c.n(this.a.y, TimeUnit.MILLISECONDS);
        } else {
            ffenVar = null;
        }
        try {
            String string = getURL().toString();
            char[] cArr = feyq.a;
            feyq feyqVarB = feyp.b(string);
            feza fezaVar = new feza();
            fezaVar.h(feyqVarB);
            fezaVar.d(this.c.b());
            fezaVar.e(this.method, ffenVar);
            fezb fezbVarA = fezaVar.a();
            feyx feyxVar = new feyx(this.a);
            List list = feyxVar.c;
            list.clear();
            list.add(ffep.a);
            List list2 = feyxVar.d;
            list2.clear();
            list2.add(this.b);
            feyxVar.a = new feya(this.a.c.a());
            getUseCaches();
            ffaj ffajVar = new ffaj(new feyy(feyxVar), fezbVarA);
            this.f = ffajVar;
            return ffajVar;
        } catch (IllegalArgumentException e) {
            MalformedURLException malformedURLException = new MalformedURLException();
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private final fezh f(boolean z) throws NumberFormatException, IOException {
        fezh fezhVar;
        synchronized (this.h) {
            fezh fezhVar2 = this.m;
            if (fezhVar2 != null) {
                return fezhVar2;
            }
            Throwable th = this.n;
            if (th != null) {
                if (!z || (fezhVar = this.i) == null) {
                    throw ffeq.a(th);
                }
                return fezhVar;
            }
            fexk fexkVarE = e();
            this.b.b();
            ffem ffemVar = (ffem) ((ffaj) fexkVarE).b.d;
            if (ffemVar != null) {
                ffemVar.e.close();
            }
            if (this.e) {
                Object obj = this.h;
                synchronized (obj) {
                    while (this.m == null && this.n == null) {
                        try {
                            try {
                                obj.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        } finally {
                        }
                    }
                }
            } else {
                this.e = true;
                try {
                    b(fexkVarE.a());
                } catch (IOException e) {
                    a(e);
                }
            }
            synchronized (this.h) {
                Throwable th2 = this.n;
                if (th2 != null) {
                    throw ffeq.a(th2);
                }
                fezh fezhVar3 = this.m;
                if (fezhVar3 != null) {
                    return fezhVar3;
                }
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.fexl
    public final void a(IOException iOException) {
        Object obj = this.h;
        synchronized (obj) {
            boolean z = iOException instanceof ffep;
            Throwable cause = iOException;
            if (z) {
                cause = iOException.getCause();
            }
            this.n = cause;
            obj.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot add request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 == null) {
            return;
        }
        this.c.e(str, str2);
    }

    @Override // defpackage.fexl
    public final void b(fezh fezhVar) {
        Object obj = this.h;
        synchronized (obj) {
            this.m = fezhVar;
            this.l = fezhVar.e;
            this.url = fezhVar.a.a.g();
            obj.notifyAll();
        }
    }

    final feyn c() throws NumberFormatException, IOException {
        String str;
        if (this.d == null) {
            fezh fezhVarF = f(true);
            feyn feynVar = fezhVarF.f;
            feyz feyzVar = fezhVarF.b;
            feyl feylVarE = feynVar.e();
            feylVarE.e("ObsoleteUrlFactory-Selected-Protocol", feyzVar.g);
            fezh fezhVar = fezhVarF.h;
            int i = ffeq.e;
            if (fezhVar == null) {
                if (fezhVarF.i == null) {
                    str = "NONE";
                } else {
                    str = "CACHE " + fezhVarF.d;
                }
            } else if (fezhVarF.i == null) {
                str = "NETWORK " + fezhVarF.d;
            } else {
                str = "CONDITIONAL_CACHE " + fezhVar.d;
            }
            feylVarE.e("ObsoleteUrlFactory-Response-Source", str);
            this.d = feylVarE.b();
        }
        return this.d;
    }

    @Override // java.net.URLConnection
    public final void connect() throws ProtocolException, MalformedURLException, NumberFormatException {
        if (this.e) {
            return;
        }
        fexk fexkVarE = e();
        this.e = true;
        fexkVarE.c(this);
        Object obj = this.h;
        synchronized (obj) {
            while (this.j && this.m == null && this.n == null) {
                try {
                    obj.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            }
            Throwable th = this.n;
            if (th != null) {
                throw ffeq.a(th);
            }
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.f == null) {
            return;
        }
        this.b.b();
        this.f.b();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.w;
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() throws NumberFormatException {
        long j;
        try {
            fezh fezhVarF = f(true);
            int i = ffeq.e;
            if (!fezhVarF.a.b.equals("HEAD")) {
                int i2 = fezhVarF.d;
                if ((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) {
                    String strB = fezhVarF.f.b("Content-Length");
                    if (strB == null) {
                        j = -1;
                        if (j == -1 || "chunked".equalsIgnoreCase(fezh.b(fezhVarF, "Transfer-Encoding"))) {
                        }
                    } else {
                        try {
                            j = Long.parseLong(strB);
                        } catch (NumberFormatException unused) {
                        }
                        if (j == -1) {
                        }
                    }
                }
                if (fezhVarF.d >= 400) {
                    return fezhVarF.g.d();
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) throws NumberFormatException {
        try {
            feyn feynVarC = c();
            if (i >= 0 && i < feynVarC.a()) {
                return feynVarC.d(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) throws NumberFormatException {
        try {
            feyn feynVarC = c();
            if (i >= 0 && i < feynVarC.a()) {
                return feynVarC.c(i);
            }
        } catch (IOException unused) {
        }
        return null;
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        try {
            return ffeq.e(c(), ffeq.b(f(true)));
        } catch (IOException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() throws NumberFormatException, IOException {
        if (!this.doInput) {
            throw new ProtocolException("This protocol does not support input");
        }
        fezh fezhVarF = f(false);
        if (fezhVarF.d < 400) {
            return fezhVarF.g.d();
        }
        throw new FileNotFoundException(this.url.toString());
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.i;
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() throws ProtocolException, MalformedURLException, NumberFormatException {
        ffem ffemVar = (ffem) ((ffaj) e()).b.d;
        if (ffemVar == null) {
            throw new ProtocolException("method does not support a request body: ".concat(String.valueOf(this.method)));
        }
        if (ffemVar instanceof ffen) {
            connect();
            this.b.b();
        }
        if (ffemVar.f) {
            throw new ProtocolException("cannot write request body after response has been read");
        }
        return ffemVar.e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        int iA;
        URL url = getURL();
        String host = url.getHost();
        if (url.getPort() != -1) {
            iA = url.getPort();
        } else {
            String protocol = url.getProtocol();
            char[] cArr = feyq.a;
            iA = feyp.a(protocol);
        }
        if (usingProxy()) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) this.a.l.address();
            host = inetSocketAddress.getHostName();
            iA = inetSocketAddress.getPort();
        }
        return new SocketPermission(a.f(iA, host, ":"), "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.x;
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request header fields after connection is set");
        }
        return ffeq.e(this.c.b(), null);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        if (str == null) {
            return null;
        }
        return this.c.a(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).d;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return f(true).c;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        feyx feyxVar = new feyx(this.a);
        feyxVar.a(i, TimeUnit.MILLISECONDS);
        this.a = new feyy(feyxVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        if (this.ifModifiedSince == 0) {
            this.c.f("If-Modified-Since");
            return;
        }
        this.c.d("If-Modified-Since", ((DateFormat) ffeq.c.get()).format(new Date(this.ifModifiedSince)));
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        feyx feyxVar = new feyx(this.a);
        feyxVar.g = z;
        this.a = new feyy(feyxVar);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        feyx feyxVar = new feyx(this.a);
        feyxVar.b(i, TimeUnit.MILLISECONDS);
        this.a = new feyy(feyxVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        Set set = ffeq.a;
        if (set.contains(str)) {
            this.method = str;
            return;
        }
        throw new ProtocolException("Expected one of " + String.valueOf(set) + " but was " + str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        if (this.connected) {
            throw new IllegalStateException("Cannot set request property after connection is made");
        }
        if (str == null) {
            throw new NullPointerException("field == null");
        }
        if (str2 == null) {
            return;
        }
        this.c.d(str, str2);
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.k != null) {
            return true;
        }
        Proxy proxy = this.a.l;
        return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        if (((HttpURLConnection) this).connected) {
            throw new IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new IllegalStateException("Already in chunked mode");
        }
        if (j < 0) {
            throw new IllegalArgumentException("contentLength < 0");
        }
        this.g = j;
        ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j, 2147483647L);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        try {
            if (str == null) {
                return ffeq.b(f(true));
            }
            return c().b(str);
        } catch (IOException unused) {
            return null;
        }
    }
}
