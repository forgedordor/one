package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* compiled from: PG */
/* loaded from: classes.dex */
final class liz extends Filter {
    final liy a;

    public liz(liy liyVar) {
        this.a = liyVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorA = this.a.a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorA != null) {
            filterResults.count = cursorA.getCount();
            filterResults.values = cursorA;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        liy liyVar = this.a;
        Cursor cursorG = liyVar.g();
        if (filterResults.values == null || filterResults.values == cursorG) {
            return;
        }
        liyVar.e((Cursor) filterResults.values);
    }
}
