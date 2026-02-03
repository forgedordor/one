package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyu extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ fdpl[] c;
    final /* synthetic */ boolean[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auyu(long j, fdpl[] fdplVarArr, boolean[] zArr, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = fdplVarArr;
        this.d = zArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auyu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (fdkj.d(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        fdpl[] fdplVarArr = this.c;
        boolean[] zArr = this.d;
        int i2 = 0;
        int i3 = 0;
        while (i2 < fdplVarArr.length) {
            fdpl fdplVar = fdplVarArr[i2];
            int i4 = i3 + 1;
            if (!zArr[i3]) {
                ((ekrd) auxo.a.i().h("com/google/android/apps/messaging/shared/concurrent/flow/LoggedCombineKt$combineWithLogging$10$1", "invokeSuspend", 390, "LoggedCombine.kt")).t("Flow used in combine did not emit a value. Flow: %s", fdplVar);
            }
            i2++;
            i3 = i4;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new auyu(this.b, this.c, this.d, fcxyVar);
    }
}
