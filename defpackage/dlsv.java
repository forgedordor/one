package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsv implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r8) {
        /*
            r7 = this;
            r8.getClass()
            dlsx r0 = new dlsx
            java.lang.String r1 = r8.readString()
            java.lang.String r8 = r8.readString()
            int r2 = r8.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -2130433380: goto L41;
                case -975978826: goto L37;
                case 433141802: goto L2d;
                case 1186196854: goto L23;
                case 1564508962: goto L19;
                default: goto L18;
            }
        L18:
            goto L4b
        L19:
            java.lang.String r2 = "DRAG_AND_DROP"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L4b
            r8 = r3
            goto L4c
        L23:
            java.lang.String r2 = "CLIPBOARD"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L4b
            r8 = r4
            goto L4c
        L2d:
            java.lang.String r2 = "UNKNOWN"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L4b
            r8 = 0
            goto L4c
        L37:
            java.lang.String r2 = "INPUT_METHOD_EDITOR"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L4b
            r8 = r5
            goto L4c
        L41:
            java.lang.String r2 = "INTENT"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L4b
            r8 = r6
            goto L4c
        L4b:
            r8 = -1
        L4c:
            if (r8 == 0) goto L62
            if (r8 == r6) goto L60
            if (r8 == r5) goto L5e
            if (r8 == r4) goto L63
            if (r8 != r3) goto L58
            r3 = 5
            goto L63
        L58:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        L5e:
            r3 = r4
            goto L63
        L60:
            r3 = r5
            goto L63
        L62:
            r3 = r6
        L63:
            r0.<init>(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlsv.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dlsx[i];
    }
}
