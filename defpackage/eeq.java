package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eeq {
    public static final /* synthetic */ int a = 0;

    static {
        int i = edx.b;
        int i2 = edw.a;
        int i3 = edu.a;
    }

    public static final ixk a(Iterator it, eew eewVar) {
        try {
            if (!(it instanceof edr)) {
                return (ixk) it.next();
            }
            eewVar.getClass();
            throw null;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.ics r19, defpackage.eci r20, defpackage.ecq r21, defpackage.icc r22, int r23, int r24, final defpackage.fdau r25, defpackage.hml r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeq.b(ics, eci, ecq, icc, int, int, fdau, hml, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01b4  */
    @defpackage.fcsv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ics r19, final defpackage.eci r20, final defpackage.ecq r21, final defpackage.icc r22, final int r23, final defpackage.efc r24, final defpackage.fdau r25, defpackage.hml r26, final int r27) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeq.c(ics, eci, ecq, icc, int, efc, fdau, hml, int):void");
    }

    public static final int d(ivt ivtVar, int i) {
        return ivtVar.c(i);
    }

    public static final int e(ivt ivtVar, int i) {
        return ivtVar.d(i);
    }

    public static final long f(ixk ixkVar, long j, fdap fdapVar) {
        if (egg.a(egg.b(ixkVar)) != 0.0f) {
            int iE = e(ixkVar, Alert.DURATION_SHOW_INDEFINITELY);
            return ctg.c(iE, d(ixkVar, iE));
        }
        egg.b(ixkVar);
        iyl iylVarE = ixkVar.e(j);
        fdapVar.invoke(iylVarE);
        return ctg.c(iylVarE.w(), iylVarE.v());
    }
}
