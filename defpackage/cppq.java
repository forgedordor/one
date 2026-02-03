package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cppq implements Supplier {
    boolean a = false;
    epjx b = epjx.a;
    final /* synthetic */ cppr c;

    public cppq(cppr cpprVar) {
        this.c = cpprVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized epjx get() {
        if (!this.a) {
            try {
                cppr cpprVar = this.c;
                this.b = cpprVar.c.a(cpprVar.e);
                this.a = true;
            } catch (cpql e) {
                cqbd cqbdVarE = cppr.a.e();
                cqbdVarE.I("Conversation RarelyChangedPart decryption succeeded. Original exception is logged below.");
                cppr cpprVar2 = this.c;
                cqbdVarE.A("cmsConversationId", cpprVar2.e.c);
                cqbdVarE.s(e);
                cpprVar2.g = true;
                return (epjx) e.a;
            } catch (evtj e2) {
                cqbd cqbdVarB = cppr.a.b();
                cqbdVarB.I("Failed to create RarelyChangedPart");
                cqbdVarB.A("cmsConversationId", this.c.e.c);
                cqbdVarB.s(e2);
                throw new cppn(e2);
            }
        }
        return this.b;
    }
}
