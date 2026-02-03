package defpackage;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzs extends Filter {
    final /* synthetic */ czzt a;
    private final dacu b;

    public czzs(czzt czztVar, dacu dacuVar) {
        this.a = czztVar;
        this.b = dacuVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        cqaz.h();
        Filter.FilterResults filterResults = new Filter.FilterResults();
        try {
            if (eotp.a("bugle.skip_filter_on_empty_string", "bugle") && charSequence == null) {
                filterResults.values = new ArrayList();
                filterResults.count = 0;
                return filterResults;
            }
            List list = (List) dqle.b(this.b.p(charSequence == null ? "" : charSequence.toString()), 10L, TimeUnit.SECONDS);
            filterResults.values = list;
            filterResults.count = list.size();
            return filterResults;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            czzt.a.r("Failed to get suggestions.");
            return filterResults;
        }
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null || filterResults.values == null) {
            czzt czztVar = this.a;
            czztVar.c = new ArrayList();
            czztVar.notifyDataSetInvalidated();
            return;
        }
        czzt czztVar2 = this.a;
        czztVar2.c = (List) filterResults.values;
        cqaz.l(czztVar2.c);
        if (filterResults.count > 0) {
            czztVar2.notifyDataSetChanged();
        } else {
            czztVar2.notifyDataSetInvalidated();
        }
    }
}
