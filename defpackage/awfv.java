package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awfv {
    public static final cczi a = cdag.p(185945909);
    public final awci b;
    public final awfi c;
    public final eosc d;
    public final fcsu e;

    public awfv(awci awciVar, awfi awfiVar, eosc eoscVar, fcsu fcsuVar) {
        this.b = awciVar;
        this.c = awfiVar;
        this.d = eoscVar;
        this.e = fcsuVar;
    }

    public static eiju a(final awfh awfhVar, final ConversationIdType conversationIdType) {
        return conversationIdType.b() ? eijx.e(awfg.c()) : eijx.g(new Callable() { // from class: awfe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return awfhVar.a(conversationIdType);
            }
        }, awfhVar.c);
    }

    public final eiju b(final ConversationIdType conversationIdType, final Runnable runnable, final emum emumVar) {
        final awfh awfhVarA = this.c.a(this.b.a());
        final eiju eijuVarA = a(awfhVarA, conversationIdType);
        eooz eoozVar = new eooz() { // from class: awfm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cczi ccziVar = awfv.a;
                try {
                    runnable.run();
                    return eijx.e(null);
                } catch (RuntimeException e) {
                    return eijx.d(e);
                }
            }
        };
        eosc eoscVar = this.d;
        final eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: awfn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return awfv.a(awfhVarA, conversationIdType);
            }
        }, eoscVar);
        return eijx.m(eijuVarA, eijuVarI).a(new Callable() { // from class: awfo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awfg awfgVar = (awfg) eork.q(eijuVarA);
                awfg awfgVar2 = (awfg) eork.q(eijuVarI);
                awfg awfgVarC = awfg.c();
                int i = ekgb.d;
                this.a.c(awfgVar, awfgVar2, awfgVarC, ekoe.a, emumVar);
                return null;
            }
        }, eoscVar);
    }

    public final void c(awfg awfgVar, awfg awfgVar2, awfg awfgVar3, ekgb ekgbVar, emum emumVar) {
        emui emuiVar = (emui) emun.a.createBuilder();
        emuh emuhVarA = awfgVar.a();
        emuiVar.copyOnWrite();
        emun emunVar = (emun) emuiVar.instance;
        emunVar.f = emuhVarA;
        emunVar.b |= 16;
        emuh emuhVarA2 = awfgVar2.a();
        emuiVar.copyOnWrite();
        emun emunVar2 = (emun) emuiVar.instance;
        emunVar2.h = emuhVarA2;
        emunVar2.b |= 64;
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: awft
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return awfh.c((awcf) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        Iterable iterable = (Iterable) map.collect(collector);
        emuiVar.copyOnWrite();
        emun emunVar3 = (emun) emuiVar.instance;
        evtg evtgVar = emunVar3.i;
        if (!evtgVar.c()) {
            emunVar3.i = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, emunVar3.i);
        emuiVar.copyOnWrite();
        emun emunVar4 = (emun) emuiVar.instance;
        emunVar4.d = 1;
        emunVar4.b |= 2;
        int i2 = 1 != (awfgVar2.a().b & 1) ? 3 : 2;
        emuiVar.copyOnWrite();
        emun emunVar5 = (emun) emuiVar.instance;
        emunVar5.e = i2 - 1;
        emunVar5.b |= 8;
        emuiVar.copyOnWrite();
        emun emunVar6 = (emun) emuiVar.instance;
        emunVar6.c = emumVar.n;
        emunVar6.b |= 1;
        if ((awfgVar3.a().b & 1) != 0) {
            emuh emuhVarA3 = awfgVar3.a();
            emuiVar.copyOnWrite();
            emun emunVar7 = (emun) emuiVar.instance;
            emunVar7.g = emuhVarA3;
            emunVar7.b |= 32;
        }
        final emuz emuzVar = (emuz) emva.a.createBuilder();
        emuw emuwVarB = awfgVar.b();
        emuzVar.copyOnWrite();
        emva emvaVar = (emva) emuzVar.instance;
        emvaVar.d = emuwVarB;
        emvaVar.b |= 2;
        emuw emuwVarB2 = awfgVar2.b();
        emuzVar.copyOnWrite();
        emva emvaVar2 = (emva) emuzVar.instance;
        emvaVar2.e = emuwVarB2;
        emvaVar2.b |= 4;
        Iterable iterable2 = (Iterable) Collection.EL.stream(ekgbVar).map(new Function() { // from class: awfu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return awfh.e((awcf) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector);
        emuzVar.copyOnWrite();
        emva emvaVar3 = (emva) emuzVar.instance;
        evtg evtgVar2 = emvaVar3.f;
        if (!evtgVar2.c()) {
            emvaVar3.f = evsn.mutableCopy(evtgVar2);
        }
        evpz.addAll(iterable2, emvaVar3.f);
        Collection.EL.stream(awfgVar.a().g).map(new Function() { // from class: awfk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = awfv.a;
                emub emubVar = ((emuu) obj).d;
                if (emubVar == null) {
                    emubVar = emub.a;
                }
                return emubVar.e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).findFirst().ifPresent(new Consumer() { // from class: awfl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                emuz emuzVar2 = emuzVar;
                String str = (String) obj;
                emuzVar2.copyOnWrite();
                emva emvaVar4 = (emva) emuzVar2.instance;
                emva emvaVar5 = emva.a;
                str.getClass();
                emvaVar4.b |= 1;
                emvaVar4.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        fcsu fcsuVar = this.e;
        aill aillVar = (aill) fcsuVar.b();
        ellh ellhVar = ellh.a;
        ellg ellgVar = (ellg) ellhVar.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONVERSATION_MATCHING;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        int i3 = ellfVar.f11do;
        ellhVar2.j = i3;
        ellhVar2.b |= 1;
        elkn elknVar = elkn.a;
        elkm elkmVar = (elkm) elknVar.createBuilder();
        elkmVar.copyOnWrite();
        elkn elknVar2 = (elkn) elkmVar.instance;
        emun emunVar8 = (emun) emuiVar.build();
        emunVar8.getClass();
        elknVar2.c = emunVar8;
        elknVar2.b = 1;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elkn elknVar3 = (elkn) elkmVar.build();
        elknVar3.getClass();
        ellhVar3.aN = elknVar3;
        ellhVar3.e |= 131072;
        aillVar.j(ellgVar);
        aill aillVar2 = (aill) fcsuVar.b();
        ellg ellgVar2 = (ellg) ellhVar.createBuilder();
        ellgVar2.copyOnWrite();
        ellh ellhVar4 = (ellh) ellgVar2.instance;
        ellhVar4.j = i3;
        ellhVar4.b |= 1;
        elkm elkmVar2 = (elkm) elknVar.createBuilder();
        elkmVar2.copyOnWrite();
        elkn elknVar4 = (elkn) elkmVar2.instance;
        emva emvaVar4 = (emva) emuzVar.build();
        emvaVar4.getClass();
        elknVar4.c = emvaVar4;
        elknVar4.b = 2;
        ellgVar2.copyOnWrite();
        ellh ellhVar5 = (ellh) ellgVar2.instance;
        elkn elknVar5 = (elkn) elkmVar2.build();
        elknVar5.getClass();
        ellhVar5.aN = elknVar5;
        ellhVar5.e |= 131072;
        aillVar2.n(ellgVar2);
    }
}
