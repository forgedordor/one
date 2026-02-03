package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqr implements Parcelable {
    public static final Parcelable.Creator<ecqr> CREATOR = new ecqq();
    private long a;
    private long b;

    public ecqr() {
        this.a = -1L;
        this.b = -1L;
    }

    public final void a() {
        if (!c()) {
            Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
        } else if (this.b >= 0) {
            long j = ecse.a;
        } else {
            this.b = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (c()) {
            return;
        }
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public ecqr(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }
}
