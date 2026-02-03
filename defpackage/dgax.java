package defpackage;

import android.telephony.ims.DelegateRegistrationState;
import android.telephony.ims.FeatureTagState;
import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.stub.DelegateConnectionStateCallback;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgax implements DelegateConnectionStateCallback {
    public static final /* synthetic */ int a = 0;
    private final dgbn b;
    private final dgbu c;
    private final String d;
    private final SettableFuture e;

    public dgax(dgbn dgbnVar, dgbu dgbuVar, String str, SettableFuture settableFuture) {
        this.b = dgbnVar;
        this.c = dgbuVar;
        this.d = str;
        this.e = settableFuture;
    }

    public final void onConfigurationChanged(SipDelegateConfiguration sipDelegateConfiguration) {
        int i;
        String str = this.d;
        Object[] objArr = {str, Long.valueOf(sipDelegateConfiguration.getVersion())};
        dgbn dgbnVar = this.b;
        dhip dhipVar = dgbnVar.i;
        dhja.l(dhipVar, "ConnectionStateCallback[%s]#onConfigurationChanged, version: %d", objArr);
        if (dhja.v()) {
            ekgi ekgiVar = new ekgi();
            dhiz dhizVar = dhiz.GENERIC;
            ekgiVar.i("p_access_network_info_header", dhizVar.c(sipDelegateConfiguration.getSipPaniHeader()));
            ekgiVar.i("security_verify_header", dhizVar.c(Optional.ofNullable(sipDelegateConfiguration.getIpSecConfiguration()).map(new Function() { // from class: dgav
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((SipDelegateConfiguration.IpSecConfiguration) obj).getSipSecurityVerifyHeader();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse("")));
            ekgiVar.i("home_domain", Optional.ofNullable(sipDelegateConfiguration.getHomeDomain()).orElse(""));
            dhiz dhizVar2 = dhiz.USER_ID;
            ekgiVar.i("ue_public_user_id", dhizVar2.c(sipDelegateConfiguration.getPublicUserIdentifier()));
            dhiz dhizVar3 = dhiz.IP_ADDRESS;
            ekgiVar.i("server_default_ipaddress", dhizVar3.c(sipDelegateConfiguration.getSipServerAddress().getAddress().getHostAddress()));
            ekgiVar.i("server_default_port", Integer.valueOf(sipDelegateConfiguration.getSipServerAddress().getPort()));
            ekgiVar.i("ue_default_ipaddress", dhizVar3.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress()));
            ekgiVar.i("ue_default_port", Integer.valueOf(sipDelegateConfiguration.getLocalAddress().getPort()));
            ekgiVar.i("p_associated_uri_header", dhiz.URI_SIP.c(sipDelegateConfiguration.getSipAssociatedUriHeader()));
            ekgiVar.i("service_route_header", dhizVar3.c(sipDelegateConfiguration.getSipServiceRouteHeader()));
            ekgiVar.i("sip_instance", ejwk.b(dgbnVar.G));
            ekgiVar.i("uri_user_part", dhizVar2.c(ejwk.b(sipDelegateConfiguration.getSipContactUserParameter())));
            dhja.d(dhipVar, "SipDelegateConfiguration changed: %s", Collection.EL.stream(ekgiVar.c().entrySet()).map(new Function() { // from class: dgaw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i2 = dgax.a;
                    return String.format("%s: %s", entry.getKey(), String.valueOf(entry.getValue()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.joining("\n")));
        }
        if (ejwk.c(sipDelegateConfiguration.getImei())) {
            dhja.h(dhipVar, "Invalid SipDelegateConfiguration with an empty IMEI", new Object[0]);
            i = 4;
        } else if (ejwk.c(sipDelegateConfiguration.getSipContactUserParameter())) {
            dhja.h(dhipVar, "Invalid SipDelegateConfiguration with an empty Contact Username", new Object[0]);
            i = 5;
        } else if (ejwk.c(sipDelegateConfiguration.getLocalAddress().getAddress().getHostAddress())) {
            dhja.h(dhipVar, "Invalid SipDelegateConfiguration with an empty HostAddress", new Object[0]);
            i = 6;
        } else {
            i = 2;
        }
        if (((Boolean) dgbn.d.a()).booleanValue()) {
            dgbu dgbuVar = this.c;
            String strA = dgbnVar.A();
            long version = sipDelegateConfiguration.getVersion();
            ewis ewisVar = (ewis) ewit.a.createBuilder();
            ewisVar.copyOnWrite();
            ewit ewitVar = (ewit) ewisVar.instance;
            strA.getClass();
            ewitVar.b |= 2;
            ewitVar.d = strA;
            ewisVar.copyOnWrite();
            ewit ewitVar2 = (ewit) ewisVar.instance;
            str.getClass();
            ewitVar2.b |= 1;
            ewitVar2.c = str;
            ewii ewiiVar = (ewii) ewik.a.createBuilder();
            ewiiVar.copyOnWrite();
            ewik ewikVar = (ewik) ewiiVar.instance;
            ewikVar.b |= 1;
            ewikVar.c = version;
            ewiiVar.copyOnWrite();
            ewik ewikVar2 = (ewik) ewiiVar.instance;
            ewikVar2.d = i - 1;
            ewikVar2.b |= 2;
            ewisVar.copyOnWrite();
            ewit ewitVar3 = (ewit) ewisVar.instance;
            ewik ewikVar3 = (ewik) ewiiVar.build();
            ewikVar3.getClass();
            ewitVar3.f = ewikVar3;
            ewitVar3.b |= 8;
            dgbuVar.b((ewit) ewisVar.build());
        }
        if (i != 2) {
            dhja.h(dhipVar, "Invalid SipDelegateConfiguration. state=%d", Integer.valueOf(i - 1));
        } else {
            dgbnVar.s(2, sipDelegateConfiguration);
        }
    }

    public final void onCreated(SipDelegateConnection sipDelegateConnection) {
        String str = this.d;
        dgbn dgbnVar = this.b;
        dhja.d(dgbnVar.i, "ConnectionStateCallback[%s]#onCreated", str);
        if (((Boolean) dgbn.d.a()).booleanValue()) {
            dgbu dgbuVar = this.c;
            String strA = dgbnVar.A();
            ewis ewisVar = (ewis) ewit.a.createBuilder();
            ewisVar.copyOnWrite();
            ewit ewitVar = (ewit) ewisVar.instance;
            strA.getClass();
            ewitVar.b |= 2;
            ewitVar.d = strA;
            ewisVar.copyOnWrite();
            ewit ewitVar2 = (ewit) ewisVar.instance;
            str.getClass();
            ewitVar2.b |= 1;
            ewitVar2.c = str;
            ewil ewilVar = (ewil) ewin.a.createBuilder();
            ewilVar.copyOnWrite();
            ewin ewinVar = (ewin) ewilVar.instance;
            ewinVar.d = 2;
            ewinVar.b |= 2;
            ewisVar.copyOnWrite();
            ewit ewitVar3 = (ewit) ewisVar.instance;
            ewin ewinVar2 = (ewin) ewilVar.build();
            ewinVar2.getClass();
            ewitVar3.i = ewinVar2;
            ewitVar3.b |= 64;
            dgbuVar.b((ewit) ewisVar.build());
        }
        dgbnVar.s(1, sipDelegateConnection);
    }

    public final void onDestroyed(int i) {
        String str = this.d;
        Integer numValueOf = Integer.valueOf(i);
        int i2 = dgam.a;
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "SIP_DELEGATE_DESTROY_REASON_UNKNOWN" : "SIP_DELEGATE_DESTROY_REASON_SUBSCRIPTION_TORN_DOWN" : "SIP_DELEGATE_DESTROY_REASON_USER_DISABLED_RCS" : "SIP_DELEGATE_DESTROY_REASON_REQUESTED_BY_APP" : "SIP_DELEGATE_DESTROY_REASON_SERVICE_DEAD";
        dgbn dgbnVar = this.b;
        dhja.l(dgbnVar.i, "ConnectionStateCallback[%s]#onDestroyed: code: %d, name: %s}", str, numValueOf, str2);
        if (((Boolean) dgbn.d.a()).booleanValue()) {
            dgbu dgbuVar = this.c;
            String strA = dgbnVar.A();
            ewis ewisVar = (ewis) ewit.a.createBuilder();
            ewisVar.copyOnWrite();
            ewit ewitVar = (ewit) ewisVar.instance;
            strA.getClass();
            ewitVar.b |= 2;
            ewitVar.d = strA;
            ewisVar.copyOnWrite();
            ewit ewitVar2 = (ewit) ewisVar.instance;
            str.getClass();
            ewitVar2.b |= 1;
            ewitVar2.c = str;
            ewio ewioVar = (ewio) ewip.a.createBuilder();
            ewioVar.copyOnWrite();
            ewip ewipVar = (ewip) ewioVar.instance;
            ewipVar.b = 1 | ewipVar.b;
            ewipVar.c = i;
            ewisVar.copyOnWrite();
            ewit ewitVar3 = (ewit) ewisVar.instance;
            ewip ewipVar2 = (ewip) ewioVar.build();
            ewipVar2.getClass();
            ewitVar3.g = ewipVar2;
            ewitVar3.b |= 16;
            dgbuVar.b((ewit) ewisVar.build());
        }
        this.e.set(dgbnVar.D);
        if (i != 2) {
            dgbnVar.r(8, i);
        }
    }

    public final void onFeatureTagStatusChanged(DelegateRegistrationState delegateRegistrationState, Set set) {
        int i;
        ekhx ekhxVarO = craf.f ? ekhx.o(delegateRegistrationState.getRegisteringFeatureTags()) : ekon.a;
        ekhx ekhxVarO2 = ekhx.o(delegateRegistrationState.getRegisteredFeatureTags());
        Stream map = Collection.EL.stream(set).map(new Function() { // from class: dgac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Collector collector = ekcv.b;
        ekhx ekhxVar = (ekhx) map.collect(collector);
        ekhx ekhxVar2 = (ekhx) Collection.EL.stream(delegateRegistrationState.getDeregisteredFeatureTags()).map(new Function() { // from class: dgac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
        ekhx ekhxVar3 = (ekhx) Collection.EL.stream(delegateRegistrationState.getDeregisteringFeatureTags()).map(new Function() { // from class: dgac
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((FeatureTagState) obj).getFeatureTag();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
        dgbn dgbnVar = this.b;
        String str = this.d;
        dhip dhipVar = dgbnVar.i;
        dhja.l(dhipVar, "ConnectionStateCallback[%s]#onFeatureTagStatusChanged: registering=[%s], registered=[%s], deregistering=[%s], deregistered=[%s], denied=[%s]", str, ekhxVarO, ekhxVarO2, ekhxVar3, ekhxVar2, ekhxVar);
        if (((Boolean) dgbn.d.a()).booleanValue()) {
            dgbu dgbuVar = this.c;
            String strA = dgbnVar.A();
            ekhx ekhxVar4 = ((Boolean) dgbn.h.a()).booleanValue() ? ekhxVarO : ekon.a;
            final ewiq ewiqVar = (ewiq) ewir.a.createBuilder();
            i = 1;
            Collection.EL.stream(ekhxVarO2).forEach(new Consumer() { // from class: dgbp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ewgp ewgpVarA = dgam.a((String) obj);
                    ewiq ewiqVar2 = ewiqVar;
                    ewiqVar2.copyOnWrite();
                    ewir ewirVar = (ewir) ewiqVar2.instance;
                    ewir ewirVar2 = ewir.a;
                    ewgpVarA.getClass();
                    evsx evsxVar = ewirVar.b;
                    if (!evsxVar.c()) {
                        ewirVar.b = evsn.mutableCopy(evsxVar);
                    }
                    ewirVar.b.h(ewgpVarA.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(ekhxVar2).forEach(new Consumer() { // from class: dgbq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ewgp ewgpVarA = dgam.a((String) obj);
                    ewiq ewiqVar2 = ewiqVar;
                    ewiqVar2.copyOnWrite();
                    ewir ewirVar = (ewir) ewiqVar2.instance;
                    ewir ewirVar2 = ewir.a;
                    ewgpVarA.getClass();
                    evsx evsxVar = ewirVar.c;
                    if (!evsxVar.c()) {
                        ewirVar.c = evsn.mutableCopy(evsxVar);
                    }
                    ewirVar.c.h(ewgpVarA.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(ekhxVar).forEach(new Consumer() { // from class: dgbr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ewgp ewgpVarA = dgam.a((String) obj);
                    ewiq ewiqVar2 = ewiqVar;
                    ewiqVar2.copyOnWrite();
                    ewir ewirVar = (ewir) ewiqVar2.instance;
                    ewir ewirVar2 = ewir.a;
                    ewgpVarA.getClass();
                    evsx evsxVar = ewirVar.d;
                    if (!evsxVar.c()) {
                        ewirVar.d = evsn.mutableCopy(evsxVar);
                    }
                    ewirVar.d.h(ewgpVarA.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(ekhxVar4).forEach(new Consumer() { // from class: dgbs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ewgp ewgpVarA = dgam.a((String) obj);
                    ewiq ewiqVar2 = ewiqVar;
                    ewiqVar2.copyOnWrite();
                    ewir ewirVar = (ewir) ewiqVar2.instance;
                    ewir ewirVar2 = ewir.a;
                    ewgpVarA.getClass();
                    evsx evsxVar = ewirVar.e;
                    if (!evsxVar.c()) {
                        ewirVar.e = evsn.mutableCopy(evsxVar);
                    }
                    ewirVar.e.h(ewgpVarA.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Collection.EL.stream(ekhxVar3).forEach(new Consumer() { // from class: dgbt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ewgp ewgpVarA = dgam.a((String) obj);
                    ewiq ewiqVar2 = ewiqVar;
                    ewiqVar2.copyOnWrite();
                    ewir ewirVar = (ewir) ewiqVar2.instance;
                    ewir ewirVar2 = ewir.a;
                    ewgpVarA.getClass();
                    evsx evsxVar = ewirVar.f;
                    if (!evsxVar.c()) {
                        ewirVar.f = evsn.mutableCopy(evsxVar);
                    }
                    ewirVar.f.h(ewgpVarA.z);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ewis ewisVar = (ewis) ewit.a.createBuilder();
            ewisVar.copyOnWrite();
            ewit ewitVar = (ewit) ewisVar.instance;
            strA.getClass();
            ewitVar.b |= 2;
            ewitVar.d = strA;
            ewisVar.copyOnWrite();
            ewit ewitVar2 = (ewit) ewisVar.instance;
            str.getClass();
            ewitVar2.b |= 1;
            ewitVar2.c = str;
            ewisVar.copyOnWrite();
            ewit ewitVar3 = (ewit) ewisVar.instance;
            ewir ewirVar = (ewir) ewiqVar.build();
            ewirVar.getClass();
            ewitVar3.e = ewirVar;
            ewitVar3.b |= 4;
            dgbuVar.b((ewit) ewisVar.build());
        } else {
            i = 1;
        }
        boolean zContainsAll = ekhxVarO2.containsAll(dgbnVar.y());
        boolean zContainsAll2 = ekhxVarO2.containsAll(dgbnVar.x());
        boolean zIsEmpty = ekhxVar.isEmpty();
        boolean zIsEmpty2 = ekhxVarO.isEmpty();
        boolean zIsEmpty3 = ekhxVar3.isEmpty();
        if (zContainsAll) {
            if (!zContainsAll2) {
                dhja.r(dhipVar, "transitioning to REGISTERED state with pending unregistered feature tags", new Object[0]);
            }
            dgbnVar.s(5, delegateRegistrationState);
            return;
        }
        if (((Boolean) dgbn.h.a()).booleanValue() && !zIsEmpty2) {
            Object[] objArr = new Object[i];
            objArr[0] = ekhxVarO;
            dhja.l(dhipVar, "#onFeatureTagStatusChange still awaiting required feature tag registrations: [%s]", objArr);
        } else if (!zIsEmpty) {
            dhja.r(dhipVar, "#onFeatureTagStatusChanged missing required feature tags, registration failed", new Object[0]);
            dgbnVar.q(7);
        } else if (!zIsEmpty3) {
            dhja.l(dhipVar, "#onFeatureTagStatusChanged deregistering feature tags are ignored, waiting until feature tags become deregistered for further processing", new Object[0]);
        } else {
            dhja.r(dhipVar, "#onFeatureTagStatusChanged missing required feature tags, registration deactivated", new Object[0]);
            dgbnVar.q(6);
        }
    }
}
