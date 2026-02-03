package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.search.homeview.CategoryGroupItemView;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzf implements ehay {
    final /* synthetic */ czzj a;

    public czzf(czzj czzjVar) {
        this.a = czzjVar;
    }

    @Override // defpackage.ehay
    public final void a(Throwable th) {
        ehax.a(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ehay
    public final /* bridge */ /* synthetic */ void b(Object obj) throws Resources.NotFoundException {
        ZeroStateSearchHomeView zeroStateSearchHomeView = this.a.C;
        ekgb<SearchFilterDataItem> ekgbVarN = ekgb.n((List) obj);
        final daap daapVarH = zeroStateSearchHomeView.c.H();
        ekgbVarN.getClass();
        fcsu fcsuVar = daapVarH.c;
        boolean zA = ((asgw) fcsuVar.b()).a();
        ZeroStateContentGridLayout zeroStateContentGridLayout = daapVarH.a;
        int dimensionPixelOffset = zeroStateContentGridLayout.getContext().getResources().getDimensionPixelOffset(zA ? R.dimen.grid_layout_items_margin_top_and_bottom_coolranch : R.dimen.grid_layout_items_margin_top_and_bottom);
        boolean z = true;
        int dimensionPixelOffset2 = zeroStateContentGridLayout.getContext().getResources().getDimensionPixelOffset(true != zA ? R.dimen.grid_layout_items_margin_start_and_end : R.dimen.grid_layout_items_margin_start_and_end_coolranch);
        boolean z2 = false;
        int i = 0;
        for (final SearchFilterDataItem searchFilterDataItem : ekgbVarN) {
            int i2 = i + 1;
            searchFilterDataItem.getClass();
            View viewInflate = daapVarH.d.inflate(z != ((asgw) fcsuVar.b()).a() ? R.layout.zero_state_search_category_group_item_view : R.layout.zero_state_search_category_group_item_view_coolranch, zeroStateContentGridLayout, z2);
            viewInflate.getClass();
            CategoryGroupItemView categoryGroupItemView = (CategoryGroupItemView) viewInflate;
            daaf daafVarH = categoryGroupItemView.H();
            ImageView imageView = daafVarH.a;
            int dimensionPixelSize = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.zero_state_search_content_group_item_icon_padding);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = dimensionPixelSize + imageView.getPaddingTop() + imageView.getPaddingBottom();
            }
            TextView textView = daafVarH.b;
            int dimensionPixelSize2 = textView.getContext().getResources().getDimensionPixelSize(R.dimen.zero_state_search_content_group_item_label_side_padding);
            textView.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            imageView.setImageResource(((dabw) searchFilterDataItem).c());
            String strE = searchFilterDataItem.e();
            textView.setText(strE);
            textView.setContentDescription(strE);
            categoryGroupItemView.setOnClickListener(new View.OnClickListener() { // from class: daan
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    daap daapVar = daapVarH;
                    dacp dacpVar = daapVar.e;
                    SearchFilterDataItem searchFilterDataItem2 = searchFilterDataItem;
                    if (dacpVar != null) {
                        dacpVar.h(searchFilterDataItem2);
                    }
                    ((dabl) daapVar.b.b()).f(3, searchFilterDataItem2.b());
                }
            });
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(categoryGroupItemView.getLayoutParams());
            layoutParams2.width = 0;
            layoutParams2.columnSpec = GridLayout.spec(i % daapVarH.a(), 1.0f);
            layoutParams2.rowSpec = GridLayout.spec(i / daapVarH.a(), 1.0f);
            layoutParams2.setMargins(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
            zeroStateContentGridLayout.addView(categoryGroupItemView, layoutParams2);
            i = i2;
            z2 = false;
            z = true;
        }
        zeroStateSearchHomeView.c.setVisibility(0);
    }
}
