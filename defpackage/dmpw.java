package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpw {
    public static final dogz a = dogz.a;
    public final fdjx b;
    public final dolm c;
    public final dmiv d;
    public final bbf e;
    public final MediaActionSound f;
    public final vun g;
    private final Context h;
    private final Executor i;
    private final Executor j;
    private final dndk k;
    private final fctc l;

    public dmpw(Context context, Executor executor, Executor executor2, fdjx fdjxVar, Optional optional, dndk dndkVar, dolm dolmVar, dmiv dmivVar) {
        this.h = context;
        this.i = executor;
        this.j = executor2;
        this.b = fdjxVar;
        this.k = dndkVar;
        this.c = dolmVar;
        this.d = dmivVar;
        bax baxVar = new bax();
        baxVar.i(executor2);
        this.e = baxVar.b();
        this.g = (vun) fdct.b(optional);
        this.f = new MediaActionSound();
        this.l = fctd.a(new fdae() { // from class: dmpo
            @Override // defpackage.fdae
            public final Object invoke() {
                dmpw dmpwVar = this.a;
                return fdil.d(dmpwVar.b, null, null, new dmps(dmpwVar, null), 3);
            }
        });
        d().z();
    }

    private final fdlr d() {
        return (fdlr) this.l.a();
    }

    public final dmbx a(azg azgVar, int i) {
        int i2;
        dmbu dmbuVar = dmbu.a;
        Integer numB = azgVar.b();
        int i3 = 3;
        if (numB != null && numB.intValue() == 1) {
            i2 = 3;
            i3 = 2;
        } else if (numB != null && numB.intValue() == 0) {
            i2 = 3;
        } else {
            i2 = 3;
            i3 = 1;
        }
        return new dmbx(dmbuVar, i3, true != dpgx.f(this.h) ? i2 : 2, false, Integer.valueOf(i), null, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r15v0, types: [dmpw] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.azg r16, int r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmpw.b(azg, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fdap r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dmpv
            if (r0 == 0) goto L13
            r0 = r7
            dmpv r0 = (defpackage.dmpv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmpv r0 = new dmpv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dmpp r6 = r0.d
            defpackage.fctl.b(r7)
            goto L69
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            r7 = 0
            int r2 = android.hardware.Camera.getNumberOfCameras()
            fddq r7 = defpackage.fddu.r(r7, r2)
            fcvy r7 = r7.iterator()
        L41:
            r2 = r7
            fddp r2 = (defpackage.fddp) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L70
            int r2 = r7.a()
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.RuntimeException -> L58
            r4.<init>()     // Catch: java.lang.RuntimeException -> L58
            android.hardware.Camera.getCameraInfo(r2, r4)     // Catch: java.lang.RuntimeException -> L58
            boolean r2 = r4.canDisableShutterSound     // Catch: java.lang.RuntimeException -> L58
            if (r2 != 0) goto L41
        L58:
            fdlr r7 = r5.d()
            r2 = r6
            dmpp r2 = (defpackage.dmpp) r2
            r0.d = r2
            r0.c = r3
            java.lang.Object r7 = r7.o(r0)
            if (r7 == r1) goto L6f
        L69:
            android.media.MediaActionSound r7 = r5.f
            r6.invoke(r7)
            goto L70
        L6f:
            return r1
        L70:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmpw.c(fdap, fcxy):java.lang.Object");
    }
}
