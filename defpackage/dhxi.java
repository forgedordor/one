package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhxi {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/libraries/abuse/hades/moirai/storage/ProtectionsPersistence");
    private static final feav c = new feaz();
    private final Context d;
    private final dhub e;

    public dhxi(Context context, dhub dhubVar) {
        context.getClass();
        this.d = context;
        this.e = dhubVar;
    }

    private final File f(dhnv dhnvVar) {
        String str = dhnvVar.b;
        String str2 = "moirai_persephone_scar";
        if (!fdbq.f(str, "")) {
            str2 = String.format("%s_%s", Arrays.copyOf(new Object[]{"moirai_persephone_scar", str}, 2));
            str2.getClass();
        }
        return this.d.getFileStreamPath(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dhnv r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dhxe
            if (r0 == 0) goto L13
            r0 = r6
            dhxe r0 = (defpackage.dhxe) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dhxe r0 = new dhxe
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            feaz r5 = r0.e
            dhnv r0 = r0.d
            defpackage.fctl.b(r6)
            r6 = r5
            r5 = r0
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.fctl.b(r6)
            feav r6 = defpackage.dhxi.c
            r0.d = r5
            r2 = r6
            feaz r2 = (defpackage.feaz) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 == r1) goto L81
        L49:
            java.io.File r5 = r4.f(r5)     // Catch: java.lang.Throwable -> L7c
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = r5.getPath()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = ".new"
            java.lang.String r1 = r1.concat(r2)     // Catch: java.lang.Throwable -> L7c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = r5.getPath()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = ".bak"
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Throwable -> L7c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7c
            defpackage.lby.c(r5, r0, r1)     // Catch: java.lang.Throwable -> L7c
            r6.d()
            fctx r5 = defpackage.fctx.a
            return r5
        L7c:
            r5 = move-exception
            r6.d()
            throw r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhxi.a(dhnv, fcxy):java.lang.Object");
    }

    public final Object b(dhnv dhnvVar, fcxy fcxyVar) {
        fdap fdapVar = new fdap() { // from class: dhxd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                InputStream inputStream = (InputStream) obj;
                int i = dhxi.a;
                inputStream.getClass();
                return (etqc) evsn.parseFrom(etqc.a, inputStream);
            }
        };
        File fileF = f(dhnvVar);
        fileF.getClass();
        return c(dhnvVar, fdapVar, fileF, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:31:0x00ab, B:33:0x00bc, B:34:0x00c2, B:36:0x00c8, B:38:0x00d1, B:40:0x00d7, B:41:0x00e9, B:43:0x00f5, B:50:0x0100, B:51:0x0103, B:42:0x00f1, B:48:0x00fe), top: B:82:0x00ab, inners: #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dhnv r20, defpackage.fdap r21, java.io.File r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhxi.c(dhnv, fdap, java.io.File, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0222, code lost:
    
        if (e(r2, r1, r4) == r5) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dhnv r19, defpackage.etqc r20, defpackage.fdat r21, defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhxi.d(dhnv, etqc, fdat, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.evuh r11, java.io.File r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhxi.e(evuh, java.io.File, fcxy):java.lang.Object");
    }
}
