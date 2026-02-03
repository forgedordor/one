package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aftp {
    public final aftb a;
    public final List b;
    public final boolean c;

    public aftp() {
        this(false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aftp)) {
            return false;
        }
        aftp aftpVar = (aftp) obj;
        return fdbq.f(this.a, aftpVar.a) && fdbq.f(this.b, aftpVar.b) && this.c == aftpVar.c;
    }

    public final int hashCode() {
        aftb aftbVar = this.a;
        return ((((aftbVar == null ? 0 : aftbVar.hashCode()) * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationUiData(loadText=" + this.a + ", entries=" + this.b + ", loaded=" + this.c + ")";
    }

    public aftp(aftb aftbVar, List list, boolean z) {
        list.getClass();
        this.a = aftbVar;
        this.b = list;
        this.c = z;
    }

    public /* synthetic */ aftp(boolean z, int i) {
        this(null, (i & 2) != 0 ? fcvo.a : null, z & ((i & 4) == 0));
    }
}
