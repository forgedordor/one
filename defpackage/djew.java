package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djew {
    public final djrr a;
    public final fdae b;
    public final fdae c;
    public final String d;
    public final String e;
    public final boolean f;
    public final djev g;

    public djew(djrr djrrVar, fdae fdaeVar, fdae fdaeVar2, String str, String str2, boolean z, djev djevVar) {
        djrrVar.getClass();
        fdaeVar2.getClass();
        djevVar.getClass();
        this.a = djrrVar;
        this.b = fdaeVar;
        this.c = fdaeVar2;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = djevVar;
    }

    public static /* synthetic */ djew a(djew djewVar, djrr djrrVar, fdae fdaeVar, fdae fdaeVar2, String str, String str2, boolean z, djev djevVar, int i) {
        if ((i & 1) != 0) {
            djrrVar = djewVar.a;
        }
        djrr djrrVar2 = djrrVar;
        if ((i & 2) != 0) {
            fdaeVar = djewVar.b;
        }
        fdae fdaeVar3 = fdaeVar;
        if ((i & 4) != 0) {
            fdaeVar2 = djewVar.c;
        }
        fdae fdaeVar4 = fdaeVar2;
        if ((i & 8) != 0) {
            str = djewVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = djewVar.e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            z = djewVar.f;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            djevVar = djewVar.g;
        }
        djev djevVar2 = djevVar;
        djrrVar2.getClass();
        fdaeVar3.getClass();
        fdaeVar4.getClass();
        djevVar2.getClass();
        return new djew(djrrVar2, fdaeVar3, fdaeVar4, str3, str4, z2, djevVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djew)) {
            return false;
        }
        djew djewVar = (djew) obj;
        return this.a == djewVar.a && fdbq.f(this.b, djewVar.b) && fdbq.f(this.c, djewVar.c) && fdbq.f(this.d, djewVar.d) && fdbq.f(this.e, djewVar.e) && this.f == djewVar.f && fdbq.f(this.g, djewVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ComposeRowSendButtonUiData(icon=" + this.a + ", onSend=" + this.b + ", onScheduledSend=" + this.c + ", contentDescription=" + this.d + ", iconBottomLabel=" + this.e + ", enabled=" + this.f + ", flags=" + this.g + ")";
    }

    public /* synthetic */ djew(djrr djrrVar, fdae fdaeVar, fdae fdaeVar2, String str, boolean z, djev djevVar, int i) {
        this(djrrVar, fdaeVar, (i & 4) != 0 ? new fdae() { // from class: djet
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar2, (i & 8) != 0 ? null : str, (String) null, (!((i & 32) == 0)) | z, (i & 64) != 0 ? new djev(false, 3) : djevVar);
    }
}
