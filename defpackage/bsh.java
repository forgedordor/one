package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh extends bue {
    public final btv a;
    public final List b;

    public bsh(btv btvVar, List list) {
        if (btvVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.a = btvVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.b = list;
    }

    @Override // defpackage.bue
    public final btv a() {
        return this.a;
    }

    @Override // defpackage.bue
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bue) {
            bue bueVar = (bue) obj;
            if (this.a.equals(bueVar.a()) && this.b.equals(bueVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
