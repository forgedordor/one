package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshb implements eshc {
    public static final Object a = new Object();
    private static final ThreadFactory g = new esha();
    public final erzj b;
    public final eshw c;
    public final eshp d;
    public final eshk e;
    public final esho f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public eshb(erzj erzjVar, esgu esguVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        eshw eshwVar = new eshw(erzjVar.a(), esguVar);
        eshp eshpVar = new eshp(erzjVar);
        eshk eshkVarB = eshk.b();
        esho eshoVar = new esho(erzjVar);
        int i = eshi.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = erzjVar;
        this.c = eshwVar;
        this.d = eshpVar;
        this.e = eshkVarB;
        this.f = eshoVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private final synchronized String k() {
        return this.k;
    }

    private final void l(eshj eshjVar) {
        synchronized (this.h) {
            this.m.add(eshjVar);
        }
    }

    private final void m() {
        dclh.l(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dclh.l(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dclh.l(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strC = c();
        long j = eshk.a;
        dclh.b(strC.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dclh.b(eshk.b.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.eshc
    public final defn a() {
        m();
        String strK = k();
        if (strK != null) {
            return degc.c(strK);
        }
        defr defrVar = new defr();
        l(new eshg(defrVar));
        defv defvVar = defrVar.a;
        this.i.execute(new Runnable() { // from class: esgy
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
        return defvVar;
    }

    final String b() {
        return this.b.e().a;
    }

    final String c() {
        return this.b.e().b;
    }

    final String d() {
        return this.b.e().d;
    }

    public final void e(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((eshj) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(eshr eshrVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((eshj) it.next()).b(eshrVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.k = str;
    }

    public final synchronized void h(eshr eshrVar, eshr eshrVar2) {
        Set set = this.l;
        if (set.size() != 0 && !((eshn) eshrVar).a.equals(((eshn) eshrVar2).a)) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((eshl) it.next()).a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[Catch: all -> 0x00a1, TRY_LEAVE, TryCatch #0 {all -> 0x00a1, blocks: (B:5:0x000d, B:7:0x0019, B:9:0x0025, B:48:0x0075, B:49:0x0079, B:11:0x002b, B:13:0x0033, B:14:0x0037, B:35:0x0061, B:37:0x0067, B:47:0x0074, B:15:0x0038, B:19:0x0043, B:21:0x0045, B:22:0x0047, B:33:0x005f, B:41:0x006e, B:44:0x0071), top: B:62:0x000d, outer: #2, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r7 = this;
            java.lang.Object r0 = defpackage.eshb.a
            monitor-enter(r0)
            erzj r1 = r7.b     // Catch: java.lang.Throwable -> La8
            android.content.Context r2 = r1.a()     // Catch: java.lang.Throwable -> La8
            esgw r2 = defpackage.esgw.b(r2)     // Catch: java.lang.Throwable -> La8
            eshp r3 = r7.d     // Catch: java.lang.Throwable -> La1
            eshr r3 = r3.a()     // Catch: java.lang.Throwable -> La1
            boolean r4 = r3.k()     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L8d
            java.lang.String r4 = r1.g()     // Catch: java.lang.Throwable -> La1
            java.lang.String r5 = "CHIME_ANDROID_SDK"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto L2b
            boolean r1 = r1.k()     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L75
        L2b:
            r1 = r3
            eshn r1 = (defpackage.eshn) r1     // Catch: java.lang.Throwable -> La1
            int r1 = r1.g     // Catch: java.lang.Throwable -> La1
            r4 = 1
            if (r1 != r4) goto L75
            esho r1 = r7.f     // Catch: java.lang.Throwable -> La1
            android.content.SharedPreferences r4 = r1.b     // Catch: java.lang.Throwable -> La1
            monitor-enter(r4)     // Catch: java.lang.Throwable -> La1
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "|S|id"
            r6 = 0
            java.lang.String r5 = r4.getString(r5, r6)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L45
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            goto L61
        L45:
            android.content.SharedPreferences r1 = r1.b     // Catch: java.lang.Throwable -> L72
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = "|S||P|"
            java.lang.String r5 = r1.getString(r5, r6)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L52
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            goto L5f
        L52:
            java.security.PublicKey r5 = defpackage.esho.b(r5)     // Catch: java.lang.Throwable -> L6c
            if (r5 != 0) goto L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            goto L5f
        L5a:
            java.lang.String r6 = defpackage.esho.a(r5)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            r5 = r6
        L61:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L79
            java.lang.String r5 = defpackage.eshi.a()     // Catch: java.lang.Throwable -> La1
            goto L79
        L6c:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r3     // Catch: java.lang.Throwable -> L72
        L6f:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L6f
            throw r1     // Catch: java.lang.Throwable -> L72
        L72:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L72
            throw r1     // Catch: java.lang.Throwable -> La1
        L75:
            java.lang.String r5 = defpackage.eshi.a()     // Catch: java.lang.Throwable -> La1
        L79:
            eshp r1 = r7.d     // Catch: java.lang.Throwable -> La1
            eshm r4 = new eshm     // Catch: java.lang.Throwable -> La1
            r4.<init>(r3)     // Catch: java.lang.Throwable -> La1
            r4.a = r5     // Catch: java.lang.Throwable -> La1
            r3 = 3
            r4.c(r3)     // Catch: java.lang.Throwable -> La1
            eshr r3 = r4.a()     // Catch: java.lang.Throwable -> La1
            r1.b(r3)     // Catch: java.lang.Throwable -> La1
        L8d:
            if (r2 == 0) goto L92
            r2.a()     // Catch: java.lang.Throwable -> La8
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            r7.f(r3)
            java.util.concurrent.ExecutorService r0 = r7.j
            esgx r1 = new esgx
            r1.<init>()
            r0.execute(r1)
            return
        La1:
            r1 = move-exception
            if (r2 == 0) goto La7
            r2.a()     // Catch: java.lang.Throwable -> La8
        La7:
            throw r1     // Catch: java.lang.Throwable -> La8
        La8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eshb.i():void");
    }

    @Override // defpackage.eshc
    public final defn j() {
        m();
        defr defrVar = new defr();
        l(new eshf(this.e, defrVar));
        defv defvVar = defrVar.a;
        this.i.execute(new Runnable() { // from class: esgz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i();
            }
        });
        return defvVar;
    }
}
