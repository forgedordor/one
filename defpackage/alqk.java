package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alqk implements alqm {
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity");
    public final ejxr a;
    public final ejxr b;
    public final ejxr c;
    public final ejxr d;
    public final ejxr e;
    final Throwable f;
    private final eygg h;
    private final ejxr i;
    private final ejxr j;
    private final ejxr k;
    private final ejxr l;
    private final ejxr m;
    private final ejxr n;
    private final ejxr o;
    private final ejxr p;
    private boolean q;

    public alqk(eygg eyggVar, final fcsu fcsuVar, final fcsu fcsuVar2, final alqm alqmVar, ejxr ejxrVar) {
        this.q = false;
        this.h = eyggVar;
        if (alqmVar instanceof alqk) {
            alqk alqkVar = (alqk) alqmVar;
            this.a = alqkVar.a;
            this.c = alqkVar.c;
            this.d = alqkVar.d;
            this.i = alqkVar.i;
            this.j = alqkVar.j;
            this.e = alqkVar.e;
            this.k = alqkVar.k;
            this.l = alqkVar.l;
            this.m = alqkVar.m;
            this.b = ejxrVar;
            this.f = alqkVar.f;
        } else {
            this.a = new ejxr() { // from class: alpn
                @Override // defpackage.ejxr
                public final Object get() {
                    String strJ = alqmVar.j();
                    strJ.getClass();
                    return strJ;
                }
            };
            this.c = new ejxr() { // from class: alpr
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.F();
                }
            };
            this.d = new ejxr() { // from class: alps
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.c();
                }
            };
            this.i = new ejxr() { // from class: alpt
                @Override // defpackage.ejxr
                public final Object get() {
                    String strL = alqmVar.l();
                    strL.getClass();
                    return strL;
                }
            };
            this.j = new ejxr() { // from class: alpu
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.o();
                }
            };
            this.e = new ejxr() { // from class: alpf
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.e();
                }
            };
            this.k = new ejxr() { // from class: alpg
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.a();
                }
            };
            this.l = new ejxr() { // from class: alph
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.f();
                }
            };
            this.m = new ejxr() { // from class: alpi
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.g();
                }
            };
            this.b = ejxrVar;
            this.f = new RuntimeException();
        }
        this.n = new ejxr() { // from class: alpv
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((crmx) fcsuVar.b()).H((String) this.a.a.get()));
            }
        };
        this.p = new ejxr() { // from class: alpo
            @Override // defpackage.ejxr
            public final Object get() {
                return ((ccvz) fcsuVar2.b()).a((String) this.a.a.get());
            }
        };
        this.o = new ejxr() { // from class: alpq
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((ccvz) fcsuVar2.b()).b((String) this.a.a.get()));
            }
        };
    }

    private final void I(String str, ejxr ejxrVar, ejxr ejxrVar2) {
        J(str, ejxrVar, ejxrVar2, Function$CC.identity());
    }

    private final void J(String str, ejxr ejxrVar, ejxr ejxrVar2, Function function) {
        if (!((Boolean) dfog.o().a.ae.a()).booleanValue() || this.q) {
            return;
        }
        Double d = (Double) dfog.o().a.af.a();
        double dDoubleValue = d.doubleValue();
        if (dDoubleValue <= 0.0d) {
            ekrw ekrwVarG = g.g();
            ekrwVarG.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 643, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because ratio=%s%%", d);
            return;
        }
        if (dDoubleValue < 1.0d && ThreadLocalRandom.current().nextDouble() <= dDoubleValue) {
            ekrw ekrwVarG2 = g.g();
            ekrwVarG2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG2).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 646, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging (ratio=%s%%)", d);
            return;
        }
        String str2 = (String) ejxrVar.get();
        String str3 = (String) ejxrVar2.get();
        if (Objects.equals(function.apply(str2), function.apply(str3))) {
            ekrw ekrwVarG3 = g.g();
            ekrwVarG3.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarG3).h("com/google/android/apps/messaging/shared/api/messaging/identity/LazyMessagingIdentity", "uploadShadowMetricsIfDifferent", 653, "LazyMessagingIdentity.java")).t("LazyMessagingIdentity not logging because both returned %s", str2);
            return;
        }
        this.q = true;
        final alri alriVar = (alri) this.h.b();
        awch awchVarA = ((awci) alriVar.c.b()).a();
        List listM = ((crny) alriVar.d.b()).m();
        Stream map = Collection.EL.stream(listM).map(new Function() { // from class: alrf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return alriVar.a(((crof) obj).p());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        int i = ekgb.d;
        Collector collector = ekcv.a;
        ekgb ekgbVar = (ekgb) map.collect(collector);
        ekgb ekgbVar2 = (ekgb) Collection.EL.stream(listM).map(new Function() { // from class: alrg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return alriVar.a(((crof) obj).s());
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).collect(collector);
        Locale localeC = craf.c(alriVar.b);
        String upperCase = localeC != null ? localeC.getCountry().toUpperCase(localeC) : "";
        String strB = ((crnb) alriVar.e.b()).b();
        crnc crncVarA = alriVar.a(((crmx) alriVar.f.b()).r());
        ekrw ekrwVarJ = alri.a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarJ).g(this.f);
        ekrdVar.Z(eksk.SMALL);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/identity/MessagingIdentityDifferenceReporter", "logDifference", 112, "MessagingIdentityDifferenceReporter.java");
        esvg esvgVar = esvg.CONFIRMED_UPLOAD_SAFE_USER_DATA;
        ekrdVar2.O("LazyMessagingIdentity#%s has different with flag on than flag off: off=[%s], on=[%s], raw=[%s], country=[%s], type=[%s],  localeCountryCode=[%s], networkCountryCodeDeprecated=[%s], simCallCodes=[%s], networkCallCodes=[%s], settingsCallCodeCode=[%s]", new esvh(esvgVar, str), alri.b(awchVarA, str2), alri.b(awchVarA, str3), alri.b(awchVarA, n()), new esvh(esvgVar, (String) f().map(new Function() { // from class: alrh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((crnc) obj).toString();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }).orElse(null)), new esvh(esvgVar, a().name()), new esvh(esvgVar, upperCase), new esvh(esvgVar, strB), new esvh(esvgVar, String.valueOf(ekgbVar2)), new esvh(esvgVar, String.valueOf(ekgbVar)), new esvh(esvgVar, crncVarA.toString()));
    }

    @Override // defpackage.alqm
    public final boolean A() {
        return alwk.BOT.equals(a());
    }

    @Override // defpackage.alqm
    public final boolean B() {
        return a().equals(alwk.SATELLITE_ESP);
    }

    @Override // defpackage.alqm
    public final boolean C() {
        alwk alwkVarA = a();
        return alwk.PHONE_SHORT_WITH_COUNTRY.equals(alwkVarA) || alwk.PHONE_SHORT_NO_COUNTRY.equals(alwkVarA);
    }

    @Override // defpackage.alqm
    public final boolean D() {
        return a().equals(alwk.UNKNOWN_SENDER) || w();
    }

    @Override // defpackage.alqm
    public final boolean E() {
        alwk alwkVarA = a();
        return (alwkVarA == alwk.UNKNOWN_SENDER || alwkVarA == alwk.UNKNOWN_DESTINATION_TYPE || alwkVarA == alwk.PHONE_INVALID_TOO_SHORT || alwkVarA == alwk.PHONE_INVALID_TOO_LONG || alwkVarA == alwk.PHONE_INVALID_LENGTH || alwkVarA == alwk.PHONE_INVALID_COUNTRY_CODE || alwkVarA == alwk.UNRECOGNIZED || alwkVarA == alwk.UNKNOWN_DIALABLE || w()) ? false : true;
    }

    @Override // defpackage.alqm
    @Deprecated
    public final alqj F() {
        return (alqj) this.c.get();
    }

    @Override // defpackage.alqm
    public final alqj G(boolean z) {
        ejxr ejxrVar = new ejxr() { // from class: alpy
            @Override // defpackage.ejxr
            public final Object get() {
                return ((alqj) this.a.c.get()).a;
            }
        };
        ejxr ejxrVar2 = this.b;
        I("getDisplayDestination", ejxrVar2, ejxrVar);
        return z ? (alqj) this.c.get() : new alqj((String) ejxrVar2.get());
    }

    @Override // defpackage.alqm
    public final void H() {
        j();
        n();
        F();
        c();
        o();
        e();
        a();
        f();
        g();
    }

    @Override // defpackage.alqm
    public final alwk a() {
        return (alwk) this.k.get();
    }

    @Override // defpackage.alqm
    public final Optional b() {
        return (Optional) this.p.get();
    }

    @Override // defpackage.alqm
    @Deprecated
    public final Optional c() {
        return (Optional) this.d.get();
    }

    @Override // defpackage.alqm
    public final Optional d(boolean z) {
        ejxr ejxrVar = new ejxr() { // from class: alpx
            @Override // defpackage.ejxr
            public final Object get() {
                return (String) ((Optional) this.a.d.get()).orElse(null);
            }
        };
        ejxr ejxrVar2 = this.b;
        I("getInternationalDestination", ejxrVar2, ejxrVar);
        return z ? (Optional) this.d.get() : Optional.ofNullable((String) ejxrVar2.get());
    }

    @Override // defpackage.alqm
    public final Optional e() {
        return (Optional) this.e.get();
    }

    @Override // defpackage.alqm
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alqm) {
            return Objects.equals(o(), ((alqm) obj).o());
        }
        return false;
    }

    @Override // defpackage.alqm
    public final Optional f() {
        return (Optional) this.l.get();
    }

    @Override // defpackage.alqm
    public final Optional g() {
        return (Optional) this.m.get();
    }

    @Override // defpackage.alqm
    @Deprecated
    public final String h() {
        ejxr ejxrVar = new ejxr() { // from class: alqb
            @Override // defpackage.ejxr
            public final Object get() {
                return (String) ((Optional) this.a.e.get()).map(new alpm()).orElse(null);
            }
        };
        ejxr ejxrVar2 = this.b;
        I("getLegacyFallbackRcsDestination", ejxrVar2, ejxrVar);
        Optional optional = (Optional) this.e.get();
        return optional.isPresent() ? ((aubq) optional.get()).d : (String) ejxrVar2.get();
    }

    @Override // defpackage.alqm
    public final int hashCode() {
        return o().hashCode();
    }

    @Override // defpackage.alqm
    public final String i(boolean z) {
        if (z) {
            return h();
        }
        ejxr ejxrVar = this.b;
        I("getLegacyFallbackRcsDestination", ejxrVar, new ejxr() { // from class: alpw
            @Override // defpackage.ejxr
            public final Object get() {
                alqk alqkVar = this.a;
                return (String) ((Optional) alqkVar.e.get()).map(new alpm()).orElse((String) alqkVar.b.get());
            }
        });
        return (String) ejxrVar.get();
    }

    @Override // defpackage.alqm
    @Deprecated
    public final String j() {
        return (String) this.a.get();
    }

    @Override // defpackage.alqm
    public final String k(boolean z) {
        ejxr ejxrVar = this.b;
        ejxr ejxrVar2 = this.a;
        I("getLocalDestination", ejxrVar, ejxrVar2);
        if (true == z) {
            ejxrVar = ejxrVar2;
        }
        return (String) ejxrVar.get();
    }

    @Override // defpackage.alqm
    public final String l() {
        ejxr ejxrVar = this.b;
        ejxr ejxrVar2 = this.i;
        I("getNormalizedDestination", ejxrVar, ejxrVar2);
        return (String) ejxrVar2.get();
    }

    @Override // defpackage.alqm
    public final String m(boolean z) {
        ejxr ejxrVar = this.b;
        ejxr ejxrVar2 = this.i;
        I("getNormalizedDestination", ejxrVar, ejxrVar2);
        return z ? (String) ejxrVar2.get() : (String) ejxrVar.get();
    }

    @Override // defpackage.alqm
    public final String n() {
        return (String) this.b.get();
    }

    @Override // defpackage.alqm
    @Deprecated
    public final String o() {
        String str = (String) this.j.get();
        return str == null ? ejwk.b((String) this.b.get()) : str;
    }

    @Override // defpackage.alqm
    public final String p(boolean z) {
        ejxr ejxrVar = this.b;
        I("getSerializationContextFormat", ejxrVar, this.j);
        return !z ? (String) ejxrVar.get() : o();
    }

    @Override // defpackage.alqm
    public final boolean q() {
        alwk alwkVarA = a();
        switch (alwkVarA) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case SATELLITE_ESP:
            case PENPAL_BOT:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case PHONE_NATIONAL:
            case PHONE_WITH_COUNTRY:
            case PHONE_WITH_IDD:
            case PHONE_WITH_PLUS:
            case PHONE_INVALID_TOO_SHORT:
            case PHONE_INVALID_TOO_LONG:
            case PHONE_INVALID_LENGTH:
            case PHONE_INVALID_COUNTRY_CODE:
            case UNKNOWN_DIALABLE:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(alwkVarA.name())));
        }
    }

    @Override // defpackage.alqm
    public final boolean r() {
        alwk alwkVarA = a();
        switch (alwkVarA) {
            case UNKNOWN_DESTINATION_TYPE:
            case EMAIL:
            case BOT:
            case UNKNOWN_SENDER:
            case PHONE_SHORT_NO_COUNTRY:
            case PHONE_SHORT_WITH_COUNTRY:
            case PHONE_EMERGENCY:
            case PHONE_LOCAL_WITH_COUNTRY:
            case PHONE_LOCAL_NO_COUNTRY:
            case SATELLITE_ESP:
            case ALPHA_SHORT_NO_COUNTRY:
            case ALPHA_SHORT_WITH_COUNTRY:
            case PHONE_INVALID_TOO_SHORT:
            case PHONE_INVALID_TOO_LONG:
            case PHONE_INVALID_LENGTH:
            case PHONE_INVALID_COUNTRY_CODE:
            case UNKNOWN_DIALABLE:
            case UNRECOGNIZED:
                return false;
            case PHONE_E164:
            case PHONE_NATIONAL:
            case PENPAL_BOT:
            case PHONE_WITH_COUNTRY:
            case PHONE_WITH_IDD:
            case PHONE_WITH_PLUS:
                return true;
            default:
                throw new IllegalArgumentException("unknown destination type ".concat(String.valueOf(alwkVarA.name())));
        }
    }

    @Override // defpackage.alqm
    public final boolean s() {
        alwk alwkVarA = a();
        return alwkVarA.equals(alwk.ALPHA_SHORT_WITH_COUNTRY) || alwkVarA.equals(alwk.ALPHA_SHORT_NO_COUNTRY);
    }

    @Override // defpackage.alqm
    public final boolean t() {
        return alwk.EMAIL.equals(a());
    }

    @Override // defpackage.alqm
    public final String toString() {
        return o();
    }

    @Override // defpackage.alqm
    public final boolean u() {
        return ((Boolean) this.n.get()).booleanValue();
    }

    @Override // defpackage.alqm
    public final boolean v() {
        return ((Boolean) this.o.get()).booleanValue();
    }

    @Override // defpackage.alqm
    @Deprecated
    public final boolean w() {
        return TextUtils.isEmpty((CharSequence) this.a.get());
    }

    @Override // defpackage.alqm
    public final boolean x(boolean z) {
        Function function = new Function() { // from class: alpz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                return Boolean.valueOf(str != null ? str.isEmpty() : true);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        ejxr ejxrVar = this.b;
        ejxr ejxrVar2 = this.a;
        J("isEmpty", ejxrVar, ejxrVar2, function);
        return z ? TextUtils.isEmpty((CharSequence) ejxrVar2.get()) : TextUtils.isEmpty((CharSequence) ejxrVar.get());
    }

    @Override // defpackage.alqm
    public final boolean y() {
        alwk alwkVarA = a();
        return alwkVarA == alwk.PHONE_E164 || alwkVarA == alwk.PHONE_WITH_COUNTRY || alwkVarA == alwk.PHONE_WITH_IDD || alwkVarA == alwk.PHONE_WITH_PLUS;
    }

    @Override // defpackage.alqm
    public final boolean z() {
        return alwk.PENPAL_BOT.equals(a());
    }

    @Deprecated
    public alqk(eygg eyggVar, final fcsu fcsuVar, final fcsu fcsuVar2, final alqm alqmVar, final String str) {
        this.q = false;
        this.h = eyggVar;
        if (alqmVar instanceof alqk) {
            alqk alqkVar = (alqk) alqmVar;
            this.a = alqkVar.a;
            this.c = alqkVar.c;
            this.d = alqkVar.d;
            this.i = alqkVar.i;
            this.j = alqkVar.j;
            this.e = alqkVar.e;
            this.k = alqkVar.k;
            this.l = alqkVar.l;
            this.m = alqkVar.m;
            this.b = new ejxr() { // from class: alpe
                @Override // defpackage.ejxr
                public final Object get() {
                    return str;
                }
            };
            this.f = alqkVar.f;
        } else {
            this.a = new ejxr() { // from class: alqe
                @Override // defpackage.ejxr
                public final Object get() {
                    String strJ = alqmVar.j();
                    strJ.getClass();
                    return strJ;
                }
            };
            this.c = new ejxr() { // from class: alqf
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.F();
                }
            };
            this.d = new ejxr() { // from class: alqg
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.c();
                }
            };
            this.i = new ejxr() { // from class: alqh
                @Override // defpackage.ejxr
                public final Object get() {
                    String strL = alqmVar.l();
                    strL.getClass();
                    return strL;
                }
            };
            this.j = new ejxr() { // from class: alqi
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.o();
                }
            };
            this.e = new ejxr() { // from class: alpf
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.e();
                }
            };
            this.k = new ejxr() { // from class: alpg
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.a();
                }
            };
            this.l = new ejxr() { // from class: alph
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.f();
                }
            };
            this.m = new ejxr() { // from class: alpi
                @Override // defpackage.ejxr
                public final Object get() {
                    return alqmVar.g();
                }
            };
            this.b = new ejxr() { // from class: alpp
                @Override // defpackage.ejxr
                public final Object get() {
                    return str;
                }
            };
            this.f = new RuntimeException();
        }
        this.n = new ejxr() { // from class: alqa
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((crmx) fcsuVar.b()).H((String) this.a.a.get()));
            }
        };
        this.p = new ejxr() { // from class: alqc
            @Override // defpackage.ejxr
            public final Object get() {
                return ((ccvz) fcsuVar2.b()).a((String) this.a.a.get());
            }
        };
        this.o = new ejxr() { // from class: alqd
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((ccvz) fcsuVar2.b()).b((String) this.a.a.get()));
            }
        };
    }

    public alqk(eygg eyggVar, final fcsu fcsuVar, final fcsu fcsuVar2, final ejxr ejxrVar, ejxr ejxrVar2, ejxr ejxrVar3, ejxr ejxrVar4, ejxr ejxrVar5, ejxr ejxrVar6, ejxr ejxrVar7, ejxr ejxrVar8, ejxr ejxrVar9, ejxr ejxrVar10) {
        this.q = false;
        this.h = eyggVar;
        this.a = ejxrVar;
        this.b = ejxrVar2;
        this.c = ejxrVar7;
        this.d = ejxrVar3;
        this.i = ejxrVar4;
        this.j = ejxrVar5;
        this.e = ejxrVar6;
        this.k = ejxrVar8;
        this.l = ejxrVar9;
        this.m = ejxrVar10;
        this.n = new ejxr() { // from class: alpj
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((crmx) fcsuVar.b()).H((String) ejxrVar.get()));
            }
        };
        this.p = new ejxr() { // from class: alpk
            @Override // defpackage.ejxr
            public final Object get() {
                return ((ccvz) fcsuVar2.b()).a((String) ejxrVar.get());
            }
        };
        this.o = new ejxr() { // from class: alpl
            @Override // defpackage.ejxr
            public final Object get() {
                return Boolean.valueOf(((ccvz) fcsuVar2.b()).b((String) ejxrVar.get()));
            }
        };
        this.f = new RuntimeException();
    }
}
