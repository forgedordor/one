package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.RouteInfo;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgco extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {0, 1, 4};
    public final dgfe a;
    private final dhip d;
    private NetworkCapabilities e;
    private dfzs f;
    private final Executor g;
    private final dhkr h;
    private boolean i = false;

    public dgco(Executor executor, dgfe dgfeVar, dhkr dhkrVar, dhip dhipVar) {
        this.g = executor;
        this.a = dgfeVar;
        this.h = dhkrVar;
        this.d = dhipVar;
    }

    private final Optional b(Network network, NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
        String interfaceName = linkProperties.getInterfaceName();
        if (interfaceName == null) {
            dhja.r(this.d, "Null interface name in LinkProperties", new Object[0]);
            return Optional.empty();
        }
        if (linkProperties.getLinkAddresses().isEmpty()) {
            dhja.r(this.d, "LinkProperties(%s) has an empty IP address.", interfaceName);
            return Optional.empty();
        }
        if (network == null) {
            throw new NullPointerException("Null network");
        }
        if (networkCapabilities == null) {
            throw new NullPointerException("Null networkCapabilities");
        }
        ekgb ekgbVarN = ekgb.n((List) Collection.EL.stream(linkProperties.getLinkAddresses()).map(new Function() { // from class: dgcn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((LinkAddress) obj).getAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
        ekgb ekgbVarN2 = ekgb.n(linkProperties.getDnsServers());
        if (ekgbVarN == null || ekgbVarN2 == null) {
            StringBuilder sb = new StringBuilder();
            if (ekgbVarN == null) {
                sb.append(" ipAddresses");
            }
            if (ekgbVarN2 == null) {
                sb.append(" dnsServers");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        dfzo dfzoVar = new dfzo(ekgbVarN, ekgbVarN2, network, networkCapabilities, interfaceName);
        dhip dhipVar = this.d;
        Object objR = !((Boolean) dfog.o().a.ai.a()).booleanValue() ? ekgb.r("link property logging not enabled") : (List) Collection.EL.stream(linkProperties.getRoutes()).map(new Function() { // from class: dgcm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                RouteInfo routeInfo = (RouteInfo) obj;
                int i = dgco.b;
                return String.format("ip_prefix:[%s], is_default:[%s]", routeInfo.getDestination(), Boolean.valueOf(routeInfo.isDefaultRoute()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        dhiz dhizVar = dhiz.GENERIC;
        dhja.l(dhipVar, "buildNetworkInterface for Network:%s, ip routes:[%s], other debug properties: NetworkInterface: %s, LinkProperties: %s", network, objR, dhizVar.c(dfzoVar), dhizVar.c(linkProperties));
        return Optional.of(dfzoVar);
    }

    public final void a(final dfzs dfzsVar) {
        dfzs dfzsVar2 = this.f;
        this.f = dfzsVar;
        if (dfzsVar2 != null) {
            NetworkCapabilities networkCapabilitiesB = dfzsVar2.b();
            NetworkCapabilities networkCapabilitiesB2 = dfzsVar.b();
            int[] iArr = c;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                int i2 = iArr[i];
                if (networkCapabilitiesB.hasTransport(i2) && !networkCapabilitiesB2.hasTransport(i2)) {
                    dhip dhipVar = this.d;
                    dhja.d(dhipVar, "Default transport changed to %d.", Integer.valueOf(i2));
                    dhja.l(dhipVar, "Transport type has changed. Send disconnection to the previous transport.", new Object[0]);
                    Executor executor = this.g;
                    dgfe dgfeVar = this.a;
                    dgfeVar.getClass();
                    executor.execute(new dgck(dgfeVar));
                    break;
                }
                i++;
            }
        }
        this.g.execute(new Runnable() { // from class: dgcl
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a.b.s(20, dfzsVar);
            }
        });
        this.i = false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dhja.r(this.d, "Network:%s", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        LinkProperties linkPropertiesA;
        dhip dhipVar = this.d;
        dhja.d(dhipVar, "Network:%s NetworkCapabilities:%s", network, networkCapabilities);
        if (!networkCapabilities.hasCapability(16)) {
            dhja.r(dhipVar, "Network interface is not validated.", new Object[0]);
            return;
        }
        this.e = networkCapabilities;
        try {
            linkPropertiesA = this.h.a(network);
        } catch (dhkf e) {
            dhja.j(e, this.d, "Failed to get LinkProperties.", new Object[0]);
            linkPropertiesA = null;
        }
        if (linkPropertiesA != null) {
            Optional optionalB = b(network, networkCapabilities, linkPropertiesA);
            if (optionalB.isPresent()) {
                a((dfzs) optionalB.get());
                return;
            }
        }
        dhja.d(this.d, "Waiting for LinkProperties.", new Object[0]);
        this.i = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        NetworkCapabilities networkCapabilities = this.e;
        if (networkCapabilities == null) {
            dhja.r(this.d, "onCapabilitiesChanged() is not called. Ignore onLinkPropertiesChanged().", new Object[0]);
            return;
        }
        dhja.d(this.d, "Network:%s LinkProperties:%s", network, dhiz.GENERIC.c(linkProperties));
        if (this.i) {
            b(network, networkCapabilities, linkProperties).ifPresent(new Consumer() { // from class: dgci
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.a((dfzs) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dhja.r(this.d, "Network is lost:%s", network);
        dgfe dgfeVar = this.a;
        dgfeVar.getClass();
        this.g.execute(new dgck(dgfeVar));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        dhja.r(this.d, "NetworkRequest failure.", new Object[0]);
        final dgfe dgfeVar = this.a;
        dgfeVar.getClass();
        this.g.execute(new Runnable() { // from class: dgcj
            @Override // java.lang.Runnable
            public final void run() {
                dgfeVar.a.b.q(22);
            }
        });
    }
}
