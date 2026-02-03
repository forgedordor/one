package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsp {
    private final ermi a;

    private eqsp(ermi ermiVar) {
        this.a = ermiVar;
    }

    public static eqsp b(eqso eqsoVar) {
        return new eqsp((ermi) eqsoVar.a.toBuilder());
    }

    public final synchronized eqso a() {
        return eqso.d((erml) this.a.build());
    }
}
