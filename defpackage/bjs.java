package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjs implements blm {
    private static final bjs b = new bjs(null);
    public final ListenableFuture a;

    private bjs(Object obj) {
        this.a = bqk.b(obj);
    }

    public static blm a(Object obj) {
        return obj == null ? b : new bjs(obj);
    }

    @Override // defpackage.blm
    public final ListenableFuture b() {
        return this.a;
    }

    @Override // defpackage.blm
    public final void c(Executor executor, final bll bllVar) {
        this.a.b(new Runnable() { // from class: bjr
            @Override // java.lang.Runnable
            public final void run() {
                bjs bjsVar = this.a;
                bll bllVar2 = bllVar;
                try {
                    bllVar2.b(((bqn) bjsVar.a).b);
                } catch (InterruptedException | ExecutionException e) {
                    bllVar2.a(e);
                }
            }
        }, executor);
    }

    @Override // defpackage.blm
    public final void d(bll bllVar) {
    }
}
