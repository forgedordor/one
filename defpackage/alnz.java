package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alnz implements alfq {
    public final eygg a;
    public final eygg b;
    public final eygg c;
    public final eygg d;
    public final eygg e;
    private final eygg f;
    private final eygg g;

    public alnz(eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5, eygg eyggVar6, eygg eyggVar7) {
        this.a = eyggVar;
        this.b = eyggVar2;
        this.c = eyggVar3;
        this.d = eyggVar4;
        this.f = eyggVar5;
        this.g = eyggVar6;
        this.e = eyggVar7;
    }

    private final alqm C(final alqm alqmVar, final String str, final boolean z) {
        alqk alqkVarA = ((alql) this.g.b()).a(alqmVar, new ejxr() { // from class: almn
            @Override // defpackage.ejxr
            public final Object get() {
                String strB = cssr.b(ejwk.b(alqmVar.n()));
                if (alwh.i(strB)) {
                    return strB;
                }
                if (!z && alwh.k(strB)) {
                    return strB;
                }
                String str2 = str;
                alnz alnzVar = this.a;
                return ((crmx) alnzVar.b.b()).v(((alwh) alnzVar.a.b()).e(strB), str2);
            }
        });
        alqkVarA.H();
        return alqkVarA;
    }

    private final ejxr D(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: almy
            @Override // defpackage.ejxr
            public final Object get() {
                String str = (String) ejxrVar2.get();
                if (str == null) {
                    return "";
                }
                ejxr ejxrVar5 = ejxrVar;
                switch (((alnx) ejxrVar5.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ejxr ejxrVar6 = ejxrVar3;
                        alnz alnzVar = this.a;
                        alny alnyVar = (alny) ejxrVar6.get();
                        if (alnyVar == null) {
                            alnzVar.z();
                            return str;
                        }
                        String strM = ((crmx) alnzVar.b.b()).m(alnyVar.a(), ephg.E164);
                        alnzVar.z();
                        return strM;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar5.get()).name())));
                }
            }
        });
    }

    static final String t(String str, String str2) {
        return u(str) ? str2 : str;
    }

    public static boolean u(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public static boolean x(ephf ephfVar) {
        return ephfVar.f() && ephfVar.g() != 5 && ephfVar.c().startsWith("+");
    }

    public final void A() {
        ((alpc) this.e.b()).q();
    }

    public final alny B(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            eygg eyggVar = this.b;
            ephf ephfVarE = ((crmx) eyggVar.b()).e(str, str2);
            int iN = ((crmx) eyggVar.b()).N(ephfVarE);
            A();
            return new alfp(ephfVarE, iN, str2);
        } catch (ephe unused) {
            return null;
        }
    }

    @Override // defpackage.alfq
    public final alqm a(final String str) {
        return ((alql) this.g.b()).c(new ejxr() { // from class: alnc
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, new ejxr() { // from class: alne
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, new ejxr() { // from class: alnf
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(str);
            }
        }, new ejxr() { // from class: alng
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, new ejxr() { // from class: alnh
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, ejxx.a(new ejxr() { // from class: alni
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((asqx) this.a.d.b()).b(str));
            }
        }), new ejxr() { // from class: alnj
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj(str);
            }
        }, new ejxr() { // from class: alnk
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.BOT;
            }
        }, new almo(), new almo());
    }

    @Override // defpackage.alfq
    public final alqm b(aubq aubqVar) {
        aubp aubpVar = aubp.BOT;
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVar.equals(aubpVarB) ? a(aubqVar.d) : c(aubqVar.d, new almo());
    }

    @Override // defpackage.alfq
    public final alqm c(final String str, ejxr ejxrVar) {
        final ejxr ejxrVar2 = new ejxr() { // from class: allz
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alwh) this.a.a.b()).e(str);
            }
        };
        final ejxr ejxrVarM = m(new ejxr() { // from class: almj
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, false);
        final ejxr ejxrVarS = s(new ejxr() { // from class: almu
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, ejxrVar, ejxrVarM);
        z();
        ejxr ejxrVarN = n(ejxrVarM, ejxrVarS);
        ejxr ejxrVarR = r(ejxrVarN, ejxrVarS);
        ejxr ejxrVarD = D(ejxrVarM, new ejxr() { // from class: alnd
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, ejxrVarS, ejxrVarN);
        ejxr ejxrVarL = l(ejxrVarM, new ejxr() { // from class: alno
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, ejxrVarS);
        alql alqlVar = (alql) this.g.b();
        final almm almmVar = new almm(str);
        return alqlVar.c(ejxx.a(new ejxr() { // from class: alnq
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = ((almm) almmVar).a;
                if (str2 == null) {
                    return "";
                }
                ejxr ejxrVar3 = ejxrVarM;
                switch (((alnx) ejxrVar3.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str2;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ejxr ejxrVar4 = ejxrVar2;
                        ejxr ejxrVar5 = ejxrVarS;
                        alnz alnzVar = this.a;
                        alny alnyVar = (alny) ejxrVar5.get();
                        if (alnyVar == null) {
                            return (String) ((alwh) alnzVar.a.b()).b((String) ejxrVar4.get()).orElse(str2);
                        }
                        if (alnz.x(alnyVar.a())) {
                            return (alnyVar.c() == 2 || alnyVar.c() == 4) ? ((crmx) alnzVar.b.b()).u(alnyVar.a()) : ejxrVar3.get() == alnx.E164_LIKE ? ((ephj) alnzVar.c.b()).b(alnyVar.a(), ephg.E164) : (String) ((alwh) alnzVar.a.b()).b((String) ejxrVar4.get()).orElse(ejxrVar4.get());
                        }
                        if (!((Boolean) dfog.o().a.as.a()).booleanValue()) {
                            return ejxrVar4.get();
                        }
                        return ((Pattern) alwh.a.get()).matcher(alwh.d(str2)).replaceAll("");
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar3.get()).name())));
                }
            }
        }), new ejxr() { // from class: alns
            @Override // defpackage.ejxr
            public final Object get() {
                return str;
            }
        }, o(ejxrVarM, str, ejxrVarS, ejxrVarD), p(ejxrVarM, str, ejxrVar2, ejxrVarS), ejxrVarD, q(ejxrVarM, str, ejxrVarS, ejxrVarD), ejxx.a(new ejxr() { // from class: almx
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVarM;
                alnx alnxVar = (alnx) ejxrVar3.get();
                String str2 = str;
                if (alnxVar == alnx.BOT || alnxVar == alnx.PENPAL_BOT || alnxVar == alnx.EMAIL || alnxVar == alnx.UNKNOWN_SENDER || alnxVar == alnx.WAP_PUSH_SI || alnxVar == alnx.INVALID || alnxVar == alnx.SATELLITE_ESP) {
                    return new alqj(str2);
                }
                ejxr ejxrVar4 = ejxrVarS;
                alnz alnzVar = this.a;
                alny alnyVar = (alny) ejxrVar4.get();
                if (alnyVar == null) {
                    return alnzVar.y(str2);
                }
                eygg eyggVar = alnzVar.b;
                crmx crmxVar = (crmx) eyggVar.b();
                String strR = ((crmx) eyggVar.b()).r();
                if (alnxVar == alnx.ALPHA_CODE_OR_PHONEWORD) {
                    alnzVar.A();
                    if (alnyVar.c() == 1 || alnyVar.c() == 2) {
                        return new alqj(((ephj) crmxVar.c.b()).c(alnyVar.a(), strR));
                    }
                    return alnzVar.y(str2);
                }
                if (alnzVar.w(alnyVar)) {
                    return alnzVar.y(crmxVar.m(alnyVar.a(), ephg.NATIONAL));
                }
                if (alnxVar != alnx.E164_LIKE && alnxVar != alnx.NATIONAL_OR_LOCAL) {
                    alnzVar.A();
                    throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar3.get()).name())));
                }
                if (alnyVar.c() != 1 && alnyVar.c() != 2 && !alnzVar.v(alnyVar)) {
                    return alnzVar.y((String) ejxrVar2.get());
                }
                crnc crncVar = new crnc(alnyVar.a().a());
                crnc crncVarC = crmxVar.c(strR);
                return alnzVar.y(crmxVar.m(alnyVar.a(), (crncVarC.b() || !crncVar.equals(crncVarC)) ? ephg.INTERNATIONAL : ephg.NATIONAL));
            }
        }), ejxrVarL, ejxrVarN, ejxrVarR);
    }

    @Override // defpackage.alfq
    public final alqm d(dggk dggkVar) {
        return c(dggkVar.a, new almo());
    }

    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, final String str4, final ejxr ejxrVar) {
        final String strE;
        String str5;
        String strT = t(str, str2);
        if (((Boolean) alvx.c.e()).booleanValue()) {
            str3.getClass();
            strT.getClass();
            str4.getClass();
        }
        if (u(strT)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            strE = str5;
        } else {
            strE = ((alwh) this.a.b()).e(strT);
            str5 = str3;
        }
        final alqj alqjVar = (!u(str5) || strE.equals("ʼUNKNOWN_SENDER!ʼ")) ? new alqj(ejwk.b(str5)) : new alqj(((crmx) this.b.b()).p(strE));
        ejxr ejxrVarM = m(new ejxr() { // from class: almk
            @Override // defpackage.ejxr
            public final Object get() {
                return strE;
            }
        }, z);
        final String str6 = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: alnt
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !alnz.u((String) obj);
            }
        }).orElse("ʼUNKNOWN_SENDER!ʼ");
        ejxr ejxrVarM2 = m(new ejxr() { // from class: alma
            @Override // defpackage.ejxr
            public final Object get() {
                return str6;
            }
        }, z);
        ejxr ejxrVarS = s(new ejxr() { // from class: almb
            @Override // defpackage.ejxr
            public final Object get() {
                return str6;
            }
        }, new ejxr() { // from class: almc
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of((String) ejxrVar.get());
            }
        }, ejxrVarM2);
        z();
        ejxr ejxrVarN = n(ejxrVarM2, ejxrVarS);
        ejxr ejxrVarR = r(ejxrVarN, ejxrVarS);
        ejxr ejxrVarD = D(ejxrVarM2, new ejxr() { // from class: almw
            @Override // defpackage.ejxr
            public final Object get() {
                return str6;
            }
        }, ejxrVarS, ejxrVarN);
        ejxr ejxrVarO = o(ejxrVarM2, str6, ejxrVarS, ejxrVarD);
        ejxr ejxrVarP = p(ejxrVarM2, str6, new ejxr() { // from class: almd
            @Override // defpackage.ejxr
            public final Object get() {
                return str6;
            }
        }, ejxrVarS);
        ejxr ejxrVarS2 = s(new ejxr() { // from class: alme
            @Override // defpackage.ejxr
            public final Object get() {
                return strE;
            }
        }, new ejxr() { // from class: almf
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of((String) ejxrVar.get());
            }
        }, ejxrVarM);
        alql alqlVar = (alql) this.g.b();
        ejxr ejxrVar2 = ejxrVarP;
        ejxr ejxrVar3 = new ejxr() { // from class: almg
            @Override // defpackage.ejxr
            public final Object get() {
                return strE;
            }
        };
        ejxr ejxrVar4 = new ejxr() { // from class: almh
            @Override // defpackage.ejxr
            public final Object get() {
                return str4;
            }
        };
        if (((Boolean) new alun().get()).booleanValue()) {
            ejxrVar2 = new ejxr() { // from class: alnu
                @Override // defpackage.ejxr
                public final Object get() {
                    return str6;
                }
            };
        }
        return alqlVar.c(ejxrVar3, ejxrVar4, ejxrVarO, ejxrVar2, ejxrVarD, q(ejxrVarM2, str6, ejxrVarS, ejxrVarD), new ejxr() { // from class: alnv
            @Override // defpackage.ejxr
            public final Object get() {
                return alqjVar;
            }
        }, l(ejxrVarM, new ejxr() { // from class: alnw
            @Override // defpackage.ejxr
            public final Object get() {
                return strE;
            }
        }, ejxrVarS2), ejxrVarN, ejxrVarR);
    }

    @Override // defpackage.alfq
    public final alqm f() {
        return ((alql) this.g.b()).c(new ejxr() { // from class: almp
            @Override // defpackage.ejxr
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: almq
            @Override // defpackage.ejxr
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new almo(), new ejxr() { // from class: almr
            @Override // defpackage.ejxr
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: alms
            @Override // defpackage.ejxr
            public final Object get() {
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new almo(), new ejxr() { // from class: almt
            @Override // defpackage.ejxr
            public final Object get() {
                return new alqj("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new ejxr() { // from class: almv
            @Override // defpackage.ejxr
            public final Object get() {
                return alwk.UNKNOWN_SENDER;
            }
        }, new almo(), new almo());
    }

    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return ((alql) this.g.b()).a(alqmVar, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm h(alqm alqmVar, String str) {
        return ((alql) this.g.b()).b(alqmVar, str);
    }

    @Override // defpackage.alfq
    public final alqm i(final alqm alqmVar, boolean z) {
        return z ? ((alql) this.g.b()).a(alqmVar, new ejxr() { // from class: alml
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.b.b()).p(alqmVar.n());
            }
        }) : alqmVar;
    }

    @Override // defpackage.alfq
    public final alqm j(alqm alqmVar, int i) {
        return C(alqmVar, ((crnb) this.f.b()).c(i), false);
    }

    @Override // defpackage.alfq
    public final alqm k(alqm alqmVar) {
        return C(alqmVar, ((crmx) this.b.b()).r(), true);
    }

    final ejxr l(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: almi
            @Override // defpackage.ejxr
            public final Object get() {
                String str = (String) ejxrVar2.get();
                if (str == null) {
                    return alwk.UNKNOWN_SENDER;
                }
                alnz alnzVar = this.a;
                eygg eyggVar = alnzVar.b;
                if (((crmx) eyggVar.b()).H(str)) {
                    return alwk.PHONE_EMERGENCY;
                }
                ejxr ejxrVar4 = ejxrVar;
                switch (((alnx) ejxrVar4.get()).ordinal()) {
                    case 0:
                        return alwk.BOT;
                    case 1:
                        return alwk.PENPAL_BOT;
                    case 2:
                        return alwk.EMAIL;
                    case 3:
                        return alwk.UNKNOWN_SENDER;
                    case 4:
                    case 9:
                        return alwk.UNKNOWN_DESTINATION_TYPE;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        alny alnyVar = (alny) ejxrVar3.get();
                        if (alnyVar == null) {
                            alnzVar.A();
                            return alwk.UNKNOWN_DESTINATION_TYPE;
                        }
                        boolean zX = alnz.x(alnyVar.a());
                        if (alnzVar.w(alnyVar)) {
                            return zX ? alwk.PHONE_SHORT_WITH_COUNTRY : alwk.PHONE_SHORT_NO_COUNTRY;
                        }
                        int iC = alnyVar.c();
                        if (iC == 1) {
                            if (!((alpc) alnzVar.e.b()).i()) {
                                return zX ? alwk.PHONE_E164 : alwk.PHONE_NATIONAL;
                            }
                            int iG = alnyVar.a().g() - 1;
                            return iG != 1 ? iG != 2 ? iG != 3 ? alwk.PHONE_NATIONAL : alwk.PHONE_WITH_COUNTRY : alwk.PHONE_WITH_IDD : ((crmx) eyggVar.b()).M(str) ? alwk.PHONE_E164 : alwk.PHONE_WITH_PLUS;
                        }
                        if (iC == 2) {
                            return zX ? alwk.PHONE_LOCAL_WITH_COUNTRY : alwk.PHONE_LOCAL_NO_COUNTRY;
                        }
                        if (!((alpc) alnzVar.e.b()).i()) {
                            return alwk.UNKNOWN_DESTINATION_TYPE;
                        }
                        int i = iC - 1;
                        return i != 3 ? i != 4 ? i != 5 ? alwk.PHONE_INVALID_COUNTRY_CODE : alwk.PHONE_INVALID_TOO_LONG : alwk.PHONE_INVALID_LENGTH : alwk.PHONE_INVALID_TOO_SHORT;
                    case 10:
                        return alwk.SATELLITE_ESP;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar4.get()).name())));
                }
            }
        });
    }

    final ejxr m(final ejxr ejxrVar, final boolean z) {
        return ejxx.a(new ejxr() { // from class: alnb
            @Override // defpackage.ejxr
            public final Object get() {
                if (z) {
                    return alnx.BOT;
                }
                String str = (String) ejxrVar.get();
                if (str == null) {
                    return alnx.UNKNOWN_SENDER;
                }
                if (((Boolean) crbf.br.e()).booleanValue() && (alpd.a(str) || alpd.b(str))) {
                    return alnx.SATELLITE_ESP;
                }
                alnz alnzVar = this.a;
                if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((alwh) alnzVar.a.b()).j(str)) {
                    return alnx.PENPAL_BOT;
                }
                if (alwh.i(str)) {
                    return alnx.EMAIL;
                }
                if (str.equals("ʼWAP_PUSH_SI!ʼ")) {
                    return alnx.WAP_PUSH_SI;
                }
                if (str.equals("ʼUNKNOWN_SENDER!ʼ") || str.isEmpty()) {
                    return alnx.UNKNOWN_SENDER;
                }
                eygg eyggVar = alnzVar.a;
                String strReplace = str.replace("\\s+|-", "");
                if (!TextUtils.isEmpty(strReplace)) {
                    for (int i = 0; i < strReplace.length(); i++) {
                        if (Character.isAlphabetic(Character.codePointAt(strReplace, i))) {
                            return alnx.ALPHA_CODE_OR_PHONEWORD;
                        }
                    }
                }
                if (!str.isEmpty() && str.charAt(0) == '+') {
                    for (int i2 = 1; i2 < str.length(); i2++) {
                        if (Character.isDigit(str.charAt(i2))) {
                        }
                    }
                    return alnx.E164_LIKE;
                }
                return ((alwh) eyggVar.b()).l(str) ? alnx.NATIONAL_OR_LOCAL : alnx.INVALID;
            }
        });
    }

    final ejxr n(final ejxr ejxrVar, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: alna
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVar;
                switch (((alnx) ejxrVar3.get()).ordinal()) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        alny alnyVar = (alny) ejxrVar2.get();
                        if (alnyVar == null) {
                            return Optional.empty();
                        }
                        alnz alnzVar = this.a;
                        ephf ephfVarA = alnyVar.a();
                        return alnzVar.w(alnyVar) ? alnz.x(ephfVarA) ? Optional.of(new crnc(ephfVarA.a())) : Optional.empty() : ephfVarA.e() ? Optional.of(new crnc(ephfVarA.a())) : Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar3.get()).name())));
                }
            }
        });
    }

    final ejxr o(final ejxr ejxrVar, final String str, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alnl
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = str;
                if (str2 == null) {
                    return Optional.empty();
                }
                ejxr ejxrVar4 = ejxrVar;
                switch (((alnx) ejxrVar4.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 10:
                        return Optional.of(str2);
                    case 3:
                    case 4:
                    case 9:
                        return Optional.empty();
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        alny alnyVar = (alny) ejxrVar2.get();
                        return alnyVar == null ? Optional.empty() : alnyVar.c() == 1 ? Optional.of((String) ejxrVar3.get()) : ((crmx) this.a.b.b()).H(str2) ? Optional.of(str2) : Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar4.get()).name())));
                }
            }
        });
    }

    final ejxr p(final ejxr ejxrVar, final String str, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alnr
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = str;
                if (str2 == null) {
                    return "";
                }
                ejxr ejxrVar4 = ejxrVar;
                switch (((alnx) ejxrVar4.get()).ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return str2;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        ejxr ejxrVar5 = ejxrVar2;
                        alny alnyVar = (alny) ejxrVar3.get();
                        if (alnyVar == null) {
                            return (String) ejxrVar5.get();
                        }
                        alnz alnzVar = this.a;
                        return alnyVar.c() == 1 ? ((crmx) alnzVar.b.b()).m(alnyVar.a(), ephg.E164) : ejxrVar4.get() == alnx.ALPHA_CODE_OR_PHONEWORD ? (String) ejxrVar5.get() : alnyVar.c() == 2 ? ((crmx) alnzVar.b.b()).u(alnyVar.a()) : alnzVar.v(alnyVar) ? ((crmx) alnzVar.b.b()).u(alnyVar.a()) : (String) ejxrVar5.get();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar4.get()).name())));
                }
            }
        });
    }

    final ejxr q(final ejxr ejxrVar, final String str, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alnn
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = str;
                ejxr ejxrVar4 = ejxrVar3;
                if (str2 == null) {
                    return Optional.empty();
                }
                ejxr ejxrVar5 = ejxrVar;
                alnz alnzVar = this.a;
                switch (((alnx) ejxrVar5.get()).ordinal()) {
                    case 0:
                        return Optional.of(((asqx) alnzVar.d.b()).b(str2));
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (((alny) ejxrVar2.get()) == null) {
                            return Optional.empty();
                        }
                        try {
                            return Optional.of(((asqx) alnzVar.d.b()).a((String) ejxrVar4.get(), false));
                        } catch (asrb unused) {
                            return Optional.empty();
                        }
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        return Optional.empty();
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar5.get()).name())));
                }
            }
        });
    }

    final ejxr r(final ejxr ejxrVar, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: alnp
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVar;
                if (((Optional) ejxrVar3.get()).isEmpty()) {
                    return Optional.empty();
                }
                alny alnyVar = (alny) ejxrVar2.get();
                if (alnyVar == null) {
                    return Optional.empty();
                }
                alnz alnzVar = this.a;
                ephf ephfVarA = alnyVar.a();
                eygg eyggVar = alnzVar.c;
                String strF = ((ephj) eyggVar.b()).f(ephfVarA);
                if (ejwk.c(strF)) {
                    strF = ((ephj) eyggVar.b()).e(((crnc) ((Optional) ejxrVar3.get()).get()).a);
                }
                return ejwk.c(strF) ? Optional.empty() : Optional.of(strF);
            }
        });
    }

    final ejxr s(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: almz
            @Override // defpackage.ejxr
            public final Object get() {
                final ejxr ejxrVar4 = ejxrVar3;
                int iOrdinal = ((alnx) ejxrVar4.get()).ordinal();
                final alnz alnzVar = this.a;
                final ejxr ejxrVar5 = ejxrVar;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                        throw new IllegalStateException("Parse not supported for destination format: ".concat(String.valueOf(((alnx) ejxrVar4.get()).toString())));
                    case 1:
                    case 5:
                    case 6:
                        String str = (String) ejxrVar5.get();
                        alny alnyVarB = alnzVar.B(str, null);
                        if (alnyVarB != null) {
                            alfp alfpVar = (alfp) alnyVarB;
                            if (alnz.x(alfpVar.a) || alfpVar.b == 1) {
                                return alnyVarB;
                            }
                        }
                        break;
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError("Unknown destination format: ".concat(String.valueOf(((alnx) ejxrVar4.get()).name())));
                }
                alny alnyVar = (alny) ((Optional) ejxrVar2.get()).map(new Function() { // from class: alnm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str2 = (String) ejxrVar5.get();
                        return alnzVar.B(str2, (String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
                if (alnyVar == null || alnyVar.c() != 1) {
                    String str2 = (String) ejxrVar5.get();
                    alny alnyVarB2 = alnzVar.B(str2, ((crmx) alnzVar.b.b()).r());
                    if ((alnyVarB2 != null && ((alfp) alnyVarB2).b == 1) || ((alnyVar == null || alnyVar.c() != 2) && ((alnyVarB2 != null && ((alfp) alnyVarB2).b == 2) || alnyVar == null))) {
                        return alnyVarB2;
                    }
                }
                return alnyVar;
            }
        });
    }

    public final boolean v(alny alnyVar) {
        A();
        return ((crmx) this.b.b()).J(alnyVar.a());
    }

    public final boolean w(alny alnyVar) {
        A();
        return v(alnyVar) && alnyVar.c() == 4;
    }

    public final alqj y(String str) {
        z();
        return new alqj(str);
    }

    public final void z() {
        ((alpc) this.e.b()).p();
    }
}
