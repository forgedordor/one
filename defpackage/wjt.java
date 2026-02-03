package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjt implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ wjy b;
    final /* synthetic */ List c;

    public wjt(fdpl[] fdplVarArr, wjy wjyVar, List list) {
        this.a = fdplVarArr;
        this.b = wjyVar;
        this.c = list;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new wjr(fdplVarArr), new wjs(null, this.b, this.c), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
