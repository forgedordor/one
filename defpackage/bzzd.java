package defpackage;

import android.database.MatrixCursor;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzd implements bzwr {
    public static final cqce a = cqce.g("BugleCms", "CmsMessageBugleMergeHandlerImpl");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl");
    public static final brao[] c;
    public static final brao[] d;
    public final Optional e;
    private final fcsu f;
    private final eosc g;
    private final cajh h;
    private final Optional i;
    private final efwo j;
    private final apom k;
    private final apoi l;
    private final apoj m;
    private final appz n;

    static {
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.a;
        brao braoVar2 = branVar.M;
        brao braoVar3 = branVar.j;
        brao braoVar4 = branVar.n;
        brao braoVar5 = branVar.m;
        brao braoVar6 = branVar.k;
        brao braoVar7 = branVar.B;
        brao braoVar8 = branVar.D;
        brao braoVar9 = branVar.L;
        brao braoVar10 = branVar.N;
        brao braoVar11 = branVar.X;
        brao braoVar12 = branVar.G;
        brao braoVar13 = branVar.C;
        brao braoVar14 = branVar.af;
        brao braoVar15 = branVar.b;
        brao braoVar16 = branVar.i;
        c = new brao[]{braoVar, braoVar2, braoVar3, braoVar4, braoVar5, braoVar6, braoVar7, braoVar8, braoVar9, braoVar10, braoVar11, braoVar10, braoVar12, braoVar13, braoVar14, braoVar15, braoVar16};
        d = new brao[]{braoVar, braoVar2, braoVar3, braoVar4, braoVar5, braoVar6, braoVar7, braoVar8, braoVar9, braoVar10, braoVar11, braoVar10, braoVar12, braoVar13, braoVar14, braoVar15, braoVar16, branVar.ar};
    }

    public bzzd(fcsu fcsuVar, eosc eoscVar, cajh cajhVar, Optional optional, Optional optional2, efwo efwoVar, apom apomVar, apoi apoiVar, apoj apojVar, appz appzVar) {
        this.f = fcsuVar;
        this.g = eoscVar;
        this.h = cajhVar;
        this.i = optional;
        this.e = optional2;
        this.j = efwoVar;
        this.k = apomVar;
        this.l = apoiVar;
        this.m = apojVar;
        this.n = appzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ekgp d(Map map) {
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            MessagesTable.BindData bindData = (MessagesTable.BindData) entry.getValue();
            String strW = bindData.W();
            if (TextUtils.isEmpty(strW)) {
                ekrw ekrwVarJ = b.j();
                ekrwVarJ.X(eksq.a, "BugleCms");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicateForMmsPushNotification", 1860, "CmsMessageBugleMergeHandlerImpl.java")).t("Restoring a MMS_PUSH_NOTIFICATION with no mms_content_location. cms_id = %s", entry.getKey());
            } else {
                String[] strArr = MessagesTable.a;
                brec brecVar = new brec();
                brecVar.m(bindData.D());
                brecVar.ap(new dqpj("messages.mms_content_location", 1, String.valueOf(strW)));
                arrayList.add(brecVar);
                map2.put(strW, (String) entry.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            ekrw ekrwVarJ2 = b.j();
            ekrwVarJ2.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "findDuplicateForMmsPushNotification", 1876, "CmsMessageBugleMergeHandlerImpl.java")).r("There is no CMS messages to dedup, requested size = %s", map.size());
            return ekoj.a;
        }
        String[] strArr2 = MessagesTable.a;
        brec brecVar2 = new brec();
        brecVar2.j(cpyi.w);
        brecVar2.aq((brec[]) arrayList.toArray(new brec[0]));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(((Boolean) ((cczi) cpyl.V.get()).e()).booleanValue() ? d : c));
        arrayList2.add(MessagesTable.c.t);
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("findDuplicateForMmsPushNotification");
        brdrVarD.c((brao[]) arrayList2.toArray(new brao[0]));
        brdrVarD.k(new brdv(brecVar2));
        ekgb ekgbVarZ = brdrVarD.b().z();
        ekgi ekgiVar = new ekgi();
        int size = ekgbVarZ.size();
        for (int i = 0; i < size; i++) {
            MessagesTable.BindData bindData2 = (MessagesTable.BindData) ekgbVarZ.get(i);
            String str = (String) map2.get(bindData2.W());
            str.getClass();
            ekgiVar.i(str, bindData2);
        }
        return ekgiVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Optional e(ekgb ekgbVar) {
        Stream streamFilter = Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: bzxm
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
                cqce cqceVar = bzzd.a;
                return !TextUtils.isEmpty(((PartsTable.BindData) obj).L());
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar2 = (ekgb) streamFilter.collect(ekcv.a);
        return ekgbVar2.isEmpty() ? Optional.empty() : Optional.of((PartsTable.BindData) ekgbVar2.get(0));
    }

    public static String f(MessagesTable.BindData bindData) {
        return bindData.D().a + "_" + bindData.w();
    }

    public static String g(MessagesTable.BindData bindData) {
        return bindData.D().a + "_" + ((bindData.w() / 1000) * 1000);
    }

    public static String h(MessagesTable.BindData bindData) {
        return bindData.w() + "_" + bindData.D().a + "_" + bindData.s();
    }

    public static Function i(final MessagesTable.BindData bindData) {
        return bindData.m() != 0 ? new Function() { // from class: bzyb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = bzzd.a;
                final MessagesTable.BindData bindData2 = bindData;
                brecVar.b(new Function() { // from class: bzxz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar2 = (brec) obj2;
                        cqce cqceVar2 = bzzd.a;
                        brecVar2.P((bindData2.w() / 1000) * 1000);
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: bzyk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        brec brecVar2 = (brec) obj2;
                        cqce cqceVar2 = bzzd.a;
                        brecVar2.P(bindData2.w());
                        return brecVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        } : new Function() { // from class: bzya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = bzzd.a;
                brecVar.P(bindData.w());
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
    }

    private static int l(boolean z) {
        return z ? 1 : 0;
    }

    private static boolean m(MessagesTable.BindData bindData, MessagesTable.BindData bindData2) {
        return !((Boolean) ((cczi) cpyl.V.get()).e()).booleanValue() ? Objects.equals(bindData.U(), bindData2.U()) && bindData.m() == bindData2.m() && bindData.ai() == bindData2.ai() && bindData.ah() == bindData2.ah() && bindData.s() == bindData2.s() && Objects.equals(bindData.S(), bindData2.S()) && bindData.o() == bindData2.o() && Objects.equals(bindData.V(), bindData2.V()) && bindData.t() == bindData2.t() && Objects.equals(bindData.T(), bindData2.T()) && bindData.ag() == bindData2.ag() && Objects.equals(bindData.I(), bindData2.I()) && bindData.P() == cpyi.MERGED_FROM_CMS : Objects.equals(bindData.U(), bindData2.U()) && bindData.m() == bindData2.m() && bindData.ai() == bindData2.ai() && bindData.ah() == bindData2.ah() && bindData.s() == bindData2.s() && Objects.equals(bindData.S(), bindData2.S()) && bindData.o() == bindData2.o() && Objects.equals(bindData.V(), bindData2.V()) && bindData.t() == bindData2.t() && Objects.equals(bindData.T(), bindData2.T()) && bindData.ag() == bindData2.ag() && Objects.equals(bindData.I(), bindData2.I()) && bindData.P() == cpyi.MERGED_FROM_CMS && bindData.R().equals(bindData2.R());
    }

    @Override // defpackage.bzwr
    public final eiju a(final MessagesTable.BindData bindData, final MessagesTable.BindData bindData2, final ekgb ekgbVar, final epjf epjfVar) {
        return eijx.f(new Runnable() { // from class: bzxx
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.a.k(bindData, bindData2, ekgbVar, epjfVar, false);
            }
        }, this.g).f(bzyy.class, new eooz() { // from class: bzxy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqce cqceVar = bzzd.a;
                return eijx.d((bzyy) obj);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bzwr
    public final ekgp b(Map map) {
        if (((Boolean) ((cczi) cpyl.V.get()).e()).booleanValue()) {
            final ekgp ekgpVar = (ekgp) Collection.EL.stream(map.values()).filter(new Predicate() { // from class: bzyh
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
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cqce cqceVar = bzzd.a;
                    return bindData.R() != null && bindData.R().isPresent();
                }
            }).collect(ekcv.a(new Function() { // from class: bzyi
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((MessagesTable.BindData) obj).R();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bzyj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cqce cqceVar = bzzd.a;
                    return bindData;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            if (!ekgpVar.isEmpty()) {
                eieu eieuVarK = eiiy.k("CmsMessageMergeHandler#findDuplicateByMessagePersistenceIds");
                try {
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("findDuplicateByMessagePersistenceIds");
                    brdrVarD.h(new Function() { // from class: bzyl
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            cqce cqceVar = bzzd.a;
                            ekhx ekhxVarKeySet = ekgpVar.keySet();
                            int iIntValue = MessagesTable.g().intValue();
                            if (iIntValue < 60370) {
                                dqru.x("message_persistence_id", iIntValue);
                            }
                            ekfw ekfwVar = new ekfw();
                            Iterator<E> it = ekhxVarKeySet.iterator();
                            while (it.hasNext()) {
                                ekfwVar.h(String.valueOf(basg.b((Optional) it.next())));
                            }
                            brecVar.ap(new dqpm("messages.message_persistence_id", 3, brec.as(ekfwVar.g()), false));
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brdrVarD.c(d);
                    ekgp ekgpVar2 = (ekgp) Collection.EL.stream(((ekgp) Collection.EL.stream(brdrVarD.b().z()).collect(ekcv.a(new Function() { // from class: bzym
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cqce cqceVar = bzzd.a;
                            return ((UUID) ((MessagesTable.BindData) obj).R().get()).toString();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bzyn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                            cqce cqceVar = bzzd.a;
                            return bindData;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }))).entrySet()).filter(new Predicate() { // from class: bzyo
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
                            cqce cqceVar = bzzd.a;
                            return ekgpVar.get(Optional.of(UUID.fromString((String) ((Map.Entry) obj).getKey()))) != null;
                        }
                    }).collect(ekcv.a(new Function() { // from class: bzyp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            cqce cqceVar = bzzd.a;
                            MessagesTable.BindData bindData = (MessagesTable.BindData) ekgpVar.get(Optional.of(UUID.fromString((String) ((Map.Entry) obj).getKey())));
                            bindData.getClass();
                            bindData.U().getClass();
                            return bindData.U();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bzyq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (MessagesTable.BindData) ((Map.Entry) obj).getValue();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }));
                    eieuVarK.close();
                    return ekgpVar2;
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
        return ekoj.a;
    }

    @Override // defpackage.bzwr
    public final ekgp c(Map map) {
        final Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return ekoj.a;
        }
        eieu eieuVarK = eiiy.k("CmsMessageMergeHandler#findDupByCmsIds");
        try {
            brdr brdrVarD = MessagesTable.d();
            brdrVarD.A("findDuplicationByCmsIds");
            brdrVarD.h(new Function() { // from class: bzwx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    cqce cqceVar = bzzd.a;
                    brecVar.g(setKeySet);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brdrVarD.c(d);
            ekgp ekgpVar = (ekgp) Collection.EL.stream(brdrVarD.b().z()).filter(new Predicate() { // from class: bzwy
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
                    cqce cqceVar = bzzd.a;
                    return ((MessagesTable.BindData) obj).U() != null;
                }
            }).collect(ekcv.a(new Function() { // from class: bzwz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = bzzd.a;
                    return ejwk.b(((MessagesTable.BindData) obj).U());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: bzxa
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
                    cqce cqceVar = bzzd.a;
                    return bindData;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            eieuVarK.close();
            return ekgpVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(MatrixCursor matrixCursor, bzzn bzznVar) {
        MessagesTable.BindData bindDataA = bzznVar.a();
        MessagesTable.BindData bindDataB = bzznVar.b();
        MessageIdType messageIdTypeE = bindDataA.E();
        if (bindDataB.m() == 2 && bindDataA.m() == 1) {
            bquu bquuVarJ = bindDataB.J();
            bquuVarJ.P(bindDataA.m());
            bquuVarJ.Z(bindDataA.ai());
            bquuVarJ.aq(bindDataA.s());
            bindDataB = bquuVarJ.a();
        }
        if (this.n.a() && bindDataA.ai()) {
            bquu bquuVarJ2 = bindDataB.J();
            bquuVarJ2.Z(bindDataA.ai());
            bindDataB = bquuVarJ2.a();
        }
        if (m(bindDataA, bindDataB)) {
            ekrw ekrwVarH = b.h();
            ekrwVarH.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/mergehandlers/CmsMessageBugleMergeHandlerImpl", "addRowToOverwriteMatrix", 842, "CmsMessageBugleMergeHandlerImpl.java")).D("Skip batched update (new) of identical message bugleDbId=%s cmsId=%s", bindDataA.E().b(), bindDataB.U());
        } else {
            String str = !TextUtils.isEmpty(basd.d(bindDataB.I())) ? bindDataB.I().b : !TextUtils.isEmpty(basd.d(bindDataA.I())) ? bindDataA.I().b : null;
            if (((Boolean) ((cczi) cpyl.V.get()).e()).booleanValue()) {
                matrixCursor.addRow(new Object[]{Long.valueOf(messageIdTypeE.a), bindDataB.U(), Integer.valueOf(bindDataB.m()), Integer.valueOf(l(bindDataB.ah())), Integer.valueOf(bindDataB.s()), Integer.valueOf(l(bindDataB.ai())), bindDataB.S(), Integer.valueOf(bindDataB.o()), bindDataB.V(), Long.valueOf(bindDataB.t()), bindDataB.T(), Integer.valueOf(l(bindDataB.ag())), str, bindDataB.P(), ((UUID) bindDataB.R().get()).toString()});
            } else {
                matrixCursor.addRow(new Object[]{Long.valueOf(messageIdTypeE.a), bindDataB.U(), Integer.valueOf(bindDataB.m()), Integer.valueOf(l(bindDataB.ah())), Integer.valueOf(bindDataB.s()), Integer.valueOf(l(bindDataB.ai())), bindDataB.S(), Integer.valueOf(bindDataB.o()), bindDataB.V(), Long.valueOf(bindDataB.t()), bindDataB.T(), Integer.valueOf(l(bindDataB.ag())), str, bindDataB.P()});
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c8 A[Catch: all -> 0x0603, TRY_ENTER, TryCatch #1 {all -> 0x0603, blocks: (B:83:0x02a3, B:89:0x02c8, B:91:0x02d7, B:92:0x02df, B:94:0x02e5), top: B:215:0x02a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r32, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r33, defpackage.ekgb r34, defpackage.epjf r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzzd.k(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, ekgb, epjf, boolean):void");
    }
}
