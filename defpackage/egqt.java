package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egqt extends fcyz implements fdat {
    final /* synthetic */ fdap a;
    final /* synthetic */ CancellationSignal b;
    final /* synthetic */ fdlt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egqt(fcxy fcxyVar, fdap fdapVar, CancellationSignal cancellationSignal, fdlt fdltVar) {
        super(2, fcxyVar);
        this.a = fdapVar;
        this.b = cancellationSignal;
        this.c = fdltVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egqt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb ekgbVar = (ekgb) this.a.invoke(this.b);
        this.c.t(null);
        return ekgbVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egqt egqtVar = new egqt(fcxyVar, this.a, this.b, this.c);
        egqtVar.d = obj;
        return egqtVar;
    }
}
