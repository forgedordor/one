package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cauh extends cayv {
    public final cqce a = cqce.g("BugleDataModel", "DeleteThreadFromTelephonyHandler");
    public final cmqj b;
    private final eosc c;

    public cauh(eosc eoscVar, cmqj cmqjVar) {
        this.c = eoscVar;
        this.b = cmqjVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DeleteThreadFromTelephonyHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cauj.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cauj caujVar = (cauj) evuhVar;
        return eijx.g(new Callable() { // from class: caug
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cauh cauhVar = this.a;
                cmqj cmqjVar = cauhVar.b;
                cauj caujVar2 = caujVar;
                if (cmqjVar.N(caujVar2.c, caujVar2.d)) {
                    long j = caujVar2.d;
                    long j2 = caujVar2.c;
                    cqbd cqbdVarC = cauhVar.a.c();
                    cqbdVarC.I("Deleted telephony");
                    cqbdVarC.z("threadId", j2);
                    cqbdVarC.z("cutoffTimestamp", j);
                    cqbdVarC.r();
                } else {
                    ConversationIdType conversationIdTypeB = barn.b(caujVar2.b);
                    long j3 = caujVar2.d;
                    long j4 = caujVar2.c;
                    cqbd cqbdVarE = cauhVar.a.e();
                    cqbdVarE.I("there were no messages to delete. telephony:");
                    cqbdVarE.c(conversationIdTypeB);
                    cqbdVarE.z("threadId", j4);
                    cqbdVarE.z("cutoffTimestamp", j3);
                    cqbdVarE.I("[might have been a conversation with just a draft].");
                    cqbdVarE.r();
                }
                return cbcw.i();
            }
        }, this.c);
    }
}
