package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbo {
    public final String a;
    public final mbl b;
    public final mbk c;
    public final mbr d;
    public final mbf e;
    public final mbm f;

    static {
        new mbd().a();
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
    }

    public mbo(String str, mbg mbgVar, mbl mblVar, mbk mbkVar, mbr mbrVar, mbm mbmVar) {
        this.a = str;
        this.b = mblVar;
        this.c = mbkVar;
        this.d = mbrVar;
        this.e = mbgVar;
        this.f = mbmVar;
    }

    public static mbo a(Uri uri) {
        mbd mbdVar = new mbd();
        mbdVar.a = uri;
        return mbdVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbo)) {
            return false;
        }
        mbo mboVar = (mbo) obj;
        return Objects.equals(this.a, mboVar.a) && this.e.equals(mboVar.e) && Objects.equals(this.b, mboVar.b) && Objects.equals(this.c, mboVar.c) && Objects.equals(this.d, mboVar.d) && Objects.equals(this.f, mboVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        mbl mblVar = this.b;
        return (((((((iHashCode + (mblVar != null ? mblVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
