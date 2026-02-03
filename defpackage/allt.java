package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class allt implements alfq {
    public static final cczv a = cdag.h(cdag.b, "enable_error_for_unknown_destination_format", false);
    static final cczv b = cdag.h(cdag.b, "mi_normalizing_eagerly_calculates", false);
    static final cczv c = cdag.h(cdag.b, "legacy_uses_supplier", false);
    public static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3");
    static final alls e = new alfo("US", Optional.empty());
    public final eygg f;
    public final eygg g;
    public final eygg h;
    public final eygg i;
    public final eygg j;
    public final eygg k;
    private final eygg l;

    public allt(eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5, eygg eyggVar6, eygg eyggVar7) {
        this.f = eyggVar;
        this.g = eyggVar2;
        this.h = eyggVar3;
        this.i = eyggVar4;
        this.l = eyggVar5;
        this.j = eyggVar6;
        this.k = eyggVar7;
    }

    private final ejxr A(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alkl
            @Override // defpackage.ejxr
            public final Object get() {
                String str;
                ejxr ejxrVar5 = ejxrVar;
                int iOrdinal = ((allr) ejxrVar5.get()).a().ordinal();
                ejxr ejxrVar6 = ejxrVar2;
                switch (iOrdinal) {
                    case 0:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 13:
                    case 14:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return Optional.empty();
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                    case 11:
                    case 12:
                        return Optional.of((String) ejxrVar6.get());
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        allt alltVar = this.a;
                        if (((alpc) alltVar.k.b()).h()) {
                            str = (String) ejxrVar3.get();
                        } else {
                            str = (String) alltVar.n((String) ejxrVar6.get(), (String) ejxrVar4.get(), false).get();
                        }
                        return Optional.of(str);
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((allr) ejxrVar5.get()).a().name())));
                }
            }
        });
    }

    private static boolean B(ephf ephfVar) {
        return ephfVar.g() == 2 || ephfVar.g() == 3 || ephfVar.g() == 4;
    }

    private static alwk C(int i) {
        int i2 = i - 1;
        return i2 != 3 ? i2 != 4 ? i2 != 5 ? alwk.PHONE_INVALID_COUNTRY_CODE : alwk.PHONE_INVALID_TOO_LONG : alwk.PHONE_INVALID_LENGTH : alwk.PHONE_INVALID_TOO_SHORT;
    }

    public static String v(String str, Optional optional, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        if (optional.isEmpty()) {
            return sb.toString();
        }
        if (!str.startsWith("+")) {
            sb.insert(0, "+");
        }
        if (!z) {
            sb.insert(1, ((crnc) optional.get()).toString());
        }
        sb.insert(((crnc) optional.get()).toString().length() + 1, " ");
        return sb.toString();
    }

    public static boolean w(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    public static boolean x(allr allrVar) {
        int i;
        if (allrVar == null || (i = ((alfn) allrVar).b) == 0) {
            return false;
        }
        return i == 1 || i == 2;
    }

    private final alwk y(String str, ephf ephfVar) {
        if (((alpc) this.k.b()).i()) {
            int iG = ephfVar.g() - 1;
            if (iG == 1) {
                return (str == null || !((crmx) this.h.b()).M(str)) ? alwk.PHONE_WITH_PLUS : alwk.PHONE_E164;
            }
            if (iG == 2) {
                return alwk.PHONE_WITH_IDD;
            }
            if (iG == 3) {
                return alwk.PHONE_WITH_COUNTRY;
            }
            if (iG != 4) {
                return alwk.UNKNOWN_DIALABLE;
            }
        }
        return alwk.PHONE_NATIONAL;
    }

    private final ejxr z(final ejxr ejxrVar, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: aljv
            @Override // defpackage.ejxr
            public final Object get() {
                allr allrVar = (allr) ejxrVar.get();
                int iOrdinal = allrVar.a().ordinal();
                allt alltVar = this.a;
                ejxr ejxrVar3 = ejxrVar2;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 11:
                    case 12:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return new alqj((String) ejxrVar3.get());
                    case 1:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 13:
                    case 14:
                        if (((alpc) alltVar.k.b()).c()) {
                            crmx crmxVar = (crmx) alltVar.h.b();
                            ephf ephfVarE = allrVar.e();
                            ephfVarE.getClass();
                            return new alqj(crmxVar.m(ephfVarE, ephg.NATIONAL));
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(allrVar.a().name())));
                }
                if (!((alpc) alltVar.k.b()).c()) {
                    return new alqj(((crmx) alltVar.h.b()).p((String) ejxrVar3.get()));
                }
                final crnf crnfVar = ((crnb) alltVar.i.b()).a;
                crnfVar.getClass();
                String strA = crnb.a("home", new ejxr() { // from class: crmz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return crnfVar.b();
                    }
                });
                ephg ephgVar = (allt.w(strA) || !strA.equals(allrVar.j().b())) ? ephg.INTERNATIONAL : ephg.NATIONAL;
                crmx crmxVar2 = (crmx) alltVar.h.b();
                ephf ephfVarE2 = allrVar.e();
                ephfVarE2.getClass();
                return new alqj(crmxVar2.m(ephfVarE2, ephgVar));
            }
        });
    }

    @Override // defpackage.alfq
    public final alqm a(final String str) {
        return ((alql) this.l.b()).c(new ejxr() { // from class: alka
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str;
            }
        }, new ejxr() { // from class: alkb
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str;
            }
        }, new ejxr() { // from class: alkd
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return Optional.of(str);
            }
        }, new ejxr() { // from class: alke
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str;
            }
        }, new ejxr() { // from class: alkf
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str;
            }
        }, ejxx.a(new ejxr() { // from class: alkg
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((asqx) this.a.g.b()).a(str, false));
            }
        }), new ejxr() { // from class: alkh
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return new alqj(str);
            }
        }, new ejxr() { // from class: alki
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return alwk.BOT;
            }
        }, new alkj(), new alkj());
    }

    @Override // defpackage.alfq
    public final alqm b(final aubq aubqVar) {
        ejxr ejxrVarR;
        allt alltVar;
        ejxr ejxrVarO;
        ejxr ejxrVar;
        String str = aubqVar.d;
        ejxr ejxrVar2 = new ejxr() { // from class: alio
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return aubqVar.d;
            }
        };
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: alip
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.h.b()).r();
            }
        });
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        final ejxr ejxrVarP = p(str, ejxrVar2, aubpVarB == aubp.BOT, ejxrVarA);
        ejxr ejxrVarS = s(ejxrVarP, ejxrVar2, ejxrVarA, ejxrVar2);
        final ejxr ejxrVarT = t(ejxrVarS);
        eygg eyggVar = this.k;
        ejxr ejxrVarA2 = ((alpc) eyggVar.b()).g() ? new ejxr() { // from class: aliq
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP.get()).j().b();
            }
        } : ejxx.a(new ejxr() { // from class: alir
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                Optional optional = (Optional) ejxrVarT.get();
                ejxr ejxrVar3 = ejxrVarA;
                ejxrVar3.getClass();
                return (String) optional.orElseGet(new aljx(ejxrVar3));
            }
        });
        if (((alpc) eyggVar.b()).n()) {
            ejxr ejxrVarO2 = o(ejxrVarP, ejxrVarA2, ejxrVar2, ejxrVar2);
            ejxrVarR = r(ejxrVarP, ejxrVar2, ejxrVarO2, ejxrVarA2, ejxrVarS);
            alltVar = this;
            ejxrVar = ejxrVarA2;
            ejxrVarO = ejxrVarO2;
        } else {
            ejxrVarR = r(ejxrVarP, ejxrVar2, ejxrVar2, ejxrVarA2, ejxrVarS);
            alltVar = this;
            ejxrVarO = o(ejxrVarP, ejxrVarA2, ejxrVar2, ejxrVarR);
            ejxrVar = ejxrVarA2;
        }
        return ((alql) alltVar.l.b()).c(ejxrVar2, ejxrVar2, A(ejxrVarP, ejxrVar2, ejxrVarO, ejxrVar), ejxrVarO, ejxrVarR, q(ejxrVarP, ejxrVar2, ejxrVar), z(ejxrVarP, true != ((alpc) eyggVar.b()).g() ? ejxrVar2 : ejxrVarO), new ejxr() { // from class: alis
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP.get()).a();
            }
        }, ejxrVarS, ejxrVarT);
    }

    @Override // defpackage.alfq
    public final alqm c(final String str, final ejxr ejxrVar) {
        ejxr ejxrVar2;
        ejxr ejxrVarA;
        final ejxr ejxrVar3;
        final ejxr ejxrVarP;
        ejxr ejxrVar4;
        final ejxr ejxrVar5;
        allt alltVar;
        ejxr ejxrVarR;
        ejxr ejxrVarO;
        ejxr ejxrVar6;
        final crmx crmxVar = (crmx) this.h.b();
        final ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: aliv
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alwh) this.a.f.b()).f(str, !((alpc) r0.k.b()).m());
            }
        });
        eygg eyggVar = this.k;
        if (((alpc) eyggVar.b()).o()) {
            ejxrVarP = p(str, ejxrVarA2, false, ejxx.a(new ejxr() { // from class: alic
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return (String) ((Optional) ejxrVar.get()).orElse("");
                }
            }));
            if (((alpc) eyggVar.b()).g()) {
                ejxrVar6 = new ejxr() { // from class: alid
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return ((allr) ejxrVarP.get()).j().b();
                    }
                };
                ejxrVarA = new ejxr() { // from class: alie
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return ((allr) ejxrVarP.get()).j().a();
                    }
                };
                ejxrVar2 = new ejxr() { // from class: alif
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return ((allr) ejxrVarP.get()).g();
                    }
                };
            } else {
                final ejxr ejxrVarM = m(ejxrVarA2, new ejxr() { // from class: alig
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return Optional.ofNullable(((allr) ejxrVarP.get()).g());
                    }
                }, ejxrVarP);
                ejxrVar2 = ejxrVarM;
                ejxrVarA = ejxx.a(new ejxr() { // from class: alih
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return Optional.of(crmxVar.c((String) ejxrVarM.get()));
                    }
                });
                ejxrVar6 = ejxrVar2;
            }
            ejxrVar3 = ejxrVar6;
        } else {
            final ejxr ejxrVarP2 = p(str, ejxrVarA2, false, new ejxr() { // from class: alii
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return "";
                }
            });
            final ejxr ejxrVarM2 = m(ejxrVarA2, ejxrVar, ejxrVarP2);
            final ejxr ejxrVarA3 = ejxx.a(new ejxr() { // from class: alij
                @Override // defpackage.ejxr
                public final Object get() {
                    return ((crmx) this.a.h.b()).c((String) ejxrVarM2.get());
                }
            });
            final ejxr ejxrVarP3 = p(str, ejxrVarA2, false, ejxrVarM2);
            final ejxr ejxrVarA4 = ejxx.a(new ejxr() { // from class: alil
                @Override // defpackage.ejxr
                public final Object get() {
                    final crmx crmxVar2 = crmxVar;
                    return (String) this.a.m(ejxrVarA2, new ejxr() { // from class: alla
                        @Override // defpackage.ejxr
                        public final Object get() {
                            cczv cczvVar = allt.a;
                            return Optional.of(crmxVar2.r());
                        }
                    }, ejxrVarP2).get();
                }
            });
            final ejxr ejxrVarA5 = ejxx.a(new ejxr() { // from class: aljg
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return crmxVar.c((String) ejxrVarA4.get());
                }
            });
            final ejxr ejxrVarP4 = p(str, ejxrVarA2, false, ejxrVarA4);
            final ejxr ejxrVar7 = new ejxr() { // from class: aljr
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    alwk alwkVarA = ((allr) ejxrVarP4.get()).a();
                    ejxr ejxrVar8 = ejxrVarP3;
                    boolean z = false;
                    if (!alwkVarA.equals(((allr) ejxrVar8.get()).a())) {
                        ejxr ejxrVar9 = ejxrVarA4;
                        String str2 = (String) ejxrVarM2.get();
                        allr allrVar = (allr) ejxrVar8.get();
                        String str3 = (String) ejxrVar9.get();
                        boolean z2 = allrVar.a() == alwk.UNKNOWN_DESTINATION_TYPE || allrVar.a() == alwk.UNRECOGNIZED || allrVar.a() == alwk.PHONE_INVALID_TOO_SHORT || allrVar.a() == alwk.PHONE_INVALID_TOO_LONG || allrVar.a() == alwk.PHONE_INVALID_LENGTH || allrVar.a() == alwk.PHONE_INVALID_COUNTRY_CODE || allrVar.a() == alwk.UNKNOWN_DIALABLE;
                        if (((Boolean) alvx.b.e()).booleanValue() && !str2.equals(str3) && z2) {
                            z = true;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            };
            ejxr ejxrVar8 = new ejxr() { // from class: alkc
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return ((Boolean) ejxrVar7.get()).booleanValue() ? (allr) ejxrVarP4.get() : (allr) ejxrVarP3.get();
                }
            };
            ejxrVar2 = new ejxr() { // from class: alkn
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return ((Boolean) ejxrVar7.get()).booleanValue() ? (String) ejxrVarA4.get() : (String) ejxrVarM2.get();
                }
            };
            ejxrVarA = new ejxr() { // from class: alky
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return Optional.of(((Boolean) ejxrVar7.get()).booleanValue() ? (crnc) ejxrVarA5.get() : (crnc) ejxrVarA3.get());
                }
            };
            ejxrVar3 = ejxrVar2;
            ejxrVarP = ejxrVar8;
        }
        if (((alpc) eyggVar.b()).n()) {
            ejxr ejxrVar9 = ejxrVarA;
            ejxrVarO = o(ejxrVarP, ejxrVar2, ejxrVarA2, ejxrVarA2);
            ejxrVar5 = ejxrVar9;
            ejxrVar4 = ejxrVarA2;
            ejxrVarR = r(ejxrVarP, ejxrVar4, ejxrVarO, ejxrVar2, ejxrVar5);
            alltVar = this;
        } else {
            ejxrVar4 = ejxrVarA2;
            ejxrVar5 = ejxrVarA;
            alltVar = this;
            ejxrVarR = alltVar.r(ejxrVarP, ejxrVar4, ejxrVar4, ejxrVar2, ejxrVar5);
            ejxrVarO = alltVar.o(ejxrVarP, ejxrVar2, ejxrVar4, ejxrVarR);
        }
        ejxr ejxrVar10 = !((alpc) eyggVar.b()).g() ? new ejxr() { // from class: alle
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP.get()).a().equals(alwk.EMAIL) ? Optional.empty() : (Optional) ejxrVar5.get();
            }
        } : ejxrVar5;
        return ((alql) alltVar.l.b()).c(ejxrVar4, new ejxr() { // from class: alia
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str;
            }
        }, alltVar.A(ejxrVarP, ejxrVar4, ejxrVarO, ejxrVar2), ejxrVarO, ejxrVarR, alltVar.q(ejxrVarP, ejxrVar4, ejxrVar2), alltVar.z(ejxrVarP, ejxrVarO), new ejxr() { // from class: alib
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP.get()).a();
            }
        }, ejxrVar10, ((alpc) eyggVar.b()).g() ? new ejxr() { // from class: allf
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                ejxr ejxrVar11 = ejxrVar3;
                return TextUtils.isEmpty((CharSequence) ejxrVar11.get()) ? Optional.empty() : Optional.of((String) ejxrVar11.get());
            }
        } : alltVar.t(ejxrVar10));
    }

    @Override // defpackage.alfq
    public final alqm d(dggk dggkVar) {
        return c(dggkVar.a, new alkj());
    }

    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, final String str4, final ejxr ejxrVar) {
        final String strF;
        String str5;
        allt alltVar;
        ejxr ejxrVarR;
        ejxr ejxrVarO;
        String str6 = true == w(str) ? str2 : str;
        if (((Boolean) alvx.c.e()).booleanValue()) {
            str3.getClass();
            str6.getClass();
            str4.getClass();
        }
        if (w(str6)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            strF = str5;
        } else {
            strF = ((alwh) this.f.b()).f(str6, !((alpc) this.k.b()).m());
            str5 = str3;
        }
        final alqj alqjVar = (!w(str5) || strF.equals("ʼUNKNOWN_SENDER!ʼ")) ? new alqj(ejwk.b(str5)) : new alqj(((crmx) this.h.b()).p(strF));
        final ejxr ejxrVarP = p(str6, new ejxr() { // from class: aljy
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return strF;
            }
        }, z, ejxrVar);
        String strB = ejwk.b(str2);
        if (true == w(strB)) {
            strB = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new alun().get()).booleanValue()) {
            strB = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: aliy
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
                    return !allt.w((String) obj);
                }
            }).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        final String str7 = strB;
        final ejxr ejxrVarP2 = p(str2, new ejxr() { // from class: aljk
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str7;
            }
        }, z, ejxrVar);
        eygg eyggVar = this.k;
        ejxr ejxrVarS = ((alpc) eyggVar.b()).g() ? new ejxr() { // from class: aljl
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP2.get()).j().a();
            }
        } : s(ejxrVarP2, new ejxr() { // from class: aljm
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str7;
            }
        }, ejxrVar, new ejxr() { // from class: aljn
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str7;
            }
        });
        final ejxr ejxrVarT = ((alpc) eyggVar.b()).g() ? new ejxr() { // from class: aljo
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                ejxr ejxrVar2 = ejxrVarP2;
                return TextUtils.isEmpty(((allr) ejxrVar2.get()).j().b()) ? Optional.empty() : Optional.of(((allr) ejxrVar2.get()).j().b());
            }
        } : t(ejxrVarS);
        ejxr ejxrVarA = ((alpc) eyggVar.b()).g() ? new ejxr() { // from class: aljp
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP2.get()).g();
            }
        } : ejxx.a(new ejxr() { // from class: aljq
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return (String) ((Optional) ejxrVarT.get()).orElseGet(new aljx(ejxrVar));
            }
        });
        if (((alpc) eyggVar.b()).n()) {
            ejxrVarO = o(ejxrVarP2, ejxrVarA, new ejxr() { // from class: aljs
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return strF;
                }
            }, new ejxr() { // from class: aljt
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return strF;
                }
            });
            ejxrVarR = r(ejxrVarP2, new ejxr() { // from class: aliz
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return str7;
                }
            }, ejxrVarO, ejxrVarA, ejxrVarS);
            alltVar = this;
        } else {
            alltVar = this;
            ejxrVarR = alltVar.r(ejxrVarP2, new ejxr() { // from class: alja
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return str7;
                }
            }, new ejxr() { // from class: aljb
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return str7;
                }
            }, ejxrVarA, ejxrVarS);
            ejxrVarO = alltVar.o(ejxrVarP2, ejxrVarA, new ejxr() { // from class: aljc
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return strF;
                }
            }, ejxrVarR);
        }
        ejxr ejxrVar2 = ejxrVarR;
        ejxr ejxrVarA2 = alltVar.A(ejxrVarP2, new ejxr() { // from class: alkk
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str7;
            }
        }, ejxrVarO, ejxrVarA);
        alql alqlVar = (alql) alltVar.l.b();
        ejxr ejxrVar3 = new ejxr() { // from class: aljd
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return strF;
            }
        };
        ejxr ejxrVar4 = new ejxr() { // from class: alje
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str4;
            }
        };
        if (((Boolean) new alun().get()).booleanValue()) {
            ejxrVarO = new ejxr() { // from class: aljf
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = allt.a;
                    return str7;
                }
            };
        }
        return alqlVar.c(ejxrVar3, ejxrVar4, ejxrVarA2, ejxrVarO, ejxrVar2, alltVar.q(ejxrVarP2, new ejxr() { // from class: aljh
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return str7;
            }
        }, ejxrVarA), new ejxr() { // from class: alji
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return alqjVar;
            }
        }, new ejxr() { // from class: aljj
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return ((allr) ejxrVarP.get()).a();
            }
        }, ejxrVarS, ejxrVarT);
    }

    @Override // defpackage.alfq
    public final alqm f() {
        return ((alql) this.l.b()).c(new ejxr() { // from class: alkp
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: alkq
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new alkj(), new ejxr() { // from class: alkr
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: alks
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new alkj(), new ejxr() { // from class: alkt
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return new alqj("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new ejxr() { // from class: alku
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = allt.a;
                return alwk.UNKNOWN_SENDER;
            }
        }, new alkj(), new alkj());
    }

    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return ((alql) this.l.b()).a(alqmVar, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm h(alqm alqmVar, String str) {
        alqk alqkVarB = ((alql) this.l.b()).b(alqmVar, str);
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarB.H();
        }
        return alqkVarB;
    }

    @Override // defpackage.alfq
    public final alqm i(final alqm alqmVar, boolean z) {
        if (!z) {
            return alqmVar;
        }
        return ((alql) this.l.b()).a(alqmVar, new ejxr() { // from class: alld
            @Override // defpackage.ejxr
            public final Object get() {
                allt alltVar = this.a;
                boolean zC = ((alpc) alltVar.k.b()).c();
                alqm alqmVar2 = alqmVar;
                if (!zC) {
                    return ((crmx) alltVar.h.b()).p(alqmVar2.n());
                }
                String str = alqmVar2.F().a;
                str.getClass();
                return str;
            }
        });
    }

    @Override // defpackage.alfq
    public final alqm j(final alqm alqmVar, final int i) {
        ejxr ejxrVar = new ejxr() { // from class: aliw
            @Override // defpackage.ejxr
            public final Object get() {
                String strB = cssr.b(ejwk.b(alqmVar.n()));
                if (alwh.i(strB) || alwh.k(strB)) {
                    return strB;
                }
                int i2 = i;
                allt alltVar = this.a;
                return ((crmx) alltVar.h.b()).v(((alwh) alltVar.f.b()).f(strB, !((alpc) alltVar.k.b()).m()), ((crnb) alltVar.i.b()).c(i2));
            }
        };
        alqk alqkVarA = ((Boolean) c.e()).booleanValue() ? ((alql) this.l.b()).a(alqmVar, ejxrVar) : ((alql) this.l.b()).b(alqmVar, (String) ejxrVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarA.H();
        }
        return alqkVarA;
    }

    @Override // defpackage.alfq
    public final alqm k(final alqm alqmVar) {
        ejxr ejxrVar = new ejxr() { // from class: alin
            @Override // defpackage.ejxr
            public final Object get() {
                String strB = ejwk.b(alqmVar.n());
                allt alltVar = this.a;
                eygg eyggVar = alltVar.h;
                String strB2 = cssr.b(strB);
                return alwh.i(strB2) ? strB2 : ((crmx) eyggVar.b()).x(((alwh) alltVar.f.b()).f(strB2, !((alpc) alltVar.k.b()).m()));
            }
        };
        alqk alqkVarA = ((Boolean) c.e()).booleanValue() ? ((alql) this.l.b()).a(alqmVar, ejxrVar) : ((alql) this.l.b()).b(alqmVar, (String) ejxrVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarA.H();
        }
        return alqkVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0236  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.allr l(java.lang.String r13, java.lang.String r14, final java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.allt.l(java.lang.String, java.lang.String, java.lang.String):allr");
    }

    public final ejxr m(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alix
            @Override // defpackage.ejxr
            public final Object get() {
                allr allrVar = (allr) ejxrVar3.get();
                if (allrVar == null) {
                    return "";
                }
                alwk alwkVarA = allrVar.a();
                if (alwkVarA == alwk.EMAIL || alwkVarA == alwk.BOT || alwkVarA == alwk.UNKNOWN_SENDER || alwkVarA == alwk.SATELLITE_ESP || alwkVarA == alwk.PENPAL_BOT) {
                    return "US";
                }
                ejxr ejxrVar4 = ejxrVar;
                crmx crmxVar = (crmx) this.a.h.b();
                if (((String) ejxrVar4.get()).startsWith("+")) {
                    Optional optionalG = crmxVar.g((String) ejxrVar4.get(), null);
                    if (optionalG.isPresent() && !((crnc) optionalG.get()).b()) {
                        return crmxVar.z((crnc) optionalG.get());
                    }
                }
                ejxr ejxrVar5 = ejxrVar2;
                return (!((Optional) ejxrVar5.get()).isPresent() || ((String) ((Optional) ejxrVar5.get()).get()).isEmpty()) ? crmxVar.r() : (String) ((Optional) ejxrVar5.get()).get();
            }
        });
    }

    public final ejxr n(final String str, final String str2, final boolean z) {
        return ejxx.a(new ejxr() { // from class: aljw
            @Override // defpackage.ejxr
            public final Object get() {
                crmx crmxVar = (crmx) this.a.h.b();
                String str3 = str2;
                String str4 = str;
                return crmxVar.w(str4, str4, str3, z);
            }
        });
    }

    final ejxr o(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alkm
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar5 = ejxrVar;
                allr allrVar = (allr) ejxrVar5.get();
                int iOrdinal = allrVar.a().ordinal();
                allt alltVar = this.a;
                ejxr ejxrVar6 = ejxrVar3;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 9:
                    case 11:
                    case 12:
                    case 13:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return (String) ejxrVar6.get();
                    case 1:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        if (!((alpc) alltVar.k.b()).k()) {
                            return (String) ejxrVar4.get();
                        }
                        crmx crmxVar = (crmx) alltVar.h.b();
                        ephf ephfVarE = allrVar.e();
                        ephfVarE.getClass();
                        return crmxVar.m(ephfVarE, ephg.E164);
                    case 6:
                    case 14:
                        return (String) ((alwh) alltVar.f.b()).b((String) ejxrVar6.get()).orElse((String) ejxrVar6.get());
                    case 8:
                        if (!((alpc) alltVar.k.b()).k()) {
                            return (String) alltVar.n((String) ((alwh) alltVar.f.b()).b((String) ejxrVar6.get()).orElse((String) ejxrVar6.get()), (String) ejxrVar2.get(), false).get();
                        }
                        crmx crmxVar2 = (crmx) alltVar.h.b();
                        ephf ephfVarE2 = allrVar.e();
                        ephfVarE2.getClass();
                        return crmxVar2.m(ephfVarE2, ephg.E164);
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((allr) ejxrVar5.get()).a().name())));
                }
            }
        });
    }

    final ejxr p(final String str, final ejxr ejxrVar, final boolean z, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: allc
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVar;
                String str2 = (String) ejxrVar3.get();
                if (z) {
                    return allr.i(str2, alwk.BOT);
                }
                if (alwh.i(str2)) {
                    return allr.i(str2, alwk.EMAIL);
                }
                ejxr ejxrVar4 = ejxrVar2;
                allt alltVar = this.a;
                if (str2.equals("ʼUNKNOWN_SENDER!ʼ") || str2.isEmpty()) {
                    if (!((alpc) alltVar.k.b()).g()) {
                        return allr.i(str2, alwk.UNKNOWN_SENDER);
                    }
                    final ejxr ejxrVarU = alltVar.u(str2, null, ejxrVar4);
                    return new alfn(str2, alwk.UNKNOWN_SENDER, "", null, 0, ejxrVarU, new ejxr() { // from class: allq
                        @Override // defpackage.ejxr
                        public final Object get() {
                            return ((alls) ejxrVarU.get()).b();
                        }
                    }, new ejxr() { // from class: allh
                        @Override // defpackage.ejxr
                        public final Object get() {
                            return (crnc) ((alls) ejxrVarU.get()).a().orElse(null);
                        }
                    });
                }
                if (alpd.a(str2) || alpd.b(str2)) {
                    return allr.i(str2, alwk.SATELLITE_ESP);
                }
                eygg eyggVar = alltVar.k;
                if (!((alpc) eyggVar.b()).g() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((alwh) alltVar.f.b()).j(str2)) {
                    return allr.i(str2, alwk.PENPAL_BOT);
                }
                if (!((alpc) eyggVar.b()).i() && ((crmx) alltVar.h.b()).L(str2)) {
                    return allr.i(str2, alwk.PHONE_E164);
                }
                String str3 = str;
                if (!((alwh) alltVar.f.b()).m(str2, !((alpc) eyggVar.b()).m())) {
                    if (!((Boolean) allt.a.e()).booleanValue()) {
                        return allr.i(str2, alwk.UNKNOWN_DESTINATION_TYPE);
                    }
                    ekrw ekrwVarG = allt.d.g();
                    ekrwVarG.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1208, "CsMessagingIdentityFactoryImplV3.java")).I("getParsedDestination(%s, %s, %s) throwing", str3, str2, false);
                    throw new IllegalStateException("Unknown destination format");
                }
                if (!((alpc) eyggVar.b()).o()) {
                    return alltVar.l(str3, str2, (String) ejxrVar4.get());
                }
                allr allrVarL = alltVar.l(str3, str2, "");
                if (allt.x(allrVarL)) {
                    ekrw ekrwVarG2 = allt.d.g();
                    ekrwVarG2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1119, "CsMessagingIdentityFactoryImplV3.java")).t("getParsedDestination(no country) returning %s", allrVarL);
                    return allrVarL;
                }
                final String str4 = (String) ejxrVar4.get();
                final allr allrVarL2 = allt.w(str4) ? null : alltVar.l(str3, str2, str4);
                if (!allt.w(str4) && ((allt.x(allrVarL2) || !((Boolean) alvx.b.e()).booleanValue()) && allrVarL2 != null)) {
                    ekrw ekrwVarG3 = allt.d.g();
                    ekrwVarG3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG3).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1138, "CsMessagingIdentityFactoryImplV3.java")).K("getParsedDestination(supplied) returning %s (country=%s, noCountry=%s, supplied=%s, flag=%s)", allrVarL2, str4, allrVarL, str4, alvx.b.e());
                    return allrVarL2;
                }
                final String strR = ((crmx) alltVar.h.b()).r();
                if (str4.equals(strR) || allt.w(strR)) {
                    ekrw ekrwVarG4 = allt.d.g();
                    ekrwVarG4.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG4).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1152, "CsMessagingIdentityFactoryImplV3.java")).K("getParsedDestination(%s not roaming) returning %s (country=%s, noCountry=%s, flag=%s)", allrVarL2 != null ? "supplied" : "noCountry", allrVarL2 != null ? allrVarL2 : allrVarL, str4, allrVarL, alvx.b.e());
                    return allrVarL2 == null ? allrVarL : allrVarL2;
                }
                final allr allrVarL3 = alltVar.l(str3, str2, strR);
                ejxr ejxrVarM = alltVar.m(ejxrVar3, new ejxr() { // from class: alkv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return Optional.ofNullable(str4);
                    }
                }, new ejxr() { // from class: alkw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return allrVarL2;
                    }
                });
                ejxr ejxrVarM2 = alltVar.m(ejxrVar3, new ejxr() { // from class: alkx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return Optional.ofNullable(strR);
                    }
                }, new ejxr() { // from class: alkz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = allt.a;
                        return allrVarL3;
                    }
                });
                if (allrVarL2 != null) {
                    if (((alfn) allrVarL2).a == ((alfn) allrVarL3).a || ((String) ejxrVarM.get()).equals(ejxrVarM2.get())) {
                        ekrw ekrwVarG5 = allt.d.g();
                        ekrwVarG5.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ekrwVarG5).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1197, "CsMessagingIdentityFactoryImplV3.java")).K("getParsedDestination(same country) returning %s (country=%s, noCountry=%s, supplied=%s, flag=%s)", allrVarL2, str4, allrVarL, allrVarL3, alvx.b.e());
                        return allrVarL2;
                    }
                }
                ekrw ekrwVarG6 = allt.d.g();
                ekrwVarG6.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarG6).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getParsedDestination", 1183, "CsMessagingIdentityFactoryImplV3.java")).N("getParsedDestination(%s) returning %s (country=%s, noCountry=%s, supplied=%s, suppliedRegion=%s, deviceRegion=%s, flag=%s)", "device", allrVarL3, str4, allrVarL, allrVarL2, ejxrVarM.get(), ejxrVarM2.get(), alvx.b.e());
                return allrVarL3;
            }
        });
    }

    final ejxr q(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alko
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar4 = ejxrVar;
                allr allrVar = (allr) ejxrVar4.get();
                int iOrdinal = allrVar.a().ordinal();
                allt alltVar = this.a;
                ejxr ejxrVar5 = ejxrVar2;
                ejxr ejxrVar6 = ejxrVar3;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 4:
                    case 11:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return Optional.empty();
                    case 1:
                    case 12:
                        eygg eyggVar = alltVar.k;
                        if (((alpc) eyggVar.b()).b() && ((alpc) eyggVar.b()).g()) {
                            asqx asqxVar = (asqx) alltVar.g.b();
                            ephf ephfVarE = allrVar.e();
                            ephfVarE.getClass();
                            return Optional.of(asqxVar.g(ephfVarE));
                        }
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 13:
                    case 14:
                    case 23:
                        return (((alpc) alltVar.k.b()).d() && ((ccvz) alltVar.j.b()).b((String) ejxrVar5.get())) ? Optional.of(((asqx) alltVar.g.b()).d((String) ejxrVar5.get())) : Optional.empty();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        eygg eyggVar2 = alltVar.k;
                        if (((alpc) eyggVar2.b()).b() && ((alpc) eyggVar2.b()).g()) {
                            asqx asqxVar2 = (asqx) alltVar.g.b();
                            ephf ephfVarE2 = allrVar.e();
                            ephfVarE2.getClass();
                            return Optional.of(asqxVar2.g(ephfVarE2));
                        }
                        try {
                            return Optional.of(((asqx) alltVar.g.b()).a((String) alltVar.n((String) ejxrVar5.get(), (String) ejxrVar6.get(), true).get(), false));
                        } catch (IllegalArgumentException e2) {
                            ekrw ekrwVarJ = allt.d.j();
                            ekrwVarJ.X(eksq.a, "Bugle");
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "getRcsIdentifier", (char) 1066, "CsMessagingIdentityFactoryImplV3.java")).q("Phone number could not be normalized");
                            return Optional.empty();
                        }
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((allr) ejxrVar4.get()).a().name())));
                }
                return Optional.of(((asqx) alltVar.g.b()).a((String) ejxrVar5.get(), false));
            }
        });
    }

    final ejxr r(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4, final ejxr ejxrVar5) {
        return ejxx.a(new ejxr() { // from class: alju
            @Override // defpackage.ejxr
            public final Object get() {
                allr allrVar = (allr) ejxrVar.get();
                int iOrdinal = allrVar.a().ordinal();
                allt alltVar = this.a;
                ejxr ejxrVar6 = ejxrVar2;
                ejxr ejxrVar7 = ejxrVar5;
                switch (iOrdinal) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return (String) ejxrVar6.get();
                    case 8:
                        if (((Boolean) alvx.a.e()).booleanValue()) {
                            return allt.v((String) ejxrVar6.get(), ((alpc) alltVar.k.b()).n() ? (Optional) ejxrVar7.get() : (!((Optional) ejxrVar7.get()).isPresent() || ((crnc) ((Optional) ejxrVar7.get()).get()).b()) ? ((crmx) alltVar.h.b()).f((String) ejxrVar6.get()) : ((crmx) alltVar.h.b()).g((String) ejxrVar6.get(), ((crnc) ((Optional) ejxrVar7.get()).get()).toString()), true);
                        }
                        return (String) ejxrVar6.get();
                    case 9:
                        return ((Boolean) alvx.a.e()).booleanValue() ? allt.v((String) ejxrVar6.get(), (Optional) ejxrVar7.get(), false) : (String) ejxrVar6.get();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        if (((alpc) alltVar.k.b()).n()) {
                            return (String) ejxrVar3.get();
                        }
                        return (String) alltVar.n((String) ejxrVar6.get(), (String) ejxrVar4.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(allrVar.a().name())));
                }
            }
        });
    }

    final ejxr s(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alik
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar5 = ejxrVar;
                int iOrdinal = ((allr) ejxrVar5.get()).a().ordinal();
                final allt alltVar = this.a;
                ejxr ejxrVar6 = ejxrVar2;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 7:
                    case 11:
                    case 12:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        return Optional.empty();
                    case 1:
                    case 8:
                        return ((crmx) alltVar.h.b()).f((String) ejxrVar6.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                        final ejxr ejxrVar7 = ejxrVar3;
                        return ((crmx) alltVar.h.b()).f((String) ejxrVar4.get()).or(new Supplier() { // from class: alit
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return Optional.of(((crmx) alltVar.h.b()).c((String) ejxrVar7.get()));
                            }
                        });
                    case 6:
                    case 14:
                        return ((alwh) alltVar.f.b()).a((String) ejxrVar6.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((allr) ejxrVar5.get()).a().name())));
                }
            }
        });
    }

    final ejxr t(final ejxr ejxrVar) {
        return ejxx.a(new ejxr() { // from class: aliu
            @Override // defpackage.ejxr
            public final Object get() {
                Optional optional = (Optional) ejxrVar.get();
                final allt alltVar = this.a;
                return optional.map(new Function() { // from class: allb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((crmx) alltVar.h.b()).z((crnc) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
    }

    public final ejxr u(final String str, final ephf ephfVar, final ejxr ejxrVar) {
        return ejxx.a(new ejxr() { // from class: aljz
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = (String) ejxrVar.get();
                crnc crncVar = new crnc(0);
                crnc crncVar2 = new crnc(0);
                ephf ephfVar2 = ephfVar;
                if (ephfVar2 != null && ephfVar2.e()) {
                    crncVar = new crnc(ephfVar2.a());
                }
                String str3 = str;
                allt alltVar = this.a;
                if (crncVar.b()) {
                    crncVar = (crnc) ((alwh) alltVar.f.b()).a(str3).orElse(new crnc(0));
                }
                if (crncVar.b() && !TextUtils.isEmpty(str2)) {
                    crncVar2 = ((crmx) alltVar.h.b()).c(str2);
                    crncVar = crncVar2;
                }
                if (crncVar.b()) {
                    crncVar = new crnc(0);
                }
                String strF = ephfVar2 != null ? ((ephj) ((crmx) alltVar.h.b()).c.b()).f(ephfVar2) : "";
                if (!TextUtils.isEmpty(strF)) {
                    ekrw ekrwVarG = allt.d.g();
                    ekrwVarG.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "parseTargetCountry", 1311, "CsMessagingIdentityFactoryImplV3.java")).I("parseTargetCountry(%s) returning %s %s because LPN determined the country directly", str3, strF, crncVar);
                    return alls.c(strF, crncVar);
                }
                if (crncVar2.b() && !TextUtils.isEmpty(str2)) {
                    crncVar2 = ((crmx) alltVar.h.b()).c(str2);
                }
                if (!crncVar.b() && !crncVar.equals(crncVar2)) {
                    String strZ = ((crmx) alltVar.h.b()).z(crncVar);
                    ekrw ekrwVarG2 = allt.d.g();
                    ekrwVarG2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "parseTargetCountry", 1336, "CsMessagingIdentityFactoryImplV3.java")).I("parseTargetCountry(%s) returning %s %s because that's the biggest country with that calling code", str3, strZ, crncVar);
                    return alls.c(strZ, crncVar);
                }
                if (crncVar.b()) {
                    ekrw ekrwVarG3 = allt.d.g();
                    ekrwVarG3.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG3).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "parseTargetCountry", 1323, "CsMessagingIdentityFactoryImplV3.java")).I("parseTargetCountry(%s) returning source %s %s because there's no country prefix to guess with", str3, str2, crncVar2);
                } else {
                    ekrw ekrwVarG4 = allt.d.g();
                    ekrwVarG4.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarG4).h("com/google/android/apps/messaging/shared/api/messaging/identity/CsMessagingIdentityFactoryImplV3", "parseTargetCountry", 1328, "CsMessagingIdentityFactoryImplV3.java")).I("parseTargetCountry(%s) returning %s %s because country calling code matched source country", str3, str2, crncVar2);
                }
                return alls.c(str2, crncVar2);
            }
        });
    }
}
