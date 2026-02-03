package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pdm {
    public abstract String a();

    public abstract void b(pjl pjlVar, Object obj);

    public final void c(pgz pgzVar, Iterable iterable) throws Exception {
        pgzVar.getClass();
        if (iterable == null) {
            return;
        }
        phi phiVarA = pgzVar.a(a());
        try {
            ekqh it = ((ekgb) iterable).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next != null) {
                    b(phiVarA, next);
                    phiVarA.j();
                    phiVarA.h();
                }
            }
            fdaa.a(phiVarA, null);
        } finally {
        }
    }
}
