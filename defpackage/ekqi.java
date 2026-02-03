package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqi {
    private static final ejvf d = ejvf.m(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").k();
    private static final ejvf e = new ejva(new ejvd(new ejvd(new ejuu(0, 31), new ejuv(127)), ejvf.m(" @,:<>"))).o();
    private static final ejvf f = new ejva(new ejvd(new ejvd(new ejuu(0, 31), new ejuv(127)), ejvf.m(" @,:<>+%"))).o();
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[EDGE_INSN: B:77:0x00f1->B:78:0x00f2 BREAK  A[LOOP:0: B:49:0x00ad->B:65:0x00d2]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ekqi(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekqi.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ekqi) {
            ekqi ekqiVar = (ekqi) obj;
            if (ejwh.a(this.a, ekqiVar.a) && ejwh.a(this.b, ekqiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a + "@" + this.b;
    }
}
