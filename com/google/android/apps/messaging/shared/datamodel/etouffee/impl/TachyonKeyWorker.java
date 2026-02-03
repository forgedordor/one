package com.google.android.apps.messaging.shared.datamodel.etouffee.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bwbt;
import defpackage.bwlk;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.pzs;
import defpackage.qam;
import defpackage.qao;
import defpackage.qaq;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class TachyonKeyWorker extends qaq {
    private final bwlk e;
    private final eigp f;

    /* compiled from: PG */
    public interface a {
        eigp b();

        bwlk bF();
    }

    public TachyonKeyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.e = aVar.bF();
        this.f = aVar.b();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        eiju eijuVarE;
        eieh eiehVarC = this.f.c("TachyonKeyWorker.startWork", "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/TachyonKeyWorker", "startWork", 42);
        try {
            final bwlk bwlkVar = this.e;
            pzs pzsVarF = f();
            cqce cqceVar = bwlk.a;
            cqceVar.p("Start uploading prekeys in worker helper");
            if (bwbt.a()) {
                final String strD = pzsVarF.d("canonical_number");
                if (TextUtils.isEmpty(strD)) {
                    cqceVar.n("Missing RCS phone number");
                    eijuVarE = eijx.e(new qam());
                } else {
                    eiju eijuVarA = bwlkVar.d.a(strD);
                    eooz eoozVar = new eooz() { // from class: bwlf
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            if (TextUtils.isEmpty((String) obj)) {
                                throw new fbtf(Status.g.withDescription("This device is not registered with Tachyon"));
                            }
                            return bwlkVar.b.a(strD);
                        }
                    };
                    eosc eoscVar = bwlkVar.f;
                    eijuVarE = eijuVarA.i(eoozVar, eoscVar).i(new eooz() { // from class: bwlg
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            cqbd cqbdVarA = bwlk.a.a();
                            cqbdVarA.I("Setting prekeys");
                            cqbdVarA.r();
                            final bwlk bwlkVar2 = bwlkVar;
                            bwla bwlaVar = bwlkVar2.c;
                            final String str = strD;
                            bwkz bwkzVarA = bwlaVar.a(str);
                            eiju eijuVarG = eiju.g(((cema) bwkzVarA.c.b()).b(new bwlr((TachyonCommon$PublicPreKeySets) obj, bwkzVarA.d), bwkz.b));
                            eooz eoozVar2 = new eooz() { // from class: bwlc
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    Status status = (Status) obj2;
                                    if (!status.f()) {
                                        cqbd cqbdVarE = bwlk.a.e();
                                        cqbdVarE.I("Failed to set prekeys");
                                        cqbdVarE.A("status", status.toString());
                                        cqbdVarE.r();
                                        return eijx.d(new IllegalStateException("Failed to set prekeys"));
                                    }
                                    String str2 = str;
                                    bwlk bwlkVar3 = bwlkVar2;
                                    bwlk.a.p("Successfully set prekeys");
                                    eiju eijuVarE2 = ((cejj) bwlkVar3.e.b()).e(str2, 8);
                                    ejvr ejvrVar = new ejvr() { // from class: bwli
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj3) {
                                            return ((cejg) obj3).o();
                                        }
                                    };
                                    eosc eoscVar2 = bwlkVar3.g;
                                    return eijuVarE2.h(ejvrVar, eoscVar2).i(new eooz() { // from class: bwlj
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj3) {
                                            return ((cexm) obj3).n(cevp.SUFFICIENT_PREKEYS);
                                        }
                                    }, eoscVar2);
                                }
                            };
                            eoqg eoqgVar = eoqg.a;
                            return eijuVarG.i(eoozVar2, eoqgVar).h(new ejvr() { // from class: bwld
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return new qao();
                                }
                            }, eoqgVar).e(Throwable.class, new ejvr() { // from class: bwle
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    return new qam();
                                }
                            }, eoqgVar);
                        }
                    }, eoscVar).e(Throwable.class, new ejvr() { // from class: bwlh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            bwlk.a.s("Failed to set prekeys:", (Throwable) obj);
                            return new qam();
                        }
                    }, eoqg.a);
                }
            } else {
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("The task is not enabled.");
                cqbdVarA.r();
                eijuVarE = eijx.e(new qao());
            }
            eiehVarC.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
