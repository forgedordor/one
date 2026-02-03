package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyyp implements dyyl {
    public static final String[] a;
    public final Context b;
    public final eosc c;

    static {
        int i = devc.a;
        a = new String[]{"service_googleone"};
    }

    public dyyp(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = eosj.a(executorService);
    }

    @Override // defpackage.dyyl
    public final ListenableFuture a() {
        return eika.h(new Callable() { // from class: dyyo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = dbmj.a;
                return Arrays.asList(dbmq.j(this.a.b));
            }
        }, this.c);
    }
}
