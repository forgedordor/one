package defpackage;

import android.os.Trace;
import android.util.Range;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ciu implements cit {
    private final bwg a;

    public ciu(bwg bwgVar) {
        this.a = bwgVar;
    }

    @Override // defpackage.cit
    public final ayv a(lvj lvjVar, azg azgVar, bdt bdtVar) {
        lvjVar.getClass();
        azgVar.getClass();
        plm.a("CX:bindToLifecycle-UseCaseGroup");
        bwb bwbVar = this.a.b;
        try {
            bwbVar.e();
            bwbVar.b(1);
            List list = bdtVar.b;
            bdu bduVar = bdtVar.a;
            List list2 = bdtVar.c;
            Range range = bdtVar.d;
            range.getClass();
            return bwb.d(bwbVar, lvjVar, azgVar, new bbr(list, bduVar, list2, range));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cit
    public final azd b(azg azgVar) {
        azgVar.getClass();
        return this.a.b.a(azgVar);
    }

    @Override // defpackage.cit
    public final void c(bdr... bdrVarArr) {
        bbr bbrVar;
        bdr[] bdrVarArr2 = (bdr[]) Arrays.copyOf(bdrVarArr, bdrVarArr.length);
        bdrVarArr2.getClass();
        plm.a("CX:unbind");
        bwb bwbVar = this.a.b;
        try {
            box.b();
            bwbVar.e();
            LifecycleCameraRepository lifecycleCameraRepository = bwbVar.d;
            bbr bbrVar2 = new bbr(fcur.K(bdrVarArr2));
            HashSet<bwc> hashSet = bwbVar.h;
            synchronized (lifecycleCameraRepository.c) {
                for (bwc bwcVar : hashSet) {
                    Map map = lifecycleCameraRepository.d;
                    if (map.containsKey(bwcVar)) {
                        LifecycleCamera lifecycleCamera = (LifecycleCamera) map.get(bwcVar);
                        boolean zIsEmpty = lifecycleCamera.d().isEmpty();
                        synchronized (lifecycleCamera.a) {
                            bcp bcpVar = lifecycleCamera.e;
                            if (bcpVar != null) {
                                ArrayList arrayList = new ArrayList(bcpVar.d);
                                List list = bbrVar2.d;
                                arrayList.removeAll(list);
                                if (arrayList.isEmpty()) {
                                    bbrVar = null;
                                } else {
                                    bcp bcpVar2 = lifecycleCamera.e;
                                    bbrVar = new bbr(arrayList, bcpVar2.b, bcpVar2.c, ((bbr) bcpVar2).a);
                                }
                                lifecycleCamera.e = bbrVar;
                                ArrayList arrayList2 = new ArrayList(list);
                                brb brbVar = lifecycleCamera.c;
                                arrayList2.retainAll(brbVar.a());
                                brbVar.g(arrayList2);
                            }
                        }
                        if (!zIsEmpty && lifecycleCamera.d().isEmpty()) {
                            lifecycleCameraRepository.d(lifecycleCamera.a());
                        }
                    } else {
                        bbs.f("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.cit
    public final void d() {
        this.a.a();
    }

    @Override // defpackage.cit
    public final boolean e(azg azgVar) {
        return this.a.b(azgVar);
    }
}
