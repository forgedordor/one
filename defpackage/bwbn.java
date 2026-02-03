package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.BaseCryptoBuilder;
import com.google.communication.synapse.security.scytale.DbWrapperFactory;
import com.google.communication.synapse.security.scytale.KeyPair;
import com.google.communication.synapse.security.scytale.MessageEncryptorV2Builder;
import com.google.communication.synapse.security.scytale.NativeBaseCrypto;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import com.google.communication.synapse.security.scytale.Scope;
import com.google.communication.synapse.security.scytale.ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwbn {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "CryptoV2Provider");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider");
    public final bwln c;
    public final bwkr d;
    public final DbWrapperFactory e;
    public final cexn f;
    public final fcsu g;
    public final ConcurrentMap h = new ConcurrentHashMap();
    public final bwjg i;
    private final ceop j;
    private final eygg k;
    private final eosc l;
    private final eosc m;
    private final fcsu n;

    public bwbn(ceop ceopVar, bwln bwlnVar, eygg eyggVar, bwkr bwkrVar, bwlt bwltVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, bwjg bwjgVar, cexn cexnVar, fcsu fcsuVar2) {
        this.j = ceopVar;
        this.g = fcsuVar2;
        this.c = bwlnVar;
        this.k = eyggVar;
        this.d = bwkrVar;
        this.e = new bwbm(bwltVar);
        this.l = eoscVar;
        this.m = eoscVar2;
        this.n = fcsuVar;
        this.i = bwjgVar;
        this.f = cexnVar;
    }

    private final eiju d(String str) {
        return this.j.b(str).h(new ejvr() { // from class: bwbe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[][] bArr = (byte[][]) obj;
                evqs evqsVarX = evqs.x(bArr[0]);
                evqs evqsVarX2 = evqs.x(bArr[1]);
                ejwl.a(evqsVarX.d() == 33);
                ejwl.a(evqsVarX2.d() == 32);
                return new epqp(evqsVarX, evqsVarX2);
            }
        }, eoqg.a);
    }

    public final eiju a(final String str) {
        ConcurrentMap concurrentMap = this.h;
        synchronized (concurrentMap) {
            eiju eijuVar = (eiju) concurrentMap.get(str);
            if (eijuVar != null) {
                return eijuVar;
            }
            this.k.b();
            eiju eijuVarF = d(str).i(new eooz() { // from class: bwaz
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig defaultInstance;
                    epqq epqqVar = (epqq) obj;
                    String strA = bwls.a(epqqVar);
                    cqbd cqbdVarA = bwbn.a.a();
                    cqbdVarA.I("Building base crypto");
                    final String str2 = str;
                    cqbdVarA.x("normalizedPhoneNumber", str2, 2);
                    cqbdVarA.A("tableNamePrefix", strA);
                    cqbdVarA.r();
                    final bwbn bwbnVar = this.a;
                    Scope scopeCreate = Scope.create(bwbnVar.d.b());
                    BaseCryptoBuilder baseCryptoBuilderCreateBuilder = BaseCryptoBuilder.createBuilder(bwbnVar.e, new KeyPair(epqqVar.b().I(), epqqVar.a().I()));
                    ejyb.e(baseCryptoBuilderCreateBuilder);
                    cqce cqceVar = bwbt.a;
                    try {
                        defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.parseFrom((byte[]) bwbt.e.e(), evrr.a());
                    } catch (evtj e) {
                        bwbt.a.s("Error parsing ScytaleExperimentConfig, using default instance instead", e);
                        defaultInstance = ScytaleExperimentConfigOuterClass$ScytaleExperimentConfig.getDefaultInstance();
                    }
                    BaseCryptoBuilder experimentConfig = baseCryptoBuilderCreateBuilder.setExperimentConfig(defaultInstance);
                    ejyb.e(experimentConfig);
                    BaseCryptoBuilder tableNamePrefix = experimentConfig.setTableNamePrefix(strA);
                    ejyb.e(tableNamePrefix);
                    StatusOr<NativeBaseCrypto> statusOrBuild = tableNamePrefix.build(scopeCreate);
                    if (statusOrBuild.hasValue) {
                        bwbn.a.p("Base crypto created");
                        return eijx.e(statusOrBuild.value);
                    }
                    final fbtf fbtfVar = new fbtf(statusOrBuild.status);
                    if (statusOrBuild.status.getCode() != Status.q.getCode()) {
                        return eijx.d(fbtfVar);
                    }
                    cqbd cqbdVarA2 = bwbn.a.a();
                    cqbdVarA2.I("Resetting database due to a data loss failure");
                    cqbdVarA2.x("normalizedPhoneNumber", str2, 2);
                    cqbdVarA2.r();
                    eiju eijuVarN = bwbnVar.f.a(str2).n(cevp.LOW_PREKEYS);
                    eooz eoozVar = new eooz() { // from class: bwbj
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return bwbnVar.c(str2);
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    return eijuVarN.i(eoozVar, eoqgVar).h(new ejvr() { // from class: bwbk
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            bwbnVar.i.a(str2);
                            return null;
                        }
                    }, eoqgVar).i(new eooz() { // from class: bwbg
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return eijx.d(fbtfVar);
                        }
                    }, eoqgVar);
                }
            }, this.m).f(Throwable.class, new eooz() { // from class: bwbd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    bwbn.a.s("Failed to create base crypto", th);
                    ConcurrentMap concurrentMap2 = this.a.h;
                    String str2 = str;
                    synchronized (concurrentMap2) {
                        concurrentMap2.remove(str2);
                    }
                    return eijx.d(th);
                }
            }, eoqg.a);
            ConcurrentMap concurrentMap2 = this.h;
            synchronized (concurrentMap2) {
                concurrentMap2.putIfAbsent(str, eijuVarF);
            }
            return eijuVarF;
        }
    }

    public final eiju b(final String str) {
        eiju eijuVarE = ((bvut) this.n.b()).e(str);
        ejvr ejvrVar = new ejvr() { // from class: bwbl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                bwbn.a.r("CryptoV2Provider.get called while Etouffee is unprovisioned");
                throw new bwlo();
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarH = eijuVarE.h(ejvrVar, eoqgVar);
        final eiju eijuVarI = eijuVarH.i(new eooz() { // from class: bwba
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.a(str);
            }
        }, eoqgVar);
        eooz eoozVar = new eooz() { // from class: bwbb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.c.a(str);
            }
        };
        eosc eoscVar = this.l;
        final eiju eijuVarI2 = eijuVarH.i(eoozVar, eoscVar);
        return eijx.m(eijuVarI, eijuVarI2).a(new Callable() { // from class: bwbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                NativeBaseCrypto nativeBaseCrypto = (NativeBaseCrypto) eork.q(eijuVarI);
                String str2 = (String) eork.q(eijuVarI2);
                Scope scopeCreate = Scope.create(this.a.d.b());
                MessageEncryptorV2Builder messageEncryptorV2BuilderCreateBuilder = MessageEncryptorV2Builder.createBuilder(nativeBaseCrypto, ekjz.c(str), str2);
                ejyb.e(messageEncryptorV2BuilderCreateBuilder);
                MessageEncryptorV2Builder requireUserTrustedInfo = messageEncryptorV2BuilderCreateBuilder.setRequireUserTrustedInfo(true);
                ejyb.e(requireUserTrustedInfo);
                return (NativeMessageEncryptorV2) bwlb.a(requireUserTrustedInfo.build(scopeCreate));
            }
        }, eoscVar);
    }

    final eiju c(final String str) {
        a.p("Resetting crypto data store");
        return d(str).h(new ejvr() { // from class: bwbh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                String strA;
                bwbn bwbnVar = this.a;
                ConcurrentMap concurrentMap = bwbnVar.h;
                final String str2 = str;
                epqq epqqVar = (epqq) obj;
                synchronized (concurrentMap) {
                    concurrentMap.remove(str2);
                    Set setE = ((cozg) bwbnVar.g.b()).e();
                    if (setE.size() == 1 && ((Boolean) Collection.EL.stream(setE).findAny().map(new Function() { // from class: bwbf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return Boolean.valueOf(((aubq) obj2).d.equals(str2));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(false)).booleanValue()) {
                        ekrw ekrwVarH = bwbn.b.h();
                        ekrwVarH.X(eksq.a, "BugleE2eeEtouffee");
                        ekrd ekrdVar = (ekrd) ekrwVarH;
                        ekrdVar.X(cqnc.I, str2);
                        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider", "getScytaleTablesPrefixToDelete", 168, "CryptoV2Provider.java")).q("There is only one RCS identity, deleting all scytale tables");
                        strA = "scytale_";
                    } else {
                        ekrw ekrwVarH2 = bwbn.b.h();
                        ekrwVarH2.X(eksq.a, "BugleE2eeEtouffee");
                        ekrd ekrdVar2 = (ekrd) ekrwVarH2;
                        ekrdVar2.X(cqnc.I, str2);
                        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/CryptoV2Provider", "getScytaleTablesPrefixToDelete", 174, "CryptoV2Provider.java")).q("There are multiple RCS identities, deleting only identity specific scytale tables.");
                        strA = bwls.a(epqqVar);
                    }
                }
                return NativeBaseCrypto.resetDataStore(Scope.create(bwbnVar.d.b()), bwbnVar.e, strA);
            }
        }, this.l).h(new ejvr() { // from class: bwbi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Status status = (Status) obj;
                cqbd cqbdVarC = bwbn.a.c();
                cqbdVarC.I("Scytale resetDataStore completed");
                cqbdVarC.A("status", status);
                cqbdVarC.r();
                bwlb.b(status);
                return null;
            }
        }, eoqg.a);
    }
}
