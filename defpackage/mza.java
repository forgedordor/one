package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mza {
    final /* synthetic */ mzb a;

    public mza(mzb mzbVar) {
        this.a = mzbVar;
    }

    public final void a(final Exception exc) {
        mff.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        final mxt mxtVar = this.a.j;
        Handler handler = mxtVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: mxo
                @Override // java.lang.Runnable
                public final void run() {
                    String str = mgb.a;
                    mwk mwkVar = (mwk) mxtVar.b.a.j;
                    mwkVar.J(mwkVar.I(), 1014, new mez() { // from class: mwe
                        @Override // defpackage.mez
                        public final void a(Object obj) {
                        }
                    });
                }
            });
        }
    }
}
