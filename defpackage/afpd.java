package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpd implements fdpl {
    final /* synthetic */ fdpl[] a;
    final /* synthetic */ afpe b;
    final /* synthetic */ List c;

    public afpd(fdpl[] fdplVarArr, afpe afpeVar, List list) {
        this.a = fdplVarArr;
        this.b = afpeVar;
        this.c = list;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        fdpl[] fdplVarArr = this.a;
        Object objA = fdwo.a(fdpmVar, fdplVarArr, new afpb(fdplVarArr), new afpc(null, this.b, this.c), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
