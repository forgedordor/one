package defpackage;

import android.content.Intent;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxid {
    public static dxid j(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        String stringExtra = intent.getStringExtra("casp");
        String stringExtra2 = intent.getStringExtra("chm");
        int iN = n(intent.getStringExtra("google.original_priority"));
        int iN2 = n(intent.getStringExtra("google.delivered_priority"));
        int iM = m(intent.getStringExtra("message_type"));
        String stringExtra3 = intent.getStringExtra("ki");
        Integer numValueOf = !intent.hasExtra("google.ttl") ? null : Integer.valueOf(intent.getIntExtra("google.ttl", 0));
        Integer num = numValueOf == null ? null : numValueOf;
        String stringExtra4 = intent.getStringExtra("google.message_id");
        return new dxib(true != TextUtils.isEmpty(stringExtra4) ? stringExtra4 : null, iM, iN, iN2, num, stringExtra, byteArrayExtra, stringExtra2, stringExtra3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(java.lang.String r4) {
        /*
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.hashCode()
            r2 = 3
            r3 = 2
            switch(r1) {
                case -2062414158: goto L2c;
                case 102161: goto L22;
                case 814694033: goto L18;
                case 814800675: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L36
        Le:
            java.lang.String r1 = "send_event"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L36
            r4 = r3
            goto L37
        L18:
            java.lang.String r1 = "send_error"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L36
            r4 = r2
            goto L37
        L22:
            java.lang.String r1 = "gcm"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L36
            r4 = 0
            goto L37
        L2c:
            java.lang.String r1 = "deleted_messages"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L36
            r4 = r0
            goto L37
        L36:
            r4 = -1
        L37:
            if (r4 == 0) goto L45
            if (r4 == r0) goto L44
            if (r4 == r3) goto L42
            if (r4 == r2) goto L40
            return r0
        L40:
            r4 = 5
            return r4
        L42:
            r4 = 4
            return r4
        L44:
            return r2
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxid.m(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int n(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r1 == r2) goto L1d
            r2 = 3202466(0x30dda2, float:4.48761E-39)
            if (r1 == r2) goto L13
            goto L27
        L13:
            java.lang.String r1 = "high"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L27
            r3 = r0
            goto L28
        L1d:
            java.lang.String r1 = "normal"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L27
            r3 = 0
            goto L28
        L27:
            r3 = -1
        L28:
            if (r3 == 0) goto L2f
            if (r3 == r0) goto L2d
            return r0
        L2d:
            r3 = 3
            return r3
        L2f:
            r3 = 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxid.n(java.lang.String):int");
    }

    private static int o(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? 1 : 3;
        }
        return 2;
    }

    public abstract Integer a();

    protected abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract byte[] f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public final evdg k() {
        evdd evddVar = (evdd) evdg.a.createBuilder();
        int iO = o(i());
        evddVar.copyOnWrite();
        evdg evdgVar = (evdg) evddVar.instance;
        evdgVar.e = iO - 1;
        int i = 4;
        evdgVar.b |= 4;
        int iO2 = o(h());
        evddVar.copyOnWrite();
        evdg evdgVar2 = (evdg) evddVar.instance;
        evdgVar2.f = iO2 - 1;
        evdgVar2.b |= 8;
        int iG = g() - 1;
        if (iG == 1) {
            i = 2;
        } else if (iG == 2) {
            i = 3;
        } else if (iG != 3) {
            i = iG != 4 ? 1 : 5;
        }
        evddVar.copyOnWrite();
        evdg evdgVar3 = (evdg) evddVar.instance;
        evdgVar3.d = i - 1;
        evdgVar3.b = 2 | evdgVar3.b;
        if (!TextUtils.isEmpty(e())) {
            String strE = e();
            evddVar.copyOnWrite();
            evdg evdgVar4 = (evdg) evddVar.instance;
            strE.getClass();
            evdgVar4.b |= 1;
            evdgVar4.c = strE;
        }
        return (evdg) evddVar.build();
    }

    public final boolean l() {
        return dxmy.a(c(), f(), b());
    }
}
