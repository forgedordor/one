package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import j$.util.Collection;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dagz extends daew {
    public dacu i;
    public final fcsu j;
    public final dabl k;
    public ekgp l;
    public final AtomicInteger m;
    private final lvj n;
    private final daig o;
    private final dacl p;
    private final fcsu q;

    public dagz(Context context, lvj lvjVar, fcsu fcsuVar, dabl dablVar, dacl daclVar, daig daigVar, fcsu fcsuVar2) {
        super(context, context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_video_corner_radius));
        this.m = new AtomicInteger(0);
        this.n = lvjVar;
        this.j = fcsuVar;
        this.k = dablVar;
        this.p = daclVar;
        this.o = daigVar;
        this.q = fcsuVar2;
    }

    @Override // defpackage.daew
    public final int F(boolean z) {
        return z ? 6 : 4;
    }

    @Override // defpackage.daew
    public final void G(List list) {
        ecem.c();
        eieu eieuVarK = eiiy.k("VideosAdapter#updateResults");
        try {
            super.G(list);
            this.l = (ekgp) Collection.EL.stream(list).collect(ekcv.b(new Function() { // from class: dags
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Uri uriH = ((MediaSearchResult) obj).h();
                    uriH.getClass();
                    return uriH;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: dagt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new lvy();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new BinaryOperator() { // from class: dagu
                public final /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (lvy) obj;
                }
            }));
            final int iIncrementAndGet = this.m.incrementAndGet();
            dacl daclVar = this.p;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final MediaSearchResult mediaSearchResult = (MediaSearchResult) it.next();
                final daco dacoVar = (daco) daclVar;
                arrayList.add(((daco) daclVar).c.submit(new Callable() { // from class: dacm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long jD;
                        cqwg cqwgVar = new cqwg(dacoVar.b);
                        MediaSearchResult mediaSearchResult2 = mediaSearchResult;
                        Uri uriH = mediaSearchResult2.h();
                        uriH.getClass();
                        try {
                            try {
                                cqwgVar.c(mediaSearchResult2.h());
                                jD = cqwgVar.d(0L);
                            } catch (Throwable th) {
                                cqwgVar.b();
                                throw th;
                            }
                        } catch (IOException | NumberFormatException e) {
                            eksl ekslVar = (eksl) ((eksl) daco.a.j()).g(e);
                            ekslVar.X(daaa.d, uriH);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/ui/search/presenter/VideoDurationProviderImpl", "getVideoDurations", 75, "VideoDurationProviderImpl.java")).q("Unable to calculate video duration.");
                            jD = -1;
                        }
                        cqwgVar.b();
                        return Pair.create(uriH, Long.valueOf(jD));
                    }
                }));
            }
            eork.r(eoqt.t(eooq.f(eoqt.t(eork.e(arrayList)), new ejvr() { // from class: dacn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    List<Pair> list2 = (List) obj;
                    eksp ekspVar = daco.a;
                    ArrayMap arrayMap = new ArrayMap();
                    if (list2 != null) {
                        for (Pair pair : list2) {
                            if (pair != null && ((Long) pair.second).longValue() != -1) {
                                arrayMap.put((Uri) pair.first, (Long) pair.second);
                            }
                        }
                    }
                    return arrayMap;
                }
            }, eoqg.a)), auvh.c(new Consumer() { // from class: dagv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    int i = iIncrementAndGet;
                    dagz dagzVar = this.a;
                    Map map = (Map) obj;
                    if (i != dagzVar.m.get() || map == null || map.isEmpty()) {
                        return;
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() != null) {
                            lvy lvyVar = (lvy) dagzVar.l.get(entry.getKey());
                            lvyVar.getClass();
                            lvyVar.j((Long) entry.getValue());
                        }
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) this.q.b());
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        final dagy dagyVar = new dagy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_video_result_item, viewGroup, false));
        dagyVar.u.setOnClickListener(new View.OnClickListener() { // from class: dagw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dagz dagzVar = this.a;
                dagzVar.i.u(new dabq(3, dagyVar.ft()));
                ((dabm) dagzVar.j.b()).e(3);
                dagzVar.k.f(6, 4);
            }
        });
        return dagyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    @Override // defpackage.vo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void g(defpackage.wv r8, int r9) {
        /*
            r7 = this;
            dagy r8 = (defpackage.dagy) r8
            android.widget.ImageView r0 = r8.v
            android.view.View r1 = r8.u
            com.google.android.apps.messaging.ui.search.resultsview.MediaGridLayoutManager r2 = r7.e
            int r1 = r2.bE(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.width = r1
            r2.height = r1
            java.util.List r2 = r7.g
            java.lang.Object r9 = r2.get(r9)
            com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult r9 = (com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult) r9
            daig r2 = r7.o
            r3 = 1
            java.lang.String r2 = r2.a(r9, r3)
            r0.setContentDescription(r2)
            ekgp r2 = r7.l
            android.net.Uri r4 = r9.h()
            java.lang.Object r2 = r2.get(r4)
            lvy r2 = (defpackage.lvy) r2
            r2.getClass()
            boolean r4 = r9.o()
            cpdw r5 = r8.w
            boolean r6 = r5.i()
            if (r6 != 0) goto L45
            if (r4 != 0) goto L44
            goto L54
        L44:
            r4 = r3
        L45:
            android.view.View r5 = r5.b()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r3 == r4) goto L50
            r3 = 8
            goto L51
        L50:
            r3 = 0
        L51:
            r5.setVisibility(r3)
        L54:
            lvj r3 = r7.n
            lvv r4 = r8.s
            if (r4 == 0) goto L5f
            lvz r5 = r8.t
            r4.k(r5)
        L5f:
            lvz r4 = r8.t
            r2.f(r3, r4)
            r8.s = r2
            rbv r8 = r7.a
            android.net.Uri r9 = r9.h()
            rbr r8 = r8.f(r9)
            rtj r9 = r7.f
            rta r9 = r9.P(r1)
            rbr r8 = r8.q(r9)
            ruf r9 = r7.h
            rqi r9 = defpackage.rqi.c(r9)
            rbr r8 = r8.p(r9)
            r8.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dagz.g(wv, int):void");
    }
}
