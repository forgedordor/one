package defpackage;

import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbr implements nce {
    public final ejxr a;
    public final ejxr b;

    public nbr(final int i) {
        ejxr ejxrVar = new ejxr() { // from class: nbp
            @Override // defpackage.ejxr
            public final Object get() {
                return new HandlerThread(nbs.d(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
            }
        };
        ejxr ejxrVar2 = new ejxr() { // from class: nbq
            @Override // defpackage.ejxr
            public final Object get() {
                return new HandlerThread(nbs.d(i, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.a = ejxrVar;
        this.b = ejxrVar2;
    }
}
