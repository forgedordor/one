package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wlf implements fdap {
    final /* synthetic */ boolean a;
    final /* synthetic */ yov b;
    final /* synthetic */ fduf c;
    final /* synthetic */ fduf d;

    public wlf(boolean z, yov yovVar, fduf fdufVar, fduf fdufVar2) {
        this.a = z;
        this.b = yovVar;
        this.c = fdufVar;
        this.d = fdufVar2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (this.a) {
            this.b.g();
            this.c.f(true);
        }
        this.d.f(Float.valueOf(fFloatValue));
        return fctx.a;
    }
}
