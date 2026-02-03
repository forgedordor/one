package defpackage;

import android.content.Context;
import android.os.Trace;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwb {
    public ListenableFuture b;
    public final LifecycleCameraRepository d;
    public azp e;
    public Context f;
    public final Map g;
    public final HashSet h;
    public final Object a = new Object();
    public ListenableFuture c = bqk.b(null);

    public bwb() {
        LifecycleCameraRepository lifecycleCameraRepository;
        synchronized (LifecycleCameraRepository.a) {
            if (LifecycleCameraRepository.b == null) {
                LifecycleCameraRepository.b = new LifecycleCameraRepository();
            }
            lifecycleCameraRepository = LifecycleCameraRepository.b;
        }
        lifecycleCameraRepository.getClass();
        this.d = lifecycleCameraRepository;
        this.g = new HashMap();
        this.h = new HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fd, code lost:
    
        r2.f = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ff, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        r2 = r5.c;
        r10 = r20.d;
        defpackage.bbs.a("ResolvedFeatureCombination", "resolveFeatureCombination: sessionConfig = " + r20 + ", lensFacing = " + r5.c().a());
        defpackage.bbs.a("CameraUseCaseAdapter", defpackage.a.i(null, r10, "addUseCases: appUseCasesToAdd = ", ", featureCombination"));
        r3 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023a, code lost:
    
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x023b, code lost:
    
        r2.a.B(r2.g);
        r11 = new java.util.LinkedHashSet(r2.c);
        r11.addAll(r10);
        r10 = new java.util.HashMap();
        r12 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0259, code lost:
    
        if (r12.hasNext() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025b, code lost:
    
        r15 = (defpackage.bdr) r12.next();
        r10.put(r15, r15.k);
        r15.P(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0269, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x026b, code lost:
    
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026c, code lost:
    
        r2.i(r11, r12, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026f, code lost:
    
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0270, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x027f, code lost:
    
        if (r8.P().a().a(defpackage.lvb.d) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0281, code lost:
    
        r6.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0284, code lost:
    
        monitor-exit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0285, code lost:
    
        r17.h.add(new defpackage.bvw(r18, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0292, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0293, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0294, code lost:
    
        r1 = r10.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a2, code lost:
    
        r2 = (java.util.Map.Entry) r1.next();
        ((defpackage.bdr) r2.getKey()).P((java.util.Set) r2.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02bd, code lost:
    
        throw new defpackage.bqy(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02d3, code lost:
    
        throw new java.lang.IllegalArgumentException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if (r5 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        r7 = r17.e;
        r7.getClass();
        r7.a();
        r7 = r17.e;
        r7.getClass();
        r10 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r10 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00af, code lost:
    
        r7.getClass();
        r11 = r7.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r11 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        r5 = new defpackage.brb(r6, (defpackage.bgy) r2, r8, r8, r10, r11);
        r2 = r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c0, code lost:
    
        r7 = new defpackage.bvw(r18, r5.b);
        r6 = r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r6.get(r7) != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        defpackage.lcg.b(r7, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
        r7 = new androidx.camera.lifecycle.LifecycleCamera(r18, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (r5.a().isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f3, code lost:
    
        if (r18.P().a() != defpackage.lvb.a) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f8, code lost:
    
        r5 = r7.a();
        r9 = new defpackage.bvw(r5, r7.c.b);
        r8 = r12.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0109, code lost:
    
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        r10 = (java.util.Set) r12.e.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        r10 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r10.add(r9);
        r6.put(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
    
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        r6 = new androidx.camera.lifecycle.LifecycleCameraRepository.LifecycleCameraRepositoryObserver(r5, r12);
        r12.e.put(r6, r10);
        r5.P().c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0132, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0134, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0143, code lost:
    
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014b, code lost:
    
        throw new java.lang.IllegalStateException("CameraX not initialized yet.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        r2 = r20.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
    
        if (r2.isEmpty() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0156, code lost:
    
        r6 = r17.d;
        r7 = r17.e;
        r7.getClass();
        r7.a();
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
    
        monitor-enter(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0163, code lost:
    
        defpackage.lcg.a(!r2.isEmpty());
        r8 = r5.a();
        r9 = r6.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0173, code lost:
    
        if (r9 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0175, code lost:
    
        monitor-exit(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0178, code lost:
    
        r9 = ((java.util.Set) r6.e.get(r9)).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        if (r9.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r10 = (androidx.camera.lifecycle.LifecycleCamera) r6.d.get((defpackage.bwc) r9.next());
        defpackage.lcg.i(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r10.equals(r5) != false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a9, code lost:
    
        if (r10.d().isEmpty() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ac, code lost:
    
        r1 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ae, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b7, code lost:
    
        throw new java.lang.IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r9 = r5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bd, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01be, code lost:
    
        r10 = r5.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        if (r10 != null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c2, code lost:
    
        r5.e = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c5, code lost:
    
        r11 = new java.util.ArrayList(r10.d);
        r11.addAll(r2);
        r5.e = new defpackage.bbr(r11, r20.b, r20.c, ((defpackage.bbr) r20).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
    
        r2 = r5.c;
        r10 = r20.b;
        r11 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e6, code lost:
    
        r2.d = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e9, code lost:
    
        r2 = r5.c;
        r10 = r20.c;
        r11 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ef, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f0, code lost:
    
        r2.e = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f2, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f3, code lost:
    
        r2 = r5.c;
        r10 = ((defpackage.bbr) r20).a;
        r11 = r2.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
    
        monitor-enter(r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ defpackage.ayv d(defpackage.bwb r17, defpackage.lvj r18, defpackage.azg r19, defpackage.bcp r20) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwb.d(bwb, lvj, azg, bcp):ayv");
    }

    public final azd a(azg azgVar) {
        Object bgyVar;
        plm.a("CX:getCameraInfo");
        try {
            azp azpVar = this.e;
            azpVar.getClass();
            bir birVarF = azgVar.a(azpVar.c.a()).f();
            birVarF.getClass();
            Iterator it = azgVar.c.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                azc azcVar = (azc) next;
                if (!fdbq.f(azcVar.a(), azc.a)) {
                    bkn bknVarA = azcVar.a();
                    synchronized (bkk.a) {
                    }
                    this.f.getClass();
                }
            }
            big bigVar = bij.a;
            bqt bqtVar = new bqt(birVarF.l(), ((bii) bigVar).h);
            synchronized (this.a) {
                Map map = this.g;
                bgyVar = map.get(bqtVar);
                if (bgyVar == null) {
                    bgyVar = new bgy(birVarF, bigVar);
                    map.put(bqtVar, bgyVar);
                }
            }
            return (bgy) bgyVar;
        } finally {
            Trace.endSection();
        }
    }

    public final void b(int i) {
        azp azpVar = this.e;
        if (azpVar == null) {
            return;
        }
        axw axwVar = (axw) ((amc) azpVar.a()).b;
        if (i != axwVar.e) {
            Iterator it = axwVar.a.iterator();
            while (it.hasNext()) {
                ((bdw) it.next()).a();
            }
        }
        axwVar.e = i;
    }

    public final void c() {
        plm.a("CX:unbindAll");
        try {
            box.b();
            b(0);
            LifecycleCameraRepository lifecycleCameraRepository = this.d;
            HashSet hashSet = this.h;
            synchronized (lifecycleCameraRepository.c) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.d.get((bwc) it.next());
                    if (lifecycleCamera != null) {
                        synchronized (lifecycleCamera.a) {
                            brb brbVar = lifecycleCamera.c;
                            brbVar.g(brbVar.a());
                            lifecycleCamera.e = null;
                        }
                        lifecycleCameraRepository.d(lifecycleCamera.a());
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void e() {
        azp azpVar = this.e;
        if (azpVar == null) {
            return;
        }
        azpVar.a();
    }
}
