package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dobz extends fdbb implements fdap {
    public dobz(Object obj) {
        super(1, obj, docj.class, "onNewRelatedSearches", "onNewRelatedSearches(Ljava/util/List;)Lkotlinx/coroutines/Job;", 8);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        docj docjVar = (docj) this.b;
        int i = docj.aA;
        dqaf dqafVar = docjVar.al;
        if (dqafVar == null) {
            fdbq.c("relatedSearchesAdapter");
            dqafVar = null;
        }
        fdil.d(docjVar.bH(), null, null, new docd(list, docjVar, dqafVar, null), 3);
        return fctx.a;
    }
}
