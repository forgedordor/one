package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dbhz;
import defpackage.dclc;
import defpackage.dclw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CorpusStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusStatus> CREATOR = new dbhz();
    final boolean a;
    final long b;
    final long c;
    final long d;
    final Bundle e;
    final String f;
    final String g;

    CorpusStatus() {
        this(false, 0L, 0L, 0L, null, null, null);
    }

    public final Map a() {
        HashMap map = new HashMap();
        Bundle bundle = this.e;
        for (String str : bundle.keySet()) {
            int i = bundle.getInt(str, -1);
            if (i != -1) {
                map.put(str, Integer.valueOf(i));
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusStatus) {
            CorpusStatus corpusStatus = (CorpusStatus) obj;
            if (dclc.a(Boolean.valueOf(this.a), Boolean.valueOf(corpusStatus.a)) && dclc.a(Long.valueOf(this.b), Long.valueOf(corpusStatus.b)) && dclc.a(Long.valueOf(this.c), Long.valueOf(corpusStatus.c)) && dclc.a(Long.valueOf(this.d), Long.valueOf(corpusStatus.d)) && dclc.a(a(), corpusStatus.a()) && dclc.a(this.g, corpusStatus.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), a(), this.g});
    }

    public final String toString() {
        return "CorpusStatus{found=" + this.a + ", contentIncarnation=" + this.g + ", lastIndexedSeqno=" + this.b + ", lastCommittedSeqno=" + this.c + ", committedNumDocuments=" + this.d + ", counters=" + this.e.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.d(parcel, 1, this.a);
        dclw.j(parcel, 2, this.b);
        dclw.j(parcel, 3, this.c);
        dclw.j(parcel, 4, this.d);
        dclw.p(parcel, 5, this.e);
        dclw.m(parcel, 6, this.f, false);
        dclw.m(parcel, 7, this.g, false);
        dclw.c(parcel, iA);
    }

    public CorpusStatus(boolean z, long j, long j2, long j3, Bundle bundle, String str, String str2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = bundle == null ? new Bundle() : bundle;
        this.f = str;
        this.g = str2;
    }
}
