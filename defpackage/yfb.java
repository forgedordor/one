package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yfb implements PointerInputEventHandler {
    final /* synthetic */ fdjx a;
    final /* synthetic */ ddp b;
    final /* synthetic */ yen c;
    final /* synthetic */ hsf d;
    final /* synthetic */ hrg e;

    public yfb(fdjx fdjxVar, hrg hrgVar, ddp ddpVar, yen yenVar, hsf hsfVar) {
        this.a = fdjxVar;
        this.e = hrgVar;
        this.b = ddpVar;
        this.c = yenVar;
        this.d = hsfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        if (r1 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(defpackage.isn r18, defpackage.fcxy<? super defpackage.fctx> r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.yfa
            if (r3 == 0) goto L19
            r3 = r2
            yfa r3 = (defpackage.yfa) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            yfa r3 = new yfa
            r3.<init>(r0, r2)
        L1e:
            r9 = r3
            java.lang.Object r2 = r9.a
            fcyl r3 = defpackage.fcyl.a
            int r4 = r9.c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L41
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            defpackage.fctl.b(r2)
            goto La4
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            ito r1 = r9.d
            defpackage.fctl.b(r2)
        L3f:
            r4 = r1
            goto L74
        L41:
            defpackage.fctl.b(r2)
            fdjx r2 = r0.a
            hrg r4 = r0.e
            ddp r7 = r0.b
            yen r8 = r0.c
            ygk r10 = new ygk
            ains r8 = r8.h
            r10.<init>(r2, r4, r7, r8)
            r2 = r1
            ito r2 = (defpackage.ito) r2
            r9.d = r2
            r9.c = r6
            fdjx r12 = r10.a
            hox r13 = r10.b
            ddp r15 = r10.c
            ains r14 = r10.d
            ygh r11 = new ygh
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r2 = defpackage.dvn.b(r1, r11, r9)
            if (r2 == r3) goto L71
            fctx r2 = defpackage.fctx.a
        L71:
            if (r2 == r3) goto La7
            goto L3f
        L74:
            hsf r1 = r0.d
            java.lang.Object r1 = r1.a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La4
            fdjx r1 = r0.a
            ddp r2 = r0.b
            yey r6 = new yey
            r6.<init>()
            r1 = 0
            r9.d = r1
            r9.c = r5
            yeq r8 = new yeq
            r8.<init>()
            r10 = 7
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r1 = defpackage.dzm.i(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == r3) goto La1
            fctx r1 = defpackage.fctx.a
        La1:
            if (r1 != r3) goto La4
            goto La7
        La4:
            fctx r1 = defpackage.fctx.a
            return r1
        La7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfb.invoke(isn, fcxy):java.lang.Object");
    }
}
