package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnn extends fcyz implements fdat {
    int a;
    final /* synthetic */ abno b;
    final /* synthetic */ Intent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abnn(abno abnoVar, Intent intent, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abnoVar;
        this.c = intent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abnn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        abno abnoVar = this.b;
        Intent intent = this.c;
        this.a = 1;
        Object objA = fdin.a(eicg.a(abnoVar.d), new abnm(null, abnoVar, intent), this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abnn(this.b, this.c, fcxyVar);
    }
}
