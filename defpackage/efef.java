package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efef implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efeg efegVarE = GroupMember.e();
        Parcelable.Creator creator = efmr.a;
        efca efcaVar = (efca) efegVarE;
        efcaVar.a = (effi) efmp.f(parcel, 1, creator).get();
        efegVarE.b((String) efmp.h(parcel, 2).get());
        efcaVar.b = efmp.f(parcel, 3, creator);
        efegVarE.c(((Integer) efmp.d(parcel, 4).get()).intValue() == 1);
        ejwl.a(efmp.j(parcel).isPresent());
        return efegVarE.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupMember[i];
    }
}
