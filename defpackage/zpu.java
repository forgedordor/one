package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpu implements fdpm {
    final /* synthetic */ fdpm a;

    public zpu(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.zpt
            if (r0 == 0) goto L13
            r0 = r12
            zpt r0 = (defpackage.zpt) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zpt r0 = new zpt
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r12)
            goto L8e
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r12)
            fdpm r12 = r10.a
            ekgb r11 = (defpackage.ekgb) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L3f:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L81
            java.lang.Object r4 = r11.next()
            aldp r4 = (defpackage.aldp) r4
            r4.getClass()
            boolean r5 = r4 instanceof com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData
            if (r5 != 0) goto L54
            r4 = 0
            goto L7b
        L54:
            zph r5 = new zph
            r6 = r4
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r6 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r7 = r6.w()
            java.lang.String r4 = r4.b()
            ezgi r6 = r6.m()
            int r8 = r6.c
            r9 = 27
            if (r8 != r9) goto L70
            java.lang.Object r6 = r6.d
            ezfn r6 = (defpackage.ezfn) r6
            goto L72
        L70:
            ezfn r6 = defpackage.ezfn.a
        L72:
            java.lang.String r6 = r6.b
            r6.getClass()
            r5.<init>(r7, r4, r6)
            r4 = r5
        L7b:
            if (r4 == 0) goto L3f
            r2.add(r4)
            goto L3f
        L81:
            ekgb r11 = defpackage.ekfv.a(r2)
            r0.b = r3
            java.lang.Object r11 = r12.fO(r11, r0)
            if (r11 != r1) goto L8e
            return r1
        L8e:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpu.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
