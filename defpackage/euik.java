package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euik {
    public String a;
    public Long b;
    public euio c;
    public Long d;
    public Double e;
    public Long f;
    public byte[] g;
    public Bundle h;
    public int i;
    public int j;
    private Float k;

    public final euix a() {
        Bundle bundle = this.h;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle.deepCopy();
        Long l = this.b;
        if (l != null) {
            bundle2.putLong("textclassifier.extras.DATETIME_MS_UTC", l.longValue());
        }
        euio euioVar = this.c;
        if (euioVar != null) {
            bundle2.putInt("textclassifier.extras.DATETIME_GRANULARITY", euioVar.i);
        }
        Long l2 = this.d;
        if (l2 != null) {
            bundle2.putLong("textclassifier.extras.NUMERIC_VALUE", l2.longValue());
        }
        Double d = this.e;
        if (d != null) {
            bundle2.putDouble("textclassifier.extras.NUMERIC_DOUBLE_VALUE", d.doubleValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            bundle2.putLong("textclassifier.extras.DURATION_MS", l3.longValue());
        }
        byte[] bArr = this.g;
        if (bArr != null) {
            bundle2.putByteArray("textclassifier.extras.EXTRA_SERIALIZED_ENTITY_DATA", bArr);
        }
        return new euix(this.a, this.k, this.i, this.j, bundle2);
    }

    public final void b(float f) {
        this.k = Float.valueOf(f);
    }
}
