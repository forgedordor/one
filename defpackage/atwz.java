package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atwz {
    public static final cqce a = cqce.g("BugleDataModel", "IncomingIsComposingProcessor");
    public static final Duration b = Duration.ofMinutes(2);
    public final atxs c;
    public final auaq d;
    public final cogw e;
    public final fcsu f;
    public final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final eosc j;
    private final fcsu k;
    private final aqog l;

    public atwz(atxs atxsVar, auaq auaqVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, fcsu fcsuVar5, aqog aqogVar) {
        this.c = atxsVar;
        this.d = auaqVar;
        this.e = cogwVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fcsuVar4;
        this.k = fcsuVar5;
        this.j = eoscVar;
        this.l = aqogVar;
    }

    public final eiju a(IsComposingMessage isComposingMessage, aufh aufhVar) {
        awjl awjlVarA;
        auab auabVar = (auab) this.h.b();
        if (this.l.a()) {
            awjlVarA = ((atvy) this.k.b()).a(aufhVar);
        } else if ((aufhVar.c & 32) != 0) {
            awng awngVar = (awng) this.i.b();
            awso awsoVar = aufhVar.g;
            if (awsoVar == null) {
                awsoVar = awso.a;
            }
            awjlVarA = awngVar.a(awou.a(awsoVar));
        } else {
            awky awkyVar = aufhVar.e;
            if (awkyVar == null) {
                awkyVar = awky.a;
            }
            awjlVarA = awjj.a(awkyVar);
        }
        return b(isComposingMessage, aufhVar, auabVar.c(awjlVarA));
    }

    public final eiju b(final IsComposingMessage isComposingMessage, final aufh aufhVar, eiju eijuVar) {
        return eijuVar.i(new eooz() { // from class: atwx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (conversationIdType.b()) {
                    ((ekrd) atwz.a.i().h("com/google/android/apps/messaging/shared/chatapi/incoming/IncomingIsComposingProcessor", "processInternal", 132, "IncomingIsComposingProcessor.java")).q("Could not find conversation.");
                    return eijx.e(null);
                }
                aufh aufhVar2 = aufhVar;
                aubq aubqVar = aufhVar2.d;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                atwz atwzVar = this.a;
                String str = aubqVar.d;
                if (((dggw) atwzVar.f.b()).v(str)) {
                    return eijx.e(null);
                }
                IsComposingMessage isComposingMessage2 = isComposingMessage;
                ((awlc) atwzVar.g.b()).d(new Consumer() { // from class: atwy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        atxl atxlVar = (atxl) obj2;
                        cqce cqceVar = atwz.a;
                        auvh.h(auvw.c(atxlVar.b, fcyi.a, fdjz.a, new atxk(atxlVar, new BugleConversationId(conversationIdType), null)));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                atxs atxsVar = atwzVar.c;
                efjm efjmVarA = isComposingMessage2.a();
                efjm efjmVar = efjm.START;
                auvh.h(atxsVar.a(conversationIdType, str, efjmVarA.equals(efjmVar)));
                Instant instantPlus = ((Instant) isComposingMessage2.c().orElse(atwzVar.e.f())).plus((Duration) isComposingMessage2.b().orElse(atwz.b));
                auaf auafVar = new auaf();
                auafVar.e(isComposingMessage2.a());
                auafVar.c(instantPlus);
                aubq aubqVar2 = aufhVar2.d;
                if (aubqVar2 == null) {
                    aubqVar2 = aubq.a;
                }
                auafVar.d(aubqVar2);
                auafVar.b(conversationIdType);
                final auas auasVarA = auafVar.a();
                final auaq auaqVar = atwzVar.d;
                Instant instantF = auaqVar.e.f();
                auag auagVar = (auag) auasVarA;
                Instant instant = auagVar.c;
                Duration durationBetween = instant.isAfter(instantF) ? Duration.between(instantF, instant) : Duration.ZERO;
                if (durationBetween.isZero()) {
                    return eijx.e(null);
                }
                eiju eijuVarF = eijx.f(new Runnable() { // from class: auan
                    @Override // java.lang.Runnable
                    public final void run() {
                        auag auagVar2 = (auag) auasVarA;
                        boolean zEquals = efjm.START.equals(auagVar2.d);
                        auaq auaqVar2 = auaqVar;
                        if (zEquals) {
                            ConversationIdType conversationIdType2 = auagVar2.b;
                            Map map = auaqVar2.a;
                            Map map2 = (Map) map.get(conversationIdType2);
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            map2.put(auagVar2.a, auagVar2.c);
                            map.put(conversationIdType2, map2);
                            auaqVar2.c(conversationIdType2.a());
                            return;
                        }
                        ConversationIdType conversationIdType3 = auagVar2.b;
                        Map map3 = auaqVar2.a;
                        Map map4 = (Map) map3.get(conversationIdType3);
                        if (map4 != null) {
                            map4.remove(auagVar2.a);
                            if (map4.isEmpty()) {
                                map3.remove(conversationIdType3);
                            }
                        }
                        auaqVar2.c(conversationIdType3.a());
                    }
                }, auaqVar.d);
                auaqVar.c.a(eijuVarF, new egyb("typing_status_all_conversations"));
                if (efjmVar.equals(auagVar.d)) {
                    eiju.g(auaqVar.b.schedule(eiid.k(new Runnable() { // from class: aual
                        @Override // java.lang.Runnable
                        public final void run() {
                            auaf auafVar2 = new auaf();
                            auag auagVar2 = (auag) auasVarA;
                            auafVar2.d(auagVar2.a);
                            auafVar2.c(auagVar2.c);
                            auafVar2.e(efjm.STOP);
                            auafVar2.b(auagVar2.b);
                            final auas auasVarA2 = auafVar2.a();
                            final auaq auaqVar2 = auaqVar;
                            auaqVar2.c.a(eijx.f(new Runnable() { // from class: auah
                                @Override // java.lang.Runnable
                                public final void run() {
                                    auag auagVar3 = (auag) auasVarA2;
                                    auaq auaqVar3 = auaqVar2;
                                    Map map = auaqVar3.a;
                                    ConversationIdType conversationIdType2 = auagVar3.b;
                                    Map map2 = (Map) map.get(conversationIdType2);
                                    if (map2 == null) {
                                        return;
                                    }
                                    aubq aubqVar3 = auagVar3.a;
                                    if (map2.containsKey(aubqVar3) && ((Instant) map2.get(aubqVar3)).equals(auagVar3.c)) {
                                        map2.remove(aubqVar3);
                                    }
                                    if (map2.isEmpty()) {
                                        map.remove(conversationIdType2);
                                    }
                                    auaqVar3.c(conversationIdType2.a());
                                }
                            }, auaqVar2.d), new egyb("typing_status_all_conversations"));
                        }
                    }), durationBetween.toNanos(), TimeUnit.NANOSECONDS)).k(auvh.b(), eoqg.a);
                }
                return eijuVarF;
            }
        }, this.j);
    }
}
