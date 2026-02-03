package defpackage;

import android.content.Context;
import android.content.UriMatcher;
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
public final class bvgs extends egxm {
    public static final cczv a = cdag.j(cdag.b, "ditto_desktop_check_cache_expiry_ms", 5000);
    private static final eksp f = eksp.c("BugleDitto");
    private static final UriMatcher g = new UriMatcher(-1);
    public ezol b;
    public String c;
    public final eygg d;
    public final fcsu e;
    private final Context h;
    private final aypr i;
    private final aypu j;
    private final ayov k;
    private final bvgm l;
    private final fcsu m;
    private final eosc n;
    private final AtomicLong o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public bvgs(Context context, eigp eigpVar, eygg eyggVar, aypr ayprVar, aypu aypuVar, ayov ayovVar, bvgm bvgmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, eosc eoscVar) {
        super(eigpVar, "NewDittoContentObserver", eoscVar);
        this.o = new AtomicLong(0L);
        this.h = context;
        this.d = eyggVar;
        this.i = ayprVar;
        this.j = aypuVar;
        this.k = ayovVar;
        this.l = bvgmVar;
        this.e = fcsuVar;
        this.m = fcsuVar2;
        this.n = eoscVar;
        this.p = fcsuVar3;
        this.q = fcsuVar4;
        this.r = fcsuVar5;
        UriMatcher uriMatcher = g;
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.g(context).getPath()).concat("/*/*"), 10);
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.i(context).getPath()).concat("/*"), 20);
        uriMatcher.addURI(axgg.a(context), String.valueOf(bace.j(context).getPath()).concat("/*"), 40);
    }

    @Override // defpackage.egxm
    public final synchronized void a(Uri uri) {
        Uri uri2;
        final ProcessMessageUpdateAsyncAction processMessageUpdateAsyncActionD;
        eiju eijuVarE;
        uri.getClass();
        eieu eieuVarK = eiiy.k("NewDittoContentObserver.handleChange");
        try {
            int iMatch = g.match(uri);
            if (iMatch == 10) {
                fcsu fcsuVar = this.m;
                final long epochMilli = ((cogw) fcsuVar.b()).f().toEpochMilli();
                final long jIntValue = epochMilli - ((Integer) a.e()).intValue();
                if (DesugarAtomicLong.updateAndGet(this.o, new LongUnaryOperator() { // from class: bvgo
                    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
                    }

                    @Override // java.util.function.LongUnaryOperator
                    public final long applyAsLong(long j) {
                        cczv cczvVar = bvgs.a;
                        return j <= jIntValue ? epochMilli : j;
                    }

                    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
                    }
                }) == epochMilli) {
                    this.k.a(this.b, this.c).z();
                }
                ezol ezolVar = this.b;
                String str = this.c;
                if (ezolVar != null && str != null) {
                    List<String> pathSegments = uri.getPathSegments();
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    if (pathSegments.size() == bace.g(this.h).getPathSegments().size() + 2 && (TextUtils.isEmpty(uri.getQuery()) || !ekpg.c(queryParameterNames, this.l.a()).isEmpty())) {
                        if (((apsk) this.p.b()).a()) {
                            uri2 = uri;
                            processMessageUpdateAsyncActionD = ((axxv) this.j).e(ezolVar, str, uri2, ((cogw) fcsuVar.b()).a());
                        } else {
                            uri2 = uri;
                            processMessageUpdateAsyncActionD = ((axxv) this.j).d(ezolVar, str, uri2);
                        }
                        if (!((aprz) this.q.b()).a() || ejwk.c(uri2.getLastPathSegment())) {
                            processMessageUpdateAsyncActionD.z();
                        } else if (!((auxl) this.r.b()).b(uri2.getLastPathSegment(), new Runnable() { // from class: bvgp
                            @Override // java.lang.Runnable
                            public final void run() {
                                processMessageUpdateAsyncActionD.z();
                            }
                        })) {
                            ((eksl) ((eksl) f.g()).h("com/google/android/apps/messaging/shared/datamodel/ditto/NewDittoContentObserver", "processMessageUpdate", 221, "NewDittoContentObserver.java")).t("Message [%s] is debounced as there is a recent update", uri2.getLastPathSegment());
                        }
                    }
                }
            } else if (iMatch == 20) {
                this.i.a(this.b, this.c, uri);
            } else if (iMatch == 40) {
                if (uri.getPathSegments().size() == bace.j(this.h).getPathSegments().size() + 1) {
                    final String lastPathSegment = uri.getLastPathSegment();
                    eijuVarE = eijx.f(new Runnable() { // from class: bvgn
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = lastPathSegment;
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            ((bvit) this.a.d.b()).o(bvfe.a(str2), bvis.SESSION_TERMINATED);
                        }
                    }, this.n);
                } else {
                    eijuVarE = eijx.e(null);
                }
                auvh.h(eijuVarE);
            }
            eieuVarK.close();
        } finally {
        }
    }

    final synchronized void b(ezol ezolVar, String str) {
        this.b = ezolVar;
        this.c = str;
    }
}
