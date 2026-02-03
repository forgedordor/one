package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwk implements ccuq {
    public final cbum a;
    private final cbwi b;
    private final fdjx c;

    public cbwk(cbwi cbwiVar, fdjx fdjxVar, cbum cbumVar) {
        this.b = cbwiVar;
        this.c = fdjxVar;
        this.a = cbumVar;
    }

    @Override // defpackage.ccuq
    public final Object a(String str, fdap fdapVar) {
        return fdapVar.invoke(this.a);
    }

    public final Object b(fdat fdatVar, fcxy fcxyVar) {
        return ejaa.a(this.c, this.b.a, new cbwj(fdatVar, this, null)).c(fcxyVar);
    }
}
