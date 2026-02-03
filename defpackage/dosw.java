package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dosw extends fdbo implements fdap {
    public dosw(Object obj) {
        super(1, obj, dota.class, "onActiveScreenChanged", "onActiveScreenChanged(Lcom/google/android/libraries/compose/ui/screen/HugoScreen;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        fduf fdufVar;
        dpxo dpxoVar = (dpxo) obj;
        dota dotaVar = (dota) this.g;
        int i = dota.am;
        dovr dovrVar = dotaVar.d;
        if (dovrVar != null) {
            dovrVar.o.d(dovr.a[2], dpxoVar);
            if (((dote) dotaVar.bC()).h && (dpxoVar instanceof dpxs)) {
                dovr dovrVar2 = dotaVar.d;
                if (dovrVar2 == null) {
                    fdbq.c("searchController");
                    dovrVar2 = null;
                }
                dovrVar2.e();
            }
            if (((dote) dotaVar.bC()).f && (fdufVar = dotaVar.ag) != null) {
                fdufVar.f(dpxoVar != null ? dpxoVar.t() : null);
            }
        }
        if (dotaVar.bJ()) {
            dotu dotuVar = dotaVar.c;
            if (dotuVar == null) {
                fdbq.c("headerController");
                dotuVar = null;
            }
            dotuVar.b.a(false);
        }
        dotaVar.aW(null);
        return fctx.a;
    }
}
