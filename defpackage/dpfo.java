package defpackage;

import android.text.InputFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpfo extends fdcy {
    final /* synthetic */ dpfq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfo(dpfq dpfqVar) {
        super(null);
        this.a = dpfqVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        dpfq dpfqVar = this.a;
        if (dpfqVar.m != null) {
            InputFilter[] filters = dpfqVar.getFilters();
            filters.getClass();
            int iE = fcur.E(filters, dpfqVar.m);
            if (iE >= 0) {
                int length = filters.length - 1;
                InputFilter[] inputFilterArr = new InputFilter[length];
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    inputFilterArr[i] = i < iE ? filters[i] : filters[i2];
                    i = i2;
                }
                filters = inputFilterArr;
            }
            dpfqVar.setFilters(filters);
            dpfqVar.m = null;
        }
        if (num != null) {
            Integer num2 = num.intValue() != Integer.MAX_VALUE ? num : null;
            if (num2 != null) {
                num2.intValue();
                dpfqVar.m = new InputFilter.LengthFilter(num.intValue());
                InputFilter[] filters2 = dpfqVar.getFilters();
                filters2.getClass();
                dpfqVar.setFilters((InputFilter[]) dnge.a(filters2, dpfqVar.m));
            }
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
