package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdju extends fcxs implements fdmv {
    public static final fdjt a = new fdjt();
    public final long b;

    public fdju(long j) {
        super(a);
        this.b = j;
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ Object a(fcyh fcyhVar) {
        fdjw fdjwVar = (fdjw) fcyhVar.get(fdjw.a);
        String str = fdjwVar != null ? fdjwVar.b : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iV = fdgn.V(name, " @");
        if (iV < 0) {
            iV = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iV + 10);
        String strSubstring = name.substring(0, iV);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.b);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.fdmv
    public final /* bridge */ /* synthetic */ void b(fcyh fcyhVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdju) && this.b == ((fdju) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.b + ")";
    }
}
