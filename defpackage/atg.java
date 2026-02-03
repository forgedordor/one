package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atg {
    public final amb a;
    public final lvy b;
    public final lvy c;
    public final boolean d;
    public final Executor e;
    public boolean f;
    public final int g;
    kog h;
    boolean i;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public atg(defpackage.amb r5, final defpackage.auy r6, java.util.concurrent.Executor r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.e = r7
            r6.getClass()
            ate r7 = new ate
            r7.<init>()
            boolean r7 = defpackage.axb.a(r7)
            r4.d = r7
            boolean r0 = r6.d()
            r1 = 0
            if (r0 == 0) goto L43
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L43
            boolean r0 = r6.d()
            r3 = 0
            if (r0 == 0) goto L38
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L38
            android.hardware.camera2.CameraCharacteristics$Key r0 = defpackage.ait$$ExternalSyntheticApiModelOutline0.m()
            java.lang.Object r0 = r6.c(r0)
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
        L38:
            if (r3 != 0) goto L3b
            goto L43
        L3b:
            int r0 = r3.intValue()
            r2 = 1
            if (r0 <= r2) goto L43
            goto L44
        L43:
            r2 = r1
        L44:
            if (r7 == 0) goto L4d
            if (r2 == 0) goto L4d
            int r6 = r6.a()
            goto L4e
        L4d:
            r6 = r1
        L4e:
            r4.g = r6
            lvy r7 = new lvy
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.<init>(r0)
            r4.b = r7
            lvy r7 = new lvy
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r6)
            r4.c = r7
            atf r6 = new atf
            r6.<init>()
            r5.n(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atg.<init>(amb, auy, java.util.concurrent.Executor):void");
    }

    public static final void c(lvy lvyVar, Object obj) {
        if (box.d()) {
            lvyVar.m(obj);
        } else {
            lvyVar.j(obj);
        }
    }

    final void a(kog kogVar, int i) {
        if (!this.d) {
            if (kogVar != null) {
                kogVar.c(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f) {
            b(0);
            if (kogVar != null) {
                kogVar.c(new ayw("Camera is not active."));
                return;
            }
            return;
        }
        amb ambVar = this.a;
        boolean z = ambVar.k;
        this.i = i != 0;
        ambVar.v(i);
        b(i);
        kog kogVar2 = this.h;
        if (kogVar2 != null) {
            kogVar2.c(new ayw("There is a new enableTorch being set"));
        }
        this.h = kogVar;
    }

    public final void b(int i) {
        c(this.b, Integer.valueOf(i != 1 ? 0 : 1));
    }
}
