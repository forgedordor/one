package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebgs implements ebid {
    public static final /* synthetic */ int c = 0;
    public final ebib b;
    private final List e;
    private final eosc f;
    private final fgwr g;
    private final fgzk h;
    private final ebia i;
    static final dfny a = dfnv.b("enable_dns_client_exception_logging");
    private static final eosc d = new eoqh();

    public ebgs(Optional optional, List list, ebia ebiaVar, ebib ebibVar, eosc eoscVar, ebgz ebgzVar, Optional optional2, Optional optional3) {
        ebiaVar.getClass();
        this.i = ebiaVar;
        ebibVar.getClass();
        this.b = ebibVar;
        list.getClass();
        this.e = (List) Collection.EL.stream(list).map(new Function() { // from class: ebgo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ebhx) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        eoscVar.getClass();
        this.f = eoscVar;
        this.g = ebgzVar.a;
        this.h = f(optional, list, optional2, optional3);
    }

    public static fgzk d(Optional optional, ebhx ebhxVar) {
        try {
            final fgzu fgzuVar = new fgzu(ebhxVar.d());
            fgzuVar.a = new InetSocketAddress(fgzuVar.a.getAddress(), ebhxVar.a());
            fgzuVar.c = ebhxVar.b().equals(ebic.TCP);
            optional.ifPresent(new Consumer() { // from class: ebgp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fgzuVar.b = new InetSocketAddress((InetAddress) obj, 0);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return fgzuVar;
        } catch (UnknownHostException e) {
            throw new RuntimeException("unknown DNS server initializing AsyncDnsClient", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.common.util.concurrent.ListenableFuture e(java.lang.String r9, final java.lang.Class r10) {
        /*
            r8 = this;
            int r0 = defpackage.ebif.a(r10)
            java.util.List r1 = r8.e
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L15
            int r9 = defpackage.ekgb.d
            ekgb r9 = defpackage.ekoe.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.i(r9)
            return r9
        L15:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            r3 = 0
            if (r2 == 0) goto L2c
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r10 = "Unable to lookup records for null target!"
            defpackage.dhja.q(r10, r9)
            int r9 = defpackage.ekgb.d
            ekgb r9 = defpackage.ekoe.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.i(r9)
            return r9
        L2c:
            ejwc r2 = new ejwc
            java.lang.String r4 = ","
            r2.<init>(r4)
            java.lang.String r2 = r2.b(r1)
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r9
            r6 = 1
            r5[r6] = r2
            java.lang.String r2 = "Resolving %s using name servers: %s"
            defpackage.dhja.k(r2, r5)
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            ebhy r1 = defpackage.ebif.b(r9, r10, r1)
            fgya r2 = new fgya     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r2.<init>(r9, r0)     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            fgwr r5 = r8.g     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r2.c = r5     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            fgzk r5 = r8.h     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r2.b = r5     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            ebip r5 = new ebip     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r5.<init>(r2)     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            ebia r2 = r8.i     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r2.a(r1)     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            eosc r2 = r8.f     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            ebgq r7 = new ebgq     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            r7.<init>()     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            com.google.common.util.concurrent.ListenableFuture r9 = r2.submit(r7)     // Catch: java.lang.NoClassDefFoundError -> L73 java.lang.ExceptionInInitializerError -> L75 java.lang.RuntimeException -> L77 defpackage.fhae -> L9f java.lang.ClassCastException -> Lcf
            return r9
        L73:
            r9 = move-exception
            goto L78
        L75:
            r9 = move-exception
            goto L78
        L77:
            r9 = move-exception
        L78:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = "Device internal error creating the DNS client."
            defpackage.dhja.s(r9, r0, r10)
            dfny r10 = defpackage.ebgs.a
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L96
            ebib r10 = r8.b
            ebhz r9 = defpackage.ebif.c(r1, r9)
            r10.a(r9)
        L96:
            int r9 = defpackage.ekgb.d
            ekgb r9 = defpackage.ekoe.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.i(r9)
            return r9
        L9f:
            r10 = move-exception
            java.lang.String r0 = defpackage.fhag.a(r0)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            r2[r6] = r9
            java.lang.String r9 = "Invalid %s lookup target: %s"
            defpackage.dhja.s(r10, r9, r2)
            dfny r9 = defpackage.ebgs.a
            java.lang.Object r9 = r9.a()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lc6
            ebib r9 = r8.b
            ebhz r10 = defpackage.ebif.c(r1, r10)
            r9.a(r10)
        Lc6:
            int r9 = defpackage.ekgb.d
            ekgb r9 = defpackage.ekoe.a
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.i(r9)
            return r9
        Lcf:
            r9 = move-exception
            dfny r10 = defpackage.ebgs.a
            java.lang.Object r10 = r10.a()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Le7
            ebib r10 = r8.b
            ebhz r0 = defpackage.ebif.c(r1, r9)
            r10.a(r0)
        Le7:
            com.google.common.util.concurrent.ListenableFuture r9 = defpackage.eork.h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebgs.e(java.lang.String, java.lang.Class):com.google.common.util.concurrent.ListenableFuture");
    }

    private static fgzk f(final Optional optional, List list, Optional optional2, Optional optional3) {
        try {
            final fgxk fgxkVar = new fgxk((fgzk[]) ((List) Collection.EL.stream(list).map(new Function() { // from class: ebgl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ebgs.d(optional, (ebhx) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())).toArray(new fgzk[0]));
            optional3.ifPresent(new Consumer() { // from class: ebgm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fgxkVar.b = ((Integer) obj).intValue();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional2.ifPresent(new Consumer() { // from class: ebgn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fgxkVar.b(((Integer) obj).intValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return fgxkVar;
        } catch (UnknownHostException e) {
            throw new ebgr(e);
        }
    }

    @Override // defpackage.ebid
    public final ListenableFuture a(String str) {
        final ListenableFuture listenableFutureE = e(str, fgwi.class);
        final ListenableFuture listenableFutureE2 = e(str, fgwe.class);
        return eork.b(listenableFutureE, listenableFutureE2).a(new Callable() { // from class: ebgi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ebgs.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) Collection.EL.stream((List) eork.q(listenableFutureE)).map(new Function() { // from class: ebgj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((fgwi) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList()));
                arrayList.addAll((java.util.Collection) Collection.EL.stream((List) eork.q(listenableFutureE2)).map(new Function() { // from class: ebgk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((fgwe) obj).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toList()));
                return arrayList;
            }
        }, d);
    }

    @Override // defpackage.ebid
    public final ListenableFuture b(String str) {
        return e(str, fgyk.class);
    }

    @Override // defpackage.ebid
    public final ListenableFuture c(String str) {
        return e(str, fgzq.class);
    }
}
