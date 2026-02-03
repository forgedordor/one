package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwn implements ccuq {
    public final cbvk a;
    private final dqsn b;

    public cbwn(dqsn dqsnVar, cbvk cbvkVar) {
        this.b = dqsnVar;
        this.a = cbvkVar;
    }

    @Override // defpackage.ccuq
    public final Object a(String str, final fdap fdapVar) {
        return this.b.c("TransactionalMls::run::".concat(str), new ejxr() { // from class: cbwl
            @Override // defpackage.ejxr
            public final Object get() {
                return fdapVar.invoke(this.a);
            }
        });
    }
}
