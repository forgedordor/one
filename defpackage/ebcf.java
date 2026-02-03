package defpackage;

import android.os.Looper;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebcf implements ebby {
    private final fcsu a;
    private final diep b;

    public ebcf(fcsu fcsuVar, diep diepVar) {
        this.a = fcsuVar;
        this.b = diepVar;
    }

    @Override // defpackage.ebby
    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ebce
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                this.a.b(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final /* synthetic */ void b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        long jA = this.b.a();
        try {
            ArrayList arrayList = new ArrayList();
            if (thread == Looper.getMainLooper().getThread()) {
                Set set = (Set) this.a.b();
                ArrayList arrayList2 = new ArrayList(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList2.add(((ebcd) it.next()).a());
                    } catch (Throwable th2) {
                        arrayList.add(th2);
                    }
                }
                ListenableFuture[] listenableFutureArr = (ListenableFuture[]) arrayList2.toArray(new ListenableFuture[0]);
                final eori eoriVar = new eori(listenableFutureArr);
                ekfw ekfwVarD = ekgb.d(listenableFutureArr.length);
                for (int i = 0; i < listenableFutureArr.length; i++) {
                    ekfwVarD.h(new eorh(eoriVar));
                }
                final ekgb ekgbVarG = ekfwVarD.g();
                for (final int i2 = 0; i2 < listenableFutureArr.length; i2++) {
                    listenableFutureArr[i2].b(new Runnable() { // from class: eorb
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            eori eoriVar2 = eoriVar;
                            ListenableFuture[] listenableFutureArr2 = eoriVar2.d;
                            int i3 = i2;
                            ListenableFuture listenableFuture = listenableFutureArr2[i3];
                            listenableFuture.getClass();
                            listenableFutureArr2[i3] = null;
                            int i4 = eoriVar2.e;
                            while (true) {
                                ekgb ekgbVar = ekgbVarG;
                                int i5 = ((ekoe) ekgbVar).c;
                                if (i4 >= i5) {
                                    eoriVar2.e = i5;
                                    return;
                                }
                                int i6 = i4 + 1;
                                if (((eooi) ekgbVar.get(i4)).o(listenableFuture)) {
                                    eoriVar2.a();
                                    eoriVar2.e = i6;
                                    return;
                                }
                                i4 = i6;
                            }
                        }
                    }, eoqg.a);
                }
                ekqh it2 = ekgbVarG.iterator();
                while (it2.hasNext()) {
                    try {
                        eote.b((ListenableFuture) it2.next(), 4000 - (this.b.a() - jA), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException e) {
                        arrayList.add(e);
                    } catch (Throwable th3) {
                        arrayList.add(th3);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Throwable) it3.next()).printStackTrace();
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
