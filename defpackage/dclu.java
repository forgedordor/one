package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dclu extends RuntimeException {
    public dclu(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
