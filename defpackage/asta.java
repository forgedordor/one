package defpackage;

import android.content.ContentValues;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asta implements assu {
    public static final eksp a = eksp.c("BugleRcsCapabilities");
    public final astp b;
    private final eosc c;
    private final eosc d;

    public asta(astp astpVar, eosc eoscVar, eosc eoscVar2) {
        this.b = astpVar;
        this.c = eoscVar;
        this.d = eoscVar2;
    }

    @Override // defpackage.assu
    public final eiju a(final aubq aubqVar) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 43, "RcsCapabilitiesDatabaseCachingSource.java")).t("RcsCapabilitiesDatabaseCachingSource: get with chatEndpoint %s", cqcv.b(aubqVar.d));
        return eijx.g(new Callable() { // from class: assy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = asta.a;
                aubq aubqVar2 = aubqVar;
                aubp aubpVarB = aubp.b(aubqVar2.c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                if (!eotp.a("bugle.enable_rbm_bot_capabilities_fetch", "bugle")) {
                    ejwl.a(aubpVarB.equals(aubp.PHONE));
                }
                final String str = aubqVar2.d;
                ejwl.b(!str.isEmpty(), "Invalid MSISDN while trying to get RCS Capabilities from RcsRemoteCapabilitiesCacheTable");
                String[] strArr = asux.a;
                asus asusVar = new asus(asux.a);
                asusVar.A("getRcsCapabilities");
                asusVar.c(new Function() { // from class: astj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        asuw asuwVar = (asuw) obj;
                        asuwVar.b(str);
                        return asuwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                astw astwVar = (astw) asusVar.b().l();
                if (astwVar == null) {
                    ((ekrd) ((ekrd) astp.a.h()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "getRcsCapabilities", 109, "RcsCapabilitiesDatabaseOperations.java")).q("No RCS Capabilities found cached in database");
                    return Optional.empty();
                }
                int i = asts.b;
                aste asteVar = new aste();
                asteVar.c(astwVar.d());
                asteVar.b(astwVar.e());
                return Optional.of(asteVar.a());
            }
        }, this.c);
    }

    @Override // defpackage.assu
    public final eiju b(final Iterable iterable) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "get", 54, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: reading %d chatEndpoints", ekis.b(iterable));
        return eijx.g(new Callable() { // from class: assz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = asta.a;
                return astp.b(iterable);
            }
        }, this.d);
    }

    @Override // defpackage.assu
    public final eiju c(final Map map) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 90, "RcsCapabilitiesDatabaseCachingSource.java")).r("RcsCapabilitiesDatabaseCachingSource: writing %d chatEndpoints", map.size());
        return eijx.f(new Runnable() { // from class: assx
            @Override // java.lang.Runnable
            public final void run() {
                final Map map2 = map;
                this.a.b.b.d("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresherBatched", new Runnable() { // from class: asth
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map3 = map2;
                        ekgp ekgpVarB = astp.b(map3.keySet());
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map3.entrySet()) {
                            if (ekgpVarB.containsKey(entry.getKey())) {
                                if (((asts) entry.getValue()).b().isAfter(((asts) ekgpVarB.get(entry.getKey())).b())) {
                                    arrayList.add(astp.a(entry));
                                }
                            } else {
                                arrayList.add(astp.a(entry));
                            }
                        }
                        dqru.B(asux.a(), 5, false, new BiConsumer() { // from class: astt
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                String[] strArr = asux.a;
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer);
                            }
                        }, (astw[]) arrayList.toArray(new astw[arrayList.size()]));
                    }
                });
            }
        }, this.d);
    }

    @Override // defpackage.assu
    public final eiju d(final aubq aubqVar, final asts astsVar) {
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 66, "RcsCapabilitiesDatabaseCachingSource.java")).D("RcsCapabilitiesDatabaseCachingSource: put with chatEndpoint %s and capabilities %s", cqcv.b(aubqVar.d), astsVar.a().b);
        Callable callable = new Callable() { // from class: assv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aubq aubqVar2 = aubqVar;
                asts astsVar2 = astsVar;
                final asva asvaVarA = astsVar2.a();
                final Instant instantB = astsVar2.b();
                final String str = aubqVar2.d;
                ejwl.b(!str.isEmpty(), "Cannot insert RCS capabilities into RcsRemoteCapabilitiesCacheTable, MSISDN is empty");
                Boolean bool = (Boolean) this.a.b.b.c("RcsCapabilitiesDatabaseOperations#writeRcsCapabilitiesIfFresher", new ejxr() { // from class: asti
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr = asux.a;
                        asuu asuuVar = new asuu();
                        asuuVar.ap("writeRcsCapabilitiesIfFresher");
                        ContentValues contentValues = asuuVar.a;
                        final String str2 = str;
                        dqru.v(contentValues, "msisdn", str2);
                        asva asvaVar = asvaVarA;
                        contentValues.put("rcs_capabilities", asvaVar.toByteArray());
                        final Instant instant = instantB;
                        contentValues.put("last_refresh_timestamp", Long.valueOf(bart.a(instant)));
                        asuuVar.af(new asuv((asuw) new Function() { // from class: asto
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                asuw asuwVar = (asuw) obj;
                                asuwVar.b(str2);
                                asuwVar.ap(new dqpj("rcs_remote_capabilities_cache.last_refresh_timestamp", 10, Long.valueOf(bart.a(instant))));
                                return asuwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }.apply(new asuw())));
                        if (asuuVar.b().e() <= 0) {
                            astz astzVar = new astz();
                            astzVar.c(str2);
                            astzVar.d(asvaVar);
                            astzVar.b(instant);
                            astw astwVarA = astzVar.a();
                            final dqsy dqsyVarA = asux.a();
                            long jB = dqru.b(asux.a(), "rcs_remote_capabilities_cache", astwVarA, new Function() { // from class: astu
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    return Long.valueOf(dqsyVarA.Q("rcs_remote_capabilities_cache", (dqst) obj, 4));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Consumer() { // from class: astv
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            Long.valueOf(jB).getClass();
                            if (jB == -1) {
                                ((ekrd) ((ekrd) astp.a.h()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations", "writeRcsCapabilitiesIfFresher", 279, "RcsCapabilitiesDatabaseOperations.java")).t("RCS capabilities were not inserted or updated in the database for MessagingIdentity %s", cqcv.b(str2));
                                return false;
                            }
                        }
                        return true;
                    }
                });
                bool.booleanValue();
                return bool;
            }
        };
        eosc eoscVar = this.c;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: assw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = asta.a;
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                ((eksl) ((eksl) asta.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/RcsCapabilitiesDatabaseCachingSource", "put", 80, "RcsCapabilitiesDatabaseCachingSource.java")).q("Did not put capabilities into the database cache.");
                return null;
            }
        }, eoscVar);
    }
}
