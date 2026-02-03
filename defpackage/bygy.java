package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bygy;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bygy implements caaq {
    public static final cqce a = cqce.g("BugleCms", "BackupSelfParticipantWorkItemProcessor");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor");
    public final apow c;
    public final eosc d;
    public final eosc e;
    public final aurx f;
    public final aukz g;
    public final apoy h;
    public final cprh i;

    /* compiled from: PG */
    public interface a {
        cpmd ft();

        Map hc();
    }

    public bygy(aurx aurxVar, apow apowVar, eosc eoscVar, eosc eoscVar2, aukz aukzVar, cprh cprhVar, apoy apoyVar) {
        this.f = aurxVar;
        this.c = apowVar;
        this.d = eoscVar;
        this.e = eoscVar2;
        this.g = aukzVar;
        this.i = cprhVar;
        this.h = apoyVar;
    }

    public static final cbcw e(cabo caboVar) {
        cpyo cpyoVarB = cpyo.b(caboVar.e);
        if (cpyoVarB == null) {
            cpyoVarB = cpyo.CMS_FEATURE_UNDEFINED;
        }
        if (cpyl.a()) {
            cpyo cpyoVar = cpyo.CMS_FEATURE_BACKUP_AND_RESTORE;
            if (cpyoVarB.equals(cpyoVar)) {
                bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
                bzzwVar.copyOnWrite();
                bzzx bzzxVar = (bzzx) bzzwVar.instance;
                bzzxVar.d = cpyoVar.d;
                bzzxVar.b |= 2;
                int i = caboVar.c;
                bzzwVar.copyOnWrite();
                bzzx bzzxVar2 = (bzzx) bzzwVar.instance;
                bzzxVar2.b |= 1;
                bzzxVar2.c = i;
                return cbcw.j(ekgb.r(byhe.a((bzzx) bzzwVar.build())));
            }
        }
        return cbcw.j(ekgb.r(cabq.a(caboVar)));
    }

    @Override // defpackage.caas
    public final /* synthetic */ int a(Object obj) {
        return ((cabo) obj).c;
    }

    public final eiju b() {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("BackupSelfParticipantWorkHandler.getSelfParticipant");
        bsbx bsbxVar = new bsbx();
        bsbxVar.v(-1);
        bsboVarE.g(bsbxVar);
        bsboVarE.y(1);
        return bsboVarE.b().x().h(new ejvr() { // from class: bygl
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVar = (ekgb) obj;
                if (ekgbVar.size() == 1) {
                    return (ParticipantsTable.BindData) ekgbVar.get(0);
                }
                bygy.a.n("Could not find a SELF participant");
                throw new bygz();
            }
        }, this.d);
    }

    @Override // defpackage.caaq
    public final /* bridge */ /* synthetic */ eiju c(final cayy cayyVar, Object obj, Object obj2) {
        eiju eijuVarD;
        final a aVar = (a) obj;
        final cabo caboVar = (cabo) obj2;
        if (this.h.a()) {
            eiju eijuVarI = this.f.i();
            eooz eoozVar = new eooz() { // from class: bygi
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    boolean zEquals = ((evvp) obj3).equals(evxc.c);
                    final bygy bygyVar = this.a;
                    final cayy cayyVar2 = cayyVar;
                    final bygy.a aVar2 = aVar;
                    return !zEquals ? bygyVar.b().i(new eooz() { // from class: bygu
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj4) {
                            bygy bygyVar2 = bygyVar;
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj4;
                            String strB = bygyVar2.i.b(null, true);
                            bsbs bsbsVarF = ParticipantsTable.f();
                            bsbsVarF.ap("processCmsWorkItemAsync#setCmsId");
                            bsbsVarF.g(strB);
                            int iA = bsbsVarF.a(-1);
                            cayy cayyVar3 = cayyVar2;
                            bygy.a aVar3 = aVar2;
                            if (iA <= 0) {
                                return bygyVar2.d(eijx.e(bindData), 17, cayyVar3, aVar3);
                            }
                            brvp brvpVarC = bindData.C();
                            brvpVarC.f(strB);
                            return bygyVar2.d(eijx.e(brvpVarC.a()), 33, cayyVar3, aVar3);
                        }
                    }, bygyVar.e) : bygyVar.d(bygyVar.b(), 17, cayyVar2, aVar2);
                }
            };
            eosc eoscVar = this.d;
            eijuVarD = eijuVarI.i(eoozVar, eoscVar).f(fbtf.class, new eooz() { // from class: bygj
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    fbtf fbtfVar = (fbtf) obj3;
                    if (fbtfVar.a.getCode() != Status.Code.NOT_FOUND) {
                        throw fbtfVar;
                    }
                    ekrw ekrwVarH = bygy.b.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.S, "BackupSelfParticipantWorkItemProcessor");
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor", "backupSelfParticipant", 195, "BackupSelfParticipantWorkItemProcessor.java")).q("Updating SELF participant since it was not found in CMS");
                    bsbs bsbsVarF = ParticipantsTable.f();
                    bsbsVarF.ap("backupSelfParticipant#removeCmsId");
                    bsbsVarF.h();
                    if (bsbsVarF.a(-1) <= 0) {
                        throw fbtfVar;
                    }
                    bygy.a aVar2 = aVar;
                    cayy cayyVar2 = cayyVar;
                    bygy bygyVar = this.a;
                    return bygyVar.d(bygyVar.b(), 17, cayyVar2, aVar2);
                }
            }, this.e).i(new eooz() { // from class: bygk
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    Boolean bool = (Boolean) obj3;
                    final boolean zBooleanValue = bool.booleanValue();
                    if (cpyl.a()) {
                        bygy bygyVar = this.a;
                        if (bygyVar.c.a()) {
                            return bygyVar.f.ak().h(new ejvr() { // from class: bygr
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj4) {
                                    return Boolean.valueOf(zBooleanValue);
                                }
                            }, eoqg.a);
                        }
                    }
                    return eijx.e(bool);
                }
            }, eoscVar);
        } else {
            eijuVarD = d(b(), 17, cayyVar, aVar);
        }
        eooz eoozVar2 = new eooz() { // from class: bygm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj3) {
                if (!((Boolean) obj3).booleanValue()) {
                    return eijx.e(cbcw.m());
                }
                final cabo caboVar2 = caboVar;
                final bygy bygyVar = this.a;
                if (!cpyl.a()) {
                    return eijx.e(bygy.e(caboVar2));
                }
                final bygy.a aVar2 = aVar;
                return bygyVar.f.am().i(new eooz() { // from class: bygx
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj4) {
                        final cpmd cpmdVarFt = aVar2.ft();
                        final ArrayList arrayList = new ArrayList();
                        final cabo caboVar3 = caboVar2;
                        cpyo cpyoVarB = cpyo.b(caboVar3.e);
                        if (cpyoVarB == null) {
                            cpyoVarB = cpyo.CMS_FEATURE_UNDEFINED;
                        }
                        final bygy bygyVar2 = bygyVar;
                        arrayList.add(tnz.a(cpyoVarB));
                        return bygyVar2.f.h().i(new eooz() { // from class: bygw
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj5) {
                                eqkj eqkjVarA = tnx.a((aumj) obj5);
                                cqbd cqbdVarC = bygy.a.c();
                                List list = arrayList;
                                Stream map = Collection.EL.stream(list).map(new Function() { // from class: bygh
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj6) {
                                        return ((eqkm) obj6).name();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = ekgb.d;
                                cqbdVarC.A("CmsFeatureTypes", ((ekgb) map.collect(ekcv.a)).toString());
                                cqbdVarC.A("CmsEncryptionStatus", eqkjVarA.name());
                                cqbdVarC.I("Updating CMS box featureTypes and encryption state...");
                                cqbdVarC.r();
                                final cpmd cpmdVar = cpmdVarFt;
                                eiju eijuVarF = cpmdVar.f(list);
                                eooz eoozVar3 = new eooz() { // from class: bygp
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj6) {
                                        return cpmdVar.j();
                                    }
                                };
                                eosc eoscVar2 = bygyVar2.d;
                                eiju eijuVarI2 = eijuVarF.i(eoozVar3, eoscVar2);
                                final cabo caboVar4 = caboVar3;
                                return eijuVarI2.h(new ejvr() { // from class: bygq
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj6) {
                                        return bygy.e(caboVar4);
                                    }
                                }, eoscVar2);
                            }
                        }, bygyVar2.d);
                    }
                }, bygyVar.d);
            }
        };
        eosc eoscVar2 = this.d;
        return eijuVarD.i(eoozVar2, eoscVar2).e(cpyr.class, new ejvr() { // from class: bygn
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                cpyr cpyrVar = (cpyr) obj3;
                bygy.a.s("Failed when backing up SELF participant", cpyrVar);
                this.a.g.i(((caxm) cayyVar.a()).c, cpyrVar);
                return cpyrVar.b.equals(cpyz.RETRY) ? cbcw.m() : cbcw.k();
            }
        }, eoscVar2).e(Throwable.class, new ejvr() { // from class: bygo
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                Throwable th = (Throwable) obj3;
                bygy.a.s("Failed when backing up SELF participant", th);
                this.a.g.i(((caxm) cayyVar.a()).c, th);
                return cbcw.m();
            }
        }, eoscVar2);
    }

    public final eiju d(eiju eijuVar, final int i, final cayy cayyVar, final a aVar) {
        eooz eoozVar = new eooz() { // from class: bygs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                bygy bygyVar = this.a;
                return !bygyVar.h.a() ? (cpyl.a() && bygyVar.c.a()) ? bygyVar.f.ak().h(new ejvr() { // from class: bygv
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return bindData;
                    }
                }, eoqg.a) : eijx.e(bindData) : eijx.e(bindData);
            }
        };
        eosc eoscVar = this.d;
        return eijuVar.i(eoozVar, eoscVar).i(new eooz() { // from class: bygt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                bypt byptVar = (bypt) aVar.hc().get(3);
                byptVar.getClass();
                int i2 = i;
                if (this.a.h.a()) {
                    ekrw ekrwVarH = bygy.b.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(cqnc.S, "BackupSelfParticipantWorkItemProcessor");
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/BackupSelfParticipantWorkItemProcessor", "backupSelfParticipant", 236, "BackupSelfParticipantWorkItemProcessor.java")).t("Backing up SELF participant with: %s", bzas.b(i2));
                } else {
                    cqbd cqbdVarC = bygy.a.c();
                    cqbdVarC.I("Backing up SELF participant");
                    cqbdVarC.A("participantId", bindData.R());
                    cqbdVarC.r();
                }
                return byptVar.c(String.valueOf(((caxm) cayyVar.a()).e), bindData.R(), bzas.a(i2));
            }
        }, eoscVar);
    }
}
