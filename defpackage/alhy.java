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
public final class alhy implements alfq {
    public static final cczv a = cdag.h(cdag.b, "enable_error_for_unknown_destination_format", false);
    static final cczv b = cdag.h(cdag.b, "mi_normalizing_eagerly_calculates", false);
    static final cczv c = cdag.h(cdag.b, "legacy_uses_supplier", false);
    public static final cqce d = cqce.g("Bugle", "CsMessagingIdentityFactoryImpl");
    public final eygg e;
    public final eygg f;
    public final eygg g;
    public final eygg h;
    private final eygg i;

    public alhy(eygg eyggVar, eygg eyggVar2, eygg eyggVar3, eygg eyggVar4, eygg eyggVar5) {
        this.e = eyggVar;
        this.f = eyggVar2;
        this.g = eyggVar3;
        this.h = eyggVar4;
        this.i = eyggVar5;
    }

    public static String t(String str, Optional optional, boolean z) {
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

    static final String u(String str, String str2) {
        return v(str) ? str2 : str;
    }

    public static boolean v(String str) {
        return TextUtils.isEmpty(str) || str.trim().length() == 0;
    }

    private final ejxr w(final ejxr ejxrVar, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: alhk
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar3.get()).ordinal();
                ejxr ejxrVar4 = ejxrVar2;
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
                        return new alqj((String) ejxrVar4.get());
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                        return new alqj(((crmx) this.a.g.b()).p((String) ejxrVar4.get()));
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar3.get()).name())));
                }
            }
        });
    }

    private final ejxr x(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: alfr
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar4 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar4.get()).ordinal();
                ejxr ejxrVar5 = ejxrVar2;
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
                        return Optional.of((String) ejxrVar5.get());
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return Optional.of((String) this.a.o((String) ejxrVar5.get(), (String) ejxrVar3.get(), false).get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar4.get()).name())));
                }
            }
        });
    }

    @Override // defpackage.alfq
    public final alqm a(final String str) {
        return ((alql) this.i.b()).c(new ejxr() { // from class: alfy
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str;
            }
        }, new ejxr() { // from class: alfz
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str;
            }
        }, new ejxr() { // from class: alga
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return Optional.of(str);
            }
        }, new ejxr() { // from class: algb
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str;
            }
        }, new ejxr() { // from class: algd
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str;
            }
        }, ejxx.a(new ejxr() { // from class: alge
            @Override // defpackage.ejxr
            public final Object get() {
                return Optional.of(((asqx) this.a.f.b()).a(str, false));
            }
        }), new ejxr() { // from class: algf
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return new alqj(str);
            }
        }, new ejxr() { // from class: algg
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return alwk.BOT;
            }
        }, new algh(), new algh());
    }

    @Override // defpackage.alfq
    public final alqm b(final aubq aubqVar) {
        ejxr ejxrVar = new ejxr() { // from class: alhn
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return aubqVar.d;
            }
        };
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: alho
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.g.b()).r();
            }
        });
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejxr ejxrVarN = n(ejxrVar, aubpVarB == aubp.BOT, ejxrVarA);
        ejxr ejxrVarM = m(ejxrVarN, ejxrVar, ejxrVarA, ejxrVar);
        final ejxr ejxrVarR = r(ejxrVarM);
        ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: alhp
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                Optional optional = (Optional) ejxrVarR.get();
                ejxr ejxrVar2 = ejxrVarA;
                ejxrVar2.getClass();
                return (String) optional.orElseGet(new algt(ejxrVar2));
            }
        });
        ejxr ejxrVarS = s(ejxrVarN, ejxrVar, ejxrVarA2, ejxrVarM);
        return ((alql) this.i.b()).c(ejxrVar, ejxrVar, x(ejxrVarN, ejxrVar, ejxrVarA2), p(ejxrVarN, ejxrVarA2, ejxrVar, ejxrVarS), ejxrVarS, q(ejxrVarN, ejxrVar, ejxrVarA2), w(ejxrVarN, ejxrVar), ejxrVarN, ejxrVarM, ejxrVarR);
    }

    @Override // defpackage.alfq
    public final alqm c(final String str, ejxr ejxrVar) {
        final crmx crmxVar = (crmx) this.g.b();
        final ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: algc
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alwh) this.a.e.b()).e(str);
            }
        });
        final ejxr ejxrVarN = n(ejxrVarA, false, new ejxr() { // from class: algy
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return "";
            }
        });
        final ejxr ejxrVarL = l((String) ejxrVarA.get(), ejxrVar, ejxrVarN);
        final ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: alhj
            @Override // defpackage.ejxr
            public final Object get() {
                return ((crmx) this.a.g.b()).c((String) ejxrVarL.get());
            }
        });
        final ejxr ejxrVarN2 = n(ejxrVarA, false, ejxrVarL);
        final ejxr ejxrVarA3 = ejxx.a(new ejxr() { // from class: alht
            @Override // defpackage.ejxr
            public final Object get() {
                String str2 = (String) ejxrVarA.get();
                final crmx crmxVar2 = crmxVar;
                return (String) this.a.l(str2, new ejxr() { // from class: alhl
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cczv cczvVar = alhy.a;
                        return Optional.of(crmxVar2.r());
                    }
                }, ejxrVarN).get();
            }
        });
        final ejxr ejxrVarA4 = ejxx.a(new ejxr() { // from class: alhu
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return crmxVar.c((String) ejxrVarA3.get());
            }
        });
        final ejxr ejxrVarN3 = n(ejxrVarA, false, ejxrVarA3);
        final ejxr ejxrVar2 = new ejxr() { // from class: alhv
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                alwk alwkVar = (alwk) ejxrVarN3.get();
                ejxr ejxrVar3 = ejxrVarN2;
                boolean z = false;
                if (!alwkVar.equals(ejxrVar3.get())) {
                    ejxr ejxrVar4 = ejxrVarA3;
                    String str2 = (String) ejxrVarL.get();
                    alwk alwkVar2 = (alwk) ejxrVar3.get();
                    String str3 = (String) ejxrVar4.get();
                    if (((Boolean) alvx.b.e()).booleanValue() && !str2.equals(str3) && alwkVar2 == alwk.UNKNOWN_DESTINATION_TYPE) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        final ejxr ejxrVar3 = new ejxr() { // from class: alhw
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return ((Boolean) ejxrVar2.get()).booleanValue() ? (alwk) ejxrVarN3.get() : (alwk) ejxrVarN2.get();
            }
        };
        ejxr ejxrVar4 = new ejxr() { // from class: alhx
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return ((Boolean) ejxrVar2.get()).booleanValue() ? (String) ejxrVarA3.get() : (String) ejxrVarL.get();
            }
        };
        final ejxr ejxrVar5 = new ejxr() { // from class: alfs
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return Optional.of(((Boolean) ejxrVar2.get()).booleanValue() ? (crnc) ejxrVarA4.get() : (crnc) ejxrVarA2.get());
            }
        };
        ejxr ejxrVarS = s(ejxrVar3, ejxrVarA, ejxrVar4, ejxrVar5);
        ejxr ejxrVarP = p(ejxrVar3, ejxrVar4, ejxrVarA, ejxrVarS);
        ejxr ejxrVar6 = new ejxr() { // from class: alft
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return ((alwk) ejxrVar3.get()).equals(alwk.EMAIL) ? Optional.empty() : ejxrVar5.get();
            }
        };
        return ((alql) this.i.b()).c(ejxrVarA, new ejxr() { // from class: algn
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str;
            }
        }, x(ejxrVar3, ejxrVarA, ejxrVar4), ejxrVarP, ejxrVarS, q(ejxrVar3, ejxrVarA, ejxrVar4), w(ejxrVar3, ejxrVarP), ejxrVar3, ejxrVar6, r(ejxrVar6));
    }

    @Override // defpackage.alfq
    public final alqm d(dggk dggkVar) {
        return c(dggkVar.a, new algh());
    }

    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, final String str4, final ejxr ejxrVar) {
        final String strE;
        String str5;
        String strU = u(str, str2);
        if (((Boolean) alvx.c.e()).booleanValue()) {
            str3.getClass();
            strU.getClass();
            str4.getClass();
        }
        if (v(strU)) {
            str5 = "ʼUNKNOWN_SENDER!ʼ";
            strE = str5;
        } else {
            strE = ((alwh) this.e.b()).e(strU);
            str5 = str3;
        }
        final alqj alqjVar = (!v(str5) || strE.equals("ʼUNKNOWN_SENDER!ʼ")) ? new alqj(ejwk.b(str5)) : new alqj(((crmx) this.g.b()).p(strE));
        ejxr ejxrVarN = n(new ejxr() { // from class: alfx
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strE;
            }
        }, z, ejxrVar);
        final String strB = ejwk.b(str2);
        if (true == v(strB)) {
            strB = "ʼUNKNOWN_SENDER!ʼ";
        }
        if (((Boolean) new alun().get()).booleanValue()) {
            strB = (String) Optional.ofNullable(str2).filter(new Predicate() { // from class: algu
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
                    return !alhy.v((String) obj);
                }
            }).orElse("ʼUNKNOWN_SENDER!ʼ");
        }
        ejxr ejxrVarN2 = n(new ejxr() { // from class: algx
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        }, z, ejxrVar);
        ejxr ejxrVarM = m(ejxrVarN2, new ejxr() { // from class: algz
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        }, ejxrVar, new ejxr() { // from class: alha
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        });
        final ejxr ejxrVarR = r(ejxrVarM);
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: alhb
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return (String) ((Optional) ejxrVarR.get()).orElseGet(new algt(ejxrVar));
            }
        });
        ejxr ejxrVarX = x(ejxrVarN2, new ejxr() { // from class: algs
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        }, ejxrVarA);
        ejxr ejxrVarS = s(ejxrVarN2, new ejxr() { // from class: alhc
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        }, ejxrVarA, ejxrVarM);
        ejxr ejxrVarP = p(ejxrVarN2, ejxrVarA, new ejxr() { // from class: alhd
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strE;
            }
        }, ejxrVarS);
        alql alqlVar = (alql) this.i.b();
        ejxr ejxrVar2 = ejxrVarP;
        ejxr ejxrVar3 = new ejxr() { // from class: alhe
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strE;
            }
        };
        ejxr ejxrVar4 = new ejxr() { // from class: alhf
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return str4;
            }
        };
        if (((Boolean) new alun().get()).booleanValue()) {
            ejxrVar2 = new ejxr() { // from class: alhg
                @Override // defpackage.ejxr
                public final Object get() {
                    cczv cczvVar = alhy.a;
                    return strB;
                }
            };
        }
        return alqlVar.c(ejxrVar3, ejxrVar4, ejxrVarX, ejxrVar2, ejxrVarS, q(ejxrVarN2, new ejxr() { // from class: algv
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return strB;
            }
        }, ejxrVarA), new ejxr() { // from class: algw
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return alqjVar;
            }
        }, ejxrVarN, ejxrVarM, ejxrVarR);
    }

    @Override // defpackage.alfq
    public final alqm f() {
        return ((alql) this.i.b()).c(new ejxr() { // from class: algl
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: algm
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new algh(), new ejxr() { // from class: algo
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new ejxr() { // from class: algp
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return "ʼUNKNOWN_SENDER!ʼ";
            }
        }, new algh(), new ejxr() { // from class: algq
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return new alqj("ʼUNKNOWN_SENDER!ʼ");
            }
        }, new ejxr() { // from class: algr
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = alhy.a;
                return alwk.UNKNOWN_SENDER;
            }
        }, new algh(), new algh());
    }

    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return ((alql) this.i.b()).a(alqmVar, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm h(alqm alqmVar, String str) {
        alqk alqkVarB = ((alql) this.i.b()).b(alqmVar, str);
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarB.H();
        }
        return alqkVarB;
    }

    @Override // defpackage.alfq
    public final alqm i(alqm alqmVar, boolean z) {
        return z ? ((alql) this.i.b()).b(alqmVar, ((crmx) this.g.b()).p(alqmVar.n())) : alqmVar;
    }

    @Override // defpackage.alfq
    public final alqm j(final alqm alqmVar, final int i) {
        ejxr ejxrVar = new ejxr() { // from class: alhq
            @Override // defpackage.ejxr
            public final Object get() {
                String strB = cssr.b(ejwk.b(alqmVar.n()));
                if (alwh.i(strB) || alwh.k(strB)) {
                    return strB;
                }
                int i2 = i;
                alhy alhyVar = this.a;
                return ((crmx) alhyVar.g.b()).v(((alwh) alhyVar.e.b()).e(strB), ((crnb) alhyVar.h.b()).c(i2));
            }
        };
        alqk alqkVarA = ((Boolean) c.e()).booleanValue() ? ((alql) this.i.b()).a(alqmVar, ejxrVar) : ((alql) this.i.b()).b(alqmVar, (String) ejxrVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarA.H();
        }
        return alqkVarA;
    }

    @Override // defpackage.alfq
    public final alqm k(final alqm alqmVar) {
        ejxr ejxrVar = new ejxr() { // from class: algk
            @Override // defpackage.ejxr
            public final Object get() {
                String strB = ejwk.b(alqmVar.n());
                alhy alhyVar = this.a;
                eygg eyggVar = alhyVar.g;
                String strB2 = cssr.b(strB);
                return alwh.i(strB2) ? strB2 : ((crmx) eyggVar.b()).x(((alwh) alhyVar.e.b()).e(strB2));
            }
        };
        alqk alqkVarA = ((Boolean) c.e()).booleanValue() ? ((alql) this.i.b()).a(alqmVar, ejxrVar) : ((alql) this.i.b()).b(alqmVar, (String) ejxrVar.get());
        if (((Boolean) b.e()).booleanValue()) {
            alqkVarA.H();
        }
        return alqkVarA;
    }

    public final ejxr l(final String str, final ejxr ejxrVar, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: alhh
            @Override // defpackage.ejxr
            public final Object get() {
                alwk alwkVar = (alwk) ejxrVar2.get();
                if (alwkVar == alwk.EMAIL || alwkVar == alwk.BOT || alwkVar == alwk.UNKNOWN_SENDER || alwkVar == alwk.SATELLITE_ESP || alwkVar == alwk.PENPAL_BOT) {
                    return "US";
                }
                String str2 = str;
                crmx crmxVar = (crmx) this.a.g.b();
                if (str2.startsWith("+")) {
                    Optional optionalG = crmxVar.g(str2, null);
                    if (optionalG.isPresent() && !((crnc) optionalG.get()).b()) {
                        return crmxVar.z((crnc) optionalG.get());
                    }
                }
                ejxr ejxrVar3 = ejxrVar;
                return (!((Optional) ejxrVar3.get()).isPresent() || ((String) ((Optional) ejxrVar3.get()).get()).isEmpty()) ? crmxVar.r() : (String) ((Optional) ejxrVar3.get()).get();
            }
        });
    }

    final ejxr m(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alfu
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar5 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar5.get()).ordinal();
                final alhy alhyVar = this.a;
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
                        return ((crmx) alhyVar.g.b()).f((String) ejxrVar6.get());
                    case 5:
                    case 9:
                    case 10:
                    case 13:
                    case 15:
                    case 16:
                    case 17:
                        final ejxr ejxrVar7 = ejxrVar3;
                        return ((crmx) alhyVar.g.b()).f((String) ejxrVar4.get()).or(new Supplier() { // from class: alfv
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return Optional.of(((crmx) alhyVar.g.b()).c((String) ejxrVar7.get()));
                            }
                        });
                    case 6:
                    case 14:
                        return ((alwh) alhyVar.e.b()).a((String) ejxrVar6.get());
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar5.get()).name())));
                }
            }
        });
    }

    final ejxr n(final ejxr ejxrVar, final boolean z, final ejxr ejxrVar2) {
        return ejxx.a(new ejxr() { // from class: alhi
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar3 = ejxrVar2;
                if (z) {
                    return alwk.BOT;
                }
                String str = (String) ejxrVar.get();
                if (alwh.i(str)) {
                    return alwk.EMAIL;
                }
                if (str.equals("ʼUNKNOWN_SENDER!ʼ") || str.isEmpty()) {
                    return alwk.UNKNOWN_SENDER;
                }
                if (alpd.a(str) || alpd.b(str)) {
                    return alwk.SATELLITE_ESP;
                }
                alhy alhyVar = this.a;
                if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((alwh) alhyVar.e.b()).j(str)) {
                    return alwk.PENPAL_BOT;
                }
                eygg eyggVar = alhyVar.g;
                if (((crmx) eyggVar.b()).L(str)) {
                    return alwk.PHONE_E164;
                }
                eygg eyggVar2 = alhyVar.e;
                if (((alwh) eyggVar2.b()).l(str)) {
                    try {
                        ephf ephfVarE = ((crmx) eyggVar.b()).e(str, (String) ejxrVar3.get());
                        int iN = ((crmx) eyggVar.b()).N(ephfVarE);
                        if (iN == 4) {
                            if (((crmx) eyggVar.b()).J(ephfVarE)) {
                                return ((alwh) eyggVar2.b()).n(str) ? alwk.PHONE_SHORT_WITH_COUNTRY : alwk.PHONE_SHORT_NO_COUNTRY;
                            }
                            iN = 4;
                        }
                        if (iN == 1) {
                            return alwk.PHONE_NATIONAL;
                        }
                        if (iN == 2) {
                            return ((crmx) eyggVar.b()).f(str).isPresent() ? alwk.PHONE_LOCAL_WITH_COUNTRY : alwk.PHONE_LOCAL_NO_COUNTRY;
                        }
                    } catch (ephe e) {
                        if (((Boolean) alhy.a.e()).booleanValue()) {
                            throw new IllegalStateException("Unknown destination format", e);
                        }
                        return alwk.UNKNOWN_DESTINATION_TYPE;
                    }
                }
                if (((Boolean) alhy.a.e()).booleanValue()) {
                    throw new IllegalStateException("Unknown destination format");
                }
                return alwk.UNKNOWN_DESTINATION_TYPE;
            }
        });
    }

    public final ejxr o(final String str, final String str2, final boolean z) {
        return ejxx.a(new ejxr() { // from class: alhr
            @Override // defpackage.ejxr
            public final Object get() {
                crmx crmxVar = (crmx) this.a.g.b();
                String str3 = str2;
                String str4 = str;
                return crmxVar.w(str4, str4, str3, z);
            }
        });
    }

    final ejxr p(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alhm
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar5 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar5.get()).ordinal();
                alhy alhyVar = this.a;
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
                        return (String) ejxrVar4.get();
                    case 6:
                    case 14:
                        return (String) ((alwh) alhyVar.e.b()).b((String) ejxrVar6.get()).orElse((String) ejxrVar6.get());
                    case 8:
                        return (String) alhyVar.o((String) ((alwh) alhyVar.e.b()).b((String) ejxrVar6.get()).orElse((String) ejxrVar6.get()), (String) ejxrVar2.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar5.get()).name())));
                }
            }
        });
    }

    final ejxr q(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3) {
        return ejxx.a(new ejxr() { // from class: algi
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar4 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar4.get()).ordinal();
                alhy alhyVar = this.a;
                ejxr ejxrVar5 = ejxrVar2;
                ejxr ejxrVar6 = ejxrVar3;
                switch (iOrdinal) {
                    case 0:
                    case 2:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
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
                    case 3:
                    case 12:
                        return Optional.of(((asqx) alhyVar.f.b()).a((String) ejxrVar5.get(), false));
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        try {
                            return Optional.of(((asqx) alhyVar.f.b()).a((String) alhyVar.o((String) ejxrVar5.get(), (String) ejxrVar6.get(), true).get(), false));
                        } catch (IllegalArgumentException e) {
                            alhy.d.s("Phone number could not be normalized", e);
                            return Optional.empty();
                        }
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar4.get()).name())));
                }
            }
        });
    }

    final ejxr r(final ejxr ejxrVar) {
        return ejxx.a(new ejxr() { // from class: algj
            @Override // defpackage.ejxr
            public final Object get() {
                Optional optional = (Optional) ejxrVar.get();
                final alhy alhyVar = this.a;
                return optional.map(new Function() { // from class: alfw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((crmx) alhyVar.g.b()).z((crnc) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        });
    }

    final ejxr s(final ejxr ejxrVar, final ejxr ejxrVar2, final ejxr ejxrVar3, final ejxr ejxrVar4) {
        return ejxx.a(new ejxr() { // from class: alhs
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar5 = ejxrVar;
                int iOrdinal = ((alwk) ejxrVar5.get()).ordinal();
                alhy alhyVar = this.a;
                ejxr ejxrVar6 = ejxrVar2;
                ejxr ejxrVar7 = ejxrVar4;
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
                            return alhy.t((String) ejxrVar6.get(), (!((Optional) ejxrVar7.get()).isPresent() || ((crnc) ((Optional) ejxrVar7.get()).get()).b()) ? ((crmx) alhyVar.g.b()).f((String) ejxrVar6.get()) : ((crmx) alhyVar.g.b()).g((String) ejxrVar6.get(), ((crnc) ((Optional) ejxrVar7.get()).get()).toString()), true);
                        }
                        return (String) ejxrVar6.get();
                    case 9:
                        if (((Boolean) alvx.a.e()).booleanValue()) {
                            return alhy.t((String) ejxrVar6.get(), (Optional) ejxrVar7.get(), false);
                        }
                        return (String) ejxrVar6.get();
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                        return (String) alhyVar.o((String) ejxrVar6.get(), (String) ejxrVar3.get(), false).get();
                    default:
                        throw new IllegalStateException("Unknown destination format: ".concat(String.valueOf(((alwk) ejxrVar5.get()).name())));
                }
            }
        });
    }
}
