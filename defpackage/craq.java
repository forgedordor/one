package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class craq implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
        /*
            r9 = this;
            crar r0 = new crar
            java.lang.String r1 = r10.readString()
            int r2 = r1.hashCode()
            r3 = 6
            r4 = 1
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 5
            switch(r2) {
                case -1454870105: goto L50;
                case -339402136: goto L46;
                case -134073210: goto L3c;
                case 2539132: goto L32;
                case 2551625: goto L28;
                case 264024178: goto L1e;
                case 1766289450: goto L14;
                default: goto L13;
            }
        L13:
            goto L5a
        L14:
            java.lang.String r2 = "SPAM_DELIVERY"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r3
            goto L5b
        L1e:
            java.lang.String r2 = "REMINDER"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r4
            goto L5b
        L28:
            java.lang.String r2 = "SPAM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = 0
            goto L5b
        L32:
            java.lang.String r2 = "SCAM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r5
            goto L5b
        L3c:
            java.lang.String r2 = "PENPAL_SPAM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r6
            goto L5b
        L46:
            java.lang.String r2 = "BUSINESS_MESSAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r7
            goto L5b
        L50:
            java.lang.String r2 = "SPAM_JOB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            r1 = r8
            goto L5b
        L5a:
            r1 = -1
        L5b:
            switch(r1) {
                case 0: goto L6e;
                case 1: goto L6c;
                case 2: goto L6a;
                case 3: goto L68;
                case 4: goto L66;
                case 5: goto L6f;
                case 6: goto L64;
                default: goto L5e;
            }
        L5e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L64:
            r3 = 7
            goto L6f
        L66:
            r3 = r8
            goto L6f
        L68:
            r3 = r5
            goto L6f
        L6a:
            r3 = r6
            goto L6f
        L6c:
            r3 = r7
            goto L6f
        L6e:
            r3 = r4
        L6f:
            float r1 = r10.readFloat()
            java.lang.String r10 = r10.readString()
            r0.<init>(r3, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.craq.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new crar[i];
    }
}
