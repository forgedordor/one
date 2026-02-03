package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhav implements dgwo {
    final /* synthetic */ dhaw a;
    private int b = 1;

    public dhav(dhaw dhawVar) {
        this.a = dhawVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r5 = ((defpackage.dhnp) r6).b;
        r6 = r3.g.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r6.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        ((defpackage.dhay) r6.next()).f(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        defpackage.dhja.i(r7, "Error while invoking listener: %s", r7.getMessage());
     */
    @Override // defpackage.dgwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.dgwm r11, java.lang.String r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhav.d(dgwm, java.lang.String, byte[]):void");
    }

    @Override // defpackage.dgwo
    public final void q(int i, String str) {
        this.a.i = null;
    }

    @Override // defpackage.dgwo
    public final void r(dhft dhftVar) {
        this.a.i = null;
    }

    @Override // defpackage.dgwo
    public final void u() {
        this.a.i = null;
    }

    @Override // defpackage.dgwo
    public final void v(dhft dhftVar) {
        dhja.g("Subscription terminated because of exception: %s", dhftVar.getMessage());
        this.a.i = null;
    }

    @Override // defpackage.dgwo
    public final void t() {
    }
}
