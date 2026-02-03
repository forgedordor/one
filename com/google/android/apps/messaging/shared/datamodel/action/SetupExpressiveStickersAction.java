package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ayjb;
import defpackage.ayjd;
import defpackage.ayje;
import defpackage.bwwc;
import defpackage.ccze;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqmr;
import defpackage.crqv;
import defpackage.dcnf;
import defpackage.dqle;
import defpackage.dqsn;
import defpackage.ebun;
import defpackage.ebxr;
import defpackage.ehqs;
import defpackage.ehqu;
import defpackage.ehqv;
import defpackage.eieu;
import defpackage.eiid;
import defpackage.eiiy;
import defpackage.ejvr;
import defpackage.elgm;
import defpackage.eooh;
import defpackage.eooq;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eoqt;
import defpackage.eork;
import defpackage.eosc;
import defpackage.eosd;
import defpackage.etyr;
import defpackage.evsn;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.rmx;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SetupExpressiveStickersAction extends ThrottledAction implements Parcelable {
    public final fcsu b;
    public final crqv c;
    public final cogw d;
    public final eygg e;
    public final ebxr f;
    public final dqsn g;
    private final Context k;
    private final ehqv l;
    private final eosc m;
    private final eosc n;
    private final ScheduledExecutorService o;
    public static final cqce a = cqce.g("BugleDataModel", "SetupExpressiveStickersAction");
    private static final long h = TimeUnit.MINUTES.toMillis(10);
    private static final long i = TimeUnit.MINUTES.toMillis(3);
    private static final long j = TimeUnit.SECONDS.toMillis(30);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayjd();

    /* compiled from: PG */
    public interface a {
        ayje ik();
    }

    public SetupExpressiveStickersAction(Context context, fcsu fcsuVar, crqv crqvVar, cogw cogwVar, eygg eyggVar, eosc eoscVar, eosc eoscVar2, eosd eosdVar, ebxr ebxrVar, dqsn dqsnVar) {
        super(elgm.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = fcsuVar;
        this.c = crqvVar;
        this.l = ehqs.a(context);
        this.d = cogwVar;
        this.e = eyggVar;
        this.m = eoscVar;
        this.n = eoscVar2;
        this.o = eosdVar;
        this.f = ebxrVar;
        this.g = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SetupExpressiveStickersAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SetupExpressiveStickers.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 128;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SetupExpressiveStickersAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        final etyr etyrVar;
        if (!((Boolean) ccze.f.e()).booleanValue()) {
            a.r("isExpressiveStickersEnabled is false.");
            return;
        }
        if (this.c.q("is_expressive_stickers_setup_done", false)) {
            return;
        }
        if (!bwwc.c().isEmpty()) {
            this.c.h("is_expressive_stickers_setup_done", true);
            return;
        }
        this.f.c();
        try {
            etyrVar = (etyr) evsn.parseFrom(etyr.a, (byte[]) ccze.H.e());
        } catch (Exception e) {
            a.o("Failed to parse StickerMarketConfig.", e);
            etyrVar = etyr.a;
        }
        if (etyrVar.b.size() == 0) {
            a.n("StickerMarketConfig has no default sticker packs!");
            this.f.e(5);
            eork.i(null);
            return;
        }
        ListenableFuture listenableFutureD = ((ebun) this.e.b()).d();
        ejvr ejvrVar = new ejvr() { // from class: ayiq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                cqce cqceVar = SetupExpressiveStickersAction.a;
                if (list == null || list.isEmpty()) {
                    throw new IllegalStateException("No sticker metadata available");
                }
                return null;
            }
        };
        eoqg eoqgVar = eoqg.a;
        ListenableFuture listenableFutureF = eooq.f(listenableFutureD, ejvrVar, eoqgVar);
        ScheduledExecutorService scheduledExecutorService = this.o;
        ListenableFuture listenableFutureP = eork.p(listenableFutureF, j, TimeUnit.MILLISECONDS, scheduledExecutorService);
        eork.r(listenableFutureP, new ayjb(this), eoqgVar);
        eooh.f(((eoqt) eooq.f(eooq.f(eooq.g(eooq.f(eoqt.t(listenableFutureP), new ejvr() { // from class: ayix
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction setupExpressiveStickersAction = this.a;
                eork.r(((ebun) setupExpressiveStickersAction.e.b()).b(), auwc.a(new ayjc(setupExpressiveStickersAction, etyrVar)), eoqg.a);
                return null;
            }
        }, eoqgVar), new eooz() { // from class: ayiy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                etyr etyrVar2 = etyrVar;
                int size = etyrVar2.e.size();
                SetupExpressiveStickersAction setupExpressiveStickersAction = this.a;
                if (size > 0) {
                    Stream stream = Collection.EL.stream(etyrVar2.e);
                    final ebun ebunVar = (ebun) setupExpressiveStickersAction.e.b();
                    ebunVar.getClass();
                    return eooq.f(eork.o((List) stream.map(new Function() { // from class: ayim
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ebunVar.e((String) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new ayis()))), new ejvr() { // from class: ayir
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            List list = (List) obj2;
                            cqce cqceVar = SetupExpressiveStickersAction.a;
                            return list == null ? new ArrayList() : (List) Collection.EL.stream(list).filter(new Predicate() { // from class: ayio
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
                                public final boolean test(Object obj3) {
                                    return Objects.nonNull((etyp) obj3);
                                }
                            }).collect(Collectors.toCollection(new ayis()));
                        }
                    }, eoqg.a);
                }
                Stream stream2 = Collection.EL.stream(etyrVar2.b);
                final ebun ebunVar2 = (ebun) setupExpressiveStickersAction.e.b();
                ebunVar2.getClass();
                return eooq.f(eork.o((List) stream2.map(new Function() { // from class: ayit
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ebunVar2.c((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new ayis()))), new ejvr() { // from class: ayiw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        cqce cqceVar = SetupExpressiveStickersAction.a;
                        return list == null ? new ArrayList() : (List) Collection.EL.stream(list).filter(new Predicate() { // from class: ayiu
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
                            public final boolean test(Object obj3) {
                                etyu etyuVar = (etyu) obj3;
                                cqce cqceVar2 = SetupExpressiveStickersAction.a;
                                return etyuVar != null && etyuVar.h.size() > 0;
                            }
                        }).map(new Function() { // from class: ayiv
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                cqce cqceVar2 = SetupExpressiveStickersAction.a;
                                return (etyp) ((etyu) obj3).h.get(0);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new ayis()));
                    }
                }, eoqg.a);
            }
        }, eoqgVar), eiid.a(new ejvr() { // from class: ayiz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                final SetupExpressiveStickersAction setupExpressiveStickersAction;
                List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                int size = list.size() - 1;
                while (true) {
                    setupExpressiveStickersAction = this.a;
                    if (size < 0) {
                        break;
                    }
                    etyp etypVar = (etyp) list.get(size);
                    String str = etypVar.c;
                    etyb etybVar = etypVar.e;
                    if (etybVar == null) {
                        etybVar = etyb.a;
                    }
                    Uri uriL = setupExpressiveStickersAction.l(str, etybVar.c);
                    if (uriL != null) {
                        etyb etybVar2 = etypVar.e;
                        if (etybVar2 == null) {
                            etybVar2 = etyb.a;
                        }
                        etxy etxyVar = etybVar2.f;
                        if (etxyVar == null) {
                            etxyVar = etxy.a;
                        }
                        int i2 = etxyVar.b;
                        etyb etybVar3 = etypVar.e;
                        etxy etxyVar2 = (etybVar3 == null ? etyb.a : etybVar3).f;
                        if (etxyVar2 == null) {
                            etxyVar2 = etxy.a;
                        }
                        int i3 = etxyVar2.c;
                        String str2 = etypVar.c;
                        if (etybVar3 == null) {
                            etybVar3 = etyb.a;
                        }
                        arrayList.add(bwwd.a(str2, uriL, bwvy.a(etybVar3), i2 > 0 ? i2 : -1, i3 > 0 ? i3 : -1, setupExpressiveStickersAction.d.f().toEpochMilli()));
                    }
                    size--;
                }
                if (arrayList.isEmpty()) {
                    setupExpressiveStickersAction.f.e(4);
                    throw new IllegalStateException("Failed to download any recent stickers");
                }
                setupExpressiveStickersAction.g.d("SetupExpressiveStickersAction#saveAsDefaultRecentItems", new Runnable() { // from class: ayip
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SetupExpressiveStickersAction setupExpressiveStickersAction2 = setupExpressiveStickersAction;
                            ((bwwc) setupExpressiveStickersAction2.b.b()).b((btct) it.next());
                        }
                    }
                });
                return null;
            }
        }), this.n), new ejvr() { // from class: ayja
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction setupExpressiveStickersAction = this.a;
                setupExpressiveStickersAction.c.h("is_expressive_stickers_setup_done", true);
                setupExpressiveStickersAction.f.d();
                ((ebun) setupExpressiveStickersAction.e.b()).k();
                return null;
            }
        }, this.m)).u(i, TimeUnit.MILLISECONDS, scheduledExecutorService), Exception.class, new ejvr() { // from class: ayin
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction.a.o("Failed to setup expressive stickers.", (Exception) obj);
                return null;
            }
        }, eoqgVar);
    }

    public final Uri l(String str, String str2) throws IOException {
        try {
            File file = (File) dqle.b(((ehqu) this.l.d().V(rmx.a, 7500)).l(str2).s(), 7500L, TimeUnit.MILLISECONDS);
            File file2 = new File(this.k.getFilesDir(), "recent_expressive_stickers/".concat(String.valueOf(str)));
            if (!cqmr.i(file2)) {
                cqbd cqbdVarB = a.b();
                cqbdVarB.I("Failed to create directories for");
                cqbdVarB.I(file2);
                cqbdVarB.r();
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        dcnf.c(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                        return Uri.fromFile(file2);
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                a.o("Error copying expressive sticker file.", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            cqbd cqbdVarB2 = a.b();
            cqbdVarB2.I("Failed to download sticker");
            cqbdVarB2.I(str);
            cqbdVarB2.s(e2);
            return null;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C(parcel, i2);
    }

    public SetupExpressiveStickersAction(Context context, fcsu fcsuVar, crqv crqvVar, cogw cogwVar, eygg eyggVar, eosc eoscVar, eosc eoscVar2, eosd eosdVar, ebxr ebxrVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = fcsuVar;
        this.c = crqvVar;
        this.l = ehqs.a(context);
        this.d = cogwVar;
        this.e = eyggVar;
        this.m = eoscVar;
        this.n = eoscVar2;
        this.o = eosdVar;
        this.f = ebxrVar;
        this.g = dqsnVar;
    }
}
