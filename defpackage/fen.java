package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fen implements fdpm {
    final /* synthetic */ fft a;

    public fen(fft fftVar) {
        this.a = fftVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            fft fftVar = this.a;
            fftVar.a().startStylusHandwriting(fftVar.a);
        }
        return fctx.a;
    }
}
