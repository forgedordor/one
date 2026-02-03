package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmk implements fic {
    final /* synthetic */ fmx a;

    public fmk(fmx fmxVar) {
        this.a = fmxVar;
    }

    @Override // defpackage.fic
    public final boolean b(long j, fit fitVar) {
        faj fajVar;
        fmx fmxVar = this.a;
        if (!fmxVar.A() || fmxVar.f().a().length() == 0 || (fajVar = fmxVar.d) == null || fajVar.d() == null) {
            return false;
        }
        d(fmxVar.f(), j, false, fitVar);
        return true;
    }

    @Override // defpackage.fic
    public final boolean c(long j, fit fitVar) {
        faj fajVar;
        fmx fmxVar = this.a;
        if (!fmxVar.A() || fmxVar.f().a().length() == 0 || (fajVar = fmxVar.d) == null || fajVar.d() == null) {
            return false;
        }
        igr igrVar = fmxVar.j;
        if (igrVar != null) {
            igrVar.a(new igq());
        }
        fmxVar.m = j;
        fmxVar.w = -1;
        fmxVar.j(true);
        d(fmxVar.f(), fmxVar.m, true, fitVar);
        return true;
    }

    public final void d(kew kewVar, long j, boolean z, fit fitVar) {
        fmx fmxVar = this.a;
        fmxVar.q(jyo.i(fmxVar.b(kewVar, j, z, false, fitVar, false)) ? ezm.c : ezm.b);
    }

    @Override // defpackage.fic
    public final void a() {
    }
}
