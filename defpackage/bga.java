package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bga {
    final Executor a;
    final btf b;
    bfg c;
    public bfy d;
    public bth e;
    public bth f;
    public bth g;
    public final bly h;
    private final CameraCharacteristics i;

    public bga(Executor executor, CameraCharacteristics cameraCharacteristics, btf btfVar) {
        bly blyVar = brt.a;
        if (brt.a(LowMemoryQuirk.class) != null) {
            this.a = new bpq(executor);
        } else {
            this.a = executor;
        }
        this.b = btfVar;
        this.i = cameraCharacteristics;
        this.h = blyVar;
        blyVar.d(IncorrectJpegMetadataQuirk.class);
    }

    private final bbc b(bti btiVar, bbb bbbVar) throws bbg {
        if (this.c == null) {
            CameraCharacteristics cameraCharacteristics = this.i;
            if (cameraCharacteristics == null) {
                throw new bbg("CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            bib bibVar = ((bsg) btiVar).h;
            if (bibVar.b() == null) {
                throw new bbg("CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CaptureResult captureResultB = bibVar.b();
            captureResultB.getClass();
            this.c = new bfg(cameraCharacteristics, captureResultB);
        }
        bfg bfgVar = this.c;
        bsg bsgVar = (bsg) btiVar;
        bef befVar = new bef((bbm) bsgVar.a, bsgVar.f, bbbVar);
        bbb bbbVar2 = befVar.c;
        bbm bbmVar = befVar.a;
        int i = befVar.b;
        File fileA = bfh.a();
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                try {
                    DngCreator dngCreator = bfgVar.a;
                    dngCreator.setOrientation(i != 0 ? i != 90 ? i != 180 ? i != 270 ? 0 : 8 : 3 : 6 : 1);
                    dngCreator.writeImage(fileOutputStream, bbmVar.d());
                    fileOutputStream.close();
                    bbmVar.close();
                    bfh.b(fileA, bbbVar2);
                    return new bbc();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw new bbg("Failed to write to temp file", e);
            } catch (IllegalArgumentException e2) {
                throw new bbg("Image with an unsupported format was used", e2);
            } catch (IllegalStateException e3) {
                throw new bbg("Not enough metadata information has been set to write a well-formatted DNG file", e3);
            }
        } catch (Throwable th3) {
            bbmVar.close();
            throw th3;
        }
    }

    private static final void c(final bgb bgbVar, final bbg bbgVar) {
        bpn.a().execute(new Runnable() { // from class: bfu
            @Override // java.lang.Runnable
            public final void run() {
                box.b();
                bge bgeVar = bgbVar.l;
                if (bgeVar.f) {
                    return;
                }
                bbg bbgVar2 = bbgVar;
                bgeVar.c();
                bgeVar.d();
                bgeVar.f(bbgVar2);
            }
        });
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v23 java.io.InputStream), method size: 2206
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final void a(defpackage.bfz r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bga.a(bfz):void");
    }
}
