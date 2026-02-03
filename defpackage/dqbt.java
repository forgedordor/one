package defpackage;

import android.content.Context;
import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbt implements dqbu {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/voice/audioplayer/DefaultSoundEffectPlayer");
    public static final AudioAttributes b = new AudioAttributes.Builder().setUsage(13).setContentType(4).build();
    public final Context c;
    private final fdjx d;
    private final fdjq e;

    public dqbt(Context context, fdjx fdjxVar, fdjq fdjqVar) {
        context.getClass();
        fdjxVar.getClass();
        fdjqVar.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.e = fdjqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (defpackage.fdin.a(r2, r5, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dqbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dqbo
            if (r0 == 0) goto L13
            r0 = r8
            dqbo r0 = (defpackage.dqbo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dqbo r0 = new dqbo
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.fctl.b(r8)
            goto L63
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            int r7 = r0.a
            defpackage.fctl.b(r8)
            goto L4d
        L39:
            defpackage.fctl.b(r8)
            fdjq r8 = r6.e
            dqbs r2 = new dqbs
            r2.<init>(r3)
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = defpackage.fdin.a(r8, r2, r0)
            if (r8 == r1) goto L66
        L4d:
            fdjx r2 = r6.d
            android.media.MediaPlayer r8 = (android.media.MediaPlayer) r8
            fcyh r2 = r2.hE()
            dqbr r5 = new dqbr
            r5.<init>(r8, r6, r7, r3)
            r0.d = r4
            java.lang.Object r7 = defpackage.fdin.a(r2, r5, r0)
            if (r7 != r1) goto L63
            goto L66
        L63:
            fctx r7 = defpackage.fctx.a
            return r7
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqbt.a(int, fcxy):java.lang.Object");
    }
}
