package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwoa extends fcyz implements fdat {
    int a;
    final /* synthetic */ cwny b;
    final /* synthetic */ Intent c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwoa(cwny cwnyVar, Intent intent, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cwnyVar;
        this.c = intent;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwoa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cwny cwnyVar = this.b;
            Intent intent = this.c;
            String str = this.d;
            this.a = 1;
            if (cwnyVar.b(intent, str, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cwoa(this.b, this.c, this.d, fcxyVar);
    }
}
