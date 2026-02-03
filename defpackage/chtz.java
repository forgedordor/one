package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chtz implements chtw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy");
    private final ekgp b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public chtz(Map map, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = ekgp.j(map);
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    @Override // defpackage.chtw
    public final eiju a(alqm alqmVar) {
        if (!((aqan) this.d.b()).a() && !((aqao) this.e.b()).a() && !((aqap) this.f.b()).a()) {
            final enmr enmrVarD = ((cozg) this.c.b()).d();
            Optional map = Collection.EL.stream(this.b.entrySet()).filter(new Predicate() { // from class: chtx
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
                    return ((chua) ((Map.Entry) obj).getKey()).c.equals(enmrVarD);
                }
            }).findFirst().map(new Function() { // from class: chty
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (fcsu) ((Map.Entry) obj).getValue();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isEmpty()) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 84, "BotIdResolverTransportProxy.java")).t("getBotChatEndpoint: no BotIdResolver implementation registered for transport: %s", enmrVarD.name());
                return eijx.e(Optional.empty());
            }
            eieu eieuVarK = eiiy.k("BotIdResolverTransportProxy::getBotChatEndpoint2");
            try {
                eiju eijuVarA = ((chtw) ((fcsu) map.get()).b()).a(alqmVar);
                eieuVarK.b(eijuVarA);
                eieuVarK.close();
                return eijuVarA;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 62, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: viaBotInfo is enabled");
        fcsu fcsuVar = (fcsu) this.b.get(chua.BOT_INFO);
        if (fcsuVar == null) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/rbm/capabilities/BotIdResolverTransportProxy", "getBotChatEndpoint", 72, "BotIdResolverTransportProxy.java")).q("getBotChatEndpoint: no BotResolverStrategy.BOT_INFO impl");
            return eijx.e(Optional.empty());
        }
        eieu eieuVarK2 = eiiy.k("BotIdResolverTransportProxy::getBotChatEndpoint1");
        try {
            eiju eijuVarA2 = ((chtw) fcsuVar.b()).a(alqmVar);
            eieuVarK2.b(eijuVarA2);
            eieuVarK2.close();
            return eijuVarA2;
        } catch (Throwable th3) {
            try {
                eieuVarK2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
