package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aql implements aqm {
    final Object a;
    public final List b;
    ask c;
    asn d;
    bml e;
    List f;
    ListenableFuture g;
    kog h;
    int i;
    int j;
    private final aqk k;
    private final Map l;
    private Map m;
    private final axq n;
    private final axt o;
    private final axn p;
    private final awa q;
    private final axs r;
    private final boolean s;

    public aql(awa awaVar, bly blyVar, boolean z) {
        this.a = new Object();
        this.b = new ArrayList();
        this.l = new HashMap();
        this.f = Collections.EMPTY_LIST;
        this.i = 1;
        this.j = 1;
        this.m = new HashMap();
        this.n = new axq();
        this.o = new axt();
        m(3);
        this.q = awaVar;
        this.k = new aqk(this);
        this.p = new axn(blyVar.d(CaptureNoResponseQuirk.class));
        this.r = new axs(blyVar);
        this.s = z;
    }

    @Override // defpackage.aqm
    public final bml a() {
        bml bmlVar;
        synchronized (this.a) {
            bmlVar = this.e;
        }
        return bmlVar;
    }

    @Override // defpackage.aqm
    public final ListenableFuture b(final bml bmlVar, final CameraDevice cameraDevice, ask askVar) {
        ListenableFuture listenableFutureD;
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 2) {
                bbs.c("CaptureSession", amf.a(this, "Open not allowed in state: "));
                return new bql(new IllegalStateException(amf.a(this, "open() should not allow the state: ")));
            }
            m(4);
            final ArrayList arrayList = new ArrayList(bmlVar.f());
            this.f = arrayList;
            this.c = askVar;
            synchronized (((asy) askVar).m) {
                ((asy) askVar).n = arrayList;
                synchronized (((asv) askVar).a) {
                    if (((asv) askVar).l) {
                        listenableFutureD = new bql(new CancellationException("Opener is disabled"));
                    } else {
                        Executor executor = ((asv) askVar).d;
                        final asv asvVar = (asv) askVar;
                        ((asv) askVar).j = bqk.g(bpw.a(bkd.c(arrayList, executor, ((asv) askVar).e)), new bpr() { // from class: ass
                            @Override // defpackage.bpr
                            public final ListenableFuture a(Object obj) {
                                List list = (List) obj;
                                bbs.a("SyncCaptureSessionBase", "[" + asvVar + "] getSurface done with results: " + list);
                                return list.isEmpty() ? new bql(new IllegalArgumentException("Unable to open capture session without surfaces")) : list.contains(null) ? new bql(new bjx("Surface closed", (bjz) arrayList.get(list.indexOf(null)))) : bqk.b(list);
                            }
                        }, executor);
                        listenableFutureD = bqk.d(((asv) askVar).j);
                    }
                }
            }
            ListenableFuture listenableFutureG = bqk.g(bpw.a(listenableFutureD), new bpr() { // from class: aqf
                @Override // defpackage.bpr
                public final ListenableFuture a(Object obj) {
                    return this.a.c((List) obj, bmlVar, cameraDevice);
                }
            }, ((asv) this.c).d);
            bqk.i(listenableFutureG, new aqh(this), ((asv) this.c).d);
            return bqk.d(listenableFutureG);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x034b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209 A[Catch: all -> 0x03ba, TryCatch #2 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:16:0x002c, B:17:0x0033, B:19:0x0039, B:20:0x004f, B:22:0x006a, B:27:0x0083, B:29:0x00ac, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:35:0x00cb, B:36:0x00d8, B:38:0x00de, B:40:0x00f9, B:42:0x0105, B:43:0x0116, B:45:0x011c, B:47:0x013a, B:48:0x0163, B:49:0x0184, B:52:0x018f, B:53:0x019e, B:55:0x01a4, B:57:0x01ac, B:59:0x01b2, B:63:0x01bf, B:65:0x01d8, B:67:0x01e4, B:69:0x01ea, B:74:0x01ff, B:76:0x0209, B:77:0x0216, B:79:0x021c, B:80:0x0238, B:82:0x0242, B:84:0x024a, B:86:0x0254, B:87:0x0267, B:88:0x026b, B:90:0x027f, B:93:0x029a, B:71:0x01f2, B:73:0x01fa, B:66:0x01dc, B:94:0x02a8, B:95:0x02b6, B:97:0x02bc, B:99:0x02cc, B:100:0x02d7, B:102:0x02f8, B:104:0x02fc, B:105:0x0305, B:110:0x033c, B:111:0x0341, B:112:0x034a, B:119:0x0398, B:123:0x039c, B:108:0x030f, B:125:0x039e, B:126:0x03a3, B:23:0x0070, B:25:0x0076, B:26:0x007d, B:128:0x03a5, B:129:0x03b5, B:132:0x03b9, B:113:0x034b, B:114:0x035d, B:116:0x0363, B:117:0x0371, B:118:0x0397), top: B:140:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0254 A[Catch: all -> 0x03ba, TryCatch #2 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:16:0x002c, B:17:0x0033, B:19:0x0039, B:20:0x004f, B:22:0x006a, B:27:0x0083, B:29:0x00ac, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:35:0x00cb, B:36:0x00d8, B:38:0x00de, B:40:0x00f9, B:42:0x0105, B:43:0x0116, B:45:0x011c, B:47:0x013a, B:48:0x0163, B:49:0x0184, B:52:0x018f, B:53:0x019e, B:55:0x01a4, B:57:0x01ac, B:59:0x01b2, B:63:0x01bf, B:65:0x01d8, B:67:0x01e4, B:69:0x01ea, B:74:0x01ff, B:76:0x0209, B:77:0x0216, B:79:0x021c, B:80:0x0238, B:82:0x0242, B:84:0x024a, B:86:0x0254, B:87:0x0267, B:88:0x026b, B:90:0x027f, B:93:0x029a, B:71:0x01f2, B:73:0x01fa, B:66:0x01dc, B:94:0x02a8, B:95:0x02b6, B:97:0x02bc, B:99:0x02cc, B:100:0x02d7, B:102:0x02f8, B:104:0x02fc, B:105:0x0305, B:110:0x033c, B:111:0x0341, B:112:0x034a, B:119:0x0398, B:123:0x039c, B:108:0x030f, B:125:0x039e, B:126:0x03a3, B:23:0x0070, B:25:0x0076, B:26:0x007d, B:128:0x03a5, B:129:0x03b5, B:132:0x03b9, B:113:0x034b, B:114:0x035d, B:116:0x0363, B:117:0x0371, B:118:0x0397), top: B:140:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267 A[Catch: all -> 0x03ba, TryCatch #2 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:16:0x002c, B:17:0x0033, B:19:0x0039, B:20:0x004f, B:22:0x006a, B:27:0x0083, B:29:0x00ac, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:35:0x00cb, B:36:0x00d8, B:38:0x00de, B:40:0x00f9, B:42:0x0105, B:43:0x0116, B:45:0x011c, B:47:0x013a, B:48:0x0163, B:49:0x0184, B:52:0x018f, B:53:0x019e, B:55:0x01a4, B:57:0x01ac, B:59:0x01b2, B:63:0x01bf, B:65:0x01d8, B:67:0x01e4, B:69:0x01ea, B:74:0x01ff, B:76:0x0209, B:77:0x0216, B:79:0x021c, B:80:0x0238, B:82:0x0242, B:84:0x024a, B:86:0x0254, B:87:0x0267, B:88:0x026b, B:90:0x027f, B:93:0x029a, B:71:0x01f2, B:73:0x01fa, B:66:0x01dc, B:94:0x02a8, B:95:0x02b6, B:97:0x02bc, B:99:0x02cc, B:100:0x02d7, B:102:0x02f8, B:104:0x02fc, B:105:0x0305, B:110:0x033c, B:111:0x0341, B:112:0x034a, B:119:0x0398, B:123:0x039c, B:108:0x030f, B:125:0x039e, B:126:0x03a3, B:23:0x0070, B:25:0x0076, B:26:0x007d, B:128:0x03a5, B:129:0x03b5, B:132:0x03b9, B:113:0x034b, B:114:0x035d, B:116:0x0363, B:117:0x0371, B:118:0x0397), top: B:140:0x0009, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027f A[Catch: all -> 0x03ba, TryCatch #2 {, blocks: (B:4:0x0009, B:13:0x001a, B:14:0x002a, B:16:0x002c, B:17:0x0033, B:19:0x0039, B:20:0x004f, B:22:0x006a, B:27:0x0083, B:29:0x00ac, B:31:0x00b0, B:32:0x00bb, B:34:0x00c1, B:35:0x00cb, B:36:0x00d8, B:38:0x00de, B:40:0x00f9, B:42:0x0105, B:43:0x0116, B:45:0x011c, B:47:0x013a, B:48:0x0163, B:49:0x0184, B:52:0x018f, B:53:0x019e, B:55:0x01a4, B:57:0x01ac, B:59:0x01b2, B:63:0x01bf, B:65:0x01d8, B:67:0x01e4, B:69:0x01ea, B:74:0x01ff, B:76:0x0209, B:77:0x0216, B:79:0x021c, B:80:0x0238, B:82:0x0242, B:84:0x024a, B:86:0x0254, B:87:0x0267, B:88:0x026b, B:90:0x027f, B:93:0x029a, B:71:0x01f2, B:73:0x01fa, B:66:0x01dc, B:94:0x02a8, B:95:0x02b6, B:97:0x02bc, B:99:0x02cc, B:100:0x02d7, B:102:0x02f8, B:104:0x02fc, B:105:0x0305, B:110:0x033c, B:111:0x0341, B:112:0x034a, B:119:0x0398, B:123:0x039c, B:108:0x030f, B:125:0x039e, B:126:0x03a3, B:23:0x0070, B:25:0x0076, B:26:0x007d, B:128:0x03a5, B:129:0x03b5, B:132:0x03b9, B:113:0x034b, B:114:0x035d, B:116:0x0363, B:117:0x0371, B:118:0x0397), top: B:140:0x0009, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture c(java.util.List r22, defpackage.bml r23, final android.hardware.camera2.CameraDevice r24) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aql.c(java.util.List, bml, android.hardware.camera2.CameraDevice):com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.aqm
    public final List d() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(this.b);
        }
        return listUnmodifiableList;
    }

    @Override // defpackage.aqm
    public final void e() {
        ArrayList arrayList;
        int i;
        synchronized (this.a) {
            List list = this.b;
            if (list.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
                list.clear();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                bjl bjlVar = (bjl) arrayList.get(i2);
                Iterator it = bjlVar.h.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        ((bhr) it.next()).a(bjlVar.a());
                    }
                }
                i2 = i;
            }
        }
    }

    @Override // defpackage.aqm
    public final void f() {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                throw new IllegalStateException(amf.a(this, "close() should not be possible in state: "));
            }
            if (i2 == 2) {
                m(2);
            } else if (i2 == 3) {
                lcg.j(this.c, amf.a(this, "The Opener shouldn't null in state:"));
                this.c.e();
                m(2);
            } else if (i2 == 6 || i2 == 7) {
                lcg.j(this.c, amf.a(this, "The Opener shouldn't null in state:"));
                this.c.e();
                m(6);
                this.p.c();
                this.e = null;
            }
        }
    }

    final void g() {
        if (this.j == 2) {
            bbs.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        m(2);
        this.d = null;
        kog kogVar = this.h;
        if (kogVar != null) {
            kogVar.b(null);
            this.h = null;
        }
    }

    @Override // defpackage.aqm
    public final void h(List list) {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    throw new IllegalStateException(amf.a(this, "issueCaptureRequests() should not be possible in state: "));
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.b.addAll(list);
                    break;
                case 7:
                    this.b.addAll(list);
                    i();
                    break;
            }
        }
    }

    final void i() {
        this.p.b().b(new Runnable() { // from class: aqg
            @Override // java.lang.Runnable
            public final void run() {
                aql aqlVar = this.a;
                synchronized (aqlVar.a) {
                    List list = aqlVar.b;
                    if (list.isEmpty()) {
                        return;
                    }
                    try {
                        aqlVar.n(list);
                    } finally {
                        aqlVar.b.clear();
                    }
                }
            }
        }, bpc.a());
    }

    @Override // defpackage.aqm
    public final void j(bml bmlVar) {
        synchronized (this.a) {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    throw new IllegalStateException(amf.a(this, "setSessionConfig() should not be possible in state: "));
                case 1:
                case 4:
                case 5:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                case 2:
                case 3:
                case 6:
                    this.e = bmlVar;
                    break;
                case 7:
                    this.e = bmlVar;
                    if (bmlVar != null) {
                        if (!this.l.keySet().containsAll(bmlVar.f())) {
                            bbs.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            bbs.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            o(this.e);
                            break;
                        }
                    } else {
                        return;
                    }
            }
        }
    }

    @Override // defpackage.aqm
    public final void k(Map map) {
        synchronized (this.a) {
            this.m = map;
        }
    }

    @Override // defpackage.aqm
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            int i = this.j;
            z = true;
            if (i != 8 && i != 7) {
                z = false;
            }
        }
        return z;
    }

    public final void m(int i) {
        int i2 = this.i;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i - 1;
        if (i4 > i3) {
            this.i = i;
        }
        this.j = i;
        if (plm.c()) {
            int i5 = this.i;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 >= 3) {
                plm.b("CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]", i4);
            }
        }
    }

    final void n(List list) {
        aps apsVar;
        ArrayList<CaptureRequest> arrayList;
        boolean z;
        bib bibVar;
        synchronized (this.a) {
            if (this.j != 8) {
                bbs.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            try {
                apsVar = new aps();
                arrayList = new ArrayList();
                bbs.a("CaptureSession", "Issuing capture request.");
                Iterator it = list.iterator();
                z = false;
                while (it.hasNext()) {
                    bjl bjlVar = (bjl) it.next();
                    if (bjlVar.e().isEmpty()) {
                        bbs.a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator it2 = bjlVar.e().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                bjz bjzVar = (bjz) it2.next();
                                if (!this.l.containsKey(bjzVar)) {
                                    bbs.a("CaptureSession", a.l(bjzVar, "Skipping capture request with invalid surface: "));
                                    break;
                                }
                            } else {
                                int i = bjlVar.f;
                                z |= !(i != 2);
                                bjj bjjVar = new bjj(bjlVar);
                                if (i == 5 && (bibVar = bjlVar.k) != null) {
                                    bjjVar.f = bibVar;
                                }
                                bml bmlVar = this.e;
                                if (bmlVar != null) {
                                    bjjVar.f(bmlVar.g.e);
                                }
                                bjjVar.f(bjlVar.e);
                                CaptureRequest captureRequestA = apk.a(bjjVar.b(), this.d.j(), this.l, false, this.r);
                                if (captureRequestA == null) {
                                    bbs.a("CaptureSession", "Skipping issuing request without surface.");
                                    return;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = bjlVar.h.iterator();
                                while (it3.hasNext()) {
                                    aqc.a((bhr) it3.next(), arrayList2);
                                }
                                apsVar.a(captureRequestA, arrayList2);
                                arrayList.add(captureRequestA);
                            }
                        }
                    }
                }
            } catch (CameraAccessException e) {
                bbs.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                bbs.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return;
            }
            if (this.n.a && z) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    int iIntValue = ((Integer) ((CaptureRequest) it4.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
                    if (iIntValue == 2 || iIntValue == 3) {
                        this.d.r();
                        apsVar.b = new aqd(this);
                        break;
                    }
                }
            }
            if (this.o.a && z) {
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) ((CaptureRequest) it5.next()).get(CaptureRequest.FLASH_MODE);
                    if (num != null && num.intValue() == 2) {
                        apsVar.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new aqi(this)));
                        break;
                    }
                }
            }
            bml bmlVar2 = this.e;
            if (bmlVar2 == null || bmlVar2.h != 1) {
                this.d.s(arrayList, apsVar);
                return;
            }
            aps apsVar2 = new aps();
            for (CaptureRequest captureRequest : arrayList) {
                asn asnVar = this.d;
                asnVar.getClass();
                List listN = asnVar.n(captureRequest);
                Iterator it6 = listN.iterator();
                while (it6.hasNext()) {
                    apsVar2.a((CaptureRequest) it6.next(), Collections.singletonList(new asg(captureRequest, apsVar)));
                }
                this.d.s(listN, apsVar2);
            }
        }
    }

    final void o(bml bmlVar) {
        CameraCaptureSession.CaptureCallback anoVar;
        synchronized (this.a) {
            if (bmlVar == null) {
                bbs.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return;
            }
            if (this.j != 8) {
                bbs.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
                return;
            }
            bjl bjlVar = bmlVar.g;
            if (bjlVar.e().isEmpty()) {
                bbs.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.d.r();
                } catch (CameraAccessException e) {
                    bbs.c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return;
            }
            try {
                bbs.a("CaptureSession", "Issuing request for session.");
                CaptureRequest captureRequestA = apk.a(bjlVar, this.d.j(), this.l, true, this.r);
                if (captureRequestA == null) {
                    bbs.a("CaptureSession", "Skipping issuing empty request for session.");
                    return;
                }
                axn axnVar = this.p;
                List<bhr> list = bjlVar.h;
                CameraCaptureSession.CaptureCallback[] captureCallbackArr = new CameraCaptureSession.CaptureCallback[0];
                ArrayList arrayList = new ArrayList(list.size());
                for (bhr bhrVar : list) {
                    if (bhrVar == null) {
                        anoVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        aqc.a(bhrVar, arrayList2);
                        anoVar = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new ano(arrayList2);
                    }
                    arrayList.add(anoVar);
                }
                Collections.addAll(arrayList, captureCallbackArr);
                CameraCaptureSession.CaptureCallback captureCallbackA = axnVar.a(new ano(arrayList));
                if (bmlVar.h == 1) {
                    List listN = this.d.n(captureRequestA);
                    asn asnVar = this.d;
                    lcg.j(((asv) asnVar).g, "Need to call openCaptureSession before using this API.");
                    ((asv) asnVar).g.a.a(listN, ((asv) asnVar).d, captureCallbackA);
                    return;
                }
                asn asnVar2 = this.d;
                CameraCaptureSession.CaptureCallback captureCallbackA2 = ((asy) asnVar2).p.a(captureCallbackA);
                lcg.j(((asv) asnVar2).g, "Need to call openCaptureSession before using this API.");
                ((asv) asnVar2).g.a.c(captureRequestA, ((asv) asnVar2).d, captureCallbackA2);
                return;
            } catch (CameraAccessException e2) {
                bbs.c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000c, B:23:0x005e, B:9:0x0010, B:11:0x0014, B:12:0x0017, B:14:0x0033, B:15:0x0037, B:17:0x003b, B:18:0x0046, B:19:0x0048, B:21:0x004a, B:22:0x005a, B:26:0x0064, B:27:0x006f, B:28:0x0070), top: B:32:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[Catch: all -> 0x0071, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000c, B:23:0x005e, B:9:0x0010, B:11:0x0014, B:12:0x0017, B:14:0x0033, B:15:0x0037, B:17:0x003b, B:18:0x0046, B:19:0x0048, B:21:0x004a, B:22:0x005a, B:26:0x0064, B:27:0x006f, B:28:0x0070), top: B:32:0x0003 }] */
    @Override // defpackage.aqm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture p() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            int r1 = r4.j     // Catch: java.lang.Throwable -> L71
            int r2 = r1 + (-1)
            r3 = 0
            if (r1 == 0) goto L70
            if (r2 == 0) goto L64
            switch(r2) {
                case 2: goto L5a;
                case 3: goto L4a;
                case 4: goto L37;
                case 5: goto L10;
                case 6: goto L17;
                case 7: goto L10;
                default: goto Lf;
            }     // Catch: java.lang.Throwable -> L71
        Lf:
            goto L5e
        L10:
            asn r1 = r4.d     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L17
            r1.o()     // Catch: java.lang.Throwable -> L71
        L17:
            r1 = 5
            r4.m(r1)     // Catch: java.lang.Throwable -> L71
            axn r1 = r4.p     // Catch: java.lang.Throwable -> L71
            r1.c()     // Catch: java.lang.Throwable -> L71
            ask r1 = r4.c     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.String r2 = defpackage.amf.a(r4, r2)     // Catch: java.lang.Throwable -> L71
            defpackage.lcg.j(r1, r2)     // Catch: java.lang.Throwable -> L71
            ask r1 = r4.c     // Catch: java.lang.Throwable -> L71
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L37
            r4.g()     // Catch: java.lang.Throwable -> L71
            goto L5e
        L37:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.g     // Catch: java.lang.Throwable -> L71
            if (r1 != 0) goto L46
            aqe r1 = new aqe     // Catch: java.lang.Throwable -> L71
            r1.<init>()     // Catch: java.lang.Throwable -> L71
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.kol.a(r1)     // Catch: java.lang.Throwable -> L71
            r4.g = r1     // Catch: java.lang.Throwable -> L71
        L46:
            com.google.common.util.concurrent.ListenableFuture r1 = r4.g     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            return r1
        L4a:
            ask r1 = r4.c     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.String r2 = defpackage.amf.a(r4, r2)     // Catch: java.lang.Throwable -> L71
            defpackage.lcg.j(r1, r2)     // Catch: java.lang.Throwable -> L71
            ask r1 = r4.c     // Catch: java.lang.Throwable -> L71
            r1.e()     // Catch: java.lang.Throwable -> L71
        L5a:
            r1 = 2
            r4.m(r1)     // Catch: java.lang.Throwable -> L71
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.bqk.b(r3)
            return r0
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "release() should not be possible in state: "
            java.lang.String r2 = defpackage.amf.a(r4, r2)     // Catch: java.lang.Throwable -> L71
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L71
            throw r1     // Catch: java.lang.Throwable -> L71
        L70:
            throw r3     // Catch: java.lang.Throwable -> L71
        L71:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L71
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aql.p():com.google.common.util.concurrent.ListenableFuture");
    }

    public aql(awa awaVar, boolean z) {
        this(awaVar, new bly(Collections.EMPTY_LIST), z);
    }
}
