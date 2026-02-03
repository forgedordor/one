package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.TrafficStats;
import android.os.Trace;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.sun.jna.Function;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.ThreadStatsUid;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks$UrlRequestStatusListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgfw extends ExperimentalUrlRequest {
    public static final String a = "fgfw";
    public final fgfs b;
    public final Executor c;
    public final String d;
    public final boolean h;
    public final String i;
    public fggs j;
    public Executor k;
    public String m;
    public ReadableByteChannel n;
    public fggl o;
    public String p;
    public HttpURLConnection q;
    public fgft r;
    public final fgef s;
    public final int t;
    public final fgdb u;
    public final long v;
    public int w;
    public int x;
    public boolean y;
    public final Map e = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    public final List f = new ArrayList();
    public final AtomicInteger g = new AtomicInteger(0);
    private final AtomicBoolean z = new AtomicBoolean(false);
    public volatile int l = -1;

    public fgfw(fgef fgefVar, UrlRequest.Callback callback, final Executor executor, Executor executor2, String str, String str2, boolean z, boolean z2, int i, final boolean z3, final int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor3) {
        fggs fggsVar;
        new ffyu("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            this.h = z;
            this.b = new fgfs(this, callback, executor2);
            final int threadStatsTag = !z2 ? TrafficStats.getThreadStatsTag() : i;
            this.c = new fgfv(new Executor() { // from class: fgeu
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    String str4 = fgfw.a;
                    final int i3 = threadStatsTag;
                    final boolean z4 = z3;
                    final int i4 = i2;
                    executor.execute(new Runnable() { // from class: fgew
                        @Override // java.lang.Runnable
                        public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                            String str5 = fgfw.a;
                            int threadStatsTag2 = TrafficStats.getThreadStatsTag();
                            TrafficStats.setThreadStatsTag(i3);
                            Runnable runnable2 = runnable;
                            boolean z5 = z4;
                            if (z5) {
                                ThreadStatsUid.set(i4);
                            }
                            try {
                                runnable2.run();
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                            } catch (Throwable th) {
                                if (z5) {
                                    ThreadStatsUid.clear();
                                }
                                TrafficStats.setThreadStatsTag(threadStatsTag2);
                                throw th;
                            }
                        }
                    });
                }
            });
            this.s = fgefVar;
            this.t = fgefVar.a;
            this.u = fgefVar.b;
            this.m = str;
            this.d = str2;
            this.v = j;
            if (!"OPTIONS".equalsIgnoreCase(str3) && !"GET".equalsIgnoreCase(str3) && !"HEAD".equalsIgnoreCase(str3) && !"POST".equalsIgnoreCase(str3) && !"PUT".equalsIgnoreCase(str3) && !"DELETE".equalsIgnoreCase(str3) && !"TRACE".equalsIgnoreCase(str3) && !"PATCH".equalsIgnoreCase(str3)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str3));
            }
            this.i = str3;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i3);
                String str4 = (String) entry.getKey();
                int i4 = 0;
                while (true) {
                    if (i4 < str4.length()) {
                        char cCharAt = str4.charAt(i4);
                        if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                            switch (cCharAt) {
                                case Maneuver.TYPE_DESTINATION /* 39 */:
                                case '(':
                                case ')':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case Function.ALT_CONVENTION /* 63 */:
                                        case '@':
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                    break;
                                                default:
                                                    if (Character.isISOControl(cCharAt) || Character.isWhitespace(cCharAt)) {
                                                        break;
                                                    } else {
                                                        i4++;
                                                    }
                                                    break;
                                            }
                                    }
                            }
                        }
                    } else if (!((String) entry.getValue()).contains(VCardBuilder.VCARD_END_OF_LINE)) {
                        this.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
            }
            if (uploadDataProvider == null) {
                fggsVar = null;
            } else {
                if (!this.e.containsKey(ffho.a)) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                fggsVar = new fggs(uploadDataProvider);
            }
            this.j = fggsVar;
            this.k = (executor3 == null || this.h) ? executor3 : new fgfz(executor3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void a() {
        d(new Runnable() { // from class: fgfb
            @Override // java.lang.Runnable
            public final void run() {
                fgfw fgfwVar = this.a;
                ReadableByteChannel readableByteChannel = fgfwVar.n;
                if (readableByteChannel != null) {
                    try {
                        readableByteChannel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    fgfwVar.n = null;
                }
            }
        }, "closeResponseChannel");
    }

    public final void b(final CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.g;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        f();
        e();
        final fgfs fgfsVar = this.b;
        final fggl fgglVar = this.o;
        fgfsVar.d.a();
        final Runnable runnable = new Runnable() { // from class: fgfk
            @Override // java.lang.Runnable
            public final void run() {
                UrlResponseInfo urlResponseInfo = fgglVar;
                fgfs fgfsVar2 = fgfsVar;
                try {
                    fgfsVar2.a.onFailed(fgfsVar2.d, urlResponseInfo, cronetException);
                } catch (Exception e) {
                    fgfsVar2.d.i("onFailed", e);
                }
                fgfsVar2.c();
                fgfsVar2.d.s.c();
            }
        };
        try {
            fgfsVar.b(runnable, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = fgfsVar.c;
            if (executor != null) {
                new ffyu("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor.execute(new Runnable() { // from class: fgfj
                        public final /* synthetic */ String a = "onFailed";

                        @Override // java.lang.Runnable
                        public final void run() {
                            new ffyu("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + this.a + " running callback");
                            try {
                                runnable.run();
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
                    });
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
        }
    }

    public final void c(Throwable th) {
        b(new fgbz("Exception received from UploadDataProvider", th));
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.g.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            f();
            e();
            final fgfs fgfsVar = this.b;
            final fggl fgglVar = this.o;
            fgfsVar.d.a();
            fgfsVar.b(new Runnable() { // from class: fgfp
                @Override // java.lang.Runnable
                public final void run() {
                    fgfs fgfsVar2 = fgfsVar;
                    try {
                        fgfsVar2.a.onCanceled(fgfsVar2.d, fgglVar);
                    } catch (Exception e) {
                        fgfsVar2.d.i("onCanceled", e);
                    }
                    fgfsVar2.c();
                    fgfsVar2.d.s.c();
                }
            }, "onCanceled");
        }
    }

    public final void d(final Runnable runnable, final String str) {
        new ffyu("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.c.execute(new Runnable() { // from class: fgfe
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = fgfw.a;
                    new ffyu("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
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
            });
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

    public final void e() {
        if (this.j == null || !this.z.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.k;
            final fggs fggsVar = this.j;
            fggsVar.getClass();
            executor.execute(new fgex(this, new fgfx() { // from class: fger
                @Override // defpackage.fgfx
                public final void a() {
                    fggsVar.close();
                }
            }));
        } catch (RejectedExecutionException e) {
            Log.e(a, "Exception when closing uploadDataProvider", e);
        }
    }

    public final void f() {
        d(new Runnable() { // from class: fges
            @Override // java.lang.Runnable
            public final void run() {
                fgfw fgfwVar = this.a;
                fgft fgftVar = fgfwVar.r;
                if (fgftVar != null) {
                    try {
                        fgftVar.j();
                    } catch (IOException e) {
                        Log.e(fgfw.a, "Exception when closing OutputChannel", e);
                    }
                }
                HttpURLConnection httpURLConnection = fgfwVar.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    fgfwVar.q = null;
                }
            }
        }, "fireDisconnect");
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        j(3, 1, new fgfh(this));
    }

    public final void g() {
        this.l = 13;
        d(new fget(this, new fgfx() { // from class: fgez
            @Override // defpackage.fgfx
            public final void a() throws IOException {
                List<String> list;
                final fgfw fgfwVar = this.a;
                if (fgfwVar.q == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String headerField = "http/1.1";
                int i = 0;
                while (true) {
                    String headerFieldKey = fgfwVar.q.getHeaderFieldKey(i);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = fgfwVar.q.getHeaderField(i);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, fgfwVar.q.getHeaderField(i)));
                    }
                    i++;
                }
                int responseCode = fgfwVar.q.getResponseCode();
                final fggl fgglVar = new fggl(new ArrayList(fgfwVar.f), responseCode, fgfwVar.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), false, headerField, "", 0L);
                if (responseCode >= 300 && responseCode < 400 && (list = fgglVar.getAllHeaders().get("location")) != null) {
                    final String str = list.get(0);
                    fgfwVar.j(1, 2, new Runnable() { // from class: fgfd
                        @Override // java.lang.Runnable
                        public final void run() {
                            final fgfw fgfwVar2 = fgfwVar;
                            fgfwVar2.p = URI.create(fgfwVar2.m).resolve(str).toString();
                            fgfwVar2.f.add(fgfwVar2.p);
                            final UrlResponseInfo urlResponseInfo = fgglVar;
                            fgfwVar2.j(2, 3, new Runnable() { // from class: fgeq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    fgfw fgfwVar3 = fgfwVar2;
                                    final String str2 = fgfwVar3.p;
                                    final fgfs fgfsVar = fgfwVar3.b;
                                    final UrlResponseInfo urlResponseInfo2 = urlResponseInfo;
                                    fgfsVar.a(new fgfx() { // from class: fgfr
                                        @Override // defpackage.fgfx
                                        public final void a() {
                                            fgfs fgfsVar2 = fgfsVar;
                                            fgfsVar2.a.onRedirectReceived(fgfsVar2.d, urlResponseInfo2, str2);
                                        }
                                    }, "onRedirectReceived");
                                }
                            });
                        }
                    });
                    return;
                }
                fgfwVar.o = fgglVar;
                fgfwVar.e();
                if (responseCode < 400) {
                    fgfwVar.n = fgeb.a(fgfwVar.q.getInputStream());
                    fgfwVar.b.d();
                } else {
                    InputStream errorStream = fgfwVar.q.getErrorStream();
                    fgfwVar.n = errorStream == null ? null : fgeb.a(errorStream);
                    fgfwVar.b.d();
                }
            }
        }), "fireGetHeaders");
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.g.get();
        final int i2 = this.l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(a.g(i, "Switch is exhaustive: "));
        }
        fgfs fgfsVar = this.b;
        final VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(statusListener);
        fgfsVar.b(new Runnable() { // from class: fgfn
            @Override // java.lang.Runnable
            public final void run() {
                versionSafeCallbacks$UrlRequestStatusListener.onStatus(i2);
            }
        }, "sendStatus");
    }

    public final void h() {
        d(new fget(this, new fgfx() { // from class: fgey
            @Override // defpackage.fgfx
            public final void a() throws fggd, ProtocolException {
                fgfw fgfwVar = this.a;
                if (fgfwVar.g.get() == 8) {
                    return;
                }
                URL url = new URL(fgfwVar.m);
                HttpURLConnection httpURLConnection = fgfwVar.q;
                Network network = null;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    fgfwVar.q = null;
                }
                long j = fgfwVar.v;
                if (j == -1) {
                    fgfwVar.q = (HttpURLConnection) url.openConnection();
                } else {
                    Network[] allNetworks = ((ConnectivityManager) fgfwVar.s.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i];
                        if (network2.getNetworkHandle() == j) {
                            network = network2;
                            break;
                        }
                        i++;
                    }
                    if (network == null) {
                        throw new fggd("Network bound to request not found", 9, -4);
                    }
                    fgfwVar.q = (HttpURLConnection) network.openConnection(url);
                }
                fgfwVar.q.setInstanceFollowRedirects(false);
                Map map = fgfwVar.e;
                if (!map.containsKey("User-Agent")) {
                    map.put("User-Agent", fgfwVar.d);
                }
                for (Map.Entry entry : map.entrySet()) {
                    fgfwVar.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                fgfwVar.q.setRequestMethod(fgfwVar.i);
                fggs fggsVar = fgfwVar.j;
                if (fggsVar == null) {
                    fgfwVar.l = 10;
                    fgfwVar.q.connect();
                    fgfwVar.g();
                } else {
                    fgfwVar.r = new fgft(fgfwVar, fgfwVar.k, fgfwVar.c, fgfwVar.q, fggsVar);
                    final fgft fgftVar = fgfwVar.r;
                    final boolean z = fgfwVar.f.size() == 1;
                    fgftVar.d(new fgfx() { // from class: fgei
                        @Override // defpackage.fgfx
                        public final void a() {
                            fgep fgepVar = fgftVar;
                            fggs fggsVar2 = fgepVar.c;
                            long length2 = fggsVar2.getLength();
                            fgepVar.e = length2;
                            if (length2 == 0) {
                                fgepVar.e();
                                return;
                            }
                            if (length2 <= 0 || length2 >= 8192) {
                                fgepVar.d = ByteBuffer.allocateDirect(8192);
                            } else {
                                fgepVar.d = ByteBuffer.allocateDirect(((int) length2) + 1);
                            }
                            long j2 = fgepVar.e;
                            if (j2 > 0) {
                                ((fgft) fgepVar).h.setFixedLengthStreamingMode(j2);
                            } else {
                                ((fgft) fgepVar).h.setChunkedStreamingMode(8192);
                            }
                            if (z) {
                                fgepVar.i();
                            } else {
                                fgepVar.a.set(1);
                                fggsVar2.rewind(fgepVar);
                            }
                        }
                    }, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                }
            }
        }), "fireOpenConnection");
    }

    public final void i(String str, Exception exc) {
        Log.e(a, a.a(str, "Exception in ", " method"), exc);
        this.y = true;
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.g.get();
        return i == 7 || i == 6 || i == 8;
    }

    public final void j(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.g;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            throw new IllegalStateException("Invalid state transition - expected " + fgga.a(i) + " but was " + fgga.a(i3));
        }
        new ffyu("Cronet JavaUrlRequest#transitionStates " + fgga.a(i) + " -> " + fgga.a(i2));
        try {
            runnable.run();
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

    @Override // org.chromium.net.UrlRequest
    public final void read(final ByteBuffer byteBuffer) {
        fggf.a(byteBuffer);
        fggf.b(byteBuffer);
        final fgfx fgfxVar = new fgfx() { // from class: fgff
            @Override // defpackage.fgfx
            public final void a() throws IOException {
                int i;
                fgfw fgfwVar = this.a;
                ReadableByteChannel readableByteChannel = fgfwVar.n;
                final ByteBuffer byteBuffer2 = byteBuffer;
                if (readableByteChannel != null) {
                    fgfwVar.w++;
                    i = readableByteChannel.read(byteBuffer2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    final fgfs fgfsVar = fgfwVar.b;
                    final fggl fgglVar = fgfwVar.o;
                    fgfsVar.a(new fgfx() { // from class: fgfl
                        @Override // defpackage.fgfx
                        public final void a() {
                            fgfs fgfsVar2 = fgfsVar;
                            fgfw fgfwVar2 = fgfsVar2.d;
                            if (fgfwVar2.g.compareAndSet(5, 4)) {
                                ByteBuffer byteBuffer3 = byteBuffer2;
                                fgfsVar2.a.onReadCompleted(fgfwVar2, fgglVar, byteBuffer3);
                            }
                        }
                    }, "onReadCompleted");
                    return;
                }
                ReadableByteChannel readableByteChannel2 = fgfwVar.n;
                if (readableByteChannel2 != null) {
                    readableByteChannel2.close();
                }
                if (fgfwVar.g.compareAndSet(5, 7)) {
                    fgfwVar.f();
                    final fgfs fgfsVar2 = fgfwVar.b;
                    final fggl fgglVar2 = fgfwVar.o;
                    fgfsVar2.b(new Runnable() { // from class: fgfi
                        @Override // java.lang.Runnable
                        public final void run() {
                            fgfs fgfsVar3 = fgfsVar2;
                            try {
                                fgfsVar3.a.onSucceeded(fgfsVar3.d, fgglVar2);
                            } catch (Exception e) {
                                fgfsVar3.d.i("onSucceded", e);
                            }
                            fgfsVar3.c();
                            fgfsVar3.d.s.c();
                        }
                    }, "onSucceeded");
                }
            }
        };
        j(4, 5, new Runnable() { // from class: fgfg
            @Override // java.lang.Runnable
            public final void run() {
                fgfw fgfwVar = this.a;
                fgfwVar.d(new fget(fgfwVar, fgfxVar), "read");
            }
        });
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.l = 10;
        this.s.c.incrementAndGet();
        j(0, 1, new Runnable() { // from class: fgev
            @Override // java.lang.Runnable
            public final void run() {
                fgfw fgfwVar = this.a;
                fgfwVar.f.add(fgfwVar.m);
                fgfwVar.h();
            }
        });
    }
}
