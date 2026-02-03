package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jno implements jpb {
    public hox a;
    private fdae b;
    private final hox c = new hpl(false, hsi.a);

    public static final void e(int i) {
        jpc.a.b(new isz(i));
    }

    @Override // defpackage.jpb
    public final long a() {
        if (this.a == null) {
            fdae fdaeVar = this.b;
            this.a = new hpl(new kjg(fdaeVar != null ? ((kjg) fdaeVar.invoke()).a : 0L), hsi.a);
            this.b = null;
        }
        hox hoxVar = this.a;
        hoxVar.getClass();
        return ((kjg) hoxVar.a()).a;
    }

    public final void b(fdae fdaeVar) {
        if (this.a == null) {
            this.b = fdaeVar;
        }
    }

    public final void c(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    @Override // defpackage.jpb
    public final boolean d() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
