package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzde extends cpyr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzde(String str, String str2, int i) {
        super(i, cpyz.SKIP, str + " row " + str2 + " intentionally skipped during CMS backup");
        str2.getClass();
    }

    public final boolean equals(Object obj) {
        bzde bzdeVar = obj instanceof bzde ? (bzde) obj : null;
        if (bzdeVar == null) {
            return false;
        }
        return fdbq.f(getMessage(), bzdeVar.getMessage());
    }

    public /* synthetic */ bzde(String str) {
        this("Participant", str, 7);
    }
}
