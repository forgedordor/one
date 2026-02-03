package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cppp implements Supplier {
    boolean a = false;
    epjv b = epjv.a;
    final /* synthetic */ cppr c;

    public cppp(cppr cpprVar) {
        this.c = cpprVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized epjv get() {
        if (!this.a) {
            cppr cpprVar = this.c;
            evqe evqeVar = cpprVar.e.h;
            if (evqeVar == null) {
                evqeVar = evqe.a;
            }
            evqs evqsVar = evqeVar.c;
            try {
                this.b = (epjv) cpprVar.b.a((epkh) evsn.parseFrom(epkh.a, evqsVar, evrr.a()), epjv.a);
                this.a = true;
            } catch (cpql e) {
                cqbd cqbdVarE = cppr.a.e();
                cqbdVarE.I("Conversation FrequentlyChangedPart decryption succeeded. Original exception is logged below.");
                cppr cpprVar2 = this.c;
                cqbdVarE.A("cmsConversationId", cpprVar2.e.c);
                cqbdVarE.s(e);
                cpprVar2.g = true;
                return (epjv) e.a;
            } catch (evtj e2) {
                cqbd cqbdVarB = cppr.a.b();
                cqbdVarB.I("Failed to create FrequentlyChangedPart");
                cqbdVarB.A("cmsConversationId", this.c.e.c);
                cqbdVarB.s(e2);
                throw new cppm(e2);
            }
        }
        return this.b;
    }
}
