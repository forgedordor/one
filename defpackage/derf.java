package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derf implements denw {
    private final String a;
    private final String b;

    public derf(denw denwVar) {
        this.a = denwVar.b();
        this.b = denwVar.a();
    }

    @Override // defpackage.denw
    public final String a() {
        return this.b;
    }

    @Override // defpackage.denw
    public final String b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.dcjo
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
