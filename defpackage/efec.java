package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupInformation;
import com.google.android.rcs.client.messaging.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efec implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efbz efbzVar = new efbz();
        efbzVar.a = (String) efmp.h(parcel, 1).get();
        efbzVar.c((String) efmp.h(parcel, 2).get());
        efbzVar.b((String) efmp.h(parcel, 3).get());
        ?? r1 = efmp.g(parcel, 4, GroupMember.CREATOR).get();
        if (efbzVar.b != null) {
            throw new IllegalStateException("Cannot set groupMembers after calling groupMembersBuilder()");
        }
        efbzVar.c = ekgb.n(r1);
        efbzVar.d = efmp.f(parcel, 5, eflq.a);
        efbzVar.e = efmp.f(parcel, 6, efmw.a);
        ejwl.a(efmp.j(parcel).isPresent());
        return efbzVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupInformation[i];
    }
}
