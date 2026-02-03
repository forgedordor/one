package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebnw extends ebob implements Cloneable {
    public Calendar a;

    public ebnw() {
        super("Date");
        this.a = Calendar.getInstance(DesugarTimeZone.getTimeZone("GMT"));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0116  */
    @Override // defpackage.ebob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebnw.a():java.lang.String");
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final Object clone() {
        ebnw ebnwVar = new ebnw();
        ebnwVar.a.setTime(this.a.getTime());
        return ebnwVar;
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }
}
