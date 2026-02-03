package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awgi {
    public static final /* synthetic */ int b = 0;
    private final fcsu d;
    static final cczi a = cdag.c(cdag.b, "shadow_launch_2_conversation_match_logging_sampling_percent", 1.0d);
    private static final cqce c = cqce.g("BugleDataModel", "ShadowLaunch2Logger");

    public awgi(fcsu fcsuVar) {
        this.d = fcsuVar;
    }

    public final eiju a(ConversationIdType conversationIdType, boolean z, Optional optional, ekgb ekgbVar, final emum emumVar) {
        final ConversationIdType conversationIdType2 = (z || conversationIdType.b()) ? barn.a : conversationIdType;
        if (!z) {
            conversationIdType = barn.a;
        }
        Optional map = optional.map(new Function() { // from class: awgg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = awgi.b;
                return ((bojh) obj).C();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ConversationIdType conversationIdType3 = barn.a;
        if (((ConversationIdType) map.orElse(conversationIdType3)).equals(conversationIdType2)) {
            cqbd cqbdVarC = c.c();
            cqbdVarC.I("Telephony and BCM conversations matched.");
            cqbdVarC.A("trigger", emumVar);
            cqbdVarC.B("telephonyConversationIdIsNew", z);
            cqbdVarC.y("messageRecipients.size()", ekgbVar.size());
            cqbdVarC.r();
            final awfv awfvVar = (awfv) this.d.b();
            final cczi ccziVar = a;
            return eijx.f(new Runnable() { // from class: awfp
                /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 255
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.awfp.run():void");
                }
            }, awfvVar.d);
        }
        ConversationIdType conversationIdTypeC = optional.isPresent() ? ((bojh) optional.get()).C() : conversationIdType3;
        cqbd cqbdVarC2 = c.c();
        cqbdVarC2.I("Telephony and BCM conversations mismatched.");
        cqbdVarC2.B("telephonyConversationIdIsNew", z);
        cqbdVarC2.A("telephonyConversationId", conversationIdType2.toString());
        cqbdVarC2.A("bcmMatchedConversation", conversationIdTypeC);
        cqbdVarC2.A("trigger", emumVar);
        cqbdVarC2.r();
        final awfv awfvVar2 = (awfv) this.d.b();
        if (!conversationIdType2.b() && conversationIdType2.equals(conversationIdType)) {
            conversationIdType = conversationIdType3;
        }
        ejwl.a(!conversationIdType2.equals(conversationIdTypeC));
        final awch awchVarA = awfvVar2.b.a();
        awfh awfhVarA = awfvVar2.c.a(awchVarA);
        final eiju eijuVarA = awfv.a(awfhVarA, conversationIdType2);
        final eiju eijuVarA2 = awfv.a(awfhVarA, conversationIdTypeC);
        final eiju eijuVarA3 = awfv.a(awfhVarA, conversationIdType);
        Stream map2 = Collection.EL.stream(ekgbVar).map(new Function() { // from class: awfr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return awchVarA.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        final ekgb ekgbVar2 = (ekgb) map2.collect(ekcv.a);
        return eijx.m(eijuVarA, eijuVarA2, eijuVarA3).a(new Callable() { // from class: awfs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                awfvVar2.c((awfg) eork.q(eijuVarA), (awfg) eork.q(eijuVarA2), (awfg) eork.q(eijuVarA3), ekgbVar2, emumVar);
                return null;
            }
        }, awfvVar2.d);
    }
}
