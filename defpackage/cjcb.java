package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjcb {
    public final atai a;
    public final cjbl b;
    public final cogw c;
    public final cjaj d;
    public final cjcd e;
    public final fcsu f;
    public final atvy g;
    private final eosc h;

    public cjcb(eosc eoscVar, atai ataiVar, cjbl cjblVar, cogw cogwVar, cjaj cjajVar, cjcd cjcdVar, fcsu fcsuVar, atvy atvyVar) {
        this.h = eoscVar;
        this.a = ataiVar;
        this.b = cjblVar;
        this.c = cogwVar;
        this.d = cjajVar;
        this.e = cjcdVar;
        this.f = fcsuVar;
        this.g = atvyVar;
    }

    public final eiju a(final MessageNotification messageNotification) {
        Callable callable = new Callable() { // from class: cjbv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Collection] */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessageNotification messageNotification2 = messageNotification;
                Conversation conversationA = messageNotification2.a();
                Message messageB = messageNotification2.b();
                final aufe aufeVar = (aufe) aufh.b.createBuilder();
                RcsDestinationId rcsDestinationIdA = messageB.a();
                cjcb cjcbVar = this.a;
                cjbl cjblVar = cjcbVar.b;
                aubq aubqVarA = cjblVar.a(rcsDestinationIdA, false);
                aufeVar.copyOnWrite();
                aufh aufhVar = (aufh) aufeVar.instance;
                aubqVarA.getClass();
                aufhVar.d = aubqVarA;
                aufhVar.c |= 1;
                aubq aubqVarA2 = cjblVar.a(conversationA.a(), conversationA.c() == 2);
                aufeVar.copyOnWrite();
                aufh aufhVar2 = (aufh) aufeVar.instance;
                aubqVarA2.getClass();
                aufhVar2.f = aubqVarA2;
                aufhVar2.c |= 8;
                String strH = messageB.h();
                aufeVar.copyOnWrite();
                aufh aufhVar3 = (aufh) aufeVar.instance;
                aufhVar3.c |= 256;
                aufhVar3.j = strH;
                String strB = conversationA.b();
                aufeVar.copyOnWrite();
                aufh aufhVar4 = (aufh) aufeVar.instance;
                aufhVar4.c |= 512;
                aufhVar4.k = strB;
                ekgb ekgbVarC = messageB.c();
                HashMap map = new HashMap();
                int size = ekgbVarC.size();
                for (int i = 0; i < size; i++) {
                    MessageExtensionHeader messageExtensionHeader = (MessageExtensionHeader) ekgbVarC.get(i);
                    eygc eygcVar = (eygc) map.get(messageExtensionHeader.b());
                    if (eygcVar == null) {
                        eygcVar = (eygc) eyge.a.createBuilder();
                        map.put(messageExtensionHeader.b(), eygcVar);
                    }
                    eygcVar.b(messageExtensionHeader.a(), messageExtensionHeader.c());
                }
                final eyfy eyfyVar = (eyfy) eyga.a.createBuilder();
                Map.EL.forEach(map, new BiConsumer() { // from class: cjbm
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        eyge eygeVar = (eyge) ((eygc) obj2).build();
                        eyfyVar.a((String) obj, eygeVar);
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                });
                eyga eygaVar = (eyga) eyfyVar.build();
                aufeVar.copyOnWrite();
                aufh aufhVar5 = (aufh) aufeVar.instance;
                eygaVar.getClass();
                aufhVar5.l = eygaVar;
                aufhVar5.c |= 1024;
                Optional optionalG = messageB.g();
                final cogw cogwVar = cjcbVar.c;
                cogwVar.getClass();
                evvp evvpVarB = evwz.b((Instant) optionalG.orElseGet(new Supplier() { // from class: cjbx
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return cogwVar.f();
                    }
                }));
                aufeVar.copyOnWrite();
                aufh aufhVar6 = (aufh) aufeVar.instance;
                evvpVarB.getClass();
                aufhVar6.n = evvpVarB;
                aufhVar6.c |= 2048;
                elpg elpgVarA = cjcbVar.d.a();
                aufeVar.copyOnWrite();
                aufh aufhVar7 = (aufh) aufeVar.instance;
                elpgVarA.getClass();
                aufhVar7.o = elpgVarA;
                aufhVar7.c |= 4096;
                ((cejp) cjcbVar.f.b()).b().ifPresentOrElse(new Consumer() { // from class: cjby
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        aufe aufeVar2 = aufeVar;
                        aubq aubqVar = (aubq) obj;
                        aufeVar2.copyOnWrite();
                        aufh aufhVar8 = (aufh) aufeVar2.instance;
                        evsy evsyVar = aufh.a;
                        aubqVar.getClass();
                        aufhVar8.h = aubqVar;
                        aufhVar8.c |= 64;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Runnable() { // from class: cjbz
                    @Override // java.lang.Runnable
                    public final void run() {
                        throw new IllegalArgumentException("RCS self identity is not present.");
                    }
                });
                ekgb ekgbVarB = messageB.b();
                int size2 = ekgbVarB.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Message.MessageContent messageContent = (Message.MessageContent) ekgbVarB.get(i2);
                    if (!efju.CHAT.equals(messageContent.a())) {
                        throw new IllegalArgumentException("Unsupported type ".concat(String.valueOf(String.valueOf(messageContent.a()))));
                    }
                    aufeVar.c((aubt) cjcbVar.a.fH().fM(messageContent.b()));
                }
                if (messageNotification2.b().d().isPresent()) {
                    Stream stream = Collection.EL.stream(messageNotification2.b().d().get());
                    final cjcd cjcdVar = cjcbVar.e;
                    aufeVar.a((Iterable) stream.map(new Function() { // from class: cjca
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (aufg) cjcdVar.fM((efjs) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(ekcv.b));
                } else {
                    aufeVar.d(aufg.POSITIVE_DELIVERY);
                    aufeVar.d(aufg.DISPLAY);
                }
                return (aufh) aufeVar.build();
            }
        };
        eosc eoscVar = this.h;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: cjbw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.g.b((aufh) obj);
            }
        }, eoscVar);
    }
}
