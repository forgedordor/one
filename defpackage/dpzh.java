package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpzh implements dpzi {
    public static final Parcelable.Creator<dpzh> CREATOR = new dpzg();
    public final List a;
    public final dpxe b;
    public final String c;
    private final dote d;

    public dpzh(List list, dpxe dpxeVar, String str) {
        list.getClass();
        dpxeVar.getClass();
        this.a = list;
        this.b = dpxeVar;
        this.c = str;
        this.d = null;
    }

    public static /* synthetic */ dpzh a(dpzh dpzhVar, List list, dpxe dpxeVar, int i) {
        if ((i & 1) != 0) {
            list = dpzhVar.a;
        }
        if ((i & 2) != 0) {
            dpxeVar = dpzhVar.b;
        }
        String str = dpzhVar.c;
        dote doteVar = dpzhVar.d;
        list.getClass();
        dpxeVar.getClass();
        return new dpzh(list, dpxeVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpzh)) {
            return false;
        }
        dpzh dpzhVar = (dpzh) obj;
        if (!fdbq.f(this.a, dpzhVar.a) || this.b != dpzhVar.b || !fdbq.f(this.c, dpzhVar.c)) {
            return false;
        }
        dote doteVar = dpzhVar.d;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        return "ScreenWithSearch(screens=" + this.a + ", currentCategory=" + this.b + ", currentSearchTerm=" + this.c + ", configuration=null)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((dpyz) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }

    public /* synthetic */ dpzh(List list, dpxe dpxeVar, String str, int i) {
        this(list, (i & 2) != 0 ? ((dpyz) fcva.N(list)).a : dpxeVar, (i & 4) != 0 ? null : str);
    }
}
