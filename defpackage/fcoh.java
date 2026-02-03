package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcoh extends fcol {
    final /* synthetic */ fcom a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcoh(fcom fcomVar) {
        super(fcomVar);
        this.a = fcomVar;
        int i = fcsr.a;
    }

    @Override // defpackage.fcol
    public final void a() {
        int i;
        ffez ffezVar = new ffez();
        int i2 = fcsr.a;
        fcom fcomVar = this.a;
        synchronized (fcomVar.a) {
            ffez ffezVar2 = fcomVar.b;
            ffezVar.hO(ffezVar2, ffezVar2.h());
            fcomVar.d = false;
            i = fcomVar.i;
        }
        fcom fcomVar2 = this.a;
        fcomVar2.f.hO(ffezVar, ffezVar.b);
        synchronized (fcomVar2.a) {
            fcomVar2.i -= i;
        }
    }
}
