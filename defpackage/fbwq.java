package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbwq implements Closeable {
    private Parcel a;

    public fbwq(Parcel parcel) {
        this.a = parcel;
    }

    public static fbwq c() {
        return new fbwq(Parcel.obtain());
    }

    public final Parcel a() {
        ejwl.m(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel parcelA = a();
        this.a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
