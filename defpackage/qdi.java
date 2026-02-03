package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qdi extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdi(Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((qdi) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        qli.a(this.b, RescheduleReceiver.class, this.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        qdi qdiVar = new qdi(this.b, fcxyVar);
        qdiVar.a = ((Boolean) obj).booleanValue();
        return qdiVar;
    }
}
