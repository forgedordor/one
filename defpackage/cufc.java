package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufc implements cmxq, cdhb {
    public static final cqce a = cqce.g("Bugle", "StuckInSendingMessageTracker");
    public final cgbn b;
    public final cdik c;
    public final fcsu d;
    public final cmxr e;
    public final aylv f;
    public final fcsu g;
    private final eosc h;

    public cufc(eosc eoscVar, cgbn cgbnVar, cdik cdikVar, fcsu fcsuVar, cmxr cmxrVar, aylv aylvVar, fcsu fcsuVar2) {
        this.h = eoscVar;
        this.b = cgbnVar;
        this.c = cdikVar;
        this.d = fcsuVar;
        this.e = cmxrVar;
        this.f = aylvVar;
        this.g = fcsuVar2;
    }

    @Override // defpackage.cmxq
    public final eiju a(final MessageIdType messageIdType) {
        final bvdo bvdoVar = bvdo.NOTIFY_STUCK_IN_SENDING;
        if (!messageIdType.c()) {
            cdia cdiaVar = (cdia) this.c.d.b();
            if (!messageIdType.c()) {
                return eijx.g(new Callable() { // from class: cdhq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(cdia.d(messageIdType, bvdoVar));
                    }
                }, cdiaVar.b);
            }
            ((eksl) ((eksl) cdia.a.j()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageFlagger", "isMessageFlaggedForReason", 330, "MessageFlagger.java")).q("Cannot query for flagged message - messageId cannot be empty.");
            return eijx.e(false);
        }
        cqbd cqbdVarE = cdik.a.e();
        cqbdVarE.I("Cannot check if tracking message - messageId cannot be");
        cqbdVarE.I(true != messageIdType.c() ? "empty" : "null");
        cqbdVarE.A("TrackingPurpose", bvdoVar);
        cqbdVarE.r();
        return eijx.e(false);
    }

    @Override // defpackage.cdhb
    public final eiju b(final ekgb ekgbVar) {
        Callable callable = new Callable() { // from class: cuez
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList = new ArrayList();
                ekgb ekgbVar2 = ekgbVar;
                int size = ekgbVar2.size();
                for (int i = 0; i < size; i++) {
                    cufc cufcVar = this.a;
                    bple bpleVar = (bple) ekgbVar2.get(i);
                    MessageIdType messageIdTypeM = bpleVar.m();
                    MessageCoreData messageCoreDataW = ((baxe) cufcVar.d.b()).w(messageIdTypeM);
                    if (messageCoreDataW == null || !baui.n(messageCoreDataW.k())) {
                        cufcVar.e(messageIdTypeM);
                    } else {
                        arrayList.add(bpleVar);
                    }
                }
                return ekgb.n(arrayList);
            }
        };
        eosc eoscVar = this.h;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: cufa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ekgb ekgbVar2 = (ekgb) obj;
                cufc cufcVar = this.a;
                if (((apoa) cufcVar.g.b()).a()) {
                    int size = ekgbVar2.size();
                    for (int i = 0; i < size; i++) {
                        final MessageCoreData messageCoreDataW = ((baxe) cufcVar.d.b()).w(((bple) ekgbVar2.get(i)).m());
                        if (messageCoreDataW != null) {
                            aylv aylvVar = cufcVar.f;
                            cmxr cmxrVar = cufcVar.e;
                            MessageIdType messageIdTypeC = messageCoreDataW.C();
                            Map map = cmxrVar.c;
                            emiu emiuVar = (emiu) map.get(messageIdTypeC);
                            cmxrVar.b.remove(messageIdTypeC);
                            map.remove(messageIdTypeC);
                            Optional optionalOfNullable = Optional.ofNullable(emiuVar);
                            ajhd ajhdVar = (ajhd) aylvVar.a.b();
                            if (ajhdVar.Y()) {
                                int iD = ajhe.d(messageCoreDataW.d());
                                final elof elofVar = (elof) elpg.b.createBuilder();
                                long jT = messageCoreDataW.t();
                                elofVar.copyOnWrite();
                                elpg elpgVar = (elpg) elofVar.instance;
                                elpgVar.c |= 128;
                                elpgVar.o = jT;
                                elofVar.copyOnWrite();
                                elpg elpgVar2 = (elpg) elofVar.instance;
                                elpgVar2.h = iD - 1;
                                elpgVar2.c |= 1;
                                elofVar.copyOnWrite();
                                elpg elpgVar3 = (elpg) elofVar.instance;
                                elpgVar3.i = 24;
                                elpgVar3.c |= 2;
                                elny elnyVarJ = ((MessageData) messageCoreDataW).k.j();
                                elofVar.copyOnWrite();
                                elpg elpgVar4 = (elpg) elofVar.instance;
                                elpgVar4.n = elnyVarJ.M;
                                elpgVar4.c |= 64;
                                optionalOfNullable.ifPresent(new Consumer() { // from class: aylu
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj2) {
                                        emiu emiuVar2 = (emiu) obj2;
                                        int iA = messageCoreDataW.a();
                                        emiuVar2.copyOnWrite();
                                        emiv emivVar = (emiv) emiuVar2.instance;
                                        emiv emivVar2 = emiv.a;
                                        emivVar.b |= 1;
                                        emivVar.e = iA;
                                        elof elofVar2 = elofVar;
                                        elofVar2.copyOnWrite();
                                        elpg elpgVar5 = (elpg) elofVar2.instance;
                                        emiv emivVar3 = (emiv) emiuVar2.build();
                                        evsy evsyVar = elpg.a;
                                        emivVar3.getClass();
                                        elpgVar5.ao = emivVar3;
                                        elpgVar5.e |= 64;
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                                ellg ellgVar = (ellg) ellh.a.createBuilder();
                                ellf ellfVar = ellf.BUGLE_MESSAGE;
                                ellgVar.copyOnWrite();
                                ellh ellhVar = (ellh) ellgVar.instance;
                                ellhVar.j = ellfVar.f11do;
                                ellhVar.b |= 1;
                                ellgVar.copyOnWrite();
                                ellh ellhVar2 = (ellh) ellgVar.instance;
                                elpg elpgVar5 = (elpg) elofVar.build();
                                elpgVar5.getClass();
                                ellhVar2.l = elpgVar5;
                                ellhVar2.b |= 4;
                                ((aimb) aylvVar.b.b()).a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                            } else {
                                ajhdVar.n();
                            }
                        }
                    }
                } else if (ekgbVar2 == null) {
                    int i2 = ekgb.d;
                    ekgbVar2 = ekoe.a;
                }
                cufcVar.b.E(ekgbVar2);
                cqbd cqbdVarA = cufc.a.a();
                cqbdVarA.I("Refreshed stuck messages notification for expired messages.");
                cqbdVarA.r();
                Stream map2 = Collection.EL.stream(ekgbVar2).map(new Function() { // from class: cufb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((bple) obj2).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i3 = ekgb.d;
                return cufcVar.c.a((List) map2.collect(ekcv.a), bvdo.NOTIFY_STUCK_IN_SENDING);
            }
        }, eoscVar);
    }

    @Override // defpackage.cmxq
    public final void c(MessageIdType messageIdType, Instant instant) {
        this.c.b(messageIdType, instant, bvdo.NOTIFY_STUCK_IN_SENDING);
    }

    @Override // defpackage.cdhb
    public final Duration d() {
        return Duration.ofSeconds(((Integer) clgw.c.e()).intValue());
    }

    @Override // defpackage.cmxq
    public final void e(MessageIdType messageIdType) {
        this.c.d(messageIdType, bvdo.NOTIFY_STUCK_IN_SENDING);
    }
}
