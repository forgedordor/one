package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axcl implements awvj {
    public static final eksp a = eksp.c("BugleSelfIdentity");
    public final dqsn b;
    public final arpa c;
    private final fcsu d;
    private final fcyh e;

    public axcl(dqsn dqsnVar, fcsu fcsuVar, fcyh fcyhVar, arpa arpaVar) {
        dqsnVar.getClass();
        fcsuVar.getClass();
        fcyhVar.getClass();
        this.b = dqsnVar;
        this.d = fcsuVar;
        this.e = fcyhVar;
        this.c = arpaVar;
    }

    public static final void n(final axcm axcmVar) {
        String[] strArr = awxh.a;
        awwx awwxVar = new awwx();
        awwxVar.f("MyIdentityTablesOperations#deleteIdentity");
        awwxVar.b = new awxf((awxg) new Function() { // from class: axbr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awxg awxgVar = (awxg) obj;
                eksp ekspVar = axcl.a;
                awxgVar.f(axcmVar);
                return awxgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new awxg()));
        awwxVar.d();
    }

    public static final awvq o(awxn awxnVar, axcm axcmVar) {
        String[] strArr = awxh.a;
        awvv awvvVar = new awvv();
        awvvVar.i(awxnVar.b());
        Optional optionalD = awxnVar.d();
        optionalD.getClass();
        awvvVar.c((String) fdct.b(optionalD));
        awvvVar.d(awxnVar.a());
        awvvVar.g(awxnVar.i());
        awvvVar.f(awxnVar.h());
        Optional optionalG = awxnVar.g();
        optionalG.getClass();
        awvvVar.h((String) fdct.b(optionalG));
        awvvVar.e(axcmVar);
        return awvvVar.a();
    }

    private final boolean p(final axfv axfvVar, final axcm axcmVar) {
        Object objC = this.b.c("MyIdentityTablesOperations#updateSubscriptionsIfChanged", new ejxr() { // from class: axbf
            @Override // defpackage.ejxr
            public final Object get() {
                String strA;
                String strK;
                eksp ekspVar = axcl.a;
                final axfv axfvVar2 = axfvVar;
                String str = axfvVar2.b;
                int i = axfvVar2.a;
                axdh axdhVar = (axdh) fcva.Y(axcb.a(i, str));
                final axcm axcmVar2 = axcmVar;
                if (axdhVar == null) {
                    String[] strArr = axer.a;
                    axdm axdmVar = new axdm();
                    axdmVar.f(i);
                    axdmVar.e(str);
                    axdmVar.c(axcmVar2);
                    if (axfvVar2.a() != null) {
                        axdmVar.g(axfvVar2.a());
                    }
                    axdh axdhVarB = axdmVar.b(new Supplier() { // from class: axdk
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new axdi();
                        }
                    });
                    final dqsy dqsyVarB = axer.b();
                    dqru.b(axer.b(), "subscriptions", axdhVarB, new Function() { // from class: axdb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Long.valueOf(dqsyVarB.P("subscriptions", (dqst) obj));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: axdc
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return true;
                }
                final axcm axcmVarE = axdhVar.e();
                if (axcmVarE != null && !fdbq.f(axcmVarE, axcmVar2) && (strA = axfvVar2.a()) != null && strA.length() != 0 && ((strK = axdhVar.k()) == null || strK.length() == 0)) {
                    if (fdbq.f(axcmVarE, axcmVar2)) {
                        throw new IllegalStateException("The nonCanonicalToken and canonicalToken should be different");
                    }
                    String[] strArr2 = awxh.a;
                    awxe awxeVar = new awxe();
                    awxeVar.ap("canonicalizeMyIdentity");
                    int iIntValue = awxh.c().intValue();
                    int iIntValue2 = awxh.c().intValue();
                    if (iIntValue2 < 60530) {
                        dqru.x("canonical_token", iIntValue2);
                    }
                    if (iIntValue >= 60530) {
                        if (axcmVar2.equals(null)) {
                            awxeVar.a.putNull("canonical_token");
                        } else {
                            awxeVar.a.put("canonical_token", axcn.b(axcmVar2));
                        }
                    }
                    awxeVar.f(new Function() { // from class: axbb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            awxg awxgVar = (awxg) obj;
                            eksp ekspVar2 = axcl.a;
                            final axcm axcmVar3 = axcmVarE;
                            final axcm axcmVar4 = axcmVar2;
                            awxgVar.b(new Function() { // from class: axbg
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    awxg awxgVar2 = (awxg) obj2;
                                    eksp ekspVar3 = axcl.a;
                                    int iIntValue3 = awxh.c().intValue();
                                    if (iIntValue3 < 60530) {
                                        dqru.x("canonical_token", iIntValue3);
                                    }
                                    axcm axcmVar5 = axcmVar4;
                                    awxgVar2.ap(new dqpj("my_identities.canonical_token", 1, axcn.b(axcmVar3)));
                                    awxgVar2.g(axcmVar5);
                                    return awxgVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: axbh
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    awxg awxgVar2 = (awxg) obj2;
                                    eksp ekspVar3 = axcl.a;
                                    awxgVar2.f(axcmVar3);
                                    return awxgVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return awxgVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int iE = awxeVar.b().e();
                    eksl ekslVar = (eksl) axcl.a.h();
                    ekslVar.X(cqnc.z, axcmVarE);
                    ekslVar.r("Canonicalize MyIdentities count %s", iE);
                }
                String[] strArr3 = axer.a;
                axeo axeoVar = new axeo();
                axeoVar.ap("updateSubscriptionsIfChanged");
                axeoVar.d(axcmVar2);
                if (axfvVar2.a() != null) {
                    axeoVar.f(axfvVar2.a());
                }
                axeoVar.af(new axep((axeq) new Function() { // from class: axbd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        axeq axeqVar = (axeq) obj;
                        eksp ekspVar2 = axcl.a;
                        axfv axfvVar3 = axfvVar2;
                        axeqVar.d(axfvVar3.a);
                        axeqVar.c(axfvVar3.b);
                        return axeqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new axeq())));
                return Boolean.valueOf(axeoVar.c().e() != 0);
            }
        });
        objC.getClass();
        return ((Boolean) objC).booleanValue();
    }

    private static final axcc q(axcm axcmVar, axfv axfvVar) {
        String[] strArr = awxh.a;
        awxe awxeVar = new awxe();
        axcb.c(awxeVar, axfvVar.d);
        axcb.e(awxeVar, axfvVar.e);
        return new axcc(axcmVar, awxeVar.c(axcmVar));
    }

    @Override // defpackage.awvj
    public final awxj a(final Iterable iterable) {
        Object objC = this.b.c("MyIdentityTablesOperations#updateSubscriptionsAndIdentities", new ejxr() { // from class: axbc
            @Override // defpackage.ejxr
            public final Object get() {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(fcva.p(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    axcc axccVarL = this.l((axfv) it.next());
                    linkedHashSet.add(axccVarL.a);
                    arrayList.add(Boolean.valueOf(axccVarL.b));
                }
                Iterator it2 = arrayList.iterator();
                boolean zBooleanValue = false;
                while (it2.hasNext()) {
                    zBooleanValue |= ((Boolean) it2.next()).booleanValue();
                }
                return new awxj(linkedHashSet, zBooleanValue);
            }
        });
        objC.getClass();
        return (awxj) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awvj
    public final axcm b(final String str) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("MyIdentityTablesOperations#getTokenFromSelfParticipantIdLegacy");
        bsboVarE.h(new Function() { // from class: axbm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                eksp ekspVar = axcl.a;
                bsbxVar.k(str);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.e(new Function() { // from class: axbn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                eksp ekspVar = axcl.a;
                return new brzi[]{brzhVar.c, brzhVar.d, brzhVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = bsboVarE.b().z();
        ekgbVarZ.getClass();
        final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) fcva.X(ekgbVarZ);
        if (bindData.r() < -1) {
            throw new IllegalStateException("The given selfParticipantId points to a remote participant");
        }
        if (bindData.B() != null) {
            axcm axcmVarB = bindData.B();
            axcmVarB.getClass();
            return axcmVarB;
        }
        axem axemVarA = axer.a();
        axemVarA.A("MyIdentityTablesOperations#queryForSelfId");
        axemVarA.c(new Function() { // from class: axbo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axeq axeqVar = (axeq) obj;
                eksp ekspVar = axcl.a;
                axeqVar.d(bindData.r());
                axeqVar.b();
                return axeqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        String strT = bindData.T();
        axemVarA.C((strT == null || strT.length() == 0) ? new dqxl("$V IS NULL ASC", new Object[]{axer.c.c}) : new dqxl("$V=$V DESC", new Object[]{axer.c.c, bindData.T()}));
        axemVarA.y(1);
        axea axeaVar = (axea) axemVarA.b().q(axer.c.e);
        try {
            ekgb ekgbVarC = axeaVar.c();
            axeaVar.close();
            axcm axcmVar = (axcm) ekgbVarC.get(0);
            eksl ekslVar = (eksl) a.j();
            ekslVar.X(cqnc.w, Integer.valueOf(bindData.r()));
            ekslVar.D("null MyIdentity token in self participant row, find %s in Subscriptions for %s", axcmVar, bindData);
            return axcmVar;
        } catch (Throwable th) {
            try {
                axeaVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.awvj
    public final Object c(fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new axcd(null, this), fcxyVar);
    }

    @Override // defpackage.awvj
    public final Object d(Iterable iterable, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new axce(null, iterable, this), fcxyVar);
    }

    @Override // defpackage.awvj
    public final Object e(axcm axcmVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new axcg(null, this, axcmVar), fcxyVar);
    }

    @Override // defpackage.awvj
    public final Object f(Iterable iterable, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new axci(null, iterable, this), fcxyVar);
    }

    @Override // defpackage.awvj
    public final Object g(cmmh cmmhVar, dggk dggkVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.e), new axcj(null, this, dggkVar, cmmhVar), fcxyVar);
    }

    @Override // defpackage.awvj
    public final void h(final awxn awxnVar, final Iterable iterable) {
        awxnVar.getClass();
        eksl ekslVar = (eksl) a.h();
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((awxn) it.next()).b());
        }
        ekslVar.D("Conflating MyIdentities %s with canonical %s", arrayList, awxnVar.b());
        dqsn dqsnVar = this.b;
        dqsb dqsbVar = new dqsb("MyIdentityTablesOperations#conflateExistingIdentities");
        ejxr ejxrVar = new ejxr() { // from class: axbu
            @Override // defpackage.ejxr
            public final Object get() {
                awxn awxnVar2 = awxnVar;
                axcl.n(awxnVar2.b());
                Iterable iterable2 = iterable;
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    axcm axcmVarB = ((awxn) it2.next()).b();
                    axcm axcmVarB2 = awxnVar2.b();
                    String[] strArr = awxh.a;
                    awxe awxeVar = new awxe();
                    awxeVar.ap("MyIdentityTablesOperations#updateTokenAndDeleteIdentity");
                    awxeVar.a.put("token", axcn.b(axcmVarB2));
                    awxeVar.c(axcmVarB);
                    axcl.n(axcmVarB2);
                }
                ArrayList arrayList2 = new ArrayList();
                awvq awvqVarO = axcl.o(awxnVar2, null);
                awvqVarO.getClass();
                arrayList2.add(awvqVarO);
                ArrayList arrayList3 = new ArrayList(fcva.p(iterable2, 10));
                Iterator it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(axcl.o((awxn) it3.next(), awxnVar2.b()));
                }
                arrayList2.addAll(arrayList3);
                awvq[] awvqVarArr = (awvq[]) arrayList2.toArray(new awvq[0]);
                dqru.B(awxh.b(), 3, false, new BiConsumer() { // from class: awvm
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String[] strArr2 = awxh.a;
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, (awvq[]) Arrays.copyOf(awvqVarArr, awvqVarArr.length));
                return fctx.a;
            }
        };
        dqsw dqswVarC = dqsx.c();
        dqswVarC.b(true);
        dqsnVar.j(dqsbVar, ejxrVar, dqswVarC.a());
    }

    @Override // defpackage.awyr
    public final axcm i(final int i, final String str, final alqm alqmVar) {
        Object next;
        if (i < -1) {
            throw new IllegalStateException("Check failed.");
        }
        if (str != null && str.length() != 0 && i >= 0) {
            Object objC = this.b.c("getOrCreateMyIdentityViaUpdateHelper", new ejxr() { // from class: axbv
                @Override // defpackage.ejxr
                public final Object get() {
                    return this.a.l(new axfv(i, str, alqmVar, (String) null, 24)).a;
                }
            });
            objC.getClass();
            return (axcm) objC;
        }
        axem axemVarA = axer.a();
        axemVarA.A("querySubWithUnknownIccId");
        axemVarA.c(new Function() { // from class: axbw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axeq axeqVar = (axeq) obj;
                eksp ekspVar = axcl.a;
                axeqVar.d(i);
                axdy axdyVar = axer.c;
                dqoh dqohVar = (dqoh) axdyVar.e.a;
                if (dqohVar.h <= ((Integer) ((dqsy) dqohVar.i.get()).M().c.get()).intValue()) {
                    axeqVar.b();
                    return axeqVar;
                }
                axeqVar.ar(new dqxl("$V NOT NULL", new Object[]{axdyVar.d}));
                return axeqVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = axemVarA.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        Iterator<E> it = ekgbVarZ.iterator();
        while (it.hasNext()) {
            arrayList.add(new axch((axdh) it.next()));
        }
        if (arrayList.size() == 1) {
            return ((axch) arrayList.get(0)).a;
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (fdbq.f(((axch) next).b, "unknown_iccid")) {
                break;
            }
        }
        axch axchVar = (axch) next;
        if (axchVar != null) {
            return axchVar.a;
        }
        Object objC2 = this.b.c("createIdentityForSubWithUnknownIccId", new ejxr() { // from class: axbx
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = axcl.a;
                String[] strArr = awxh.a;
                awvv awvvVar = new awvv();
                awvvVar.i(new axcm(UUID.randomUUID()));
                awvvVar.d(awxl.a);
                awvq awvqVarB = awvvVar.b(new Supplier() { // from class: awvs
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new awvr();
                    }
                });
                awvqVarB.k();
                axcm axcmVarD = awvqVarB.d();
                axcmVarD.getClass();
                eksl ekslVar = (eksl) axcl.a.h();
                ekrz ekrzVar = cqnc.w;
                final int i2 = i;
                ekslVar.X(ekrzVar, Integer.valueOf(i2));
                ekslVar.t("Create new MyIdentity %s with unknown ICCID and MSISDN", axcmVarD);
                String[] strArr2 = axer.a;
                axdm axdmVar = new axdm();
                axdmVar.f(i2);
                axdmVar.e("unknown_iccid");
                axdmVar.c(axcmVarD);
                final axdh axdhVarA = axdmVar.a();
                final axep axepVar = new axep((axeq) new Function() { // from class: axbi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        axeq axeqVar = (axeq) obj;
                        eksp ekspVar2 = axcl.a;
                        axeqVar.d(i2);
                        axeqVar.c("unknown_iccid");
                        return axeqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new axeq()));
                final dqsy dqsyVarB = axer.b();
                ((Boolean) dqsyVarB.o(new ejxr() { // from class: axdd
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String[] strArr3 = axer.a;
                        axeo axeoVar = new axeo();
                        axdh axdhVar = axdhVarA;
                        axeoVar.f(axdhVar.k());
                        axeoVar.d(axdhVar.e());
                        axdhVar.aA(4, "my_identity_token_with_foreign_key");
                        axeoVar.e(axdhVar.e);
                        axeoVar.al();
                        axeoVar.af(axepVar);
                        axeoVar.an(new dqsb("subscriptions", "-updateOrInsert-update"));
                        if (axeoVar.c().e() != 0) {
                            return true;
                        }
                        final dqsy dqsyVar = dqsyVarB;
                        return Boolean.valueOf(dqru.b(axer.b(), "subscriptions", axdhVar, new Function() { // from class: axde
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Long.valueOf(dqsyVar.O("subscriptions", (dqst) obj));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: axdf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        }) != -1);
                    }
                })).booleanValue();
                return axcmVarD;
            }
        });
        objC2.getClass();
        return (axcm) objC2;
    }

    public final alqm j(String str) {
        alrj alrjVar = (alrj) this.d.b();
        ejxr ejxrVar = new ejxr() { // from class: axaz
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = axcl.a;
                return Optional.empty();
            }
        };
        if (str == null) {
            str = "";
        }
        return alrjVar.c(str, ejxrVar);
    }

    public final awxn k(awzp awzpVar) {
        awxl awxlVar;
        axcm axcmVar;
        String str;
        if (awzpVar.e().length != awzpVar.f().length) {
            throw new IllegalStateException("SubIds length " + awzpVar.e().length + " != sim iccIds length " + awzpVar.f().length);
        }
        awtr awtrVar = new awtr();
        awtrVar.a(false);
        awzpVar.aA(0, "token");
        axcm axcmVar2 = awzpVar.a;
        if (axcmVar2 == null) {
            throw new NullPointerException("Null token");
        }
        awtrVar.f = axcmVar2;
        awtrVar.c = Optional.ofNullable(awzpVar.d());
        awzpVar.aA(4, "address_type");
        awxl awxlVar2 = awzpVar.e;
        if (awxlVar2 == null) {
            throw new NullPointerException("Null addressType");
        }
        awtrVar.d = awxlVar2;
        Optional optionalOfNullable = Optional.ofNullable(awzpVar.d());
        final fdap fdapVar = new fdap() { // from class: axbj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return this.a.j((String) obj);
            }
        };
        Optional map = optionalOfNullable.map(new Function() { // from class: axbq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = axcl.a;
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map == null) {
            throw new NullPointerException("Null messagingIdentity");
        }
        awtrVar.e = map;
        awzpVar.aA(6, "display_name");
        String str2 = awzpVar.f;
        if (str2 == null) {
            str2 = "";
        }
        awtrVar.h = str2;
        awzpVar.aA(2, "provisioning_id_v2");
        String str3 = awzpVar.c;
        if (str3 == null || str3.length() == 0) {
            str3 = null;
        }
        awtrVar.i = Optional.ofNullable(str3);
        awzpVar.aA(1, "canonical_token");
        awtrVar.g = Optional.ofNullable(awzpVar.b);
        awzpVar.aA(3, "is_verified_v2");
        awtrVar.a(awzpVar.d);
        int length = awzpVar.e().length;
        for (int i = 0; i < length; i++) {
            int[] iArr = awzpVar.g;
            if (i >= iArr.length) {
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(awzpVar.g.length)));
            }
            int i2 = iArr[i];
            String[] strArr = awzpVar.h;
            if (i >= strArr.length) {
                throw new IndexOutOfBoundsException(String.format("index %d not in range 0 ... %d", Integer.valueOf(i), Integer.valueOf(awzpVar.h.length)));
            }
            String str4 = strArr[i];
            if (awtrVar.a == null) {
                awtrVar.a = new ekhv();
            }
            awtrVar.a.c(new axcw(i2, str4));
        }
        ekhv ekhvVar = awtrVar.a;
        if (ekhvVar != null) {
            awtrVar.b = ekhvVar.g();
        } else if (awtrVar.b == null) {
            awtrVar.b = ekon.a;
        }
        if (awtrVar.k == 1 && (awxlVar = awtrVar.d) != null && (axcmVar = awtrVar.f) != null && (str = awtrVar.h) != null) {
            return new awts(awtrVar.b, awtrVar.c, awxlVar, awtrVar.e, axcmVar, awtrVar.g, str, awtrVar.i, awtrVar.j);
        }
        StringBuilder sb = new StringBuilder();
        if (awtrVar.d == null) {
            sb.append(" addressType");
        }
        if (awtrVar.f == null) {
            sb.append(" token");
        }
        if (awtrVar.h == null) {
            sb.append(" displayName");
        }
        if (awtrVar.k == 0) {
            sb.append(" isVerified");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.axcc l(final defpackage.axfv r12) {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axcl.l(axfv):axcc");
    }

    public final Iterable m() {
        ekgb<awzp> ekgbVarZ = axcb.b("MyIdentityTablesOperations#getAllMyIdentities").b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (awzp awzpVar : ekgbVarZ) {
            awzpVar.getClass();
            arrayList.add(k(awzpVar));
        }
        return arrayList;
    }
}
