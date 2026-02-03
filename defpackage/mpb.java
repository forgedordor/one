package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mpb {
    public mpa a;
    public mac b;
    public int c;
    private final ejxr e;
    private final Handler f;
    private mdf h;
    public float d = 1.0f;
    private int g = 0;

    public mpb(final Context context, Looper looper, mpa mpaVar) {
        this.e = ejxx.a(new ejxr() { // from class: moz
            @Override // defpackage.ejxr
            public final Object get() {
                return mdh.a(context);
            }
        });
        this.a = mpaVar;
        this.f = new Handler(looper);
    }

    public final int a(boolean z, int i) {
        if (i == 1 || this.c != 1) {
            b();
            d(0);
            return 1;
        }
        if (!z) {
            int i2 = this.g;
            if (i2 != 1) {
                return i2 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.g == 2) {
            return 1;
        }
        if (this.h == null) {
            mac macVar = mac.a;
            boolean zE = e();
            mac macVar2 = this.b;
            mee.f(macVar2);
            this.h = new mdf(new AudioManager.OnAudioFocusChangeListener() { // from class: moy
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i3) {
                    mpb mpbVar = this.a;
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2 && !mpbVar.e()) {
                            mpbVar.d(4);
                            return;
                        } else {
                            mpbVar.c(0);
                            mpbVar.d(3);
                            return;
                        }
                    }
                    if (i3 == -1) {
                        mpbVar.c(-1);
                        mpbVar.b();
                        mpbVar.d(1);
                    } else if (i3 != 1) {
                        mff.f("AudioFocusManager", a.g(i3, "Unknown focus change type: "));
                    } else {
                        mpbVar.d(2);
                        mpbVar.c(1);
                    }
                }
            }, this.f, macVar2, zE);
        }
        if (((AudioManager) this.e.get()).requestAudioFocus(this.h.a()) == 1) {
            d(2);
            return 1;
        }
        d(1);
        return -1;
    }

    public final void b() {
        int i = this.g;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        ((AudioManager) this.e.get()).abandonAudioFocusRequest(this.h.a());
    }

    public final void c(int i) {
        mpa mpaVar = this.a;
        if (mpaVar != null) {
            ((mry) mpaVar).e.e(33, i, 0).b();
        }
    }

    public final void d(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.d != f) {
            this.d = f;
            mpa mpaVar = this.a;
            if (mpaVar != null) {
                ((mry) mpaVar).e.j(34);
            }
        }
    }

    public final boolean e() {
        mac macVar = this.b;
        return macVar != null && macVar.b == 1;
    }
}
