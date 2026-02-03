package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.http.conn.util.InetAddressUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnh implements ebnc {
    private static final ekgb d;
    public final ebid a;
    public final ebmr b;
    public final ebni c;
    private final boolean e;

    static {
        int i = ekgb.d;
        d = ekoe.a;
    }

    public ebnh(ebid ebidVar, ebni ebniVar) {
        this.a = ebidVar;
        ebms ebmsVar = (ebms) ebniVar;
        this.e = ebmsVar.b;
        this.b = ebmsVar.c;
        this.c = ebniVar;
    }

    static final InetAddress c(InetAddress[] inetAddressArr, boolean z) {
        for (InetAddress inetAddress : inetAddressArr) {
            if ((true != z ? Inet4Address.class : Inet6Address.class).isInstance(inetAddress)) {
                return inetAddress;
            }
        }
        return null;
    }

    public final ebng a(fgzq fgzqVar) throws UnknownHostException {
        ebng ebngVar = new ebng();
        ebngVar.a = fgzqVar;
        String string = fgzqVar.d.toString();
        if (!TextUtils.isEmpty(string) && string.endsWith(".")) {
            string = string.substring(0, string.length() - 1);
        }
        try {
            if (InetAddressUtils.isIPv4Address(string)) {
                ebngVar.b = string;
                return ebngVar;
            }
            ebngVar.c = string;
            try {
                InetAddress[] inetAddressArr = (InetAddress[]) ((List) this.a.a(string).get()).toArray(new InetAddress[0]);
                boolean z = this.e;
                InetAddress inetAddressC = c(inetAddressArr, z);
                if (inetAddressC == null) {
                    inetAddressC = c(inetAddressArr, !z);
                }
                if (inetAddressC == null) {
                    dhja.q("Resolved address empty, skipping SRV record: %s", fgzqVar);
                    return null;
                }
                dhja.c("Resolved %s to %s", string, inetAddressC);
                ebngVar.b = inetAddressC.getHostAddress();
                return ebngVar;
            } catch (ExecutionException e) {
                if (e.getCause() instanceof UnknownHostException) {
                    throw ((UnknownHostException) e.getCause());
                }
                throw new RuntimeException(e.getCause());
            }
        } catch (InterruptedException | UnknownHostException unused) {
            dhja.q("Unknown host exception, skipping SRV record: %s", fgzqVar);
            return null;
        }
    }

    @Override // defpackage.ebnc
    public final List b(final String str) throws Exception {
        Object objCall;
        Object objCall2;
        Callable callable = new Callable() { // from class: ebnd
            @Override // java.util.concurrent.Callable
            public final Object call() throws UnknownHostException {
                ebmr ebmrVar;
                String str2 = str;
                dhja.c("LegacyDiscoveryStrategy: looking up proxy %s", str2);
                ebnh ebnhVar = this.a;
                ebid ebidVar = ebnhVar.a;
                List<fgyk> list = (List) ebidVar.b(str2).get();
                ArrayList arrayList = new ArrayList();
                for (fgyk fgykVar : list) {
                    if (fgykVar == null) {
                        dhja.q("Skipping invalid NAPTR null record", new Object[0]);
                    } else {
                        arrayList.add(fgykVar.c.toString());
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List<fgzq> list2 = (List) ebidVar.c((String) it.next()).get();
                    ArrayList<ebng> arrayList3 = new ArrayList();
                    for (fgzq fgzqVar : list2) {
                        if (fgzqVar == null) {
                            dhja.q("Skipping invalid SRV null record", new Object[0]);
                        } else {
                            ebng ebngVarA = ebnhVar.a(fgzqVar);
                            if (ebngVarA != null) {
                                arrayList3.add(ebngVarA);
                            }
                        }
                    }
                    for (ebng ebngVar : arrayList3) {
                        ebngVar.getClass();
                        fgzq fgzqVar2 = ebngVar.a;
                        fgzqVar2.getClass();
                        String string = fgzqVar2.f.toString();
                        if (string.startsWith("_sip._udp")) {
                            ebmrVar = ebmr.UDP;
                        } else if (string.startsWith("_sip._tcp")) {
                            ebmrVar = ebmr.TCP;
                        } else if (string.startsWith("_sips._tcp")) {
                            ebmrVar = ebmr.TLS;
                        } else {
                            dhja.q("NAPTR response contains unknown protocol: %s", string);
                            ebmrVar = null;
                        }
                        if (ebmrVar == null) {
                            ebmrVar = ebmr.TCP;
                        }
                        arrayList2.add(new ebmt(ebngVar.b, ebngVar.c, fgzqVar2.c, ebmrVar));
                    }
                }
                return arrayList2;
            }
        };
        ebid ebidVar = this.a;
        try {
            if (ebidVar instanceof ebim) {
                ((ebim) ebidVar).d();
                synchronized (ebim.class) {
                    objCall = callable.call();
                }
                objCall2 = objCall;
            } else {
                dhja.q("expected LegacyDnsClientImpl, but using %s", ebidVar.getClass().getName());
                objCall2 = callable.call();
            }
            final List list = (List) objCall2;
            ejwi ejwiVarJ = list.isEmpty() ? ejud.a : ejwi.j((ebnj) Collection.EL.stream(list).filter(new Predicate() { // from class: ebne
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
                    return this.a.b.equals(((ebnj) obj).b());
                }
            }).findFirst().orElseGet(new Supplier() { // from class: ebnf
                @Override // java.util.function.Supplier
                public final Object get() {
                    ebnh ebnhVar = this.a;
                    ejwi ejwiVar = ((ebms) ebnhVar.c).d;
                    ejwl.m(ejwiVar.g(), "failed to set log prefix for LegacyDiscoveryStrategy");
                    dhja.r((dhip) ejwiVar.c(), "Unable to find proxy for protocol %s. Returning first found proxy to attempt fallback.", ebnhVar.b);
                    return (ebnj) list.get(0);
                }
            }));
            return ejwiVarJ.g() ? ekgb.r(ejwiVarJ.c()) : d;
        } catch (Exception e) {
            dhja.i(e, "Error resolving DNS in doWithLegacyLock", new Object[0]);
            throw new RuntimeException(e);
        }
    }
}
