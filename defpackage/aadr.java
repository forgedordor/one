package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aadr extends fcyy implements fdat {
    int a;
    int b;
    final /* synthetic */ fdap c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadr(fdap fdapVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aadr) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0032, B:12:0x0034], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0025 -> B:9:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            int r1 = r9.a
            java.lang.Object r4 = r9.d
            ire r4 = (defpackage.ire) r4
            defpackage.fctl.b(r10)
            goto L28
        L12:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.d
            ire r10 = (defpackage.ire) r10
            r4 = r10
            r1 = r3
        L1b:
            r9.d = r4
            r9.a = r1
            r9.b = r2
            java.lang.Object r10 = defpackage.ird.a(r4, r9)
            if (r10 != r0) goto L28
            return r0
        L28:
            irs r10 = (defpackage.irs) r10
            java.util.List r5 = r10.a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L34
        L32:
            r6 = r3
            goto L55
        L34:
            java.util.Iterator r6 = r5.iterator()
            r7 = r3
        L39:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L51
            java.lang.Object r8 = r6.next()
            ise r8 = (defpackage.ise) r8
            boolean r8 = r8.d
            if (r8 == 0) goto L39
            int r7 = r7 + 1
            if (r7 >= 0) goto L39
            defpackage.fcva.l()
            goto L39
        L51:
            r6 = 2
            if (r7 != r6) goto L32
            r6 = r2
        L55:
            if (r1 != 0) goto L61
            if (r6 == 0) goto L61
            fdap r1 = r9.c
            aado r7 = defpackage.aado.a
            r1.invoke(r7)
            r1 = r2
        L61:
            if (r6 == 0) goto L71
            fdap r6 = r9.c
            aadm r7 = new aadm
            float r10 = defpackage.dzt.c(r10)
            r7.<init>(r10)
            r6.invoke(r7)
        L71:
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L78
            goto L8d
        L78:
            java.util.Iterator r10 = r5.iterator()
        L7c:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L8d
            java.lang.Object r5 = r10.next()
            ise r5 = (defpackage.ise) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L7c
            goto L1b
        L8d:
            if (r1 == 0) goto L96
            fdap r10 = r9.c
            aadn r0 = defpackage.aadn.a
            r10.invoke(r0)
        L96:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aadr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aadr aadrVar = new aadr(this.c, fcxyVar);
        aadrVar.d = obj;
        return aadrVar;
    }
}
