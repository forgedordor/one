package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgkk extends fgle {
    @Override // defpackage.fgle
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fgkk b() {
        return (fgkk) this.e;
    }

    @Override // defpackage.fgle
    protected final void c(fgle fgleVar) {
        if (!(fgleVar instanceof fgkk)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.e = fgleVar;
    }
}
