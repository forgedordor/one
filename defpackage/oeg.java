package defpackage;

import android.content.Context;
import android.media.metrics.EditingEndedEvent;
import android.media.metrics.EditingSession;
import android.os.Build;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeg {
    public static final long a;
    public final long b;
    public final mfc c;
    public final oaf d;
    public final oee e;
    public final ocq f;
    public oer g;
    public oay h;
    public String i;
    public int j;
    public obz k;
    public ofc l;
    private final Context m;
    private final odx n;
    private final ekgb o;
    private final boolean p;
    private final mcy q;
    private final oav r;
    private final Looper s;
    private final maj t;
    private final mej u;
    private final mew v;
    private final oba w;
    private final obx x;

    static {
        mbp.b("media3.transformer");
        a = true != mgb.ab() ? 10000L : 25000L;
    }

    public oeg(Context context, odx odxVar, ekgb ekgbVar, boolean z, long j, mfc mfcVar, oba obaVar, mcy mcyVar, oav oavVar, oaf oafVar, Looper looper, maj majVar, mej mejVar, obx obxVar) {
        mee.d(true, "Audio and video cannot both be removed.");
        this.m = context;
        this.n = odxVar;
        this.o = ekgbVar;
        this.p = z;
        this.b = j;
        this.c = mfcVar;
        this.w = obaVar;
        this.q = mcyVar;
        this.r = oavVar;
        this.d = oafVar;
        this.s = looper;
        this.t = majVar;
        this.u = mejVar;
        this.x = obxVar;
        this.j = 0;
        this.v = mejVar.b(looper, null);
        this.e = new oee(this);
        this.f = new ocq();
    }

    public final int a(odj odjVar) {
        int i;
        d();
        if (f()) {
            return 3;
        }
        if (g()) {
            return 1;
        }
        oer oerVar = this.g;
        if (oerVar == null) {
            return 0;
        }
        synchronized (oerVar.n) {
            i = oerVar.v;
            if (i == 2) {
                odjVar.a = oerVar.w;
                i = 2;
            }
        }
        return i;
    }

    public final void b() {
        ofc ofcVar = this.l;
        if (ofcVar != null) {
            ofcVar.a();
            ofcVar.a.shutdownNow();
            this.l = null;
        }
    }

    public final void c() throws Exception {
        b();
        final ocs ocsVarA = this.f.a();
        mez mezVar = new mez() { // from class: oea
            @Override // defpackage.mez
            public final void a(Object obj) {
                oay oayVar = this.a.h;
                mee.f(oayVar);
                ((oef) obj).a(oayVar, ocsVarA);
            }
        };
        mfc mfcVar = this.c;
        mfcVar.d(-1, mezVar);
        mfcVar.c();
        if (e()) {
            obz obzVar = this.k;
            mee.f(obzVar);
            EditingEndedEvent.Builder finalProgressPercent = obzVar.a(1).setFinalProgressPercent(100.0f);
            List listC = obz.c(ocsVarA.q);
            for (int i = 0; i < listC.size(); i++) {
                finalProgressPercent.addInputMediaItemInfo(ait$$ExternalSyntheticApiModelOutline0.m129m(listC.get(i)));
            }
            finalProgressPercent.setOutputMediaItemInfo(obz.b(ocsVarA));
            oby obyVar = obzVar.b;
            obyVar.a(finalProgressPercent.build());
            try {
                obyVar.close();
            } catch (Exception e) {
                mff.d("EditingMetricsCollector", "error while closing the metrics reporter", e);
            }
        }
        this.j = 0;
    }

    public final void d() {
        if (Looper.myLooper() != this.s) {
            throw new IllegalStateException("Transformer is accessed on the wrong thread.");
        }
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 35 && this.p;
    }

    public final boolean f() {
        int i = this.j;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean g() {
        int i = this.j;
        return i == 5 || i == 6;
    }

    public final void i(oay oayVar, odh odhVar, oee oeeVar) {
        mee.d(this.g == null, "There is already an export in progress.");
        int i = oayVar.d;
        odx odxVarA = this.n;
        if (i != 0) {
            odw odwVar = new odw(odxVarA);
            odwVar.b = i;
            odxVarA = odwVar.a();
        }
        odx odxVar = odxVarA;
        if (e()) {
            obx obxVar = this.x;
            String str = obs.a;
            mee.f(obxVar);
            oby obyVar = new oby(obxVar.a);
            EditingSession editingSession = obyVar.a;
            sessionId = editingSession != null ? editingSession.getSessionId() : null;
            this.k = new obz(obyVar, str);
        }
        mfc mfcVar = this.c;
        mew mewVar = this.v;
        ocv ocvVar = new ocv(mfcVar, mewVar, odxVar);
        Context context = this.m;
        obg obgVar = new obg(new obf(context));
        mej mejVar = this.u;
        oaz oazVar = new oaz(context, obgVar, mejVar, sessionId);
        mjr.b();
        oer oerVar = new oer(context, oayVar, odxVar, oazVar, this.w, this.q, this.r, this.o, odhVar, oeeVar, ocvVar, mewVar, this.t, mejVar, sessionId);
        this.g = oerVar;
        oerVar.c();
        oerVar.f.j(1);
        synchronized (oerVar.n) {
            oerVar.v = 1;
            oerVar.w = 0;
        }
        String str2 = mgb.a;
    }
}
