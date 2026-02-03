package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asf implements aqm {
    public static final List a = new ArrayList();
    private static int l = 0;
    public final bmm b;
    final Executor c;
    public final aql d;
    public bml f;
    public app g;
    public bml h;
    public int j;
    public int k;
    private final ScheduledExecutorService m;
    public List e = new ArrayList();
    public volatile List i = null;
    private ayh n = new ayg().b();
    private ayh o = new ayg().b();

    public asf(bmm bmmVar, awa awaVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.j = 0;
        this.d = new aql(awaVar, awv.a(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.b = bmmVar;
        this.c = executor;
        this.m = scheduledExecutorService;
        this.k = 1;
        int i = l;
        l = i + 1;
        this.j = i;
        bbs.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.j + ")");
    }

    public static boolean c(bjz bjzVar) {
        return Objects.equals(bjzVar.n, bch.class);
    }

    public static boolean g(bjz bjzVar) {
        return Objects.equals(bjzVar.n, bvk.class);
    }

    private static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bjl bjlVar = (bjl) it.next();
            Iterator it2 = bjlVar.h.iterator();
            while (it2.hasNext()) {
                ((bhr) it2.next()).a(bjlVar.a());
            }
        }
    }

    private final void m(ayh ayhVar, ayh ayhVar2) {
        ald aldVar = new ald();
        aldVar.b(ayhVar);
        aldVar.b(ayhVar2);
        aldVar.a();
        this.b.j();
    }

    @Override // defpackage.aqm
    public final bml a() {
        return this.f;
    }

    @Override // defpackage.aqm
    public final ListenableFuture b(final bml bmlVar, final CameraDevice cameraDevice, final ask askVar) {
        int i = this.k;
        int i2 = this.k;
        java.util.Objects.toString(ase.a(i2));
        lcg.b(i == 1, "Invalid state state:".concat(ase.a(i2)));
        lcg.b(!bmlVar.f().isEmpty(), "SessionConfig contains no surfaces");
        bbs.a("ProcessingCaptureSession", amf.b(this, "open (id="));
        List listF = bmlVar.f();
        this.e = listF;
        ScheduledExecutorService scheduledExecutorService = this.m;
        Executor executor = this.c;
        return bqk.f(bqk.g(bpw.a(bkd.c(listF, executor, scheduledExecutorService)), new bpr() { // from class: arz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.bpr
            public final ListenableFuture a(Object obj) {
                bhi bhiVar;
                final asf asfVar = this.a;
                List list = (List) obj;
                bbs.a("ProcessingCaptureSession", amf.b(asfVar, "-- getSurfaces done, start init (id="));
                if (asfVar.k == 5) {
                    return new bql(new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                bml bmlVar2 = bmlVar;
                final bjz bjzVar = null;
                if (list.contains(null)) {
                    return new bql(new bjx("Surface closed", (bjz) bmlVar2.f().get(list.indexOf(null))));
                }
                bhi bhiVar2 = null;
                bhi bhiVar3 = null;
                bhi bhiVar4 = null;
                for (int i3 = 0; i3 < bmlVar2.f().size(); i3++) {
                    bjz bjzVar2 = (bjz) bmlVar2.f().get(i3);
                    if (asf.c(bjzVar2) || asf.g(bjzVar2)) {
                        bhiVar2 = new bhi((Surface) bjzVar2.b().get(), bjzVar2.l, bjzVar2.m);
                    } else if (Objects.equals(bjzVar2.n, bbf.class)) {
                        bhiVar3 = new bhi((Surface) bjzVar2.b().get(), bjzVar2.l, bjzVar2.m);
                    } else if (Objects.equals(bjzVar2.n, baj.class)) {
                        bhiVar4 = new bhi((Surface) bjzVar2.b().get(), bjzVar2.l, bjzVar2.m);
                    }
                }
                bmi bmiVar = bmlVar2.b;
                if (bmiVar != null) {
                    bjzVar = ((bhl) bmiVar).a;
                    bhiVar = new bhi((Surface) bjzVar.b().get(), bjzVar.l, bjzVar.m);
                } else {
                    bhiVar = null;
                }
                asfVar.k = 2;
                try {
                    ArrayList arrayList = new ArrayList(asfVar.e);
                    if (bjzVar != null) {
                        arrayList.add(bjzVar);
                    }
                    bkd.b(arrayList);
                    bbs.f("ProcessingCaptureSession", amf.b(asfVar, "== initSession (id="));
                    try {
                        bmm bmmVar = asfVar.b;
                        new bhj(bhiVar2, bhiVar3, bhiVar4, bhiVar);
                        asfVar.h = bmmVar.h();
                        ((bjz) asfVar.h.f().get(0)).c().b(new Runnable() { // from class: asb
                            @Override // java.lang.Runnable
                            public final void run() {
                                bkd.a(asfVar.e);
                                bjz bjzVar3 = bjzVar;
                                if (bjzVar3 != null) {
                                    bjzVar3.e();
                                }
                            }
                        }, bpc.a());
                        for (final bjz bjzVar3 : asfVar.h.f()) {
                            asf.a.add(bjzVar3);
                            bjzVar3.c().b(new Runnable() { // from class: asc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    asf.a.remove(bjzVar3);
                                }
                            }, asfVar.c);
                        }
                        ask askVar2 = askVar;
                        CameraDevice cameraDevice2 = cameraDevice;
                        bmk bmkVar = new bmk();
                        bmkVar.b(bmlVar2);
                        bmkVar.a.clear();
                        bmkVar.b.i();
                        bmkVar.b(asfVar.h);
                        lcg.b(bmkVar.c(), "Cannot transform the SessionConfig");
                        ListenableFuture listenableFutureB = asfVar.d.b(bmkVar.a(), cameraDevice2, askVar2);
                        bqk.i(listenableFutureB, new asd(asfVar), asfVar.c);
                        return listenableFutureB;
                    } catch (Throwable th) {
                        bbs.d("ProcessingCaptureSession", "initSession failed", th);
                        bkd.a(asfVar.e);
                        if (bjzVar != null) {
                            bjzVar.e();
                        }
                        throw th;
                    }
                } catch (bjx e) {
                    return new bql(e);
                }
            }
        }, executor), new akv() { // from class: asa
            @Override // defpackage.akv
            public final Object a(Object obj) {
                asf asfVar = this.a;
                if (asfVar.k == 2) {
                    List<bjz> listF2 = asfVar.h.f();
                    ArrayList arrayList = new ArrayList();
                    for (bjz bjzVar : listF2) {
                        lcg.b(bjzVar instanceof bmn, "Surface must be SessionProcessorSurface");
                        arrayList.add((bmn) bjzVar);
                    }
                    asfVar.g = new app(asfVar.d, arrayList);
                    bbs.a("ProcessingCaptureSession", amf.b(asfVar, "== onCaptureSessinStarted (id = "));
                    asfVar.b.i();
                    asfVar.k = 3;
                    bml bmlVar2 = asfVar.f;
                    if (bmlVar2 != null) {
                        asfVar.j(bmlVar2);
                    }
                    if (asfVar.i != null) {
                        asfVar.h(asfVar.i);
                        asfVar.i = null;
                    }
                }
                return null;
            }
        }, executor);
    }

    @Override // defpackage.aqm
    public final List d() {
        return this.i != null ? this.i : Collections.EMPTY_LIST;
    }

    @Override // defpackage.aqm
    public final void e() {
        bbs.a("ProcessingCaptureSession", amf.b(this, "cancelIssuedCaptureRequests (id="));
        if (this.i != null) {
            for (bjl bjlVar : this.i) {
                Iterator it = bjlVar.h.iterator();
                while (it.hasNext()) {
                    ((bhr) it.next()).a(bjlVar.a());
                }
            }
            this.i = null;
        }
    }

    @Override // defpackage.aqm
    public final void f() {
        bbs.a("ProcessingCaptureSession", "close (id=" + this.j + ") state=" + ((Object) ase.a(this.k)));
        if (this.k == 3) {
            bbs.a("ProcessingCaptureSession", amf.b(this, "== onCaptureSessionEnd (id = "));
            this.b.d();
            app appVar = this.g;
            if (appVar != null) {
                synchronized (appVar.a) {
                    appVar.b = true;
                    appVar.c = null;
                }
            }
            this.k = 4;
        }
        this.d.f();
    }

    @Override // defpackage.aqm
    public final void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        bbs.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.j + ") + state =" + ((Object) ase.a(this.k)));
        int i = this.k;
        int i2 = i + (-1);
        if (i == 0) {
            throw null;
        }
        if (i2 == 0 || i2 == 1) {
            if (this.i == null) {
                this.i = list;
                return;
            } else {
                i(list);
                bbs.a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                int i3 = this.k;
                java.util.Objects.toString(ase.a(i3));
                bbs.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = ".concat(ase.a(i3)));
                i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bjl bjlVar = (bjl) it.next();
            int i4 = bjlVar.f;
            if (i4 == 2 || i4 == 4) {
                bjq bjqVar = bjlVar.e;
                ayg aygVarA = ayg.a(bjqVar);
                bjo bjoVar = bjl.a;
                if (bjqVar.t(bjoVar)) {
                    aygVarA.c(CaptureRequest.JPEG_ORIENTATION, (Integer) bjqVar.m(bjoVar));
                }
                bjo bjoVar2 = bjl.b;
                if (bjqVar.t(bjoVar2)) {
                    aygVarA.c(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) bjqVar.m(bjoVar2)).byteValue()));
                }
                ayh ayhVarB = aygVarA.b();
                this.o = ayhVarB;
                m(this.n, ayhVarB);
                bmm bmmVar = this.b;
                boolean z = bjlVar.g;
                bmx bmxVar = bjlVar.j;
                bjlVar.a();
                List list2 = bjlVar.h;
                bmmVar.k();
            } else {
                bbs.a("ProcessingCaptureSession", "issueTriggerRequest");
                Iterator it2 = blz.f(ayg.a(bjlVar.e).b()).iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key = (CaptureRequest.Key) ((bjo) it2.next()).b();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        bmm bmmVar2 = this.b;
                        bmx bmxVar2 = bjlVar.j;
                        bjlVar.a();
                        List list3 = bjlVar.h;
                        bmmVar2.m();
                        break;
                    }
                }
                i(Arrays.asList(bjlVar));
            }
        }
    }

    @Override // defpackage.aqm
    public final void j(bml bmlVar) {
        bbs.a("ProcessingCaptureSession", amf.b(this, "setSessionConfig (id="));
        this.f = bmlVar;
        if (bmlVar == null) {
            return;
        }
        app appVar = this.g;
        if (appVar != null) {
            synchronized (appVar.a) {
                appVar.c = bmlVar;
            }
        }
        if (this.k == 3) {
            ayg aygVarA = ayg.a(bmlVar.c());
            bjl bjlVar = bmlVar.g;
            Integer numB = apk.b(bjlVar);
            if (numB != null) {
                aygVarA.c(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numB);
            }
            ayh ayhVarB = aygVarA.b();
            this.n = ayhVarB;
            m(ayhVarB, this.o);
            for (bjz bjzVar : bjlVar.e()) {
                if (c(bjzVar) || g(bjzVar)) {
                    this.b.l();
                    return;
                }
            }
            this.b.e();
        }
    }

    @Override // defpackage.aqm
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.aqm
    public final ListenableFuture p() {
        bbs.a("ProcessingCaptureSession", "release (id=" + this.j + ") mProcessorState=" + ((Object) ase.a(this.k)));
        ListenableFuture listenableFutureP = this.d.p();
        int i = this.k;
        int i2 = i + (-1);
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 3) {
            listenableFutureP.b(new Runnable() { // from class: ary
                @Override // java.lang.Runnable
                public final void run() {
                    asf asfVar = this.a;
                    bbs.a("ProcessingCaptureSession", amf.b(asfVar, "== deInitSession (id="));
                    asfVar.b.c();
                }
            }, bpc.a());
        }
        this.k = 5;
        return listenableFutureP;
    }

    @Override // defpackage.aqm
    public final void k(Map map) {
    }
}
