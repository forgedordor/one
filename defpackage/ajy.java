package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajy extends ajn {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final ajx e;
    public final ajt f;
    public final ajv g;
    public final ajw h;
    public final aju j;
    private Integer l;
    public final String i = "";
    private final boolean k = false;

    public ajy(String str, int i, int i2, String str2, ajx ajxVar, ajt ajtVar, ajv ajvVar, ajw ajwVar, aju ajuVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = ajxVar;
        this.f = ajtVar;
        this.g = ajvVar;
        this.h = ajwVar;
        this.j = ajuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajy)) {
            return false;
        }
        ajy ajyVar = (ajy) obj;
        if (!Objects.equals(this.a, ajyVar.a) || !Objects.equals(this.i, ajyVar.i) || !Objects.equals(Integer.valueOf(this.b), Integer.valueOf(ajyVar.b)) || !Objects.equals(Integer.valueOf(this.c), Integer.valueOf(ajyVar.c)) || !Objects.equals(this.d, ajyVar.d) || !Objects.equals(this.e, ajyVar.e) || !Objects.equals(this.f, ajyVar.f) || !Objects.equals(this.g, ajyVar.g) || !Objects.equals(this.h, ajyVar.h) || !Objects.equals(this.j, ajyVar.j)) {
            return false;
        }
        boolean z = ajyVar.k;
        return true;
    }

    public final int hashCode() {
        if (this.l == null) {
            this.l = Integer.valueOf(Objects.hash(this.a, this.i, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.j, false));
        }
        return this.l.intValue();
    }

    public final String toString() {
        return "{name: " + this.a + ", description: " + this.i + ", dataType: " + this.b + ", cardinality: " + this.c + ", schemaType: " + this.d + ", stringIndexingConfigParcel: " + this.e + ", documentIndexingConfigParcel: " + this.f + ", integerIndexingConfigParcel: " + this.g + ", joinableConfigParcel: " + this.h + ", embeddingIndexingConfigParcel: " + this.j + ", isScoringEnabled: false}";
    }
}
