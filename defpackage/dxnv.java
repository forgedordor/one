package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxnv extends fcyz implements fdat {
    long a;
    int b;
    final /* synthetic */ dxnz c;
    final /* synthetic */ List d;
    final /* synthetic */ Map e;
    final /* synthetic */ dxnq f;
    final /* synthetic */ dxha g;
    final /* synthetic */ evjz h;
    final /* synthetic */ int i;
    final /* synthetic */ dxnj j;
    final /* synthetic */ String k;
    final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxnv(dxnz dxnzVar, List list, Map map, dxnq dxnqVar, dxha dxhaVar, evjz evjzVar, int i, dxnj dxnjVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dxnzVar;
        this.d = list;
        this.e = map;
        this.f = dxnqVar;
        this.g = dxhaVar;
        this.h = evjzVar;
        this.i = i;
        this.j = dxnjVar;
        this.k = str;
        this.l = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxnv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r13.b
            r2 = 1
            if (r1 == 0) goto Le
            long r0 = r13.a
            defpackage.fctl.b(r14)
            r11 = r13
            goto L33
        Le:
            defpackage.fctl.b(r14)
            dxnz r3 = r13.c
            diep r14 = r3.b
            j$.time.Instant r14 = r14.f()
            long r8 = r14.toEpochMilli()
            java.util.List r4 = r13.d
            java.util.Map r5 = r13.e
            dxnq r6 = r13.f
            dxha r7 = r13.g
            evjz r10 = r13.h
            r13.a = r8
            r13.b = r2
            r11 = r13
            java.lang.Object r14 = r3.c(r4, r5, r6, r7, r8, r10, r11)
            if (r14 == r0) goto Ld6
            r0 = r8
        L33:
            dxft r14 = (defpackage.dxft) r14
            boolean r3 = r14 instanceof defpackage.dxfx
            if (r3 == 0) goto Ld5
            r3 = r14
            dxfx r3 = (defpackage.dxfx) r3
            java.lang.Object r3 = r3.a
            java.util.Map r3 = (java.util.Map) r3
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L47
            goto L68
        L47:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L4f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            dxft r4 = (defpackage.dxft) r4
            boolean r4 = r4.i()
            if (r4 != 0) goto L4f
            goto Ld5
        L68:
            dxnz r3 = r11.c
            dxha r4 = r11.g
            int r5 = r11.i
            dxpd r6 = r3.d(r4)
            fcsu r3 = r3.c
            java.lang.Object r3 = r3.b()
            r3.getClass()
            dxnj r7 = r11.j
            java.lang.String r8 = r11.k
            java.lang.String r9 = r11.l
            java.lang.String r3 = (java.lang.String) r3
            boolean r10 = r4.a()
            r12 = 0
            if (r10 == 0) goto L91
            boolean r4 = r4.b()
            if (r4 == 0) goto L91
            goto L92
        L91:
            r2 = r12
        L92:
            r7.getClass()
            eygg r4 = r6.a
            java.lang.Object r4 = r4.b()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r6 = "last_successful_registration_request_hash_code"
            android.content.SharedPreferences$Editor r4 = r4.putInt(r6, r5)
            java.lang.String r5 = "last_successful_registration_environment_url"
            android.content.SharedPreferences$Editor r3 = r4.putString(r5, r3)
            java.lang.String r4 = "last_successful_registration_time_ms"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r4, r0)
            java.lang.String r1 = "is_registered_to_unified_fcm_registration"
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r2)
            dxnj r1 = defpackage.dxnj.a
            if (r7 == r1) goto Lc4
            int r1 = r7.f
            java.lang.String r2 = "last_successful_registration_account_type"
            r0.putInt(r2, r1)
        Lc4:
            if (r8 == 0) goto Lcb
            java.lang.String r1 = "last_successful_registration_pseudonymous_cookie"
            r0.putString(r1, r8)
        Lcb:
            if (r9 == 0) goto Ld2
            java.lang.String r1 = "last_successful_fcm_registration_token"
            r0.putString(r1, r9)
        Ld2:
            r0.apply()
        Ld5:
            return r14
        Ld6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxnv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxnv(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, fcxyVar);
    }
}
