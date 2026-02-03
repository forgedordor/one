package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxyf extends dxyz {
    private final Drawable a;
    private final String b;
    private final dxza c;

    public dxyf(Drawable drawable, String str, dxza dxzaVar) {
        if (drawable == null) {
            throw new NullPointerException("Null data");
        }
        this.a = drawable;
        this.b = str;
        if (dxzaVar == null) {
            throw new NullPointerException("Null badgeType");
        }
        this.c = dxzaVar;
    }

    @Override // defpackage.dxyz
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.dxyz
    public final dxza b() {
        return this.c;
    }

    @Override // defpackage.dxyz
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxyz) {
            dxyz dxyzVar = (dxyz) obj;
            if (this.a.equals(dxyzVar.a()) && ((str = this.b) != null ? str.equals(dxyzVar.c()) : dxyzVar.c() == null) && this.c.equals(dxyzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dxza dxzaVar = this.c;
        return "BadgeContent{data=" + this.a.toString() + ", contentDescription=" + this.b + ", badgeType=" + dxzaVar.toString() + "}";
    }
}
