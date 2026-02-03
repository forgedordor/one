package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwk extends fcuc {
    final /* synthetic */ fcwl a;
    private int b;
    private int c;

    public fcwk(fcwl fcwlVar) {
        this.a = fcwlVar;
        this.b = fcwlVar.d;
        this.c = fcwlVar.c;
    }

    @Override // defpackage.fcuc
    protected final void a() {
        if (this.b == 0) {
            b();
            return;
        }
        fcwl fcwlVar = this.a;
        c(fcwlVar.a[this.c]);
        this.c = (this.c + 1) % fcwlVar.b;
        this.b--;
    }
}
