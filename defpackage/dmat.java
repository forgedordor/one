package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmat extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dmaw c;
    final /* synthetic */ ByteBuffer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmat(dmaw dmawVar, ByteBuffer byteBuffer, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dmawVar;
        this.d = byteBuffer;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmat) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r11.e(r10) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.b
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r10.a
            defpackage.fctl.b(r11)
            goto L80
        Lf:
            defpackage.fctl.b(r11)
            goto Laa
        L14:
            defpackage.fctl.b(r11)
            dmaw r11 = r10.c
            j$.time.Instant r1 = j$.time.Instant.EPOCH
            long r3 = r11.g
            dmay r5 = r11.c
            int r6 = r5.a
            int r7 = r5.b
            j$.time.Duration r3 = defpackage.dmba.a(r3, r6, r7)
            j$.time.Instant r1 = r1.plus(r3)
            r1.getClass()
            java.nio.ByteBuffer r3 = r10.d
            long r6 = r11.g
            int r4 = r3.remaining()
            long r8 = (long) r4
            long r6 = r6 + r8
            r11.g = r6
            java.lang.Long r4 = r11.f
            if (r4 != 0) goto L3f
            goto L50
        L3f:
            long r8 = r4.longValue()
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L50
            r10.b = r2
            java.lang.Object r11 = r11.e(r10)
            if (r11 != r0) goto Laa
            goto Lad
        L50:
            j$.time.Duration r2 = r5.c
            long r4 = r2.getSeconds()
            fdhl r6 = defpackage.fdhl.d
            long r4 = defpackage.fdhk.g(r4, r6)
            int r2 = r2.getNano()
            fdhl r6 = defpackage.fdhl.a
            long r6 = defpackage.fdhk.f(r2, r6)
            long r4 = defpackage.fdhi.j(r4, r6)
            dmas r2 = new dmas
            r6 = 0
            r2.<init>(r11, r1, r3, r6)
            r10.a = r1
            r11 = 2
            r10.b = r11
            long r3 = defpackage.fdkj.a(r4)
            java.lang.Object r11 = defpackage.fdna.c(r3, r2, r10)
            if (r11 == r0) goto Lad
            r0 = r1
        L80:
            fctx r11 = (defpackage.fctx) r11
            if (r11 != 0) goto Laa
            ekrg r11 = defpackage.dmaw.a
            ekrw r11 = r11.h()
            ekrz r1 = defpackage.eksq.a
            java.lang.String r2 = "HugoAudio"
            r11.X(r1, r2)
            r1 = 161(0xa1, float:2.26E-43)
            java.lang.String r2 = "MicrophoneAudioSource.kt"
            java.lang.String r3 = "com/google/android/libraries/compose/audio/source/MicrophoneAudioSource$consumeAudioDataBlocking$1"
            java.lang.String r4 = "invokeSuspend"
            ekrw r11 = r11.h(r3, r4, r1, r2)
            ekrd r11 = (defpackage.ekrd) r11
            j$.time.Instant r0 = (j$.time.Instant) r0
            long r0 = defpackage.eonu.a(r0)
            java.lang.String r2 = "Dropped buffer with timestamp %d microseconds."
            r11.s(r2, r0)
        Laa:
            fctx r11 = defpackage.fctx.a
            return r11
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmat.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmat(this.c, this.d, fcxyVar);
    }
}
