package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgu {
    public static final fgu a = new fgu(null, null);
    public final ivy b;
    public final jyi c;

    public fgu(ivy ivyVar, jyi jyiVar) {
        this.b = ivyVar;
        this.c = jyiVar;
    }

    public static /* synthetic */ fgu a(fgu fguVar, ivy ivyVar, jyi jyiVar, int i) {
        if ((i & 1) != 0) {
            ivyVar = fguVar.b;
        }
        if ((i & 2) != 0) {
            jyiVar = fguVar.c;
        }
        return new fgu(ivyVar, jyiVar);
    }
}
