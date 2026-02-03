package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dcjk;
import defpackage.dcjl;
import defpackage.dcjm;
import defpackage.dclh;
import defpackage.dclw;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new dcjm();
    public static final dcjl a = new dcjk(new String[0]);
    final int b;
    public final String[] c;
    public Bundle d;
    public final CursorWindow[] e;
    public final int f;
    public final Bundle g;
    int[] h;
    public int i;
    boolean j;
    private final boolean k;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.j = false;
        this.k = true;
        this.b = i;
        this.c = strArr;
        this.e = cursorWindowArr;
        this.f = i2;
        this.g = bundle;
    }

    public final int a(String str, int i, int i2) {
        d(str, i);
        return this.e[i2].getInt(i, this.d.getInt(str));
    }

    public final int b(int i) {
        int length;
        int i2 = 0;
        dclh.h(i >= 0 && i < this.i);
        while (true) {
            int[] iArr = this.h;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final String c(String str, int i, int i2) {
        d(str, i);
        return this.e[i2].getString(i, this.d.getInt(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.e;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void d(String str, int i) {
        Bundle bundle = this.d;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (f()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.i) {
            throw new CursorIndexOutOfBoundsException(i, this.i);
        }
    }

    public final void e() {
        this.d = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.c;
            if (i >= strArr.length) {
                break;
            }
            this.d.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.e;
        this.h = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i2 = 0; i2 < cursorWindowArr.length; i2++) {
            this.h[i2] = numRows;
            numRows += cursorWindowArr[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
        }
        this.i = numRows;
    }

    public final boolean f() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.k && this.e.length > 0 && !f()) {
                close();
                Log.e("DataBuffer", a.b(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    public final byte[] g(String str, int i, int i2) {
        d(str, i);
        return this.e[i2].getBlob(i, this.d.getInt(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.c;
        int iA = dclw.a(parcel);
        dclw.C(parcel, 1, strArr);
        dclw.E(parcel, 2, this.e, i);
        dclw.i(parcel, 3, this.f);
        dclw.p(parcel, 4, this.g);
        dclw.i(parcel, 1000, this.b);
        dclw.c(parcel, iA);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(dcjl dcjlVar, int i) {
        String[] strArr = dcjlVar.a;
        this.j = false;
        this.k = true;
        this.b = 1;
        this.c = strArr;
        this.e = new CursorWindow[0];
        this.f = i;
        this.g = null;
        e();
    }
}
