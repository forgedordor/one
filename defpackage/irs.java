package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irs {
    public final List a;
    public final irn b;
    public final int c;
    public final int d;
    public int e;

    public irs(List list) {
        this(list, null);
    }

    public final MotionEvent a() {
        irn irnVar = this.b;
        if (irnVar != null) {
            return irnVar.b.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public irs(java.util.List r7, defpackage.irn r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.a = r7
            r6.b = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r8 < r0) goto L19
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L19
            int r8 = defpackage.iy$$ExternalSyntheticApiModelOutline0.m(r8)
            goto L1a
        L19:
            r8 = r1
        L1a:
            r6.c = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L27
            int r8 = r8.getButtonState()
            goto L28
        L27:
            r8 = r1
        L28:
            r6.d = r8
            android.view.MotionEvent r8 = r6.a()
            if (r8 == 0) goto L33
            r8.getMetaState()
        L33:
            android.view.MotionEvent r8 = r6.a()
            r0 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L56
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L54
            if (r7 == r3) goto L52
            if (r7 == r2) goto L50
            switch(r7) {
                case 5: goto L54;
                case 6: goto L52;
                case 7: goto L50;
                case 8: goto L4e;
                case 9: goto L4c;
                case 10: goto L4a;
                default: goto L49;
            }
        L49:
            goto L73
        L4a:
            r1 = 5
            goto L73
        L4c:
            r1 = 4
            goto L73
        L4e:
            r1 = 6
            goto L73
        L50:
            r1 = r0
            goto L73
        L52:
            r1 = r2
            goto L73
        L54:
            r1 = r3
            goto L73
        L56:
            int r8 = r7.size()
        L5a:
            if (r1 >= r8) goto L50
            java.lang.Object r4 = r7.get(r1)
            ise r4 = (defpackage.ise) r4
            boolean r5 = defpackage.irt.f(r4)
            if (r5 == 0) goto L69
            goto L52
        L69:
            boolean r4 = defpackage.irt.d(r4)
            if (r4 == 0) goto L70
            goto L54
        L70:
            int r1 = r1 + 1
            goto L5a
        L73:
            r6.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irs.<init>(java.util.List, irn):void");
    }
}
