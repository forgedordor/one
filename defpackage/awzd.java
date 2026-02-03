package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awzd extends fcyz implements fdat {
    int a;
    final /* synthetic */ awze b;
    final /* synthetic */ Optional c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awzd(awze awzeVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awzeVar;
        this.c = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awzd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ekgb ekgbVarZ;
        ekgb ekgbVarZ2;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            awze awzeVar = this.b;
            boolean z = true;
            this.a = 1;
            awwn awwnVar = (awwn) awxh.a().b().q(awxh.c.a);
            try {
                ekgb ekgbVarC = awwnVar.c();
                awwnVar.close();
                ekgbVarC.getClass();
                arpd arpdVar = awzeVar.b;
                HashSet hashSetZ = fcva.Z(ekgbVarC);
                boolean z2 = false;
                if (arpdVar.a()) {
                    bsbo bsboVarE = ParticipantsTable.e();
                    bsboVarE.A("MyIdentityForeignKeyUpgrader.getSelfParticipantsWithToken");
                    bsboVarE.n(new dqxl("$R.$R", new Object[]{"participants", "my_identity_token"}), "my_identity_token_non_fk");
                    bsboVarE.h(new Function() { // from class: awyw
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar = (bsbx) obj2;
                            int iIntValue = ParticipantsTable.i().intValue();
                            if (iIntValue < 60160) {
                                dqru.x("my_identity_token_foreign_key", iIntValue);
                            }
                            bsbxVar.ap(new dqpn("participants.my_identity_token_foreign_key", 5));
                            bsbxVar.ar(new dqxl("$R NOT NULL", new Object[]{"my_identity_token"}));
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsboVarE.s();
                    ekgbVarZ = bsboVarE.b().z();
                    ekgbVarZ.getClass();
                } else {
                    bsbo bsboVarE2 = ParticipantsTable.e();
                    bsboVarE2.A("MyIdentityForeignKeyUpgrader.upgrade");
                    bsboVarE2.h(new Function() { // from class: awyx
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            bsbx bsbxVar = (bsbx) obj2;
                            int iIntValue = ParticipantsTable.i().intValue();
                            if (iIntValue < 59930) {
                                dqru.x("my_identity_token", iIntValue);
                            }
                            bsbxVar.ap(new dqpn("participants.my_identity_token", 6));
                            return bsbxVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsboVarE2.s();
                    ekgbVarZ = bsboVarE2.b().z();
                    ekgbVarZ.getClass();
                }
                ekqh it = ekgbVarZ.iterator();
                it.getClass();
                while (it.hasNext()) {
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                    boolean z3 = z;
                    axcm axcmVarA = arpdVar.a() ? axcn.a(bindData.az("my_identity_token_non_fk")) : bindData.A();
                    if (hashSetZ.contains(axcmVarA)) {
                        bsbs bsbsVarF = ParticipantsTable.f();
                        bsbsVarF.ap("MyIdentityForeignKeyUpgrader.upgradeParticipants");
                        bsbsVarF.E(axcmVarA);
                        bsbsVarF.e(bindData.R());
                        z = z3;
                    } else {
                        ekrw ekrwVarJ = awze.a.j();
                        ekrwVarJ.X(eksq.a, "BugleCME");
                        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader", "upgrade", 72, "MyIdentityForeignKeyUpgrader.kt")).D("Skip writing SelfParticipant MyIdentityToken %s to fk column, foreign key does not exist in MyIdentitiesTable: %s", bindData.A(), hashSetZ);
                        z = z3;
                        z2 = z2;
                    }
                }
                boolean z4 = z;
                boolean z5 = z2;
                if (arpdVar.a()) {
                    axem axemVarA = axer.a();
                    axemVarA.A("MyIdentityForeignKeyUpgrader.getSubscriptionsWithToken");
                    Object[] objArr = new Object[2];
                    objArr[z5 ? 1 : 0] = "subscriptions";
                    objArr[z4 ? 1 : 0] = "my_identity_token";
                    axemVarA.n(new dqxl("$R.$R", objArr), "my_identity_token_non_fk");
                    axemVarA.c(new Function() { // from class: awyy
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            axeq axeqVar = (axeq) obj2;
                            int iIntValue = axer.c().intValue();
                            if (iIntValue < 60160) {
                                dqru.x("my_identity_token_with_foreign_key", iIntValue);
                            }
                            axeqVar.ap(new dqpn("subscriptions.my_identity_token_with_foreign_key", 5));
                            axeqVar.ar(new dqxl("$V NOT NULL", new Object[]{"my_identity_token"}));
                            return axeqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgbVarZ2 = axemVarA.b().z();
                    ekgbVarZ2.getClass();
                } else {
                    axem axemVarA2 = axer.a();
                    axemVarA2.A("subscriptions");
                    axemVarA2.c(new Function() { // from class: awyz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            axeq axeqVar = (axeq) obj2;
                            int iIntValue = axer.c().intValue();
                            if (iIntValue < 59450) {
                                dqru.x("my_identity_token", iIntValue);
                            }
                            axeqVar.ap(new dqpn("subscriptions.my_identity_token", 6));
                            return axeqVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    ekgbVarZ2 = axemVarA2.b().z();
                    ekgbVarZ2.getClass();
                }
                ekqh it2 = ekgbVarZ2.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    axdh axdhVar = (axdh) it2.next();
                    axcm axcmVarA2 = arpdVar.a() ? axcn.a(axdhVar.az("my_identity_token_non_fk")) : axdhVar.e();
                    if (hashSetZ.contains(axcmVarA2)) {
                        axeo axeoVar = new axeo();
                        axeoVar.e(axcmVarA2);
                        int iD = axdhVar.d();
                        axeq axeqVar = new axeq();
                        axeqVar.d(iD);
                        axeoVar.aj(new axep(axeqVar), "subscriptions-buildAndUpdateForSubId");
                    } else {
                        ekrw ekrwVarJ2 = awze.a.j();
                        ekrwVarJ2.X(eksq.a, "BugleCME");
                        ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader", "upgrade", 99, "MyIdentityForeignKeyUpgrader.kt")).D("Skip writing Subscription MyIdentityToken %s to fk column, foreign key does not exist in MyIdentitiesTable: %s", axdhVar.e(), hashSetZ);
                    }
                }
                if (fctx.a == fcylVar) {
                    return fcylVar;
                }
            } finally {
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awzd(this.b, this.c, fcxyVar);
    }
}
