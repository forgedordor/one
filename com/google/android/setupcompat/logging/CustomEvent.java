package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import defpackage.efrs;
import defpackage.efrt;
import defpackage.efsc;
import defpackage.efsd;
import defpackage.eftf;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator<CustomEvent> CREATOR = new efsd();
    private final long a;
    private final MetricKey b;
    private final PersistableBundle c;
    private final PersistableBundle d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        efrt.a(j >= 0, "Timestamp cannot be negative.");
        efrt.c(metricKey, "MetricKey cannot be null.");
        efrt.c(persistableBundle, "Bundle cannot be null.");
        efrt.a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        efrt.c(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            efsc.a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.length() > 50) {
                    persistableBundle.putString(str, c(str2));
                }
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public static Bundle a(CustomEvent customEvent) {
        Bundle bundle = new Bundle();
        bundle.putInt("CustomEvent_version", 1);
        bundle.putLong("CustomEvent_timestamp", customEvent.a);
        bundle.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent.b));
        bundle.putBundle("CustomEvent_bundleValues", efrs.a(new PersistableBundle(customEvent.c)));
        bundle.putBundle("CustomEvent_pii_bundleValues", efrs.a(customEvent.d));
        return bundle;
    }

    public static CustomEvent b(MetricKey metricKey, PersistableBundle persistableBundle) {
        efrt.a(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        efrt.a(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        efrs.d(persistableBundle);
        efrs.d(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    public static String c(String str) {
        return str.length() <= 50 ? str : "truncated.".concat(String.valueOf(str.substring(str.length() - 40)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomEvent) {
            CustomEvent customEvent = (CustomEvent) obj;
            if (this.a == customEvent.a && eftf.a(this.b, customEvent.b) && efrs.c(this.c, customEvent.c) && efrs.c(this.d, customEvent.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
