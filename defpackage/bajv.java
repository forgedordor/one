package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajv extends fcyz implements fdat {
    int a;
    final /* synthetic */ BackgroundLoadingMessageUsageStatisticsData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bajv(BackgroundLoadingMessageUsageStatisticsData backgroundLoadingMessageUsageStatisticsData, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = backgroundLoadingMessageUsageStatisticsData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bajv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        eiju eijuVar = this.b.a;
        this.a = 1;
        if (fdxs.c(eijuVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bajv(this.b, fcxyVar);
    }
}
