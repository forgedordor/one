package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csbh implements eqfw {
    private final csbb a;
    private final fcsu b;
    private final eqeq c;

    public csbh(csbb csbbVar, fcsu fcsuVar, aubq aubqVar, aubq aubqVar2, eqdb eqdbVar, eqeq eqeqVar) {
        csbbVar.getClass();
        aubqVar.getClass();
        aubqVar2.getClass();
        eqdbVar.getClass();
        eqeqVar.getClass();
        this.a = csbbVar;
        this.b = fcsuVar;
        this.c = eqeqVar;
    }

    private static final String c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        messageDigest.reset();
        byte[] bytes = str.getBytes(fdfy.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            str2.getClass();
            sb.append(str2);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.basd r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csbh.a(basd, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.eqfw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ezpp r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.csbg
            if (r0 == 0) goto L13
            r0 = r8
            csbg r0 = (defpackage.csbg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            csbg r0 = new csbg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            eieu r7 = r0.e
            ezpp r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L6c
        L2c:
            r8 = move-exception
            goto L9c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.fctl.b(r8)
            fcyh r8 = r0.u()
            boolean r8 = defpackage.eicg.b(r8)
            if (r8 == 0) goto La2
            java.lang.String r8 = "SendMessageRequestHeaderModifier#modifyRequestHeader"
            eieu r8 = defpackage.eiiy.h(r8)
            boolean r2 = defpackage.crtr.a()     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L54
            defpackage.fczl.a(r8, r4)
            return r7
        L54:
            eqeq r2 = r6.c     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r2.a     // Catch: java.lang.Throwable -> L98
            basd r2 = defpackage.basd.a(r2)     // Catch: java.lang.Throwable -> L98
            r0.d = r7     // Catch: java.lang.Throwable -> L98
            r0.e = r8     // Catch: java.lang.Throwable -> L98
            r0.c = r3     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L98
            if (r0 == r1) goto L97
            r5 = r0
            r0 = r7
            r7 = r8
            r8 = r5
        L6c:
            ezoj r8 = (defpackage.ezoj) r8     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto L93
            evsf r0 = r0.toBuilder()     // Catch: java.lang.Throwable -> L2c
            ezpo r0 = (defpackage.ezpo) r0     // Catch: java.lang.Throwable -> L2c
            eyzl r0 = defpackage.eyzk.a(r0)     // Catch: java.lang.Throwable -> L2c
            ezpo r1 = r0.a     // Catch: java.lang.Throwable -> L2c
            r1.copyOnWrite()     // Catch: java.lang.Throwable -> L2c
            MessageType extends evsn<MessageType, BuilderType> r1 = r1.instance     // Catch: java.lang.Throwable -> L2c
            ezpp r1 = (defpackage.ezpp) r1     // Catch: java.lang.Throwable -> L2c
            r1.k = r8     // Catch: java.lang.Throwable -> L2c
            int r8 = r1.b     // Catch: java.lang.Throwable -> L2c
            r8 = r8 | 256(0x100, float:3.59E-43)
            r1.b = r8     // Catch: java.lang.Throwable -> L2c
            ezpp r8 = r0.a()     // Catch: java.lang.Throwable -> L2c
            defpackage.fczl.a(r7, r4)
            return r8
        L93:
            defpackage.fczl.a(r7, r4)
            return r0
        L97:
            return r1
        L98:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L9c:
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r0 = move-exception
            defpackage.fczl.a(r7, r8)
            throw r0
        La2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "TikTok trace may not live through suspension without TikTok provided CoroutineContext"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csbh.b(ezpp, fcxy):java.lang.Object");
    }
}
