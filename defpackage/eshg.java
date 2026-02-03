package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eshg implements eshj {
    final defr a;

    public eshg(defr defrVar) {
        this.a = defrVar;
    }

    @Override // defpackage.eshj
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.eshj
    public final boolean b(eshr eshrVar) {
        if (!eshrVar.m() && !eshrVar.l() && !eshrVar.j()) {
            return false;
        }
        this.a.d(((eshn) eshrVar).a);
        return true;
    }
}
