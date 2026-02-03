package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adcm extends aak {
    public final eygg c;
    public final eygg d;
    public final ehbb e;
    public acwl f;
    public adcn g;
    public cvbc h;
    private final fcsu i;
    private adcu j;

    public adcm(fcsu fcsuVar, eygg eyggVar, eygg eyggVar2, ehbb ehbbVar) {
        super(0, 48);
        this.i = fcsuVar;
        this.c = eyggVar2;
        this.d = eyggVar;
        this.e = ehbbVar;
    }

    private final adcu r(int i) {
        if (this.h == null) {
            return null;
        }
        if (i == 4) {
            Map map = (Map) this.c.b();
            cvbb cvbbVarB = cvbb.b(this.h.c);
            if (cvbbVarB == null) {
                cvbbVarB = cvbb.ARCHIVE;
            }
            return (adcu) map.get(cvbbVarB);
        }
        if (i != 8) {
            return null;
        }
        Map map2 = (Map) this.c.b();
        cvbb cvbbVarB2 = cvbb.b(this.h.d);
        if (cvbbVarB2 == null) {
            cvbbVarB2 = cvbb.ARCHIVE;
        }
        return (adcu) map2.get(cvbbVarB2);
    }

    private final adcz s(int i) {
        adcu adcuVarR = r(i);
        if (adcuVarR == null) {
            return null;
        }
        return adcuVarR.a();
    }

    private final void t(wv wvVar, adcx adcxVar) {
        SelectedConversation selectedConversationJ = this.f.J(wvVar);
        if (selectedConversationJ != null) {
            adcxVar.c((addh) adcxVar.a.apply(selectedConversationJ));
        }
    }

    @Override // defpackage.aag
    public final float a(float f) {
        return f * 5.0f;
    }

    @Override // defpackage.aak, defpackage.aag
    public final int e(RecyclerView recyclerView, wv wvVar) {
        int iG;
        eieh eiehVarC = ((eigp) this.i.b()).c("GetSwipeActionFlag", "com/google/android/apps/messaging/home/swipeactions/ConversationSwipeCallback", "getMovementFlags", 108);
        try {
            int i = this.b;
            int iQ = q(recyclerView, wvVar);
            cvbc cvbcVar = this.h;
            if (cvbcVar == null || iQ == 0) {
                iG = g(i, 0);
            } else {
                cvbb cvbbVarB = cvbb.b(cvbcVar.c);
                if (cvbbVarB == null) {
                    cvbbVarB = cvbb.ARCHIVE;
                }
                cvbb cvbbVar = cvbb.NONE;
                int i2 = cvbbVarB != cvbbVar ? 4 : 0;
                cvbb cvbbVarB2 = cvbb.b(cvbcVar.d);
                if (cvbbVarB2 == null) {
                    cvbbVarB2 = cvbb.ARCHIVE;
                }
                if (cvbbVarB2 != cvbbVar) {
                    i2 |= 8;
                }
                iG = g(i, i2);
            }
            eiehVarC.close();
            return iG;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aag
    public final void h(Canvas canvas, RecyclerView recyclerView, wv wvVar, float f, float f2, int i, boolean z) {
        adcu adcuVar;
        adcu adcuVar2 = null;
        if (this.h != null) {
            if (f < 0.0f) {
                Map map = (Map) this.c.b();
                cvbb cvbbVarB = cvbb.b(this.h.c);
                if (cvbbVarB == null) {
                    cvbbVarB = cvbb.ARCHIVE;
                }
                adcuVar2 = (adcu) map.get(cvbbVarB);
            } else if (f > 0.0f) {
                Map map2 = (Map) this.c.b();
                cvbb cvbbVarB2 = cvbb.b(this.h.d);
                if (cvbbVarB2 == null) {
                    cvbbVarB2 = cvbb.ARCHIVE;
                }
                adcuVar2 = (adcu) map2.get(cvbbVarB2);
            }
        }
        if (adcuVar2 != null) {
            this.j = adcuVar2;
        }
        if (!this.g.a || (adcuVar = this.j) == null) {
            return;
        }
        adcuVar.a().b(canvas, recyclerView, wvVar, f, z);
        super.h(canvas, recyclerView, wvVar, f, f2, i, z);
    }

    @Override // defpackage.aag
    public final void i(wv wvVar, int i) {
        adcu adcuVarR = r(i);
        adcuVarR.getClass();
        if (this.g.a) {
            SelectedConversation selectedConversationJ = this.f.J(wvVar);
            if (selectedConversationJ != null) {
                adcuVarR.b(wvVar, selectedConversationJ);
            }
            View view = wvVar.a;
            view.setClipToOutline(false);
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
    }

    @Override // defpackage.aag
    public final boolean k() {
        adcn adcnVar = this.g;
        return adcnVar != null && adcnVar.a;
    }

    @Override // defpackage.aag
    public final boolean m(RecyclerView recyclerView, wv wvVar, wv wvVar2) {
        return false;
    }

    @Override // defpackage.aag
    public final void p(wv wvVar) {
        if (wvVar != null) {
            adcz adczVarS = s(16);
            if (adczVarS instanceof adcx) {
                t(wvVar, (adcx) adczVarS);
            }
            adcz adczVarS2 = s(32);
            if (adczVarS2 instanceof adcx) {
                t(wvVar, (adcx) adczVarS2);
            }
        }
    }

    @Override // defpackage.aak
    public final int q(RecyclerView recyclerView, wv wvVar) {
        int i = wvVar.f;
        if (i == 2 || i == 0 || i == 3) {
            return 0;
        }
        return this.a;
    }
}
