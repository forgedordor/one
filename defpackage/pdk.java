package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pdk {
    public abstract String a();

    public abstract void b(pjl pjlVar, Object obj);

    public final void c(pgz pgzVar, Object obj) throws Exception {
        pgzVar.getClass();
        if (obj == null) {
            return;
        }
        phi phiVarA = pgzVar.a(a());
        try {
            b(phiVarA, obj);
            phiVarA.j();
            fdaa.a(phiVarA, null);
            pic.a(pgzVar);
        } finally {
        }
    }
}
