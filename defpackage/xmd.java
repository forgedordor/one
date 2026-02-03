package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmd implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener, aalp, dqdj {
    public static final /* synthetic */ int l = 0;
    private static final ekrg m = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController");
    public final fdjx a;
    public final Context b;
    public final egqi c;
    public final dakl d;
    public final aoov e;
    public final fcsu f;
    public final fcsu g;
    public final Optional h;
    public final cult i;
    public final fdvc j;
    public int k;
    private final aomc n;
    private final fdjx o;
    private final aomd p;
    private final fduj q;
    private final fcsu r;
    private final airc s;
    private final airh t;
    private final fduf u;
    private final fduf v;
    private final fduf w;
    private final fctc x;
    private final fctc y;

    public xmd(aomc aomcVar, fdjx fdjxVar, fdjx fdjxVar2, Context context, egqi egqiVar, aomd aomdVar, dakl daklVar, fduj fdujVar, fcsu fcsuVar, aoov aoovVar, fcsu fcsuVar2, fcsu fcsuVar3, airc aircVar, airh airhVar, Optional optional, cult cultVar) {
        aomcVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        context.getClass();
        egqiVar.getClass();
        aomdVar.getClass();
        daklVar.getClass();
        fdujVar.getClass();
        fcsuVar2.getClass();
        aircVar.getClass();
        airhVar.getClass();
        cultVar.getClass();
        this.n = aomcVar;
        this.o = fdjxVar;
        this.a = fdjxVar2;
        this.b = context;
        this.c = egqiVar;
        this.p = aomdVar;
        this.d = daklVar;
        this.q = fdujVar;
        this.r = fcsuVar;
        this.e = aoovVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.s = aircVar;
        this.t = airhVar;
        this.h = optional;
        this.i = cultVar;
        this.u = fdvf.a(dqgn.b);
        this.v = fdvf.a(null);
        this.w = fdvf.a(null);
        this.k = 1;
        this.x = fctd.a(new fdae() { // from class: xlr
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((dqex) this.a.g.b()).b;
            }
        });
        this.j = fdtg.b(new xmc(new xlz(fdujVar)), fdjxVar2, fdur.a, false);
        this.y = fctd.a(new fdae() { // from class: xls
            @Override // defpackage.fdae
            public final Object invoke() {
                xmd xmdVar = this.a;
                dqgm dqgmVar = ((dqex) xmdVar.g.b()).d;
                xlu xluVar = new xlu(dqgmVar, xmdVar);
                evtg evtgVar = ((aonn) aonl.h.e()).b;
                evtgVar.getClass();
                return new dqgm(dqgmVar.a, dqgmVar.b, xluVar, dqgmVar.d, dqgmVar.e, dqgmVar.f, dqgmVar.g, new dqga(xmdVar.j, evtgVar, true, xmdVar.i.a), dqgmVar.m, xmdVar.e.a() ? xmdVar.h : Optional.empty(), ((apuf) xmdVar.f.b()).a(), true);
            }
        });
    }

    private final enle i() {
        final fdap fdapVar = new fdap() { // from class: xlp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                int i = xmd.l;
                return ((Boolean) ((dlzf) obj).b.c()).booleanValue() ? enle.NOISE_CANCELLATION_STATE_ENABLED : enle.NOISE_CANCELLATION_STATE_DISABLED;
            }
        };
        return (enle) this.h.map(new Function() { // from class: xlq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = xmd.l;
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(enle.NOISE_CANCELLATION_STATE_UNKNOWN);
    }

    private final Duration j() {
        return a().b();
    }

    private final void k() {
        this.p.a();
        aomc aomcVar = this.n;
        if (aomcVar.e()) {
            f(j());
            List listD = aomcVar.c.a.d();
            ArrayList arrayList = new ArrayList(fcva.p(listD, 10));
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((dqcd) it.next()).a));
            }
            Uri uriB = aomcVar.b();
            if (uriB != null) {
                fduf fdufVar = this.w;
                dogg doggVar = ((Boolean) aonl.a.e()).booleanValue() ? doft.a : dofr.a;
                String string = uriB.toString();
                string.getClass();
                Instant instantNow = Instant.now();
                instantNow.getClass();
                fdufVar.f(new dojp(doggVar, string, null, null, 0L, instantNow, dqcb.a, j(), null, 268));
                this.u.f(dqgo.c);
            }
        }
    }

    public final dqee a() {
        return (dqee) this.x.a();
    }

    public final dqgm b() {
        return (dqgm) this.y.a();
    }

    public final void c() {
        if (h()) {
            ((vwg) this.r.b()).c(null);
        }
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        auvw.k(this.o, null, null, new xlt(this, null), 3);
    }

    @Override // defpackage.dqdj
    public final void d(Duration duration) {
        this.s.b(duration.toSeconds(), this.k, i());
    }

    @Override // defpackage.dqdj
    public final void e(Exception exc) {
        exc.getClass();
        this.t.b(this.k);
    }

    @Override // defpackage.dqdj
    public final void f(Duration duration) {
        this.s.c(duration.toSeconds(), this.k, i());
    }

    public final void g() {
        ((vwg) this.r.b()).c(vwa.a);
    }

    public final boolean h() {
        dpzj dpzjVarA = ((vwg) this.r.b()).a();
        dpzf dpzfVar = dpzjVarA instanceof dpzf ? (dpzf) dpzjVarA : null;
        return (dpzfVar != null ? dpzfVar.a.a : null) == dpxe.g;
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        ekrw ekrwVarI = m.i();
        ekrwVarI.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onError", 183, "VoiceRecordingController.kt")).u("Error occurred during audio recording what=%s, extra=%s", i, i2);
        e(new Exception(a.s(i2, i, "MediaRecorder error what=", ", extra=")));
        this.p.a();
        aomc aomcVar = this.n;
        if (aomcVar.e()) {
            d(j());
            Uri uriB = aomcVar.b();
            if (uriB != null) {
                auvw.k(this.o, null, null, new xlv(this, uriB, null), 3);
            }
        }
        this.u.f(dqgn.b);
        fduf fdufVar = this.v;
        fdufVar.f(null);
        this.w.f(null);
        fdufVar.f(Integer.valueOf(R.string.audio_recording_error));
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.getClass();
        if (i == 800) {
            ekrw ekrwVarH = m.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 192, "VoiceRecordingController.kt")).q("Max duration reached while recording audio");
            this.d.i(R.string.audio_recorder_time_limit_reached_text);
            k();
            return;
        }
        if (i != 801) {
            return;
        }
        ekrw ekrwVarH2 = m.h();
        ekrwVarH2.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceRecordingController", "onInfo", 197, "VoiceRecordingController.kt")).q("Max size reached while recording audio");
        k();
    }
}
