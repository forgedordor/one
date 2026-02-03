package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ouk {
    public orp b;
    public orp c;
    public orp d;

    public ouk() {
        oro oroVar = oro.b;
        this.b = oroVar;
        this.c = oroVar;
        this.d = oroVar;
    }

    public abstract void a(orr orrVar, orp orpVar);

    public final void b(orr orrVar, orp orpVar) {
        orrVar.getClass();
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new fctg();
                }
                if (fdbq.f(this.d, orpVar)) {
                    return;
                } else {
                    this.d = orpVar;
                }
            } else if (fdbq.f(this.c, orpVar)) {
                return;
            } else {
                this.c = orpVar;
            }
        } else if (fdbq.f(this.b, orpVar)) {
            return;
        } else {
            this.b = orpVar;
        }
        a(orrVar, orpVar);
    }
}
