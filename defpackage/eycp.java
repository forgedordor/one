package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eycp implements eycv {
    public final String a;
    public final String b;
    public final eyce c;
    public final String d;
    public final eycb e;
    public final eycc f;
    public final ejwi g;
    public eycv h;
    public eycz i;
    public int j;
    public int k;
    private int l;

    public eycp(String str, eyce eyceVar, eycb eycbVar, String str2, eycc eyccVar, eydb eydbVar) {
        str.getClass();
        eycbVar.getClass();
        this.a = str;
        this.b = "POST";
        this.c = eyceVar == null ? new eyce() : eyceVar;
        this.d = ejwk.b(str2);
        this.f = eyccVar;
        this.e = eycbVar;
        this.l = 1;
        this.g = eydbVar.c;
    }

    @Override // defpackage.eycv
    public final long a() {
        return this.e.d();
    }

    @Override // defpackage.eycv
    public final ListenableFuture b() {
        Callable callable = new Callable() { // from class: eycn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eycy eycyVar;
                ListenableFuture listenableFutureB;
                eycp eycpVar = this.a;
                try {
                    synchronized (eycpVar) {
                    }
                    eycpVar.c();
                    Random random = new Random();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 70; i++) {
                        sb.append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(36)));
                    }
                    String string = sb.toString();
                    eyce eyceVar = new eyce();
                    eyce eyceVar2 = new eyce();
                    eyce eyceVar3 = eycpVar.c;
                    for (String str : eyceVar3.c()) {
                        if (ejuf.c(str).startsWith("content-")) {
                            eyceVar.e(str, eyceVar3.a(str));
                        } else {
                            eyceVar2.e(str, eyceVar3.a(str));
                        }
                    }
                    eycm eycmVar = new eycm(string, eycpVar.d, eyceVar, eycpVar.e);
                    eyceVar2.e("X-Goog-Upload-Protocol", "multipart");
                    eyceVar2.e(ffho.a, "multipart/related; boundary=".concat(string));
                    eycv eycvVarA = eycpVar.f.a(eycpVar.a, eycpVar.b, eyceVar2, eycmVar);
                    if (eycpVar.i != null) {
                        synchronized (eycpVar) {
                            eycvVarA.e(new eyco(eycpVar, eycpVar.i), eycpVar.j, eycpVar.k);
                        }
                    }
                    synchronized (eycpVar) {
                        eycpVar.h = eycvVarA;
                        listenableFutureB = eycvVarA.b();
                    }
                } catch (eycx e) {
                    eycyVar = new eycy(e);
                } catch (Throwable th) {
                    eycyVar = new eycy(new eycx(eycw.UNKNOWN, th));
                }
                try {
                    eycy eycyVar2 = (eycy) listenableFutureB.get();
                    if (eycyVar2.b()) {
                        eycx eycxVar = eycyVar2.a;
                        if (eycxVar.a != eycw.CANCELED) {
                            throw eycxVar;
                        }
                        eycpVar.c();
                    }
                    eycyVar = new eycy(eycyVar2.b);
                    synchronized (eycpVar) {
                    }
                    return eycyVar;
                } catch (InterruptedException e2) {
                    e = e2;
                    throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                } catch (ExecutionException e3) {
                    e = e3;
                    throw new RuntimeException("Unexpected error occurred: ".concat(String.valueOf(e.getMessage())));
                }
            }
        };
        eosw eoswVar = new eosw();
        eoswVar.d("Scotty-Uploader-MultipartTransfer-%d");
        eosc eoscVarA = eosj.a(Executors.newSingleThreadExecutor(eosw.b(eoswVar)));
        ListenableFuture listenableFutureSubmit = eoscVarA.submit(callable);
        eoscVarA.shutdown();
        return listenableFutureSubmit;
    }

    public final synchronized void c() {
        int i;
        while (true) {
            i = this.l;
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

    @Override // defpackage.eycv
    public final String d() {
        return null;
    }

    @Override // defpackage.eycv
    public final synchronized void e(eycz eyczVar, int i, int i2) {
        boolean z = true;
        ejwl.b(i > 0, "Progress threshold (bytes) must be greater than 0");
        if (i2 < 0) {
            z = false;
        }
        ejwl.b(z, "Progress threshold (millis) must be greater or equal to 0");
        this.i = eyczVar;
        this.j = i;
        this.k = i2;
    }

    @Override // defpackage.eycv
    public final void f() {
        synchronized (this) {
            eycv eycvVar = this.h;
            if (eycvVar != null) {
                eycvVar.f();
            }
            this.l = 3;
            notifyAll();
        }
    }
}
