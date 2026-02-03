package com.google.android.apps.messaging.shared.conversation.draft;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.avns;
import defpackage.avnv;
import defpackage.avob;
import defpackage.fdbk;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ComposeRowState implements Parcelable {
    public static final Parcelable.Creator<ComposeRowState> CREATOR = new avns();
    public final IncomingDraft a;
    public final avob b;

    public /* synthetic */ ComposeRowState(IncomingDraft incomingDraft, avob avobVar, fdbk fdbkVar) {
        this.a = incomingDraft;
        this.b = avobVar;
        if (incomingDraft == null && avobVar == null) {
            throw new avnv();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeRowState)) {
            return false;
        }
        ComposeRowState composeRowState = (ComposeRowState) obj;
        return fdbq.f(this.a, composeRowState.a) && this.b == composeRowState.b;
    }

    public final int hashCode() {
        IncomingDraft incomingDraft = this.a;
        int iHashCode = incomingDraft == null ? 0 : incomingDraft.hashCode();
        avob avobVar = this.b;
        return (iHashCode * 31) + (avobVar != null ? avobVar.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeRowState(incomingDraft=" + this.a + ", input=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        avob avobVar = this.b;
        if (avobVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(avobVar.name());
        }
    }
}
