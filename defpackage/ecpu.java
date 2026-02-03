package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecpu implements Parcelable {
    public static final Parcelable.Creator<ecpu> CREATOR = new ecpt();
    public final String a;
    public final String b;
    private final String c;
    private final int d;

    public ecpu(String str, String str2, String str3, int i) {
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ecpu)) {
            return false;
        }
        ecpu ecpuVar = (ecpu) obj;
        return Objects.equals(this.a, ecpuVar.a) && Objects.equals(this.c, ecpuVar.c) && Objects.equals(this.b, ecpuVar.b) && this.d == ecpuVar.d;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.c, this.b, Integer.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        int i2 = this.d;
        parcel.writeString(i2 != 1 ? i2 != 2 ? i2 != 3 ? "CONFIDENTIAL" : "STANDARD" : "DISABLED" : "NOT_SET");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ecpu(android.os.Parcel r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = r5.readString()
            r4.a = r0
            java.lang.String r0 = r5.readString()
            r4.c = r0
            java.lang.String r0 = r5.readString()
            r4.b = r0
            java.lang.String r5 = r5.readString()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1446966090: goto L42;
                case 364290440: goto L38;
                case 1053567612: goto L2e;
                case 2095255229: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r0 = "STANDARD"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L4c
            r5 = r2
            goto L4d
        L2e:
            java.lang.String r0 = "DISABLED"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L4c
            r5 = r3
            goto L4d
        L38:
            java.lang.String r0 = "CONFIDENTIAL"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L4c
            r5 = r1
            goto L4d
        L42:
            java.lang.String r0 = "NOT_SET"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L4c
            r5 = 0
            goto L4d
        L4c:
            r5 = -1
        L4d:
            if (r5 == 0) goto L5f
            if (r5 == r3) goto L5d
            if (r5 == r2) goto L60
            if (r5 != r1) goto L57
            r1 = 4
            goto L60
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L5d:
            r1 = r2
            goto L60
        L5f:
            r1 = r3
        L60:
            r4.d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecpu.<init>(android.os.Parcel):void");
    }
}
