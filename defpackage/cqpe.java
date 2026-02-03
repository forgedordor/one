package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cqpe extends cqpt {
    private final String a;
    private final String b;
    private final Integer c;
    private final List d;

    public cqpe(String str, String str2, Integer num, List list) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
    }

    @Override // defpackage.cqpt
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.cqpt
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cqpt
    public final String c() {
        return this.a;
    }

    @Override // defpackage.cqpt
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqpt) {
            cqpt cqptVar = (cqpt) obj;
            String str = this.a;
            if (str != null ? str.equals(cqptVar.c()) : cqptVar.c() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(cqptVar.b()) : cqptVar.b() == null) {
                    Integer num = this.c;
                    if (num != null ? num.equals(cqptVar.a()) : cqptVar.a() == null) {
                        List list = this.d;
                        if (list != null ? list.equals(cqptVar.d()) : cqptVar.d() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        Integer num = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        List list = this.d;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TenorMedia{url=" + this.a + ", preview=" + this.b + ", size=" + this.c + ", dims=" + String.valueOf(this.d) + "}";
    }
}
