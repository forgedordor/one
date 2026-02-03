package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csgx implements csgi {
    public static final ejxr a = cdag.v("moirai_v1_catch_initialization_errors");
    public static final eksp b = eksp.c("BugleDataModel");
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;
    private final eygg f;
    private final eosc g;
    private final eosc h;

    public csgx(fcsu fcsuVar, fcsu fcsuVar2, eygg eyggVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3) {
        this.c = fcsuVar;
        this.e = fcsuVar2;
        this.f = eyggVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.d = fcsuVar3;
    }

    public static String h(Exception exc) {
        ((eksl) ((eksl) ((eksl) b.j()).g(exc)).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "logErrorDetectingLanguage", (char) 325, "BugleMoiraiApiImpl.java")).q("Unable to detect language.");
        return "";
    }

    private final eiju i(cspj cspjVar, final String str, final scg scgVar, final sfp sfpVar, final sck sckVar) {
        final String str2 = cspjVar.b;
        return (str2 == null || str2.trim().isEmpty()) ? eijx.e(new dhvp()) : j(cspjVar).i(new eooz() { // from class: csgo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                boolean zBooleanValue = ((Boolean) ((cczi) crbf.bw.get()).e()).booleanValue();
                csgx csgxVar = this.a;
                if (zBooleanValue) {
                    ((csiv) csgxVar.d.b()).a(str3);
                }
                String str4 = str2;
                sbs sbsVar = (sbs) sbt.a.createBuilder();
                sbsVar.copyOnWrite();
                sbt sbtVar = (sbt) sbsVar.instance;
                sbtVar.b |= 1;
                sbtVar.c = str4;
                if (str3 != null) {
                    sbsVar.copyOnWrite();
                    sbt sbtVar2 = (sbt) sbsVar.instance;
                    sbtVar2.b |= 2;
                    sbtVar2.d = str3;
                }
                String str5 = str;
                sbm sbmVar = (sbm) sbn.a.createBuilder();
                sdh sdhVar = (sdh) sdi.a.createBuilder();
                sdhVar.copyOnWrite();
                sdi sdiVar = (sdi) sdhVar.instance;
                sbt sbtVar3 = (sbt) sbsVar.build();
                sbtVar3.getClass();
                sdiVar.d = sbtVar3;
                sdiVar.b |= 2;
                sdi sdiVar2 = (sdi) sdhVar.build();
                sbmVar.copyOnWrite();
                sbn sbnVar = (sbn) sbmVar.instance;
                sdiVar2.getClass();
                sbnVar.c = sdiVar2;
                sbnVar.b |= 1;
                if (str5 != null) {
                    sdn sdnVar = (sdn) sdo.a.createBuilder();
                    scv scvVar = (scv) sdc.a.createBuilder();
                    scvVar.copyOnWrite();
                    sdc sdcVar = (sdc) scvVar.instance;
                    sdcVar.b |= 1;
                    sdcVar.c = str5;
                    sdc sdcVar2 = (sdc) scvVar.build();
                    sdnVar.copyOnWrite();
                    sdo sdoVar = (sdo) sdnVar.instance;
                    sdcVar2.getClass();
                    sdoVar.c = sdcVar2;
                    sdoVar.b |= 1;
                    sdo sdoVar2 = (sdo) sdnVar.build();
                    sbmVar.copyOnWrite();
                    sbn sbnVar2 = (sbn) sbmVar.instance;
                    sdoVar2.getClass();
                    sbnVar2.e = sdoVar2;
                    sbnVar2.b |= 4;
                }
                scg scgVar2 = scgVar;
                sde sdeVar = (sde) sdf.a.createBuilder();
                if (scgVar2 != null) {
                    sdeVar.copyOnWrite();
                    sdf sdfVar = (sdf) sdeVar.instance;
                    sdfVar.d = scgVar2;
                    sdfVar.b |= 2;
                }
                sck sckVar2 = sckVar;
                if (sckVar2 != null) {
                    sdeVar.copyOnWrite();
                    sdf sdfVar2 = (sdf) sdeVar.instance;
                    sdfVar2.c = sckVar2;
                    sdfVar2.b |= 1;
                }
                sfp sfpVar2 = sfpVar;
                sdf sdfVar3 = (sdf) sdeVar.build();
                sbmVar.copyOnWrite();
                sbn sbnVar3 = (sbn) sbmVar.instance;
                sdfVar3.getClass();
                sbnVar3.f = sdfVar3;
                sbnVar3.b |= 8;
                dhuu dhuuVarA = dhut.a((sbn) sbmVar.build());
                return sfpVar2 != null ? csgxVar.g(dhuuVarA, sfpVar2) : csgxVar.e(dhuuVarA);
            }
        }, eoqg.a);
    }

    private final eiju j(cspj cspjVar) {
        crav cravVar = (crav) this.f.b();
        ezdw ezdwVar = (ezdw) ezdx.a.createBuilder();
        ezdu ezduVar = (ezdu) ezdv.a.createBuilder();
        String str = cspjVar.b;
        str.getClass();
        ezduVar.copyOnWrite();
        ezdv ezdvVar = (ezdv) ezduVar.instance;
        ezdvVar.b = 30;
        ezdvVar.c = str;
        ezdwVar.b((ezdv) ezduVar.build());
        eiju eijuVarA = cravVar.a((ezdx) ezdwVar.build());
        ejvr ejvrVar = new ejvr() { // from class: csgp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Locale locale = (Locale) obj;
                if (locale != null) {
                    ((eksl) csgx.b.o().h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "getLanguageAsync", 306, "BugleMoiraiApiImpl.java")).q("Detected language.");
                    return locale.getLanguage();
                }
                ((eksl) ((eksl) csgx.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "getLanguageAsync", 309, "BugleMoiraiApiImpl.java")).q("Unable to detect language.");
                return "";
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarA.h(ejvrVar, eoqgVar).e(IllegalStateException.class, new ejvr() { // from class: csgq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return csgx.h((IllegalStateException) obj);
            }
        }, eoqgVar).e(IllegalArgumentException.class, new ejvr() { // from class: csgr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return csgx.h((IllegalArgumentException) obj);
            }
        }, eoqgVar);
    }

    @Override // defpackage.csgi
    public final eiju a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return e(dhut.b(str));
        }
        ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "classifyDestination", 130, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#classify: empty phone number");
        return eijx.e(new dhvp());
    }

    @Override // defpackage.csgi
    public final eiju b(cspj cspjVar, String str, scg scgVar) {
        if (((Boolean) ((cczi) crtr.e.get()).e()).booleanValue()) {
            return i(cspjVar, str, scgVar, null, null);
        }
        final String str2 = cspjVar.b;
        return (str2 == null || str2.trim().isEmpty()) ? eijx.e(new dhvp()) : j(cspjVar).i(new eooz() { // from class: csgn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                boolean zBooleanValue = ((Boolean) ((cczi) crbf.bw.get()).e()).booleanValue();
                csgx csgxVar = this.a;
                if (zBooleanValue) {
                    ((csiv) csgxVar.d.b()).a(str3);
                }
                return csgxVar.f(str2, str3, null);
            }
        }, eoqg.a);
    }

    @Override // defpackage.csgi
    public final eiju c(cspj cspjVar, String str, scg scgVar, sck sckVar) {
        return i(cspjVar, str, scgVar, null, sckVar);
    }

    @Override // defpackage.csgi
    public final eiju d(cspj cspjVar, final sfp sfpVar) {
        if (((Boolean) ((cczi) crtr.e.get()).e()).booleanValue()) {
            return i(cspjVar, null, null, sfpVar, null);
        }
        final String str = cspjVar.b;
        return (str == null || str.trim().isEmpty()) ? eijx.e(new dhvp()) : j(cspjVar).i(new eooz() { // from class: csgj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.f(str, (String) obj, sfpVar);
            }
        }, eoqg.a);
    }

    public final eiju e(final dhuu dhuuVar) {
        eiju eijuVarI;
        eieu eieuVarK = eiiy.k("BugleMoiraiApiImpl#callHadesClassify");
        try {
            if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
                eijuVarI = ((cshk) this.e.b()).a().i(new eooz() { // from class: csgs
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((cshs) this.a.c.b()).a(dhuuVar);
                    }
                }, this.h).e(IllegalStateException.class, new ejvr() { // from class: csgt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((eksl) ((eksl) csgx.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "callHadesClassify", 243, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#callHadesClassify: failed to initialize");
                        return new dhvp("NOT_AVAILABLE", dhun.e, 4);
                    }
                }, this.g);
                eieuVarK.b(eijuVarI);
            } else {
                eijuVarI = ((cshk) this.e.b()).a().i(new eooz() { // from class: csgu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((cshs) this.a.c.b()).a(dhuuVar);
                    }
                }, eoqg.a);
                eieuVarK.b(eijuVarI);
            }
            eieuVarK.close();
            return eijuVarI;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju f(final String str, final String str2, sfp sfpVar) {
        dhuu dhuuVarA = dhuv.a(new fdap() { // from class: dhur
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ekgi ekgiVar = (ekgi) obj;
                ekgiVar.getClass();
                final String str3 = str;
                final String str4 = str2;
                dhuv.b(ekgiVar, new fdap() { // from class: dhup
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        sbp sbpVar = (sbp) obj2;
                        sbpVar.getClass();
                        sdh sdhVar = (sdh) sdi.a.createBuilder();
                        sdhVar.getClass();
                        sbs sbsVar = (sbs) sbt.a.createBuilder();
                        sbsVar.getClass();
                        sbu.c(str3, sbsVar);
                        String str5 = str4;
                        if (str5 != null) {
                            sbu.b(str5, sbsVar);
                        }
                        sdj.c(sbu.a(sbsVar), sdhVar);
                        sbpVar.c(sdj.a(sdhVar));
                        return fctx.a;
                    }
                });
                return fctx.a;
            }
        });
        return sfpVar != null ? g(dhuuVarA, sfpVar) : e(dhuuVarA);
    }

    public final eiju g(final dhuu dhuuVar, final sfp sfpVar) {
        eiju eijuVarH;
        eieu eieuVarK = eiiy.k("BugleMoiraiApiImpl#callHadesReportUserFeedback");
        try {
            if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
                eiju eijuVarI = ((cshk) this.e.b()).a().i(new eooz() { // from class: csgv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((cshs) this.a.c.b()).b(dhuuVar, sfpVar);
                    }
                }, this.h);
                ejvr ejvrVar = new ejvr() { // from class: csgw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejxr ejxrVar = csgx.a;
                        return new dhvp();
                    }
                };
                eosc eoscVar = this.g;
                eijuVarH = eijuVarI.h(ejvrVar, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: csgk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((eksl) ((eksl) csgx.b.j()).h("com/google/android/apps/messaging/shared/util/spam/hades/BugleMoiraiApiImpl", "callHadesReportUserFeedback", 275, "BugleMoiraiApiImpl.java")).q("BugleMoiraiApiImpl#callHadesReportUserFeedback: failed to initialize");
                        return new dhvp("NOT_AVAILABLE", dhun.e, 4);
                    }
                }, eoscVar);
                eieuVarK.b(eijuVarH);
            } else {
                eiju eijuVarA = ((cshk) this.e.b()).a();
                eooz eoozVar = new eooz() { // from class: csgl
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((cshs) this.a.c.b()).b(dhuuVar, sfpVar);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eijuVarH = eijuVarA.i(eoozVar, eoqgVar).h(new ejvr() { // from class: csgm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ejxr ejxrVar = csgx.a;
                        return new dhvp();
                    }
                }, eoqgVar);
                eieuVarK.b(eijuVarH);
            }
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
