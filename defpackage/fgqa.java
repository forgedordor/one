package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqa implements fgqd {
    public final fgqe a;

    private fgqa(fgqe fgqeVar) {
        this.a = fgqeVar;
    }

    static fgqd b(fgqe fgqeVar) {
        if (fgqeVar instanceof fgqe) {
            return fgqeVar;
        }
        if (fgqeVar == null) {
            return null;
        }
        return new fgqa(fgqeVar);
    }

    @Override // defpackage.fgqd
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fgqd
    public final int c(fgpz fgpzVar, CharSequence charSequence, int i) {
        return this.a.a.c(fgpzVar, charSequence.toString(), i);
    }
}
