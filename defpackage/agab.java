package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agab extends fcyz implements fdat {
    final /* synthetic */ agac a;
    final /* synthetic */ afzu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agab(agac agacVar, afzu afzuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = agacVar;
        this.b = afzuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agab) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fcxy fcxyVar = ((agag) this.b).b;
        fcxy fcxyVar2 = null;
        if (fcxyVar == null) {
            fdbq.c("continuation");
            fcxyVar = null;
        }
        agac agacVar = this.a;
        fcxyVar.getClass();
        agacVar.c = fcxyVar;
        try {
            fcxy fcxyVar3 = agacVar.c;
            if (fcxyVar3 == null) {
                fdbq.c("continuation");
            } else {
                fcxyVar2 = fcxyVar3;
            }
            fcxyVar2.w(agacVar.b);
        } catch (Exception unused) {
            ((ekrd) agac.a.j().h("com/google/android/apps/messaging/navigation/statemachine/CompletedWithResultState$transitionFrom$1", "invokeSuspend", 36, "CompletedWithResultState.kt")).q("Disregarding exception thrown by resumed continuation");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new agab(this.a, this.b, fcxyVar);
    }
}
