package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmek {
    private static final cqce b = cqce.g("Bugle", "MessageSendingMetadata");
    public final cmfo a;

    public cmek(cmfo cmfoVar) {
        this.a = cmfoVar;
    }

    public final cmei a() {
        try {
            return (cmei) this.a.l();
        } catch (evtj e) {
            cqbd cqbdVarB = b.b();
            cqbdVarB.I("Couldn't load MessageSendingMetadata from store");
            cqbdVarB.s(e);
            return cmei.a;
        }
    }
}
