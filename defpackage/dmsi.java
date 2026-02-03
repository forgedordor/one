package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsi implements fdae {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ fdap c;
    final /* synthetic */ dmsb d;

    public dmsi(boolean z, boolean z2, fdap fdapVar, dmsb dmsbVar) {
        this.a = z;
        this.b = z2;
        this.c = fdapVar;
        this.d = dmsbVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!this.a && !this.b) {
            this.c.invoke(this.d);
        }
        return fctx.a;
    }
}
