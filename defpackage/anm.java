package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anm implements biu {
    public volatile int A = 3;
    private final blg B;
    private final apz C;
    private int D;
    private final boolean E;
    private final boolean F;
    private boolean G;
    private final Set H;
    private big I;
    private bmm J;
    private final aqs K;
    private final auy L;
    private final asj M;
    public final bne a;
    public final avp b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final amb e;
    public final ank f;
    final ann g;
    CameraDevice h;
    int i;
    aqm j;
    final AtomicInteger k;
    ListenableFuture l;
    kog m;
    final Map n;
    final ana o;
    final bdx p;
    final bje q;
    public boolean r;
    public boolean s;
    public arx t;
    public final aqq u;
    public final asl v;
    final Object w;
    boolean x;
    public final awa y;
    public final anf z;

    public anm(Context context, avp avpVar, String str, ann annVar, bdx bdxVar, bje bjeVar, Executor executor, Handler handler, aqs aqsVar, long j) throws Throwable {
        blg blgVar = new blg();
        this.B = blgVar;
        this.i = 0;
        this.k = new AtomicInteger(0);
        this.n = new LinkedHashMap();
        this.D = 0;
        this.r = false;
        this.s = false;
        this.G = true;
        this.H = new HashSet();
        this.I = bij.a;
        this.w = new Object();
        this.x = false;
        this.z = new anf(this);
        this.b = avpVar;
        this.p = bdxVar;
        this.q = bjeVar;
        bpi bpiVar = new bpi(handler);
        this.d = bpiVar;
        bpq bpqVar = new bpq(executor);
        this.c = bpqVar;
        this.f = new ank(this, bpqVar, bpiVar, j);
        this.a = new bne(str);
        blgVar.a(bit.CLOSED);
        this.C = new apz(bjeVar);
        this.u = new aqq(bpqVar);
        this.K = aqsVar;
        try {
            auy auyVarA = avpVar.a(str);
            this.L = auyVarA;
            amb ambVar = new amb(auyVarA, bpiVar, bpqVar, new anb(this), annVar.j);
            this.e = ambVar;
            this.g = annVar;
            synchronized (annVar.d) {
                try {
                    annVar.e = ambVar;
                    bou bouVar = annVar.g;
                    if (bouVar != null) {
                        bouVar.b(annVar.e.e.d);
                    }
                    bou bouVar2 = annVar.f;
                    if (bouVar2 != null) {
                        bouVar2.b(annVar.e.f.b);
                    }
                    List<Pair> list = annVar.i;
                    if (list != null) {
                        for (Pair pair : list) {
                            annVar.e.p((Executor) pair.second, (bhr) pair.first);
                        }
                        annVar.i = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            try {
                                throw th;
                            } catch (aub e) {
                                e = e;
                                throw new azj(e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            int iD = annVar.d();
            bbs.e("Camera2CameraInfo", "Device Level: ".concat(iD != 0 ? iD != 1 ? iD != 2 ? iD != 3 ? iD != 4 ? a.g(iD, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
            this.g.h.b(this.C.b);
            this.y = awa.b(this.L);
            this.j = a();
            this.v = new asl(this.c, this.d, handler, this.u, annVar.j, awv.a);
            bly blyVar = annVar.j;
            this.E = blyVar.d(LegacyCameraOutputConfigNullPointerQuirk.class) || blyVar.d(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.F = annVar.j.d(LegacyCameraSurfaceCleanupQuirk.class);
            ana anaVar = new ana(this, str);
            this.o = anaVar;
            bje bjeVar2 = this.q;
            Executor executor2 = this.c;
            synchronized (bjeVar2.a) {
                lcg.d(!bjeVar2.c.containsKey(this), a.l(this, "Camera is already registered: "));
                bjeVar2.c.put(this, new bjd(executor2, anaVar));
            }
            this.b.a.d(this.c, anaVar);
            this.M = new asj(context, str, avpVar, new amv());
        } catch (aub e2) {
            e = e2;
        }
    }

    private final Collection Q(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bdr bdrVar = (bdr) it.next();
            arrayList.add(new alg(l(bdrVar), bdrVar.getClass(), this.G ? bdrVar.q : bdrVar.r, bdrVar.l, bdrVar.D(), bdrVar.m, m(bdrVar)));
        }
        return arrayList;
    }

    private final void R(boolean z) {
        if (!z) {
            this.f.a();
        }
        ank ankVar = this.f;
        ankVar.c();
        this.z.a();
        q("Opening camera.");
        K(9);
        try {
            avp avpVar = this.b;
            String str = this.g.a;
            Executor executor = this.c;
            ArrayList arrayList = new ArrayList(this.a.b().a().c);
            arrayList.add(this.u.f);
            arrayList.add(ankVar);
            avpVar.b(str, executor, apx.a(arrayList));
        } catch (aub e) {
            q("Unable to open camera due to ".concat(String.valueOf(e.getMessage())));
            if (e.b == 10001) {
                L(3, new ayp(7, e));
                return;
            }
            anf anfVar = this.z;
            anm anmVar = anfVar.b;
            if (anmVar.A != 9) {
                anmVar.q("Don't need the onError timeout handler.");
                return;
            }
            anmVar.q("Camera waiting for onError.");
            anfVar.a();
            anfVar.a = new ane(anfVar);
        } catch (SecurityException e2) {
            q("Unable to open camera due to ".concat(String.valueOf(e2.getMessage())));
            K(8);
            this.f.b();
        } catch (RuntimeException e3) {
            r("Unexpected error occurred when opening camera.", e3);
            L(5, new ayp(6, null));
        }
    }

    private final void S() {
        if (this.t != null) {
            bne bneVar = this.a;
            String str = "MeteringRepeating" + this.t.hashCode();
            Map map = bneVar.a;
            if (map.containsKey(str)) {
                bnd bndVar = (bnd) map.get(str);
                bndVar.e = false;
                if (!bndVar.f) {
                    map.remove(str);
                }
            }
            bneVar.h("MeteringRepeating" + this.t.hashCode());
            arx arxVar = this.t;
            bbs.a("MeteringRepeating", "MeteringRepeating clear!");
            bjz bjzVar = arxVar.a;
            if (bjzVar != null) {
                bjzVar.d();
            }
            arxVar.a = null;
            this.t = null;
        }
    }

    private final boolean T() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.w) {
            int i = ((axw) this.p).e;
        }
        bne bneVar = this.a;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : bneVar.a.entrySet()) {
            if (((bnd) entry.getValue()).e) {
                arrayList2.add((bnd) entry.getValue());
            }
        }
        for (bnd bndVar : DesugarCollections.unmodifiableCollection(arrayList2)) {
            List list = bndVar.d;
            if (list == null || list.get(0) != bnk.METERING_REPEATING) {
                bms bmsVar = bndVar.c;
                if (bmsVar == null || list == null) {
                    Objects.toString(bndVar);
                    bbs.f("Camera2CameraImpl", "Invalid stream spec or capture types in ".concat(String.valueOf(bndVar)));
                    return false;
                }
                bml bmlVar = bndVar.a;
                bni bniVar = bndVar.b;
                for (bjz bjzVar : bmlVar.f()) {
                    asj asjVar = this.M;
                    int iA = bniVar.a();
                    Size size = bjzVar.l;
                    bmv bmvVarE = asjVar.e(iA, size);
                    int iA2 = bniVar.a();
                    azv azvVarE = bmsVar.e();
                    bjq bjqVarF = bmsVar.f();
                    Range rangeE = bniVar.e(null);
                    Range rangeF = bniVar.f(bms.h);
                    lcg.i(rangeF);
                    arrayList.add(new bhb(bmvVarE, iA2, size, azvVarE, list, bjqVarF, rangeE, rangeF));
                }
            }
        }
        lcg.i(this.t);
        HashMap map = new HashMap();
        arx arxVar = this.t;
        map.put(arxVar.c, Collections.singletonList(arxVar.d));
        try {
            this.M.d(arrayList, map, false, false);
            q("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e) {
            r("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }

    static String j(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    static String k(arx arxVar) {
        return "MeteringRepeating" + arxVar.hashCode();
    }

    static String l(bdr bdrVar) {
        return bdrVar.I() + bdrVar.hashCode();
    }

    static List m(bdr bdrVar) {
        if (bdrVar.F() == null) {
            return null;
        }
        return bvk.b(bdrVar);
    }

    @Override // defpackage.biu
    public final void A(final boolean z) {
        this.c.execute(new Runnable() { // from class: amj
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar = this.a;
                boolean z2 = z;
                anmVar.x = z2;
                if (z2) {
                    if (anmVar.A == 4 || anmVar.A == 5) {
                        anmVar.C(false);
                    }
                }
            }
        });
    }

    @Override // defpackage.biu
    public final void B(big bigVar) {
        bmm bmmVarB = bigVar.b();
        this.I = bigVar;
        synchronized (this.w) {
            this.J = bmmVarB;
        }
    }

    final void C(boolean z) {
        q("Attempting to force open the camera.");
        if (this.q.e(this)) {
            R(z);
        } else {
            q("No cameras available. Waiting for available camera before opening camera.");
            K(4);
        }
    }

    public final void D(boolean z) {
        q("Attempting to open the camera.");
        if (this.o.a && this.q.e(this)) {
            R(z);
        } else {
            q("No cameras available. Waiting for available camera before opening camera.");
            K(4);
        }
    }

    final void E() {
        bmk bmkVarA = this.a.a();
        if (!bmkVarA.c()) {
            amb ambVar = this.e;
            ambVar.E(1);
            this.j.j(ambVar.g());
        } else {
            bml bmlVarA = bmkVarA.a();
            amb ambVar2 = this.e;
            ambVar2.E(bmlVarA.b());
            bmkVarA.b(ambVar2.g());
            this.j.j(bmkVarA.a());
        }
    }

    public final void F() {
        Long lB;
        if (ars.a(this.g.b)) {
            bmk bmkVarA = this.a.a();
            if (bmkVarA.c()) {
                bml bmlVarA = bmkVarA.a();
                if (((Integer) bmlVarA.g.d().getUpper()).intValue() > 30) {
                    this.e.B(true);
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    for (bmi bmiVar : bmlVarA.a) {
                        DynamicRangeProfiles dynamicRangeProfilesA = this.y.a();
                        if (dynamicRangeProfilesA != null && (lB = avy.b(bmiVar.b(), dynamicRangeProfilesA)) != null && lB.longValue() != 1) {
                            this.e.B(true);
                            return;
                        }
                    }
                    this.e.B(false);
                }
            }
        }
    }

    public final void G() {
        Iterator it = this.a.d().iterator();
        boolean zA = false;
        while (it.hasNext()) {
            zA |= ((bni) it.next()).A();
        }
        this.e.F(zA);
    }

    @Override // defpackage.biu
    public final /* synthetic */ boolean H() {
        return true;
    }

    @Override // defpackage.biu
    public final /* synthetic */ boolean I() {
        return bis.b(this);
    }

    final boolean J() {
        return this.n.isEmpty();
    }

    final void K(int i) {
        L(i, null);
    }

    final void L(int i, azh azhVar) {
        M(i, azhVar, true);
    }

    final void M(int i, azh azhVar, boolean z) {
        bit bitVar;
        bit bitVar2;
        HashMap map;
        ayo ayoVar;
        q("Transitioning camera internal state: " + ((Object) ang.a(this.A)) + " --> " + ((Object) ang.a(i)));
        int i2 = i + (-1);
        if (plm.c()) {
            plm.b(a.h(this, "CX:C2State[", "]"), i2);
            if (azhVar != null) {
                this.D++;
            }
            if (this.D > 0) {
                plm.b(a.h(this, "CX:C2StateErrorCode[", "]"), azhVar != null ? ((ayp) azhVar).a : 0);
            }
        }
        this.A = i;
        switch (i2) {
            case 0:
                bitVar = bit.RELEASED;
                break;
            case 1:
                bitVar = bit.RELEASING;
                break;
            case 2:
                bitVar = bit.CLOSED;
                break;
            case 3:
                bitVar = bit.PENDING_OPEN;
                break;
            case 4:
            case 5:
            case 6:
                bitVar = bit.CLOSING;
                break;
            case 7:
            case 8:
                bitVar = bit.OPENING;
                break;
            default:
                bitVar = bit.OPEN;
                break;
        }
        bit bitVar3 = bitVar;
        bje bjeVar = this.q;
        synchronized (bjeVar.a) {
            int i3 = bjeVar.d;
            if (bitVar3 == bit.RELEASED) {
                bjd bjdVar = (bjd) bjeVar.c.remove(this);
                if (bjdVar != null) {
                    bjeVar.b();
                    bitVar2 = bjdVar.a;
                } else {
                    bitVar2 = null;
                }
            } else {
                bjd bjdVar2 = (bjd) bjeVar.c.get(this);
                lcg.j(bjdVar2, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                bit bitVarA = bjdVar2.a(bitVar3);
                bit bitVar4 = bit.OPENING;
                if (bitVar3 == bitVar4) {
                    lcg.d(bje.d(bitVar3) || bitVarA == bitVar4, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                }
                if (bitVarA != bitVar3) {
                    bje.c(this, bitVar3);
                    bjeVar.b();
                }
                bitVar2 = bitVarA;
            }
            if (bitVar2 != bitVar3) {
                bdx bdxVar = bjeVar.b;
                if (i3 <= 0 && bjeVar.d > 0) {
                    map = new HashMap();
                    for (Map.Entry entry : bjeVar.c.entrySet()) {
                        if (((bjd) entry.getValue()).a == bit.PENDING_OPEN) {
                            map.put((ayv) entry.getKey(), (bjd) entry.getValue());
                        }
                    }
                } else if (bitVar3 != bit.PENDING_OPEN || bjeVar.d <= 0) {
                    map = null;
                } else {
                    map = new HashMap();
                    map.put(this, (bjd) bjeVar.c.get(this));
                }
                if (map != null && !z) {
                    map.remove(this);
                }
                if (map != null) {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        ((bjd) it.next()).b();
                    }
                }
            }
        }
        this.B.a(bitVar3);
        apz apzVar = this.C;
        switch (bitVar3.ordinal()) {
            case 0:
            case 2:
                ayoVar = new ayo(5, azhVar);
                break;
            case 1:
            case 4:
                ayoVar = new ayo(4, azhVar);
                break;
            case 3:
                bje bjeVar2 = apzVar.a;
                synchronized (bjeVar2.a) {
                    Iterator it2 = bjeVar2.c.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            ayoVar = new ayo(1, null);
                        } else if (((bjd) ((Map.Entry) it2.next()).getValue()).a == bit.CLOSING) {
                            ayoVar = new ayo(2, null);
                        }
                    }
                }
                break;
            case 5:
                ayoVar = new ayo(2, azhVar);
                break;
            case 6:
            case 7:
                ayoVar = new ayo(3, azhVar);
                break;
            default:
                Objects.toString(bitVar3);
                throw new IllegalStateException("Unknown internal camera state: ".concat(String.valueOf(bitVar3)));
        }
        ayo ayoVar2 = ayoVar;
        bbs.a("CameraStateMachine", a.t(azhVar, bitVar3, ayoVar2, "New public camera state ", " from ", " and "));
        lvy lvyVar = apzVar.b;
        if (j$.util.Objects.equals((azi) lvyVar.a(), ayoVar2)) {
            return;
        }
        ayoVar2.toString();
        bbs.a("CameraStateMachine", "Publishing new public camera state ".concat(ayoVar2.toString()));
        lvyVar.j(ayoVar2);
    }

    final void N() {
        boolean z = true;
        if (this.A != 6 && this.A != 2 && (this.A != 8 || this.i == 0)) {
            z = false;
        }
        lcg.d(z, "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + ((Object) ang.a(this.A)) + " (error: " + j(this.i) + ")");
        O();
        this.j.e();
    }

    final void O() {
        lcg.c(this.j != null);
        q("Resetting Capture Session");
        aqm aqmVar = this.j;
        bml bmlVarA = aqmVar.a();
        List listD = aqmVar.d();
        aqm aqmVarA = a();
        this.j = aqmVarA;
        aqmVarA.j(bmlVarA);
        this.j.h(listD);
        int i = this.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 9) {
            q("Skipping Capture Session state check due to current camera state: " + ((Object) ang.a(this.A)) + " and previous session status: " + aqmVar.l());
        } else if (this.E && aqmVar.l()) {
            q("Close camera before creating new session");
            K(7);
        }
        if (this.F && aqmVar.l()) {
            q("ConfigAndClose is required when close the camera.");
            this.r = true;
        }
        aqmVar.f();
        ListenableFuture listenableFutureP = aqmVar.p();
        int i3 = this.A;
        String strA = ang.a(i3);
        if (i3 == 0) {
            throw null;
        }
        q("Releasing session in state ".concat(strA));
        this.n.put(aqmVar, listenableFutureP);
        bqk.i(listenableFutureP, new amy(this, aqmVar), bpc.a());
    }

    @Override // defpackage.biu
    public final void P() {
        this.G = true;
    }

    public final aqm a() {
        synchronized (this.w) {
            if (this.J == null) {
                return new aql(this.y, this.g.j, false);
            }
            return new asf(this.J, this.y, this.c, this.d);
        }
    }

    @Override // defpackage.ayv
    public final /* synthetic */ ayx b() {
        throw null;
    }

    @Override // defpackage.biu, defpackage.ayv
    public final /* synthetic */ azd c() {
        return bis.a(this);
    }

    @Override // defpackage.biu
    public final big d() {
        return this.I;
    }

    @Override // defpackage.biu
    public final bin e() {
        return this.e;
    }

    @Override // defpackage.biu
    public final bir f() {
        return this.g;
    }

    @Override // defpackage.biu
    public final blm g() {
        return this.B;
    }

    @Override // defpackage.biu
    public final ListenableFuture h() {
        return kol.a(new koi() { // from class: amd
            @Override // defpackage.koi
            public final Object a(final kog kogVar) {
                final anm anmVar = this.a;
                anmVar.c.execute(new Runnable() { // from class: amk
                    @Override // java.lang.Runnable
                    public final void run() {
                        final anm anmVar2 = anmVar;
                        if (anmVar2.l == null) {
                            if (anmVar2.A != 1) {
                                anmVar2.l = kol.a(new koi() { // from class: amg
                                    @Override // defpackage.koi
                                    public final Object a(kog kogVar2) {
                                        anm anmVar3 = anmVar2;
                                        lcg.d(anmVar3.m == null, "Camera can only be released once, so release completer should be null on creation.");
                                        anmVar3.m = kogVar2;
                                        return "Release[camera=" + anmVar3 + "]";
                                    }
                                });
                            } else {
                                anmVar2.l = bqk.b(null);
                            }
                        }
                        ListenableFuture listenableFuture = anmVar2.l;
                        int i = anmVar2.A;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        switch (i2) {
                            case 1:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                if (!anmVar2.f.c() && !anmVar2.z.b()) {
                                    z = false;
                                }
                                anmVar2.z.a();
                                anmVar2.K(2);
                                if (z) {
                                    lcg.c(anmVar2.J());
                                    anmVar2.p();
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                            case 4:
                                lcg.c(anmVar2.h == null);
                                anmVar2.K(2);
                                lcg.c(anmVar2.J());
                                anmVar2.p();
                                break;
                            case 9:
                                anmVar2.K(2);
                                anmVar2.N();
                                break;
                            default:
                                int i3 = anmVar2.A;
                                Objects.toString(ang.a(i3));
                                anmVar2.q("release() ignored due to being in state: ".concat(ang.a(i3)));
                                break;
                        }
                        bqk.j(listenableFuture, kogVar);
                    }
                });
                return "Release[request=" + anmVar.k.getAndIncrement() + "]";
            }
        });
    }

    final /* synthetic */ Object i(final kog kogVar) {
        try {
            this.c.execute(new Runnable() { // from class: amn
                @Override // java.lang.Runnable
                public final void run() {
                    kog kogVar2 = kogVar;
                    anm anmVar = this.a;
                    arx arxVar = anmVar.t;
                    if (arxVar == null) {
                        kogVar2.b(false);
                    } else {
                        kogVar2.b(Boolean.valueOf(anmVar.a.j(anm.k(arxVar))));
                    }
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            kogVar.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public final void n() {
        bne bneVar = this.a;
        bml bmlVarA = bneVar.b().a();
        bjl bjlVar = bmlVarA.g;
        int size = bjlVar.e().size();
        int size2 = bmlVarA.f().size();
        if (bmlVarA.f().isEmpty()) {
            return;
        }
        if (!bjlVar.e().isEmpty()) {
            if (size2 == 1) {
                if (size == 1) {
                    S();
                    return;
                }
                size2 = 1;
            }
            if (size >= 2) {
                S();
                return;
            } else if (this.t == null || T()) {
                bbs.a("Camera2CameraImpl", a.s(size, size2, "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: ", ", CaptureConfig Surfaces: "));
                return;
            } else {
                S();
                return;
            }
        }
        if (this.t == null) {
            this.t = new arx(this.g.b, this.K, new amf(this));
        }
        if (!T()) {
            bbs.c("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
            return;
        }
        arx arxVar = this.t;
        if (arxVar != null) {
            String strK = k(arxVar);
            arx arxVar2 = this.t;
            bml bmlVar = arxVar2.b;
            arw arwVar = arxVar2.c;
            bnk bnkVar = bnk.METERING_REPEATING;
            bneVar.g(strK, bmlVar, arwVar, null, Collections.singletonList(bnkVar));
            arx arxVar3 = this.t;
            bneVar.f(strK, arxVar3.b, arxVar3.c, null, Collections.singletonList(bnkVar));
        }
    }

    @Override // defpackage.biu
    public final void o(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.e.w();
        for (bdr bdrVar : new ArrayList(arrayList)) {
            String strL = l(bdrVar);
            Set set = this.H;
            if (!set.contains(strL)) {
                set.add(strL);
                bdrVar.N();
                bdrVar.ai();
            }
        }
        final ArrayList arrayList2 = new ArrayList(Q(arrayList));
        try {
            this.c.execute(new Runnable() { // from class: amq
                @Override // java.lang.Runnable
                public final void run() {
                    Size sizeA;
                    anm anmVar = this.a;
                    List<anl> list = arrayList2;
                    try {
                        bne bneVar = anmVar.a;
                        boolean zIsEmpty = bneVar.c().isEmpty();
                        ArrayList arrayList3 = new ArrayList();
                        Rational rational = null;
                        for (anl anlVar : list) {
                            if (!bneVar.j(anlVar.f())) {
                                bneVar.g(anlVar.f(), anlVar.b(), anlVar.d(), anlVar.c(), anlVar.g());
                                arrayList3.add(anlVar.f());
                                if (anlVar.e() == bch.class && (sizeA = anlVar.a()) != null) {
                                    rational = new Rational(sizeA.getWidth(), sizeA.getHeight());
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            anmVar.q("Use cases [" + TextUtils.join(", ", arrayList3) + "] now ATTACHED");
                            boolean z = true;
                            if (zIsEmpty) {
                                amb ambVar = anmVar.e;
                                ambVar.z(true);
                                ambVar.w();
                            }
                            anmVar.n();
                            anmVar.G();
                            anmVar.F();
                            anmVar.E();
                            anmVar.O();
                            if (anmVar.A == 10) {
                                anmVar.y();
                            } else {
                                int i = anmVar.A;
                                int i2 = i - 1;
                                if (i == 0) {
                                    throw null;
                                }
                                if (i2 == 2 || i2 == 3 || i2 == 4) {
                                    anmVar.C(false);
                                } else if (i2 != 5) {
                                    int i3 = anmVar.A;
                                    Objects.toString(ang.a(i3));
                                    anmVar.q("open() ignored due to being in state: ".concat(ang.a(i3)));
                                } else {
                                    anmVar.K(8);
                                    if (!anmVar.J() && !anmVar.s && anmVar.i == 0) {
                                        if (anmVar.h == null) {
                                            z = false;
                                        }
                                        lcg.d(z, "Camera Device should be open if session close is not complete");
                                        anmVar.K(10);
                                        anmVar.y();
                                    }
                                }
                            }
                            if (rational != null) {
                                anmVar.e.C(rational);
                            }
                        }
                    } finally {
                        anmVar.e.t();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            r("Unable to attach use cases.", e);
            this.e.t();
        }
    }

    public final void p() {
        lcg.c(this.A == 2 || this.A == 6);
        lcg.c(this.n.isEmpty());
        if (!this.r) {
            t();
            return;
        }
        if (this.s) {
            q("Ignored since configAndClose is processing");
            return;
        }
        if (!this.o.a) {
            this.r = false;
            t();
            q("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            q("Open camera to configAndClose");
            ListenableFuture listenableFutureA = kol.a(new koi() { // from class: amo
                @Override // defpackage.koi
                public final Object a(kog kogVar) {
                    anm anmVar = this.a;
                    try {
                        ArrayList arrayList = new ArrayList(anmVar.a.b().a().c);
                        arrayList.add(anmVar.u.f);
                        arrayList.add(new amx(anmVar, kogVar));
                        anmVar.b.b(anmVar.g.a, anmVar.c, apx.a(arrayList));
                        return "configAndCloseTask";
                    } catch (aub | RuntimeException e) {
                        anmVar.r("Unable to open camera for configAndClose: ".concat(String.valueOf(e.getMessage())), e);
                        kogVar.c(e);
                        return "configAndCloseTask";
                    }
                }
            });
            this.s = true;
            listenableFutureA.b(new Runnable() { // from class: amp
                @Override // java.lang.Runnable
                public final void run() {
                    anm anmVar = this.a;
                    anmVar.s = false;
                    anmVar.r = false;
                    int i = anmVar.A;
                    Objects.toString(ang.a(i));
                    anmVar.q("OpenCameraConfigAndClose is done, state: ".concat(ang.a(i)));
                    int i2 = anmVar.A;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i3 == 1 || i3 == 5) {
                        lcg.c(anmVar.J());
                        anmVar.t();
                        return;
                    }
                    if (i3 != 7) {
                        int i4 = anmVar.A;
                        Objects.toString(ang.a(i4));
                        anmVar.q("OpenCameraConfigAndClose finished while in state: ".concat(ang.a(i4)));
                    } else {
                        int i5 = anmVar.i;
                        if (i5 == 0) {
                            anmVar.D(false);
                        } else {
                            anmVar.q("OpenCameraConfigAndClose in error: ".concat(anm.j(i5)));
                            anmVar.f.b();
                        }
                    }
                }
            }, this.c);
        }
    }

    final void q(String str) {
        r(str, null);
    }

    public final void r(String str, Throwable th) {
        bbs.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    @Override // defpackage.biu
    public final void s(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(Q(arrayList));
        for (bdr bdrVar : new ArrayList(arrayList)) {
            String strL = l(bdrVar);
            Set set = this.H;
            if (set.contains(strL)) {
                bdrVar.q();
                set.remove(strL);
            }
        }
        this.c.execute(new Runnable() { // from class: amh
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                boolean z = false;
                while (true) {
                    anmVar = this.a;
                    if (!it.hasNext()) {
                        break;
                    }
                    anl anlVar = (anl) it.next();
                    bne bneVar = anmVar.a;
                    if (bneVar.j(anlVar.f())) {
                        bneVar.a.remove(anlVar.f());
                        arrayList3.add(anlVar.f());
                        if (anlVar.e() == bch.class) {
                            z = true;
                        }
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                anmVar.q("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera");
                if (z) {
                    anmVar.e.C(null);
                }
                anmVar.n();
                bne bneVar2 = anmVar.a;
                if (bneVar2.d().isEmpty()) {
                    amb ambVar = anmVar.e;
                    ambVar.F(false);
                    ambVar.B(false);
                } else {
                    anmVar.G();
                    anmVar.F();
                }
                if (!bneVar2.c().isEmpty()) {
                    anmVar.E();
                    anmVar.O();
                    if (anmVar.A == 10) {
                        anmVar.y();
                        return;
                    }
                    return;
                }
                amb ambVar2 = anmVar.e;
                ambVar2.t();
                anmVar.O();
                ambVar2.z(false);
                anmVar.j = anmVar.a();
                anmVar.q("Closing camera.");
                int i = anmVar.A;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                switch (i2) {
                    case 3:
                    case 4:
                        lcg.c(anmVar.h == null);
                        anmVar.K(3);
                        return;
                    case 5:
                    default:
                        int i3 = anmVar.A;
                        Objects.toString(ang.a(i3));
                        anmVar.q("close() ignored due to being in state: ".concat(ang.a(i3)));
                        return;
                    case 6:
                    case 7:
                    case 8:
                        boolean z2 = anmVar.f.c() || anmVar.z.b();
                        anmVar.z.a();
                        anmVar.K(6);
                        if (z2) {
                            lcg.c(anmVar.J());
                            anmVar.p();
                            return;
                        }
                        return;
                    case 9:
                        anmVar.K(6);
                        anmVar.N();
                        return;
                }
            }
        });
    }

    final void t() {
        lcg.c(this.A == 2 || this.A == 6);
        lcg.c(this.n.isEmpty());
        this.h = null;
        if (this.A == 6) {
            K(3);
            return;
        }
        this.b.a.e(this.o);
        K(1);
        kog kogVar = this.m;
        if (kogVar != null) {
            kogVar.b(null);
            this.m = null;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.g.a);
    }

    @Override // defpackage.bdq
    public final void u(bdr bdrVar) {
        final String strL = l(bdrVar);
        final bml bmlVar = this.G ? bdrVar.q : bdrVar.r;
        final bni bniVar = bdrVar.l;
        final bms bmsVar = bdrVar.m;
        final List listM = m(bdrVar);
        this.c.execute(new Runnable() { // from class: amu
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar = this.a;
                String str = strL;
                anmVar.q(a.a(str, "Use case ", " ACTIVE"));
                bml bmlVar2 = bmlVar;
                bni bniVar2 = bniVar;
                bms bmsVar2 = bmsVar;
                List list = listM;
                bne bneVar = anmVar.a;
                bneVar.f(str, bmlVar2, bniVar2, bmsVar2, list);
                bneVar.i(str, bmlVar2, bniVar2, bmsVar2, list);
                anmVar.E();
            }
        });
    }

    @Override // defpackage.bdq
    public final void v(bdr bdrVar) {
        final String strL = l(bdrVar);
        this.c.execute(new Runnable() { // from class: amt
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar = this.a;
                String str = strL;
                anmVar.q(a.a(str, "Use case ", " INACTIVE"));
                anmVar.a.h(str);
                anmVar.E();
            }
        });
    }

    @Override // defpackage.bdq
    public final void w(bdr bdrVar) {
        bml bmlVar = this.G ? bdrVar.q : bdrVar.r;
        z(l(bdrVar), bmlVar, bdrVar.l, bdrVar.m, m(bdrVar));
    }

    @Override // defpackage.bdq
    public final void x(bdr bdrVar) {
        lcg.i(bdrVar);
        final String strL = l(bdrVar);
        final bml bmlVar = this.G ? bdrVar.q : bdrVar.r;
        final bni bniVar = bdrVar.l;
        final bms bmsVar = bdrVar.m;
        final List listM = m(bdrVar);
        this.c.execute(new Runnable() { // from class: ams
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar = this.a;
                String str = strL;
                anmVar.q(a.a(str, "Use case ", " UPDATED"));
                anmVar.a.i(str, bmlVar, bniVar, bmsVar, listM);
                anmVar.E();
            }
        });
    }

    final void y() {
        lcg.c(this.A == 10);
        bne bneVar = this.a;
        bmk bmkVarB = bneVar.b();
        if (!bmkVarB.c()) {
            q("Unable to create capture session due to conflicting configurations");
            return;
        }
        bje bjeVar = this.q;
        this.h.getId();
        this.p.a(this.h.getId());
        bjeVar.f();
        HashMap map = new HashMap();
        Collection<bml> collectionC = bneVar.c();
        Collection collectionD = bneVar.d();
        bjo bjoVar = ash.a;
        ArrayList arrayList = new ArrayList(collectionD);
        Iterator it = collectionC.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bml bmlVar = (bml) it.next();
            bjq bjqVarC = bmlVar.c();
            bjo bjoVar2 = ash.a;
            if (bjqVarC.t(bjoVar2) && bmlVar.f().size() != 1) {
                bbs.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(bmlVar.f().size())));
                break;
            }
            if (bmlVar.c().t(bjoVar2)) {
                int i = 0;
                for (bml bmlVar2 : collectionC) {
                    if (((bni) arrayList.get(i)).l() == bnk.METERING_REPEATING) {
                        lcg.d(!bmlVar2.f().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put((bjz) bmlVar2.f().get(0), 1L);
                    } else if (bmlVar2.c().t(bjoVar2) && !bmlVar2.f().isEmpty()) {
                        map.put((bjz) bmlVar2.f().get(0), (Long) bmlVar2.c().m(bjoVar2));
                    }
                    i++;
                }
            }
        }
        this.j.k(map);
        aqm aqmVar = this.j;
        bml bmlVarA = bmkVarB.a();
        CameraDevice cameraDevice = this.h;
        lcg.i(cameraDevice);
        bqk.i(aqmVar.b(bmlVarA, cameraDevice, this.v.a()), new amz(this, aqmVar), this.c);
    }

    public final void z(final String str, final bml bmlVar, final bni bniVar, final bms bmsVar, final List list) {
        this.c.execute(new Runnable() { // from class: ami
            @Override // java.lang.Runnable
            public final void run() {
                anm anmVar = this.a;
                String str2 = str;
                anmVar.q(a.a(str2, "Use case ", " RESET"));
                anmVar.a.i(str2, bmlVar, bniVar, bmsVar, list);
                anmVar.n();
                anmVar.O();
                anmVar.E();
                if (anmVar.A == 10) {
                    anmVar.y();
                }
            }
        });
    }
}
