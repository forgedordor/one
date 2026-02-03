package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclh;
import defpackage.dclw;
import defpackage.ddnf;
import defpackage.ddng;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new ddng();
    public static final Comparator a = new ddnf();
    public final List b;
    public final String c;
    public final List d;
    public String e;

    public ActivityTransitionRequest(List list, String str, List list2, String str2) {
        dclh.n(list, "transitions can't be null");
        dclh.b(!list.isEmpty(), "transitions can't be empty.");
        dclh.m(list);
        TreeSet treeSet = new TreeSet(a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            dclh.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", activityTransition));
        }
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = str;
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (dclc.a(this.b, activityTransitionRequest.b) && dclc.a(this.c, activityTransitionRequest.c) && dclc.a(this.e, activityTransitionRequest.e) && dclc.a(this.d, activityTransitionRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.d;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        List list = this.d;
        return "ActivityTransitionRequest [mTransitions=" + String.valueOf(this.b) + ", mTag='" + this.c + "', mClients=" + String.valueOf(list) + ", mAttributionTag=" + this.e + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dclh.m(parcel);
        List list = this.b;
        int iA = dclw.a(parcel);
        dclw.n(parcel, 1, list, false);
        dclw.m(parcel, 2, this.c, false);
        dclw.n(parcel, 3, this.d, false);
        dclw.m(parcel, 4, this.e, false);
        dclw.c(parcel, iA);
    }
}
