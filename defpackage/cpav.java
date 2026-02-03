package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cpav extends vo {
    private final eidm e;
    public bcut d = null;
    public boolean a = false;

    public cpav(eidm eidmVar) {
        this.e = eidmVar;
    }

    @Override // defpackage.vo
    public final int a() {
        bcut bcutVar;
        eifp eifpVarA = this.e.a("RecyclerViewCursorAdapter#getItemCount");
        try {
            int count = 0;
            if (this.a && (bcutVar = this.d) != null && !bcutVar.isClosed()) {
                count = this.d.getCount();
            }
            eifpVarA.close();
            return count;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
