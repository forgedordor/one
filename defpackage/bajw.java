package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajw extends fcyz implements fdat {
    int a;
    final /* synthetic */ BackgroundLoadingMessageUsageStatisticsData b;
    final /* synthetic */ Parcel c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bajw(BackgroundLoadingMessageUsageStatisticsData backgroundLoadingMessageUsageStatisticsData, Parcel parcel, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = backgroundLoadingMessageUsageStatisticsData;
        this.c = parcel;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bajw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVar = this.b.a;
            this.a = 1;
            obj = fdxs.c(eijuVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ((MessageUsageStatisticsDataImpl) obj).writeToParcel(this.c, this.d);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bajw(this.b, this.c, this.d, fcxyVar);
    }
}
