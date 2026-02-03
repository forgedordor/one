package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coia {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final cokd c;
    public final fcsu d;
    public final aptx e;
    public final aqzp f;
    private final eosc g;
    private final cohh h;

    public coia(eosc eoscVar, eosc eoscVar2, cokd cokdVar, cohh cohhVar, fcsu fcsuVar, aptx aptxVar, aqzp aqzpVar) {
        this.g = eoscVar;
        this.b = eoscVar2;
        this.c = cokdVar;
        this.h = cohhVar;
        this.d = fcsuVar;
        this.e = aptxVar;
        this.f = aqzpVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.lang.Object] */
    public final eiju a(cokf cokfVar) {
        Optional optionalB = cokfVar.b();
        Optional optionalA = cokfVar.a();
        if (!cokfVar.c() || !avbn.g.contains(Integer.valueOf(cokfVar.b().get().k()))) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.b, optionalB.get().C());
            ekrwVarN.X(coie.a, ((cokk) optionalA.get()).r());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 214, "CancelFileTransferHelper.java")).q("Message is not sending or downloading. Skipping cancelling upload/download.");
            return null;
        }
        comc comcVarP = ((cokk) optionalA.get()).p();
        eksp ekspVar = a;
        ekrw ekrwVarN2 = ekspVar.n();
        ekrz ekrzVar = cqnc.b;
        ekrwVarN2.X(ekrzVar, optionalB.get().C());
        ekrz ekrzVar2 = coie.a;
        ekrwVarN2.X(ekrzVar2, ((cokk) optionalA.get()).r());
        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 223, "CancelFileTransferHelper.java")).t("Attempting to cancel ongoing file transfer. Transfer type: %s", comcVarP);
        if (Objects.equals(comcVarP, comc.UPLOAD)) {
            Object obj = optionalA.get();
            covy covyVarB = this.h.b();
            final cokk cokkVar = (cokk) obj;
            String strR = cokkVar.r();
            strR.getClass();
            return covyVarB.a(strR).h(new ejvr() { // from class: cohx
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    eksp ekspVar2 = coia.a;
                    return cokkVar.o();
                }
            }, this.g);
        }
        if (!Objects.equals(comcVarP, comc.DOWNLOAD)) {
            eksl ekslVar = (eksl) ekspVar.j();
            ekslVar.X(ekrzVar, optionalB.get().C());
            ekslVar.X(ekrzVar2, ((cokk) optionalA.get()).r());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelOngoingFileTransfer", 237, "CancelFileTransferHelper.java")).t("Transfer type not supported while trying to cancel ongoing file transfer: %s", comcVarP);
            return null;
        }
        Object obj2 = optionalA.get();
        conr conrVarA = this.h.a();
        final cokk cokkVar2 = (cokk) obj2;
        String strR2 = cokkVar2.r();
        strR2.getClass();
        return conrVarA.b(strR2).h(new ejvr() { // from class: cohw
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                eksp ekspVar2 = coia.a;
                return cokkVar2.o();
            }
        }, this.g);
    }

    public final eiju b(List list) {
        Stream streamFilter = Collection.EL.stream(list).flatMap(new Function() { // from class: coht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Stream.CC.ofNullable(this.a.a((cokf) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: cohu
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
                return Objects.nonNull((eiju) obj);
            }
        });
        int i = ekgb.d;
        return eijx.i((Iterable) streamFilter.collect(ekcv.a)).h(new ejvr() { // from class: cohv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ekgb.n((List) obj);
            }
        }, this.g);
    }

    public final ekgb c(List list) {
        Stream streamFlatMap = Collection.EL.stream(list).flatMap(new Function() { // from class: cohy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eiju eijuVarA;
                final MessageCoreData messageCoreData = (MessageCoreData) obj;
                Optional map = Optional.ofNullable(messageCoreData).map(new Function() { // from class: cohr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((MessageCoreData) obj2).H();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: cohs
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((MessagePartCoreData) obj2).z();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                boolean zIsPresent = map.isPresent();
                coia coiaVar = this.a;
                if (zIsPresent) {
                    eijuVarA = ((atgy) coiaVar.d.b()).b((athh) map.get()).i(new eooz() { // from class: cohq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            eksp ekspVar = coia.a;
                            return eijx.e(messageCoreData.C());
                        }
                    }, coiaVar.b);
                } else {
                    cokd cokdVar = coiaVar.c;
                    if (cokdVar.a(messageCoreData.C()).c()) {
                        eijuVarA = coiaVar.a(cokdVar.a(messageCoreData.C()));
                    } else {
                        ekrw ekrwVarN = coia.a.n();
                        ekrwVarN.X(cqnc.b, messageCoreData.C());
                        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/transfer/CancelFileTransferHelper", "cancelFileTransfer", 173, "CancelFileTransferHelper.java")).q("Trying to cancel a file transfer for a message that does not have a valid file transfer.");
                        eijuVarA = null;
                    }
                }
                return Stream.CC.ofNullable(eijuVarA);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) streamFlatMap.collect(ekcv.a);
    }
}
