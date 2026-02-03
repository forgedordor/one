package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eckm implements ecln {
    public final String a;
    public final ListenableFuture b;
    public final ecjn c;
    public final Executor d;
    public final ecev e;
    public final ecjw f;
    public final ejwi g;
    public final eidp i;
    public Object l;
    public boolean m;
    public final ecid h = new eckl(this);
    public final Object j = new Object();
    public final eoqr k = new eoqr();
    private final eoqr n = new eoqr();

    public eckm(String str, ListenableFuture listenableFuture, ecjn ecjnVar, Executor executor, ecev ecevVar, ecjw ecjwVar, ejwi ejwiVar, eidp eidpVar) {
        new eoqr();
        this.l = null;
        this.a = str;
        this.b = eork.j(listenableFuture);
        this.c = ecjnVar;
        this.d = executor;
        this.e = ecevVar;
        this.f = ecjwVar;
        this.g = ejwiVar;
        this.i = eidpVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, final Closeable closeable, Executor executor) {
        return eork.b(listenableFuture).a(new Callable() { // from class: eckf
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                closeable.close();
                return eork.q(listenableFuture);
            }
        }, executor);
    }

    public static boolean d(IOException iOException) {
        return (iOException instanceof ecfr) || (iOException.getCause() instanceof ecfr);
    }

    private final Closeable j(Uri uri) {
        try {
            ecev ecevVar = this.e;
            echa echaVar = new echa(true, true);
            echaVar.a = true;
            return (Closeable) ecevVar.c(uri, echaVar);
        } catch (ecgh unused) {
            return null;
        }
    }

    @Override // defpackage.ecln
    public final eooy a() {
        return new eooy() { // from class: ecjz
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final eckm eckmVar = this.a;
                ListenableFuture listenableFutureJ = eork.j(eckmVar.b);
                final Runnable runnable = new Runnable() { // from class: eckg
                    @Override // java.lang.Runnable
                    public final void run() {
                        eckm eckmVar2 = eckmVar;
                        Object obj = eckmVar2.j;
                        synchronized (obj) {
                            eckmVar2.l = null;
                            eckmVar2.m = true;
                            synchronized (obj) {
                            }
                        }
                    }
                };
                final ecil ecilVar = (ecil) eckmVar.f;
                return eooq.f(listenableFutureJ, new ejvr() { // from class: ecie
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Uri uri = (Uri) obj;
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intentFilter.addDataScheme(uri.getScheme());
                        intentFilter.addDataPath(uri.getPath(), 0);
                        intentFilter.addDataPath(ecil.a(uri).getPath(), 0);
                        intentFilter.addDataAuthority("*", null);
                        Runnable runnable2 = runnable;
                        ecij ecijVar = new ecij(runnable2);
                        int i = Build.VERSION.SDK_INT;
                        ecil ecilVar2 = ecilVar;
                        if (i >= 33) {
                            ecilVar2.b.registerReceiver(ecijVar, intentFilter, ecilVar2.d, ecilVar2.e, 2);
                        } else {
                            ecilVar2.b.registerReceiver(ecijVar, intentFilter, ecilVar2.d, ecilVar2.e);
                        }
                        synchronized (ecilVar2.j) {
                            ecilVar2.i.t(uri, runnable2);
                        }
                        return null;
                    }
                }, eoqg.a);
            }
        };
    }

    public final Object c(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                eieu eieuVarB = this.i.b("Read " + this.a);
                try {
                    inputStream = (InputStream) this.e.c(uri, new echh());
                    try {
                        evuh evuhVarD = ((eclx) this.c).d(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        eieuVarB.close();
                        return evuhVarD;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        eieuVarB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                ecev ecevVar = this.e;
                if (!ecevVar.h(uri)) {
                    return ((eclw) this.c).a;
                }
                inputStream = (InputStream) ecevVar.c(uri, new echh());
                try {
                    evuh evuhVarD2 = ((eclx) this.c).d(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return evuhVarD2;
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw eclp.a(this.e, uri, e, this.a);
        }
    }

    public final ListenableFuture e(final ListenableFuture listenableFuture) {
        ListenableFuture listenableFutureB;
        final ecil ecilVar = (ecil) this.f;
        final Integer num = (Integer) ((ejxw) ecilVar.f).a;
        if (num.intValue() < 0) {
            listenableFutureB = eorv.a;
        } else {
            final ListenableFuture listenableFuture2 = this.b;
            eooz eoozVar = ecilVar.c;
            eoqg eoqgVar = eoqg.a;
            final ListenableFuture listenableFutureG = eooq.g(listenableFuture2, eoozVar, eoqgVar);
            listenableFutureB = eork.d(listenableFuture2, listenableFutureG).b(new eooy() { // from class: ecig
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    Uri uri = (Uri) eork.q(listenableFuture2);
                    Set set = (Set) eork.q(listenableFutureG);
                    ecik ecikVar = new ecik(set);
                    Iterator it = set.iterator();
                    while (true) {
                        ecil ecilVar2 = ecilVar;
                        if (!it.hasNext()) {
                            ecik ecikVar2 = ecikVar;
                            Integer num2 = num;
                            ejxm ejxmVarC = ejxm.c(ejsz.a);
                            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                            eoqt eoqtVarU = eoqt.t(ecikVar2.a).u(num2.intValue(), ecilVar2.g, null);
                            ejvr ejvrVar = new ejvr() { // from class: ecif
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    atomicBoolean.set(false);
                                    return null;
                                }
                            };
                            eoqg eoqgVar2 = eoqg.a;
                            ListenableFuture listenableFutureF = eooh.f(eoqtVarU, TimeoutException.class, ejvrVar, eoqgVar2);
                            eork.r(listenableFutureF, new ecih(ecilVar2, atomicBoolean, set, ejxmVarC, ecikVar2, num2), eoqgVar2);
                            return listenableFutureF;
                        }
                        String str = (String) it.next();
                        ecik ecikVar3 = ecikVar;
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.libraries.storage.protostore.MULTI_APP");
                        intent.setData(((Boolean) ((ejxw) ecilVar2.h).a).booleanValue() ? ecil.a(uri) : uri);
                        intent.setPackage(str);
                        intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                        ecilVar2.b.sendOrderedBroadcast(intent, null, ecikVar3, ecilVar2.e, -1, null, null);
                        ecikVar = ecikVar3;
                    }
                }
            }, eoqgVar);
        }
        return eooq.g(listenableFutureB, eiid.d(new eooz() { // from class: ecka
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eckm eckmVar = this.a;
                return eooq.g(listenableFuture, eiid.d(new eooz() { // from class: eckb
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) throws IOException {
                        eckm eckmVar2 = eckmVar;
                        Uri uri = (Uri) eork.q(eckmVar2.b);
                        Uri uriA = eclr.a(uri, ".tmp");
                        try {
                            eieu eieuVarB = eckmVar2.i.b("Write " + eckmVar2.a);
                            try {
                                ecfo ecfoVar = new ecfo();
                                try {
                                    ecev ecevVar = eckmVar2.e;
                                    echm echmVar = new echm();
                                    echmVar.a = new ecfo[]{ecfoVar};
                                    OutputStream outputStream = (OutputStream) ecevVar.c(uriA, echmVar);
                                    try {
                                        eckmVar2.c.a(obj2, outputStream);
                                        ecfoVar.b();
                                        if (outputStream != null) {
                                            outputStream.close();
                                        }
                                        eieuVarB.close();
                                        eckmVar2.e.g(uriA, uri);
                                        synchronized (eckmVar2.j) {
                                            eckmVar2.l = obj2;
                                        }
                                        return eorv.a;
                                    } catch (Throwable th) {
                                        if (outputStream != null) {
                                            try {
                                                outputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw eclp.a(eckmVar2.e, uri, e, eckmVar2.a);
                                }
                            } finally {
                            }
                        } catch (IOException e2) {
                            ecev ecevVar2 = eckmVar2.e;
                            if (ecevVar2.h(uriA)) {
                                try {
                                    ecevVar2.f(uriA);
                                } catch (IOException e3) {
                                    e2.addSuppressed(e3);
                                }
                            }
                            throw e2;
                        }
                    }
                }), eckmVar.d);
            }
        }), eoqg.a);
    }

    @Override // defpackage.ecln
    public final String f() {
        return this.a;
    }

    public final Object g(Uri uri) throws IOException {
        Closeable closeableJ;
        synchronized (this.j) {
            Object obj = this.l;
            if (obj != null) {
                return obj;
            }
            try {
                closeableJ = j(uri);
            } catch (FileNotFoundException unused) {
                Object objC = c(uri);
                synchronized (this.j) {
                    if (this.m) {
                        objC = null;
                    } else {
                        this.l = objC;
                    }
                    if (objC != null) {
                        return objC;
                    }
                    closeableJ = j(uri);
                }
            }
            try {
                Object objC2 = c(uri);
                synchronized (this.j) {
                    if (closeableJ != null) {
                        this.l = objC2;
                        closeableJ.close();
                    }
                }
                return objC2;
            } catch (Throwable th) {
                if (closeableJ != null) {
                    try {
                        closeableJ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // defpackage.ecln
    public final ListenableFuture h(final eooz eoozVar, final Executor executor) {
        return this.k.b(eiid.c(new eooy() { // from class: eckd
            @Override // defpackage.eooy
            public final ListenableFuture a() throws IOException {
                ListenableFuture listenableFutureA;
                final ListenableFuture listenableFutureG;
                ListenableFuture listenableFutureH;
                final eckm eckmVar = this.a;
                final Uri uri = (Uri) eork.q(eckmVar.b);
                ecgf ecgfVar = new ecgf((Closeable) eckmVar.e.c(uri, new echa(false, false)));
                eooz eoozVar2 = eoozVar;
                Executor executor2 = executor;
                try {
                    try {
                        listenableFutureG = eork.i(eckmVar.c(uri));
                    } catch (IOException e) {
                        ejwi ejwiVar = eckmVar.g;
                        if (ejwiVar.g()) {
                            if (eckm.d(e)) {
                                listenableFutureA = eork.h(e);
                            } else {
                                listenableFutureA = ((ecic) ejwiVar.c()).a(e, eckmVar.h);
                            }
                            listenableFutureG = eooq.g(listenableFutureA, eiid.d(new eooz() { // from class: ecki
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    return eork.i(eckmVar.c(uri));
                                }
                            }), eckmVar.d);
                        } else {
                            listenableFutureH = eork.h(e);
                        }
                    }
                    final ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eoozVar2, executor2);
                    listenableFutureH = eckm.b(eooq.g(listenableFutureG2, eiid.d(new eooz() { // from class: eckh
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final ListenableFuture listenableFuture = listenableFutureG2;
                            return eork.q(listenableFutureG).equals(eork.q(listenableFuture)) ? listenableFuture : eooq.g(eckmVar.e(listenableFuture), eiid.d(new eooz() { // from class: ecjy
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return listenableFuture;
                                }
                            }), eoqg.a);
                        }
                    }), eoqg.a), ecgfVar.a(), eckmVar.d);
                    ecgfVar.close();
                    return listenableFutureH;
                } catch (Throwable th) {
                    try {
                        ecgfVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), this.d);
    }

    @Override // defpackage.ecln
    public final ListenableFuture i() {
        synchronized (this.j) {
            Object obj = this.l;
            if (obj == null) {
                return eork.j(this.n.b(eiid.c(new eooy() { // from class: eckc
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        final eckm eckmVar = this.a;
                        final Uri uri = (Uri) eork.q(eckmVar.b);
                        try {
                            return eork.i(eckmVar.g(uri));
                        } catch (IOException e) {
                            ejwi ejwiVar = eckmVar.g;
                            if (!ejwiVar.g()) {
                                return eork.h(e);
                            }
                            if (eckm.d(e)) {
                                return eork.h(e);
                            }
                            Object objC = ejwiVar.c();
                            eoqr eoqrVar = eckmVar.k;
                            final ecic ecicVar = (ecic) objC;
                            eooy eooyVarC = eiid.c(new eooy() { // from class: ecke
                                @Override // defpackage.eooy
                                public final ListenableFuture a() throws IOException {
                                    ListenableFuture listenableFutureH;
                                    eckm eckmVar2 = eckmVar;
                                    Uri uri2 = (Uri) eork.q(eckmVar2.b);
                                    ecgf ecgfVar = new ecgf((Closeable) eckmVar2.e.c(uri2, new echa(false, false)));
                                    ecic ecicVar2 = ecicVar;
                                    try {
                                        try {
                                            eckmVar2.c(uri2);
                                            listenableFutureH = eorv.a;
                                        } catch (IOException e2) {
                                            listenableFutureH = eckm.d(e2) ? eork.h(e2) : ecicVar2.a(e2, eckmVar2.h);
                                        }
                                        ListenableFuture listenableFutureB = eckm.b(listenableFutureH, ecgfVar.a(), eckmVar2.d);
                                        ecgfVar.close();
                                        return listenableFutureB;
                                    } catch (Throwable th) {
                                        try {
                                            ecgfVar.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            });
                            Executor executor = eckmVar.d;
                            return eooq.g(eoqrVar.b(eooyVarC, executor), eiid.d(new eooz() { // from class: eckj
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    return eork.i(eckmVar.g(uri));
                                }
                            }), executor);
                        }
                    }
                }), this.d));
            }
            return eork.i(obj);
        }
    }
}
