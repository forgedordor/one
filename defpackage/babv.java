package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class babv extends babu {
    private boolean a = false;

    @Override // defpackage.babu
    public final void fY(String str) {
        if (this.a) {
            throw new IllegalStateException();
        }
        super.fY(str);
        this.a = true;
    }

    @Override // defpackage.babu
    public final boolean i() {
        return super.i();
    }
}
