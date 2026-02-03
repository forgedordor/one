package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdd extends cpyr {
    public bzdd(String str) {
        super(11, cpyz.NO_RETRY, a.a(str, "Could not find row with Id ", " for backup"));
    }

    @Override // defpackage.cpza
    public final int a() {
        return 2;
    }

    public bzdd(String str, fcsu fcsuVar) {
        this(str);
        Long lH = fdgn.h(str);
        if (lH != null) {
            bypl byplVar = (bypl) fcsuVar.b();
            auvw.k(byplVar.g, null, null, new bypj(byplVar, lH.longValue(), null), 3);
        }
    }
}
