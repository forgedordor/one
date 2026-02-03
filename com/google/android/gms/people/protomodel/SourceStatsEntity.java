package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclc;
import defpackage.dclw;
import defpackage.ddyb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator<SourceStatsEntity> CREATOR = new ddyb();
    public final String a;
    public final Integer b;
    public final Integer c;

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final String c() {
        return this.a;
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStats sourceStats = (SourceStats) obj;
        return dclc.a(c(), sourceStats.c()) && dclc.a(a(), sourceStats.a()) && dclc.a(b(), sourceStats.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = dclw.a(parcel);
        dclw.m(parcel, 2, str, false);
        dclw.x(parcel, 3, this.b);
        dclw.x(parcel, 4, this.c);
        dclw.c(parcel, iA);
    }
}
