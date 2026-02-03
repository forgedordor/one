package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import j$.util.function.LongUnaryOperator$CC;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfa extends ContentObserver {
    public static final cczv a = cdag.j(cdag.b, "ditto_desktop_check_cache_expiry_ms", 5000);
    private static final eksp f = eksp.c("BugleDitto");
    private static final UriMatcher g = new UriMatcher(-1);
    protected ezol b;
    protected String c;
    public final eygg d;
    public final cehg e;
    private final Context h;
    private final eigp i;
    private final aypr j;
    private final aypu k;
    private final ayov l;
    private final bvgm m;
    private final fcsu n;
    private final eosc o;
    private final AtomicLong p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;

    public bvfa(Context context, eigp eigpVar, eygg eyggVar, aypr ayprVar, aypu aypuVar, ayov ayovVar, bvgm bvgmVar, cehg cehgVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar) {
        super(ecem.a());
        this.p = new AtomicLong(0L);
        this.h = context;
        this.i = eigpVar;
        this.d = eyggVar;
        this.j = ayprVar;
        this.k = aypuVar;
        this.l = ayovVar;
        this.m = bvgmVar;
        this.e = cehgVar;
        this.n = fcsuVar;
        this.o = eoscVar;
        this.q = fcsuVar2;
        this.r = fcsuVar3;
        this.s = fcsuVar4;
        UriMatcher uriMatcher = g;
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.g(context).getPath()).concat("/*/*"), 10);
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.i(context).getPath()).concat("/*"), 20);
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.j(context).getPath()).concat("/*"), 40);
    }

    final synchronized void a(ezol ezolVar, String str) {
        this.b = ezolVar;
        this.c = str;
    }

    @Override // android.database.ContentObserver
    public final synchronized void onChange(boolean z, Uri uri) {
        Uri uri2;
        final ProcessMessageUpdateAsyncAction processMessageUpdateAsyncActionD;
        eiju eijuVarE;
        eieh eiehVarC = this.i.c("DittoContentObserver.onChange", "com/google/android/apps/messaging/shared/datamodel/ditto/DittoContentObserver", "onChange", 156);
        try {
            eieu eieuVarK = eiiy.k("DittoContentObserver.handleChange");
            try {
                int iMatch = g.match(uri);
                if (iMatch == 10) {
                    fcsu fcsuVar = this.n;
                    final long epochMilli = ((cogw) fcsuVar.b()).f().toEpochMilli();
                    final long jIntValue = epochMilli - ((Integer) a.e()).intValue();
                    if (DesugarAtomicLong.updateAndGet(this.p, new LongUnaryOperator() { // from class: bvex
                        public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                            return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
                        }

                        @Override // java.util.function.LongUnaryOperator
                        public final long applyAsLong(long j) {
                            cczv cczvVar = bvfa.a;
                            return j <= jIntValue ? epochMilli : j;
                        }

                        public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                            return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
                        }
                    }) == epochMilli) {
                        this.l.a(this.b, this.c).z();
                    }
                    ezol ezolVar = this.b;
                    String str = this.c;
                    if (uri != null && ezolVar != null && str != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                        if (pathSegments.size() == bace.g(this.h).getPathSegments().size() + 2 && (TextUtils.isEmpty(uri.getQuery()) || !ekpg.c(queryParameterNames, this.m.a()).isEmpty())) {
                            if (((apsk) this.q.b()).a()) {
                                uri2 = uri;
                                processMessageUpdateAsyncActionD = ((axxv) this.k).e(ezolVar, str, uri2, ((cogw) fcsuVar.b()).a());
                            } else {
                                uri2 = uri;
                                processMessageUpdateAsyncActionD = ((axxv) this.k).d(ezolVar, str, uri2);
                            }
                            if (!((aprz) this.r.b()).a() || ejwk.c(uri2.getLastPathSegment())) {
                                processMessageUpdateAsyncActionD.z();
                            } else if (!((auxl) this.s.b()).b(uri2.getLastPathSegment(), new Runnable() { // from class: bvew
                                @Override // java.lang.Runnable
                                public final void run() {
                                    processMessageUpdateAsyncActionD.z();
                                }
                            })) {
                                ((eksl) ((eksl) f.g()).h("com/google/android/apps/messaging/shared/datamodel/ditto/DittoContentObserver", "processMessageUpdate", 227, "DittoContentObserver.java")).t("Message [%s] is debounced as there is a recent update", uri2.getLastPathSegment());
                            }
                        }
                    }
                } else if (iMatch == 20) {
                    this.j.a(this.b, this.c, uri);
                } else if (iMatch == 40) {
                    if (uri.getPathSegments().size() == bace.j(this.h).getPathSegments().size() + 1) {
                        final String lastPathSegment = uri.getLastPathSegment();
                        eijuVarE = eijx.f(new Runnable() { // from class: bvev
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2 = lastPathSegment;
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                ((bvit) this.a.d.b()).o(bvfe.a(str2), bvis.SESSION_TERMINATED);
                            }
                        }, this.o);
                    } else {
                        eijuVarE = eijx.e(null);
                    }
                    auvh.h(eijuVarE);
                }
                eieuVarK.close();
                eiehVarC.close();
            } finally {
            }
        } finally {
        }
    }
}
