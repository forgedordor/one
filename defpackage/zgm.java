package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgm implements dlhu {
    public final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final fdae f;

    public zgm(String str, String str2, String str3, String str4, String str5, fdae fdaeVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
        this.e = str5;
        this.f = fdaeVar;
    }

    @Override // defpackage.dlhu
    public final fdae a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgm)) {
            return false;
        }
        zgm zgmVar = (zgm) obj;
        return fdbq.f(this.b, zgmVar.b) && fdbq.f(this.c, zgmVar.c) && fdbq.f(this.d, zgmVar.d) && fdbq.f(this.a, zgmVar.a) && fdbq.f(this.e, zgmVar.e) && fdbq.f(this.f, zgmVar.f);
    }

    public final int hashCode() {
        return (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "YoutubePreviewUiData(name=" + this.b + ", description=" + this.c + ", source=" + this.d + ", videoId=" + this.a + ", imageContentDescription=" + this.e + ", onClick=" + this.f + ")";
    }
}
