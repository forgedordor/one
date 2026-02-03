package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clde {
    public final SettableFuture c;
    public final eiju d;
    public final Object a = new Object();
    public final List b = new ArrayList(2);
    private boolean e = false;

    public clde() {
        eieu eieuVarK = eiiy.k("DynamicFutureListListener");
        try {
            SettableFuture settableFutureCreate = SettableFuture.create();
            eieuVarK.b(settableFutureCreate);
            this.c = settableFutureCreate;
            this.d = eiju.g(settableFutureCreate);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final boolean a(final ListenableFuture listenableFuture) {
        synchronized (this.a) {
            if ((this.e && this.b.isEmpty()) || this.d.isDone()) {
                return false;
            }
            this.b.add(listenableFuture);
            this.e = true;
            auvh.i(listenableFuture, new Consumer() { // from class: cldd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    boolean zIsEmpty;
                    clde cldeVar = this.a;
                    Object obj2 = cldeVar.a;
                    ListenableFuture listenableFuture2 = listenableFuture;
                    synchronized (obj2) {
                        List list = cldeVar.b;
                        list.remove(listenableFuture2);
                        zIsEmpty = list.isEmpty();
                    }
                    if (zIsEmpty) {
                        cldeVar.c.set(null);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, eoqg.a);
            return true;
        }
    }
}
