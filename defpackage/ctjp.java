package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjp {
    public fdlr a;
    private final fdjx b;

    public ctjp(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
    }

    public final synchronized boolean a(long j) {
        if (this.a != null) {
            return true;
        }
        this.a = auvw.l(this.b, new ctjo(j, this, null));
        return false;
    }
}
