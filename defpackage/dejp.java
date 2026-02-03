package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.usagereporting.internal.IUsageReportingService;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejp extends dcfm implements dejx {
    public dejp(Context context, deju dejuVar) {
        super(context, dejv.a, dejuVar, dcfl.a);
    }

    @Override // defpackage.dejx
    public final defn a() {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: deji
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getCheckboxSettingsPendingIntent(new dekb((defr) obj2));
            }
        };
        dcizVar.b = new Feature[]{dejh.d};
        dcizVar.c = 4509;
        return j(dcizVar.a());
    }

    @Override // defpackage.dejx
    public final defn b() {
        dciz dcizVar = new dciz();
        dcizVar.a = new dcir() { // from class: dejl
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                ((IUsageReportingService) ((UsageReportingClientImpl) obj).w()).getOptInOptions(new dejm((defr) obj2));
            }
        };
        dcizVar.c = 4501;
        return j(dcizVar.a());
    }

    @Override // defpackage.dejx
    public final void c(dejw dejwVar) {
        final dcib dcibVarB = dcic.b(dejwVar, this.i, "dejw");
        final UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener = ((deju) this.g).a;
        dcir dcirVar = new dcir() { // from class: dejj
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener usageReportingOptInOptionsChangedListener2 = new UsageReportingClientImpl.UsageReportingOptInOptionsChangedListener(dcibVarB);
                ((UsageReportingClientImpl) obj).M(usageReportingOptInOptionsChangedListener, usageReportingOptInOptionsChangedListener2, new dejn(this.a, (defr) obj2, usageReportingOptInOptionsChangedListener2));
            }
        };
        dcir dcirVar2 = new dcir() { // from class: dejk
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                dejp dejpVar = this.a;
                ((UsageReportingClientImpl) obj).M(((deju) dejpVar.g).a, null, new dejo(dejpVar, (defr) obj2));
            }
        };
        dcip dcipVar = new dcip();
        dcipVar.a = dcirVar;
        dcipVar.b = dcirVar2;
        dcipVar.c = dcibVarB;
        dcipVar.d = new Feature[]{dejh.a};
        dcipVar.e = 4507;
        k(dcipVar.a());
    }
}
