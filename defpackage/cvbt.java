package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SwipeActionPreference;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbt {
    public final cvbp a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public Optional e = Optional.empty();
    public cvbc f;

    public cvbt(cvbp cvbpVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = cvbpVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final void a(final int i, final int i2, int i3, int i4, int i5, int i6, int i7) {
        cvbp cvbpVar = this.a;
        SwipeActionPreference swipeActionPreference = (SwipeActionPreference) cvbpVar.a(cvbpVar.Y(i));
        swipeActionPreference.getClass();
        if (swipeActionPreference.U()) {
            cvbb cvbbVar = cvbb.ARCHIVE;
            swipeActionPreference.a = i2;
            swipeActionPreference.b = i3;
            swipeActionPreference.c = i4;
            swipeActionPreference.d = i5;
            swipeActionPreference.e = i6;
            swipeActionPreference.f = i7;
            swipeActionPreference.k(cvbbVar);
            swipeActionPreference.o = new ozb() { // from class: cvbr
                /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
                @Override // defpackage.ozb
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean a(androidx.preference.Preference r9) {
                    /*
                        r8 = this;
                        cvbt r9 = r8.a
                        j$.util.Optional r0 = r9.e
                        boolean r0 = r0.isEmpty()
                        if (r0 == 0) goto L99
                        int r0 = r3
                        int r6 = r2
                        fcsu r1 = r9.b
                        java.lang.Object r1 = r1.b()
                        cvbo r1 = (defpackage.cvbo) r1
                        cvbp r2 = r9.a
                        fcsu r3 = r1.a
                        java.lang.String r7 = r2.Y(r0)
                        r0 = r1
                        cvbn r1 = new cvbn
                        java.lang.Object r2 = r3.b()
                        android.content.Context r2 = (android.content.Context) r2
                        r2.getClass()
                        fcsu r3 = r0.b
                        java.lang.Object r3 = r3.b()
                        cvbm r3 = (defpackage.cvbm) r3
                        fcsu r4 = r0.c
                        java.lang.Object r4 = r4.b()
                        eigp r4 = (defpackage.eigp) r4
                        r4.getClass()
                        fcsu r0 = r0.d
                        java.lang.Object r0 = r0.b()
                        r5 = r0
                        ains r5 = (defpackage.ains) r5
                        r5.getClass()
                        r7.getClass()
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        cvbc r0 = r9.f
                        if (r0 == 0) goto L70
                        r2 = 2132088033(0x7f1514e1, float:1.9816338E38)
                        if (r6 != r2) goto L63
                        int r0 = r0.c
                        cvbb r0 = defpackage.cvbb.b(r0)
                        if (r0 != 0) goto L72
                        cvbb r0 = defpackage.cvbb.ARCHIVE
                        goto L72
                    L63:
                        r2 = 2132088035(0x7f1514e3, float:1.9816342E38)
                        if (r6 != r2) goto L70
                        int r0 = r0.d
                        cvbb r0 = defpackage.cvbb.b(r0)
                        if (r0 != 0) goto L72
                    L70:
                        cvbb r0 = defpackage.cvbb.ARCHIVE
                    L72:
                        cvbb[] r2 = defpackage.cvbm.d()
                        r3 = 0
                    L77:
                        r4 = 4
                        if (r3 >= r4) goto L84
                        r4 = r2[r3]
                        if (r0 != r4) goto L81
                        r1.d = r3
                        goto L84
                    L81:
                        int r3 = r3 + 1
                        goto L77
                    L84:
                        r1.c()
                        j$.util.Optional r0 = j$.util.Optional.of(r1)
                        r9.e = r0
                        iv r0 = r1.f
                        if (r0 == 0) goto L99
                        cvbs r1 = new cvbs
                        r1.<init>()
                        r0.setOnDismissListener(r1)
                    L99:
                        r9 = 1
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cvbr.a(androidx.preference.Preference):boolean");
                }
            };
        }
    }
}
