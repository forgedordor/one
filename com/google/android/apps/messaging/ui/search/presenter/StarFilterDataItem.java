package com.google.android.apps.messaging.ui.search.presenter;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import defpackage.byas;
import defpackage.daak;
import defpackage.dabw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StarFilterDataItem extends SearchFilterDataItem implements dabw, daak {
    private final Resources a;

    public StarFilterDataItem(SearchQuery.SearchFilter searchFilter, Resources resources, boolean z) {
        super(searchFilter, "", "", z);
        this.a = resources;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final /* bridge */ /* synthetic */ SearchQuery.SearchFilter a() {
        return (SearchQuery.StarSearchFilter) this.b;
    }

    @Override // defpackage.dabr
    public final int b() {
        return 10;
    }

    @Override // defpackage.dabw
    public final int c() {
        return R.drawable.quantum_gm_ic_star_outline_vd_theme_24;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String e() {
        return this.a.getString(R.string.zero_state_search_starred);
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String f() {
        return this.a.getString(R.string.zero_state_search_starred);
    }

    @Override // defpackage.daak
    public final byas gn() {
        return byas.e;
    }

    @Override // com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem
    public final String toString() {
        return e();
    }
}
