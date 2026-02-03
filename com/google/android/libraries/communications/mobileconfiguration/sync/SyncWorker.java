package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ceao;
import defpackage.difj;
import defpackage.digu;
import defpackage.digv;
import defpackage.ehli;
import defpackage.ejvr;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.eooq;
import defpackage.eooz;
import defpackage.eork;
import defpackage.eosc;
import defpackage.ewzv;
import defpackage.ewzw;
import defpackage.exaf;
import defpackage.exag;
import defpackage.exao;
import defpackage.exaq;
import defpackage.fbgc;
import defpackage.qaq;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SyncWorker extends qaq {
    private final digv e;
    private final eosc f;

    /* compiled from: PG */
    public interface a {
        digv dB();

        eosc eL();
    }

    public SyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.e = aVar.dB();
        this.f = aVar.eL();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        ListenableFuture listenableFutureG;
        final UUID uuidG = g();
        ekrg ekrgVar = digv.a;
        ekrd ekrdVar = (ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 103, "SyncHelper.java");
        final digv digvVar = this.e;
        UUID uuid = digvVar.h;
        ekrdVar.D("[%s] sync started, workRequestId:%s", uuid, uuidG);
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        exaf exafVar = (exaf) exag.a.createBuilder();
        String string = uuid.toString();
        exafVar.copyOnWrite();
        exag exagVar = (exag) exafVar.instance;
        string.getClass();
        exagVar.b |= 1;
        exagVar.e = string;
        String string2 = uuidG.toString();
        exafVar.copyOnWrite();
        exag exagVar2 = (exag) exafVar.instance;
        string2.getClass();
        exagVar2.b |= 2;
        exagVar2.f = string2;
        exao exaoVar = exao.a;
        exafVar.copyOnWrite();
        exag exagVar3 = (exag) exafVar.instance;
        exaoVar.getClass();
        exagVar3.d = exaoVar;
        exagVar3.c = 2;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exag exagVar4 = (exag) exafVar.build();
        exagVar4.getClass();
        ewzwVar.c = exagVar4;
        ewzwVar.b = 3;
        ewzw ewzwVar2 = (ewzw) ewzvVar.build();
        ceao ceaoVar = digvVar.i;
        ceaoVar.a(ewzwVar2);
        if (fbgc.a.get().i(digvVar.b)) {
            listenableFutureG = eooq.g(digvVar.f.submit(new Callable() { // from class: digs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ((digf) digvVar.c.b()).c();
                }
            }), new eooz() { // from class: digt
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Optional optional;
                    ListenableFuture listenableFutureF;
                    ListenableFuture listenableFuture;
                    int i;
                    Optional optional2 = (Optional) obj;
                    boolean zIsEmpty = optional2.isEmpty();
                    final digv digvVar2 = digvVar;
                    final UUID uuid2 = uuidG;
                    if (zIsEmpty) {
                        ekrd ekrdVar2 = (ekrd) ((ekrd) digv.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 128, "SyncHelper.java");
                        UUID uuid3 = digvVar2.h;
                        ekrdVar2.D("[%s] sync aborted because failed to get parameters, workRequestId:%s", uuid3, uuid2);
                        digvVar2.i.a(difj.b(uuid3, 3, uuid2));
                        return eork.i(digu.FAILURE);
                    }
                    Context context = digvVar2.b;
                    ekgp ekgpVar = fbgc.c(context) ? (ekgp) Collection.EL.stream(((ekgp) optional2.get()).entrySet()).filter(new Predicate() { // from class: digo
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
                        public final boolean test(Object obj2) {
                            Map.Entry entry = (Map.Entry) obj2;
                            int i2 = ((digh) entry.getValue()).b & 2;
                            digv digvVar3 = digvVar2;
                            if (i2 == 0) {
                                ((ekrd) ((ekrd) digv.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 145, "SyncHelper.java")).t("[%s] configData has no configuration, enforce a sync.", digvVar3.h);
                                return true;
                            }
                            etsc etscVar = ((digh) entry.getValue()).d;
                            if (etscVar == null) {
                                etscVar = etsc.a;
                            }
                            evrj evrjVar = etscVar.f;
                            if (evrjVar == null) {
                                evrjVar = evrj.a;
                            }
                            Duration durationC = evwz.c(evrjVar);
                            evvp evvpVar = ((digh) entry.getValue()).e;
                            if (evvpVar == null) {
                                evvpVar = evvp.a;
                            }
                            Duration durationBetween = Duration.between(evwz.d(evvpVar), Instant.now());
                            Duration durationOfSeconds = Duration.ofSeconds(fbgc.a.get().a(digvVar3.b));
                            boolean z = durationC.minus(durationBetween).compareTo(durationOfSeconds) <= 0;
                            ((ekrd) ((ekrd) digv.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 166, "SyncHelper.java")).K("[%s] configValidity: %s, durationSinceLastUpdate: %s, batchSyncConfigExpireInterval: %s, shouldSync: %s", digvVar3.h, durationC, durationBetween, durationOfSeconds, Boolean.valueOf(z));
                            return z;
                        }
                    }).collect(ekcv.a(new Function() { // from class: digp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (String) ((Map.Entry) obj2).getKey();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: digq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return (digh) ((Map.Entry) obj2).getValue();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    })) : (ekgp) optional2.get();
                    if (ekgpVar.isEmpty()) {
                        ekrd ekrdVar3 = (ekrd) ((ekrd) digv.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncAboutToExpireConfigData", 182, "SyncHelper.java");
                        UUID uuid4 = digvVar2.h;
                        ekrdVar3.D("[%s] sync aborted because no parameters are stored, workRequestId:%s", uuid4, uuid2);
                        digvVar2.i.a(difj.c(uuid4, 3, uuid2));
                        return eork.i(digu.NO_PARAMETERS_STORED);
                    }
                    ekgi ekgiVar = new ekgi();
                    Iterator it = ekgpVar.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        digh dighVar = (digh) entry.getValue();
                        etrz etrzVar = (etrz) etsa.a.createBuilder();
                        String packageName = context.getPackageName();
                        etrzVar.copyOnWrite();
                        etsa etsaVar = (etsa) etrzVar.instance;
                        packageName.getClass();
                        etsaVar.b = packageName;
                        try {
                            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = -1;
                        }
                        etrzVar.copyOnWrite();
                        ((etsa) etrzVar.instance).c = i;
                        etsa etsaVar2 = (etsa) etrzVar.build();
                        etrz etrzVar2 = (etrz) etsa.a.createBuilder();
                        etrzVar2.copyOnWrite();
                        ((etsa) etrzVar2.instance).b = "com.google.android.gms";
                        dcdt dcdtVar = dcdt.a;
                        long jA = dceq.a(digvVar2.b);
                        etrzVar2.copyOnWrite();
                        ((etsa) etrzVar2.instance).c = jA;
                        etsa etsaVar3 = (etsa) etrzVar2.build();
                        etse etseVar = dighVar.c;
                        if (etseVar == null) {
                            etseVar = etse.a;
                        }
                        etsd etsdVar = (etsd) etseVar.toBuilder();
                        etsdVar.copyOnWrite();
                        ((etse) etsdVar.instance).g = etse.emptyProtobufList();
                        etsdVar.a(etsaVar2);
                        etsdVar.a(etsaVar3);
                        etse etseVar2 = (etse) etsdVar.build();
                        digg diggVar = (digg) dighVar.toBuilder();
                        diggVar.copyOnWrite();
                        digh dighVar2 = (digh) diggVar.instance;
                        etseVar2.getClass();
                        dighVar2.c = etseVar2;
                        dighVar2.b |= 1;
                        ekgiVar.i((String) entry.getKey(), (digh) diggVar.build());
                    }
                    ekgp ekgpVarC = ekgiVar.c();
                    final difz difzVar = (difz) digvVar2.d.b();
                    final UUID uuid5 = digvVar2.h;
                    Optional optional3 = difzVar.h;
                    if (optional3.isEmpty()) {
                        ((ekrd) ((ekrd) difz.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 194, "RpcManager.java")).t("[%s] failed to create mobileConfigurationClient", uuid5);
                        listenableFutureF = eork.i(new difm(4));
                        optional = optional2;
                    } else {
                        final AtomicReference atomicReference = (AtomicReference) optional3.get();
                        eosc eoscVar = difzVar.d;
                        ListenableFuture listenableFutureSubmit = eoscVar.submit(new Callable() { // from class: difq
                            /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
                            @Override // java.util.concurrent.Callable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object call() {
                                /*
                                    Method dump skipped, instructions count: 262
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.difq.call():java.lang.Object");
                            }
                        });
                        int i2 = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        ekfw ekfwVar2 = new ekfw();
                        int i3 = 0;
                        for (Map.Entry entry2 : ekgpVarC.entrySet()) {
                            etse etseVar3 = ((digh) entry2.getValue()).c;
                            if (etseVar3 == null) {
                                etseVar3 = etse.a;
                            }
                            etsd etsdVar2 = (etsd) etseVar3.toBuilder();
                            String string3 = Integer.toString(i3);
                            etsdVar2.copyOnWrite();
                            ekgp ekgpVar2 = ekgpVarC;
                            etse etseVar4 = (etse) etsdVar2.instance;
                            string3.getClass();
                            etseVar4.c = string3;
                            if ((etseVar4.b & 2) != 0) {
                                etto ettoVar = etseVar4.f;
                                if (ettoVar == null) {
                                    ettoVar = etto.a;
                                }
                                String strB = ffhj.b(ettoVar.c, '0');
                                etto ettoVar2 = ((etse) etsdVar2.instance).f;
                                if (ettoVar2 == null) {
                                    ettoVar2 = etto.a;
                                }
                                ettn ettnVar = (ettn) ettoVar2.toBuilder();
                                ettnVar.copyOnWrite();
                                listenableFuture = listenableFutureSubmit;
                                etto ettoVar3 = (etto) ettnVar.instance;
                                strB.getClass();
                                ettoVar3.c = strB;
                                etto ettoVar4 = (etto) ettnVar.build();
                                etsdVar2.copyOnWrite();
                                etse etseVar5 = (etse) etsdVar2.instance;
                                ettoVar4.getClass();
                                etseVar5.f = ettoVar4;
                                etseVar5.b |= 2;
                            } else {
                                listenableFuture = listenableFutureSubmit;
                            }
                            ekfwVar.h((etse) etsdVar2.build());
                            ekfwVar2.h((String) entry2.getKey());
                            i3++;
                            ekgpVarC = ekgpVar2;
                            listenableFutureSubmit = listenableFuture;
                        }
                        final ekgp ekgpVar3 = ekgpVarC;
                        ListenableFuture listenableFuture2 = listenableFutureSubmit;
                        ekgb ekgbVarG = ekfwVar.g();
                        final ekgb ekgbVarG2 = ekfwVar2.g();
                        etsg etsgVar = (etsg) etsh.a.createBuilder();
                        ettl ettlVar = (ettl) ettm.a.createBuilder();
                        String string4 = uuid5.toString();
                        ettlVar.copyOnWrite();
                        ettm ettmVar = (ettm) ettlVar.instance;
                        string4.getClass();
                        ettmVar.b = string4;
                        long j = difzVar.b;
                        ettlVar.copyOnWrite();
                        optional = optional2;
                        ((ettm) ettlVar.instance).c = j;
                        ettm ettmVar2 = (ettm) ettlVar.build();
                        etsgVar.copyOnWrite();
                        etsh etshVar = (etsh) etsgVar.instance;
                        ettmVar2.getClass();
                        etshVar.c = ettmVar2;
                        etshVar.b |= 1;
                        etsgVar.copyOnWrite();
                        etsh etshVar2 = (etsh) etsgVar.instance;
                        evtg evtgVar = etshVar2.d;
                        if (!evtgVar.c()) {
                            etshVar2.d = evsn.mutableCopy(evtgVar);
                        }
                        evpz.addAll(ekgbVarG, etshVar2.d);
                        final etsh etshVar3 = (etsh) etsgVar.build();
                        ekrg ekrgVar2 = difz.a;
                        ((ekrd) ((ekrd) ekrgVar2.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 242, "RpcManager.java")).D("[%s] making getConfiguration request, workRequestId:%s", uuid5, uuid2);
                        ((ekrd) ((ekrd) ekrgVar2.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 244, "RpcManager.java")).t("GetConfigurationRequest: %s", etshVar3);
                        ceao ceaoVar2 = difzVar.k;
                        int i4 = ((ekoe) ekgbVarG).c;
                        ewzv ewzvVar2 = (ewzv) ewzw.a.createBuilder();
                        exaf exafVar2 = (exaf) exag.a.createBuilder();
                        String string5 = uuid5.toString();
                        exafVar2.copyOnWrite();
                        exag exagVar5 = (exag) exafVar2.instance;
                        string5.getClass();
                        exagVar5.b |= 1;
                        exagVar5.e = string5;
                        String string6 = uuid2.toString();
                        exafVar2.copyOnWrite();
                        exag exagVar6 = (exag) exafVar2.instance;
                        string6.getClass();
                        exagVar6.b |= 2;
                        exagVar6.f = string6;
                        exaj exajVar = (exaj) exak.a.createBuilder();
                        exajVar.copyOnWrite();
                        exak exakVar = (exak) exajVar.instance;
                        exakVar.b |= 1;
                        exakVar.c = i4;
                        exafVar2.copyOnWrite();
                        exag exagVar7 = (exag) exafVar2.instance;
                        exak exakVar2 = (exak) exajVar.build();
                        exakVar2.getClass();
                        exagVar7.d = exakVar2;
                        exagVar7.c = 4;
                        ewzvVar2.copyOnWrite();
                        ewzw ewzwVar3 = (ewzw) ewzvVar2.instance;
                        exag exagVar8 = (exag) exafVar2.build();
                        exagVar8.getClass();
                        ewzwVar3.c = exagVar8;
                        ewzwVar3.b = 3;
                        ceaoVar2.a((ewzw) ewzvVar2.build());
                        eoqt eoqtVarT = eoqt.t(eooq.g(eoqt.t(listenableFuture2), new eooz() { // from class: difr
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                etsp etspVar = (etsp) atomicReference.get();
                                fbnd fbndVar = etspVar.a;
                                fbrk fbrkVarA = etsq.a;
                                if (fbrkVarA == null) {
                                    synchronized (etsq.class) {
                                        fbrkVarA = etsq.a;
                                        if (fbrkVarA == null) {
                                            fbrh fbrhVarA = fbrk.a();
                                            fbrhVarA.c = fbrj.UNARY;
                                            fbrhVarA.d = fbrk.c("google.internal.communications.mobileconfiguration.v1.MobileConfigurationService", "GetConfiguration");
                                            fbrhVarA.b();
                                            etsh etshVar4 = etsh.a;
                                            evrr evrrVar = fcrj.a;
                                            fbrhVarA.a = new fcrh(etshVar4);
                                            fbrhVarA.b = new fcrh(etsj.a);
                                            fbrkVarA = fbrhVarA.a();
                                            etsq.a = fbrkVarA;
                                        }
                                    }
                                }
                                return fcrw.a(fbndVar.a(fbrkVarA, etspVar.b), etshVar3);
                            }
                        }, eoscVar));
                        ejvr ejvrVar = new ejvr() { // from class: difs
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r6v28, types: [eygg, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r6v31, types: [eygg, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r9v12, types: [eygg, java.lang.Object] */
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                Map map;
                                etsj etsjVar = (etsj) obj2;
                                ekrg ekrgVar3 = difz.a;
                                ekrd ekrdVar4 = (ekrd) ((ekrd) ekrgVar3.h()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 276, "RpcManager.java");
                                UUID uuid6 = uuid5;
                                UUID uuid7 = uuid2;
                                ekrdVar4.D("[%s] processing getConfiguration response, workRequestId:%s", uuid6, uuid7);
                                ((ekrd) ((ekrd) ekrgVar3.g()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 278, "RpcManager.java")).t("GetConfigurationResponse: %s", etsjVar);
                                int size = etsjVar.b.size();
                                ewzv ewzvVar3 = (ewzv) ewzw.a.createBuilder();
                                exaf exafVar3 = (exaf) exag.a.createBuilder();
                                String string7 = uuid6.toString();
                                exafVar3.copyOnWrite();
                                exag exagVar9 = (exag) exafVar3.instance;
                                string7.getClass();
                                exagVar9.b |= 1;
                                exagVar9.e = string7;
                                String string8 = uuid7.toString();
                                exafVar3.copyOnWrite();
                                exag exagVar10 = (exag) exafVar3.instance;
                                string8.getClass();
                                exagVar10.b |= 2;
                                exagVar10.f = string8;
                                exal exalVar = (exal) exam.a.createBuilder();
                                exalVar.copyOnWrite();
                                exam examVar = (exam) exalVar.instance;
                                examVar.b |= 1;
                                examVar.c = size;
                                exafVar3.copyOnWrite();
                                exag exagVar11 = (exag) exafVar3.instance;
                                exam examVar2 = (exam) exalVar.build();
                                examVar2.getClass();
                                exagVar11.d = examVar2;
                                exagVar11.c = 5;
                                ewzvVar3.copyOnWrite();
                                ewzw ewzwVar4 = (ewzw) ewzvVar3.instance;
                                exag exagVar12 = (exag) exafVar3.build();
                                exagVar12.getClass();
                                ewzwVar4.c = exagVar12;
                                ewzwVar4.b = 3;
                                ewzw ewzwVar5 = (ewzw) ewzvVar3.build();
                                difz difzVar2 = difzVar;
                                difzVar2.k.a(ewzwVar5);
                                HashSet hashSet = new HashSet(etsjVar.c);
                                AtomicReference atomicReference2 = difzVar2.j;
                                if (!hashSet.equals(atomicReference2.get())) {
                                    Optional optional4 = difzVar2.i;
                                    optional4.isPresent();
                                    atomicReference2.set(hashSet);
                                    int[] array = Collection.EL.stream(etsjVar.c).mapToInt(new ToIntFunction() { // from class: difw
                                        @Override // java.util.function.ToIntFunction
                                        public final int applyAsInt(Object obj3) {
                                            return ((Integer) obj3).intValue();
                                        }
                                    }).toArray();
                                    if (fbfw.a.get().e(difzVar2.c)) {
                                        ekqh it2 = ((ekgb) difzVar2.g).iterator();
                                        while (it2.hasNext()) {
                                            ((ddzn) optional4.get().b()).p(array, (String) it2.next());
                                        }
                                    } else {
                                        ((ddzn) optional4.get().b()).p(array, "ANDROID_MESSAGING");
                                        ((ddzn) optional4.get().b()).p(array, "CARRIER_SERVICES");
                                    }
                                }
                                ekgi ekgiVar2 = new ekgi();
                                Iterator<E> it3 = etsjVar.b.iterator();
                                while (true) {
                                    map = ekgpVar3;
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    ekgb ekgbVar = ekgbVarG2;
                                    etsc etscVar = (etsc) it3.next();
                                    String str = (String) ekgbVar.get(Integer.parseInt(etscVar.e));
                                    digg diggVar2 = (digg) digh.a.createBuilder();
                                    etse etseVar6 = ((digh) map.get(str)).c;
                                    if (etseVar6 == null) {
                                        etseVar6 = etse.a;
                                    }
                                    diggVar2.copyOnWrite();
                                    digh dighVar3 = (digh) diggVar2.instance;
                                    etseVar6.getClass();
                                    dighVar3.c = etseVar6;
                                    dighVar3.b |= 1;
                                    diggVar2.copyOnWrite();
                                    digh dighVar4 = (digh) diggVar2.instance;
                                    etscVar.getClass();
                                    dighVar4.d = etscVar;
                                    dighVar4.b |= 2;
                                    evvp evvpVar = ((digh) map.get(str)).f;
                                    if (evvpVar == null) {
                                        evvpVar = evvp.a;
                                    }
                                    diggVar2.copyOnWrite();
                                    digh dighVar5 = (digh) diggVar2.instance;
                                    evvpVar.getClass();
                                    dighVar5.f = evvpVar;
                                    dighVar5.b |= 8;
                                    evvp evvpVarB = evwz.b(Instant.now());
                                    diggVar2.copyOnWrite();
                                    digh dighVar6 = (digh) diggVar2.instance;
                                    evvpVarB.getClass();
                                    dighVar6.e = evvpVarB;
                                    dighVar6.b |= 4;
                                    ekgiVar2.i(str, (digh) diggVar2.build());
                                }
                                ekgp ekgpVarC2 = ekgiVar2.c();
                                if (((ekoj) ekgpVarC2).d >= ((ekoj) map).d) {
                                    return new difl(ekgpVarC2);
                                }
                                ((ekrd) ((ekrd) ekrgVar3.j()).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "processResponse", 331, "RpcManager.java")).t("[%s] response is missing configs", uuid6);
                                return new difm(6);
                            }
                        };
                        eosc eoscVar2 = difzVar.e;
                        listenableFutureF = eooh.f(eooq.f(eoqtVarT, ejvrVar, eoscVar2), fbtf.class, new ejvr() { // from class: dift
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((ekrd) ((ekrd) ((ekrd) difz.a.j()).g((fbtf) obj2)).h("com/google/android/libraries/communications/mobileconfiguration/rpc/RpcManager", "getConfigurations", 263, "RpcManager.java")).t("[%s] sync failed due to RPC error", uuid5);
                                return new difm(5);
                            }
                        }, eoscVar2);
                    }
                    final Optional optional4 = optional;
                    return eooq.f(listenableFutureF, new ejvr() { // from class: digr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            dify difyVar = (dify) obj2;
                            ekgp ekgpVar4 = (ekgp) optional4.get();
                            int iB = difyVar.b();
                            UUID uuid6 = uuid2;
                            digv digvVar3 = digvVar2;
                            if (iB == 2) {
                                digvVar3.i.a(difj.b(digvVar3.h, difyVar.c(), uuid6));
                                return digu.FAILURE;
                            }
                            Map mapA = difyVar.a();
                            ekhv ekhvVar = new ekhv();
                            for (Map.Entry entry3 : ((ekgp) mapA).entrySet()) {
                                String str = (String) entry3.getKey();
                                digh dighVar3 = (digh) entry3.getValue();
                                try {
                                    ((digf) digvVar3.c.b()).e(str, dighVar3);
                                    if ((((digh) ekgpVar4.get(str)).b & 2) != 0) {
                                        etsc etscVar = ((digh) ekgpVar4.get(str)).d;
                                        if (etscVar == null) {
                                            etscVar = etsc.a;
                                        }
                                        etsc etscVar2 = dighVar3.d;
                                        if (etscVar2 == null) {
                                            etscVar2 = etsc.a;
                                        }
                                        etsb etsbVar = (etsb) etscVar.toBuilder();
                                        etsbVar.copyOnWrite();
                                        etsc etscVar3 = (etsc) etsbVar.instance;
                                        etsc etscVar4 = etsc.a;
                                        etscVar3.e = etscVar4.e;
                                        etsbVar.copyOnWrite();
                                        etsc etscVar5 = (etsc) etsbVar.instance;
                                        etscVar5.f = null;
                                        etscVar5.b &= -2;
                                        etsc etscVar6 = (etsc) etsbVar.build();
                                        etsb etsbVar2 = (etsb) etscVar2.toBuilder();
                                        etsbVar2.copyOnWrite();
                                        ((etsc) etsbVar2.instance).e = etscVar4.e;
                                        etsbVar2.copyOnWrite();
                                        etsc etscVar7 = (etsc) etsbVar2.instance;
                                        etscVar7.f = null;
                                        etscVar7.b &= -2;
                                        if (!etscVar6.equals(etsbVar2.build())) {
                                            ekhvVar.c(str);
                                        }
                                    } else {
                                        ekhvVar.c(str);
                                    }
                                } catch (difk unused2) {
                                    ekrd ekrdVar4 = (ekrd) ((ekrd) digv.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 272, "SyncHelper.java");
                                    UUID uuid7 = digvVar3.h;
                                    ekrdVar4.D("[%s] failed to store configs, workRequestId:%s", uuid7, uuid6);
                                    digvVar3.i.a(difj.b(uuid7, 7, uuid6));
                                    return digu.FAILURE;
                                }
                            }
                            ekhx ekhxVarG = ekhvVar.g();
                            if (!ekhxVarG.isEmpty()) {
                                Intent intent = new Intent();
                                intent.setAction("com.google.android.libraries.communications.mobileconfiguration.CONFIG_UPDATED");
                                intent.addFlags(16777216);
                                intent.putStringArrayListExtra("config_data_ids_of_updated_configs", new ArrayList<>(ekhxVarG));
                                ekrd ekrdVar5 = (ekrd) ((ekrd) digv.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 298, "SyncHelper.java");
                                UUID uuid8 = digvVar3.h;
                                ekrdVar5.D("[%s] broadcasting changed configs, workRequestId:%s", uuid8, uuid6);
                                ceao ceaoVar3 = digvVar3.i;
                                int size = ekhxVarG.size();
                                ewzv ewzvVar3 = (ewzv) ewzw.a.createBuilder();
                                exaf exafVar3 = (exaf) exag.a.createBuilder();
                                String string7 = uuid8.toString();
                                exafVar3.copyOnWrite();
                                exag exagVar9 = (exag) exafVar3.instance;
                                string7.getClass();
                                exagVar9.b |= 1;
                                exagVar9.e = string7;
                                String string8 = uuid6.toString();
                                exafVar3.copyOnWrite();
                                exag exagVar10 = (exag) exafVar3.instance;
                                string8.getClass();
                                exagVar10.b |= 2;
                                exagVar10.f = string8;
                                exad exadVar = (exad) exae.a.createBuilder();
                                exadVar.copyOnWrite();
                                exae exaeVar = (exae) exadVar.instance;
                                exaeVar.b |= 1;
                                exaeVar.c = size;
                                exafVar3.copyOnWrite();
                                exag exagVar11 = (exag) exafVar3.instance;
                                exae exaeVar2 = (exae) exadVar.build();
                                exaeVar2.getClass();
                                exagVar11.d = exaeVar2;
                                exagVar11.c = 6;
                                ewzvVar3.copyOnWrite();
                                ewzw ewzwVar4 = (ewzw) ewzvVar3.instance;
                                exag exagVar12 = (exag) exafVar3.build();
                                exagVar12.getClass();
                                ewzwVar4.c = exagVar12;
                                ewzwVar4.b = 3;
                                ceaoVar3.a((ewzw) ewzvVar3.build());
                                digvVar3.b.sendBroadcast(intent);
                            }
                            if (fbgc.c(digvVar3.b)) {
                                ekgi ekgiVar2 = new ekgi();
                                ekgiVar2.g(ekgpVar4);
                                ekgiVar2.g(mapA);
                                digvVar3.e.c(ekgiVar2.b());
                            } else {
                                digvVar3.e.c(mapA);
                            }
                            ekrd ekrdVar6 = (ekrd) ((ekrd) digv.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "processUpdatedBatchedConfigData", 321, "SyncHelper.java");
                            UUID uuid9 = digvVar3.h;
                            ekrdVar6.D("[%s] sync succeeded, workRequestId:%s", uuid9, uuid6);
                            digvVar3.i.a(difj.c(uuid9, 5, uuid6));
                            return digu.SUCCESS;
                        }
                    }, digvVar2.f);
                }
            }, digvVar.g);
        } else {
            ((ekrd) ((ekrd) ekrgVar.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "syncConfigsForStoredParameters", 107, "SyncHelper.java")).D("[%s] sync disabled by flag, workRequestId:%s", uuid, uuidG);
            ceaoVar.a(difj.c(uuid, 6, uuidG));
            listenableFutureG = eork.i(digu.DISABLED_BY_FLAG);
        }
        return eooq.f(listenableFutureG, new ejvr() { // from class: digx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((digu) obj) == digu.FAILURE ? new qan() : new qao();
            }
        }, this.f);
    }

    @Override // defpackage.qaq
    public final void d() {
        UUID uuidG = g();
        ekrd ekrdVar = (ekrd) ((ekrd) digv.a.j()).h("com/google/android/libraries/communications/mobileconfiguration/sync/SyncHelper", "onStopped", 206, "SyncHelper.java");
        digv digvVar = this.e;
        UUID uuid = digvVar.h;
        ekrdVar.D("[%s] sync stopped, workRequestId:%s", uuid, uuidG);
        ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
        exaf exafVar = (exaf) exag.a.createBuilder();
        String string = uuid.toString();
        exafVar.copyOnWrite();
        exag exagVar = (exag) exafVar.instance;
        string.getClass();
        exagVar.b |= 1;
        exagVar.e = string;
        String string2 = uuidG.toString();
        exafVar.copyOnWrite();
        exag exagVar2 = (exag) exafVar.instance;
        string2.getClass();
        exagVar2.b |= 2;
        exagVar2.f = string2;
        exaq exaqVar = exaq.a;
        exafVar.copyOnWrite();
        exag exagVar3 = (exag) exafVar.instance;
        exaqVar.getClass();
        exagVar3.d = exaqVar;
        exagVar3.c = 7;
        ewzvVar.copyOnWrite();
        ewzw ewzwVar = (ewzw) ewzvVar.instance;
        exag exagVar4 = (exag) exafVar.build();
        exagVar4.getClass();
        ewzwVar.c = exagVar4;
        ewzwVar.b = 3;
        digvVar.i.a((ewzw) ewzvVar.build());
    }
}
