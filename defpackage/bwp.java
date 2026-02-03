package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwp extends bxe {
    public final long a;
    public final ParcelFileDescriptor b;

    public bwp(long j, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = j;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.bxj
    public final long a() {
        return this.a;
    }

    @Override // defpackage.bxe
    public final ParcelFileDescriptor b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxe) {
            bxe bxeVar = (bxe) obj;
            bxeVar.c();
            if (this.a == bxeVar.a()) {
                bxeVar.d();
                if (this.b.equals(bxeVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ (-721379959)) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        return "FileDescriptorOutputOptionsInternal{fileSizeLimit=0, durationLimitMillis=" + this.a + ", location=null, parcelFileDescriptor=" + this.b + "}";
    }

    @Override // defpackage.bxj
    public final void c() {
    }

    @Override // defpackage.bxj
    public final void d() {
    }
}
