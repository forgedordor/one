package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfox implements cfoy {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/handler/inboxmessagehandler/DittoInboxMessageHandler");
    public final bvkr a;
    private final cfdb c;
    private final eosc d;
    private final eygg e;
    private final fcsu f;

    public cfox(bvkr bvkrVar, eosc eoscVar, cfdb cfdbVar, fcsu fcsuVar, eygg eyggVar) {
        this.a = bvkrVar;
        this.d = eoscVar;
        this.c = cfdbVar;
        this.e = eyggVar;
        this.f = fcsuVar;
    }

    @Override // defpackage.cfoy
    public final eiju a(final ezjj ezjjVar) throws cfcz {
        boolean z;
        ezol ezolVarA;
        bvks bvksVar;
        final ezol ezolVar;
        final eoxe eoxeVar;
        final ezol ezolVar2;
        eiju eijuVarI;
        String strQ;
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        if (ezjiVarB == ezji.DITTO) {
            for (bvmk bvmkVar : (Set) this.e.b()) {
                if (!bvmkVar.b()) {
                    ekrw ekrwVarE = b.e();
                    ekrwVarE.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/handler/inboxmessagehandler/DittoInboxMessageHandler", "areDittoRpcsEnabled", 105, "DittoInboxMessageHandler.java")).t("Ignoring RPC from Ditto with reason %s", bvmkVar.a());
                    ((bvio) this.f.b()).d(bvmkVar.a().d);
                    return eijx.e(false);
                }
            }
            try {
                eoxe eoxeVar2 = (eoxe) evsn.parseFrom(eoxe.a, ezjjVar.e);
                final cfdb cfdbVar = this.c;
                cfdbVar.z.c("Bugle.Ditto.Requests");
                if (((cdio) cfdbVar.X.b()).a()) {
                    ezol ezolVar3 = ezjjVar.g;
                    if (ezolVar3 == null) {
                        ezolVar3 = ezol.a;
                    }
                    ezol ezolVar4 = ezjjVar.g;
                    if (ezolVar4 == null) {
                        ezolVar4 = ezol.a;
                    }
                    felm felmVarB = felm.b(ezolVar4.b);
                    if (felmVarB == null) {
                        felmVarB = felm.UNRECOGNIZED;
                    }
                    Optional optionalEmpty = Optional.empty();
                    if (felmVarB.equals(felm.EMAIL)) {
                        try {
                            if (cfdb.r(eoxeVar2)) {
                                strQ = ((epnf) evsn.parseFrom(epnf.a, eoxeVar2.d, evrr.a())).c;
                                z = false;
                            } else {
                                final ezol ezolVar5 = ezjjVar.g;
                                if (ezolVar5 == null) {
                                    ezolVar5 = ezol.a;
                                }
                                final byte[] bArrI = ezjjVar.h.I();
                                eieu eieuVarK = eiiy.k("DittoDesktops#getInternalDesktopIdByGaiaEmail");
                                z = false;
                                try {
                                    bozw bozwVarA = bpab.a();
                                    bozwVarA.A("DittoDesktops#getInternalDesktopIdByGaiaEmail");
                                    Optional optionalFindFirst = Collection.EL.stream(bozwVarA.b().z()).filter(new Predicate() { // from class: bvjs
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
                                            cqce cqceVar = bvkr.a;
                                            return bvkr.r((bowp) obj, ezolVar5.c);
                                        }
                                    }).filter(new Predicate() { // from class: bvjt
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
                                            cqce cqceVar = bvkr.a;
                                            return Arrays.equals(((bowp) obj).u(), bArrI);
                                        }
                                    }).findFirst();
                                    strQ = optionalFindFirst.isPresent() ? ((bowp) optionalFindFirst.get()).q() : "";
                                    eieuVarK.close();
                                    if (ejwk.c(strQ)) {
                                        throw new cfcz();
                                    }
                                } finally {
                                }
                            }
                            optionalEmpty = Optional.of(ezjjVar.h);
                        } catch (cfcz unused) {
                            ekrw ekrwVarE2 = cfdb.c.e();
                            ekrwVarE2.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 657, "DittoChannelRequestHandlerV2.java")).t("Failed to find desktop for request %s. Sending unpair push", eoxeVar2.b);
                            cfdf cfdfVar = cfdbVar.K;
                            ezol ezolVar6 = ezjjVar.i;
                            if (ezolVar6 == null) {
                                ezolVar6 = ezol.a;
                            }
                            auvh.e(cfdfVar.a(new bvks(ezolVar6, "", Optional.of(ezjjVar.h)), eoxeVar2.b).e(fbtf.class, new ejvr() { // from class: cfbi
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ekrw ekrwVarI = cfdb.c.i();
                                    ekrwVarI.X(eksq.a, "BugleNetwork");
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g((fbtf) obj)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendUnpairGaiaRpc", 619, "DittoChannelRequestHandlerV2.java")).q("sendUnpairGaiaRpc failed with StatusRuntimeException");
                                    return ezjn.a;
                                }
                            }, cfdbVar.w));
                            return eijx.e(true);
                        } catch (evtj e) {
                            ekrw ekrwVarI = cfdb.c.i();
                            ekrwVarI.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 653, "DittoChannelRequestHandlerV2.java")).t("Failed to get pairing attempt id for request %s", eoxeVar2.b);
                            return eijx.e(true);
                        }
                    } else {
                        z = false;
                        strQ = ezolVar3.c;
                    }
                    bvksVar = new bvks(ezolVar3, strQ, optionalEmpty);
                    ezolVarA = bvksVar.d;
                    ezolVar = bvksVar.a;
                    ((bvio) cfdbVar.p.b()).k(eoxeVar2.b, ezolVarA.c, eoxeVar2.c, ezjjVar.c);
                } else {
                    z = false;
                    ezol ezolVar7 = ezjjVar.g;
                    if (ezolVar7 == null) {
                        ezolVar7 = ezol.a;
                    }
                    ezolVarA = bvfe.a(ezolVar7.c);
                    bvksVar = new bvks(ezolVarA, ezolVarA.c, Optional.empty());
                    ezol ezolVar8 = ezjjVar.g;
                    if (ezolVar8 == null) {
                        ezolVar8 = ezol.a;
                    }
                    felm felmVarB2 = felm.b(ezolVar8.b);
                    if (felmVarB2 == null) {
                        felmVarB2 = felm.UNRECOGNIZED;
                    }
                    if (felmVarB2.equals(felm.EMAIL)) {
                        ekrw ekrwVarE3 = cfdb.c.e();
                        ekrwVarE3.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 686, "DittoChannelRequestHandlerV2.java")).q("Received Gaia paired desktop request when Gaia pairing is disabled.");
                        return eijx.e(true);
                    }
                    ((bvio) cfdbVar.p.b()).k(eoxeVar2.b, ezolVarA.c, eoxeVar2.c, ezjjVar.c);
                    ezolVar = ezolVarA;
                }
                final bvks bvksVar2 = bvksVar;
                boolean zV = cfdbVar.u.v(ezolVarA);
                int i = eoxeVar2.c;
                epby epbyVarB = epby.b(i);
                if (epbyVarB == null) {
                    epbyVarB = epby.UNRECOGNIZED;
                }
                if (epbyVarB != epby.GET_UPDATES && !zV) {
                    cfdbVar.z.g("Bugle.Ditto.InactiveBrowser.Requests", i);
                }
                fcsu fcsuVar = cfdbVar.X;
                if (((cdio) fcsuVar.b()).a()) {
                    eiju eijuVarF = bvksVar2.a.d.equals("Bugle") ? ((bvll) cfdbVar.ab.b()).f() : eijx.e("");
                    eoxeVar = eoxeVar2;
                    final ezol ezolVar9 = ezolVar;
                    eooz eoozVar = new eooz() { // from class: cfce
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            char c;
                            char c2;
                            String str = (String) obj;
                            eoxe eoxeVar3 = eoxeVar;
                            epby epbyVarB2 = epby.b(eoxeVar3.c);
                            if (epbyVarB2 == null) {
                                epbyVarB2 = epby.UNRECOGNIZED;
                            }
                            bvks bvksVar3 = bvksVar2;
                            if (epbyVarB2 == epby.GET_UPDATES) {
                                ekrw ekrwVarE4 = cfdb.c.e();
                                ekrwVarE4.X(eksq.a, "BugleNetwork");
                                ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 713, "DittoChannelRequestHandlerV2.java")).D("setRequestId, desktopId=%s, requestId=%s", bvksVar3.b, eoxeVar3.b);
                                final ezol ezolVar10 = bvksVar3.d;
                                String str2 = eoxeVar3.b;
                                eieu eieuVarK2 = eiiy.k("DittoDesktops#setRequestId");
                                try {
                                    String[] strArr = bpab.a;
                                    bozy bozyVar = new bozy();
                                    bozyVar.ap("setRequestId");
                                    bozyVar.f(new Function() { // from class: bvjb
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bpaa bpaaVar = (bpaa) obj2;
                                            cqce cqceVar = bvkr.a;
                                            bpaaVar.b(ezolVar10.c);
                                            return bpaaVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bozyVar.e(str2);
                                    bozyVar.b().e();
                                    eieuVarK2.close();
                                } finally {
                                }
                            }
                            ezol ezolVar11 = ezolVar9;
                            ezjj ezjjVar2 = ezjjVar;
                            cfdb cfdbVar2 = cfdbVar;
                            if (TextUtils.isEmpty(str)) {
                                return cfdbVar2.f(eoxeVar3, ezjjVar2, ezolVar11, bvksVar3);
                            }
                            ekrg ekrgVar = cfdb.c;
                            ekrw ekrwVarE5 = ekrgVar.e();
                            ekrz ekrzVar = eksq.a;
                            ekrwVarE5.X(ekrzVar, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE5).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "handleRequest", 721, "DittoChannelRequestHandlerV2.java")).q("Gaia pairing is available, sending GaiaPairingInfo as response error.");
                            fcsu fcsuVar2 = cfdbVar2.X;
                            ezol ezolVar12 = ((cdio) fcsuVar2.b()).a() ? bvksVar3.d : ezolVar11;
                            ekrw ekrwVarE6 = ekrgVar.e();
                            ekrwVarE6.X(ekrzVar, "BugleNetwork");
                            ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE6).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getGaiaParingInfoResponseForRequest", 829, "DittoChannelRequestHandlerV2.java");
                            epby epbyVarB3 = epby.b(eoxeVar3.c);
                            if (epbyVarB3 == null) {
                                epbyVarB3 = epby.UNRECOGNIZED;
                            }
                            epby epbyVar = epbyVarB3;
                            fcsu fcsuVar3 = cfdbVar2.k;
                            ekrdVar.w("Gaia pairing on. Received DittoRequest: %s %s", epbyVar.a(), ((cehg) fcsuVar3.b()).B(eoxeVar3.b, ezolVar12));
                            if (!cfdbVar2.u.C(ezolVar12) && !cfdbVar2.B.b(ezolVar12)) {
                                cfdbVar2.t(ezolVar11, bvksVar3);
                                return eijx.e(true);
                            }
                            cfdbVar2.q(eoxeVar3);
                            ekrw ekrwVarH = ekrgVar.h();
                            ekrwVarH.X(ekrzVar, "BugleNetwork");
                            ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getGaiaParingInfoResponseForRequest", 846, "DittoChannelRequestHandlerV2.java");
                            epby epbyVarB4 = epby.b(eoxeVar3.c);
                            if (epbyVarB4 == null) {
                                epbyVarB4 = epby.UNRECOGNIZED;
                            }
                            ekrdVar2.w("Gaia pairing on. Handling DittoRequest: %s %s", epbyVarB4.a(), ((cehg) fcsuVar3.b()).B(eoxeVar3.b, ezolVar12));
                            eoxh eoxhVar = (eoxh) eoxk.a.createBuilder();
                            eoxi eoxiVar = (eoxi) eoxj.a.createBuilder();
                            eoxiVar.copyOnWrite();
                            eoxj eoxjVar = (eoxj) eoxiVar.instance;
                            str.getClass();
                            eoxjVar.b = str;
                            eoxj eoxjVar2 = (eoxj) eoxiVar.build();
                            eoxhVar.copyOnWrite();
                            eoxk eoxkVar = (eoxk) eoxhVar.instance;
                            eoxjVar2.getClass();
                            eoxkVar.c = eoxjVar2;
                            eoxkVar.b = 2;
                            eoxk eoxkVar2 = (eoxk) eoxhVar.build();
                            ezol ezolVar13 = ((cdio) fcsuVar2.b()).a() ? bvksVar3.d : ezolVar11;
                            epby epbyVarL = cfdb.l(eoxeVar3);
                            if (epbyVarL == epby.SETTINGS_UPDATE) {
                                return eijx.e(true);
                            }
                            cfef cfefVarA = cfdbVar2.a(epbyVarL, ezolVar11, eoxeVar3.b, ezjjVar2, true, 1, bvksVar3);
                            cfefVarA.h = eoxkVar2.toByteString();
                            cfeg cfegVarA = cfefVarA.a();
                            ekrw ekrwVarE7 = ekrgVar.e();
                            ekrwVarE7.X(ekrzVar, "BugleNetwork");
                            ekrd ekrdVar3 = (ekrd) ((ekrd) ekrwVarE7).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponse", 1325, "DittoChannelRequestHandlerV2.java");
                            int i2 = eoxkVar2.b;
                            if (i2 == 0) {
                                c = 2;
                                c2 = 1;
                            } else if (i2 != 1) {
                                c = 2;
                                c2 = i2 != 2 ? (char) 0 : (char) 3;
                            } else {
                                c = 2;
                                c2 = 2;
                            }
                            String str3 = c2 != 1 ? c2 != c ? c2 != 3 ? "null" : "NEEDS_GAIA_PAIRING_MIGRATION" : "STATUS_PROTO" : "ERRORTYPE_NOT_SET";
                            if (c2 == 0) {
                                throw null;
                            }
                            ekrdVar3.I("Preparing ditto error %s response for request of type %s %s", str3, epbyVarL, ((cehg) fcsuVar3.b()).A(eoxeVar3.b, cfegVarA.c, ezolVar13));
                            return cfdbVar2.j(cfegVarA, eoxeVar3.b, ezolVar13, bvksVar3);
                        }
                    };
                    bvksVar2 = bvksVar2;
                    ezolVar2 = ezolVar9;
                    eijuVarI = eijuVarF.i(eoozVar, cfdbVar.x);
                } else {
                    eoxeVar = eoxeVar2;
                    eiju eijuVarH = (((cdio) fcsuVar.b()).a() && bvksVar2.a.d.equals("Bugle")) ? ((bvll) cfdbVar.ab.b()).j().h(new ejvr() { // from class: cfcm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            if (!((Boolean) obj).booleanValue()) {
                                return false;
                            }
                            ezol ezolVar10 = ezolVar;
                            cfdb cfdbVar2 = cfdbVar;
                            ekrw ekrwVarE4 = cfdb.c.e();
                            ekrwVarE4.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "getIsPairingForceRevokedFuture", 797, "DittoChannelRequestHandlerV2.java")).q("Gaia pairing is available, force revoke QR.");
                            ((cema) cfdbVar2.v.b()).a(cfdbVar2.J.a(ezolVar10));
                            return true;
                        }
                    }, cfdbVar.x) : eijx.e(Boolean.valueOf(z));
                    final ezol ezolVar10 = ezolVar;
                    ezolVar2 = ezolVar10;
                    eijuVarI = eijuVarH.i(new eooz() { // from class: cfcf
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                return eijx.e(true);
                            }
                            bvks bvksVar3 = bvksVar2;
                            ezol ezolVar11 = ezolVar10;
                            ezjj ezjjVar2 = ezjjVar;
                            return cfdbVar.f(eoxeVar, ezjjVar2, ezolVar11, bvksVar3);
                        }
                    }, cfdbVar.x);
                }
                return ((Boolean) ((cczi) cfdb.b.get()).e()).booleanValue() ? eijuVarI.f(fbtf.class, new eooz() { // from class: cfcg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Status statusC = Status.c((fbtf) obj);
                        evbo evboVar = (evbo) evbp.a.createBuilder();
                        int iValue = statusC.getCode().value();
                        evboVar.copyOnWrite();
                        evbp evbpVar = (evbp) evboVar.instance;
                        evbpVar.b |= 1;
                        evbpVar.c = iValue;
                        String strB = ejwk.b(statusC.getDescription());
                        evboVar.copyOnWrite();
                        evbp evbpVar2 = (evbp) evboVar.instance;
                        evbpVar2.b |= 4;
                        evbpVar2.d = strB;
                        evbp evbpVar3 = (evbp) evboVar.build();
                        cfdb cfdbVar2 = cfdbVar;
                        boolean zA = ((cdio) cfdbVar2.X.b()).a();
                        ezol ezolVar11 = ezolVar2;
                        bvks bvksVar3 = bvksVar2;
                        ezol ezolVar12 = zA ? bvksVar3.d : ezolVar11;
                        eoxe eoxeVar3 = eoxeVar;
                        epby epbyVarL = cfdb.l(eoxeVar3);
                        if (epbyVarL == epby.SETTINGS_UPDATE) {
                            return eijx.e(true);
                        }
                        cfef cfefVarA = cfdbVar2.a(epbyVarL, ezolVar11, eoxeVar3.b, ezjjVar, true, 1, bvksVar3);
                        cfefVarA.h = evbpVar3.toByteString();
                        cfeg cfegVarA = cfefVarA.a();
                        ekrw ekrwVarE4 = cfdb.c.e();
                        ekrwVarE4.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE4).h("com/google/android/apps/messaging/shared/net/handler/DittoChannelRequestHandlerV2", "sendDittoResponse", 1368, "DittoChannelRequestHandlerV2.java")).I("Preparing error %d response for request of type %s %s", Integer.valueOf(evbpVar3.c), epbyVarL, ((cehg) cfdbVar2.k.b()).A(eoxeVar3.b, cfegVarA.c, ezolVar12));
                        return cfdbVar2.j(cfegVarA, eoxeVar3.b, ezolVar12, bvksVar3);
                    }
                }, cfdbVar.x) : eijuVarI;
            } catch (evtj e2) {
                cqca.h("BugleNetwork", e2, "Exception parsing inbox message");
            }
        } else if (ezjiVarB == ezji.WIREBALL) {
            try {
                ezxb ezxbVar = (ezxb) evsn.parseFrom(ezxb.a, ezjjVar.e);
                int i2 = ezxbVar.b;
                if (ezwz.a(i2) == ezwz.REVOKE_PAIRING) {
                    cqca.i("BugleNetwork", "Handling RevokePairing request");
                    final ezol ezolVar11 = (ezxbVar.b == 5 ? (ezxh) ezxbVar.c : ezxh.a).b;
                    if (ezolVar11 == null) {
                        ezolVar11 = ezol.a;
                    }
                    return eijx.g(new Callable() { // from class: cfov
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(this.a.a.t(ezolVar11));
                        }
                    }, this.d).h(new ejvr() { // from class: cfow
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return true;
                        }
                    }, eoqg.a);
                }
                cqca.o("BugleNetwork", "Unexpected wireball message type %s", ezwz.a(i2));
            } catch (evtj e3) {
                cqca.h("BugleNetwork", e3, "Exception parsing wireball message");
            }
        } else {
            cqca.o("BugleNetwork", "Unexpected inbox message type %d", Integer.valueOf(ezjiVarB.a()));
        }
        return eijx.e(true);
    }
}
