package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwl implements fdpm {
    final /* synthetic */ fdjx a;
    final /* synthetic */ feav b;
    final /* synthetic */ fdci c;
    final /* synthetic */ fdau d;
    final /* synthetic */ fdap e;
    final /* synthetic */ List f;
    final /* synthetic */ fdos g;

    public egwl(fdjx fdjxVar, feav feavVar, fdci fdciVar, fdau fdauVar, fdap fdapVar, List list, fdos fdosVar) {
        this.a = fdjxVar;
        this.b = feavVar;
        this.c = fdciVar;
        this.d = fdauVar;
        this.e = fdapVar;
        this.f = list;
        this.g = fdosVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.fdpm
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(defpackage.fdpl r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r0 instanceof defpackage.egwi
            if (r2 == 0) goto L17
            r2 = r0
            egwi r2 = (defpackage.egwi) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            egwi r2 = new egwi
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.c
            fcyl r3 = defpackage.fcyl.a
            int r4 = r2.e
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            java.lang.Object r3 = r2.b
            feaz r4 = r2.f
            java.lang.Object r2 = r2.a
            defpackage.fctl.b(r0)
            goto L72
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L39:
            defpackage.fctl.b(r0)
            fdjx r0 = r1.a
            feav r9 = r1.b
            fdci r10 = r1.c
            fdau r11 = r1.d
            fdap r12 = r1.e
            java.util.List r13 = r1.f
            fdos r14 = r1.g
            fdjz r4 = defpackage.fdjz.b
            fcyi r6 = defpackage.fcyi.a
            fcyh r15 = defpackage.eicg.a(r6)
            egwh r6 = new egwh
            r7 = 0
            r8 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            fdlr r0 = defpackage.fdin.c(r0, r15, r4, r6)
            r2.a = r0
            r4 = r9
            feaz r4 = (defpackage.feaz) r4
            r2.f = r4
            r2.b = r13
            r2.e = r5
            java.lang.Object r2 = r9.b(r2)
            if (r2 == r3) goto La2
            r2 = r0
            r4 = r9
            r3 = r13
        L72:
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L9d
            r6 = 2
            if (r0 > r6) goto L95
            int r0 = r3.size()     // Catch: java.lang.Throwable -> L9d
            int r0 = r0 + r5
            if (r0 <= r6) goto L89
            java.lang.Object r0 = r3.remove(r5)     // Catch: java.lang.Throwable -> L9d
            fdlr r0 = (defpackage.fdlr) r0     // Catch: java.lang.Throwable -> L9d
            defpackage.fdlp.a(r0)     // Catch: java.lang.Throwable -> L9d
        L89:
            r3.add(r2)     // Catch: java.lang.Throwable -> L9d
            r4.d()
            r2.z()
            fctx r0 = defpackage.fctx.a
            return r0
        L95:
            java.lang.String r0 = "This Job queue has overflowed. Please report this as a bug at go/tiktok-bug"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L9d
            throw r2     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            r4.d()
            throw r0
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egwl.fO(fdpl, fcxy):java.lang.Object");
    }
}
