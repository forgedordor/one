package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoez implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        axcm axcmVarA;
        parcel.getClass();
        evwl evwlVar = (evwl) parcel.readParcelable(aohs.class.getClassLoader());
        if (evwlVar == null) {
            throw new IllegalStateException("Self identity id parcelable does not exist.");
        }
        aohs aohsVar = (aohs) evwlVar.a(aoht.a((aohp) aohs.a.createBuilder()).a(), evrr.a());
        String str = aohsVar.c;
        str.getClass();
        if ((aohsVar.b & 2) != 0) {
            aohr aohrVar = aohsVar.d;
            if (aohrVar == null) {
                aohrVar = aohr.a;
            }
            axcmVarA = axcm.a(aohrVar.b);
        } else {
            axcmVarA = null;
        }
        return new SelfIdentityIdImpl(str, Optional.ofNullable(axcmVarA));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SelfIdentityIdImpl[i];
    }
}
