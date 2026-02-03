package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oql {
    public final oqk a = new oqk();

    public final oxf a() {
        return this.a.c;
    }

    public final fdpl b(orr orrVar) {
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 1) {
            return this.a.a.b;
        }
        if (iOrdinal == 2) {
            return this.a.b.b;
        }
        throw new IllegalArgumentException("invalid load type for hints");
    }
}
