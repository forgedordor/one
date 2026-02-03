package defpackage;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myw {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack$StreamEventCallback b = new myv(this);
    final /* synthetic */ myx c;

    public myw(myx myxVar) {
        this.c = myxVar;
    }
}
