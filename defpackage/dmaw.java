package defpackage;

import android.media.AudioFormat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmaw implements dmai {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource");
    public final fcyh b;
    public final dmay c;
    public final fdue d;
    public final fduj e;
    public final Long f;
    public long g;
    public int h;
    private final fdjx i;
    private euwi j;
    private fdlr k;
    private boolean l;

    public dmaw(fdjx fdjxVar, fcyh fcyhVar, dmay dmayVar) {
        Long lValueOf;
        this.i = fdjxVar;
        this.b = fcyhVar;
        this.c = dmayVar;
        fdue fdueVarE = fdun.e(0, 0, 0, 5);
        this.d = fdueVarE;
        this.e = new fdug(fdueVarE);
        Duration duration = dmayVar.d;
        if (duration != null) {
            int i = dmayVar.a;
            long jA = eont.a(duration) * i * dmayVar.b;
            lValueOf = Long.valueOf((jA + jA) / 1000000);
        } else {
            lValueOf = null;
        }
        this.f = lValueOf;
    }

    private final void f() throws IllegalStateException, InterruptedException {
        if (this.l) {
            euwi euwiVar = this.j;
            if (euwiVar == null) {
                fdbq.c("microphoneHelper");
                euwiVar = null;
            }
            euwiVar.c();
            this.l = false;
        }
    }

    @Override // defpackage.dmai
    public final Object a(fcxy fcxyVar) throws IllegalStateException, InterruptedException {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "stop", 112, "MicrophoneAudioSource.kt")).q("Stopping MicrophoneAudioSource.");
        f();
        Object objFO = this.d.fO(new dlyn((byte[]) null), fcxyVar);
        return objFO == fcyl.a ? objFO : fctx.a;
    }

    @Override // defpackage.dlym
    public final Object b(fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "prepare", 78, "MicrophoneAudioSource.kt");
        StringBuilder sb = new StringBuilder("sampleRate = ");
        dmay dmayVar = this.c;
        int i = dmayVar.a;
        sb.append(i);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("channelCount = ");
        int i2 = dmayVar.b;
        sb2.append(i2);
        String string2 = sb2.toString();
        Duration duration = dmayVar.c;
        Objects.toString(duration);
        String strConcat = "outputTimeout = ".concat(duration.toString());
        Duration duration2 = dmayVar.d;
        Objects.toString(duration2);
        ekrdVar.t("Preparing MicrophoneAudioSource with configuration %s", fcur.S(new String[]{string, string2, "outputBufferCapacity = 0", strConcat, "maxDuration = ".concat(String.valueOf(duration2))}, null, null, null, 63));
        if (i2 != 1) {
            throw new IllegalArgumentException(a.e(i2, "Channel count ", " not supported."));
        }
        euwi euwiVar = new euwi(i, 16);
        this.j = euwiVar;
        euwiVar.a(new euvx() { // from class: dmar
            @Override // defpackage.euvx
            public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
                ShortBuffer shortBufferAsShortBuffer = byteBuffer.order(ByteOrder.nativeOrder()).asShortBuffer();
                shortBufferAsShortBuffer.getClass();
                while (true) {
                    dmaw dmawVar = this.a;
                    if (!shortBufferAsShortBuffer.hasRemaining()) {
                        byteBuffer.getClass();
                        fdim.a(dmawVar.b, new dmat(dmawVar, byteBuffer, null));
                        return;
                    } else {
                        int iAbs = Math.abs((int) shortBufferAsShortBuffer.get());
                        if (iAbs > dmawVar.h) {
                            dmawVar.h = iAbs;
                        }
                    }
                }
            }
        });
        return fctx.a;
    }

    @Override // defpackage.dlym
    public final Object c(fcxy fcxyVar) throws IllegalStateException, InterruptedException {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", "release", 118, "MicrophoneAudioSource.kt")).q("Releasing MicrophoneAudioSource.");
        f();
        Object objFO = this.d.fO(new dlyn((byte[]) null), fcxyVar);
        return objFO == fcyl.a ? objFO : fctx.a;
    }

    @Override // defpackage.dlym
    public final Object d(fcxy fcxyVar) throws UnsupportedOperationException, IllegalStateException {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/source/MicrophoneAudioSource", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 96, "MicrophoneAudioSource.kt")).q("Starting MicrophoneAudioSource.");
        if (!this.l) {
            euwi euwiVar = this.j;
            if (euwiVar == null) {
                fdbq.c("microphoneHelper");
                euwiVar = null;
            }
            euwiVar.b();
            this.l = true;
        }
        return fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.dmau
            if (r0 == 0) goto L13
            r0 = r9
            dmau r0 = (defpackage.dmau) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dmau r0 = new dmau
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r9)
            goto L81
        L28:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L30:
            defpackage.fctl.b(r9)
            fdlr r9 = r8.k
            if (r9 == 0) goto L3a
            fctx r9 = defpackage.fctx.a
            return r9
        L3a:
            ekrg r9 = defpackage.dmaw.a
            ekrw r9 = r9.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r5 = "HugoAudio"
            r9.X(r2, r5)
            r2 = 179(0xb3, float:2.51E-43)
            java.lang.String r5 = "MicrophoneAudioSource.kt"
            java.lang.String r6 = "com/google/android/libraries/compose/audio/source/MicrophoneAudioSource"
            java.lang.String r7 = "onMaxDurationReached"
            ekrw r9 = r9.h(r6, r7, r2, r5)
            ekrd r9 = (defpackage.ekrd) r9
            dmay r2 = r8.c
            j$.time.Duration r2 = r2.d
            if (r2 == 0) goto L65
            long r5 = r2.toMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            goto L66
        L65:
            r2 = r4
        L66:
            if (r2 == 0) goto L92
            java.lang.String r5 = "Max duration of %d ms reached, stopping recording."
            long r6 = r2.longValue()
            r9.s(r5, r6)
            fdue r9 = r8.d
            dlyn r2 = new dlyn
            r2.<init>(r4)
            r0.c = r3
            java.lang.Object r9 = r9.fO(r2, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            fdjx r9 = r8.i
            dmav r0 = new dmav
            r0.<init>(r8, r4)
            r1 = 3
            fdlr r9 = defpackage.fdil.d(r9, r4, r4, r0, r1)
            r8.k = r9
            fctx r9 = defpackage.fctx.a
            return r9
        L92:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot invoke onMaxDurationReached with 'null' maxDuration."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmaw.e(fcxy):java.lang.Object");
    }
}
