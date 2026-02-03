package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqh {
    private final fcsu a;

    public esqh(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final Object a(ejvr ejvrVar) throws esqi {
        try {
            esqd esqdVar = (esqd) this.a.b();
            if (esqdVar.a instanceof fgef) {
                throw new esqi();
            }
            return ejvrVar.apply(esqdVar);
        } catch (IllegalStateException | UnsatisfiedLinkError e) {
            throw new esqi(e);
        }
    }
}
