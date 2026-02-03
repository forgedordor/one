package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynk {
    public final Context a;
    public final aprc b;
    public final fcsu c;
    public final ardd d;
    private final cqjk e;
    private final cpga f;

    public ynk(Context context, cqjk cqjkVar, cpga cpgaVar, aprc aprcVar, fcsu fcsuVar, ardd arddVar) {
        context.getClass();
        cqjkVar.getClass();
        cpgaVar.getClass();
        aprcVar.getClass();
        fcsuVar.getClass();
        this.a = context;
        this.e = cqjkVar;
        this.f = cpgaVar;
        this.b = aprcVar;
        this.c = fcsuVar;
        this.d = arddVar;
    }

    public static final boolean b(ajlt ajltVar) {
        return ajltVar.d().d() == 2;
    }

    private static final String c(ajlt ajltVar) {
        ajmc ajmcVarD = ajltVar.d();
        if (!(ajmcVarD instanceof ajlr)) {
            return null;
        }
        ResolvedRecipient resolvedRecipientA = ((ajlr) ajmcVarD).a();
        if (resolvedRecipientA.y() == null) {
            return resolvedRecipientA.x(true);
        }
        alqj alqjVarF = resolvedRecipientA.g().F();
        String strY = resolvedRecipientA.y();
        strY.getClass();
        return alqjVarF + " " + chsk.a(strY);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(defpackage.ajlt r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynk.a(ajlt):java.lang.String");
    }
}
