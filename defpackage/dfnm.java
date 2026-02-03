package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dfnm {
    dfmy a;
    dfnm b;
    boolean c;

    public final String toString() {
        String strA = this.a.a();
        boolean z = this.c;
        dfnm dfnmVar = this.b;
        return "state=" + strA + ",active=" + z + ",parent=" + (dfnmVar == null ? "null" : dfnmVar.a.a());
    }
}
