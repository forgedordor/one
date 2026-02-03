package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpnx {
    public static final eksp a = eksp.c("BugleCmsBoxDetails");
    public static final evrw b;
    public static final eqmi c;
    static final eqmw d;
    public final aurx e;
    public final cpmc f;
    public final ains g;
    public final aukz h;
    public final eosc i;
    private final eosc j;

    static {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("box_devices");
        b = (evrw) evrvVar.build();
        eqmh eqmhVar = (eqmh) eqmi.a.createBuilder();
        eqmhVar.copyOnWrite();
        ((eqmi) eqmhVar.instance).d = true;
        eqmhVar.copyOnWrite();
        ((eqmi) eqmhVar.instance).e = true;
        c = (eqmi) eqmhVar.build();
        eqmv eqmvVar = (eqmv) eqmw.a.createBuilder();
        eqmvVar.copyOnWrite();
        ((eqmw) eqmvVar.instance).c = eqmu.a(5);
        eqmvVar.copyOnWrite();
        ((eqmw) eqmvVar.instance).b = "fake address";
        d = (eqmw) eqmvVar.build();
    }

    public cpnx(aurx aurxVar, cpmc cpmcVar, ains ainsVar, aukz aukzVar, eosc eoscVar, eosc eoscVar2) {
        this.e = aurxVar;
        this.f = cpmcVar;
        this.g = ainsVar;
        this.h = aukzVar;
        this.j = eoscVar;
        this.i = eoscVar2;
    }

    public static final eiju b() {
        return eijx.e(null);
    }

    public final eiju a() {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("box_devices");
        evrvVar.a("extended_detail");
        final eiju eijuVarK = this.f.k((evrw) evrvVar.build());
        final eiju eijuVarI = this.e.n().i(new eooz() { // from class: cpnp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    eksl ekslVar = (eksl) cpnx.a.h();
                    ekslVar.X(bzmz.m, (String) optional.get());
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "getOrGenerateDeviceId", 319, "CmsBoxDetailsManager.java")).q("Retrieved the existing device ID.");
                    return eijx.e((String) optional.get());
                }
                cpnx cpnxVar = this.a;
                final String string = UUID.randomUUID().toString();
                eksl ekslVar2 = (eksl) cpnx.a.h();
                ekslVar2.X(bzmz.m, string);
                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "getOrGenerateDeviceId", 327, "CmsBoxDetailsManager.java")).q("Generated device ID for the device.");
                cpnxVar.g.c("Bugle.Cms.PrimaryDevice.DeviceIdGenerated.Count");
                return cpnxVar.e.z(new Function() { // from class: aupc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        aumg aumgVar = (aumg) obj2;
                        cqce cqceVar = aurx.a;
                        aumgVar.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar.instance;
                        aumq aumqVar2 = aumq.a;
                        String str = string;
                        str.getClass();
                        aumqVar.b |= 8;
                        aumqVar.g = str;
                        return aumgVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).h(new ejvr() { // from class: cpns
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cpnx.a;
                        return string;
                    }
                }, cpnxVar.i);
            }
        }, this.j);
        return eijx.m(eijuVarK, eijuVarI).b(new eooy() { // from class: cpnn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                boolean z;
                boolean z2;
                String str = (String) eork.q(eijuVarI);
                eqiz eqizVar = (eqiz) eork.q(eijuVarK);
                ekgb ekgbVarA = cpus.a(eqizVar);
                evqe evqeVar = eqizVar.g;
                if (evqeVar == null) {
                    evqeVar = evqe.a;
                }
                try {
                    final String str2 = ((epjh) evsn.parseFrom(epjh.a, ((epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a())).b, evrr.a())).b;
                    String string = UUID.randomUUID().toString();
                    boolean z3 = (ekgbVarA.contains(str) && ekgbVarA.size() == 1) ? false : true;
                    boolean zIsEmpty = str2.isEmpty();
                    if (str2.isEmpty()) {
                        str2 = string;
                    } else {
                        eksl ekslVar = (eksl) cpnx.a.h();
                        ekslVar.X(bzmz.n, str2);
                        ekslVar.X(bzmz.x, "Box logging ID exists on the server");
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 112, "CmsBoxDetailsManager.java")).q("Updating local box logging ID");
                    }
                    cpnx cpnxVar = this.a;
                    auvh.h(cpnxVar.e.z(new Function() { // from class: aupo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            aumg aumgVar = (aumg) obj;
                            cqce cqceVar = aurx.a;
                            aumgVar.copyOnWrite();
                            aumq aumqVar = (aumq) aumgVar.instance;
                            aumq aumqVar2 = aumq.a;
                            String str3 = str2;
                            str3.getClass();
                            aumqVar.b |= 512;
                            aumqVar.m = str3;
                            return aumgVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                    if (!z3 && !zIsEmpty) {
                        eksl ekslVar2 = (eksl) cpnx.a.h();
                        ekslVar2.X(bzmz.m, str);
                        ekslVar2.X(bzmz.n, str2);
                        ekslVar2.X(bzmz.x, "Not setting logging ID and primary device");
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 125, "CmsBoxDetailsManager.java")).q("Skip updating box details in box");
                        return eijx.e(null);
                    }
                    eksp ekspVar = cpnx.a;
                    eksl ekslVar3 = (eksl) ekspVar.h();
                    ekrz ekrzVar = bzmz.m;
                    ekslVar3.X(ekrzVar, str);
                    ekslVar3.X(bzmz.o, efvl.b().a(ekgbVarA));
                    ekrz ekrzVar2 = bzmz.n;
                    ekslVar3.X(ekrzVar2, str2);
                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 134, "CmsBoxDetailsManager.java")).q("Updating box for primary device/box logging id");
                    eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                    String str3 = eqizVar.d;
                    eqiyVar.copyOnWrite();
                    eqiz eqizVar2 = (eqiz) eqiyVar.instance;
                    str3.getClass();
                    eqizVar2.d = str3;
                    evrv evrvVar2 = (evrv) evrw.a.createBuilder();
                    if (z3) {
                        eqiyVar.a((Iterable) Collection.EL.stream(eqizVar.f).filter(new Predicate() { // from class: cpnq
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
                                eksp ekspVar2 = cpnx.a;
                                int iA = eqjd.a(((eqjb) obj).c);
                                return iA == 0 || iA != 3;
                            }
                        }).collect(Collectors.toCollection(new cpnr())));
                        eqja eqjaVar = (eqja) eqjb.a.createBuilder();
                        eqjaVar.copyOnWrite();
                        eqjb eqjbVar = (eqjb) eqjaVar.instance;
                        str.getClass();
                        eqjbVar.b = str;
                        eqjaVar.copyOnWrite();
                        ((eqjb) eqjaVar.instance).c = 1;
                        eqjaVar.copyOnWrite();
                        ((eqjb) eqjaVar.instance).d = 2;
                        eqjb eqjbVar2 = (eqjb) eqjaVar.build();
                        eqiyVar.copyOnWrite();
                        eqiz eqizVar3 = (eqiz) eqiyVar.instance;
                        eqjbVar2.getClass();
                        eqizVar3.a();
                        eqizVar3.f.add(eqjbVar2);
                        evrvVar2.a("box_devices");
                        eksl ekslVar4 = (eksl) ekspVar.h();
                        ekslVar4.X(ekrzVar, str);
                        ekslVar4.X(ekrzVar2, str2);
                        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "prepareUpdateForPrimaryDevice", 216, "CmsBoxDetailsManager.java")).q("Update primary device id");
                        ekgb ekgbVarA2 = cpus.a(eqizVar);
                        aukz aukzVar = cpnxVar.h;
                        String strA = efvl.b().a(ekgbVarA2);
                        emdh emdhVar = (emdh) emdj.a.createBuilder();
                        emdhVar.copyOnWrite();
                        z = z3;
                        emdj emdjVar = (emdj) emdhVar.instance;
                        z2 = zIsEmpty;
                        emdjVar.c = 1;
                        emdjVar.b |= 1;
                        emdhVar.copyOnWrite();
                        emdj emdjVar2 = (emdj) emdhVar.instance;
                        str2.getClass();
                        emdjVar2.b |= 2;
                        emdjVar2.d = str2;
                        emdhVar.copyOnWrite();
                        emdj emdjVar3 = (emdj) emdhVar.instance;
                        str.getClass();
                        emdjVar3.b |= 4;
                        emdjVar3.e = str;
                        emdhVar.copyOnWrite();
                        emdj emdjVar4 = (emdj) emdhVar.instance;
                        emdjVar4.b |= 8;
                        emdjVar4.f = strA;
                        aukzVar.s((emdj) emdhVar.build());
                    } else {
                        z = z3;
                        z2 = zIsEmpty;
                        if (ekgbVarA.contains(str) && ekgbVarA.size() == 1) {
                            eksl ekslVar5 = (eksl) ekspVar.h();
                            ekslVar5.X(ekrzVar, str);
                            ekslVar5.X(ekrzVar2, str2);
                            ekslVar5.X(bzmz.x, "Current device is primary device in box");
                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 148, "CmsBoxDetailsManager.java")).q("Not setting device ID");
                        } else {
                            eksl ekslVar6 = (eksl) ekspVar.h();
                            ekslVar6.X(ekrzVar, str);
                            ekslVar6.X(ekrzVar2, str2);
                            ((eksl) ekslVar6.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 154, "CmsBoxDetailsManager.java")).q("Not setting device ID");
                        }
                    }
                    if (z2) {
                        epjg epjgVar = (epjg) epjh.a.createBuilder();
                        epjgVar.copyOnWrite();
                        epjh epjhVar = (epjh) epjgVar.instance;
                        str2.getClass();
                        epjhVar.b = str2;
                        epjh epjhVar2 = (epjh) epjgVar.build();
                        epkg epkgVar = (epkg) epkh.a.createBuilder();
                        evqs byteString = epjhVar2.toByteString();
                        epkgVar.copyOnWrite();
                        ((epkh) epkgVar.instance).b = byteString;
                        epkgVar.copyOnWrite();
                        ((epkh) epkgVar.instance).c = -1;
                        epkh epkhVar = (epkh) epkgVar.build();
                        evqd evqdVar = (evqd) evqe.a.createBuilder();
                        evqdVar.copyOnWrite();
                        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                        evqs byteString2 = epkhVar.toByteString();
                        evqdVar.copyOnWrite();
                        ((evqe) evqdVar.instance).c = byteString2;
                        evqe evqeVar2 = (evqe) evqdVar.build();
                        eqiyVar.copyOnWrite();
                        eqiz eqizVar4 = (eqiz) eqiyVar.instance;
                        evqeVar2.getClass();
                        eqizVar4.g = evqeVar2;
                        eqizVar4.c |= 1;
                        evrvVar2.a("extended_detail");
                        eksl ekslVar7 = (eksl) ekspVar.h();
                        ekslVar7.X(ekrzVar2, str2);
                        ekslVar7.X(ekrzVar, str);
                        ((eksl) ekslVar7.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "prepareUpdateForBoxLoggingId", 233, "CmsBoxDetailsManager.java")).q("Update box logging id");
                    } else {
                        eksl ekslVar8 = (eksl) ekspVar.h();
                        ekslVar8.X(ekrzVar2, str2);
                        ((eksl) ekslVar8.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "updatePrimaryDeviceAndBoxDetails", 164, "CmsBoxDetailsManager.java")).q("Not setting box logging ID");
                    }
                    return (cpyl.a() && ((Boolean) ((cczi) cpxw.b.get()).e()).booleanValue() && z) ? cpnxVar.f.ai((eqiz) eqiyVar.build(), (evrw) evrvVar2.build(), cpnx.c, 3).i(new eooz() { // from class: cpnm
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return cpnx.b();
                        }
                    }, cpnxVar.i) : cpnxVar.f.S((eqiz) eqiyVar.build(), (evrw) evrvVar2.build(), cpnx.c).i(new eooz() { // from class: cpno
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return cpnx.b();
                        }
                    }, cpnxVar.i);
                } catch (evtj e) {
                    throw new cpnz(e);
                }
            }
        }, this.i);
    }
}
