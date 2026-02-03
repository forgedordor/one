package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafl extends fdcy {
    final /* synthetic */ aafo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafl(Object obj, aafo aafoVar) {
        super(obj);
        this.a = aafoVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        aafj aafjVar = (aafj) obj2;
        aafj aafjVar2 = (aafj) obj;
        if (aafjVar2 != aafjVar) {
            aafj aafjVar3 = aafj.a;
            if (aafjVar == aafjVar3) {
                aafo aafoVar = this.a;
                aafoVar.e.a(dadd.c, aafoVar.h.incrementAndGet());
            } else if (aafjVar2 == aafjVar3) {
                aafo aafoVar2 = this.a;
                aafoVar2.e.e(dadd.c, aafoVar2.h.get(), null, aafjVar == aafj.c ? dzua.CANCEL : dzua.SUCCESS);
            }
        }
    }
}
