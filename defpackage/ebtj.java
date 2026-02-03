package defpackage;

import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtj {
    public final ExpressiveTextContext a;
    public final ebtg b;
    public int c = -1;

    public ebtj(ExpressiveTextContext expressiveTextContext, ebtg ebtgVar) {
        this.a = expressiveTextContext;
        this.b = ebtgVar;
    }

    public final void a(int i, int i2, int i3, int i4) throws Throwable {
        ExpressiveTextContext expressiveTextContext = this.a;
        if (expressiveTextContext.p()) {
            expressiveTextContext.h(i, i2, i3, i4);
        }
    }

    public final void b(ebte ebteVar) {
        ebteVar.getClass();
        ExpressiveTextContext expressiveTextContext = this.a;
        if (expressiveTextContext.p()) {
            this.b.d(expressiveTextContext.c(ebteVar));
        }
    }
}
