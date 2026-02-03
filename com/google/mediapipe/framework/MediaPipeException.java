package com.google.mediapipe.framework;

import defpackage.euxa;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MediaPipeException extends RuntimeException {
    public MediaPipeException(int i, String str) {
        super(euxa.values()[i].s + ": " + str);
        euxa euxaVar = euxa.values()[i];
    }

    MediaPipeException(int i, byte[] bArr) {
        this(i, new String(bArr, StandardCharsets.UTF_8));
    }
}
