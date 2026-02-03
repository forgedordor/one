package defpackage;

import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfuv {
    public static final ContentType e;
    public static final ekgp f;
    public static final dhip g;
    public final diep h;
    public final dgwa i;
    public final ebcm j;
    private final efnm l;
    static final dfny a = dfod.a(169783196);
    static final dfny b = dfod.a(182480073);
    static final dfny c = dfod.a(181336021);
    static final dfny d = dfod.a(185593693);
    private static final dfny k = dfod.a(188541474);

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f("message");
        efilVarD.e("cpim");
        e = efilVarD.g();
        f = ekgp.l("urn:ietf:params:imdn", "imdn");
        g = new dhip("MessageConverter");
    }

    public dfuv(diep diepVar, dgwa dgwaVar, efnm efnmVar, ebcm ebcmVar) {
        this.h = diepVar;
        this.l = efnmVar;
        this.i = dgwaVar;
        this.j = ebcmVar;
    }

    public final dgyx a(Conversation conversation, Message message, MessageClass messageClass) {
        return b(conversation, message, Optional.of(messageClass), efkm.MESSAGING_METHOD_CHAT);
    }

    public final dgyx b(Conversation conversation, Message message, Optional optional, efkm efkmVar) {
        efgw efgwVarC = c(conversation, message, optional);
        String strF = dfwf.f((RcsDestinationId) (message.f().isPresent() ? message.f().get() : conversation.a()));
        String strF2 = dfwf.f(message.a());
        boolean z = optional.isEmpty() || ((MessageClass) optional.get()).b() == efjy.USER;
        dgyx dgyxVar = new dgyx(dgyw.CPIM_MESSAGE, true == efkmVar.equals(efkm.MESSAGING_METHOD_SLM) ? 2 : 1);
        dgyxVar.b = strF;
        dgyxVar.c = strF2;
        dgyxVar.k = message.h();
        dgyxVar.j = this.h.f().toEpochMilli();
        dgyxVar.f(e.toString(), efgwVarC);
        dgyxVar.r = z;
        return dgyxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final efgw c(Conversation conversation, Message message, Optional optional) {
        String strF = dfwf.f(message.a());
        String strF2 = "sip:anonymous@anonymous.invalid";
        if (conversation.c() != 2) {
            strF = "sip:anonymous@anonymous.invalid";
        }
        if (conversation.c() == 2 && message.f().isPresent()) {
            strF2 = dfwf.f((RcsDestinationId) message.f().get());
        }
        try {
            if (message.b().size() != 1) {
                throw new IllegalArgumentException("Expect one content, found " + message.b().size());
            }
            Message.MessageContent messageContent = (Message.MessageContent) message.b().get(0);
            int iOrdinal = messageContent.a().ordinal();
            efnd efndVarB = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? this.l.b(messageContent.b()) : this.l.b(messageContent.e()) : this.l.b(messageContent.c()) : this.l.b(messageContent.f()) : this.l.b(messageContent.d());
            String str = (String) f.get("urn:ietf:params:imdn");
            str.getClass();
            final efgv efgvVarF = efgw.f();
            efgvVarF.g(str, "urn:ietf:params:imdn");
            efgvVarF.e("From", new ebcq(strF).toString());
            efgvVarF.e("To", new ebcq(strF2).toString());
            efgvVarF.e("DateTime", this.h.f().toString());
            efgvVarF.f("urn:ietf:params:imdn", "Message-ID", message.h());
            efgy efgyVarD = efgz.d();
            efgyVarD.d(new ebcj(efndVarB.b(), efndVarB.b().d()));
            efgyVarD.f(ffho.a, efndVarB.a().toString());
            if (((Boolean) d.a()).booleanValue() && optional.isPresent() && MessageClass.f((MessageClass) optional.get())) {
                efgyVarD.f(ffho.c, "notification");
            }
            if (((Boolean) c.a()).booleanValue()) {
                efgyVarD.f("Content-Length", String.valueOf(efndVarB.b().d()));
            }
            ((efgm) efgvVarF).a = efgyVarD.e();
            if (((Boolean) b.a()).booleanValue()) {
                optional.flatMap(new Function() { // from class: dfup
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        MessageClass messageClass = (MessageClass) obj;
                        if (!efjy.USER.equals(messageClass.b()) || !efjx.HIGH.equals(messageClass.a()) || (((Boolean) MessageClass.a.a()).booleanValue() && !messageClass.c())) {
                            return Optional.empty();
                        }
                        dfuv dfuvVar = this.a;
                        boolean zD = messageClass.d();
                        dgzu dgzuVar = (dgzu) dfuvVar.i.a(dgzu.class);
                        dgzuVar.getClass();
                        if (!dfpk.v() || !dgzuVar.x() || !zD) {
                            return Optional.of(dgzn.D);
                        }
                        return Optional.of(dgzn.D + ", " + ebcu.INTERWORKING_SMS.p);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).ifPresent(new Consumer() { // from class: dfuq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ContentType contentType = dfuv.e;
                        efgvVarF.f("urn:ietf:params:imdn", "Disposition-Notification", (String) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ekgb ekgbVarC = message.c();
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
            Map.EL.forEach(map, new BiConsumer() { // from class: dfui
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    eyge eygeVar = (eyge) ((eygc) obj2).build();
                    eyfyVar.a((String) obj, eygeVar);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            int i2 = 1;
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(((eyga) eyfyVar.build()).b).entrySet()) {
                int i3 = i2 + 1;
                efgvVarF.g(String.format(Locale.US, "n%d", Integer.valueOf(i2)), (String) entry.getKey());
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                    efgvVarF.f((String) entry.getKey(), (String) entry2.getKey(), (String) entry2.getValue());
                }
                i2 = i3;
            }
            return efgvVarF.a();
        } catch (efoc e2) {
            throw new IllegalArgumentException("MessageContent could not be serialized", e2);
        }
    }

    public final Message d(Conversation conversation, dgyx dgyxVar) {
        ekgb ekgbVarG;
        Instant instantF;
        if (dgyxVar.a == dgyw.CPIM_MESSAGE) {
            ekfw ekfwVar = new ekfw();
            try {
                efgw efgwVarA = efhe.a(dgyxVar.f);
                if (((Boolean) a.a()).booleanValue()) {
                    ekfwVar.j(dful.a(dgyxVar));
                } else {
                    efgz efgzVar = ((efgn) efgwVarA).c;
                    ContentType contentTypeE = ContentType.e((String) efgzVar.g().orElseThrow(new Supplier() { // from class: dfuo
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            ContentType contentType = dfuv.e;
                            return new IllegalArgumentException("No Content-Type given!");
                        }
                    }));
                    efhg efhgVar = new efhg();
                    efhgVar.b(((efgp) efgzVar).a);
                    efhgVar.c(contentTypeE);
                    ekfwVar.h(AutoOneOf_Message_MessageContent.a(efhgVar.a()));
                }
                ekgb ekgbVarG2 = ekfwVar.g();
                String strC = ((Boolean) k.a()).booleanValue() ? (String) efgwVarA.j("Message-ID").map(new Function() { // from class: dfur
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((efhb) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse("local:".concat(String.valueOf(String.valueOf(UUID.randomUUID())))) : ((efhb) efgwVarA.j("Message-ID").orElseThrow(new Supplier() { // from class: dfus
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ContentType contentType = dfuv.e;
                        return new IllegalStateException("No Messageid given in the instant message");
                    }
                })).c();
                RcsDestinationId rcsDestinationIdE = conversation.c() == 2 ? dfwf.e(ebcq.a(((efhb) efgwVarA.h("From").orElseThrow(new Supplier() { // from class: dfut
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ContentType contentType = dfuv.e;
                        return new IllegalArgumentException("CPIM message has no from header assigned!");
                    }
                })).c()).a) : conversation.a();
                Optional optionalH = efgwVarA.h("DateTime");
                if (optionalH.isPresent()) {
                    try {
                        instantF = Instant.ofEpochMilli(dhie.c(((efhb) optionalH.get()).c()).a);
                    } catch (IllegalArgumentException unused) {
                        dhja.r(g, "Date can't be parsed as RFC3339 date: %s", ((efhb) optionalH.get()).c());
                        instantF = this.h.f();
                    }
                } else {
                    instantF = this.h.f();
                }
                int i = ekgb.d;
                final ekfw ekfwVar2 = new ekfw();
                Collection.EL.stream(efgwVarA.g()).forEach(new Consumer() { // from class: dfuu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        efhb efhbVar = (efhb) obj;
                        ContentType contentType = dfuv.e;
                        efhy efhyVar = new efhy();
                        efhyVar.c(efhbVar.b());
                        efhyVar.b(efhbVar.a());
                        efhyVar.d(efhbVar.c());
                        ekfwVar2.h(efhyVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                efjr efjrVarI = Message.i();
                efjrVarI.f(strC);
                efjrVarI.i(rcsDestinationIdE);
                efjrVarI.c(ekgbVarG2);
                efjrVarI.j(instantF);
                efjrVarI.e(ekfwVar2.g());
                efjrVarI.d(ekhx.o((Set) Collection.EL.stream(ejxk.d(",").f().a().i((String) efgwVarA.j("Disposition-Notification").map(new Function() { // from class: efgu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((efhb) obj).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""))).map(new Function() { // from class: dfum
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str = (String) obj;
                        ContentType contentType = dfuv.e;
                        if (ebcu.DELIVERED.p.equals(str)) {
                            return efjs.POSITIVE_DELIVERY;
                        }
                        if (ebcu.DISPLAYED.p.equals(str)) {
                            return efjs.DISPLAY;
                        }
                        if (((Boolean) dfog.o().a.aK.a()).booleanValue() && ebcu.DELIVERY_FAILED.p.equals(str)) {
                            return efjs.NEGATIVE_DELIVERY;
                        }
                        dhja.r(dfuv.g, "DispositionNotification %s is not supported.", str);
                        return null;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).filter(new Predicate() { // from class: dfun
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
                        return Objects.nonNull((efjs) obj);
                    }
                }).collect(Collectors.toSet())));
                return efjrVarI.a();
            } catch (IOException e2) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e2);
            }
        }
        ekfw ekfwVar3 = new ekfw();
        if (((Boolean) a.a()).booleanValue()) {
            ekfwVar3.j(dful.a(dgyxVar));
        } else {
            ContentType contentTypeE2 = ContentType.e(dgyxVar.h);
            efhg efhgVar2 = new efhg();
            efhgVar2.b(evqs.x(dgyxVar.f));
            efhgVar2.c(contentTypeE2);
            ekfwVar3.h(AutoOneOf_Message_MessageContent.a(efhgVar2.a()));
        }
        efjr efjrVarI2 = Message.i();
        efjrVarI2.f(ejwk.b(dgyxVar.k));
        efjrVarI2.i(conversation.a());
        efjrVarI2.j(Instant.ofEpochMilli(dgyxVar.j));
        efjrVarI2.c(ekfwVar3.g());
        eyga eygaVar = dgyxVar.i;
        if (eygaVar == null) {
            int i2 = ekgb.d;
            ekgbVarG = ekoe.a;
        } else {
            int i3 = ekgb.d;
            ekfw ekfwVar4 = new ekfw();
            for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
                for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                    efhy efhyVar = new efhy();
                    efhyVar.c((String) entry.getKey());
                    efhyVar.b((String) entry2.getKey());
                    efhyVar.d((String) entry2.getValue());
                    ekfwVar4.h(efhyVar.a());
                }
            }
            ekgbVarG = ekfwVar4.g();
        }
        efjrVarI2.e(ekgbVarG);
        efjrVarI2.g(dgyxVar.s);
        return efjrVarI2.a();
    }
}
