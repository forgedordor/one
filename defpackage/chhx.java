package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chhx implements cgxk {
    public final aydh a;
    private final fcyh b;
    private final Context c;
    private final aypv d;
    private final cggg e;
    private final cgxm f;

    public chhx(aydh aydhVar, fcyh fcyhVar, Context context, aypv aypvVar, cggg cgggVar) {
        aydhVar.getClass();
        fcyhVar.getClass();
        context.getClass();
        aypvVar.getClass();
        cgggVar.getClass();
        this.a = aydhVar;
        this.b = fcyhVar;
        this.c = context;
        this.d = aypvVar;
        this.e = cgggVar;
        this.f = new cgxm("LaunchActionsForReceiveSms");
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cgxk
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chil r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.chhv
            if (r0 == 0) goto L13
            r0 = r11
            chhv r0 = (defpackage.chhv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            chhv r0 = new chhv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            chif r10 = r0.d
            defpackage.fctl.b(r11)
            return r10
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.fctl.b(r11)
            boolean r11 = r10 instanceof defpackage.chif
            r2 = 0
            java.lang.String r4 = "checkSubjectType"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/pipeline/Interceptor$Companion"
            java.lang.String r6 = "BuglePipeline"
            java.lang.String r7 = "Interceptor.kt"
            if (r11 == 0) goto L6c
            ekrg r11 = defpackage.cgxj.a
            ekrw r11 = r11.h()
            ekrz r8 = defpackage.eksq.a
            r11.X(r8, r6)
            r6 = 101(0x65, float:1.42E-43)
            ekrw r11 = r11.h(r5, r4, r6, r7)
            ekrd r11 = (defpackage.ekrd) r11
            cgxm r4 = r9.f
            int r5 = defpackage.fdcj.a
            fdbi r5 = new fdbi
            java.lang.Class<chif> r6 = defpackage.chif.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r6 = "Running Interceptor %s. Subject is expected type %s"
            java.lang.String r4 = r4.a
            r11.D(r6, r4, r5)
            r11 = r10
            goto La3
        L6c:
            ekrg r11 = defpackage.cgxj.a
            ekrw r11 = r11.h()
            ekrz r8 = defpackage.eksq.a
            r11.X(r8, r6)
            r6 = 110(0x6e, float:1.54E-43)
            ekrw r11 = r11.h(r5, r4, r6, r7)
            ekrd r11 = (defpackage.ekrd) r11
            cgxm r4 = r9.f
            int r5 = defpackage.fdcj.a
            fdbi r5 = new fdbi
            java.lang.Class<chif> r6 = defpackage.chif.class
            r5.<init>(r6)
            java.lang.String r5 = r5.c()
            java.lang.Class r6 = r10.getClass()
            fdbi r7 = new fdbi
            r7.<init>(r6)
            java.lang.String r6 = r7.c()
            java.lang.String r7 = "Skipping Interceptor %s. Expected type is %s but received subject of type %s"
            java.lang.String r4 = r4.a
            r11.I(r7, r4, r5, r6)
            r11 = r2
        La3:
            chif r11 = (defpackage.chif) r11
            if (r11 != 0) goto La8
            return r10
        La8:
            chhz r10 = r11.f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r10 = r10.g
            if (r10 != 0) goto Laf
            goto Ld9
        Laf:
            android.content.Context r10 = r9.c
            boolean r10 = defpackage.craf.i(r10)
            if (r10 != 0) goto Lc3
            aypv r10 = r9.d
            r4 = 2
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r10 = r10.b(r4)
            r4 = 0
            r10.w(r4)
        Lc3:
            cggg r10 = r9.e
            r10.b()
            fcyh r10 = r9.b
            chhw r4 = new chhw
            r4.<init>(r9, r11, r2)
            r0.d = r11
            r0.c = r3
            java.lang.Object r10 = defpackage.eicj.a(r10, r4, r0)
            if (r10 == r1) goto Lda
        Ld9:
            return r11
        Lda:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chhx.c(chil, fcxy):java.lang.Object");
    }
}
