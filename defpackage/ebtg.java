package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtg implements ExpressiveTextCallbackReceiver {
    public static final ebte a = ebte.a;
    public static final ebtd b = ebtd.a;
    public static final int c = -1;
    public static final int d = -1;
    public static final int p = 1;
    public int i;
    public int j;
    public Float k;
    public Rect l;
    public long n;
    public ebtf o;
    public ebte e = a;
    public ebtd f = b;
    public int g = -1;
    public int q = 1;
    public int h = -1;
    public String m = "";

    private static final int h(float f) {
        return Math.min(Math.max((int) (f * 255.0f), 0), 255);
    }

    public final void a(int i) {
        if (this.g == i) {
            return;
        }
        this.g = i;
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            ebtfVar.d(this);
        }
    }

    public final void b(ebtd ebtdVar) {
        ebtdVar.getClass();
        if (this.f == ebtdVar) {
            return;
        }
        this.f = ebtdVar;
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            ebtfVar.d(this);
        }
    }

    public final void c(int i) {
        czpu czpuVar;
        boolean zB;
        if (this.i != i && i >= 0) {
            this.i = i;
            ebtf ebtfVar = this.o;
            if (ebtfVar == null || czpuVar.p == (zB = (czpuVar = (czpu) ebtfVar).b())) {
                return;
            }
            czpuVar.p = zB;
            einf.f(new czpc(), czpuVar.a);
        }
    }

    public final void d(ebte ebteVar) {
        ebteVar.getClass();
        if (this.e == ebteVar) {
            return;
        }
        this.e = ebteVar;
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            ebtfVar.e(this);
        }
    }

    public final void e(int i) {
        if (this.j != i && i >= 0) {
            this.j = i;
            ebtf ebtfVar = this.o;
            if (ebtfVar != null) {
                czpu czpuVar = (czpu) ebtfVar;
                View view = czpuVar.a.Q;
                view.getClass();
                Button button = (Button) view.findViewById(R.id.cancel_or_undo_button);
                ebtg ebtgVar = czpuVar.d;
                if (ebtgVar.e != ebte.b || ebtgVar.j <= 0) {
                    button.setText(android.R.string.cancel);
                } else {
                    button.setText(R.string.undo);
                }
            }
        }
    }

    public final void f(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            czpu czpuVar = (czpu) ebtfVar;
            czpuVar.l.setTextColor(i);
            czpuVar.c(i);
        }
    }

    public final void g(int i) {
        if (this.q == i) {
            return;
        }
        this.q = i;
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            ((czpu) ebtfVar).i(this);
        }
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onElementCountChanged(int i) {
        c(i);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeElementCountChanged(int i) {
        e(i);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeEnd() {
        g(1);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onStrokeStart() {
        g(3);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTextElementTapped() {
        ebtf ebtfVar = this.o;
        if (ebtfVar != null) {
            ((czpu) ebtfVar).c.b().b(ebte.c);
        }
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformEnd(float f, float f2) {
        g(1);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformStart(float f, float f2) {
        g(2);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void onTransformUpdate(float f, float f2) {
        g(2);
    }

    @Override // com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextCallbackReceiver
    @UsedByNative
    public void showTextEditingInterface(long j, String str, float f, float f2, float f3, float f4) {
        str.getClass();
        this.n = j;
        this.m = str;
        f(Color.argb(h(f4), h(f), h(f2), h(f3)));
        d(ebte.c);
    }
}
