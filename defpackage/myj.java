package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myj {
    public static void a(AudioTrack audioTrack, mxe mxeVar) {
        audioTrack.setPreferredDevice(mxeVar == null ? null : mxeVar.a);
    }
}
