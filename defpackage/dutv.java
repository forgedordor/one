package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutv {
    public final dutu a;
    private final Executor d;
    private final dvap c = new dvap();
    public final Map b = new HashMap();

    public dutv(Executor executor, dutu dutuVar) {
        this.d = executor;
        this.a = dutuVar;
    }

    public static dutv a(Executor executor) {
        return new dutv(executor, new dutt());
    }

    public final ListenableFuture b(final String str, final ListenableFuture listenableFuture) {
        durt.l("%s: submitting request to add in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.b(new eooy() { // from class: duts
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                String str2 = str;
                dutv dutvVar = this.a;
                ListenableFuture listenableFuture2 = listenableFuture;
                try {
                    dutu dutuVar = dutvVar.a;
                    Map map = dutvVar.b;
                    dutuVar.a(str2, map.size() + 1);
                    map.put(str2, listenableFuture2);
                    return eorv.a;
                } catch (Exception e) {
                    durt.k(e, "%s: Failed to add download future (%s) to map", "DownloadFutureMap", str2);
                    return eork.h(e);
                }
            }
        }, this.d);
    }

    public final ListenableFuture c(final String str) {
        durt.l("%s: submitting check for in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.a(new Callable() { // from class: dutp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.b.containsKey(str));
            }
        }, this.d);
    }

    public final ListenableFuture d(final String str) {
        durt.l("%s: submitting request for in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.a(new Callable() { // from class: dutq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ejwi.i((ListenableFuture) this.a.b.get(str));
            }
        }, this.d);
    }

    public final ListenableFuture e(final String str) {
        durt.l("%s: submitting request to remove in-progress download future with key: %s", "DownloadFutureMap", str);
        return this.c.b(new eooy() { // from class: dutr
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dutv dutvVar = this.a;
                String str2 = str;
                try {
                    Map map = dutvVar.b;
                    map.remove(str2);
                    dutvVar.a.b(str2, map.size());
                    return eorv.a;
                } catch (Exception e) {
                    durt.k(e, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", str2);
                    return eork.h(e);
                }
            }
        }, this.d);
    }
}
