package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        czmj czmjVarE = MediaViewerButton.e();
        czmjVarE.e(parcel.readInt());
        czmjVarE.b(parcel.readInt());
        czmjVarE.d(parcel.readInt());
        czmjVarE.c((BaseMediaViewerEvent) parcel.readParcelable(getClass().getClassLoader()));
        return czmjVarE.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaViewerButton[i];
    }
}
