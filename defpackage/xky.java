package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xky extends fcyz implements fdat {
    int a;
    final /* synthetic */ xlm b;
    final /* synthetic */ Context c;
    final /* synthetic */ int d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xky(fcxy fcxyVar, xlm xlmVar, Context context, int i) {
        super(2, fcxyVar);
        this.b = xlmVar;
        this.c = context;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0078, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d3, code lost:
    
        if (defpackage.fdin.a(r1, r3, r10) != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        return r0;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter$attemptBeginRecording$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "BugleComposeRow2"
            r5 = 1
            java.lang.String r6 = "VoiceInputUiAdapter.kt"
            defpackage.fctl.b(r11)
            if (r1 == 0) goto L15
            if (r1 == r5) goto Ld5
            goto L7b
        L15:
            java.lang.Object r11 = r10.e
            fdjx r11 = (defpackage.fdjx) r11
            xlm r11 = r10.b
            android.media.AudioManager r1 = r11.f
            int r7 = r1.getMode()
            r8 = 2
            r9 = 0
            if (r7 == r8) goto La4
            int r1 = r1.getMode()
            r7 = 3
            if (r1 != r7) goto L2e
            goto La4
        L2e:
            crma r1 = r11.g
            boolean r1 = r1.n()
            if (r1 != 0) goto L5c
            ekrg r0 = defpackage.xlm.a
            ekrw r0 = r0.h()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r4)
            r1 = 144(0x90, float:2.02E-43)
            ekrw r0 = r0.h(r3, r2, r1, r6)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Record audio permission not granted yet"
            r0.q(r1)
            android.content.Context r0 = r10.c
            fdjx r1 = r11.b
            xlj r2 = new xlj
            r2.<init>(r11, r0, r9)
            defpackage.auvw.k(r1, r9, r9, r2, r7)
            goto Ld5
        L5c:
            fcsu r11 = r11.d
            java.lang.Object r1 = r11.b()
            xmd r1 = (defpackage.xmd) r1
            int r7 = r10.d
            r1.k = r7
            java.lang.Object r11 = r11.b()
            xmd r11 = (defpackage.xmd) r11
            r10.a = r8
            dqee r11 = r11.a()
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L7b
            goto Lda
        L7b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
            if (r0 != 0) goto L9b
            ekrg r0 = defpackage.xlm.a
            ekrw r0 = r0.j()
            ekrz r1 = defpackage.eksq.a
            r0.X(r1, r4)
            r1 = 152(0x98, float:2.13E-43)
            ekrw r0 = r0.h(r3, r2, r1, r6)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Unable to start recording successfully"
            r0.q(r1)
        L9b:
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto La2
            goto Ld5
        La2:
            r5 = 0
            goto Ld5
        La4:
            ekrg r1 = defpackage.xlm.a
            ekrw r1 = r1.h()
            ekrz r7 = defpackage.eksq.a
            r1.X(r7, r4)
            r4 = 134(0x86, float:1.88E-43)
            ekrw r1 = r1.h(r3, r2, r4, r6)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Cannot record audio while a call is in progress"
            r1.q(r2)
            fdjx r1 = r11.b
            fcyh r1 = r1.hE()
            fcyh r1 = defpackage.eicg.a(r1)
            android.content.Context r2 = r10.c
            xkz r3 = new xkz
            r3.<init>(r9, r11, r2)
            r10.a = r5
            java.lang.Object r11 = defpackage.fdin.a(r1, r3, r10)
            if (r11 == r0) goto Lda
        Ld5:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            return r11
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xky.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xky xkyVar = new xky(fcxyVar, this.b, this.c, this.d);
        xkyVar.e = obj;
        return xkyVar;
    }
}
