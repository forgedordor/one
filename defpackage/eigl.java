package defpackage;

import android.widget.SeekBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigl implements SeekBar.OnSeekBarChangeListener {
    boolean a;
    eieh b;
    final /* synthetic */ SeekBar.OnSeekBarChangeListener c;
    final /* synthetic */ String d = "com/google/android/apps/messaging/audio/attachment/AudioAttachmentView";
    final /* synthetic */ String e = "onFinishInflate";
    final /* synthetic */ String f = "AudioAttachmentView";
    final /* synthetic */ eigp g;

    public eigl(eigp eigpVar, SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.c = onSeekBarChangeListener;
        this.g = eigpVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (eidc.v() || !z) {
            this.c.onProgressChanged(seekBar, i, z);
            return;
        }
        if (this.a) {
            eieh eiehVarA = eidc.a(this.b);
            try {
                this.c.onProgressChanged(seekBar, i, true);
                return;
            } finally {
                eidc.a(eiehVarA);
            }
        }
        eieh eiehVarC = this.g.c(this.f.concat("#onProgressChanged"), this.d, this.e, 187);
        try {
            this.c.onProgressChanged(seekBar, i, true);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.a = true;
        if (eidc.v()) {
            eieu eieuVarK = eiiy.k(this.f.concat("#onStartTrackingTouch"));
            try {
                this.b = eieuVarK.a;
                this.c.onStartTrackingTouch(seekBar);
                eieuVarK.close();
                return;
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieh eiehVarC = this.g.c(this.f.concat("#onStartTrackingTouch"), this.d, this.e, 187);
        try {
            this.b = eiehVarC;
            this.c.onStartTrackingTouch(seekBar);
            eiehVarC.close();
        } catch (Throwable th3) {
            try {
                eiehVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a = false;
        eieh eiehVarA = eidc.a(this.b);
        try {
            this.c.onStopTrackingTouch(seekBar);
        } finally {
            eidc.a(eiehVarA);
            this.b = null;
        }
    }
}
