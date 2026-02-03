package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class assf extends assm {
    public assf(dstt dsttVar) {
        super("Jibe ContactsService failed.");
        ejwl.m(!dsttVar.succeeded(), "Should not create exception with a successful result.");
    }

    public assf(Throwable th) {
        super("Jibe ContactsService had an error.", th);
    }
}
