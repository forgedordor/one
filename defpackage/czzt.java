package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzt extends BaseAdapter implements Filterable {
    public static final cqce a = cqce.g("Bugle", "ZeroStateSearchBoxAdapter");
    public final Filter b;
    private final LayoutInflater d;
    private final int f;
    private final rtj e = (rtj) new rtj().A();
    public List c = new ArrayList();

    public czzt(Context context, dacu dacuVar) {
        this.b = new czzs(this, dacuVar);
        this.d = LayoutInflater.from(context);
        this.f = Math.round(context.getResources().getDisplayMetrics().density * 24.0f);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SearchFilterDataItem getItem(int i) {
        return (SearchFilterDataItem) this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return getItem(i).hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View viewInflate;
        czzr czzrVar;
        if (view == null) {
            czzrVar = new czzr();
            viewInflate = this.d.inflate(R.layout.zero_state_search_box_dropdown_item_gm3, viewGroup, false);
            czzrVar.b = (TextView) viewInflate.findViewById(R.id.zero_state_search_box_dropdown_item);
            viewInflate.setTag(czzrVar);
            if (viewInflate instanceof TextView) {
                TextView textView = (TextView) viewInflate;
                textView.setSingleLine();
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else {
            Object tag = view.getTag();
            tag.getClass();
            czzr czzrVar2 = (czzr) tag;
            viewInflate = view;
            czzrVar = czzrVar2;
        }
        SearchFilterDataItem item = getItem(i);
        czzrVar.a = item;
        czzrVar.b.setText(czzrVar.a.f());
        if (item instanceof dabw) {
            czzrVar.b.setCompoundDrawablesRelativeWithIntrinsicBounds(((dabw) item).c(), 0, 0, 0);
            return viewInflate;
        }
        if (item instanceof ContactFilterDataItem) {
            Uri uri = ((ContactFilterDataItem) item).a;
            cqaz.l(uri);
            rbr rbrVarQ = raw.e(czzrVar.b).f(uri).q(this.e);
            int i2 = this.f;
            rbrVarQ.w(new czzq(i2, i2, czzrVar, item));
        }
        return viewInflate;
    }
}
