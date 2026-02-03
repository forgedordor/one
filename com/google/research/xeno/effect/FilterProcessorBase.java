package com.google.research.xeno.effect;

import defpackage.exkb;
import defpackage.exkd;
import defpackage.exko;
import defpackage.exky;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class FilterProcessorBase extends exky<Effect> {
    public volatile Effect a;

    protected FilterProcessorBase(exkb exkbVar) {
        super(exkbVar);
    }

    protected static native long nativeGetEventManager(long j);

    protected static native long nativeGetUserInteractionManager(long j);

    protected static native long nativeNewVideoProcessor(int i, long j, long j2, long[] jArr, long j3, byte[] bArr, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback, NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2, NativeCallbacks$AuxOutputCallback nativeCallbacks$AuxOutputCallback);

    public static native void nativeSendVideoProcessorAudioPacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeSetEffect(long j, long j2, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStartVideoProcessing(long j, int i, long j2, long j3, int i2, int i3, Callbacks$StatusCallback callbacks$StatusCallback);

    public static native void nativeStopVideoProcessing(long j, Callbacks$StatusCallback callbacks$StatusCallback);

    public final void b(Effect effect, Callbacks$StatusCallback callbacks$StatusCallback) {
        List listAsList = Arrays.asList(this, effect);
        exkd exkdVar = new exkd(this, callbacks$StatusCallback, effect);
        if (listAsList.isEmpty()) {
            exkdVar.a(null);
        } else {
            exko.b(listAsList, new long[listAsList.size()], exkdVar, 0);
        }
    }
}
