package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcoi extends fcol {
    final /* synthetic */ fcom a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcoi(fcom fcomVar) {
        super(fcomVar);
        this.a = fcomVar;
        int i = fcsr.a;
    }

    @Override // defpackage.fcol
    public final void a() {
        ffez ffezVar = new ffez();
        int i = fcsr.a;
        fcom fcomVar = this.a;
        synchronized (fcomVar.a) {
            ffez ffezVar2 = fcomVar.b;
            ffezVar.hO(ffezVar2, ffezVar2.b);
            fcomVar.e = false;
        }
        fcom fcomVar2 = this.a;
        fcomVar2.f.hO(ffezVar, ffezVar.b);
        fcomVar2.f.flush();
    }
}
