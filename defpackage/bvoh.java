package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvoh extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ List g;
    final /* synthetic */ bvoq h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvoh(List list, bvoq bvoqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = list;
        this.h = bvoqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:16:0x005f, B:11:0x0036, B:13:0x003c, B:18:0x0067, B:20:0x006c, B:31:0x0094, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:28:0x008c, B:30:0x0090, B:10:0x0024), top: B:38:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:16:0x005f, B:11:0x0036, B:13:0x003c, B:18:0x0067, B:20:0x006c, B:31:0x0094, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:28:0x008c, B:30:0x0090, B:10:0x0024), top: B:38:0x0004 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:16:0x005f). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.f
            if (r1 == 0) goto L17
            java.lang.Object r1 = r6.e
            java.lang.Object r2 = r6.d
            java.lang.Object r3 = r6.c
            java.lang.Object r4 = r6.b
            java.lang.Object r5 = r6.a
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L5f
        L14:
            r7 = move-exception
            goto L9e
        L17:
            defpackage.fctl.b(r7)
            java.util.List r7 = r6.g
            bvoq r1 = r6.h
            java.lang.String r2 = "GaiaDevicePairingManagerImpl#deleteDesktopsByIds"
            eieu r4 = defpackage.eiiy.h(r2)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r3 = 10
            int r3 = defpackage.fcva.p(r7, r3)     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L14
            r5 = r1
            r1 = r2
            r2 = r7
        L36:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L67
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L14
            bvks r7 = (defpackage.bvks) r7     // Catch: java.lang.Throwable -> L14
            r3 = r5
            bvoq r3 = (defpackage.bvoq) r3     // Catch: java.lang.Throwable -> L14
            cfdf r3 = r3.e     // Catch: java.lang.Throwable -> L14
            eiju r7 = r3.b(r7)     // Catch: java.lang.Throwable -> L14
            r6.a = r5     // Catch: java.lang.Throwable -> L14
            r6.b = r4     // Catch: java.lang.Throwable -> L14
            r6.c = r1     // Catch: java.lang.Throwable -> L14
            r6.d = r2     // Catch: java.lang.Throwable -> L14
            r6.e = r1     // Catch: java.lang.Throwable -> L14
            r3 = 1
            r6.f = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 == r0) goto L66
            r3 = r1
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L14
            r1.add(r7)     // Catch: java.lang.Throwable -> L14
            r1 = r3
            goto L36
        L66:
            return r0
        L67:
            boolean r7 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L14
            r0 = 0
            if (r7 == 0) goto L73
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L73
            goto L94
        L73:
            java.util.Iterator r7 = r1.iterator()     // Catch: java.lang.Throwable -> L14
        L77:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L94
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L14
            r1.getClass()     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L77
            int r0 = r0 + 1
            if (r0 >= 0) goto L77
            defpackage.fcva.l()     // Catch: java.lang.Throwable -> L14
            goto L77
        L94:
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L14
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 0
            defpackage.fczl.a(r4, r0)
            return r7
        L9e:
            throw r7     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            defpackage.fczl.a(r4, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvoh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvoh(this.g, this.h, fcxyVar);
    }
}
