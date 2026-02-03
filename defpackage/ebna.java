package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebna implements ebnc {
    public static final dhip a = new dhip("BasicDiscoveryStrategyImpl");
    private static final ekgb c;
    public final ebni b;
    private final ebid d;

    static {
        int i = ekgb.d;
        c = ekoe.a;
    }

    public ebna(ebid ebidVar, ebni ebniVar) {
        this.d = ebidVar;
        this.b = ebniVar;
    }

    public static String a(String str) {
        return (!TextUtils.isEmpty(str) && str.endsWith(".")) ? str.substring(0, str.length() - 1) : str;
    }

    private static List c(ListenableFuture listenableFuture, String str) {
        try {
            return (List) listenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            dhja.j(e, a, "error processing %s records", str);
            return c;
        }
    }

    @Override // defpackage.ebnc
    public final List b(String str) {
        ArrayList arrayList = new ArrayList();
        ebid ebidVar = this.d;
        for (final fgyk fgykVar : c(ebidVar.b(str), "NAPTR")) {
            for (final fgzq fgzqVar : c(ebidVar.c(fgykVar.c.toString()), "SRV")) {
                String strA = a(fgzqVar.d.toString());
                if (eomh.b(strA) && (eomh.a(strA) instanceof Inet4Address)) {
                    arrayList.add(new ebnb(fgykVar, fgzqVar, strA, strA, this.b));
                } else {
                    arrayList.addAll((Collection) Collection.EL.stream(c(ebidVar.a(strA), "A_or_AAAA")).filter(new Predicate() { // from class: ebmx
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo538negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            InetAddress inetAddress = (InetAddress) obj;
                            boolean z = inetAddress != null && (!((ebms) this.a.b).a || (inetAddress instanceof Inet4Address));
                            if (!z) {
                                dhja.r(ebna.a, "dropping InetAddress from SIP discovery: [%s]", inetAddress == null ? "null" : "IPv6 result in force IPv4 mode");
                            }
                            return z;
                        }
                    }).map(new Function() { // from class: ebmy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            InetAddress inetAddress = (InetAddress) obj;
                            return new ebnb(fgykVar, fgzqVar, inetAddress.getHostAddress(), ebna.a(inetAddress.getHostName()), this.a.b);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toList()));
                }
            }
        }
        try {
            Collections.sort(arrayList);
        } catch (IllegalArgumentException e) {
            dhja.j(new ebmz(e), a, "error sorting records: %s", arrayList);
        }
        dhja.d(a, "Resolved %d NAPTR records, to %d SRV records, to %d IP addresses, DNS discovery results: %s", Long.valueOf(Collection.EL.stream(arrayList).map(new Function() { // from class: ebmu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = ebna.a;
                return ((ebnb) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).distinct().count()), Long.valueOf(Collection.EL.stream(arrayList).map(new Function() { // from class: ebmv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dhip dhipVar = ebna.a;
                return ((ebnb) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).distinct().count()), Long.valueOf(arrayList.size()), Collection.EL.stream(arrayList).map(new Function() { // from class: ebmw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Objects.toString((ebnb) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(";")));
        return ekgb.n(arrayList);
    }
}
