package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orz {
    private orp a;
    private orp b;
    private orp c;

    public orz() {
        oro oroVar = oro.b;
        this.a = oroVar;
        this.b = oroVar;
        this.c = oroVar;
    }

    public final orp a(orr orrVar) {
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        throw new fctg();
    }

    public final orq b() {
        return new orq(this.a, this.b, this.c);
    }

    public final void c(orq orqVar) {
        this.a = orqVar.b;
        this.c = orqVar.d;
        this.b = orqVar.c;
    }

    public final void d(orr orrVar, orp orpVar) {
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            this.a = orpVar;
        } else if (iOrdinal == 1) {
            this.b = orpVar;
        } else {
            if (iOrdinal != 2) {
                throw new fctg();
            }
            this.c = orpVar;
        }
    }
}
