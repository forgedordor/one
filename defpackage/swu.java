package defpackage;

import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swu extends fcyz implements fdat {
    int a;
    final /* synthetic */ swv b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public swu(swv swvVar, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = swvVar;
        this.c = parcelFileDescriptor;
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((swu) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (defpackage.fdor.b(r1, new defpackage.fdoo(), r13) == r0) goto L14;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L17
            if (r1 == r3) goto Lf
            defpackage.fctl.b(r14)
            goto L60
        Lf:
            java.lang.Object r1 = r13.g
            fdos r1 = (defpackage.fdos) r1
            defpackage.fctl.b(r14)
            goto L50
        L17:
            defpackage.fctl.b(r14)
            java.lang.Object r14 = r13.g
            r1 = r14
            fdos r1 = (defpackage.fdos) r1
            swv r7 = r13.b
            r14 = 0
            r5 = 6
            r6 = -2
            fdoa r8 = defpackage.fdod.a(r6, r14, r5)
            sws r14 = new sws
            r14.<init>(r8, r1, r4)
            fcyh r5 = r7.c
            defpackage.auvw.k(r1, r5, r4, r14, r2)
            android.os.ParcelFileDescriptor r9 = r13.c
            int r10 = r13.d
            int r11 = r13.e
            java.lang.String r12 = r13.f
            fcyh r14 = r7.b
            fcyh r14 = defpackage.eicg.a(r14)
            swt r5 = new swt
            r6 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r13.g = r1
            r13.a = r3
            java.lang.Object r14 = defpackage.fdin.a(r14, r5, r13)
            if (r14 == r0) goto L63
        L50:
            r13.g = r4
            r13.a = r2
            fdoo r14 = new fdoo
            r14.<init>()
            java.lang.Object r14 = defpackage.fdor.b(r1, r14, r13)
            if (r14 != r0) goto L60
            goto L63
        L60:
            fctx r14 = defpackage.fctx.a
            return r14
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        swu swuVar = new swu(this.b, this.c, this.d, this.e, this.f, fcxyVar);
        swuVar.g = obj;
        return swuVar;
    }
}
