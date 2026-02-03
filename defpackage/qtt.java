package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtt implements qto {
    public final boolean a;
    public final int b;

    public qtt(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        if (qofVar.i) {
            return new qph(this);
        }
        qws.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        int i = this.b;
        return a.a(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE", "MergePaths{mode=", "}");
    }
}
