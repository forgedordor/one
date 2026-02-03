package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fckb implements Runnable {
    final fcjz a;
    final /* synthetic */ fckp b;

    public fckb(fckp fckpVar, fcjz fcjzVar) {
        this.b = fckpVar;
        this.a = fcjzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fckp fckpVar = this.b;
        fckn fcknVarS = fckpVar.s(fckpVar.w.e, false);
        if (fcknVarS == null) {
            return;
        }
        fckpVar.k.execute(new fcka(this, fcknVarS));
    }
}
