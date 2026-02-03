package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekah extends ekbw {
    final /* synthetic */ ekai a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekah(ekai ekaiVar, ekal ekalVar) {
        super(ekalVar);
        this.a = ekaiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ekbw
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ekai ekaiVar = this.a;
        ekal ekalVarG = obj.g();
        if (ekalVarG == ekaiVar.a) {
            return null;
        }
        return ekalVarG;
    }
}
