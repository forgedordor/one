package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aspz {
    public static final cqce a = cqce.g("Bugle", "RbmBusinessLogger");
    public final fcsu b;
    public final eosc c;
    public final ains d;

    public aspz(fcsu fcsuVar, eosc eoscVar, ains ainsVar) {
        this.b = fcsuVar;
        this.c = eoscVar;
        this.d = ainsVar;
    }

    public static String a(String str) {
        int iIndexOf = str.indexOf(64);
        return Pattern.matches("\\+[01234567890]+", iIndexOf >= 0 ? str.substring(0, iIndexOf) : str) ? "REDACTED-phone number" : str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(java.lang.String r5) {
        /*
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case 112701: goto L37;
                case 114009: goto L2d;
                case 3213448: goto L23;
                case 99617003: goto L19;
                case 109566356: goto Lf;
                default: goto Le;
            }
        Le:
            goto L41
        Lf:
            java.lang.String r1 = "smsto"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            r5 = r4
            goto L42
        L19:
            java.lang.String r1 = "https"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            r5 = r0
            goto L42
        L23:
            java.lang.String r1 = "http"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            r5 = 0
            goto L42
        L2d:
            java.lang.String r1 = "sms"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            r5 = r3
            goto L42
        L37:
            java.lang.String r1 = "rbm"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L41
            r5 = r2
            goto L42
        L41:
            r5 = -1
        L42:
            if (r5 == 0) goto L4f
            if (r5 == r0) goto L4f
            if (r5 == r4) goto L4e
            if (r5 == r3) goto L4e
            if (r5 == r2) goto L4d
            return r0
        L4d:
            return r2
        L4e:
            return r3
        L4f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aspz.j(java.lang.String):int");
    }

    private final void n(enev enevVar) {
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enevVar.getClass();
        enfcVar.d = enevVar;
        enfcVar.c = 12;
        f((enfc) enfbVar.build());
    }

    private final void o(enfs enfsVar) {
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enfsVar.getClass();
        enfcVar.d = enfsVar;
        enfcVar.c = 9;
        f((enfc) enfbVar.build());
    }

    public final void b(String str) {
        enet enetVar = (enet) enev.a.createBuilder();
        enetVar.copyOnWrite();
        enev enevVar = (enev) enetVar.instance;
        enevVar.c = 1;
        enevVar.b |= 1;
        enetVar.copyOnWrite();
        enev enevVar2 = (enev) enetVar.instance;
        enevVar2.f = 1;
        enevVar2.b |= 8;
        if (str != null) {
            enetVar.copyOnWrite();
            enev enevVar3 = (enev) enetVar.instance;
            enevVar3.b |= 4;
            enevVar3.e = str;
        }
        n((enev) enetVar.build());
    }

    public final void c(String str, String str2) {
        enet enetVar = (enet) enev.a.createBuilder();
        enetVar.copyOnWrite();
        enev enevVar = (enev) enetVar.instance;
        enevVar.c = 2;
        enevVar.b |= 1;
        enetVar.copyOnWrite();
        enev enevVar2 = (enev) enetVar.instance;
        enevVar2.f = 1;
        enevVar2.b |= 8;
        if (str != null) {
            enetVar.copyOnWrite();
            enev enevVar3 = (enev) enetVar.instance;
            enevVar3.b |= 4;
            enevVar3.e = str;
        }
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enev enevVar4 = (enev) enetVar.build();
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enevVar4.getClass();
        enfcVar.d = enevVar4;
        enfcVar.c = 12;
        String strA = a(str2);
        enfbVar.copyOnWrite();
        enfc enfcVar2 = (enfc) enfbVar.instance;
        strA.getClass();
        enfcVar2.b |= 1;
        enfcVar2.e = strA;
        f((enfc) enfbVar.build());
    }

    public final void d(enfa enfaVar, String str) {
        e(enfaVar, str, null, null);
    }

    public final void e(enfa enfaVar, String str, String str2, String str3) {
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enew enewVar = (enew) enfaVar.toBuilder();
        enewVar.copyOnWrite();
        enfa enfaVar2 = (enfa) enewVar.instance;
        enfaVar2.f = j(str2) - 1;
        enfaVar2.b |= 8;
        if (str3 != null) {
            enewVar.copyOnWrite();
            enfa enfaVar3 = (enfa) enewVar.instance;
            enfaVar3.b |= 16;
            enfaVar3.g = str3;
        }
        enfa enfaVar4 = (enfa) enewVar.build();
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enfaVar4.getClass();
        enfcVar.d = enfaVar4;
        enfcVar.c = 14;
        if (str != null) {
            String strA = a(str);
            enfbVar.copyOnWrite();
            enfc enfcVar2 = (enfc) enfbVar.instance;
            strA.getClass();
            enfcVar2.b |= 1;
            enfcVar2.e = strA;
        }
        f((enfc) enfbVar.build());
    }

    public final void f(enfc enfcVar) {
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.RBM_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enfcVar.getClass();
        ellhVar2.aI = enfcVar;
        ellhVar2.e |= 2048;
        aillVar.o(ellgVar);
    }

    public final void g(enfq enfqVar, String str) {
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enfqVar.getClass();
        enfcVar.d = enfqVar;
        enfcVar.c = 15;
        if (str != null) {
            String strA = a(str);
            enfbVar.copyOnWrite();
            enfc enfcVar2 = (enfc) enfbVar.instance;
            strA.getClass();
            enfcVar2.b |= 1;
            enfcVar2.e = strA;
        }
        f((enfc) enfbVar.build());
    }

    public final void h(enfv enfvVar) {
        enfr enfrVar = (enfr) enfs.a.createBuilder();
        enfrVar.copyOnWrite();
        enfs enfsVar = (enfs) enfrVar.instance;
        enfvVar.getClass();
        enfsVar.c = enfvVar;
        enfsVar.b = 2;
        o((enfs) enfrVar.build());
    }

    public final void i(enfy enfyVar) {
        enfr enfrVar = (enfr) enfs.a.createBuilder();
        enfrVar.copyOnWrite();
        enfs enfsVar = (enfs) enfrVar.instance;
        enfyVar.getClass();
        enfsVar.c = enfyVar;
        enfsVar.b = 1;
        o((enfs) enfrVar.build());
    }

    public final void k(int i, String str) {
        enfb enfbVar = (enfb) enfc.a.createBuilder();
        enec enecVar = (enec) enee.a.createBuilder();
        enecVar.copyOnWrite();
        enee eneeVar = (enee) enecVar.instance;
        eneeVar.c = i - 1;
        eneeVar.b |= 1;
        enfbVar.copyOnWrite();
        enfc enfcVar = (enfc) enfbVar.instance;
        enee eneeVar2 = (enee) enecVar.build();
        eneeVar2.getClass();
        enfcVar.d = eneeVar2;
        enfcVar.c = 3;
        if (!TextUtils.isEmpty(str)) {
            String strA = a(str);
            enfbVar.copyOnWrite();
            enfc enfcVar2 = (enfc) enfbVar.instance;
            strA.getClass();
            enfcVar2.b |= 1;
            enfcVar2.e = strA;
        }
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.RBM_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enfc enfcVar3 = (enfc) enfbVar.build();
        enfcVar3.getClass();
        ellhVar2.aI = enfcVar3;
        ellhVar2.e |= 2048;
        aillVar.j(ellgVar);
    }

    public final void l(String str, int i) {
        enet enetVar = (enet) enev.a.createBuilder();
        enetVar.copyOnWrite();
        enev enevVar = (enev) enetVar.instance;
        enevVar.c = 3;
        enevVar.b |= 1;
        enetVar.copyOnWrite();
        enev enevVar2 = (enev) enetVar.instance;
        enevVar2.d = i - 1;
        enevVar2.b |= 2;
        enetVar.copyOnWrite();
        enev enevVar3 = (enev) enetVar.instance;
        enevVar3.f = 1;
        enevVar3.b |= 8;
        if (str != null) {
            enetVar.copyOnWrite();
            enev enevVar4 = (enev) enetVar.instance;
            enevVar4.b |= 4;
            enevVar4.e = str;
        }
        n((enev) enetVar.build());
    }

    public final void m(int i, String str, String str2, String str3) {
        enew enewVar = (enew) enfa.a.createBuilder();
        enewVar.copyOnWrite();
        enfa enfaVar = (enfa) enewVar.instance;
        enfaVar.c = 4;
        enfaVar.b |= 1;
        enewVar.copyOnWrite();
        enfa enfaVar2 = (enfa) enewVar.instance;
        enfaVar2.d = i - 1;
        enfaVar2.b |= 2;
        enewVar.copyOnWrite();
        enfa enfaVar3 = (enfa) enewVar.instance;
        enfaVar3.f = j(str2) - 1;
        enfaVar3.b |= 8;
        e((enfa) enewVar.build(), str, str2, str3);
    }
}
