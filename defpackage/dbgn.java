package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgn extends dbgq {
    public final Object a;
    private final dbgr b;

    public dbgn(Object obj, dbgr dbgrVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = obj;
        this.b = dbgrVar;
    }

    @Override // defpackage.dbgq
    public final dbgr a() {
        return this.b;
    }

    @Override // defpackage.dbgq
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbgq) {
            dbgq dbgqVar = (dbgq) obj;
            dbgqVar.c();
            if (this.a.equals(dbgqVar.b())) {
                dbgqVar.e();
                if (this.b.equals(dbgqVar.a())) {
                    dbgqVar.d();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    @Override // defpackage.dbgq
    public final void c() {
    }

    @Override // defpackage.dbgq
    public final void d() {
    }

    @Override // defpackage.dbgq
    public final void e() {
    }
}
