package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehtv extends ehty {
    public String a;
    public Integer b;
    private esob c;

    @Override // defpackage.ehty
    public final ehtz a() {
        esob esobVar = this.c;
        if (esobVar != null) {
            return new ehtw(this.a, this.b, esobVar);
        }
        throw new IllegalStateException("Missing required properties: rpcServiceConfig");
    }

    @Override // defpackage.ehty
    public final void b(esob esobVar) {
        if (esobVar == null) {
            throw new NullPointerException("Null rpcServiceConfig");
        }
        this.c = esobVar;
    }
}
