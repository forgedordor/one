package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Message;
import android.os.PowerManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgef extends dgdq {
    final /* synthetic */ dgfg b;
    private PowerManager.WakeLock c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgef(dgfg dgfgVar) {
        super(dgfgVar);
        this.b = dgfgVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "ConnectingState";
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        if (dfpo.a() > 0) {
            PowerManager.WakeLock wakeLockNewWakeLock = this.b.S.newWakeLock(1, "rcs:ConnectingState");
            this.c = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire((dfpo.a() + 1) * 1000);
        }
        dgfg dgfgVar = this.b;
        dgfgVar.F(new Runnable() { // from class: dgdr
            @Override // java.lang.Runnable
            public final void run() {
                dgfg dgfgVar2 = this.a.b;
                if (dgfgVar2.l || dgfgVar2.w != null) {
                    dgfgVar2.q(10);
                } else {
                    dhja.r(dgfgVar2.m, "ImsNetworkInterface is not selected.", new Object[0]);
                    dgfgVar2.w(dgfgVar2.Y);
                }
            }
        });
        if (!((Boolean) dgfg.j.a()).booleanValue() || dfpo.a() <= 0) {
            return;
        }
        dgfgVar.t(18, dfpo.a() * 1200);
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final void c() {
        PowerManager.WakeLock wakeLock = this.c;
        if (wakeLock != null) {
            try {
                wakeLock.release();
            } catch (RuntimeException unused) {
                dhja.c("Wakelock is already released.", new Object[0]);
            }
        }
        if (((Boolean) dgfg.j.a()).booleanValue()) {
            this.b.p(18);
        }
        super.c();
    }

    @Override // defpackage.dgdq, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        eblf eblfVarX;
        int i = message.what;
        if (i == 8) {
            dgfg dgfgVar = this.b;
            dhja.l(dgfgVar.m, "Disconnecting socket.", new Object[0]);
            dgfgVar.N(message.obj);
            dgfgVar.w(dgfgVar.ah);
            return true;
        }
        if (i == 10) {
            dgfg dgfgVar2 = this.b;
            if (dgfgVar2.l) {
                dgfg dgfgVar3 = this.b;
                final dfzs dfzsVar = dgfgVar3.B;
                if (dfzsVar != null) {
                    dhip dhipVar = dgfgVar3.m;
                    dhja.d(dhipVar, "Creating SIP transport: NetworkInterface: %s", dhiz.GENERIC.c(dfzsVar));
                    Optional optionalFindFirst = dfog.P() ? Collection.EL.stream(dfzsVar.d()).filter(new Predicate() { // from class: dgeb
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
                            return ((InetAddress) obj) instanceof Inet6Address;
                        }
                    }).findFirst() : Collection.EL.stream(dfzsVar.d()).filter(new Predicate() { // from class: dgec
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
                            return ((InetAddress) obj) instanceof Inet4Address;
                        }
                    }).findFirst();
                    if (optionalFindFirst.isEmpty()) {
                        optionalFindFirst = Collection.EL.stream(dfzsVar.d()).findFirst();
                    }
                    final String hostAddress = optionalFindFirst.isPresent() ? ((InetAddress) optionalFindFirst.get()).getHostAddress() : "";
                    if (ejwk.c(hostAddress)) {
                        dhja.r(dhipVar, "Empty IP address.", new Object[0]);
                        dgfgVar3.w(dgfgVar3.Y);
                    } else {
                        dhja.p(dhipVar, "Selected local IP address: %s", dhiz.IP_ADDRESS.c(hostAddress));
                        dgis dgisVar = dgfgVar3.I;
                        final ebmc ebmcVar = new ebmc(dgisVar.f(), dgisVar.g(), dgisVar.h());
                        final long millis = TimeUnit.SECONDS.toMillis(dfpo.a());
                        Callable callable = new Callable() { // from class: dged
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws IOException {
                                dgef dgefVar = this.a;
                                dfzs dfzsVar2 = dfzsVar;
                                String str = hostAddress;
                                try {
                                    Network networkA = dfzsVar2.a();
                                    ebmr ebmrVarA = dfzt.a(dfzsVar2, dgefVar.b.I);
                                    NetworkCapabilities networkCapabilitiesB = dfzsVar2.b();
                                    return dgefVar.g(networkA, ebmrVarA, networkCapabilitiesB.hasTransport(0) ? "Mobile" : networkCapabilitiesB.hasTransport(1) ? "WiFi" : networkCapabilitiesB.hasTransport(4) ? "VPN" : "Unknown", str, (List) Collection.EL.stream(dfzsVar2.c()).map(new Function() { // from class: dgea
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return ((InetAddress) obj).getHostAddress();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.toList()));
                                } catch (ebmn e) {
                                    throw new IOException("Failed to create a SIP transport.", e);
                                }
                            }
                        };
                        ScheduledExecutorService scheduledExecutorService = dgfgVar3.R;
                        ListenableFuture listenableFutureM = eork.m(callable, scheduledExecutorService);
                        if (millis > 0) {
                            eooh.f(eooh.f(((eoqt) eooq.f(eoqt.t(listenableFutureM), new ejvr() { // from class: dgee
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ebqv ebqvVar = (ebqv) obj;
                                    Object[] objArr = {ebqvVar, Long.valueOf(millis)};
                                    dgfg dgfgVar4 = this.a.b;
                                    dhja.l(dgfgVar4.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF within %d ms, sending MSG_CONNECTED_TO_SERVER", objArr);
                                    dgfgVar4.s(13, ebqvVar);
                                    return Optional.of(ebqvVar);
                                }
                            }, scheduledExecutorService)).u(millis, TimeUnit.MILLISECONDS, scheduledExecutorService), TimeoutException.class, new ejvr() { // from class: dgds
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    this.a.b.q(18);
                                    return Optional.empty();
                                }
                            }, scheduledExecutorService), IOException.class, new ejvr() { // from class: dgdt
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    IOException iOException = (IOException) obj;
                                    dhja.i(iOException, "Connection Failed.", new Object[0]);
                                    this.a.b.s(19, iOException);
                                    return Optional.empty();
                                }
                            }, scheduledExecutorService);
                        } else {
                            eooh.f(eooq.f(eoqt.t(listenableFutureM), new ejvr() { // from class: dgdu
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ebqv ebqvVar = (ebqv) obj;
                                    dgfg dgfgVar4 = this.a.b;
                                    dhja.l(dgfgVar4.m, "discoverSipServerWithNetworkInterface: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", ebqvVar);
                                    dgfgVar4.s(13, ebqvVar);
                                    return Optional.of(ebqvVar);
                                }
                            }, scheduledExecutorService), IOException.class, new ejvr() { // from class: dgdv
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    IOException iOException = (IOException) obj;
                                    dhja.i(iOException, "Connection Failed.", new Object[0]);
                                    this.a.b.s(19, iOException);
                                    return Optional.empty();
                                }
                            }, scheduledExecutorService);
                        }
                    }
                } else {
                    dhja.r(dgfgVar3.m, "Null NetworkInterface.", new Object[0]);
                    dgfgVar3.w(dgfgVar3.Y);
                }
            } else {
                dhja.d(dgfgVar2.m, "Creating SIP transport.", new Object[0]);
                final dfyu dfyuVar = dgfgVar2.w;
                if (dfyuVar == null) {
                    dhja.g("ImsNetworkInterface is not selected.", new Object[0]);
                    dgfgVar2.w(dgfgVar2.Y);
                } else {
                    dgis dgisVar2 = dgfgVar2.I;
                    final ebmc ebmcVar2 = new ebmc(dgisVar2.f(), dgisVar2.g(), dgisVar2.h());
                    final Network network = dfyuVar.g;
                    final String str = dfyuVar.e.a;
                    if (network == null) {
                        dhja.g("Failed to create SipTransport. Null Network.", new Object[0]);
                        dgfgVar2.w(dgfgVar2.ak);
                    } else if (str == null) {
                        dhja.g("Failed to create SipTransport. Null IP Address.", new Object[0]);
                        dgfgVar2.w(dgfgVar2.ak);
                    } else if (dfpo.a() > 0) {
                        final long millis2 = TimeUnit.SECONDS.toMillis(dfpo.a());
                        Callable callable2 = new Callable() { // from class: dgdz
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws IOException {
                                dgef dgefVar = this.a;
                                Network network2 = network;
                                dfyu dfyuVar2 = dfyuVar;
                                try {
                                    return dgefVar.g(network2, dfyuVar2.e(dgefVar.b.I), dfyuVar2.g(), str, dfyuVar2.h());
                                } catch (ebmn e) {
                                    throw new IOException("Failed to create a SIP transport.", e);
                                }
                            }
                        };
                        ScheduledExecutorService scheduledExecutorService2 = dgfgVar2.R;
                        eooh.f(eooh.f(((eoqt) eooq.f(eoqt.t(eork.m(callable2, scheduledExecutorService2)), new ejvr() { // from class: dgdw
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ebqv ebqvVar = (ebqv) obj;
                                dgfg dgfgVar4 = this.a.b;
                                dhja.l(dgfgVar4.m, "discoverSipServer: connected SIP transport[%s] to PCSCF, sending MSG_CONNECTED_TO_SERVER", ebqvVar);
                                dgfgVar4.s(13, ebqvVar);
                                return Optional.of(ebqvVar);
                            }
                        }, scheduledExecutorService2)).u(millis2, TimeUnit.MILLISECONDS, scheduledExecutorService2), TimeoutException.class, new ejvr() { // from class: dgdx
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                dhja.i((TimeoutException) obj, "Timed out connecting to PCSCF in %d ms", Long.valueOf(millis2));
                                this.a.b.q(18);
                                return Optional.empty();
                            }
                        }, scheduledExecutorService2), IOException.class, new ejvr() { // from class: dgdy
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                IOException iOException = (IOException) obj;
                                dhja.i(iOException, "Connection Failed.", new Object[0]);
                                this.a.b.s(19, iOException);
                                return Optional.empty();
                            }
                        }, scheduledExecutorService2);
                    } else {
                        try {
                            dgfgVar2.x = g(network, dfyuVar.e(dgisVar2), dfyuVar.g(), str, dfyuVar.h());
                            this.b.q(12);
                        } catch (ebmn | IllegalArgumentException e) {
                            dgfg dgfgVar4 = this.b;
                            dhja.j(e, dgfgVar4.m, "Failed to create a SIP transport.", new Object[0]);
                            dgfgVar4.w(dgfgVar4.ak);
                        }
                    }
                }
            }
        } else {
            if (i == 21) {
                dgfg dgfgVar5 = this.b;
                dhja.r(dgfgVar5.m, "Network is lost.", new Object[0]);
                dgfgVar5.O();
                dgfgVar5.w(dgfgVar5.ak);
                return true;
            }
            if (i == 12) {
                this.b.q(13);
                return true;
            }
            if (i != 13) {
                switch (i) {
                    case 17:
                        dgfg dgfgVar6 = this.b;
                        dgfgVar6.N(dezf.SIM_REMOVED);
                        dgfgVar6.w(dgfgVar6.ah);
                        return true;
                    case 18:
                        dhja.g("Connection Timeout.", new Object[0]);
                        dgfg dgfgVar7 = this.b;
                        dgfgVar7.w(dgfgVar7.ak);
                        return true;
                    case 19:
                        dgfg dgfgVar8 = this.b;
                        dgfgVar8.w(dgfgVar8.ak);
                        return true;
                    default:
                        return super.e(message);
                }
            }
            if (message.obj instanceof ebqv) {
                this.b.x = (ebqv) message.obj;
            }
            dgfg dgfgVar9 = this.b;
            ebqv ebqvVar = dgfgVar9.x;
            if (Objects.isNull(ebqvVar)) {
                dhja.g("Null SipTransport.", new Object[0]);
                dgfgVar9.w(dgfgVar9.ak);
            } else {
                if (((Boolean) dgfg.d.a()).booleanValue()) {
                    dgfgVar9.I();
                    dgfgVar9.A();
                }
                if (dgfgVar9.l) {
                    dfzs dfzsVar2 = dgfgVar9.B;
                    if (dfzsVar2 == null) {
                        dhja.g("NetworkInterface is not available.", new Object[0]);
                        dgfgVar9.w(dgfgVar9.Y);
                    } else {
                        eblfVarX = dgfgVar9.x(dfzt.a(dfzsVar2, dgfgVar9.I), ebqvVar, dgfgVar9.p);
                        dgfgVar9.t.a = eblfVarX;
                        dgfgVar9.K.a();
                        dgfgVar9.F = 600000;
                        dgfgVar9.w(dgfgVar9.aa);
                    }
                } else {
                    dfyu dfyuVar2 = dgfgVar9.w;
                    if (dfyuVar2 == null) {
                        dhja.g("ImsNetworkInterface is not selected.", new Object[0]);
                        dgfgVar9.w(dgfgVar9.Y);
                    } else {
                        eblfVarX = dgfgVar9.x(dfyuVar2.e(dgfgVar9.I), ebqvVar, dgfgVar9.p);
                        dgfgVar9.t.a = eblfVarX;
                        dgfgVar9.K.a();
                        dgfgVar9.F = 600000;
                        dgfgVar9.w(dgfgVar9.aa);
                    }
                }
            }
        }
        return true;
    }

    public final ebqv g(Network network, ebmr ebmrVar, String str, String str2, List list) {
        dgfg dgfgVar = this.b;
        dgis dgisVar = dgfgVar.I;
        ebqv ebqvVarA = dgfgVar.u.a(ebmrVar, network, str, str2, list, dgisVar.q(), dgisVar.c());
        ((ebrf) ebqvVarA).c = new dgfj(dgfgVar);
        return ebqvVarA;
    }
}
