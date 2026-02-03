package com.google.android.apps.messaging.shared.audio.attachment.ui;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.aonh;
import defpackage.cogw;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class AudioPlaybackSeekBar extends aonh {
    public static final /* synthetic */ int d = 0;
    public cogw a;
    public long b;
    public final long c;

    public AudioPlaybackSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0L;
        this.c = 0L;
    }

    public final void a() {
        getProgress();
        this.b = 0L;
    }
}
