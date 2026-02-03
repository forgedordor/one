package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoq {
    public static final eksp a = eksp.c("RcsGroupIdUpdateChecker");
    public final eosc b;
    public final eosc c;
    public final aapx d;
    public final aaoc e;

    public aaoq(eosc eoscVar, eosc eoscVar2, aapx aapxVar, aaoc aaocVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = aapxVar;
        this.e = aaocVar;
    }

    public static ConcurrentMap a() {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        botb botbVarE = botm.e();
        botbVarE.A("getConversationIdsToRcsGroupIds");
        botbVarE.i(new Function() { // from class: aaom
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                eksp ekspVar = aaoq.a;
                botlVar.F();
                botlVar.H();
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.f(new Function() { // from class: aaon
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                eksp ekspVar = aaoq.a;
                return new bopq[]{boppVar.a, boppVar.aa};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Stream streamE = botbVarE.b().E();
        try {
            streamE.forEach(new Consumer() { // from class: aaoo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bojh bojhVar = (bojh) obj;
                    eksp ekspVar = aaoq.a;
                    ConversationIdType conversationIdTypeC = bojhVar.C();
                    String strAe = bojhVar.ae();
                    strAe.getClass();
                    concurrentHashMap.putIfAbsent(conversationIdTypeC, strAe);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (streamE != null) {
                streamE.close();
            }
            return concurrentHashMap;
        } catch (Throwable th) {
            if (streamE != null) {
                try {
                    streamE.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
