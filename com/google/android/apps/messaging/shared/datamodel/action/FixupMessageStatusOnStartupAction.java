package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.ains;
import defpackage.ajrc;
import defpackage.axof;
import defpackage.axog;
import defpackage.axtl;
import defpackage.bxmv;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejxr;
import defpackage.elgm;
import defpackage.fcsu;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class FixupMessageStatusOnStartupAction extends Action<Void> implements Parcelable {
    public final fcsu b;
    public final bxmv c;
    public final dqsn d;
    public final cogw e;
    public final fcsu f;
    private final fcsu g;
    public static final cqce a = cqce.g("BugleDataModel", "FixupMessageStatusOnStartupAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axof();

    /* compiled from: PG */
    public interface a {
        axog hI();
    }

    public FixupMessageStatusOnStartupAction(bxmv bxmvVar, dqsn dqsnVar, Parcel parcel, fcsu<ains> fcsuVar, cogw cogwVar, fcsu<ajrc> fcsuVar2, fcsu<Long> fcsuVar3) {
        super(parcel, elgm.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = bxmvVar;
        this.d = dqsnVar;
        this.g = fcsuVar;
        this.e = cogwVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("FixupMessageStatusOnStartupAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        eieu eieuVarK = eiiy.k("FixupMessageStatusOnStartupAction#executeAction");
        try {
            int iIntValue = ((Integer) this.d.c("FixupMessageStatusOnStartupAction#executeAction", new ejxr() { // from class: axoa
                @Override // defpackage.ejxr
                public final Object get() {
                    final FixupMessageStatusOnStartupAction fixupMessageStatusOnStartupAction = this.a;
                    final Instant instantMinus = fixupMessageStatusOnStartupAction.e.f().minus(Duration.ofHours(((Long) fixupMessageStatusOnStartupAction.b.b()).longValue()));
                    String[] strArr = MessagesTable.a;
                    brdu brduVar = new brdu();
                    brduVar.ap("FixupMessageStatusOnStartupAction#executeAction-messages0");
                    brduVar.U(7);
                    brduVar.X(new Function() { // from class: axob
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            cqce cqceVar = FixupMessageStatusOnStartupAction.a;
                            brecVar.ai(5, 6);
                            brecVar.K(3);
                            int iIntValue2 = MessagesTable.g().intValue();
                            if (iIntValue2 < 17030) {
                                dqru.x("queue_insert_timestamp", iIntValue2);
                            }
                            brecVar.ap(new dqpj("messages.queue_insert_timestamp", 7, Long.valueOf(bart.a(instantMinus))));
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int iE = brduVar.b().e();
                    brdu brduVar2 = new brdu();
                    brduVar2.ap("FixupMessageStatusOnStartupAction#executeAction-messages1");
                    brduVar2.U(106);
                    brduVar2.X(new Function() { // from class: axoc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            cqce cqceVar = FixupMessageStatusOnStartupAction.a;
                            brecVar.ai(105, 103);
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    final int iE2 = brduVar2.b().e();
                    final int iA = ((ajrc) fixupMessageStatusOnStartupAction.f.b()).a(embo.APP_RESTART);
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    bsje bsjeVarC = PartsTable.c();
                    bsjeVarC.A("getOutputUriForAllProcessingParts");
                    bsjeVarC.h(new Function() { // from class: bxmo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsjl bsjlVar = (bsjl) obj;
                            bsjlVar.s();
                            return bsjlVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsjeVarC.e(new Function() { // from class: bxmp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bsgr bsgrVar = (bsgr) obj;
                            return new bsgs[]{bsgrVar.l, bsgrVar.a};
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bsgt bsgtVar = (bsgt) bsjeVarC.b().p();
                    while (bsgtVar.moveToNext()) {
                        try {
                            ekfwVar.h(new Pair(bsgtVar.h(), bsgtVar.p()));
                        } catch (Throwable th) {
                            try {
                                bsgtVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    bsgtVar.close();
                    final ekgb ekgbVarG = ekfwVar.g();
                    fixupMessageStatusOnStartupAction.d.g(new dqsm() { // from class: axod
                        @Override // defpackage.dqsm
                        public final eieu a() {
                            cqce cqceVar = FixupMessageStatusOnStartupAction.a;
                            return eiiy.k("FMSOSA::deleteOutputUriForAllProcessingPartsAndMarkAsNull::runAfterCommit");
                        }
                    }, null, new Runnable() { // from class: axoe
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = 0;
                            while (true) {
                                ekgb ekgbVar = ekgbVarG;
                                if (i2 >= ((ekoe) ekgbVar).c) {
                                    int i3 = iE2;
                                    int i4 = iA;
                                    final Collection collection = (Collection) Collection.EL.stream(ekgbVar).map(new Function() { // from class: bxml
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return (String) ((Pair) obj).second;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(Collectors.toCollection(new Supplier() { // from class: bxmm
                                        @Override // java.util.function.Supplier
                                        public final Object get() {
                                            return new ArrayList();
                                        }
                                    }));
                                    String[] strArr2 = PartsTable.a;
                                    bsjh bsjhVar = new bsjh();
                                    bsjhVar.ap("deleteOutputUriForAllProcessingPartsAndMarkAsNull");
                                    bsjhVar.w(bvdt.FAILED);
                                    bsjhVar.v();
                                    bsjhVar.D(new Function() { // from class: bxmn
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            bsjl bsjlVar = (bsjl) obj;
                                            bsjlVar.k(collection);
                                            return bsjlVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int iE3 = bsjhVar.b().e();
                                    cqbd cqbdVarC = FixupMessageStatusOnStartupAction.a.c();
                                    cqbdVarC.y("sendFailedCnt", i4);
                                    cqbdVarC.y("downloadFailedCnt", i3);
                                    cqbdVarC.y("partsProcessingFailedCnt", iE3);
                                    cqbdVarC.r();
                                    return;
                                }
                                bxlf.i(fixupMessageStatusOnStartupAction.c.a, (Uri) ((Pair) ekgbVar.get(i2)).first);
                                i2++;
                            }
                        }
                    });
                    return Integer.valueOf(iE);
                }
            })).intValue();
            if (iIntValue > 0) {
                cqbd cqbdVarC = a.c();
                cqbdVarC.y("retryRcsMessageCnt", iIntValue);
                cqbdVarC.r();
                ((ains) this.g.b()).d("Bugle.DataModel.Action.FixupMessageStatus.RcsMessages.Retry", iIntValue);
                axtl.d(10, this);
            } else {
                axtl.d(1, this);
            }
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FixupMessageStatusOnStartup.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public FixupMessageStatusOnStartupAction(bxmv bxmvVar, dqsn dqsnVar, fcsu<ains> fcsuVar, cogw cogwVar, fcsu<ajrc> fcsuVar2, fcsu<Long> fcsuVar3) {
        super(elgm.FIXUP_MESSAGES_ON_STARTUP_ACTION);
        this.c = bxmvVar;
        this.d = dqsnVar;
        this.g = fcsuVar;
        this.e = cogwVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
    }
}
