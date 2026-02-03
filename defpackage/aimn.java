package defpackage;

import android.content.Context;
import com.android.vcard.VCardConfig;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aimn implements aimb, aimo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl");
    private static final cqce d = cqce.g("BugleClearcutLogger", "ClearcutLoggerV2");
    public final Executor b;
    public final cogw c;
    private final ekgp e;
    private final Context f;
    private final fcsu g;
    private final aipj h;
    private final ekgp i;
    private final ekgp j;
    private final ekgp k;
    private final Long m;
    private final Long o;
    private final boolean p;
    private final ejxr q;
    private final ailp r;
    private final aimi l = new aimi();
    private final AtomicLong n = new AtomicLong();

    public aimn(ailp ailpVar, Context context, boolean z, ejxr ejxrVar, cogw cogwVar, fcsu fcsuVar, aipj aipjVar, Executor executor, int i) {
        ekgp ekgpVarB;
        this.r = ailpVar;
        this.f = context;
        this.q = ejxrVar;
        this.c = cogwVar;
        this.p = z;
        long jMax = Math.max(((Long) ainq.b.e()).longValue(), 1L);
        boolean z2 = jMax >= 0;
        int i2 = eonm.b;
        ejwl.e(z2, "value (%s) is outside the range for an unsigned long value", jMax);
        eonm eonmVar = new eonm(jMax);
        long j = new eonm(UUID.randomUUID().getLeastSignificantBits()).a;
        long j2 = eonmVar.a;
        if (j2 < 0) {
            if (eonn.a(j, j2) >= 0) {
                j -= j2;
            }
        } else if (j >= 0) {
            j %= j2;
        } else {
            long j3 = (j >>> 1) / j2;
            long j4 = j - ((j3 + j3) * j2);
            j = j4 - (eonn.a(j4, j2) >= 0 ? j2 : 0L);
        }
        this.m = Long.valueOf(new eonm(j).a);
        this.o = Long.valueOf(Math.max(((Integer) ainq.a.e()).intValue(), 1L));
        this.k = ekgp.o(aiou.PER_EVENT_THROTTLING, new aimm(ejxrVar), aiou.ONCE_PER_APP_START, new aiml(), aiou.ALWAYS_LOGGING, new aimk(), aiou.NO_LOGGING, new aimj());
        this.g = fcsuVar;
        this.h = aipjVar;
        this.b = executor;
        try {
            aion aionVar = (aion) evsn.parseFrom(aion.a, (byte[]) ainq.c.e(), evrr.a());
            ekgi ekgiVar = new ekgi();
            for (aiol aiolVar : aionVar.b) {
                aioj aiojVarB = aioj.b(aiolVar.b);
                if (aiojVarB == null) {
                    aiojVarB = aioj.LOG_SPEC_UNSPECIFIED;
                }
                ekgiVar.i(aiojVarB, aiolVar);
            }
            ekgpVarB = ekgiVar.b();
        } catch (Exception e) {
            d.s("Failed to parse logging configuration flag", e);
            ekgpVarB = ekoj.a;
        }
        this.i = ekgpVarB;
        eyek eyekVar = eyek.DEFAULT;
        dbyl dbylVarD = d(i, eyekVar);
        eyek eyekVar2 = eyek.FAST_IF_RADIO_AWAKE;
        dbyl dbylVarD2 = d(i, eyekVar2);
        eyek eyekVar3 = eyek.UNMETERED_OR_DAILY;
        dbyl dbylVarD3 = d(i, eyekVar3);
        eyek eyekVar4 = eyek.UNMETERED_ONLY;
        this.e = ekgp.o(eyekVar, dbylVarD, eyekVar2, dbylVarD2, eyekVar3, dbylVarD3, eyekVar4, d(i, eyekVar4));
        this.j = (ekgp) Collection.EL.stream(ekgpVarB.entrySet()).collect(ekcv.a(new Function() { // from class: aimc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (aioj) ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: aimd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new aioq((aiol) ((Map.Entry) obj).getValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
    }

    private final dbyl d(int i, eyek eyekVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            ailp ailpVar = this.r;
            List list = dbyl.m;
            dbyi dbyiVar = new dbyi(ailpVar.a, "ANDROID_MESSAGING");
            dbyiVar.b(eyekVar);
            return dbyiVar.c();
        }
        if (i2 != 1) {
            dbyi dbyiVarI = dbyl.i(this.r.a, "ANDROID_MESSAGING");
            dbyiVarI.b(eyekVar);
            return dbyiVarI.c();
        }
        dbyi dbyiVarH = dbyl.h(this.r.a, "ANDROID_MESSAGING");
        dbyiVarH.b(eyekVar);
        return dbyiVarH.c();
    }

    @Override // defpackage.aimb
    public final ailn a() {
        ailj ailjVar = new ailj();
        ailjVar.a = this;
        return ailjVar;
    }

    @Override // defpackage.aimo
    public final Optional b(aioj aiojVar) {
        ekgp ekgpVar = this.i;
        if (!ekgpVar.containsKey(aiojVar)) {
            return Optional.empty();
        }
        aiox aioxVar = ((aiol) ekgpVar.get(aiojVar)).d;
        if (aioxVar == null) {
            aioxVar = aiox.a;
        }
        if (((Random) this.q.get()).nextDouble() >= aioxVar.b) {
            return Optional.empty();
        }
        try {
            Stream map = DesugarArrays.stream(Thread.currentThread().getStackTrace()).skip(Math.max(aioxVar.c, 0)).limit(Math.max(aioxVar.d, 0)).map(new Function() { // from class: aime
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((StackTraceElement) obj).toString();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            return Optional.of((List) map.collect(ekcv.a));
        } catch (RuntimeException e) {
            d.s("Failed to generate stacktrace", e);
            return Optional.of(ekgb.r("Failed to extract stacktrace"));
        }
    }

    @Override // defpackage.aimo
    public final void c(final ailo ailoVar) {
        boolean zA;
        ailk ailkVar = (ailk) ailoVar;
        aioj aiojVar = ailkVar.b;
        ekgp ekgpVar = this.i;
        if (ekgpVar.containsKey(aiojVar)) {
            aiol aiolVar = (aiol) ekgpVar.get(aiojVar);
            ekgp ekgpVar2 = this.k;
            aiov aiovVar = aiolVar.c;
            if (aiovVar == null) {
                aiovVar = aiov.a;
            }
            aiou aiouVarB = aiou.b(aiovVar.b);
            if (aiouVarB == null) {
                aiouVarB = aiou.UNKNOWN_SAMPLING_MODE;
            }
            zA = ((aimh) ekgpVar2.getOrDefault(aiouVarB, this.l)).a(aiolVar);
        } else {
            zA = ((Boolean) ainq.d.e()).booleanValue();
        }
        if (zA) {
            embj embjVar = (embj) embk.a.createBuilder();
            embjVar.copyOnWrite();
            embk embkVar = (embk) embjVar.instance;
            embkVar.c = aiojVar.aj;
            embkVar.b |= 1;
            int i = ailkVar.f;
            embjVar.copyOnWrite();
            embk embkVar2 = (embk) embjVar.instance;
            embkVar2.d = i - 1;
            embkVar2.b |= 2;
            Optional optionalOr = ailkVar.c.or(new Supplier() { // from class: aimf
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.a.b(((ailk) ailoVar).b);
                }
            });
            if (!optionalOr.isEmpty()) {
                for (String str : (List) optionalOr.get()) {
                    embjVar.copyOnWrite();
                    embk embkVar3 = (embk) embjVar.instance;
                    str.getClass();
                    evtg evtgVar = embkVar3.e;
                    if (!evtgVar.c()) {
                        embkVar3.e = evsn.mutableCopy(evtgVar);
                    }
                    embkVar3.e.add(str);
                }
            }
            final ellg ellgVar = ailkVar.a;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            embk embkVar4 = (embk) embjVar.build();
            ellh ellhVar2 = ellh.a;
            embkVar4.getClass();
            ellhVar.bL = embkVar4;
            ellhVar.g |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (this.p) {
                long jIncrementAndGet = this.n.incrementAndGet();
                ewek ewekVar = (ewek) ewel.a.createBuilder();
                long jLongValue = this.m.longValue();
                ewekVar.copyOnWrite();
                ewel ewelVar = (ewel) ewekVar.instance;
                ewelVar.b |= 4;
                ewelVar.e = jLongValue;
                long jLongValue2 = jIncrementAndGet % this.o.longValue();
                ewekVar.copyOnWrite();
                ewel ewelVar2 = (ewel) ewekVar.instance;
                ewelVar2.b |= 8;
                ewelVar2.f = jLongValue2;
                ellgVar.copyOnWrite();
                ellh ellhVar3 = (ellh) ellgVar.instance;
                ewel ewelVar3 = (ewel) ewekVar.build();
                ewelVar3.getClass();
                ellhVar3.aZ = ewelVar3;
                ellhVar3.f |= 4;
            }
            ellf ellfVarB = ellf.b(((ellh) ellgVar.instance).j);
            if (ellfVarB == null) {
                ellfVarB = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            Optional optional = ailkVar.e;
            emxt emxtVar = emxt.UNKNOWN_BUGLE_EVENT_CODE;
            final emxt emxtVar2 = (emxt) optional.orElse(emxtVar);
            ellfVarB.getClass();
            emxtVar2.getClass();
            if (emxtVar2 == emxtVar) {
                Object objFM = new ainx().fM(ellfVarB);
                if (objFM == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                emxtVar2 = (emxt) objFM;
            }
            ekgp ekgpVar3 = this.j;
            eyek eyekVar = eyek.DEFAULT;
            aioq aioqVar = (aioq) ekgpVar3.get(aiojVar);
            if (aioqVar != null) {
                ellf ellfVarB2 = ellf.b(((ellh) ellgVar.instance).j);
                if (ellfVarB2 == null) {
                    ellfVarB2 = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
                }
                ellfVarB2.getClass();
                Map map = aioqVar.a;
                if (map.containsKey(ellfVarB2)) {
                    Object obj = map.get(ellfVarB2);
                    obj.getClass();
                    eyekVar = (eyek) obj;
                } else {
                    Map map2 = aioqVar.b;
                    if (map2.containsKey(emxtVar2)) {
                        Object obj2 = map2.get(emxtVar2);
                        obj2.getClass();
                        eyekVar = (eyek) obj2;
                    } else {
                        eyekVar = aioqVar.c;
                        eyekVar.getClass();
                    }
                }
            } else {
                ((ekrd) d.i().h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 199, "BugleClearcutLoggerV2Impl.java")).t("qosTierResolver for %s is null. Using DEFAULT QoS tier as there's no specific QoS configuration for this log spec.", aiojVar.name());
            }
            dbyl dbylVar = (dbyl) this.e.get(eyekVar);
            if (dbylVar == null) {
                throw new IllegalStateException("clearcutLogger for " + eyekVar.name() + " is null. ");
            }
            final dbyk dbykVarK = dbylVar.k(ellgVar.build(), dqnz.b(this.f, new elgw()));
            dbykVarK.j(emxtVar2.ds);
            if (!dbylVar.e()) {
                dbykVarK.g("com.google.android.ims.library");
            }
            Optional optional2 = ailkVar.d;
            if (optional2.isPresent()) {
                dbykVarK.k(((ainn) optional2.get()).a, ((ainn) optional2.get()).b);
            }
            aipj aipjVar = this.h;
            ellf ellfVarB3 = ellf.b(((ellh) ellgVar.instance).j);
            if (ellfVarB3 == null) {
                ellfVarB3 = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
            }
            if (((aqbq) aipjVar.b.b()).a()) {
                if (((ekgp) aipjVar.d.get()).containsKey(ellfVarB3)) {
                    if (TimeUnit.MILLISECONDS.toSeconds(aipjVar.a.f().toEpochMilli()) > ((Integer) ((ekgp) r4.get()).get(ellfVarB3)).intValue()) {
                        return;
                    }
                }
                if (((ekgp) aipjVar.c.get()).containsKey(emxtVar2)) {
                    if (TimeUnit.MILLISECONDS.toSeconds(aipjVar.a.f().toEpochMilli()) > ((Integer) ((ekgp) r1.get()).get(emxtVar2)).intValue()) {
                        return;
                    }
                }
            }
            aisn aisnVar = (aisn) this.g.b();
            ellh ellhVar4 = (ellh) ellgVar.build();
            ellhVar4.getClass();
            auvh.h(auvw.c(aisnVar.a, fcyi.a, fdjz.a, new aisi(aisnVar, ellhVar4, emxtVar2, null)).h(new ejvr() { // from class: aimg
                @Override // defpackage.ejvr
                public final Object apply(Object obj3) {
                    if (!((Boolean) obj3).booleanValue()) {
                        dbykVarK.c();
                    }
                    emxt emxtVar3 = emxtVar2;
                    ellh ellhVar5 = (ellh) ellgVar.build();
                    ekrw ekrwVarF = aimn.a.f();
                    ekrwVarF.X(eksq.a, "BugleClearcutLogger");
                    ekrd ekrdVar = (ekrd) ekrwVarF;
                    ekrdVar.X(aiuq.m, Boolean.valueOf(!r6.booleanValue()));
                    ekrdVar.X(aiuq.d, Integer.valueOf(ellhVar5.getSerializedSize()));
                    ekrdVar.X(aiuq.n, emxtVar3);
                    ekrdVar.X(aiuq.c, ellhVar5);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 252, "BugleClearcutLoggerV2Impl.java")).q("\nprotobuf ");
                    return null;
                }
            }, this.b));
        }
    }
}
