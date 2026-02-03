package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehz extends eejb {
    final /* synthetic */ int a;
    final /* synthetic */ eeih b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eehz(eeih eeihVar, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = eeihVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void V(ws wsVar, int[] iArr) {
        if (this.a == 0) {
            eeih eeihVar = this.b;
            iArr[0] = eeihVar.ag.getWidth();
            iArr[1] = eeihVar.ag.getWidth();
        } else {
            eeih eeihVar2 = this.b;
            iArr[0] = eeihVar2.ag.getHeight();
            iArr[1] = eeihVar2.ag.getHeight();
        }
    }
}
