package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgnj {
    public final dgtk a;
    public final dgrs b;
    private final dheq c;
    private final cebq d;

    public dgnj(dgtk dgtkVar, dheq dheqVar, dgrs dgrsVar, cebq cebqVar) {
        this.a = dgtkVar;
        this.b = dgrsVar;
        this.c = dheqVar;
        this.d = cebqVar;
    }

    static final int f(int i) {
        int iB = etsr.b(i);
        if (iB == 2) {
            return 1;
        }
        if (iB != 3) {
            return iB != 4 ? 0 : 3;
        }
        return 2;
    }

    public final dgti a(Context context, String str, String str2) {
        String strC = c(str, str2);
        String str3 = dfpi.z() ? this.d.c(str2).B : (String) dfaq.E().u().a();
        String str4 = dfpi.z() ? this.d.c(str2).C : (String) dfaq.E().w().a();
        String strE = dhla.e(context, dhla.a(context), 1);
        String strB = b(context, str2);
        dgti dgtiVar = new dgti(str3, str4, strE);
        dgtiVar.f = strC;
        dgtiVar.g = strB;
        dgtiVar.h = dhla.b(context);
        return dgtiVar;
    }

    final String b(Context context, String str) throws dhkf {
        String strB;
        int iIntValue;
        dheq dheqVar;
        dhkv dhkvVarF;
        try {
            dhkv dhkvVarG = dhkv.g(context);
            dheqVar = this.c;
            dhkvVarF = dhkvVarG.f(dheqVar.b());
        } catch (dhkf unused) {
            dhja.g("No permissions to get device id", new Object[0]);
        }
        if (dhkvVarF != null) {
            try {
                strB = ejwk.b(dhkvVarF.a.getImei(dheqVar.a.f()));
            } catch (SecurityException e) {
                throw new dhkf("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
            }
        } else {
            strB = "";
        }
        if (dfpi.z()) {
            int iC = etsr.c(this.d.c(str).E);
            if (iC == 0) {
                iC = 1;
            }
            iIntValue = f(iC);
        } else {
            iIntValue = ((Integer) dfaq.E().r().a()).intValue();
        }
        return (iIntValue == 2 || iIntValue == 3) ? strB : "";
    }

    final String c(String str, String str2) {
        int iIntValue;
        if (dfpi.z()) {
            int iC = etsr.c(this.d.c(str2).F);
            if (iC == 0) {
                iC = 1;
            }
            iIntValue = f(iC);
        } else {
            iIntValue = ((Integer) dfaq.E().s().a()).intValue();
        }
        if (iIntValue != 1) {
            if (iIntValue != 2 && iIntValue != 3) {
                return "";
            }
        } else if (!TextUtils.isEmpty(str)) {
            return String.format(Locale.US, "%-15s", str.substring(0, Math.min(str.length(), 6))).replace(' ', '0');
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[Catch: IOException -> 0x025f, TryCatch #2 {IOException -> 0x025f, blocks: (B:13:0x005b, B:15:0x0069, B:17:0x0074, B:20:0x007d, B:23:0x008a, B:26:0x0096, B:29:0x00a5, B:33:0x00c4, B:35:0x00cc, B:36:0x00e0, B:38:0x00f3, B:40:0x00f9, B:41:0x00ff, B:42:0x0125, B:46:0x0144, B:48:0x015e, B:49:0x0170, B:67:0x01b1, B:69:0x01b9, B:71:0x01c1, B:73:0x01c9, B:74:0x01ce, B:75:0x01cf, B:76:0x01e6, B:77:0x01e7, B:79:0x01ef, B:81:0x01f7, B:86:0x0214, B:84:0x01fe, B:87:0x0222, B:88:0x0234, B:89:0x0235, B:90:0x0247, B:91:0x0248, B:92:0x024d, B:55:0x017c, B:57:0x0182, B:58:0x018f, B:60:0x0197, B:62:0x01a2, B:64:0x01a9, B:45:0x0136, B:32:0x00c2, B:93:0x024e, B:97:0x0257, B:98:0x025e), top: B:109:0x005b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void d(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, defpackage.ckiz r21) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgnj.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String, ckiz):void");
    }

    public final void e(Context context, String str, dgiq dgiqVar, String str2, String str3, int i, String str4, String str5, ckiz ckizVar) {
        this.a.e(str, dgiqVar, str2, str3, i, str4 == null ? a(context, c(this.c.e(), str5), str5) : a(context, str4, str5), Optional.of(ckizVar));
    }
}
