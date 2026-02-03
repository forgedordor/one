package defpackage;

import defpackage.evsh;
import defpackage.evsi;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evsi<MessageType extends evsi<MessageType, BuilderType>, BuilderType extends evsh<MessageType, BuilderType>> extends evsn<MessageType, BuilderType> implements evsj<MessageType, BuilderType> {
    public evry r = evry.a;

    final evry a() {
        evry evryVar = this.r;
        if (evryVar.c) {
            this.r = evryVar.clone();
        }
        return this.r;
    }

    @Override // defpackage.evsj
    public final Object b(evrp evrpVar) {
        throw null;
    }

    @Override // defpackage.evsj
    public final boolean c(evrp evrpVar) {
        throw null;
    }

    public final void d(evsl evslVar) {
        if (evslVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
