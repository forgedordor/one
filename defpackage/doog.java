package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doog implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
        /*
            r7 = this;
            r8.getClass()
            java.lang.String r0 = r8.readString()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1271056834: goto L3c;
                case 478131041: goto L32;
                case 573789423: goto L28;
                case 660924809: goto L1e;
                case 1554701229: goto L14;
                default: goto L13;
            }
        L13:
            goto L46
        L14:
            java.lang.String r1 = "ALBUM_CREATION_FAILED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r5
            goto L47
        L1e:
            java.lang.String r1 = "SOME_MEDIA_FAILED_TO_UPLOAD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r6
            goto L47
        L28:
            java.lang.String r1 = "UNRECOGNIZED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r3
            goto L47
        L32:
            java.lang.String r1 = "REQUEST_CANCELLED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r4
            goto L47
        L3c:
            java.lang.String r1 = "UNKNOWN_REQUEST_FAILURE_REASON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            r0 = r2
            goto L47
        L46:
            r0 = -1
        L47:
            if (r0 == 0) goto L5d
            if (r0 == r6) goto L5b
            if (r0 == r5) goto L5e
            if (r0 == r4) goto L59
            if (r0 != r3) goto L53
            r3 = r6
            goto L5e
        L53:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L59:
            r3 = 5
            goto L5e
        L5b:
            r3 = r4
            goto L5e
        L5d:
            r3 = r5
        L5e:
            int r0 = r8.readInt()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
        L67:
            if (r2 == r0) goto L7b
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            eaid r5 = defpackage.eaid.c(r5)
            r1.put(r4, r5)
            int r2 = r2 + 1
            goto L67
        L7b:
            dooh r8 = new dooh
            r8.<init>(r3, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doog.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dooh[i];
    }
}
