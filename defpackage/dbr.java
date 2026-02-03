package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbr {
    public final Object a;
    public final hox b = new hpl(null, hsi.a);

    public dbr(Object obj) {
        this.a = obj;
    }

    public final dbm a() {
        return (dbm) this.b.a();
    }

    public final dbm b() {
        dbm dbmVarA = a();
        if (dbmVarA != null) {
            return dbmVarA;
        }
        throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
    }

    public final boolean c() {
        dbl dblVarD;
        dbm dbmVarA = a();
        if (dbmVarA == null || (dblVarD = dbmVarA.d()) == null) {
            return false;
        }
        return dblVarD.j();
    }
}
