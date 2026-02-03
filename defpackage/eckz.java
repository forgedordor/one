package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eckz implements ecln {
    public final ListenableFuture a;
    public final Executor b;
    public final ecev c;
    public final ejwi d;
    private final String g;
    private final ecjn h;
    private final eidp i;
    public final Object e = new Object();
    private final eoqr j = new eoqr();
    public ListenableFuture f = null;

    public eckz(String str, ListenableFuture listenableFuture, ecjn ecjnVar, Executor executor, ecev ecevVar, ejwi ejwiVar, eidp eidpVar) {
        this.g = str;
        this.a = eork.j(listenableFuture);
        this.h = ecjnVar;
        this.b = new eoss(executor);
        this.c = ecevVar;
        this.d = ejwiVar;
        this.i = eidpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0031, B:16:0x0033), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture d() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            com.google.common.util.concurrent.ListenableFuture r1 = r4.f     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L16
            com.google.common.util.concurrent.ListenableFuture r1 = r4.f     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L35
            defpackage.eork.q(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L35
            goto L16
        L13:
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L35
        L16:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.f     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L31
            eoqr r1 = r4.j     // Catch: java.lang.Throwable -> L35
            ecku r2 = new ecku     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            eooy r2 = defpackage.eiid.c(r2)     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.Executor r3 = r4.b     // Catch: java.lang.Throwable -> L35
            com.google.common.util.concurrent.ListenableFuture r1 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> L35
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.eork.j(r1)     // Catch: java.lang.Throwable -> L35
            r4.f = r1     // Catch: java.lang.Throwable -> L35
        L31:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.f     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r1
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eckz.d():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.ecln
    public final eooy a() {
        return new eooy() { // from class: eckt
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final eckz eckzVar = this.a;
                return eork.j(eooq.g(eckzVar.a, eiid.d(new eooz() { // from class: eckq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Uri uri = (Uri) obj;
                        Uri uriA = eclr.a(uri, ".bak");
                        try {
                            ecev ecevVar = eckzVar.c;
                            if (ecevVar.h(uriA)) {
                                ecevVar.g(uriA, uri);
                            }
                            return eorv.a;
                        } catch (IOException e) {
                            return eork.h(e);
                        }
                    }
                }), eckzVar.b));
            }
        };
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                eieu eieuVarB = this.i.b("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.c.c(uri, new echh());
                    try {
                        evuh evuhVarD = ((eclx) this.h).d(inputStream);
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
            } catch (IOException e) {
                throw eclp.a(this.c, uri, e, this.g);
            }
        } catch (FileNotFoundException e2) {
            if (this.c.h(uri)) {
                throw e2;
            }
            return ((eclw) this.h).a;
        }
    }

    public final void c(Uri uri, Object obj) throws IOException {
        Uri uriA = eclr.a(uri, ".tmp");
        try {
            eieu eieuVarB = this.i.b("Write " + this.g);
            try {
                ecfo ecfoVar = new ecfo();
                try {
                    ecev ecevVar = this.c;
                    echm echmVar = new echm();
                    echmVar.a = new ecfo[]{ecfoVar};
                    OutputStream outputStream = (OutputStream) ecevVar.c(uriA, echmVar);
                    try {
                        this.h.a(obj, outputStream);
                        ecfoVar.b();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        eieuVarB.close();
                        this.c.g(uriA, uri);
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
                    throw eclp.a(this.c, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            ecev ecevVar2 = this.c;
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

    @Override // defpackage.ecln
    public final String f() {
        return this.g;
    }

    @Override // defpackage.ecln
    public final ListenableFuture h(final eooz eoozVar, final Executor executor) {
        final ListenableFuture listenableFutureD = d();
        return this.j.b(eiid.c(new eooy() { // from class: eckv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final eckz eckzVar = this.a;
                eooz eoozVar2 = new eooz() { // from class: eckr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        ListenableFuture listenableFuture;
                        eckz eckzVar2 = eckzVar;
                        synchronized (eckzVar2.e) {
                            listenableFuture = eckzVar2.f;
                        }
                        return listenableFuture;
                    }
                };
                ListenableFuture listenableFuture = listenableFutureD;
                eoqg eoqgVar = eoqg.a;
                final ListenableFuture listenableFutureG = eooq.g(listenableFuture, eoozVar2, eoqgVar);
                final ListenableFuture listenableFutureG2 = eooq.g(listenableFutureG, eoozVar, executor);
                return eooq.g(listenableFutureG2, eiid.d(new eooz() { // from class: eckw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final ListenableFuture listenableFuture2 = listenableFutureG2;
                        if (eork.q(listenableFutureG).equals(eork.q(listenableFuture2))) {
                            return eork.i(obj);
                        }
                        final eckz eckzVar2 = eckzVar;
                        ListenableFuture listenableFutureG3 = eooq.g(listenableFuture2, eiid.d(new eooz() { // from class: ecks
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) throws IOException {
                                eckz eckzVar3 = eckzVar2;
                                eckzVar3.c((Uri) eork.q(eckzVar3.a), obj2);
                                ListenableFuture listenableFuture3 = listenableFuture2;
                                synchronized (eckzVar3.e) {
                                    eckzVar3.f = listenableFuture3;
                                }
                                return eork.i(obj2);
                            }
                        }), eckzVar2.b);
                        synchronized (eckzVar2.e) {
                        }
                        return listenableFutureG3;
                    }
                }), eoqgVar);
            }
        }), eoqg.a);
    }

    @Override // defpackage.ecln
    public final ListenableFuture i() {
        return d();
    }
}
