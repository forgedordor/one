package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coad implements fdap {
    final /* synthetic */ fdap a;

    public coad(fdap fdapVar) {
        this.a = fdapVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cnza cnzaVar = (cnza) obj;
        cnzaVar.getClass();
        cnze cnzeVarA = cnzd.a((cnyl) cnzaVar.toBuilder());
        this.a.invoke(cnzeVarA);
        cnza cnzaVarA = cnzeVarA.a();
        int i = cnzaVarA.b;
        if ((i & 2) != 0 && (i & 1) == 0) {
            throw new IllegalStateException("Check failed.");
        }
        evtg<cnyz> evtgVar = cnzaVarA.c;
        evtgVar.getClass();
        int i2 = 0;
        if (!evtgVar.isEmpty()) {
            int i3 = 0;
            for (cnyz cnyzVar : evtgVar) {
                cnyzVar.getClass();
                if (cobt.f(cnyzVar) && (i3 = i3 + 1) < 0) {
                    fcva.l();
                }
            }
            if (i3 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        evtg<cnyz> evtgVar2 = cnzaVarA.c;
        evtgVar2.getClass();
        if (!evtgVar2.isEmpty()) {
            int i4 = 0;
            for (cnyz cnyzVar2 : evtgVar2) {
                cnyzVar2.getClass();
                if (cobt.g(cnyzVar2) && (i4 = i4 + 1) < 0) {
                    fcva.l();
                }
            }
            if (i4 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        evtg<cnyz> evtgVar3 = cnzaVarA.c;
        evtgVar3.getClass();
        if (!evtgVar3.isEmpty()) {
            for (cnyz cnyzVar3 : evtgVar3) {
                cnyzVar3.getClass();
                if (cobt.e(cnyzVar3) && (i2 = i2 + 1) < 0) {
                    fcva.l();
                }
            }
            if (i2 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return cnzaVarA;
    }
}
