package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbv implements Parcelable.Creator {
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            r14.getClass()
            java.lang.Class<dmbu> r0 = defpackage.dmbu.class
            dmbx r1 = new dmbx
            java.lang.String r2 = r14.readString()
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r2)
            r2 = r0
            dmbu r2 = (defpackage.dmbu) r2
            java.lang.String r0 = r14.readString()
            int r3 = r0.hashCode()
            r4 = 2030823(0x1efce7, float:2.845789E-39)
            java.lang.String r5 = "UNKNOWN"
            r6 = -1
            r7 = 433141802(0x19d1382a, float:2.1632778E-23)
            r8 = 0
            r9 = 2
            r10 = 1
            if (r3 == r4) goto L42
            r4 = 67167753(0x400e609, float:1.5151955E-36)
            if (r3 == r4) goto L38
            if (r3 == r7) goto L30
            goto L4c
        L30:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L4c
            r0 = r8
            goto L4d
        L38:
            java.lang.String r3 = "FRONT"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4c
            r0 = r9
            goto L4d
        L42:
            java.lang.String r3 = "BACK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4c
            r0 = r10
            goto L4d
        L4c:
            r0 = r6
        L4d:
            r3 = 3
            if (r0 == 0) goto L5f
            if (r0 == r10) goto L5c
            if (r0 != r9) goto L56
            r0 = r3
            goto L61
        L56:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L5c:
            r0 = r3
            r3 = r9
            goto L61
        L5f:
            r0 = r3
            r3 = r10
        L61:
            java.lang.String r4 = r14.readString()
            int r11 = r4.hashCode()
            r12 = -77725029(0xfffffffffb5e029b, float:-1.15274275E36)
            if (r11 == r12) goto L88
            if (r11 == r7) goto L80
            r5 = 1511893915(0x5a1dab9b, float:1.10950634E16)
            if (r11 == r5) goto L76
            goto L91
        L76:
            java.lang.String r5 = "PORTRAIT"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L91
            r6 = r10
            goto L91
        L80:
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L91
            r6 = r8
            goto L91
        L88:
            java.lang.String r5 = "LANDSCAPE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L91
            r6 = r9
        L91:
            if (r6 == 0) goto La1
            if (r6 == r10) goto L9f
            if (r6 != r9) goto L99
            r4 = r0
            goto La2
        L99:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        L9f:
            r4 = r9
            goto La2
        La1:
            r4 = r10
        La2:
            int r0 = r14.readInt()
            int r5 = r14.readInt()
            if (r5 != 0) goto Lae
            r5 = 0
            goto Lb6
        Lae:
            int r5 = r14.readInt()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        Lb6:
            r6 = r5
            if (r0 == 0) goto Lbb
            r5 = r10
            goto Lbc
        Lbb:
            r5 = r8
        Lbc:
            java.lang.String r7 = r14.readString()
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmbv.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dmbx[i];
    }
}
