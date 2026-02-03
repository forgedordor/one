package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnw implements hqt {
    private final fdap a;
    private hnx b;

    public hnw(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.hqt
    public final void h() {
        hnx hnxVar = this.b;
        if (hnxVar != null) {
            hnxVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.hqt
    public final void i() {
        this.b = (hnx) this.a.invoke(hob.a);
    }

    @Override // defpackage.hqt
    public final void g() {
    }
}
