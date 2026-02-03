package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcq extends ehbb {
    public ehbb a = null;
    private final ea b;
    private final egzo c;
    private final Executor d;

    public ehcq(ea eaVar, egzo egzoVar, Executor executor) {
        this.b = eaVar;
        this.c = egzoVar;
        this.d = executor;
    }

    private final ehbb a() {
        ecem.c();
        try {
            ejwl.m(((lvn) this.b.Q().P()).c == lvb.b, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    ea eaVar = this.b;
                    ehpg ehpgVarA = ehpg.a(eaVar.Q(), eaVar);
                    ea eaVar2 = this.b;
                    Executor executor = this.d;
                    this.a = new ehbn(new ehbr(new ehbk(eaVar2.Q(), ehpgVarA, executor), ehpgVarA, this.c, executor, eaVar2.Q()));
                    eaVar2.Q().P().c(new eijk(new ehcp(this)));
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            return this.a;
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }

    @Override // defpackage.ehbb
    public final ehba g(int i, ehaw ehawVar, ehay ehayVar) {
        return a().g(i, ehawVar, ehayVar);
    }

    @Override // defpackage.ehbb
    public final ehba h(ehay ehayVar) {
        return a().h(ehayVar);
    }
}
