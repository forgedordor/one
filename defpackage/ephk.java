package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephk implements ephj {
    private final ephi a;
    private final ekgp b;
    private final ephz c = new ephz(ekhx.r("DE", "TW"));

    public ephk(ephi ephiVar) {
        this.a = ephiVar;
        this.b = ekgp.m(52, new ephx(ephiVar), 54, new ephu(ephiVar));
        ekgp.l("AR", new ephy());
    }

    @Override // defpackage.ephi
    public final int a(String str) {
        etek etekVar = ((epho) this.a).a;
        etdn etdnVarN = epho.n(str);
        if (etekVar.r(etdnVarN)) {
            return etekVar.a(etdnVarN);
        }
        etek.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "getCountryCodeForRegion", a.a(etdnVarN == null ? "null" : etdnVarN.eW, "Invalid or missing region code (", ") provided."));
        return 0;
    }

    @Override // defpackage.ephi
    public final String b(ephf ephfVar, ephg ephgVar) {
        ephv ephvVar = (ephv) this.b.get(Integer.valueOf(ephfVar.a()));
        return (ephvVar == null || !this.a.g(ephfVar)) ? this.a.b(ephfVar, ephgVar) : ephvVar.a(ephfVar, ephgVar);
    }

    @Override // defpackage.ephi
    public final String c(ephf ephfVar, String str) {
        int iIndexOf;
        etfp etfpVar = ((ephn) ephfVar).a;
        etdn etdnVarN = epho.n(str);
        String str2 = etfpVar.h;
        int length = str2.length();
        etek etekVar = ((epho) this.a).a;
        String str3 = "";
        if (length == 0) {
            if (!etekVar.r(etdnVarN)) {
                etek.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryCallingNumber", a.I(etdnVarN, "Trying to format number from invalid region ", ". International formatting applied."));
                return etekVar.x(etfpVar, 2);
            }
            int i = etfpVar.c;
            String strK = etekVar.k(etfpVar);
            if (!etekVar.o(i)) {
                return strK;
            }
            if (i == 1) {
                if (etekVar.p(etdnVarN)) {
                    return "1 ".concat(String.valueOf(etekVar.x(etfpVar, 3)));
                }
            } else if (i == etekVar.a(etdnVarN)) {
                return etekVar.x(etfpVar, 3);
            }
            etee eteeVarF = etekVar.f(etdnVarN);
            String str4 = eteeVarF.p;
            if ((eteeVarF.b & 1048576) != 0) {
                str3 = eteeVarF.q;
            } else if (etek.c.matcher(str4).matches()) {
                str3 = str4;
            }
            etee eteeVarG = etekVar.g(i, etekVar.c(i));
            StringBuilder sb = new StringBuilder(etekVar.y(strK, eteeVarG, 2));
            etekVar.z(etfpVar, eteeVarG, 2, sb);
            if (str3.length() > 0) {
                sb.insert(0, " ").insert(0, i).insert(0, " ").insert(0, str3);
            } else {
                etekVar.A(i, 2, sb);
            }
            return sb.toString();
        }
        int i2 = etfpVar.c;
        if (!etekVar.o(i2)) {
            return str2;
        }
        String strE = etek.E(str2, etek.b);
        String strK2 = etekVar.k(etfpVar);
        if (strK2.length() > 3 && (iIndexOf = strE.indexOf(strK2.substring(0, 3))) != -1) {
            strE = strE.substring(iIndexOf);
        }
        etee eteeVarF2 = etekVar.f(etdnVarN);
        if (i2 == 1) {
            if (etekVar.p(etdnVarN)) {
                return "1 ".concat(String.valueOf(strE));
            }
        } else if (eteeVarF2 != null && i2 == etekVar.a(etdnVarN)) {
            etdx etdxVarE = etekVar.e(eteeVarF2.v, strK2);
            if (etdxVarE == null) {
                return strE;
            }
            etdw etdwVar = (etdw) etdx.a.createBuilder();
            etdwVar.mergeFrom((etdw) etdxVarE);
            etdwVar.copyOnWrite();
            etdx etdxVar = (etdx) etdwVar.instance;
            etdxVar.b |= 1;
            etdxVar.c = "(\\d+)(.*)";
            etdwVar.copyOnWrite();
            etdx etdxVar2 = (etdx) etdwVar.instance;
            etdxVar2.b |= 2;
            etdxVar2.d = "$1$2";
            return etekVar.B(strE, (etdx) etdwVar.build(), 3);
        }
        if (eteeVarF2 != null) {
            str3 = eteeVarF2.p;
            if (!etek.c.matcher(str3).matches()) {
                str3 = eteeVarF2.q;
            }
        }
        StringBuilder sb2 = new StringBuilder(strE);
        etee eteeVarG2 = etekVar.g(i2, etekVar.c(i2));
        etekVar.l(sb2);
        etekVar.z(etfpVar, eteeVarG2, 2, sb2);
        if (str3.length() > 0) {
            sb2.insert(0, " ").insert(0, i2).insert(0, " ").insert(0, str3);
        } else {
            if (!etekVar.r(etdnVarN)) {
                etek.a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "formatOutOfCountryKeepingAlphaChars", a.I(etdnVarN, "Trying to format number from invalid region ", ". International formatting applied."));
            }
            etekVar.A(i2, 2, sb2);
        }
        return sb2.toString();
    }

    @Override // defpackage.ephi
    public final String d(ephf ephfVar) {
        return ((epho) this.a).a.k(((ephn) ephfVar).a);
    }

    @Override // defpackage.ephi
    public final String e(int i) {
        return ((epho) this.a).a.c(i).eW;
    }

    @Override // defpackage.ephi
    public final String f(ephf ephfVar) {
        etdn etdnVarD = ((epho) this.a).a.d(((ephn) ephfVar).a);
        if (etdnVarD == null) {
            return null;
        }
        return etdnVarD.eW;
    }

    @Override // defpackage.ephi
    public final boolean g(ephf ephfVar) {
        return this.a.g(ephfVar);
    }

    @Override // defpackage.ephi
    public final boolean h(String str, String str2) {
        etek etekVar = ((epho) this.a).a;
        try {
            return etekVar.q(etekVar.i(str, epho.n(str2)));
        } catch (etdy unused) {
            return false;
        }
    }

    @Override // defpackage.ephi
    public final boolean i(ephf ephfVar) {
        etfp etfpVar = ((ephn) ephfVar).a;
        Integer numValueOf = Integer.valueOf(etfpVar.c);
        etel etelVar = ((epho) this.a).b;
        List<etdn> list = (List) etelVar.c.get(numValueOf);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        StringBuilder sb = new StringBuilder();
        if (etfpVar.f) {
            char[] cArr = new char[etfpVar.g];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(etfpVar.d);
        int length = sb.toString().length();
        for (etdn etdnVar : list) {
            etee eteeVarB = null;
            if (etdnVar != null) {
                try {
                    etfk etfkVar = etelVar.b;
                    ejwl.a(eteo.a(etdnVar));
                    eteeVarB = ((etff) ((etfl) etfkVar).a.a(((etfl) etfkVar).b.a(etdnVar))).b(etdnVar);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (eteeVarB != null) {
                etei eteiVar = eteeVarB.c;
                if (eteiVar == null) {
                    eteiVar = etei.a;
                }
                if (eteiVar.d.contains(Integer.valueOf(length))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ephi
    public final boolean j(ephf ephfVar) {
        return this.a.j(ephfVar);
    }

    @Override // defpackage.ephi
    public final int k(ephf ephfVar, ephf ephfVar2) {
        return epho.o(((epho) this.a).a.t(((ephn) ephfVar).a, ((ephn) ephfVar2).a));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    @Override // defpackage.ephi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            ephi r0 = r8.a
            epho r0 = (defpackage.epho) r0
            etek r1 = r0.a
            etdn r0 = defpackage.etdn.ZZ     // Catch: defpackage.etdy -> L11
            etfp r0 = r1.i(r9, r0)     // Catch: defpackage.etdy -> L11
            int r9 = r1.u(r0, r10)     // Catch: defpackage.etdy -> L11
            goto L58
        L11:
            r0 = move-exception
            int r0 = r0.a
            r7 = 1
            if (r0 != r7) goto L57
            etdn r0 = defpackage.etdn.ZZ     // Catch: defpackage.etdy -> L22
            etfp r0 = r1.i(r10, r0)     // Catch: defpackage.etdy -> L22
            int r9 = r1.u(r0, r9)     // Catch: defpackage.etdy -> L22
            goto L58
        L22:
            r0 = move-exception
            int r0 = r0.a
            if (r0 != r7) goto L57
            etfp r0 = defpackage.etfp.a     // Catch: defpackage.etdy -> L57
            evsf r2 = r0.createBuilder()     // Catch: defpackage.etdy -> L57
            r6 = r2
            etfm r6 = (defpackage.etfm) r6     // Catch: defpackage.etdy -> L57
            evsf r0 = r0.createBuilder()     // Catch: defpackage.etdy -> L57
            etfm r0 = (defpackage.etfm) r0     // Catch: defpackage.etdy -> L57
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r9
            r1.m(r2, r3, r4, r5, r6)     // Catch: defpackage.etdy -> L57
            r9 = r6
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r10
            r6 = r0
            r1.m(r2, r3, r4, r5, r6)     // Catch: defpackage.etdy -> L57
            evsn r9 = r9.build()     // Catch: defpackage.etdy -> L57
            etfp r9 = (defpackage.etfp) r9     // Catch: defpackage.etdy -> L57
            evsn r10 = r6.build()     // Catch: defpackage.etdy -> L57
            etfp r10 = (defpackage.etfp) r10     // Catch: defpackage.etdy -> L57
            int r9 = r1.t(r9, r10)     // Catch: defpackage.etdy -> L57
            goto L58
        L57:
            r9 = r7
        L58:
            int r9 = defpackage.epho.o(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ephk.l(java.lang.String, java.lang.String):int");
    }

    @Override // defpackage.ephi
    public final int m(ephf ephfVar) {
        int iW = ((epho) this.a).a.w(((ephn) ephfVar).a) - 1;
        if (iW == 0) {
            return 1;
        }
        if (iW == 1) {
            return 2;
        }
        if (iW == 2) {
            return 3;
        }
        if (iW != 3) {
            return iW != 4 ? 6 : 5;
        }
        return 4;
    }

    @Override // defpackage.ephj
    public final ephf n(CharSequence charSequence, String str) throws ephm {
        String strConcat = charSequence;
        strConcat = charSequence;
        if (str != null && charSequence != null) {
            ephz ephzVar = this.c;
            strConcat = charSequence;
            if (ephzVar.a.contains(ejuf.d(str))) {
                String string = charSequence.toString();
                boolean zStartsWith = string.startsWith("011");
                strConcat = string;
                if (zStartsWith) {
                    int length = string.length();
                    strConcat = string;
                    if (length >= 8) {
                        strConcat = "+".concat(String.valueOf(string.substring(3)));
                    }
                }
            }
        }
        try {
            etek etekVar = ((epho) this.a).a;
            etdz etdzVarC = etea.c();
            etdzVarC.b(true);
            ((etdp) etdzVarC).a = epho.n(str);
            return new ephn(etekVar.j(strConcat, etdzVarC.a()));
        } catch (etdy e) {
            throw new ephm(e);
        }
    }

    @Override // defpackage.ephj
    public final String o(ephf ephfVar, ephg ephgVar) {
        return this.a.b(ephfVar, ephgVar);
    }

    @Override // defpackage.ephj
    public final /* synthetic */ void p() {
    }
}
