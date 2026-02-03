package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecja implements ecln {
    public final String a;
    public final ListenableFuture b;
    public final ecjn c;
    public final Executor d;
    public final ecev e;
    public final eidp f;
    public final ecid g = new eciy(this);
    public final eoqr h = new eoqr();
    private final ejwi i;

    public ecja(String str, ListenableFuture listenableFuture, ecjn ecjnVar, Executor executor, ecev ecevVar, ejwi ejwiVar, eidp eidpVar) {
        this.a = str;
        this.b = eork.j(listenableFuture);
        this.c = ecjnVar;
        this.d = executor;
        this.e = ecevVar;
        this.i = ejwiVar;
        this.f = eidpVar;
    }

    public static ListenableFuture b(final ListenableFuture listenableFuture, final Closeable closeable) {
        return eork.b(listenableFuture).a(new Callable() { // from class: eciw
            @Override // java.util.concurrent.Callable
            public final Object call() throws IOException {
                closeable.close();
                return eork.q(listenableFuture);
            }
        }, eoqg.a);
    }

    public static boolean g(IOException iOException) {
        return (iOException instanceof ecfr) || (iOException.getCause() instanceof ecfr);
    }

    @Override // defpackage.ecln
    public final eooy a() {
        return new eooy() { // from class: eciq
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eork.j(eclq.a(this.a.b));
            }
        };
    }

    public final ListenableFuture c(final Uri uri, eciz ecizVar) {
        try {
            return eork.i(e(uri));
        } catch (IOException e) {
            ejwi ejwiVar = this.i;
            return !ejwiVar.g() ? eork.h(e) : g(e) ? eork.h(e) : eooq.g(ecizVar.a(e, (ecic) ejwiVar.c()), eiid.d(new eooz() { // from class: eciv
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eork.i(this.a.e(uri));
                }
            }), this.d);
        }
    }

    public final ListenableFuture d(ListenableFuture listenableFuture) {
        return eooq.g(listenableFuture, eiid.d(new eooz() { // from class: ecis
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws IOException {
                ecja ecjaVar = this.a;
                evuh evuhVar = (evuh) obj;
                Uri uri = (Uri) eork.q(ecjaVar.b);
                Uri uriA = eclr.a(uri, ".tmp");
                try {
                    eieu eieuVarB = ecjaVar.f.b("Write " + ecjaVar.a);
                    try {
                        ecfo ecfoVar = new ecfo();
                        try {
                            ecev ecevVar = ecjaVar.e;
                            echm echmVar = new echm();
                            echmVar.a = new ecfo[]{ecfoVar};
                            OutputStream outputStream = (OutputStream) ecevVar.c(uriA, echmVar);
                            try {
                                ecjaVar.c.a(evuhVar, outputStream);
                                ecfoVar.b();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                eieuVarB.close();
                                ecjaVar.e.g(uriA, uri);
                                return eork.i(evuhVar);
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
                            throw eclp.a(ecjaVar.e, uri, e, ecjaVar.a);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    ecev ecevVar2 = ecjaVar.e;
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
        }), this.d);
    }

    public final evuh e(Uri uri) throws IOException {
        InputStream inputStream;
        try {
            try {
                eieu eieuVarB = this.f.b("Read " + this.a);
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

    @Override // defpackage.ecln
    public final String f() {
        return this.a;
    }

    @Override // defpackage.ecln
    public final ListenableFuture h(final eooz eoozVar, final Executor executor) {
        return this.h.b(eiid.c(new eooy() { // from class: ecio
            @Override // defpackage.eooy
            public final ListenableFuture a() throws IOException {
                final ecja ecjaVar = this.a;
                Uri uri = (Uri) eork.q(ecjaVar.b);
                ecgf ecgfVar = new ecgf((Closeable) ecjaVar.e.c(uri, new echa(false, false)));
                eooz eoozVar2 = eoozVar;
                Executor executor2 = executor;
                try {
                    final ListenableFuture listenableFutureC = ecjaVar.c(uri, new eciz() { // from class: ecit
                        @Override // defpackage.eciz
                        public final ListenableFuture a(IOException iOException, ecic ecicVar) {
                            return ecicVar.a(iOException, ecjaVar.g);
                        }
                    });
                    final ListenableFuture listenableFutureG = eooq.g(listenableFutureC, eoozVar2, executor2);
                    ListenableFuture listenableFutureB = ecja.b(eooq.g(listenableFutureG, eiid.d(new eooz() { // from class: eciu
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            evuh evuhVar = (evuh) eork.q(listenableFutureC);
                            ListenableFuture listenableFuture = listenableFutureG;
                            return evuhVar.equals(eork.q(listenableFuture)) ? listenableFuture : ecjaVar.d(listenableFuture);
                        }
                    }), eoqg.a), ecgfVar.a());
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
        }), this.d);
    }

    @Override // defpackage.ecln
    public final ListenableFuture i() {
        return eork.j(eork.n(eiid.c(new eooy() { // from class: ecir
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final ecja ecjaVar = this.a;
                return ecjaVar.c((Uri) eork.q(ecjaVar.b), new eciz() { // from class: ecip
                    @Override // defpackage.eciz
                    public final ListenableFuture a(IOException iOException, final ecic ecicVar) {
                        final ecja ecjaVar2 = ecjaVar;
                        return ecjaVar2.h.b(eiid.c(new eooy() { // from class: ecin
                            @Override // defpackage.eooy
                            public final ListenableFuture a() throws IOException {
                                ListenableFuture listenableFutureH;
                                ecja ecjaVar3 = ecjaVar2;
                                Uri uri = (Uri) eork.q(ecjaVar3.b);
                                ecgf ecgfVar = new ecgf((Closeable) ecjaVar3.e.c(uri, new echa(false, false)));
                                ecic ecicVar2 = ecicVar;
                                try {
                                    try {
                                        ecjaVar3.e(uri);
                                        listenableFutureH = eorv.a;
                                    } catch (IOException e) {
                                        listenableFutureH = ecja.g(e) ? eork.h(e) : ecicVar2.a(e, ecjaVar3.g);
                                    }
                                    ListenableFuture listenableFutureB = ecja.b(listenableFutureH, ecgfVar.a());
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
                        }), ecjaVar2.d);
                    }
                });
            }
        }), this.d));
    }
}
