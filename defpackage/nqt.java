package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class nqt implements mbs {
    public final String a;
    public final String b;

    public nqt(String str, String str2) {
        this.a = ejuf.d(str);
        this.b = str2;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // defpackage.mbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.mbq r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1935137620: goto L67;
                case -215998278: goto L5d;
                case -113312716: goto L53;
                case 62359119: goto L49;
                case 67703139: goto L3e;
                case 79833656: goto L34;
                case 428414940: goto L29;
                case 993300766: goto L1f;
                case 1746739798: goto L15;
                case 1939198791: goto Lb;
                default: goto L9;
            }
        L9:
            goto L71
        Lb:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 1
            goto L72
        L15:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 3
            goto L72
        L1f:
            java.lang.String r1 = "DISCNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 6
            goto L72
        L29:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 9
            goto L72
        L34:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 0
            goto L72
        L3e:
            java.lang.String r1 = "GENRE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 8
            goto L72
        L49:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 2
            goto L72
        L53:
            java.lang.String r1 = "TRACKNUMBER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 4
            goto L72
        L5d:
            java.lang.String r1 = "TOTALDISCS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 7
            goto L72
        L67:
            java.lang.String r1 = "TOTALTRACKS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            r0 = 5
            goto L72
        L71:
            r0 = -1
        L72:
            switch(r0) {
                case 0: goto Lbb;
                case 1: goto Lb6;
                case 2: goto Lb1;
                case 3: goto Lac;
                case 4: goto La1;
                case 5: goto L96;
                case 6: goto L8b;
                case 7: goto L80;
                case 8: goto L7b;
                case 9: goto L76;
                default: goto L75;
            }
        L75:
            goto Lbf
        L76:
            java.lang.String r0 = r2.b
            r3.e = r0
            return
        L7b:
            java.lang.String r0 = r2.b
            r3.w = r0
            return
        L80:
            java.lang.String r0 = r2.b
            java.lang.Integer r0 = defpackage.eonc.g(r0)
            if (r0 == 0) goto Lbf
            r3.v = r0
            return
        L8b:
            java.lang.String r0 = r2.b
            java.lang.Integer r0 = defpackage.eonc.g(r0)
            if (r0 == 0) goto Lbf
            r3.u = r0
            return
        L96:
            java.lang.String r0 = r2.b
            java.lang.Integer r0 = defpackage.eonc.g(r0)
            if (r0 == 0) goto Lbf
            r3.i = r0
            return
        La1:
            java.lang.String r0 = r2.b
            java.lang.Integer r0 = defpackage.eonc.g(r0)
            if (r0 == 0) goto Lbf
            r3.h = r0
            return
        Lac:
            java.lang.String r0 = r2.b
            r3.d = r0
            return
        Lb1:
            java.lang.String r0 = r2.b
            r3.c = r0
            return
        Lb6:
            java.lang.String r0 = r2.b
            r3.b = r0
            return
        Lbb:
            java.lang.String r0 = r2.b
            r3.a = r0
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqt.b(mbq):void");
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nqt nqtVar = (nqt) obj;
            if (this.a.equals(nqtVar.a) && this.b.equals(nqtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
