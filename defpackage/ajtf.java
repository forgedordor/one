package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajtf implements ajln {
    private final Map a;
    private final fcsu b;
    private final fcsu c;

    public ajtf(Map map, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = map;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private final eiju L(final BiFunction biFunction, ekgb ekgbVar) {
        Stream stream = Collection.EL.stream(ekgbVar);
        ajtc ajtcVar = new ajtc(this);
        ajtd ajtdVar = new ajtd();
        int i = ekgb.d;
        Collector collector = ekcv.a;
        return eijx.l((Iterable) Collection.EL.stream(((HashMap) stream.collect(Collectors.groupingBy(ajtcVar, ajtdVar, collector))).entrySet()).map(new Function() { // from class: ajte
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return (eiju) biFunction.apply((ajsq) entry.getKey(), (ekgb) entry.getValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector)).a(new Callable() { // from class: ajst
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajln
    public final eiju A(ConversationId conversationId, akbl akblVar) {
        return K(conversationId).A(conversationId, akblVar);
    }

    @Override // defpackage.ajln
    public final eiju B(ConversationId conversationId, Recipient recipient, crvz crvzVar) {
        return K(conversationId).B(conversationId, recipient, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju C(ConversationId conversationId, elka elkaVar) {
        return K(conversationId).C(conversationId, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju D(ConversationId conversationId, Recipient recipient, crwz crwzVar, String str, boolean z, crvz crvzVar) {
        return K(conversationId).D(conversationId, recipient, crwzVar, str, z, crvzVar);
    }

    @Override // defpackage.ajln
    public final eiju E(ConversationId conversationId, Uri uri) {
        return K(conversationId).E(conversationId, uri);
    }

    @Override // defpackage.ajln
    public final eiju F(ConversationId conversationId) {
        return K(conversationId).F(conversationId);
    }

    @Override // defpackage.ajln
    public final eiju G(ConversationId conversationId, elka elkaVar) {
        return K(conversationId).G(conversationId, elkaVar);
    }

    @Override // defpackage.ajln
    public final anpj H(int i) {
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.H(i);
    }

    @Override // defpackage.ajln
    public final eiju I(ekgb ekgbVar, final int i) {
        return L(new BiFunction() { // from class: ajta
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ajsq) obj).I((ekgb) obj2, i);
            }
        }, ekgbVar);
    }

    @Override // defpackage.ajln
    public final eiju J(ekgb ekgbVar, final int i) {
        return L(new BiFunction() { // from class: ajsv
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ajsq) obj).J((ekgb) obj2, i);
            }
        }, ekgbVar);
    }

    final ajsq K(ConversationId conversationId) {
        ejwl.a(conversationId != InvalidConversationId.a);
        ajsq ajsqVar = (ajsq) this.a.get(conversationId.a());
        ajsqVar.getClass();
        return ajsqVar;
    }

    @Override // defpackage.ajln
    public final Conversation a(ConversationId conversationId, ajlm ajlmVar) {
        return K(conversationId).a(conversationId, ajlmVar);
    }

    @Override // defpackage.ajln
    public final ConversationId b(akln aklnVar) {
        aklm aklmVarB = aklm.b(aklnVar.b);
        if (aklmVarB == null) {
            aklmVarB = aklm.UNRECOGNIZED;
        }
        ejwl.a(aklmVarB != aklm.UNKNOWN);
        Map map = this.a;
        aklm aklmVarB2 = aklm.b(aklnVar.b);
        if (aklmVarB2 == null) {
            aklmVarB2 = aklm.UNRECOGNIZED;
        }
        ajsq ajsqVar = (ajsq) map.get(aklmVarB2);
        ajsqVar.getClass();
        return ajsqVar.K(aklnVar);
    }

    @Override // defpackage.ajln
    public final ConversationId c(byte[] bArr) {
        try {
            akln aklnVar = (akln) evsn.parseFrom(akln.a, bArr, evrr.a());
            aklm aklmVarB = aklm.b(aklnVar.b);
            if (aklmVarB == null) {
                aklmVarB = aklm.UNRECOGNIZED;
            }
            if (aklmVarB == aklm.UNKNOWN) {
                return null;
            }
            return b(aklnVar);
        } catch (evtj unused) {
            return null;
        }
    }

    @Override // defpackage.ajln
    public final eiju d(ConversationId conversationId, elka elkaVar) {
        return K(conversationId).d(conversationId, elkaVar);
    }

    @Override // defpackage.ajln
    public final eiju e(ConversationId conversationId) {
        return K(conversationId).e(conversationId);
    }

    @Override // defpackage.ajln
    public final eiju f(aoer aoerVar, ConversationId conversationId) {
        return K(conversationId).f(aoerVar, conversationId);
    }

    @Override // defpackage.ajln
    public final eiju g(aoer aoerVar, ConversationId conversationId) {
        return K(conversationId).g(aoerVar, conversationId);
    }

    @Override // defpackage.ajln
    public final eiju h(akzk akzkVar) {
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.h(akzkVar);
    }

    @Override // defpackage.ajln
    public final eiju i(awjl awjlVar) {
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.i(awjlVar);
    }

    @Override // defpackage.ajln
    public final eiju j(ekgb ekgbVar) {
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.j(ekgbVar);
    }

    @Override // defpackage.ajln
    public final eiju k() {
        Stream map = Collection.EL.stream(((ekgp) this.a).values()).map(new Function() { // from class: ajss
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajsq) obj).k();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return eijx.a((ekgb) map.collect(ekcv.a)).h(new ejvr() { // from class: ajsz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream streamFlatMap = Collection.EL.stream((List) obj).flatMap(new Function() { // from class: ajtb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Collection.EL.stream((ekgb) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = ekgb.d;
                return (ekgb) streamFlatMap.collect(ekcv.a);
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajln
    public final eiju l(ConversationId conversationId) {
        return K(conversationId).l(conversationId);
    }

    @Override // defpackage.ajln
    public final eiju m(ekgb ekgbVar, String str) {
        if (((aqbh) this.b.b()).a() && ((ekoe) ekgbVar).c == 1 && ((Recipient) ekgbVar.get(0)).g().B()) {
            ajsq ajsqVar = (ajsq) this.a.get(aklm.SATELLITE);
            ajsqVar.getClass();
            return ajsqVar.m(ekgbVar, str);
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((ekoe) ekgbVar).c == 1 && ((Recipient) ekgbVar.get(0)).g().z()) {
            ajsq ajsqVar2 = (ajsq) this.a.get(aklm.PENPAL_BOT);
            ajsqVar2.getClass();
            return ajsqVar2.m(ekgbVar, str);
        }
        int i = ((ekoe) ekgbVar).c;
        if (i == 1) {
            if (((Recipient) ekgbVar.get(0)).g().A()) {
                ajsq ajsqVar3 = (ajsq) this.a.get(aklm.RBM);
                ajsqVar3.getClass();
                return ajsqVar3.m(ekgbVar, str);
            }
            i = 1;
        }
        if (((aquo) this.c.b()).a() && i == 1 && ((Recipient) ekgbVar.get(0)).g().v()) {
            ajsq ajsqVar4 = (ajsq) this.a.get(aklm.EMERGENCY);
            ajsqVar4.getClass();
            return ajsqVar4.m(ekgbVar, str);
        }
        ajsq ajsqVar5 = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar5.getClass();
        return ajsqVar5.m(ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju n(awjl awjlVar, aoer aoerVar, ajsm ajsmVar) {
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.n(awjlVar, aoerVar, ajsmVar);
    }

    @Override // defpackage.ajln
    public final /* synthetic */ eiju o(Optional optional, ekgb ekgbVar, String str) {
        return ajll.a(this, optional, ekgbVar, str);
    }

    @Override // defpackage.ajln
    public final eiju p(Optional optional, ekgb ekgbVar, String str, Uri uri) {
        if (((aqbh) this.b.b()).a() && ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().B()) {
            ajsq ajsqVar = (ajsq) this.a.get(aklm.SATELLITE);
            ajsqVar.getClass();
            return ajsqVar.p(optional, ekgbVar, str, uri);
        }
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().z()) {
            ajsq ajsqVar2 = (ajsq) this.a.get(aklm.PENPAL_BOT);
            ajsqVar2.getClass();
            return ajsqVar2.p(optional, ekgbVar, str, uri);
        }
        if (ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().A()) {
            ajsq ajsqVar3 = (ajsq) this.a.get(aklm.RBM);
            ajsqVar3.getClass();
            return ajsqVar3.p(optional, ekgbVar, str, uri);
        }
        if (((aquo) this.c.b()).a() && ekgbVar.size() == 1 && ((Recipient) ekgbVar.get(0)).g().v()) {
            ajsq ajsqVar4 = (ajsq) this.a.get(aklm.EMERGENCY);
            ajsqVar4.getClass();
            return ajsqVar4.p(optional, ekgbVar, str, uri);
        }
        ajsq ajsqVar5 = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar5.getClass();
        return ajsqVar5.p(optional, ekgbVar, str, uri);
    }

    @Override // defpackage.ajln
    public final eiju q(ConversationId conversationId, akcy akcyVar, Recipient recipient) {
        return K(conversationId).q(conversationId, akcyVar, recipient);
    }

    @Override // defpackage.ajln
    public final eiju r(ConversationId conversationId) {
        return K(conversationId).r(conversationId);
    }

    @Override // defpackage.ajln
    public final eiju s(ekgb ekgbVar) {
        final BiFunction biFunction = new BiFunction() { // from class: ajsy
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ajsq) obj).s((ekgb) obj2);
            }
        };
        Stream stream = Collection.EL.stream(ekgbVar);
        ajtc ajtcVar = new ajtc(this);
        ajtd ajtdVar = new ajtd();
        int i = ekgb.d;
        Collector collector = ekcv.a;
        return eijx.a((Iterable) Collection.EL.stream(((HashMap) stream.collect(Collectors.groupingBy(ajtcVar, ajtdVar, collector))).entrySet()).map(new Function() { // from class: ajsw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return (eiju) biFunction.apply((ajsq) entry.getKey(), (ekgb) entry.getValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(collector)).h(new ejvr() { // from class: ajsx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: ajsu
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
                        return ((Boolean) obj2).booleanValue();
                    }
                }));
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajln
    public final eiju t(ConversationId conversationId, cgrc cgrcVar, cgra cgraVar) {
        return K(conversationId).t(conversationId, cgrcVar, cgraVar);
    }

    @Override // defpackage.ajln
    public final eiju u(ConversationId conversationId, akcy akcyVar) {
        return K(conversationId).u(conversationId, akcyVar);
    }

    @Override // defpackage.ajln
    public final eiju v(Recipient recipient) {
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && recipient.g().z()) {
            return eijx.e(false);
        }
        if (recipient.g().A()) {
            return eijx.e(false);
        }
        if (((aquo) this.c.b()).a() && recipient.g().v()) {
            return eijx.e(false);
        }
        ajsq ajsqVar = (ajsq) this.a.get(aklm.BUGLE);
        ajsqVar.getClass();
        return ajsqVar.v(recipient);
    }

    @Override // defpackage.ajln
    public final eiju w(ConversationId conversationId, String str) {
        return K(conversationId).w(conversationId, str);
    }

    @Override // defpackage.ajln
    public final eiju x(ConversationId conversationId, aoer aoerVar) {
        return K(conversationId).x(conversationId, aoerVar);
    }

    @Override // defpackage.ajln
    public final eiju y(ConversationId conversationId, String str, String str2, amsv amsvVar) {
        return K(conversationId).y(conversationId, str, str2, amsvVar);
    }

    @Override // defpackage.ajln
    public final eiju z(ConversationId conversationId, String str, Uri uri) {
        return K(conversationId).z(conversationId, str, uri);
    }
}
