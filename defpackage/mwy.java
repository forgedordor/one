package defpackage;

import android.os.Build;
import j$.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwy {
    public static final mwy a;
    public final int b;
    public final int c;
    public final ekhx d;

    static {
        mwy mwyVar;
        if (Build.VERSION.SDK_INT >= 33) {
            ekhv ekhvVar = new ekhv();
            for (int i = 1; i <= 10; i++) {
                ekhvVar.c(Integer.valueOf(mgb.h(i)));
            }
            mwyVar = new mwy(2, ekhvVar.g());
        } else {
            mwyVar = new mwy(2, 10);
        }
        a = mwyVar;
    }

    public mwy(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwy)) {
            return false;
        }
        mwy mwyVar = (mwy) obj;
        return this.b == mwyVar.b && this.c == mwyVar.c && Objects.equals(this.d, mwyVar.d);
    }

    public final int hashCode() {
        ekhx ekhxVar = this.d;
        return (((this.b * 31) + this.c) * 31) + (ekhxVar == null ? 0 : ekhxVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + String.valueOf(this.d) + "]";
    }

    public mwy(int i, Set set) {
        this.b = i;
        ekhx ekhxVarO = ekhx.o(set);
        this.d = ekhxVarO;
        ekqg ekqgVarListIterator = ekhxVarO.listIterator();
        int iMax = 0;
        while (ekqgVarListIterator.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) ekqgVarListIterator.next()).intValue()));
        }
        this.c = iMax;
    }
}
