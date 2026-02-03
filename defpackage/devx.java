package defpackage;

import android.content.Context;
import android.os.Process;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class devx {
    public static final Duration a = Duration.ofDays(6);
    public static final dhip b = new dhip("SystemBindingMonitor");
    public final Context c;
    public final eosd d;
    public final diep e;
    public final deyj g;
    public boolean i = false;
    public devw j = null;
    private int n = 1;
    private Duration k = Duration.ZERO;
    private Duration l = Duration.ZERO;
    private Duration m = Duration.ZERO;
    public final long h = Process.getStartElapsedRealtime();
    public final ejxm f = new ejxm(ejsz.a);

    public devx(Context context, eosd eosdVar, diep diepVar, deyj deyjVar) {
        this.c = context;
        this.d = eosdVar;
        this.e = diepVar;
        this.g = deyjVar;
    }

    public final synchronized Duration a() {
        d(this.n);
        return this.k;
    }

    public final synchronized Duration b() {
        d(this.n);
        return this.l;
    }

    public final synchronized Duration c() {
        d(this.n);
        return this.m;
    }

    public final synchronized void d(int i) {
        int i2 = this.n;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 1) {
            this.k = this.k.plus(this.f.d());
        } else if (i3 == 2) {
            this.l = this.l.plus(this.f.d());
        } else if (i3 == 3) {
            this.m = this.m.plus(this.f.d());
        }
        if (a.compareTo(this.k.plus(this.l).plus(this.m)) <= 0) {
            this.k = Duration.ZERO;
            this.l = Duration.ZERO;
            this.m = Duration.ZERO;
            final deyj deyjVar = this.g;
            final Context context = this.c;
            deyjVar.L(new Callable() { // from class: deyh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ewlw ewlwVar = (ewlw) ewlx.a.createBuilder();
                    ewlz ewlzVar = (ewlz) ewma.a.createBuilder();
                    ewlzVar.copyOnWrite();
                    ewma ewmaVar = (ewma) ewlzVar.instance;
                    ewmaVar.c = 6;
                    ewmaVar.b |= 1;
                    ewlwVar.copyOnWrite();
                    ewlx ewlxVar = (ewlx) ewlwVar.instance;
                    ewma ewmaVar2 = (ewma) ewlzVar.build();
                    ewmaVar2.getClass();
                    ewlxVar.c = ewmaVar2;
                    ewlxVar.b = 3;
                    deyjVar.B(context, (ewlx) ewlwVar.build());
                    return null;
                }
            }, new Function() { // from class: deyi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i4 = deyj.b;
                    dhja.i((Throwable) obj, "Fail to log network status times reset event to clearcut!", new Object[0]);
                    return null;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        this.n = i;
        ejxm ejxmVar = this.f;
        ejxmVar.e();
        ejxmVar.f();
    }
}
