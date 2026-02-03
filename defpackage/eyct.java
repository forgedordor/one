package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyct implements eycv {
    public String a;
    public eycz b;
    private final eyce c;
    private String d;
    private String e;
    private String f;
    private final eycb g;
    private final eycc h;
    private final long i;
    private double j;
    private int k = 1;
    private long l;
    private final Random m;
    private eycv n;
    private int o;
    private int p;
    private int q;

    public eyct(String str, String str2, eyce eyceVar, eycb eycbVar, String str3, eycc eyccVar, eydb eydbVar, boolean z) {
        if (z) {
            this.a = str;
        } else {
            this.d = str;
            this.e = str2;
            this.f = str3;
        }
        this.c = eyceVar == null ? new eyce() : eyceVar;
        this.h = eyccVar;
        this.g = eycbVar;
        this.i = eydbVar.a;
        this.j = 0.0d;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final eycf h(eyce eyceVar, String str, eycb eycbVar) throws eycx {
        ListenableFuture listenableFutureB;
        i();
        eyce eyceVar2 = new eyce();
        eyceVar2.e("X-Goog-Upload-Protocol", "resumable");
        eyceVar2.e("X-Goog-Upload-Command", str);
        for (String str2 : eyceVar.c()) {
            Iterator it = eyceVar.b(str2).iterator();
            while (it.hasNext()) {
                eyceVar2.e(str2, (String) it.next());
            }
        }
        if (!eyceVar2.f("X-Goog-Hash")) {
            eydd.a();
        }
        eycv eycvVarA = this.h.a(str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME) ? this.d : this.a, str.contains(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME) ? this.e : "PUT", eyceVar2, eycbVar);
        if (this.b != null && !str.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
            synchronized (this) {
                eycvVarA.e(new eycs(this, this.b), this.o, this.p);
            }
        }
        synchronized (this) {
            this.n = eycvVarA;
            listenableFutureB = eycvVarA.b();
        }
        try {
            eycy eycyVar = (eycy) listenableFutureB.get();
            if (!eycyVar.b()) {
                return eycyVar.b;
            }
            eycx eycxVar = eycyVar.a;
            if (eycxVar.a != eycw.CANCELED) {
                throw eycxVar;
            }
            i();
            throw new eycx(eycw.CONNECTION_ERROR, "");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final synchronized void i() {
        int i;
        while (true) {
            i = this.q;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new eycx(eycw.CANCELED, "");
        }
        ejyb.a(i == 1);
    }

    private final void j(eycx eycxVar) throws InterruptedException, eycx {
        if (this.j >= this.i) {
            throw eycxVar;
        }
        double dNextDouble = this.m.nextDouble();
        try {
            this.j = this.j + (this.l * dNextDouble);
            Thread.sleep((long) (r4 * 1000 * dNextDouble));
        } catch (InterruptedException unused) {
        }
        long j = this.l;
        this.l = j + j;
    }

    private final void k() {
        eycb eycbVar = this.g;
        if (eycbVar.d() > eycbVar.b()) {
            eycbVar.g();
            l();
        }
    }

    private final void l() {
        this.l = 1L;
        this.j = 0.0d;
    }

    private final boolean m() throws eycx {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new eycx(eycw.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean n(eycf eycfVar) {
        return eycfVar.a / 100 == 4;
    }

    private static final boolean o(eycf eycfVar) {
        String strA;
        eyce eyceVar = eycfVar.b;
        return (eyceVar == null || (strA = eyceVar.a("X-Goog-Upload-Status")) == null || !ejuf.e("final", strA)) ? false : true;
    }

    private static final boolean p(eycf eycfVar) {
        String strA;
        eyce eyceVar = eycfVar.b;
        return eyceVar != null && (strA = eyceVar.a("X-Goog-Upload-Status")) != null && ejuf.e("active", strA) && eycfVar.a == 200;
    }

    @Override // defpackage.eycv
    public final long a() {
        return this.g.d();
    }

    @Override // defpackage.eycv
    public final ListenableFuture b() {
        eosa eosaVar = new eosa(new Callable() { // from class: eycr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eycy eycyVar;
                eyct eyctVar = this.a;
                try {
                    eycyVar = new eycy(eyctVar.a == null ? eyctVar.g() : eyctVar.c(true));
                } catch (eycx e) {
                    eycyVar = new eycy(e);
                } catch (Throwable th) {
                    eycyVar = new eycy(new eycx(eycw.UNKNOWN, th));
                }
                synchronized (eyctVar) {
                }
                return eycyVar;
            }
        });
        eosw eoswVar = new eosw();
        eoswVar.d("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(eosw.b(eoswVar));
        executorServiceNewSingleThreadExecutor.submit(eosaVar);
        executorServiceNewSingleThreadExecutor.shutdown();
        return eosaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01da, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.REQUEST_BODY_READ_ERROR, "Could not create chunked data stream.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r1 = new defpackage.eyca(r9, r8.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r2 = r1.e();
        r4 = r9.c();
        r6 = r8.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r2 < ((r4 / r6) * r6)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if ((r9.d() + r1.e()) != r9.e()) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r0 = false;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r0 = r0.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (m() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r0 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r1 = "upload, finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r1 = "upload";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r1 = "finalize";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r2 = r8.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r2 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        r2 = r8.c;
        r2.e("X-Goog-Upload-Offset", java.lang.Long.toString(r8.g.d()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        r9 = h(r2, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0000, code lost:
    
        if (r9 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008f, code lost:
    
        if (o(r9) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
    
        if (p(r9) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r0 != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
    
        k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.SERVER_ERROR, "Finalize call returned active state.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (n(r9) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r9.a != 400) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        j(new defpackage.eycx(defpackage.eycw.SERVER_ERROR, r9.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
    
        if (r9.a() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        j(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r9 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d2, code lost:
    
        r0 = h(r9, com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, new defpackage.eycu(""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (o(r0) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        if (p(r0) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
    
        r9 = r0.b;
        r0 = r9.a("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r0 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f7, code lost:
    
        r8.k = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:
    
        if (m() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.SERVER_ERROR, "Server returned an invalid chunk granularity.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        r0 = java.lang.Long.parseLong(r9.a("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0113, code lost:
    
        r9 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if (r0 < r9.b()) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        if (r0 < r9.d()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0126, code lost:
    
        r9.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        r9 = r8.g;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
    
        if (r9.d() >= r0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0135, code lost:
    
        if (m() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0137, code lost:
    
        r9.f(r0 - r9.d());
        r9.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0144, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014e, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        r9 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        r9 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.REQUEST_BODY_READ_ERROR, "Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: " + r0 + " Size: " + r9.d());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0173, code lost:
    
        k();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0178, code lost:
    
        r9 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.SERVER_ERROR, "The server lost bytes that were previously committed. Our offset: " + r9.b() + ", server offset: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a6, code lost:
    
        throw new defpackage.eycx(defpackage.eycw.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ab, code lost:
    
        if (n(r0) == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        if (r0 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r9.c() != Long.MAX_VALUE) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b2, code lost:
    
        j(new defpackage.eycx(defpackage.eycw.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c7, code lost:
    
        if (r0.a() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
    
        j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cf, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d0, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Path cross not found for [B:49:0x00d0, B:117:?], limit reached: 121 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01ad -> B:4:0x0004). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eycf c(boolean r9) throws java.lang.InterruptedException, defpackage.eycx, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyct.c(boolean):eycf");
    }

    @Override // defpackage.eycv
    public final String d() {
        return this.a;
    }

    @Override // defpackage.eycv
    public final synchronized void e(eycz eyczVar, int i, int i2) {
        boolean z = true;
        ejwl.b(i > 0, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z = false;
        }
        ejwl.b(z, "Progress threshold (millis) must be greater or equal to 0");
        this.b = eyczVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.eycv
    public final void f() {
        synchronized (this) {
            eycv eycvVar = this.n;
            if (eycvVar != null) {
                eycvVar.f();
                this.n = null;
            }
            this.q = 3;
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eycf g() throws java.lang.InterruptedException, defpackage.eycx {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8e
            r4.l()
        L5:
            eyce r0 = r4.c     // Catch: defpackage.eycx -> L81
            java.lang.String r1 = "start"
            eycu r2 = new eycu     // Catch: defpackage.eycx -> L81
            java.lang.String r3 = r4.f     // Catch: defpackage.eycx -> L81
            java.lang.String r3 = defpackage.ejwk.b(r3)     // Catch: defpackage.eycx -> L81
            r2.<init>(r3)     // Catch: defpackage.eycx -> L81
            eycf r0 = r4.h(r0, r1, r2)     // Catch: defpackage.eycx -> L81
            boolean r1 = o(r0)
            if (r1 == 0) goto L1f
            goto L80
        L1f:
            boolean r1 = p(r0)
            if (r1 == 0) goto L6b
            eyce r0 = r0.b
            java.lang.String r1 = "X-Goog-Upload-URL"
            java.lang.String r1 = r0.a(r1)
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> L60
            r2.<init>(r1)     // Catch: java.net.MalformedURLException -> L60
            r4.a = r1     // Catch: java.net.MalformedURLException -> L60
            monitor-enter(r4)     // Catch: java.net.MalformedURLException -> L60
            eycz r1 = r4.b     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L3c
            r1.a(r4)     // Catch: java.lang.Throwable -> L5d
        L3c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "X-Goog-Upload-Chunk-Granularity"
            java.lang.String r0 = r0.a(r1)
            if (r0 == 0) goto L57
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L4c
            r4.k = r0     // Catch: java.lang.NumberFormatException -> L4c
            goto L57
        L4c:
            r0 = move-exception
            eycx r1 = new eycx
            eycw r2 = defpackage.eycw.SERVER_ERROR
            java.lang.String r3 = "Server returned an invalid chunk granularity."
            r1.<init>(r2, r3, r0)
            throw r1
        L57:
            r0 = 0
            eycf r0 = r4.c(r0)
            return r0
        L5d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5d
            throw r0     // Catch: java.net.MalformedURLException -> L60
        L60:
            r0 = move-exception
            eycx r1 = new eycx
            eycw r2 = defpackage.eycw.SERVER_ERROR
            java.lang.String r3 = "Server returned an invalid upload url."
            r1.<init>(r2, r3, r0)
            throw r1
        L6b:
            boolean r1 = n(r0)
            if (r1 != 0) goto L80
            eycx r1 = new eycx
            eycw r2 = defpackage.eycw.SERVER_ERROR
            java.lang.String r0 = r0.a()
            r1.<init>(r2, r0)
            r4.j(r1)
            goto L5
        L80:
            return r0
        L81:
            r0 = move-exception
            boolean r1 = r0.a()
            if (r1 == 0) goto L8d
            r4.j(r0)
            goto L5
        L8d:
            throw r0
        L8e:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L8e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyct.g():eycf");
    }
}
