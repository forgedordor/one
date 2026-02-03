package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eemd {
    public float c;
    public WeakReference e;
    public eeqc f;
    private float g;
    public final TextPaint a = new TextPaint(1);
    public final eeqd b = new eemb(this);
    public boolean d = true;

    public eemd(eemc eemcVar) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(eemcVar);
    }

    public final float a(String str) {
        if (!this.d) {
            return this.g;
        }
        b(str);
        return this.g;
    }

    public final void b(String str) {
        this.g = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = str != null ? Math.abs(this.a.getFontMetrics().ascent) : 0.0f;
        this.d = false;
    }

    public final void c(eeqc eeqcVar, Context context) {
        if (this.f != eeqcVar) {
            this.f = eeqcVar;
            if (eeqcVar != null) {
                TextPaint textPaint = this.a;
                eeqd eeqdVar = this.b;
                eeqcVar.d(context, textPaint, eeqdVar);
                eemc eemcVar = (eemc) this.e.get();
                if (eemcVar != null) {
                    textPaint.drawableState = eemcVar.getState();
                }
                eeqcVar.c(context, textPaint, eeqdVar);
                this.d = true;
            }
            eemc eemcVar2 = (eemc) this.e.get();
            if (eemcVar2 != null) {
                eemcVar2.e();
                eemcVar2.onStateChange(eemcVar2.getState());
            }
        }
    }

    public final void e() {
        this.d = true;
    }
}
