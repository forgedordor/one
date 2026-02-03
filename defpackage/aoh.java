package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoh implements aok {
    final /* synthetic */ aoj a;

    public aoh(aoj aojVar) {
        this.a = aojVar;
    }

    @Override // defpackage.aok
    public final ListenableFuture a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            arrayList.add(((aok) it.next()).a(totalCaptureResult));
        }
        return bqk.f(bqk.a(arrayList), new akv() { // from class: aog
            @Override // defpackage.akv
            public final Object a(Object obj) {
                return Boolean.valueOf(((List) obj).contains(true));
            }
        }, bpc.a());
    }

    @Override // defpackage.aok
    public final void b() {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            ((aok) it.next()).b();
        }
    }

    @Override // defpackage.aok
    public final boolean c() {
        Iterator it = this.a.i.iterator();
        while (it.hasNext()) {
            if (((aok) it.next()).c()) {
                return true;
            }
        }
        return false;
    }
}
