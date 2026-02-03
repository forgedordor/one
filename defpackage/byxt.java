package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byxt implements bypt {
    public static final eksp a = eksp.c("BugleCms");
    public static final eksp b = eksp.c("BugleCmsCall");
    public final cpmc c;
    public final cptn d;
    public final cpsl e;
    public final eosc f;
    public final eosc g;
    public final bzrq h;
    public final apom i;
    public final fcsu j;
    public final appt k;
    public final apoj l;
    public final cpqk m;
    private final bzqf n;
    private final ains o;
    private final appj p;

    public byxt(cpmc cpmcVar, cptn cptnVar, cpsl cpslVar, bzqf bzqfVar, eosc eoscVar, eosc eoscVar2, bzrq bzrqVar, apom apomVar, fcsu fcsuVar, appt apptVar, apoj apojVar, ains ainsVar, appj appjVar, cpqk cpqkVar) {
        this.c = cpmcVar;
        this.d = cptnVar;
        this.e = cpslVar;
        this.h = bzrqVar;
        this.n = bzqfVar;
        this.i = apomVar;
        this.j = fcsuVar;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.k = apptVar;
        this.l = apojVar;
        this.o = ainsVar;
        this.p = appjVar;
        this.m = cpqkVar;
    }

    public static byqv d(Throwable th, String str, String str2, int i, String str3) {
        eksl ekslVar = (eksl) ((eksl) a.j()).g(th);
        ekslVar.X(bzmz.c, str2);
        ekslVar.X(bzmz.d, str);
        ekslVar.X(bzmz.e, str3);
        ekslVar.X(bzmz.p, Integer.valueOf(i));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "executeFailure", 623, "CmsPayloadPartHandler.java")).q("CMS message updates backup: Failure while processing CmsPayloadPart.");
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        return byqp.a(th, i);
    }

    private final eiju e(final String str) {
        return this.n.a(bary.b(str)).h(new ejvr() { // from class: byxf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = byxt.a;
                return new byqt();
            }
        }, this.g).e(bzqe.class, new ejvr() { // from class: byxk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bzqe bzqeVar = (bzqe) obj;
                eksl ekslVar = (eksl) byxt.a.j();
                ekslVar.X(bzmz.c, str);
                ((eksl) ((eksl) ekslVar.g(bzqeVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "deleteMediaPartsForMessage", 489, "CmsPayloadPartHandler.java")).q("Deletion of blob ids failed for message");
                return new byqr(bzqeVar);
            }
        }, this.f);
    }

    @Override // defpackage.bypt
    public final eiju a(ekgb ekgbVar, Optional optional) {
        return eijx.d(new UnsupportedOperationException());
    }

    @Override // defpackage.bypt
    public final eiju b(final String str, final String str2, final int i, final boolean z) {
        eiju eijuVarE;
        boolean z2;
        Optional optionalF = this.e.f(bary.b(str2));
        if (cpyl.a() && i == bzas.a(9)) {
            eijuVarE = e(str2);
        } else if (optionalF.isEmpty()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(bzmz.d, str);
            ekslVar.X(bzmz.c, str2);
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "handlePotentialPartsDeletion", 401, "CmsPayloadPartHandler.java")).q("Message for this payload part not found");
            eijuVarE = i == byxy.a(5) ? e(str2) : eijx.e(new byqs());
        } else {
            eijuVarE = null;
        }
        if (eijuVarE != null) {
            return eijuVarE;
        }
        final cprt cprtVar = (cprt) optionalF.get();
        final MessageCoreData messageCoreDataA = cprtVar.a();
        if (messageCoreDataA.k() == 16) {
            eksl ekslVar2 = (eksl) a.h();
            ekslVar2.X(bzmz.d, str);
            ekslVar2.X(bzmz.c, str2);
            ekslVar2.X(bzmz.p, Integer.valueOf(i));
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 198, "CmsPayloadPartHandler.java")).q("Skip backing up parts for scheduled send message");
            return eijx.e(new byqs());
        }
        if (messageCoreDataA.k() == 3) {
            eksl ekslVar3 = (eksl) a.h();
            ekslVar3.X(bzmz.d, str);
            ekslVar3.X(bzmz.c, str2);
            ekslVar3.X(bzmz.p, Integer.valueOf(i));
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 209, "CmsPayloadPartHandler.java")).q("Skip updating draft message");
            return eijx.e(new byqs());
        }
        final String strAl = messageCoreDataA.al();
        if (!TextUtils.isEmpty(strAl)) {
            if (i != byxy.a(4)) {
                final cplt cpltVar = new cplt();
                final ekgp ekgpVar = (ekgp) Collection.EL.stream(messageCoreDataA.M()).filter(new Predicate() { // from class: byxl
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
                        return ((MessagePartCoreData) obj).bj();
                    }
                }).collect(ekcv.a(new Function() { // from class: byxm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((MessagePartCoreData) obj).W();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: byxn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cehg cehgVar = (cehg) this.a.j.b();
                        cehgVar.getClass();
                        eiju eijuVarE2 = cehgVar.e((MessagePartCoreData) obj);
                        eijuVarE2.getClass();
                        return eijuVarE2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                return eijx.j(ekgpVar.values()).a(new Callable() { // from class: byxo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar = byxt.a;
                        ekgp ekgpVar2 = ekgpVar;
                        final cpth cpthVar = cpltVar;
                        final MessageCoreData messageCoreData = messageCoreDataA;
                        Map.EL.forEach(ekgpVar2, new BiConsumer() { // from class: byxh
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                String str3 = (String) obj;
                                eiju eijuVar = (eiju) obj2;
                                eksp ekspVar2 = byxt.a;
                                cpth cpthVar2 = cpthVar;
                                try {
                                    cplv cplvVar = new cplv();
                                    cplvVar.a = (evqs) eork.q(eijuVar);
                                    cpthVar2.c(str3, cplvVar.a());
                                } catch (Exception e) {
                                    MessageCoreData messageCoreData2 = messageCoreData;
                                    eksl ekslVar4 = (eksl) byxt.a.j();
                                    ekslVar4.X(bzmz.c, messageCoreData2.C().b());
                                    ((eksl) ((eksl) ekslVar4.g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildCalculatedData", 305, "CmsPayloadPartHandler.java")).q("Failed to calculate thumbnails for this message.");
                                }
                            }

                            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                return BiConsumer$CC.$default$andThen(this, biConsumer);
                            }
                        });
                        return cpthVar.a();
                    }
                }, this.f).i(new eooz() { // from class: byxq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        char c;
                        eqnu eqnuVarA;
                        boolean z3;
                        ListenableFuture listenableFutureH;
                        eiju eijuVarD;
                        final byxt byxtVar = this.a;
                        final int i2 = i;
                        cprt cprtVar2 = cprtVar;
                        cpti cptiVar = (cpti) obj;
                        try {
                            ekgb ekgbVarG = cpsl.g(cprtVar2);
                            if (!ekgbVarG.isEmpty()) {
                                throw new cpyx("Missing message dependency", ekgb.n(ekgbVarG));
                            }
                            bnar bnarVarC = byxtVar.m.c(1);
                            byte[] bArrQ = bnarVarC == null ? null : bnarVarC.q();
                            if (bnarVarC == null || bArrQ == null) {
                                throw new cpny("No encryption key available in cmsTable");
                            }
                            cpts cptsVarA = byxtVar.d.a(cprtVar2, bnarVarC);
                            cptsVarA.b(cptiVar);
                            int iA = byxy.a(3);
                            boolean z4 = z;
                            final String str3 = str2;
                            if (i2 == iA) {
                                eqnuVarA = cptsVarA.a(cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED);
                                c = 0;
                            } else if (i2 == byxy.a(5)) {
                                if (!byxtVar.l.a()) {
                                    z3 = z4;
                                } else if (z4) {
                                    c = 0;
                                    eqnuVarA = cptsVarA.a(cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED);
                                } else {
                                    z3 = false;
                                }
                                c = 0;
                                bzrq bzrqVar = byxtVar.h;
                                MessageCoreData messageCoreDataA2 = cprtVar2.a();
                                evvp evvpVar = evxc.c;
                                bzrqVar.g(messageCoreDataA2, z3, evvpVar);
                                bzrqVar.f(cprtVar2.a(), z3, evvpVar);
                                eqnuVarA = cptsVarA.a(cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_RARELY_CHANGED);
                            } else {
                                c = 0;
                                if (!byxtVar.i.a() || !cpyl.a() || i2 != byxy.a(6)) {
                                    eksl ekslVar4 = (eksl) byxt.a.j();
                                    ekslVar4.X(bzmz.a, "PayloadPart");
                                    ekslVar4.X(bzmz.b, "Unidentified");
                                    ekslVar4.X(bzmz.c, str3);
                                    ekrz ekrzVar = bzmz.p;
                                    Integer numValueOf = Integer.valueOf(i2);
                                    ekslVar4.X(ekrzVar, numValueOf);
                                    ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildPayloadPart", 471, "CmsPayloadPartHandler.java")).q("Flags not recognized for PayloadPart");
                                    throw new byps(String.format("Flag %s does not indicate a update operation for entityType=%s", numValueOf, "PayloadPart"));
                                }
                                eqnuVarA = cptsVarA.a(cptl.OBJECT_PAYLOAD_PART_ADDITIONAL_FIELDS);
                            }
                            final String str4 = strAl;
                            final String str5 = str;
                            if (eqnuVarA == null) {
                                ekrw ekrwVarN = byxt.a.n();
                                ekrwVarN.X(bzmz.d, str5);
                                ekrwVarN.X(bzmz.c, str3);
                                ekrwVarN.X(bzmz.p, Integer.valueOf(i2));
                                ekrwVarN.X(bzmz.e, str4);
                                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "buildPayloadPart", 338, "CmsPayloadPartHandler.java")).q("PayloadPart not found. Skip.");
                                return eijx.e(new byqs());
                            }
                            final MessageCoreData messageCoreData = messageCoreDataA;
                            if (!cpyl.a() || !((Boolean) ((cczi) cpxw.c.get()).e()).booleanValue() || !((Boolean) ((cczi) cpyl.s.get()).e()).booleanValue()) {
                                String strAl2 = messageCoreData.al();
                                if (bypr.a(i2)) {
                                    eksl ekslVar5 = (eksl) byxt.b.h();
                                    ekslVar5.X(bzmz.a, "PayloadPart");
                                    ekslVar5.X(bzmz.b, "Update");
                                    ekslVar5.X(bzmz.c, str3);
                                    ekslVar5.X(bzmz.e, strAl2);
                                    ekslVar5.X(bzmz.p, Integer.valueOf(i2));
                                    ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "callCms", 577, "CmsPayloadPartHandler.java")).o();
                                    cpmc cpmcVar = byxtVar.c;
                                    evrv evrvVar = (evrv) evrw.a.createBuilder();
                                    evrvVar.a("extended_detail");
                                    listenableFutureH = cpmcVar.X(strAl2, eqnuVarA, (evrw) evrvVar.build(), z4);
                                } else {
                                    eksl ekslVar6 = (eksl) byxt.b.j();
                                    ekslVar6.X(bzmz.a, "PayloadPart");
                                    ekslVar6.X(bzmz.b, "Unidentified");
                                    ekslVar6.X(bzmz.c, str3);
                                    ekslVar6.X(bzmz.e, strAl2);
                                    ekrz ekrzVar2 = bzmz.p;
                                    Integer numValueOf2 = Integer.valueOf(i2);
                                    ekslVar6.X(ekrzVar2, numValueOf2);
                                    ((eksl) ekslVar6.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "callCms", 588, "CmsPayloadPartHandler.java")).q("Can't find operation for PayloadPart");
                                    Object[] objArr = new Object[2];
                                    objArr[c] = numValueOf2;
                                    objArr[1] = "PayloadPart";
                                    listenableFutureH = eork.h(new byps(String.format("Flag %s does not indicate a update operation for entityType=%s", objArr)));
                                }
                                eiju eijuVarG = eiju.g(listenableFutureH);
                                eooz eoozVar = new eooz() { // from class: byxs
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        eqnu eqnuVar = (eqnu) obj2;
                                        ekrw ekrwVarO = byxt.a.o();
                                        ekrwVarO.X(bzmz.c, str3);
                                        ekrwVarO.X(bzmz.d, str5);
                                        ekrwVarO.X(bzmz.e, str4);
                                        ekrwVarO.X(bzmz.p, Integer.valueOf(i2));
                                        ekrwVarO.X(bzmz.i, eqnuVar != null ? eqnuVar.c : "");
                                        ekrwVarO.X(bzmz.j, eqnuVar != null ? eqnuVar.f : "");
                                        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "executeSuccess", 611, "CmsPayloadPartHandler.java")).q("Processed CMS message updates backup");
                                        if (!((Boolean) ((cczi) cpyl.s.get()).e()).booleanValue() || !cpyl.a()) {
                                            return eijx.e(new byqt());
                                        }
                                        MessageCoreData messageCoreData2 = messageCoreData;
                                        byxt byxtVar2 = byxtVar;
                                        eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
                                        String strAl3 = messageCoreData2.al();
                                        eqncVar.copyOnWrite();
                                        eqnd eqndVar = (eqnd) eqncVar.instance;
                                        strAl3.getClass();
                                        eqndVar.c = strAl3;
                                        eqncVar.b("STATUS", String.valueOf(messageCoreData2.k()));
                                        eqnd eqndVar2 = (eqnd) eqncVar.build();
                                        evrv evrvVar2 = (evrv) evrw.a.createBuilder();
                                        evrvVar2.a("attributes");
                                        evrw evrwVar = (evrw) evrvVar2.build();
                                        eqmh eqmhVar = (eqmh) eqmi.a.createBuilder();
                                        eqmhVar.copyOnWrite();
                                        ((eqmi) eqmhVar.instance).d = true;
                                        return byxtVar2.c.ak(eqndVar2, evrwVar, (eqmi) eqmhVar.build()).h(new ejvr() { // from class: byxj
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj3) {
                                                eksp ekspVar = byxt.a;
                                                return new byqt();
                                            }
                                        }, byxtVar2.f);
                                    }
                                };
                                eosc eoscVar = byxtVar.g;
                                return eijuVarG.i(eoozVar, eoscVar).e(Throwable.class, new ejvr() { // from class: byxg
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        Throwable th = (Throwable) obj2;
                                        if ((byxtVar.k.a() || cpyl.a()) && (th instanceof Error)) {
                                            throw ((Error) th);
                                        }
                                        String str6 = str4;
                                        int i3 = i2;
                                        return byxt.d(th, str5, str3, i3, str6);
                                    }
                                }, eoscVar);
                            }
                            String strAl3 = messageCoreData.al();
                            if (bypr.a(i2)) {
                                eksl ekslVar7 = (eksl) byxt.b.h();
                                ekslVar7.X(bzmz.a, "PayloadPart");
                                ekslVar7.X(bzmz.b, "Update");
                                ekslVar7.X(bzmz.c, str3);
                                ekslVar7.X(bzmz.e, strAl3);
                                ekslVar7.X(bzmz.p, Integer.valueOf(i2));
                                ((eksl) ekslVar7.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "updateMessageAttributesAndPayloadPart", 511, "CmsPayloadPartHandler.java")).o();
                                eqnc eqncVar = (eqnc) eqnd.a.createBuilder();
                                String strAl4 = messageCoreData.al();
                                eqncVar.copyOnWrite();
                                eqnd eqndVar = (eqnd) eqncVar.instance;
                                strAl4.getClass();
                                eqndVar.c = strAl4;
                                eqncVar.b("STATUS", String.valueOf(messageCoreData.k()));
                                eqnr eqnrVar = (eqnr) eqns.a.createBuilder();
                                eqnrVar.a(eqnuVarA);
                                eqns eqnsVar = (eqns) eqnrVar.build();
                                eqncVar.copyOnWrite();
                                eqnd eqndVar2 = (eqnd) eqncVar.instance;
                                eqnsVar.getClass();
                                eqndVar2.i = eqnsVar;
                                eqndVar2.b |= 4;
                                eqnd eqndVar3 = (eqnd) eqncVar.build();
                                cpmc cpmcVar2 = byxtVar.c;
                                evrv evrvVar2 = (evrv) evrw.a.createBuilder();
                                evrvVar2.a("attributes");
                                evrvVar2.a("payload");
                                eijuVarD = cpmcVar2.V(eqndVar3, (evrw) evrvVar2.build(), eqmi.a, z4).h(new ejvr() { // from class: byxp
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        eksp ekspVar = byxt.a;
                                        return new byqt();
                                    }
                                }, byxtVar.f);
                            } else {
                                eksl ekslVar8 = (eksl) byxt.b.j();
                                ekslVar8.X(bzmz.a, "PayloadPart");
                                ekslVar8.X(bzmz.b, "Unidentified");
                                ekslVar8.X(bzmz.c, str3);
                                ekslVar8.X(bzmz.e, strAl3);
                                ekrz ekrzVar3 = bzmz.p;
                                Integer numValueOf3 = Integer.valueOf(i2);
                                ekslVar8.X(ekrzVar3, numValueOf3);
                                ((eksl) ekslVar8.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "updateMessageAttributesAndPayloadPart", 536, "CmsPayloadPartHandler.java")).q("Can't find operation for PayloadPart");
                                Object[] objArr2 = new Object[2];
                                objArr2[c] = numValueOf3;
                                objArr2[1] = "PayloadPart";
                                eijuVarD = eijx.d(new byps(String.format("Flag %s does not indicate a update operation for entityType=%s", objArr2)));
                            }
                            return eijuVarD.e(Throwable.class, new ejvr() { // from class: byxr
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    Throwable th = (Throwable) obj2;
                                    if ((byxtVar.k.a() || cpyl.a()) && (th instanceof Error)) {
                                        throw ((Error) th);
                                    }
                                    String str6 = str4;
                                    int i3 = i2;
                                    return byxt.d(th, str5, str3, i3, str6);
                                }
                            }, byxtVar.g);
                        } catch (RuntimeException e) {
                            return eijx.e(byqp.a(e, i2));
                        }
                    }
                }, this.g);
            }
            if (this.l.a()) {
                if (!z) {
                    z2 = false;
                }
                return eijx.e(new byqt());
            }
            z2 = z;
            bzrq bzrqVar = this.h;
            evvp evvpVar = evxc.c;
            bzrqVar.g(messageCoreDataA, z2, evvpVar);
            bzrqVar.f(messageCoreDataA, z2, evvpVar);
            return eijx.e(new byqt());
        }
        eksp ekspVar = a;
        eksl ekslVar4 = (eksl) ekspVar.h();
        ekrz ekrzVar = bzmz.d;
        ekslVar4.X(ekrzVar, str);
        ekrz ekrzVar2 = bzmz.c;
        ekslVar4.X(ekrzVar2, str2);
        ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 219, "CmsPayloadPartHandler.java")).q("Message for this payload part is not backed up");
        cpyi cpyiVarX = messageCoreDataA.X();
        if (((eoth) ((aotd) this.p).a.b()).a("bugle.log_media_with_invalid_cms_lifecycle_id_state") && cpyiVarX.a()) {
            eksl ekslVar5 = (eksl) ekspVar.j();
            ekslVar5.X(ekrzVar, str);
            ekslVar5.X(ekrzVar2, str2);
            ekslVar5.X(bzmz.f, cpyiVarX);
            ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsPayloadPartHandler", "processSingleItem", 230, "CmsPayloadPartHandler.java")).q("Message for this payload part does not have a CMS ID but has a CMS life cycle representing an item backed up.");
            this.o.e("Bugle.Cms.Media.Upload.MessageNoCmsIdAndBackedUpLifeCycle.Count", toa.a(cpyiVarX) - 1);
        }
        return eijx.e(new byqr(new cpyx("Missing message dependency", ekgb.r(new cpyp(str2, 3)))));
    }

    @Override // defpackage.bypt
    public final eiju c(String str, String str2, int i) {
        return b(str, str2, i, true).i(new eooz() { // from class: byxi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                byqv byqvVar = (byqv) obj;
                boolean z = byqvVar instanceof byqq;
                eksp ekspVar = byxt.a;
                if (!z && !(byqvVar instanceof byqr)) {
                    return eijx.e(true);
                }
                Throwable th = ((byqo) byqvVar).a;
                return th instanceof bzqe ? eijx.e(false) : eijx.d(th);
            }
        }, this.f);
    }
}
