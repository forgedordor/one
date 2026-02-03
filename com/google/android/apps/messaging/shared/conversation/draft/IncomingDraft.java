package com.google.android.apps.messaging.shared.conversation.draft;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.avnw;
import defpackage.avnx;
import defpackage.avny;
import defpackage.avoa;
import defpackage.cqcy;
import defpackage.fcsv;
import defpackage.fcvo;
import defpackage.fdbk;
import defpackage.fdbq;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class IncomingDraft implements Parcelable {
    public static final Parcelable.Creator<IncomingDraft> CREATOR = new avoa();
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;
    public final Instant e;
    public final EditingData f;
    public final boolean g;

    /* compiled from: PG */
    public static final class Attachment implements Parcelable {
        public static final Parcelable.Creator<Attachment> CREATOR = new avny();
        public final String a;
        public final Uri b;
        public final Long c;

        public Attachment(String str, Uri uri, Long l) {
            str.getClass();
            uri.getClass();
            this.a = str;
            this.b = uri;
            this.c = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            return fdbq.f(this.a, attachment.a) && fdbq.f(this.b, attachment.b) && fdbq.f(this.c, attachment.c);
        }

        public final int hashCode() {
            int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
            Long l = this.c;
            return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            return "Attachment(type=" + this.a + ", uri=" + cqcy.d(this.b) + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeParcelable(this.b, i);
            Long l = this.c;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }
    }

    @fcsv
    public IncomingDraft() {
        this(null, null, null, false, null, null, false, 127, null);
    }

    public static /* synthetic */ IncomingDraft a(IncomingDraft incomingDraft, List list, Instant instant, EditingData editingData, int i) {
        String str = (i & 1) != 0 ? incomingDraft.a : null;
        if ((i & 2) != 0) {
            list = incomingDraft.b;
        }
        List list2 = list;
        String str2 = (i & 4) != 0 ? incomingDraft.c : null;
        boolean z = (i & 8) != 0 ? incomingDraft.d : false;
        if ((i & 16) != 0) {
            instant = incomingDraft.e;
        }
        Instant instant2 = instant;
        if ((i & 32) != 0) {
            editingData = incomingDraft.f;
        }
        boolean z2 = incomingDraft.g;
        list2.getClass();
        return new IncomingDraft(str, list2, str2, z, instant2, editingData, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncomingDraft)) {
            return false;
        }
        IncomingDraft incomingDraft = (IncomingDraft) obj;
        return fdbq.f(this.a, incomingDraft.a) && fdbq.f(this.b, incomingDraft.b) && fdbq.f(this.c, incomingDraft.c) && this.d == incomingDraft.d && fdbq.f(this.e, incomingDraft.e) && fdbq.f(this.f, incomingDraft.f) && this.g == incomingDraft.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        String str2 = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + avnx.a(this.d)) * 31;
        Instant instant = this.e;
        int iHashCode3 = (iHashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        EditingData editingData = this.f;
        return ((iHashCode3 + (editingData != null ? editingData.hashCode() : 0)) * 31) + avnx.a(this.g);
    }

    public final String toString() {
        String str = this.a;
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        List list = this.b;
        String str2 = this.c;
        CharSequence charSequenceC2 = str2 != null ? cqcy.c(str2) : null;
        boolean z = this.d;
        Instant instant = this.e;
        EditingData editingData = this.f;
        return "IncomingDraft(text=" + ((Object) charSequenceC) + ", attachments=" + list + ", subject=" + ((Object) charSequenceC2) + ", isUrgent=" + z + ", scheduledTime=" + instant + ", editingData=" + (editingData != null ? editingData.toString() : null) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        List list = this.b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Attachment) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeSerializable(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }

    @fcsv
    public IncomingDraft(String str, List<Attachment> list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
        this.e = instant;
        this.f = editingData;
        this.g = z2;
        if (str != null && str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str2 != null && str2.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (str == null && str2 == null && !z && list.isEmpty()) {
            throw new avnw();
        }
    }

    public /* synthetic */ IncomingDraft(String str, List list, String str2, boolean z, Instant instant, EditingData editingData, boolean z2, int i, fdbk fdbkVar) {
        this(1 == (i & 1) ? null : str, (i & 2) != 0 ? fcvo.a : list, (i & 4) != 0 ? null : str2, ((i & 8) == 0) & z, (i & 16) != 0 ? null : instant, (i & 32) != 0 ? null : editingData, ((i & 64) == 0) & z2);
    }
}
