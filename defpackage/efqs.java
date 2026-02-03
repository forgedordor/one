package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqs extends efoy {
    static final ejvj a = new efqw();
    static final ejvj b = new efpo();
    static final ejvj c = new efpr();

    @Override // defpackage.efoy
    public final void c(Message message, cjia cjiaVar) {
        ekgb ekgbVarN = ekgb.n((Collection) Collection.EL.stream(message.b()).map(new Function() { // from class: efqi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Message.MessageContent messageContent = (Message.MessageContent) obj;
                cjii cjiiVar = (cjii) cjij.a.createBuilder();
                evqs evqsVarB = messageContent.b().b();
                cjiiVar.copyOnWrite();
                cjij cjijVar = (cjij) cjiiVar.instance;
                cjijVar.b |= 2;
                cjijVar.d = evqsVarB;
                cjgl cjglVar = (cjgl) efqs.b.fH().fM(messageContent.b().a());
                cjiiVar.copyOnWrite();
                cjij cjijVar2 = (cjij) cjiiVar.instance;
                cjglVar.getClass();
                cjijVar2.c = cjglVar;
                cjijVar2.b |= 1;
                return (cjij) cjiiVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList()));
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        evsy evsyVar = cjib.a;
        cjibVar.a();
        evpz.addAll(ekgbVarN, cjibVar.g);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.efoy
    public final void d(Message message, cjia cjiaVar) {
        if (message.d().isEmpty()) {
            return;
        }
        Iterable iterable = (Iterable) Collection.EL.stream(message.d().get()).map(new Function() { // from class: efqn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cjhb) efqs.c.fH().fM((efjs) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        evsy evsyVar = cjib.a;
        evsx evsxVar = cjibVar.k;
        if (!evsxVar.c()) {
            cjibVar.k = evsn.mutableCopy(evsxVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cjibVar.k.h(((cjhb) it.next()).e);
        }
    }

    @Override // defpackage.efoy
    public final void e(Message message, cjia cjiaVar) {
        if (message.c().isEmpty()) {
            return;
        }
        Map map = (Map) Collection.EL.stream(message.c()).collect(Collectors.groupingBy(new Function() { // from class: efqh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collectors.collectingAndThen(Collectors.toMap(new Function() { // from class: efqj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: efqk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessageExtensionHeader) obj).c();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }), new Function() { // from class: efql
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eygc eygcVar = (eygc) eyge.a.createBuilder();
                eygcVar.a((Map) obj);
                return (eyge) eygcVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
        eyfy eyfyVar = (eyfy) eyga.a.createBuilder();
        eyfyVar.copyOnWrite();
        ((eyga) eyfyVar.instance).a().putAll(map);
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        eyga eygaVar = (eyga) eyfyVar.build();
        evsy evsyVar = cjib.a;
        eygaVar.getClass();
        cjibVar.i = eygaVar;
        cjibVar.c |= 16;
    }

    @Override // defpackage.efoy
    public final void f(Message message, cjia cjiaVar) {
        cjjv cjjvVar = (cjjv) cjjw.a.createBuilder();
        String strH = message.h();
        cjjvVar.copyOnWrite();
        cjjw cjjwVar = (cjjw) cjjvVar.instance;
        cjjwVar.b |= 1;
        cjjwVar.c = strH;
        cjiaVar.copyOnWrite();
        cjib cjibVar = (cjib) cjiaVar.instance;
        cjjw cjjwVar2 = (cjjw) cjjvVar.build();
        evsy evsyVar = cjib.a;
        cjjwVar2.getClass();
        cjibVar.d = cjjwVar2;
        cjibVar.c |= 1;
    }

    @Override // defpackage.efoy
    public final void g(Message message, final cjia cjiaVar) {
        message.g().ifPresent(new Consumer() { // from class: efqo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                evvp evvpVarB = evwz.b((Instant) obj);
                cjia cjiaVar2 = cjiaVar;
                cjiaVar2.copyOnWrite();
                cjib cjibVar = (cjib) cjiaVar2.instance;
                evsy evsyVar = cjib.a;
                evvpVarB.getClass();
                cjibVar.h = evvpVarB;
                cjibVar.c |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.efoy
    public final void h(cjib cjibVar, efjr efjrVar) {
        efjrVar.c(ekgb.n((java.util.Collection) Collection.EL.stream(cjibVar.g).map(new Function() { // from class: efqr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cjij cjijVar = (cjij) obj;
                efhg efhgVar = new efhg();
                efhgVar.b(cjijVar.d);
                ejvj ejvjVar = efqs.b;
                cjgl cjglVar = cjijVar.c;
                if (cjglVar == null) {
                    cjglVar = cjgl.a;
                }
                efhgVar.c((ContentType) ejvjVar.fM(cjglVar));
                return AutoOneOf_Message_MessageContent.a(efhgVar.a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList())));
    }

    @Override // defpackage.efoy
    public final void i(cjib cjibVar, efjr efjrVar) {
        evsx evsxVar = cjibVar.k;
        evsy evsyVar = cjib.a;
        if (new evsz(evsxVar, evsyVar).isEmpty()) {
            return;
        }
        Stream stream = Collection.EL.stream(new evsz(cjibVar.k, evsyVar));
        final ejvj ejvjVar = c;
        efjrVar.d((ekhx) stream.map(new Function() { // from class: efqp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (efjs) ejvjVar.fM((cjhb) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b));
    }

    @Override // defpackage.efoy
    public final void j(cjib cjibVar, final efjr efjrVar) {
        if ((cjibVar.c & 16) != 0) {
            eyga eygaVar = cjibVar.i;
            if (eygaVar == null) {
                eygaVar = eyga.a;
            }
            Map.EL.forEach(DesugarCollections.unmodifiableMap(eygaVar.b), new BiConsumer() { // from class: efqm
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    final String str = (String) obj;
                    java.util.Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(((eyge) obj2).b);
                    final efjr efjrVar2 = efjrVar;
                    Map.EL.forEach(mapUnmodifiableMap, new BiConsumer() { // from class: efqq
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj3, Object obj4) {
                            efhy efhyVar = new efhy();
                            efhyVar.b((String) obj3);
                            efhyVar.c(str);
                            efhyVar.d((String) obj4);
                            MessageExtensionHeader messageExtensionHeaderA = efhyVar.a();
                            efhw efhwVar = (efhw) efjrVar2;
                            if (efhwVar.a == null) {
                                if (efhwVar.b == null) {
                                    int i = ekgb.d;
                                    efhwVar.a = new ekfw();
                                } else {
                                    int i2 = ekgb.d;
                                    efhwVar.a = new ekfw();
                                    efhwVar.a.j(efhwVar.b);
                                    efhwVar.b = null;
                                }
                            }
                            efhwVar.a.h(messageExtensionHeaderA);
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer);
                        }
                    });
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
    }

    @Override // defpackage.efoy
    public final void k(cjib cjibVar, efjr efjrVar) {
        cjjw cjjwVar = cjibVar.d;
        if (cjjwVar == null) {
            cjjwVar = cjjw.a;
        }
        efjrVar.f(cjjwVar.c);
    }

    @Override // defpackage.efoy
    public final void l(cjib cjibVar, efjr efjrVar) {
        if ((cjibVar.c & 8) != 0) {
            evvp evvpVar = cjibVar.h;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            efjrVar.j(evwz.d(evvpVar));
        }
    }
}
