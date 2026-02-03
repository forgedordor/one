package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efqy extends efpc {
    static final ejvj a = new efra();
    static final ejvj b = new efpw();
    static final ejvj c = new efpp();

    @Override // defpackage.efpc
    public final void b(cjky cjkyVar, effs effsVar) {
        evqe evqeVar = cjkyVar.c;
        if (evqeVar == null) {
            evqeVar = evqe.a;
        }
        evqs evqsVar = evqeVar.c;
        if (evqsVar == null) {
            throw new NullPointerException("Null opaqueData");
        }
        ((efcs) effsVar).d = evqsVar;
    }
}
