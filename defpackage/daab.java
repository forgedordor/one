package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daab implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Parcelable parcelable = (SearchFilterDataItem) obj;
        parcelable.getClass();
        byas byasVarGn = ((daak) parcelable).gn();
        Parcelable parcelable2 = (SearchFilterDataItem) obj2;
        parcelable2.getClass();
        return fcxl.a(byasVarGn, ((daak) parcelable2).gn());
    }
}
