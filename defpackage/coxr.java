package defpackage;

import android.text.TextUtils;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.OptionalLong;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coxr implements couz {
    public final eksp a = eksp.c("BugleFileTransfer");
    public final eosc b;
    public final fcsu c;
    private final eosc d;
    private final fcsu e;
    private final fcsu f;
    private final cowk g;

    public coxr(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cowk cowkVar) {
        this.d = eoscVar;
        this.b = eoscVar2;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.c = fcsuVar3;
        this.g = cowkVar;
    }

    @Override // defpackage.couz
    public final eiju a(final atir atirVar) {
        final coww cowwVar = (coww) this.f.b();
        return eijx.f(new Runnable() { // from class: cowm
            @Override // java.lang.Runnable
            public final void run() {
                atir atirVar2 = atirVar;
                coww cowwVar2 = cowwVar;
                synchronized (cowwVar2.f) {
                    Map map = cowwVar2.g;
                    eycv eycvVar = (eycv) map.get(atirVar2);
                    if (eycvVar != null) {
                        eycvVar.f();
                        eksl ekslVar = (eksl) coww.a.h();
                        ekslVar.X(coie.a, atirVar2.a);
                        ekslVar.X(coie.j, atirVar2.b);
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 151, "ScottyFileUploader.java")).q("Paused ongoing file upload.");
                        map.remove(atirVar2);
                    } else {
                        eksl ekslVar2 = (eksl) coww.a.h();
                        ekslVar2.X(coie.a, atirVar2.a);
                        ekslVar2.X(coie.j, atirVar2.b);
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 158, "ScottyFileUploader.java")).q("Could not find ongoing file upload to pause.");
                    }
                }
            }
        }, cowwVar.b);
    }

    @Override // defpackage.couz
    public final eiju b(final cous cousVar, final atir atirVar, final coir coirVar, final evqs evqsVar, final aubq aubqVar, boolean z) {
        final atir atirVar2;
        final eiju eijuVarE;
        eieu eieuVarK;
        if (cousVar.f().isPresent()) {
            eieuVarK = eiiy.k("TachygramFileUploadProvider#uploadThumbnail");
            try {
                if (z) {
                    eijuVarE = d(cousVar, atirVar, evqsVar, aubqVar);
                    atirVar2 = atirVar;
                } else {
                    atirVar2 = atirVar;
                    eijuVarE = eijx.g(new Callable() { // from class: coxi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            atjx atjxVarA = ((atjz) this.a.c.b()).a(atirVar);
                            if (atjxVarA.b() != 1) {
                                return new coyj(atjxVarA.c());
                            }
                            auck auckVar = (auck) aucl.a.createBuilder();
                            aucj aucjVarA = atjxVarA.a();
                            auckVar.copyOnWrite();
                            aucl auclVar = (aucl) auckVar.instance;
                            auclVar.d = aucjVarA;
                            auclVar.b |= 2;
                            return new coyi(new covb((aucl) auckVar.build()));
                        }
                    }, this.b).i(new eooz() { // from class: coxj
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            coyk coykVar = (coyk) obj;
                            boolean z2 = coykVar instanceof coyi;
                            atir atirVar3 = atirVar2;
                            coxr coxrVar = this.a;
                            if (!z2) {
                                if (((atbd) ((coyj) coykVar).a).a == coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                                    ((eksl) ((eksl) coxrVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "uploadThumbnail", 222, "TachygramFileUploadProvider.java")).q("Could not retrieve FileTransferEntry for reading thumbnail information.");
                                    return eijx.e(coykVar);
                                }
                                aubq aubqVar2 = aubqVar;
                                return coxrVar.d(cousVar, atirVar3, evqsVar, aubqVar2);
                            }
                            eksl ekslVar = (eksl) coxrVar.a.h();
                            ekslVar.X(coie.a, atirVar3.a);
                            ekslVar.X(coie.j, atirVar3.b);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "uploadThumbnail", 217, "TachygramFileUploadProvider.java")).q("Thumbnail already uploaded, reusing persisted information.");
                            return eijx.e(coykVar);
                        }
                    }, this.d);
                }
                eieuVarK.b(eijuVarE);
                eieuVarK.close();
            } finally {
            }
        } else {
            atirVar2 = atirVar;
            eijuVarE = eijx.e(new coyi(new covb(aucl.a)));
        }
        eieuVarK = eiiy.k("TachygramFileUploadProvider#uploadFile");
        try {
            final coww cowwVar = (coww) this.f.b();
            final long jA = this.g.a();
            ezub ezubVar = (ezub) ezuc.a.createBuilder();
            ezubVar.copyOnWrite();
            ((ezuc) ezubVar.instance).b = felw.a(4);
            String str = atirVar2.c;
            ezubVar.copyOnWrite();
            ezuc ezucVar = (ezuc) ezubVar.instance;
            str.getClass();
            ezucVar.c = str;
            ezubVar.copyOnWrite();
            ((ezuc) ezubVar.instance).d = 1;
            final ezuc ezucVar2 = (ezuc) ezubVar.build();
            Optional map = ((coyd) cowwVar.e.b()).a(Optional.of(aubqVar), cousVar.g()).map(new Function() { // from class: cowo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final String str2 = (String) obj;
                    eksl ekslVar = (eksl) coww.a.h();
                    final atir atirVar3 = atirVar2;
                    ekslVar.X(coie.a, atirVar3.a);
                    ekslVar.X(coie.j, atirVar3.b);
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "uploadFile", 114, "ScottyFileUploader.java")).t("Upload endpoint: %s", str2);
                    final coww cowwVar2 = cowwVar;
                    final ezuc ezucVar3 = ezucVar2;
                    final cous cousVar2 = cousVar;
                    final coir coirVar2 = coirVar;
                    final evqs evqsVar2 = evqsVar;
                    final long j = jA;
                    return cowwVar2.a(atirVar3, new ejvr() { // from class: cowl
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            final coys coysVar = cowwVar2.c;
                            ezuc ezucVar4 = ezucVar3;
                            cous cousVar3 = cousVar2;
                            final eycb eycbVar = (eycb) obj2;
                            eiju eijuVarB = coysVar.b(ezucVar4, eycbVar, cousVar3.c(), cousVar3.d(), evqsVar2, str2, j);
                            final atir atirVar4 = atirVar3;
                            final coir coirVar3 = coirVar2;
                            return eijuVarB.h(new ejvr() { // from class: coyn
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eycv eycvVar = (eycv) obj3;
                                    eycvVar.getClass();
                                    coysVar.e(atirVar4, eycvVar, eycbVar, coirVar3);
                                    return eycvVar;
                                }
                            }, coysVar.a);
                        }
                    }, cousVar2, ezucVar3.c);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            atbp atbpVarG = atbq.g();
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
            atbpVarG.g(ezucVar2.c);
            final eiju eijuVarE2 = ((eiju) map.orElse(eijx.e(new coyj(atbpVarG.a())))).e(CancellationException.class, new ejvr() { // from class: coxl
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return coyh.a;
                }
            }, this.d);
            eieuVarK.b(eijuVarE2);
            eieuVarK.close();
            return eijx.k(eijuVarE, eijuVarE2).a(new Callable() { // from class: coxm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    coyk coykVar = (coyk) eork.q(eijuVarE);
                    coyk coykVar2 = (coyk) eork.q(eijuVarE2);
                    boolean z2 = coykVar2 instanceof coyi;
                    coxr coxrVar = this.a;
                    if (!z2) {
                        if (coykVar instanceof coyi) {
                            return coykVar2;
                        }
                        ((eksl) ((eksl) coxrVar.a.h()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 166, "TachygramFileUploadProvider.java")).q("File & thumbnail upload both failed. Using file upload failure.");
                        return coykVar2;
                    }
                    aucl auclVar = ((coyi) coykVar2).a.a;
                    if (!(coykVar instanceof coyi)) {
                        if (coykVar instanceof coyj) {
                            ((eksl) ((eksl) coxrVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 185, "TachygramFileUploadProvider.java")).q("File upload succeeded, but thumbnail failed. Dropping thumbnail.");
                            return new coyi(new covb(auclVar, Optional.of(((coyj) coykVar).a)));
                        }
                        if (!(coykVar instanceof coyh)) {
                            throw new IllegalStateException("Unreachable code.");
                        }
                        ((eksl) ((eksl) coxrVar.a.j()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "handleFileAndThumbnailUploads", 192, "TachygramFileUploadProvider.java")).q("Unexpected state. Thumbnail should never be cancelled (paused).");
                        return coykVar2;
                    }
                    aucl auclVar2 = ((coyi) coykVar).a.a;
                    if ((auclVar2.b & 2) == 0) {
                        return new coyi(new covb(auclVar));
                    }
                    auck auckVar = (auck) auclVar.toBuilder();
                    aucj aucjVar = auclVar2.d;
                    if (aucjVar == null) {
                        aucjVar = aucj.a;
                    }
                    auckVar.copyOnWrite();
                    aucl auclVar3 = (aucl) auckVar.instance;
                    aucjVar.getClass();
                    auclVar3.d = aucjVar;
                    auclVar3.b |= 2;
                    return new coyi(new covb((aucl) auckVar.build()));
                }
            }, this.d);
        } finally {
        }
    }

    @Override // defpackage.couz
    public final eiju c(final cous cousVar, final atir atirVar, final coir coirVar, final String str) {
        if (TextUtils.isEmpty(str)) {
            atbp atbpVarG = atbq.g();
            atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_UNKNOWN);
            return eijx.e(new coyj(atbpVarG.a()));
        }
        eieu eieuVarK = eiiy.k("TachygramFileUploadProvider#resume");
        try {
            final coww cowwVar = (coww) this.f.b();
            final long jA = this.g.a();
            eiju eijuVarH = cowwVar.a(atirVar, new ejvr() { // from class: cowv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    final eycb eycbVar = (eycb) obj;
                    final long j = jA;
                    final String str2 = str;
                    final coys coysVar = cowwVar.c;
                    eiju eijuVarG = eijx.g(new Callable() { // from class: coyq
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            eyda eydaVar = new eyda();
                            eydaVar.a = cojd.c().b;
                            eydb eydbVar = new eydb(eydaVar);
                            coys coysVar2 = coysVar;
                            boolean zA = ((arai) coysVar2.f.b()).a();
                            String str3 = str2;
                            eycb eycbVar2 = eycbVar;
                            if (!zA) {
                                if (coys.f(eycbVar2) > j) {
                                    return coysVar2.d.a(str3, eycbVar2, eydbVar);
                                }
                            }
                            return coysVar2.e.a(str3, eycbVar2, eydbVar);
                        }
                    }, coysVar.b);
                    final atir atirVar2 = atirVar;
                    final coir coirVar2 = coirVar;
                    return eijuVarG.h(new ejvr() { // from class: coyp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eycv eycvVar = (eycv) obj2;
                            eycvVar.getClass();
                            coysVar.e(atirVar2, eycvVar, eycbVar, coirVar2);
                            return eycvVar;
                        }
                    }, coysVar.a);
                }
            }, cousVar, "").h(new ejvr() { // from class: coxo
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    coyk coykVar = (coyk) obj;
                    if (!(coykVar instanceof coyi)) {
                        return coykVar;
                    }
                    atir atirVar2 = atirVar;
                    coxr coxrVar = this.a;
                    covb covbVar = ((coyi) coykVar).a;
                    atjx atjxVarA = ((atjz) coxrVar.c.b()).a(atirVar2);
                    if (atjxVarA.b() != 1) {
                        atbq atbqVarC = atjxVarA.c();
                        if (((atbd) atbqVarC).a == coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_READ_THUMBNAIL_INFO_IN_DB) {
                            return new coyj(atbqVarC);
                        }
                        String str2 = (String) cousVar.c().map(new Function() { // from class: coxn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((ContentType) obj2).toString();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse("");
                        return ((le.z(str2) || le.m(str2)) && !le.j(str2)) ? new coyi(new covb(covbVar.a, Optional.of(atbqVarC))) : new coyi(covbVar);
                    }
                    auck auckVar = (auck) covbVar.a.toBuilder();
                    aucj aucjVarA = atjxVarA.a();
                    auckVar.copyOnWrite();
                    aucl auclVar = (aucl) auckVar.instance;
                    auclVar.d = aucjVarA;
                    auclVar.b |= 2;
                    return new coyi(new covb((aucl) auckVar.build()));
                }
            }, this.b);
            eieuVarK.b(eijuVarH);
            eiju eijuVarE = eijuVarH.e(CancellationException.class, new ejvr() { // from class: coxq
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return coyh.a;
                }
            }, this.d);
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    public final eiju d(final cous cousVar, final atir atirVar, final evqs evqsVar, aubq aubqVar) {
        final coxe coxeVar = (coxe) this.e.b();
        ezub ezubVar = (ezub) ezuc.a.createBuilder();
        ezubVar.copyOnWrite();
        ((ezuc) ezubVar.instance).b = felw.a(3);
        ezubVar.copyOnWrite();
        ezuc ezucVar = (ezuc) ezubVar.instance;
        String str = atirVar.c;
        str.getClass();
        ezucVar.c = str;
        ezubVar.copyOnWrite();
        ((ezuc) ezubVar.instance).d = 1;
        final ezuc ezucVar2 = (ezuc) ezubVar.build();
        Optional map = ((coyd) coxeVar.c.b()).a(Optional.of(aubqVar), OptionalLong.empty()).map(new Function() { // from class: cowx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final String str2 = (String) obj;
                coyr coyrVar = new coyr() { // from class: cowz
                    @Override // defpackage.coyr
                    public final eycb a(couh couhVar, cous cousVar2) {
                        return new eycl(((evqs) cousVar2.f().get()).m(), r4.d(), ((Integer) coyc.a.e()).intValue());
                    }
                };
                final coxe coxeVar2 = coxeVar;
                coys coysVar = coxeVar2.b;
                final cous cousVar2 = cousVar;
                eijs eijsVarA = coysVar.a(cousVar2, coyrVar);
                final ezuc ezucVar3 = ezucVar2;
                final evqs evqsVar2 = evqsVar;
                eopl eoplVar = new eopl() { // from class: coxa
                    @Override // defpackage.eopl
                    public final eopy a(eopt eoptVar, Object obj2) {
                        eycb eycbVar = (eycb) obj2;
                        eycbVar.getClass();
                        ejwl.b(eycbVar.e() != -1, "Data stream size is unknown.");
                        coxe coxeVar3 = coxeVar2;
                        cous cousVar3 = cousVar2;
                        Optional optionalE = cousVar3.e();
                        Optional optionalD = cousVar3.d();
                        cowk cowkVar = coxeVar3.d;
                        Object objB = cowkVar.a.b();
                        objB.getClass();
                        long jB = cowkVar.b(((Number) objB).longValue());
                        return new eopy(coxeVar3.b.b(ezucVar3, eycbVar, optionalE, optionalD, evqsVar2, str2, jB));
                    }
                };
                eosc eoscVar = coxeVar2.a;
                return eijsVarA.g(eoplVar, eoscVar).g(new eopl() { // from class: coxb
                    @Override // defpackage.eopl
                    public final eopy a(eopt eoptVar, Object obj2) {
                        eycv eycvVar = (eycv) obj2;
                        eycvVar.getClass();
                        return new eopy(eycvVar.b());
                    }
                }, eoscVar).h().h(new ejvr() { // from class: coxc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        final coxe coxeVar3 = coxeVar2;
                        final cous cousVar3 = cousVar2;
                        return coup.a((eycy) obj2, new couo() { // from class: cowy
                            @Override // defpackage.couo
                            public final coyi a(ezuk ezukVar) {
                                auck auckVar = (auck) aucl.a.createBuilder();
                                aucj aucjVarH = coys.h(ezukVar, Optional.empty(), cousVar3.e());
                                auckVar.copyOnWrite();
                                aucl auclVar = (aucl) auckVar.instance;
                                aucjVarH.getClass();
                                auclVar.d = aucjVarH;
                                auclVar.b |= 2;
                                return new coyi(new covb((aucl) auckVar.build()));
                            }
                        }, ezucVar3.c);
                    }
                }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: coxd
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        atbp atbpVarG = atbq.g();
                        atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_FAILED_TO_GET_FILE_SIZE);
                        atbpVarG.g(ezucVar3.c);
                        return new coyj(atbpVarG.a());
                    }
                }, eoscVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        atbp atbpVarG = atbq.g();
        atbpVarG.f(coid.FILE_TRANSFER_FAILURE_REASON_INVALID_RCS_CONFIGURATION);
        atbpVarG.g(ezucVar2.c);
        return ((eiju) map.orElse(eijx.e(new coyj(atbpVarG.a())))).h(new ejvr() { // from class: coxk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                coyk coykVar = (coyk) obj;
                if (coykVar instanceof coyi) {
                    final atir atirVar2 = atirVar;
                    final coxr coxrVar = this.a;
                    final aucl auclVar = ((coyi) coykVar).a.a;
                    auvh.h(eijx.g(new Callable() { // from class: coxp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            coxr coxrVar2 = coxrVar;
                            atjz atjzVar = (atjz) coxrVar2.c.b();
                            aucj aucjVar = auclVar.d;
                            if (aucjVar == null) {
                                aucjVar = aucj.a;
                            }
                            atir atirVar3 = atirVar2;
                            if (atjzVar.t(atirVar3, aucjVar)) {
                                return null;
                            }
                            eksl ekslVar = (eksl) coxrVar2.a.j();
                            ekslVar.X(coie.a, atirVar3.a);
                            ekslVar.X(coie.j, atirVar3.b);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramFileUploadProvider", "updateDatabaseWithThumbnailAsync", 269, "TachygramFileUploadProvider.java")).q("Failed to update FileTransferTable with thumbnail information.");
                            return null;
                        }
                    }, coxrVar.b));
                }
                return coykVar;
            }
        }, this.d);
    }
}
