package defpackage;

import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqe extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdpl b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqe(fdpl fdplVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdplVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqe) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = (fdpm) this.d;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            fdpl fdplVar = this.b;
            afqd afqdVar = new afqd(linkedHashSet, this.c, fdpmVar);
            this.a = 1;
            if (fdplVar.a(afqdVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqe afqeVar = new afqe(this.b, this.c, fcxyVar);
        afqeVar.d = obj;
        return afqeVar;
    }
}
