package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bztj {
    public static final cqce a = cqce.g("BugleCms", "CmsMediaUploadWorkerAdapter");
    public final efwo b;
    public final byik c;
    public final eosc d;
    public final aukz e;
    public final bykf f;
    private final bzre g;
    private final cpmc h;
    private final fcsu i;
    private final fcsu j;
    private final eosc k;
    private final ains l;
    private final eosc m;

    public bztj(efwo efwoVar, bzre bzreVar, cpmc cpmcVar, fcsu fcsuVar, fcsu fcsuVar2, byik byikVar, aukz aukzVar, bykf bykfVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3) {
        this.b = efwoVar;
        this.g = bzreVar;
        this.h = cpmcVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.c = byikVar;
        this.l = ainsVar;
        this.e = aukzVar;
        this.f = bykfVar;
        this.k = eoscVar;
        this.d = eoscVar2;
        this.m = eoscVar3;
    }

    public static emca d(emcn emcnVar, cpyj cpyjVar, boolean z, int i) {
        embz embzVar = (embz) emca.a.createBuilder();
        emcd emcdVarB = cpyj.b(cpyjVar);
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emcaVar.c = emcdVarB.w;
        emcaVar.b |= 1;
        embzVar.copyOnWrite();
        emca emcaVar2 = (emca) embzVar.instance;
        emcaVar2.g = (true != z ? 3 : 2) - 1;
        emcaVar2.b |= 16;
        embzVar.copyOnWrite();
        emca emcaVar3 = (emca) embzVar.instance;
        emcaVar3.d = 3;
        emcaVar3.b |= 2;
        embzVar.copyOnWrite();
        emca emcaVar4 = (emca) embzVar.instance;
        emcaVar4.b |= 8;
        emcaVar4.f = i;
        embzVar.copyOnWrite();
        emca emcaVar5 = (emca) embzVar.instance;
        emcaVar5.e = emcnVar.bs;
        emcaVar5.b |= 4;
        return (emca) embzVar.build();
    }

    public final qap a(bzuc bzucVar, boolean z, int i, cpyj cpyjVar) {
        emcn emcnVar;
        Integer num;
        bzud bzudVar = bzucVar.a;
        a.r("Trying to get the result of file id before its computation completes or the upload operation failed. Will retry.".concat(String.valueOf(bzudVar.i)));
        if (bzudVar != bzud.HTTP_RESPONSE_ERROR || (num = bzucVar.b) == null) {
            aukz aukzVar = this.e;
            switch (bzudVar) {
                case UNKNOWN_FAILURE:
                    emcnVar = emcn.MEDIA_UPLOAD_UNKNOWN_ERROR;
                    break;
                case HTTP_RESPONSE_ERROR:
                case OUT_OF_SQS_STORAGE_ERROR:
                    emcnVar = emcn.UNSPECIFIED_REASON;
                    break;
                case HTTP_EMPTY_RESPONSE:
                    emcnVar = emcn.MEDIA_UPLOAD_EMPTY_RESPONSE;
                    break;
                case ENCRYPTION_ERROR:
                    emcnVar = emcn.MEDIA_UPLOAD_ENCRYPTION_ERROR;
                    break;
                case COMPRESS_IMAGE_ERROR:
                    emcnVar = emcn.MEDIA_UPLOAD_IMAGE_COMPRESS_ERROR;
                    break;
                case FILE_NOT_FOUND_ORIGINAL:
                    emcnVar = emcn.MEDIA_UPLOAD_FILE_NOT_FOUND_ORIGINAL;
                    break;
                case FILE_NOT_FOUND_WRITE_SCRATCH_SPACE:
                    emcnVar = emcn.MEDIA_UPLOAD_FILE_NOT_FOUND_WRITE_SCRATCH_SPACE;
                    break;
                default:
                    throw new AssertionError("Should not reach here.");
            }
            aukzVar.f(d(emcnVar, cpyjVar, z, i));
        } else {
            aukz aukzVar2 = this.e;
            int iIntValue = num.intValue();
            aukzVar2.f(d(iIntValue != 400 ? iIntValue != 401 ? iIntValue != 403 ? iIntValue != 404 ? iIntValue != 408 ? iIntValue != 412 ? iIntValue != 500 ? iIntValue != 503 ? emcn.SERVER_STATUS_OTHER : emcn.SERVER_STATUS_UNAVAILABLE : emcn.SERVER_STATUS_INTERNAL : emcn.SERVER_STATUS_FAILED_PRECONDITION : emcn.SERVER_STATUS_DEADLINE_EXCEEDED : emcn.SERVER_STATUS_NOT_FOUND : emcn.SERVER_STATUS_PERMISSION_DENIED : emcn.SERVER_STATUS_UNAUTHENTICATED : emcn.SERVER_STATUS_INVALID_ARGUMENT, cpyjVar, z, i));
        }
        f(bzudVar);
        return new qan();
    }

    public final eiju b(pzs pzsVar) {
        cpyj cpyjVarA = cpyj.a(pzsVar.a("media_upload_type_key", cpyj.UNDEFINED.e));
        final String strD = pzsVar.d("target_id_key");
        final boolean zH = pzsVar.h("is_initial_sync");
        final int iA = pzsVar.a("attempt_count_key", -1);
        if (TextUtils.isEmpty(strD)) {
            a.r("Undefined target Id for the upload task");
            e(4);
            this.e.f(d(emcn.WORK_ITEM_ID_MISSING, cpyjVarA, zH, iA));
            return eijx.e(new bzrp(new qam(), null));
        }
        bzud bzudVar = bzud.UNKNOWN_FAILURE;
        int iOrdinal = cpyjVarA.ordinal();
        if (iOrdinal == 1) {
            final MessagePartCoreData messagePartCoreDataA = ((bbae) this.j.b()).a(strD);
            if (messagePartCoreDataA == null) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Upload a non-exist part is requested");
                cqbdVarE.A("part id", strD);
                cqbdVarE.r();
                e(4);
                this.e.f(d(emcn.LOCAL_ROW_MISSING, cpyj.MEDIA, zH, iA));
                return eijx.e(new bzrp(new qam(), null));
            }
            eiju eijuVarB = this.g.b(messagePartCoreDataA);
            eooz eoozVar = new eooz() { // from class: bzsr
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String str = (String) obj;
                    cqbd cqbdVarA = bztj.a.a();
                    cqbdVarA.I("Upload media success");
                    String str2 = strD;
                    cqbdVarA.A("part id", str2);
                    cqbdVarA.A("CmsFileId", str);
                    cqbdVarA.r();
                    bztj bztjVar = this.a;
                    bztjVar.g(1);
                    MessagePartCoreData messagePartCoreData = messagePartCoreDataA;
                    bztjVar.h(messagePartCoreData.B().b());
                    return bztjVar.c(messagePartCoreData, str2, str, zH);
                }
            };
            eosc eoscVar = this.k;
            eiju eijuVarI = eijuVarB.i(eoozVar, eoscVar);
            ejvr ejvrVar = new ejvr() { // from class: bzta
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return new bzrp(new qao(), null);
                }
            };
            eosc eoscVar2 = this.d;
            return eijuVarI.h(ejvrVar, eoscVar2).e(FileNotFoundException.class, new ejvr() { // from class: bztb
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bztj bztjVar = this.a;
                    bztjVar.e(7);
                    bztjVar.e.f(bztj.d(emcn.MEDIA_UPLOAD_FILE_NOT_FOUND, cpyj.MEDIA, zH, iA));
                    return new bzrp(new qam(), (FileNotFoundException) obj);
                }
            }, eoscVar2).f(cpzj.class, new eooz() { // from class: bztc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final cpzj cpzjVar = (cpzj) obj;
                    bztj.a.s("OutOfSqsStorageQuotaException thrown in uploadMediaPart! ", cpzjVar);
                    bztj bztjVar = this.a;
                    bztjVar.f(bzud.OUT_OF_SQS_STORAGE_ERROR);
                    emcn emcnVar = emcn.NO_SQS_STORAGE_QUOTA_FOR_MEDIA;
                    cpyj cpyjVar = cpyj.MEDIA;
                    boolean z = zH;
                    int i = iA;
                    bztjVar.e.f(bztj.d(emcnVar, cpyjVar, z, i));
                    byiu byiuVar = (byiu) byiv.a.createBuilder();
                    int iA2 = bztjVar.b.a();
                    byiuVar.copyOnWrite();
                    byiv byivVar = (byiv) byiuVar.instance;
                    byivVar.b |= 1;
                    byivVar.c = iA2;
                    byiuVar.copyOnWrite();
                    byiv byivVar2 = (byiv) byiuVar.instance;
                    byivVar2.b |= 2;
                    byivVar2.d = 5;
                    String str = cpzjVar.a;
                    byiuVar.copyOnWrite();
                    byiv byivVar3 = (byiv) byiuVar.instance;
                    str.getClass();
                    byivVar3.b |= 4;
                    byivVar3.e = str;
                    byiuVar.copyOnWrite();
                    byiv byivVar4 = (byiv) byiuVar.instance;
                    byivVar4.b |= 16;
                    byivVar4.g = z;
                    byiuVar.copyOnWrite();
                    byiv byivVar5 = (byiv) byiuVar.instance;
                    byivVar5.b |= 32;
                    byivVar5.h = i;
                    return bztjVar.c.a((byiv) byiuVar.build(), cpzjVar, z, i).h(new ejvr() { // from class: bzst
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            return new bzrp(new qam(), cpzjVar);
                        }
                    }, bztjVar.d);
                }
            }, eoscVar).e(bzuc.class, new ejvr() { // from class: bztd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    bzuc bzucVar = (bzuc) obj;
                    return new bzrp(this.a.a(bzucVar, zH, iA, cpyj.MEDIA), bzucVar);
                }
            }, eoscVar2).e(Throwable.class, new ejvr() { // from class: bzte
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    cqbd cqbdVarE2 = bztj.a.e();
                    cqbdVarE2.I("Failed to upload media and update file. Will retry");
                    cqbdVarE2.A("part id", strD);
                    cqbdVarE2.s(th);
                    emcd emcdVarB = cpyj.b(cpyj.MEDIA);
                    boolean z = zH;
                    int i = iA;
                    bztj bztjVar = this.a;
                    bztjVar.e.h(true, emcdVarB, z, i, th);
                    bztjVar.f(bzud.UNKNOWN_FAILURE);
                    return new bzrp(new qan(), th);
                }
            }, eoscVar2);
        }
        if (iOrdinal == 2) {
            ParticipantsTable.BindData bindDataB = ((bbca) this.i.b()).b(strD);
            if (bindDataB != null) {
                eiju eijuVarH = this.g.c(bindDataB).h(new ejvr() { // from class: bzsw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cqbd cqbdVarA = bztj.a.a();
                        cqbdVarA.I("Upload profile photo success");
                        String str = strD;
                        cqbdVarA.A("participant id", str);
                        cqbdVarA.A("CmsFileId", (String) obj);
                        cqbdVarA.r();
                        bztj bztjVar = this.a;
                        bztjVar.g(0);
                        byiu byiuVar = (byiu) byiv.a.createBuilder();
                        byiuVar.copyOnWrite();
                        byiv byivVar = (byiv) byiuVar.instance;
                        byivVar.b |= 16;
                        byivVar.g = false;
                        int iA2 = bztjVar.b.a();
                        byiuVar.copyOnWrite();
                        byiv byivVar2 = (byiv) byiuVar.instance;
                        byivVar2.b |= 1;
                        byivVar2.c = iA2;
                        byiuVar.copyOnWrite();
                        byiv byivVar3 = (byiv) byiuVar.instance;
                        str.getClass();
                        byivVar3.b |= 4;
                        byivVar3.e = str;
                        byiuVar.copyOnWrite();
                        byiv byivVar4 = (byiv) byiuVar.instance;
                        byivVar4.b |= 2;
                        byivVar4.d = 3;
                        byiuVar.copyOnWrite();
                        byiv byivVar5 = (byiv) byiuVar.instance;
                        byivVar5.b |= 8;
                        byivVar5.f = byxy.a(5);
                        bztjVar.f.c((byiv) byiuVar.build());
                        return new bzrp(new qao(), null);
                    }
                }, this.m);
                ejvr ejvrVar2 = new ejvr() { // from class: bzsx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        bzuc bzucVar = (bzuc) obj;
                        return new bzrp(this.a.a(bzucVar, zH, iA, cpyj.PROFILE_PHOTO), bzucVar);
                    }
                };
                eosc eoscVar3 = this.d;
                return eijuVarH.e(bzuc.class, ejvrVar2, eoscVar3).e(Throwable.class, new ejvr() { // from class: bzsy
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        cqbd cqbdVarE2 = bztj.a.e();
                        cqbdVarE2.I("Failed to upload participant profile photo will retry");
                        cqbdVarE2.A("participant id", strD);
                        cqbdVarE2.r();
                        emcd emcdVarB = cpyj.b(cpyj.PROFILE_PHOTO);
                        boolean z = zH;
                        int i = iA;
                        bztj bztjVar = this.a;
                        bztjVar.e.h(true, emcdVarB, z, i, th);
                        bztjVar.f(bzud.UNKNOWN_FAILURE);
                        return new bzrp(new qan(), th);
                    }
                }, eoscVar3);
            }
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Upload a non-exist participant's profile photo is requested");
            cqbdVarE2.A("participant id", strD);
            cqbdVarE2.r();
            e(4);
            this.e.f(d(emcn.LOCAL_ROW_MISSING, cpyj.PROFILE_PHOTO, zH, iA));
            return eijx.e(new bzrp(new qam(), null));
        }
        if (iOrdinal != 3) {
            a.r("Undefined Upload task type");
            e(5);
            this.e.f(d(emcn.UNSUPPORTED_OPERATION, cpyjVarA, zH, iA));
            return eijx.e(new bzrp(new qam(), null));
        }
        final MessagePartCoreData messagePartCoreDataA2 = ((bbae) this.j.b()).a(strD);
        if (messagePartCoreDataA2 == null) {
            cqbd cqbdVarE3 = a.e();
            cqbdVarE3.I("Upload a non-exist image part is requested");
            cqbdVarE3.A("part id", strD);
            cqbdVarE3.r();
            e(4);
            this.e.f(d(emcn.LOCAL_ROW_MISSING, cpyj.COMPRESSED_IMAGE, zH, iA));
            return eijx.e(new bzrp(new qam(), null));
        }
        eiju eijuVarA = this.g.a(messagePartCoreDataA2);
        eooz eoozVar2 = new eooz() { // from class: bztf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str = (String) obj;
                cqbd cqbdVarA = bztj.a.a();
                cqbdVarA.I("Upload compressed image success");
                String str2 = strD;
                cqbdVarA.A("part id", str2);
                cqbdVarA.A("CmsFileId", str);
                cqbdVarA.r();
                bztj bztjVar = this.a;
                bztjVar.g(2);
                MessagePartCoreData messagePartCoreData = messagePartCoreDataA2;
                bztjVar.h(messagePartCoreData.B().b());
                return bztjVar.c(messagePartCoreData, str2, str, zH);
            }
        };
        eosc eoscVar4 = this.k;
        eiju eijuVarI2 = eijuVarA.i(eoozVar2, eoscVar4);
        ejvr ejvrVar3 = new ejvr() { // from class: bztg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new bzrp(new qao(), null);
            }
        };
        eosc eoscVar5 = this.d;
        return eijuVarI2.h(ejvrVar3, eoscVar5).f(cpzj.class, new eooz() { // from class: bzth
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cpzj cpzjVar = (cpzj) obj;
                cqbd cqbdVarE4 = bztj.a.e();
                cqbdVarE4.I("OutOfSqsStorageQuotaException thrown in uploadCompressedImage! ");
                cqbdVarE4.s(cpzjVar);
                emcn emcnVar = emcn.NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE;
                cpyj cpyjVar = cpyj.COMPRESSED_IMAGE;
                boolean z = zH;
                emca emcaVarD = bztj.d(emcnVar, cpyjVar, z, iA);
                bztj bztjVar = this.a;
                bztjVar.e.f(emcaVarD);
                bztjVar.f(bzud.OUT_OF_SQS_STORAGE_ERROR);
                byiu byiuVar = (byiu) byiv.a.createBuilder();
                int iA2 = bztjVar.b.a();
                byiuVar.copyOnWrite();
                byiv byivVar = (byiv) byiuVar.instance;
                byivVar.b |= 1;
                byivVar.c = iA2;
                byiuVar.copyOnWrite();
                byiv byivVar2 = (byiv) byiuVar.instance;
                byivVar2.b |= 2;
                byivVar2.d = 5;
                String str = cpzjVar.a;
                byiuVar.copyOnWrite();
                byiv byivVar3 = (byiv) byiuVar.instance;
                str.getClass();
                byivVar3.b |= 4;
                byivVar3.e = str;
                byiuVar.copyOnWrite();
                byiv byivVar4 = (byiv) byiuVar.instance;
                byivVar4.b |= 16;
                byivVar4.g = z;
                return bztjVar.c.a((byiv) byiuVar.build(), cpzjVar, z, 0).h(new ejvr() { // from class: bzsz
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return new bzrp(new qam(), cpzjVar);
                    }
                }, bztjVar.d);
            }
        }, eoscVar4).e(bzuc.class, new ejvr() { // from class: bzti
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bzuc bzucVar = (bzuc) obj;
                return new bzrp(this.a.a(bzucVar, zH, iA, cpyj.COMPRESSED_IMAGE), bzucVar);
            }
        }, eoscVar5).e(Throwable.class, new ejvr() { // from class: bzss
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                cqbd cqbdVarE4 = bztj.a.e();
                cqbdVarE4.I("Failed to upload compressed image will retry");
                cqbdVarE4.A("part id", strD);
                cqbdVarE4.r();
                emcd emcdVarB = cpyj.b(cpyj.COMPRESSED_IMAGE);
                boolean z = zH;
                int i = iA;
                bztj bztjVar = this.a;
                bztjVar.e.h(true, emcdVarB, z, i, th);
                bztjVar.f(bzud.UNKNOWN_FAILURE);
                return new bzrp(new qan(), th);
            }
        }, eoscVar5);
    }

    public final eiju c(MessagePartCoreData messagePartCoreData, String str, String str2, boolean z) {
        if (!((Boolean) ((cczi) cpyl.s.get()).e()).booleanValue() || !cpyl.a()) {
            return eijx.e(null);
        }
        final long jA = MessageIdType.a(messagePartCoreData.B());
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("updateObjectIdForCmsFile");
        brdrVarD.h(new Function() { // from class: bzsu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.p(bary.b(String.valueOf(jA)));
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        MessagesTable.BindData bindData = (MessagesTable.BindData) brdrVarD.b().l();
        String strU = bindData == null ? null : bindData.U();
        if (ejwk.c(strU)) {
            return eijx.e(null);
        }
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Updating object ID for CMS file");
        cqbdVarC.A("part Id", str);
        cqbdVarC.A("CmsObjectId", strU);
        cqbdVarC.A("CmsFileId", str2);
        cqbdVarC.r();
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("object_id");
        evrw evrwVar = (evrw) evrvVar.build();
        cpmc cpmcVar = this.h;
        eqkn eqknVar = (eqkn) eqko.a.createBuilder();
        eqknVar.copyOnWrite();
        eqko eqkoVar = (eqko) eqknVar.instance;
        str2.getClass();
        eqkoVar.b = str2;
        eqknVar.copyOnWrite();
        eqko eqkoVar2 = (eqko) eqknVar.instance;
        strU.getClass();
        eqkoVar2.i = strU;
        return cpmcVar.U((eqko) eqknVar.build(), evrwVar, z).h(new ejvr() { // from class: bzsv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }

    public final void e(int i) {
        this.l.e("Bugle.Cms.Media.Upload.Failure.Count", i);
    }

    public final void f(bzud bzudVar) {
        int i;
        bzud bzudVar2 = bzud.UNKNOWN_FAILURE;
        switch (bzudVar.ordinal()) {
            case 1:
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            default:
                i = 0;
                break;
        }
        this.l.e("Bugle.Cms.Media.Upload.Failure.Count", i);
    }

    public final void g(int i) {
        this.l.e("Bugle.Cms.Media.Upload.Success.Count", i);
    }

    public final void h(String str) {
        byiu byiuVar = (byiu) byiv.a.createBuilder();
        byiuVar.copyOnWrite();
        byiv byivVar = (byiv) byiuVar.instance;
        byivVar.b |= 16;
        byivVar.g = false;
        int iA = this.b.a();
        byiuVar.copyOnWrite();
        byiv byivVar2 = (byiv) byiuVar.instance;
        byivVar2.b |= 1;
        byivVar2.c = iA;
        byiuVar.copyOnWrite();
        byiv byivVar3 = (byiv) byiuVar.instance;
        str.getClass();
        byivVar3.b |= 4;
        byivVar3.e = str;
        byiuVar.copyOnWrite();
        byiv byivVar4 = (byiv) byiuVar.instance;
        byivVar4.b |= 2;
        byivVar4.d = 5;
        byiuVar.copyOnWrite();
        byiv byivVar5 = (byiv) byiuVar.instance;
        byivVar5.b |= 8;
        byivVar5.f = byxy.a(5);
        this.f.c((byiv) byiuVar.build());
    }
}
