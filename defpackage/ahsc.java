package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        evuh evuhVarA = ProtoParsers.a(parcel, ahsa.a, evrr.a());
        evuhVarA.getClass();
        return new RepliedToDataAdapter((ahsa) evuhVarA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RepliedToDataAdapter[i];
    }
}
