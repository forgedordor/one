package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class arx {
    public bjz a;
    public bml b;
    public final arw c;
    public final Size d;
    public final amf e;
    private final axr f;
    private bme g;

    public arx(auy auyVar, aqs aqsVar, amf amfVar) {
        Size size;
        axr axrVar = new axr();
        this.f = axrVar;
        Size size2 = null;
        this.g = null;
        this.c = new arw();
        this.e = amfVar;
        Size[] sizeArrC = auyVar.b().c(34);
        if (sizeArrC == null) {
            bbs.c("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (axrVar.c != null && RepeatingStreamConstraintForVideoRecordingQuirk.a()) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrC) {
                    if (axr.b.compare(size3, axr.a) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrC = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrC);
            Collections.sort(listAsList, new Comparator() { // from class: aru
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Size size4 = (Size) obj;
                    Size size5 = (Size) obj2;
                    return Long.signum((size4.getWidth() * size4.getHeight()) - (size5.getWidth() * size5.getHeight()));
                }
            });
            Size sizeB = aqsVar.b();
            long jMin = Math.min(sizeB.getWidth() * sizeB.getHeight(), 307200L);
            int length = sizeArrC.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = sizeArrC[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == jMin) {
                    size = size4;
                    break;
                } else if (width <= jMin) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.d = size;
        Objects.toString(size);
        bbs.a("MeteringRepeating", "MeteringSession SurfaceTexture size: ".concat(String.valueOf(size)));
        this.b = a();
    }

    final bml a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bmd bmdVarA = bmd.a(this.c, size);
        bmdVarA.t(1);
        bkx bkxVar = new bkx(surface);
        this.a = bkxVar;
        bqk.i(bkxVar.c(), new arv(surface, surfaceTexture), bpc.a());
        bmdVarA.m(this.a);
        bme bmeVar = this.g;
        if (bmeVar != null) {
            bmeVar.b();
        }
        bme bmeVar2 = new bme(new bmf() { // from class: art
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.bmf
            public final void a(bml bmlVar) {
                arx arxVar = this.a;
                arxVar.b = arxVar.a();
                final anm anmVar = arxVar.e.a;
                try {
                    if (((Boolean) kol.a(new koi() { // from class: amr
                        @Override // defpackage.koi
                        public final Object a(kog kogVar) {
                            return anmVar.i(kogVar);
                        }
                    }).get()).booleanValue()) {
                        arx arxVar2 = anmVar.t;
                        anmVar.z(anm.k(arxVar2), arxVar2.b, arxVar2.c, null, Collections.singletonList(bnk.METERING_REPEATING));
                    }
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                }
            }
        });
        this.g = bmeVar2;
        bmdVarA.f = bmeVar2;
        return bmdVarA.b();
    }
}
