package defpackage;

import android.view.Surface;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgg implements ced {
    public Surface b;
    public cee d;
    public Executor e;
    final /* synthetic */ cgh f;
    public final Object a = new Object();
    public final Set c = new HashSet();

    public cgg(cgh cghVar) {
        this.f = cghVar;
    }

    public final void a(Executor executor, final cee ceeVar, final Surface surface) {
        try {
            executor.execute(new Runnable() { // from class: cgf
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executor2;
                    cae caeVar = (cae) ceeVar;
                    final can canVar = caeVar.a;
                    int i = canVar.l;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    kog kogVar = caeVar.b;
                    final Surface surface2 = surface;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            bdp bdpVar = caeVar.c;
                            if (bdpVar.d()) {
                                bbs.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(bdpVar, "EMPTY") + " is already serviced.");
                                kogVar.b(null);
                                canVar.a();
                                return;
                            }
                            canVar.d = surface2;
                            java.util.Objects.toString(surface2);
                            bbs.a("VideoEncoderSession", "provide surface: ".concat(surface2.toString()));
                            bdpVar.b(surface2, canVar.b, new lbz() { // from class: caj
                                @Override // defpackage.lbz
                                public final void accept(Object obj) {
                                    bdm bdmVar = (bdm) obj;
                                    bbs.a("VideoEncoderSession", "Surface can be closed: " + bdmVar.b().hashCode());
                                    Surface surfaceB = bdmVar.b();
                                    can canVar2 = canVar;
                                    if (surfaceB != canVar2.d) {
                                        surfaceB.release();
                                        return;
                                    }
                                    canVar2.d = null;
                                    canVar2.k.b(canVar2.c);
                                    canVar2.a();
                                }
                            });
                            canVar.l = 4;
                            kogVar.b(canVar.c);
                            return;
                        }
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (canVar.g != null && (executor2 = canVar.f) != null) {
                                    executor2.execute(new Runnable() { // from class: cak
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((byf) canVar.g).a.o(surface2);
                                        }
                                    });
                                }
                                java.util.Objects.toString(surface2);
                                bbs.f("VideoEncoderSession", "Surface is updated in READY state: ".concat(surface2.toString()));
                                return;
                            }
                            if (i2 != 4) {
                                throw new IllegalStateException("State " + ((Object) cam.a(canVar.l)) + " is not handled");
                            }
                        }
                    }
                    int i3 = canVar.l;
                    java.util.Objects.toString(cam.a(i3));
                    bbs.a("VideoEncoderSession", "Not provide surface in ".concat(cam.a(i3)));
                    kogVar.b(null);
                }
            });
        } catch (RejectedExecutionException e) {
            bbs.d(this.f.a, "Unable to post to the supplied executor.", e);
        }
    }
}
