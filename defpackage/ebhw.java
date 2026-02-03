package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.lang.Thread;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebhw {
    public final List d;
    public final List e;
    public ebia f;
    public ebib g;
    public boolean h;
    public Optional i;
    public Optional j;
    public Optional k;
    public Optional l;
    public static final dhip a = new dhip("DnsClient.Builder");
    private static final Optional m = Optional.empty();
    private static final Optional n = Optional.empty();
    public static final eosc b = eosj.a(Executors.newFixedThreadPool(2, new ThreadFactory() { // from class: ebhd
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            dhip dhipVar = ebhw.a;
            Thread thread = new Thread(runnable, String.format(Locale.US, "DnsClientWorker[%d]", Integer.valueOf(new AtomicInteger(0).getAndIncrement())));
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ebhh
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    dhja.j(th, ebhw.a, "unhandled exception executing DNS query", new Object[0]);
                }
            });
            return thread;
        }
    }));
    public static final ExecutorService c = Executors.newSingleThreadExecutor();

    public ebhw() {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ebia() { // from class: ebhq
            @Override // defpackage.ebia
            public final void a(ebhy ebhyVar) {
                dhip dhipVar = ebhw.a;
            }
        };
        this.g = new ebib() { // from class: ebhr
            @Override // defpackage.ebib
            public final void a(ebhz ebhzVar) {
                dhip dhipVar = ebhw.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
    }

    public static int a() {
        return ((Integer) m.orElse(53)).intValue();
    }

    public static ebic b() {
        return (ebic) n.orElse(ebic.UDP);
    }

    public final String toString() {
        List list = this.e;
        return "Builder[DnsTransportAddresses:" + this.d.toString() + ", Async:" + this.h + ", FallbackDnsTransportAddresses:" + list.toString() + ", LocalAddress:" + String.valueOf(this.i) + ", resolverTimeout:" + String.valueOf(this.j) + ", resolverRetries:" + String.valueOf(this.k) + "]";
    }

    public ebhw(ebhw ebhwVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        this.f = new ebia() { // from class: ebhq
            @Override // defpackage.ebia
            public final void a(ebhy ebhyVar) {
                dhip dhipVar = ebhw.a;
            }
        };
        this.g = new ebib() { // from class: ebhr
            @Override // defpackage.ebib
            public final void a(ebhz ebhzVar) {
                dhip dhipVar = ebhw.a;
            }
        };
        this.h = false;
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        arrayList.addAll(ebhwVar.d);
        arrayList2.addAll(ebhwVar.e);
        this.f = ebhwVar.f;
        this.g = ebhwVar.g;
        this.h = ebhwVar.h;
        this.i = ebhwVar.i.map(new Function() { // from class: ebhs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                dhip dhipVar = ebhw.a;
                return inetAddress;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.j = ebhwVar.j.map(new Function() { // from class: ebht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                dhip dhipVar = ebhw.a;
                return num;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.k = ebhwVar.k.map(new Function() { // from class: ebhu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer num = (Integer) obj;
                dhip dhipVar = ebhw.a;
                return num;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.l = ebhwVar.l.map(new Function() { // from class: ebhv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ebgz ebgzVar = (ebgz) obj;
                dhip dhipVar = ebhw.a;
                return ebgzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
