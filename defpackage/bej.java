package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bej extends bfy {
    public final btb a;
    public final btb b;
    public final int c;
    public final List d;

    public bej(btb btbVar, btb btbVar2, int i, List list) {
        this.a = btbVar;
        this.b = btbVar2;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.bfy
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bfy
    public final btb b() {
        return this.a;
    }

    @Override // defpackage.bfy
    public final btb c() {
        return this.b;
    }

    @Override // defpackage.bfy
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bfy) {
            bfy bfyVar = (bfy) obj;
            if (this.a.equals(bfyVar.b()) && this.b.equals(bfyVar.c()) && this.c == bfyVar.a() && this.d.equals(bfyVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
