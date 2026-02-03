package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msd {
    public final long a;
    public final float b;
    public final long c;

    public msd(msc mscVar) {
        this.a = mscVar.a;
        this.b = mscVar.b;
        this.c = mscVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msd)) {
            return false;
        }
        msd msdVar = (msd) obj;
        return this.a == msdVar.a && this.b == msdVar.b && this.c == msdVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
