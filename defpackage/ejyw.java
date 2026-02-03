package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyw extends ekbw {
    final /* synthetic */ ejyx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejyw(ejyx ejyxVar, ekal ekalVar) {
        super(ekalVar);
        this.a = ejyxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekbw
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ejyx ejyxVar = this.a;
        ekal ekalVarF = obj.f();
        if (ekalVarF == ejyxVar.a) {
            return null;
        }
        return ekalVarF;
    }
}
