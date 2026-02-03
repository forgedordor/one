package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baju extends fcyz implements fdat {
    int a;
    final /* synthetic */ eiju b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baju(eiju eijuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = eijuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baju) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVar = this.b;
            this.a = 1;
            obj = fdxs.c(eijuVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return ((MessageUsageStatisticsDataImpl) obj).e();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new baju(this.b, fcxyVar);
    }
}
