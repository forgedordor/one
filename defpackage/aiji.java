package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiji extends fcyz implements fdat {
    int a;
    final /* synthetic */ aijx b;
    final /* synthetic */ Intent c;
    final /* synthetic */ cldb d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiji(fcxy fcxyVar, aijx aijxVar, Intent intent, cldb cldbVar) {
        super(2, fcxyVar);
        this.b = aijxVar;
        this.c = intent;
        this.d = cldbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiji) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aijx aijxVar = this.b;
            Intent intent = this.c;
            cldb cldbVar = this.d;
            this.a = 1;
            if (aijxVar.a(intent, cldbVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aiji aijiVar = new aiji(fcxyVar, this.b, this.c, this.d);
        aijiVar.e = obj;
        return aijiVar;
    }
}
