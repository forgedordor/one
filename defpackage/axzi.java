package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RebuildShortcutsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RebuildShortcutsAction.a) cqtf.a(RebuildShortcutsAction.a.class)).ib().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RebuildShortcutsAction[i];
    }
}
