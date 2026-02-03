package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class twz implements cpmd {
    public static final cqce a = cqce.g("BugleCms", "CloudStoreSettingsClientImpl");
    static final evrw b;
    static final evrw c;
    static final evrw d;
    static final eqmi e;
    public final cpmc f;
    public final fcsu g;
    public final fcsu h;
    public final autx i;
    public final aoot j;
    public final eosc k;
    private final aurx l;
    private final eosc m;

    static {
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("cms_box_state");
        b = (evrw) evrvVar.build();
        evrv evrvVar2 = (evrv) evrw.a.createBuilder();
        evrvVar2.a("feature_types");
        c = (evrw) evrvVar2.build();
        evrv evrvVar3 = (evrv) evrw.a.createBuilder();
        evrvVar3.a("owner_addresses");
        d = (evrw) evrvVar3.build();
        eqmh eqmhVar = (eqmh) eqmi.a.createBuilder();
        eqmhVar.copyOnWrite();
        ((eqmi) eqmhVar.instance).d = true;
        e = (eqmi) eqmhVar.build();
    }

    public twz(cpmc cpmcVar, aurx aurxVar, fcsu fcsuVar, fcsu fcsuVar2, autx autxVar, aoot aootVar, eosc eoscVar, eosc eoscVar2) {
        this.f = cpmcVar;
        this.l = aurxVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = autxVar;
        this.j = aootVar;
        this.m = eoscVar;
        this.k = eoscVar2;
    }

    public static eplw m() {
        eplu epluVar = (eplu) eplw.a.createBuilder();
        eplv eplvVar = eplv.ENABLED;
        epluVar.copyOnWrite();
        ((eplw) epluVar.instance).b = eplvVar.a();
        return (eplw) epluVar.build();
    }

    public static eqnu o(String str, evuh evuhVar) {
        eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
        eqntVar.copyOnWrite();
        ((eqnu) eqntVar.instance).f = str;
        eqntVar.copyOnWrite();
        ((eqnu) eqntVar.instance).e = "message/encrypted";
        evqd evqdVar = (evqd) evqe.a.createBuilder();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
        epkg epkgVar = (epkg) epkh.a.createBuilder();
        epkgVar.copyOnWrite();
        ((epkh) epkgVar.instance).c = -1;
        evqs byteString = evuhVar.toByteString();
        epkgVar.copyOnWrite();
        epkh epkhVar = (epkh) epkgVar.instance;
        byteString.getClass();
        epkhVar.b = byteString;
        evqs byteString2 = ((epkh) epkgVar.build()).toByteString();
        evqdVar.copyOnWrite();
        ((evqe) evqdVar.instance).c = byteString2;
        eqntVar.copyOnWrite();
        eqnu eqnuVar = (eqnu) eqntVar.instance;
        evqe evqeVar = (evqe) evqdVar.build();
        evqeVar.getClass();
        eqnuVar.g = evqeVar;
        eqnuVar.b |= 1;
        return (eqnu) eqntVar.build();
    }

    public static void p(fbtf fbtfVar, String str, String str2) {
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Failed to set status on the server");
        cqbdVarE.A("contentId", str2);
        cqbdVarE.A("Method", str);
        Status status = fbtfVar.a;
        cqbdVarE.A("Code", status.getCode());
        cqbdVarE.A("Message", status.getDescription());
        cqbdVarE.r();
    }

    private final eiju q(final eqna eqnaVar) {
        return this.l.k().i(new eooz() { // from class: twh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                aumq aumqVar = (aumq) obj;
                eqjr eqjrVar = (eqjr) eqjs.a.createBuilder();
                aumj aumjVarB = aumj.b(aumqVar.y);
                if (aumjVarB == null) {
                    aumjVarB = aumj.ENCRYPTION_STATUS_UNSPECIFIED;
                }
                eqna eqnaVar2 = eqnaVar;
                twz twzVar = this.a;
                eqkj eqkjVarA = tnx.a(aumjVarB);
                eqjrVar.copyOnWrite();
                ((eqjs) eqjrVar.instance).e = eqkjVarA.a();
                eqli eqliVarA = twzVar.i.a(aumqVar);
                eqjrVar.copyOnWrite();
                eqjs eqjsVar = (eqjs) eqjrVar.instance;
                eqjsVar.c = eqliVarA.a();
                eqjsVar.b |= 1;
                eqjrVar.copyOnWrite();
                eqjs eqjsVar2 = (eqjs) eqjrVar.instance;
                eqjsVar2.d = eqnaVar2.a();
                eqjsVar2.b |= 2;
                if (twzVar.j.a()) {
                    eqmx eqmxVar = (eqmx) eqmy.a.createBuilder();
                    eqmxVar.copyOnWrite();
                    ((eqmy) eqmxVar.instance).b = 1;
                    eqjrVar.copyOnWrite();
                    eqjs eqjsVar3 = (eqjs) eqjrVar.instance;
                    eqmy eqmyVar = (eqmy) eqmxVar.build();
                    eqmyVar.getClass();
                    eqjsVar3.f = eqmyVar;
                    eqjsVar3.b |= 4;
                }
                eqjs eqjsVar4 = (eqjs) eqjrVar.build();
                cpmc cpmcVar = twzVar.f;
                eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                eqiyVar.copyOnWrite();
                eqiz eqizVar = (eqiz) eqiyVar.instance;
                eqjsVar4.getClass();
                eqizVar.j = eqjsVar4;
                eqizVar.c |= 16;
                return cpmcVar.S((eqiz) eqiyVar.build(), twz.b, twz.e);
            }
        }, this.m);
    }

    public final eiju a(String str, final String str2, evuh evuhVar) {
        eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).e = eqnh.a(4);
        eqncVar.copyOnWrite();
        ((eqnd) eqncVar.instance).k = str;
        eqncVar.a(str);
        eqnr eqnrVar = (eqnr) eqns.a.createBuilder();
        eqnrVar.a(o(str2, evuhVar));
        eqncVar.copyOnWrite();
        eqnd eqndVar = (eqnd) eqncVar.instance;
        eqns eqnsVar = (eqns) eqnrVar.build();
        eqnsVar.getClass();
        eqndVar.i = eqnsVar;
        eqndVar.b |= 4;
        eiju eijuVarF = this.f.f((eqnd) eqncVar.build(), false);
        ejvr ejvrVar = new ejvr() { // from class: tws
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarC = twz.a.c();
                cqbdVarC.I("Created CMS status object.");
                cqbdVarC.A("contentId", str2);
                cqbdVarC.r();
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarF.h(ejvrVar, eoqgVar).e(fbtf.class, new ejvr() { // from class: twt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                twz.p(fbtfVar, "CreateObject", str2);
                throw fbtfVar;
            }
        }, eoqgVar);
    }

    @Override // defpackage.cpmd
    public final eiju b() {
        return this.f.k(b).i(new eooz() { // from class: twb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqiz eqizVar = (eqiz) obj;
                eqjs eqjsVar = eqizVar.j;
                if (eqjsVar == null) {
                    eqjsVar = eqjs.a;
                }
                if ((eqjsVar.b & 1) == 0) {
                    final twz twzVar = this.a;
                    return twzVar.f.r("initial_sync_status").h(new ejvr() { // from class: tvy
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eqnd eqndVar = (eqnd) obj2;
                            Collection arrayList = new ArrayList();
                            int i = eqndVar.b & 4;
                            twz twzVar2 = twzVar;
                            if (i != 0) {
                                eqns eqnsVar = eqndVar.i;
                                if (eqnsVar == null) {
                                    eqnsVar = eqns.a;
                                }
                                arrayList = eqnsVar.b;
                            }
                            Optional optionalFindFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: twu
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
                                public final boolean test(Object obj3) {
                                    cqce cqceVar = twz.a;
                                    return ((eqnu) obj3).f.equals("initial_sync_status@message.cms.google");
                                }
                            }).findFirst();
                            if (optionalFindFirst.isPresent()) {
                                try {
                                    evqe evqeVar = ((eqnu) optionalFindFirst.get()).g;
                                    if (evqeVar == null) {
                                        evqeVar = evqe.a;
                                    }
                                    epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a());
                                    if (epkhVar.c != -1) {
                                        cqbd cqbdVarE = twz.a.e();
                                        cqbdVarE.I("Could not parse initial_sync_status object");
                                        cqbdVarE.A("ObjectId", eqndVar.c);
                                        cqbdVarE.A("Method", "parseInitialSyncState");
                                        cqbdVarE.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                        cqbdVarE.r();
                                        return eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
                                    }
                                    epkk epkkVar = (epkk) evsn.parseFrom(epkk.a, epkhVar.b, evrr.a());
                                    txj txjVar = (txj) twzVar2.g.b();
                                    epkj epkjVarB = epkj.b(epkkVar.b);
                                    if (epkjVarB == null) {
                                        epkjVarB = epkj.UNRECOGNIZED;
                                    }
                                    return (eqli) txjVar.fM(epkjVarB);
                                } catch (evtj e2) {
                                    cqbd cqbdVarE2 = twz.a.e();
                                    cqbdVarE2.I("Could not parse initial_sync_status object");
                                    cqbdVarE2.A("ObjectId", eqndVar.c);
                                    cqbdVarE2.A("Method", "parseInitialSyncState");
                                    cqbdVarE2.A("Message", e2.getMessage());
                                    cqbdVarE2.A("Cause", e2.getCause());
                                    cqbdVarE2.r();
                                }
                            }
                            return eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
                        }
                    }, twzVar.k);
                }
                eqjs eqjsVar2 = eqizVar.j;
                if (eqjsVar2 == null) {
                    eqjsVar2 = eqjs.a;
                }
                eqli eqliVarB = eqli.b(eqjsVar2.c);
                if (eqliVarB == null) {
                    eqliVarB = eqli.UNRECOGNIZED;
                }
                return eijx.e(eqliVarB);
            }
        }, this.k).f(fbtf.class, new eooz() { // from class: twc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                cqce cqceVar = twz.a;
                if (status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return eijx.e(eqli.INITIAL_SYNC_STATE_UNSPECIFIED);
                }
                twz.a.s("Failed to get the user initial sync status from server", fbtfVar);
                return eijx.d(fbtfVar);
            }
        }, this.m);
    }

    @Override // defpackage.cpmd
    public final eiju c() {
        return this.f.k(b).i(new eooz() { // from class: twm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqiz eqizVar = (eqiz) obj;
                eqjs eqjsVar = eqizVar.j;
                if (eqjsVar == null) {
                    eqjsVar = eqjs.a;
                }
                if ((eqjsVar.b & 2) == 0) {
                    final twz twzVar = this.a;
                    return twzVar.f.s("multidevice_status").h(new ejvr() { // from class: twx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eplv eplvVarB;
                            eqnd eqndVar = (eqnd) obj2;
                            txm txmVar = (txm) twzVar.h.b();
                            java.util.Collection arrayList = new ArrayList();
                            if ((eqndVar.b & 4) != 0) {
                                eqns eqnsVar = eqndVar.i;
                                if (eqnsVar == null) {
                                    eqnsVar = eqns.a;
                                }
                                arrayList = eqnsVar.b;
                            }
                            Optional optionalFindFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: twv
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
                                public final boolean test(Object obj3) {
                                    cqce cqceVar = twz.a;
                                    return ((eqnu) obj3).f.equals("multidevice_status@message.cms.google");
                                }
                            }).findFirst();
                            if (optionalFindFirst.isPresent()) {
                                try {
                                    evqe evqeVar = ((eqnu) optionalFindFirst.get()).g;
                                    if (evqeVar == null) {
                                        evqeVar = evqe.a;
                                    }
                                    epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a());
                                    if (epkhVar.c == -1) {
                                        eplvVarB = eplv.b(((eplw) evsn.parseFrom(eplw.a, epkhVar.b, evrr.a())).b);
                                        if (eplvVarB == null) {
                                            eplvVarB = eplv.UNRECOGNIZED;
                                        }
                                    } else {
                                        cqbd cqbdVarE = twz.a.e();
                                        cqbdVarE.I("Could not parse multi_device_status object");
                                        cqbdVarE.A("ObjectId", eqndVar.c);
                                        cqbdVarE.A("Method", "parseMultiDeviceStatus");
                                        cqbdVarE.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                        cqbdVarE.r();
                                        eplvVarB = eplv.DISABLED;
                                    }
                                } catch (evtj e2) {
                                    cqbd cqbdVarE2 = twz.a.e();
                                    cqbdVarE2.I("Could not parse multi_device_status object");
                                    cqbdVarE2.A("ObjectId", eqndVar.c);
                                    cqbdVarE2.A("Method", "parseMultiDeviceStatus");
                                    cqbdVarE2.A("Message", e2.getMessage());
                                    cqbdVarE2.A("Cause", e2.getCause());
                                    cqbdVarE2.r();
                                    eplvVarB = eplv.DISABLED;
                                }
                            } else {
                                eplvVarB = eplv.DISABLED;
                            }
                            return (eqna) txmVar.fM(eplvVarB);
                        }
                    }, twzVar.k);
                }
                eqjs eqjsVar2 = eqizVar.j;
                if (eqjsVar2 == null) {
                    eqjsVar2 = eqjs.a;
                }
                eqna eqnaVarB = eqna.b(eqjsVar2.d);
                if (eqnaVarB == null) {
                    eqnaVarB = eqna.UNRECOGNIZED;
                }
                return eijx.e(eqnaVarB);
            }
        }, this.k).f(fbtf.class, new eooz() { // from class: twn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                cqce cqceVar = twz.a;
                if (status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return eijx.e(eqna.DISABLED);
                }
                twz.a.s("Failed to get the user multi-device status from server", fbtfVar);
                return eijx.d(fbtfVar);
            }
        }, this.m);
    }

    public final eiju d() {
        return this.l.k().h(new ejvr() { // from class: twr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                epkj epkjVar;
                aumq aumqVar = (aumq) obj;
                epki epkiVar = (epki) epkk.a.createBuilder();
                aumqVar.getClass();
                autx autxVar = this.a.i;
                if (autxVar.b.a() && autxVar.c.a()) {
                    epkjVar = epkj.NOT_SET;
                } else {
                    autt auttVarB = autt.b(aumqVar.f);
                    if (auttVarB == null) {
                        auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
                    }
                    switch (auttVarB) {
                        case INITIAL_SYNC_STATUS_NOT_SET:
                        case STARTED:
                            epkjVar = epkj.NOT_SET;
                            break;
                        case RESTORE:
                        case RESTORE_KEYS:
                            epkjVar = epkj.RESTORE;
                            break;
                        case BACKUP:
                        case INITIAL_BACKUP_NEEDS_RETRY:
                        case RESTORE_MESSAGES_COMPLETE:
                            epkjVar = epkj.BACKUP;
                            break;
                        case FAILED:
                            epkjVar = epkj.FAILED;
                            break;
                        case COMPLETE:
                            epkjVar = epkj.COMPLETE;
                            break;
                        default:
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(auttVarB))));
                    }
                    epkjVar.getClass();
                }
                epkiVar.copyOnWrite();
                ((epkk) epkiVar.instance).b = epkjVar.a();
                return (epkk) epkiVar.build();
            }
        }, this.k);
    }

    @Override // defpackage.cpmd
    public final eiju e() {
        epki epkiVar = (epki) epkk.a.createBuilder();
        epkj epkjVar = epkj.NOT_SET;
        epkiVar.copyOnWrite();
        ((epkk) epkiVar.instance).b = epkjVar.a();
        final epkk epkkVar = (epkk) epkiVar.build();
        aurx aurxVar = this.l;
        final eqli eqliVar = eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
        eiju eijuVarI = aurxVar.k().i(new eooz() { // from class: tvz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                twz twzVar = this.a;
                eqjs eqjsVarN = twzVar.n((aumq) obj, eqliVar);
                eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                eqiyVar.copyOnWrite();
                eqiz eqizVar = (eqiz) eqiyVar.instance;
                eqjsVarN.getClass();
                eqizVar.j = eqjsVarN;
                eqizVar.c |= 16;
                return twzVar.f.S((eqiz) eqiyVar.build(), twz.b, twz.e);
            }
        }, this.m);
        eooz eoozVar = new eooz() { // from class: twd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.l("initial_sync_status", "initial_sync_status@message.cms.google", epkkVar);
            }
        };
        eosc eoscVar = this.k;
        return eijuVarI.i(eoozVar, eoscVar).f(fbtf.class, new eooz() { // from class: twe
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                cqce cqceVar = twz.a;
                if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                    return eijx.d(fbtfVar);
                }
                twz.a.m("Feature already disabled");
                return eijx.e(null);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmd
    public final eiju f(final List list) {
        eiju eijuVarK = this.f.k(d);
        eooz eoozVar = new eooz() { // from class: twf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqiz eqizVar = (eqiz) obj;
                eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                eqiyVar.copyOnWrite();
                eqiz eqizVar2 = (eqiz) eqiyVar.instance;
                evsx evsxVar = eqizVar2.i;
                if (!evsxVar.c()) {
                    eqizVar2.i = evsn.mutableCopy(evsxVar);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    eqizVar2.i.h(((eqkm) it.next()).a());
                }
                twz twzVar = this.a;
                evtg evtgVar = eqizVar.e;
                eqiyVar.copyOnWrite();
                eqiz eqizVar3 = (eqiz) eqiyVar.instance;
                eqizVar3.b();
                evpz.addAll(evtgVar, eqizVar3.e);
                return twzVar.f.S((eqiz) eqiyVar.build(), twz.c, twz.e);
            }
        };
        eosc eoscVar = this.k;
        return eijuVarK.i(eoozVar, eoscVar).h(new ejvr() { // from class: twg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new evsz(((eqiz) obj).i, eqiz.a);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmd
    public final eiju g() {
        eiju eijuVarI = d().i(new eooz() { // from class: tvs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                twz twzVar = this.a;
                final epkk epkkVar = (epkk) obj;
                return twzVar.j().h(new ejvr() { // from class: tvt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = twz.a;
                        return epkkVar;
                    }
                }, twzVar.k);
            }
        }, this.k);
        eooz eoozVar = new eooz() { // from class: twa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.l("initial_sync_status", "initial_sync_status@message.cms.google", (epkk) obj);
            }
        };
        eosc eoscVar = this.m;
        return eijuVarI.i(eoozVar, eoscVar).f(fbtf.class, new eooz() { // from class: twl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                if (!fbtfVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                    return eijx.d(fbtfVar);
                }
                final twz twzVar = this.a;
                return twzVar.d().i(new eooz() { // from class: twy
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return twzVar.a("initial_sync_status", "initial_sync_status@message.cms.google", (epkk) obj2);
                    }
                }, twzVar.k);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmd
    public final eiju h() {
        eiju eijuVarQ = q(eqna.MULTI_DEVICE_STATE_UNSPECIFIED);
        eooz eoozVar = new eooz() { // from class: tvu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.f.r("multidevice_status");
            }
        };
        eosc eoscVar = this.k;
        return eijuVarQ.i(eoozVar, eoscVar).i(new eooz() { // from class: tvv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.f.g(((eqnd) obj).c, false);
            }
        }, eoscVar).h(new ejvr() { // from class: tvw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = twz.a;
                return null;
            }
        }, eoscVar).e(fbtf.class, new ejvr() { // from class: tvx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                cqce cqceVar = twz.a;
                if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                    throw fbtfVar;
                }
                twz.a.m("Feature already disabled");
                return null;
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmd
    public final eiju i() {
        return q(eqna.ENABLED).i(new eooz() { // from class: twp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a("multidevice_status", "multidevice_status@message.cms.google", twz.m());
            }
        }, this.k).f(fbtf.class, new eooz() { // from class: twq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                return fbtfVar.a.getCode().equals(Status.Code.ALREADY_EXISTS) ? this.a.l("multidevice_status", "multidevice_status@message.cms.google", twz.m()) : eijx.d(fbtfVar);
            }
        }, this.m);
    }

    @Override // defpackage.cpmd
    public final eiju j() {
        return this.l.k().i(new eooz() { // from class: two
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                twz twzVar = this.a;
                aumq aumqVar = (aumq) obj;
                eqjs eqjsVarN = twzVar.n(aumqVar, twzVar.i.a(aumqVar));
                eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                eqiyVar.copyOnWrite();
                eqiz eqizVar = (eqiz) eqiyVar.instance;
                eqjsVarN.getClass();
                eqizVar.j = eqjsVarN;
                eqizVar.c |= 16;
                return twzVar.f.S((eqiz) eqiyVar.build(), twz.b, twz.e);
            }
        }, this.m);
    }

    @Override // defpackage.cpmd
    public final eiju k(final eplw eplwVar, final epkk epkkVar) {
        return this.f.k(b).i(new eooz() { // from class: tww
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqiz eqizVar = (eqiz) obj;
                eqjs eqjsVar = eqizVar.j;
                if (eqjsVar == null) {
                    eqjsVar = eqjs.a;
                }
                eplw eplwVar2 = eplwVar;
                twz twzVar = this.a;
                eqjr eqjrVar = (eqjr) eqjsVar.toBuilder();
                txm txmVar = (txm) twzVar.h.b();
                eplv eplvVarB = eplv.b(eplwVar2.b);
                if (eplvVarB == null) {
                    eplvVarB = eplv.UNRECOGNIZED;
                }
                epkk epkkVar2 = epkkVar;
                eqna eqnaVar = (eqna) txmVar.fM(eplvVarB);
                eqjrVar.copyOnWrite();
                eqjs eqjsVar2 = (eqjs) eqjrVar.instance;
                eqjsVar2.d = eqnaVar.a();
                eqjsVar2.b |= 2;
                txj txjVar = (txj) twzVar.g.b();
                epkj epkjVarB = epkj.b(epkkVar2.b);
                if (epkjVarB == null) {
                    epkjVarB = epkj.UNRECOGNIZED;
                }
                eqli eqliVar = (eqli) txjVar.fM(epkjVarB);
                eqjrVar.copyOnWrite();
                eqjs eqjsVar3 = (eqjs) eqjrVar.instance;
                eqjsVar3.c = eqliVar.a();
                eqjsVar3.b |= 1;
                eqjs eqjsVar4 = (eqjs) eqjrVar.build();
                eqiy eqiyVar = (eqiy) eqizVar.toBuilder();
                eqiyVar.copyOnWrite();
                eqiz eqizVar2 = (eqiz) eqiyVar.instance;
                eqjsVar4.getClass();
                eqizVar2.j = eqjsVar4;
                eqizVar2.c |= 16;
                return twzVar.f.S((eqiz) eqiyVar.build(), twz.b, twz.e);
            }
        }, this.k);
    }

    public final eiju l(String str, final String str2, final evuh evuhVar) {
        eiju eijuVarI = this.f.r(str).i(new eooz() { // from class: twi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str3 = ((eqnd) obj).c;
                eqnu eqnuVarO = twz.o(str2, evuhVar);
                evrv evrvVar = (evrv) evrw.a.createBuilder();
                evrvVar.a("extended_detail");
                return this.a.f.X(str3, eqnuVarO, (evrw) evrvVar.build(), false);
            }
        }, this.m);
        ejvr ejvrVar = new ejvr() { // from class: twj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarC = twz.a.c();
                cqbdVarC.I("Updated CMS status object.");
                cqbdVarC.A("contentId", str2);
                cqbdVarC.r();
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(fbtf.class, new ejvr() { // from class: twk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                twz.p(fbtfVar, "UpdateObject", str2);
                throw fbtfVar;
            }
        }, eoqgVar);
    }

    public final eqjs n(aumq aumqVar, eqli eqliVar) {
        eqjr eqjrVar = (eqjr) eqjs.a.createBuilder();
        aumj aumjVarB = aumj.b(aumqVar.y);
        if (aumjVarB == null) {
            aumjVarB = aumj.ENCRYPTION_STATUS_UNSPECIFIED;
        }
        eqkj eqkjVarA = tnx.a(aumjVarB);
        eqjrVar.copyOnWrite();
        ((eqjs) eqjrVar.instance).e = eqkjVarA.a();
        eqjrVar.copyOnWrite();
        eqjs eqjsVar = (eqjs) eqjrVar.instance;
        eqjsVar.c = eqliVar.a();
        eqjsVar.b |= 1;
        ejvr ejvrVar = txl.a;
        auml aumlVarB = auml.b(aumqVar.l);
        if (aumlVarB == null) {
            aumlVarB = auml.UNSPECIFIED_STATUS;
        }
        Object objApply = ejvrVar.apply(aumlVarB);
        eqjrVar.copyOnWrite();
        eqjs eqjsVar2 = (eqjs) eqjrVar.instance;
        eqjsVar2.d = ((eqna) objApply).a();
        eqjsVar2.b |= 2;
        if (this.j.a()) {
            eqmx eqmxVar = (eqmx) eqmy.a.createBuilder();
            eqmxVar.copyOnWrite();
            ((eqmy) eqmxVar.instance).b = 1;
            eqjrVar.copyOnWrite();
            eqjs eqjsVar3 = (eqjs) eqjrVar.instance;
            eqmy eqmyVar = (eqmy) eqmxVar.build();
            eqmyVar.getClass();
            eqjsVar3.f = eqmyVar;
            eqjsVar3.b |= 4;
        }
        return (eqjs) eqjrVar.build();
    }
}
