package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxe extends ejxi {
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejxe(ejxk ejxkVar, CharSequence charSequence, String str) {
        super(ejxkVar, charSequence);
        this.b = str;
    }

    @Override // defpackage.ejxi
    public final int b(int i) {
        return i + this.b.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r8 = r8 + 1;
     */
    @Override // defpackage.ejxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(int r8) {
        /*
            r7 = this;
            java.lang.CharSequence r0 = r7.c
            java.lang.String r1 = r7.b
            int r2 = r1.length()
            int r3 = r0.length()
            int r3 = r3 - r2
        Ld:
            if (r8 > r3) goto L25
            r4 = 0
        L10:
            if (r4 >= r2) goto L24
            int r5 = r4 + r8
            char r5 = r0.charAt(r5)
            char r6 = r1.charAt(r4)
            if (r5 == r6) goto L21
            int r8 = r8 + 1
            goto Ld
        L21:
            int r4 = r4 + 1
            goto L10
        L24:
            return r8
        L25:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejxe.c(int):int");
    }
}
