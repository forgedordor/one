package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzsm implements bzrq {
    public static final cqce a = cqce.g("BugleCms", "CmsMediaUploadSchedulerImpl");
    public final bzsn b;
    public final efwo c;
    public final fcsu d;
    public final aukz e;
    public final fcsu f;
    public final byeq g;
    private final fcsu h;
    private final eosc i;
    private final eosc j;
    private final cogw k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;

    public bzsm(bzsn bzsnVar, efwo efwoVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, aukz aukzVar, byeq byeqVar, fcsu fcsuVar12, fcsu fcsuVar13) {
        this.b = bzsnVar;
        this.c = efwoVar;
        this.h = fcsuVar;
        this.i = eoscVar;
        this.j = eoscVar2;
        this.k = cogwVar;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar2;
        this.o = fcsuVar5;
        this.p = fcsuVar7;
        this.q = fcsuVar8;
        this.r = fcsuVar6;
        this.s = fcsuVar9;
        this.t = fcsuVar10;
        this.u = fcsuVar11;
        this.e = aukzVar;
        this.g = byeqVar;
        this.f = fcsuVar12;
        this.d = fcsuVar13;
    }

    public static cbcu k(boolean z, boolean z2, boolean z3, boolean z4, byjb byjbVar, cbog cbogVar) {
        if (!z) {
            return z3 ? cbcu.g("cms_incremental_sync_media_upload_requiring_wifi", byjbVar, cbogVar) : cbcu.g("cms_incremental_sync_media_upload", byjbVar, cbogVar);
        }
        if (z4) {
            if (z3) {
                return z2 ? cbcu.g("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", byjbVar, cbogVar) : cbcu.g("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", byjbVar, cbogVar);
            }
            z3 = false;
        }
        return z4 ? z2 ? cbcu.g("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", byjbVar, cbogVar) : cbcu.g("cms_initial_sync_media_upload_requiring_battery_not_low", byjbVar, cbogVar) : z3 ? z2 ? cbcu.g("cms_initial_sync_media_upload_requiring_wifi_foreground", byjbVar, cbogVar) : cbcu.g("cms_initial_sync_media_upload_requiring_wifi", byjbVar, cbogVar) : z2 ? cbcu.g("cms_initial_sync_media_upload_foreground", byjbVar, cbogVar) : cbcu.g("cms_initial_sync_media_upload", byjbVar, cbogVar);
    }

    public static boolean n(aumq aumqVar, boolean z) {
        if (!cpyl.a() || !((Boolean) ((cczi) cpyl.z.get()).e()).booleanValue()) {
            return false;
        }
        auml aumlVarB = auml.b(aumqVar.l);
        if (aumlVarB == null) {
            aumlVarB = auml.UNSPECIFIED_STATUS;
        }
        return aumlVarB != auml.ENABLED && z;
    }

    @Override // defpackage.bzrq
    public final eiju a() {
        return ((aurx) this.h.b()).k().i(new eooz() { // from class: bzsh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final aumq aumqVar = (aumq) obj;
                final bzsm bzsmVar = this.a;
                return bzsmVar.g.b("resetQueuesAndMoveToBackground", new Runnable() { // from class: bzsl
                    @Override // java.lang.Runnable
                    public final void run() {
                        bzsm bzsmVar2 = bzsmVar;
                        aumq aumqVar2 = aumqVar;
                        boolean z = aumqVar2.d;
                        List listM = bzsmVar2.m(true);
                        int size = listM.size();
                        ekfw ekfwVar = new ekfw();
                        Iterator it = listM.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            byjb byjbVar = (byjb) ((caxt) it.next()).a;
                            boolean zN = bzsm.n(aumqVar2, byjbVar.f);
                            int i2 = byjbVar.g;
                            String str = byjbVar.e;
                            cpyj cpyjVarA = cpyj.a(byjbVar.d);
                            evvp evvpVar = byjbVar.h;
                            if (evvpVar == null) {
                                evvpVar = evvp.a;
                            }
                            ekfwVar.h(bzsmVar2.j(i2, str, cpyjVarA, Optional.of(evvpVar), Optional.empty(), byjbVar.f, false, z, zN));
                            if (zN) {
                                i++;
                            }
                        }
                        ((cazj) bzsmVar2.d.b()).d(ekfwVar.g());
                        cqbd cqbdVarC = bzsm.a.c();
                        cqbdVarC.I("Re-enqueued media upload work to background service queue");
                        cqbdVarC.y("count of re-enqueued items", size);
                        cqbdVarC.B("requireWifi", z);
                        cqbdVarC.y("count of work requireBatteryNotLow", i);
                        cqbdVarC.r();
                    }
                });
            }
        }, this.i).f(Exception.class, new eooz() { // from class: bzsi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return this.a.l(emcd.UNSPECIFIED_BACKUP_TYPE, null, emcn.MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED).i(new eooz() { // from class: bzsg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.d(exc);
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }

    @Override // defpackage.bzrq
    public final eiju b(final byjb byjbVar) {
        return ((aurx) this.h.b()).k().h(new ejvr() { // from class: bzsb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                boolean z = aumqVar.d;
                byjb byjbVar2 = byjbVar;
                boolean z2 = byjbVar2.f;
                boolean zN = bzsm.n(aumqVar, z2);
                int i = byjbVar2.g;
                int i2 = i + 1;
                int iIntValue = ((Integer) cpyl.f.e()).intValue();
                bzsm bzsmVar = this.a;
                if (i2 < iIntValue) {
                    if (!((apou) bzsmVar.f.b()).a()) {
                        bzsmVar.c(byjbVar2.e, cpyj.a(byjbVar2.d), byjbVar2.f, z, zN, i2);
                        return null;
                    }
                    evvp evvpVar = byjbVar2.h;
                    if (evvpVar == null) {
                        evvpVar = evvp.a;
                    }
                    bzsmVar.d(byjbVar2.e, cpyj.a(byjbVar2.d), byjbVar2.f, z, zN, i2, evvpVar);
                    return null;
                }
                embz embzVar = (embz) emca.a.createBuilder();
                emcd emcdVarB = cpyj.b(cpyj.a(byjbVar2.d));
                embzVar.copyOnWrite();
                emca emcaVar = (emca) embzVar.instance;
                emcaVar.c = emcdVarB.w;
                emcaVar.b |= 1;
                int i3 = true != z2 ? 3 : 2;
                embzVar.copyOnWrite();
                emca emcaVar2 = (emca) embzVar.instance;
                emcaVar2.g = i3 - 1;
                emcaVar2.b |= 16;
                embzVar.copyOnWrite();
                emca emcaVar3 = (emca) embzVar.instance;
                emcaVar3.d = 3;
                emcaVar3.b |= 2;
                embzVar.copyOnWrite();
                emca emcaVar4 = (emca) embzVar.instance;
                emcaVar4.b |= 8;
                emcaVar4.f = i;
                emcn emcnVar = emcn.BACKUP_REACHES_MAX_RETRY;
                embzVar.copyOnWrite();
                emca emcaVar5 = (emca) embzVar.instance;
                emcaVar5.e = emcnVar.bs;
                emcaVar5.b |= 4;
                bzsmVar.e.f((emca) embzVar.build());
                return null;
            }
        }, this.i);
    }

    @Override // defpackage.bzrq
    @Deprecated
    public final void c(String str, cpyj cpyjVar, boolean z, boolean z2, boolean z3, int i) {
        ((cazj) this.d.b()).a(j(i, str, cpyjVar, Optional.empty(), Optional.empty(), z, false, z2, z3));
    }

    @Override // defpackage.bzrq
    public final void d(String str, cpyj cpyjVar, boolean z, boolean z2, boolean z3, int i, evvp evvpVar) {
        ((cazj) this.d.b()).a(j(i, str, cpyjVar, Optional.of(evvpVar), Optional.empty(), z, o(evvpVar), z2, z3));
    }

    @Override // defpackage.bzrq
    public final void e(final boolean z) {
        eiju eijuVarI = ((aurx) this.h.b()).k().i(new eooz() { // from class: bzsj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final aumq aumqVar = (aumq) obj;
                final bzsm bzsmVar = this.a;
                final boolean z2 = z;
                return bzsmVar.g.b("resetQueuesForWifiSettingChange", new Runnable() { // from class: bzrv
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z3;
                        boolean z4;
                        bzsm bzsmVar2 = bzsmVar;
                        List listM = bzsmVar2.m(false);
                        int size = listM.size();
                        ekfw ekfwVar = new ekfw();
                        Iterator it = listM.iterator();
                        int i = 0;
                        while (true) {
                            z3 = z2;
                            if (!it.hasNext()) {
                                break;
                            }
                            aumq aumqVar2 = aumqVar;
                            byjb byjbVar = (byjb) ((caxt) it.next()).a;
                            boolean z5 = byjbVar.f;
                            boolean zN = bzsm.n(aumqVar2, z5);
                            if (((apou) bzsmVar2.f.b()).a()) {
                                int i2 = byjbVar.g;
                                String str = byjbVar.e;
                                cpyj cpyjVarA = cpyj.a(byjbVar.d);
                                evvp evvpVar = byjbVar.h;
                                if (evvpVar == null) {
                                    evvpVar = evvp.a;
                                }
                                z4 = zN;
                                ekfwVar.h(bzsmVar2.j(i2, str, cpyjVarA, Optional.of(evvpVar), Optional.empty(), byjbVar.f, byjbVar.j, z3, z4));
                            } else {
                                z4 = zN;
                                bzsmVar2.c(byjbVar.e, cpyj.a(byjbVar.d), z5, z3, zN, 0);
                            }
                            if (z4) {
                                i++;
                            }
                        }
                        ekgb ekgbVarG = ekfwVar.g();
                        if (!ekgbVarG.isEmpty()) {
                            ((cazj) bzsmVar2.d.b()).d(ekgbVarG);
                        }
                        cqbd cqbdVarC = bzsm.a.c();
                        cqbdVarC.I("Re-enqueued media upload work after Wi-Fi settings constraint change");
                        cqbdVarC.y("count of re-enqueued items", size);
                        cqbdVarC.B("requireWifi", z3);
                        cqbdVarC.y("count of work requiring requireBatteryNotLow", i);
                        cqbdVarC.r();
                    }
                });
            }
        }, this.i);
        eooz eoozVar = new eooz() { // from class: bzsk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return this.a.l(emcd.UNSPECIFIED_BACKUP_TYPE, null, emcn.MEDIA_UPLOAD_SCHEDULER_RE_ENQUEUE_AFTER_WIFI_CHANGE_FAILED).i(new eooz() { // from class: bzrr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.d(exc);
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarI.f(Exception.class, eoozVar, eoqgVar).k(auvh.b(), eoqgVar);
    }

    @Override // defpackage.bzrq
    public final void f(MessageCoreData messageCoreData, final boolean z, final evvp evvpVar) {
        final List listM = messageCoreData.M();
        if (listM.isEmpty()) {
            return;
        }
        eiju eijuVarH = ((aurx) this.h.b()).k().h(new ejvr() { // from class: bzrz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                boolean z2 = aumqVar.d;
                boolean z3 = z;
                boolean zN = bzsm.n(aumqVar, z3);
                for (MessagePartCoreData messagePartCoreData : listM) {
                    bzsm bzsmVar = this.a;
                    if (bzsmVar.b.a(messagePartCoreData)) {
                        if (((apou) bzsmVar.f.b()).a() && z3) {
                            bzsmVar.d(messagePartCoreData.W(), cpyj.COMPRESSED_IMAGE, true, z2, zN, 0, evvpVar);
                        } else {
                            bzsmVar.c(messagePartCoreData.W(), cpyj.COMPRESSED_IMAGE, z3, z2, zN, 0);
                        }
                    }
                }
                return true;
            }
        }, this.i);
        eooz eoozVar = new eooz() { // from class: bzsf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return this.a.l(emcd.MEDIA_COMPRESSED_SIZE_BACKUP, Boolean.valueOf(z), emcn.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eooz() { // from class: bzrs
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.d(exc);
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarH.f(Exception.class, eoozVar, eoqgVar).k(auvh.b(), eoqgVar);
    }

    @Override // defpackage.bzrq
    public final void g(MessageCoreData messageCoreData, final boolean z, final evvp evvpVar) {
        final List listM = messageCoreData.M();
        if (listM.isEmpty()) {
            return;
        }
        eiju eijuVarH = ((aurx) this.h.b()).k().h(new ejvr() { // from class: bzsd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                boolean z2 = aumqVar.d;
                boolean z3 = z;
                boolean zN = bzsm.n(aumqVar, z3);
                for (MessagePartCoreData messagePartCoreData : listM) {
                    if (bzsn.c(messagePartCoreData)) {
                        bzsm bzsmVar = this.a;
                        if (((apou) bzsmVar.f.b()).a() && z3) {
                            bzsmVar.d(messagePartCoreData.W(), cpyj.MEDIA, true, z2, zN, 0, evvpVar);
                        } else {
                            bzsmVar.c(messagePartCoreData.W(), cpyj.MEDIA, z3, z2, zN, 0);
                        }
                    }
                }
                return true;
            }
        }, this.i);
        eooz eoozVar = new eooz() { // from class: bzse
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return this.a.l(emcd.MEDIA_FULL_SIZE_BACKUP, Boolean.valueOf(z), emcn.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eooz() { // from class: bzrx
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.d(exc);
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarH.f(Exception.class, eoozVar, eoqgVar).k(auvh.b(), eoqgVar);
    }

    @Override // defpackage.bzrq
    public final void h(final ParticipantsTable.BindData bindData) {
        eiju eijuVarH = ((aurx) this.h.b()).k().h(new ejvr() { // from class: bzry
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                boolean z = aumqVar.d;
                boolean zN = bzsm.n(aumqVar, false);
                bzsm bzsmVar = this.a;
                bzsn bzsnVar = bzsmVar.b;
                ParticipantsTable.BindData bindData2 = bindData;
                if (bzsnVar.b(bindData2)) {
                    bzsmVar.c(bindData2.R(), cpyj.PROFILE_PHOTO, false, z, zN, 0);
                }
                return true;
            }
        }, this.i);
        eooz eoozVar = new eooz() { // from class: bzsa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                return this.a.l(emcd.MEDIA_PROFILE_PHOTO_BACKUP, false, emcn.MEDIA_UPLOAD_SCHEDULER_FIRST_ENQUEUE_FAILED).i(new eooz() { // from class: bzsc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return eijx.d(exc);
                    }
                }, eoqg.a);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarH.f(Exception.class, eoozVar, eoqgVar).k(auvh.b(), eoqgVar);
    }

    @Override // defpackage.bzrq
    public final eiju i(final int i, final evvp evvpVar, final int i2, final boolean z) {
        if (i == 0) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return ((aurx) this.h.b()).k().h(new ejvr() { // from class: bzrw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aumq aumqVar = (aumq) obj;
                    boolean z2 = aumqVar.d;
                    boolean zN = bzsm.n(aumqVar, true);
                    bzsm bzsmVar = this.a;
                    evvp evvpVar2 = evvpVar;
                    cpyj cpyjVar = cpyj.UNDEFINED;
                    boolean zO = bzsmVar.o(evvpVar2);
                    byix byixVar = (byix) byiy.a.createBuilder();
                    byixVar.copyOnWrite();
                    byiy byiyVar = (byiy) byixVar.instance;
                    byiyVar.b |= 1;
                    byiyVar.c = i2;
                    byixVar.copyOnWrite();
                    byiy byiyVar2 = (byiy) byixVar.instance;
                    int i3 = i;
                    byiyVar2.d = i3 - 1;
                    byiyVar2.b |= 2;
                    byixVar.copyOnWrite();
                    byiy byiyVar3 = (byiy) byixVar.instance;
                    byiyVar3.b |= 4;
                    byiyVar3.e = z;
                    byiy byiyVar4 = (byiy) byixVar.build();
                    byiw byiwVar = (byiw) byjb.a.createBuilder();
                    efwo efwoVar = bzsmVar.c;
                    int iA = efwoVar.a();
                    byiwVar.copyOnWrite();
                    byjb byjbVar = (byjb) byiwVar.instance;
                    byjbVar.b |= 1;
                    byjbVar.c = iA;
                    int i4 = cpyjVar.e;
                    byiwVar.copyOnWrite();
                    byjb byjbVar2 = (byjb) byiwVar.instance;
                    byjbVar2.b |= 2;
                    byjbVar2.d = i4;
                    byiwVar.copyOnWrite();
                    byjb byjbVar3 = (byjb) byiwVar.instance;
                    byjbVar3.b |= 8;
                    byjbVar3.f = true;
                    byiwVar.copyOnWrite();
                    byjb byjbVar4 = (byjb) byiwVar.instance;
                    byjbVar4.b |= 32;
                    byjbVar4.g = 0;
                    byiwVar.copyOnWrite();
                    byjb byjbVar5 = (byjb) byiwVar.instance;
                    evvpVar2.getClass();
                    byjbVar5.h = evvpVar2;
                    byjbVar5.b |= 64;
                    byiwVar.copyOnWrite();
                    byjb byjbVar6 = (byjb) byiwVar.instance;
                    byiyVar4.getClass();
                    byjbVar6.i = byiyVar4;
                    byjbVar6.b |= 128;
                    byiwVar.copyOnWrite();
                    byjb byjbVar7 = (byjb) byiwVar.instance;
                    byjbVar7.b |= 256;
                    byjbVar7.j = zO;
                    byjb byjbVar8 = (byjb) byiwVar.build();
                    caxr caxrVar = new caxr();
                    caxrVar.b = bzwb.a(efwoVar.toString(), byja.a(i3), cpyjVar, zO);
                    ((cazj) bzsmVar.d.b()).a(bzsm.k(true, zO, z2, zN, byjbVar8, caxrVar.a()));
                    return null;
                }
            }, this.j);
        }
        ((ekrd) a.k().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaUploadSchedulerImpl", "queueLogMediaUploadStage", 676, "CmsMediaUploadSchedulerImpl.java")).t("Not queueing %s event log for media upload metrics because it is not a valid stage.", byja.a(i));
        throw new IllegalArgumentException(String.format("%s is an invalid stage to log during media upload.", byja.a(i)));
    }

    public final cbcu j(int i, String str, cpyj cpyjVar, Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4) {
        final byiw byiwVar = (byiw) byjb.a.createBuilder();
        efwo efwoVar = this.c;
        int iA = efwoVar.a();
        byiwVar.copyOnWrite();
        byjb byjbVar = (byjb) byiwVar.instance;
        byjbVar.b |= 1;
        byjbVar.c = iA;
        byiwVar.copyOnWrite();
        byjb byjbVar2 = (byjb) byiwVar.instance;
        str.getClass();
        byjbVar2.b |= 4;
        byjbVar2.e = str;
        int i2 = cpyjVar.e;
        byiwVar.copyOnWrite();
        byjb byjbVar3 = (byjb) byiwVar.instance;
        byjbVar3.b |= 2;
        byjbVar3.d = i2;
        byiwVar.copyOnWrite();
        byjb byjbVar4 = (byjb) byiwVar.instance;
        byjbVar4.b |= 8;
        byjbVar4.f = z;
        byiwVar.copyOnWrite();
        byjb byjbVar5 = (byjb) byiwVar.instance;
        byjbVar5.b |= 32;
        byjbVar5.g = i;
        byiwVar.copyOnWrite();
        byjb byjbVar6 = (byjb) byiwVar.instance;
        byjbVar6.b |= 256;
        byjbVar6.j = z2;
        optional.ifPresent(new Consumer() { // from class: bzrt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                byiw byiwVar2 = byiwVar;
                evvp evvpVar = (evvp) obj;
                byiwVar2.copyOnWrite();
                byjb byjbVar7 = (byjb) byiwVar2.instance;
                byjb byjbVar8 = byjb.a;
                evvpVar.getClass();
                byjbVar7.h = evvpVar;
                byjbVar7.b |= 64;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: bzru
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                byiw byiwVar2 = byiwVar;
                byiy byiyVar = (byiy) obj;
                byiwVar2.copyOnWrite();
                byjb byjbVar7 = (byjb) byiwVar2.instance;
                byjb byjbVar8 = byjb.a;
                byiyVar.getClass();
                byjbVar7.i = byiyVar;
                byjbVar7.b |= 128;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Duration durationA = Duration.ZERO;
        if (i > 0) {
            durationA = byjd.a(i, 1);
        }
        caxr caxrVar = new caxr();
        caxrVar.b = bzwb.a(efwoVar.toString(), str, cpyjVar, z2);
        caxrVar.c = durationA;
        return k(z, z2, z3, z4, (byjb) byiwVar.build(), caxrVar.a());
    }

    public final eiju l(emcd emcdVar, Boolean bool, emcn emcnVar) {
        embz embzVar = (embz) emca.a.createBuilder();
        embzVar.copyOnWrite();
        emca emcaVar = (emca) embzVar.instance;
        emcaVar.c = emcdVar.w;
        emcaVar.b |= 1;
        int i = bool != null ? bool.booleanValue() ? 2 : 3 : 1;
        embzVar.copyOnWrite();
        emca emcaVar2 = (emca) embzVar.instance;
        emcaVar2.g = i - 1;
        emcaVar2.b |= 16;
        embzVar.copyOnWrite();
        emca emcaVar3 = (emca) embzVar.instance;
        emcaVar3.d = 3;
        emcaVar3.b |= 2;
        embzVar.copyOnWrite();
        emca emcaVar4 = (emca) embzVar.instance;
        emcaVar4.e = emcnVar.bs;
        emcaVar4.b |= 4;
        emca emcaVar5 = (emca) embzVar.build();
        final aukz aukzVar = this.e;
        emce emceVar = (emce) emek.a.createBuilder();
        emceVar.copyOnWrite();
        emek emekVar = (emek) emceVar.instance;
        emcaVar5.getClass();
        emekVar.d = emcaVar5;
        emekVar.b |= 2;
        return aukzVar.a((emek) emceVar.build()).h(new auks(), aukzVar.e).h(new ejvr() { // from class: aukm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aukzVar.q((emek) obj);
                return null;
            }
        }, aukzVar.f);
    }

    public final List m(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.addAll(((bzvt) this.o.b()).a());
            arrayList.addAll(((bzvz) this.n.b()).a());
            arrayList.addAll(((bzvq) this.t.b()).a());
            arrayList.addAll(((bzvr) this.u.b()).a());
            arrayList.addAll(((bzvx) this.m.b()).a());
            arrayList.addAll(((bzvv) this.l.b()).a());
        }
        arrayList.addAll(((cazj) ((bzvs) this.s.b()).a.b()).c("cms_initial_sync_media_upload_foreground"));
        arrayList.addAll(((cazj) ((bzvy) this.r.b()).a.b()).c("cms_initial_sync_media_upload_requiring_wifi_foreground"));
        arrayList.addAll(((cazj) ((bzvw) this.q.b()).a.b()).c("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground"));
        arrayList.addAll(((cazj) ((bzvu) this.p.b()).a.b()).c("cms_initial_sync_media_upload_requiring_battery_not_low_foreground"));
        return arrayList;
    }

    public final boolean o(evvp evvpVar) {
        return ((apou) this.f.b()).a() && this.k.f().minusMillis(evxc.a(evvpVar)).toEpochMilli() <= ((Long) cpyl.O.e()).longValue();
    }
}
