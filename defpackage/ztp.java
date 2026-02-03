package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ztp extends fcyz implements fdap {
    final /* synthetic */ ztv a;
    final /* synthetic */ alff b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztp(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = ztvVar;
        this.b = alffVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00de  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "getMapIntent"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            defpackage.fctl.b(r18)
            alff r3 = r0.b
            bbdt r3 = (defpackage.bbdt) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r3.a
            java.lang.String r6 = "SuggestionUiAdapterImpl.kt"
            ztv r7 = r0.a
            r9 = 1
            r10 = 0
            boolean r11 = android.text.TextUtils.isEmpty(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            if (r11 != 0) goto L2d
            java.lang.String r11 = "geo:0,0?q="
            r4.append(r11)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r5 = defpackage.cssr.h(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            r4.append(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            goto L83
        L2d:
            java.lang.String r5 = r3.b     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r11 = r3.c     // Catch: java.io.UnsupportedEncodingException -> Lac
            boolean r12 = android.text.TextUtils.isEmpty(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            if (r12 != 0) goto L98
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.io.UnsupportedEncodingException -> Lac
            if (r12 == 0) goto L3e
            goto L98
        L3e:
            java.lang.String r5 = defpackage.cssr.h(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r11 = defpackage.cssr.h(r11)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r12 = r3.d     // Catch: java.io.UnsupportedEncodingException -> Lac
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch: java.io.UnsupportedEncodingException -> Lac
            r14 = 2
            if (r13 == 0) goto L66
            java.lang.String r12 = "geo:%s,%s"
            java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch: java.io.UnsupportedEncodingException -> Lac
            r13[r10] = r5     // Catch: java.io.UnsupportedEncodingException -> Lac
            r13[r9] = r11     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r13, r14)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r5 = java.lang.String.format(r12, r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            r5.getClass()     // Catch: java.io.UnsupportedEncodingException -> Lac
            r4.append(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            goto L83
        L66:
            java.lang.String r12 = defpackage.cssr.h(r12)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r13 = "geo:0,0?q=%s,%s(%s)"
            r15 = 3
            java.lang.Object[] r8 = new java.lang.Object[r15]     // Catch: java.io.UnsupportedEncodingException -> Lac
            r8[r10] = r5     // Catch: java.io.UnsupportedEncodingException -> Lac
            r8[r9] = r11     // Catch: java.io.UnsupportedEncodingException -> Lac
            r8[r14] = r12     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r8, r15)     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r5 = java.lang.String.format(r13, r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
            r5.getClass()     // Catch: java.io.UnsupportedEncodingException -> Lac
            r4.append(r5)     // Catch: java.io.UnsupportedEncodingException -> Lac
        L83:
            fcsu r5 = r7.v     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.Object r5 = r5.b()     // Catch: java.io.UnsupportedEncodingException -> Lac
            cpbz r5 = (defpackage.cpbz) r5     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r4 = r4.toString()     // Catch: java.io.UnsupportedEncodingException -> Lac
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac
            android.content.Intent r8 = r5.b(r4)     // Catch: java.io.UnsupportedEncodingException -> Lac
            goto Lcb
        L98:
            ekrg r4 = defpackage.ztv.a     // Catch: java.io.UnsupportedEncodingException -> Lac
            ekrw r4 = r4.h()     // Catch: java.io.UnsupportedEncodingException -> Lac
            r7 = 1138(0x472, float:1.595E-42)
            ekrw r4 = r4.h(r2, r1, r7, r6)     // Catch: java.io.UnsupportedEncodingException -> Lac
            ekrd r4 = (defpackage.ekrd) r4     // Catch: java.io.UnsupportedEncodingException -> Lac
            java.lang.String r7 = "suggestion type map missing lat/lng, cannot create intent, lat: %s, long: %s"
            r4.D(r7, r5, r11)     // Catch: java.io.UnsupportedEncodingException -> Lac
            goto Lca
        Lac:
            ekrg r4 = defpackage.ztv.a
            ekrw r4 = r4.j()
            r5 = 1167(0x48f, float:1.635E-42)
            ekrw r1 = r4.h(r2, r1, r5, r6)
            r11 = r1
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r13 = r3.a
            java.lang.String r14 = r3.b
            java.lang.String r15 = r3.c
            java.lang.String r1 = r3.d
            java.lang.String r12 = "Unsupported encoding exception for suggested map action. query: %s, lat: %s, long: %s, label: %s"
            r16 = r1
            r11.J(r12, r13, r14, r15, r16)
        Lca:
            r8 = 0
        Lcb:
            if (r8 == 0) goto Lde
            ztv r1 = r0.a
            fcsu r1 = r1.v
            java.lang.Object r1 = r1.b()
            cpbz r1 = (defpackage.cpbz) r1
            boolean r1 = r1.e(r8)
            if (r1 == 0) goto Lde
            goto Ldf
        Lde:
            r9 = r10
        Ldf:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ztp(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
