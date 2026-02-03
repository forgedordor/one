package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyuf extends dyuk {
    private final String a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;

    public dyuf(String str, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3) {
        this.a = str;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = ejwiVar3;
    }

    @Override // defpackage.dyuk
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dyuk
    public final ejwi b() {
        return this.d;
    }

    @Override // defpackage.dyuk
    public final ejwi c() {
        return this.c;
    }

    @Override // defpackage.dyuk
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyuk) {
            dyuk dyukVar = (dyuk) obj;
            if (this.a.equals(dyukVar.d()) && this.b.equals(dyukVar.a()) && this.c.equals(dyukVar.c()) && this.d.equals(dyukVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CustomHeaderContentFeature{title=" + this.a + ", subtitle=Optional.absent(), titleTypeface=Optional.absent(), subtitleTypeface=Optional.absent()}";
    }
}
