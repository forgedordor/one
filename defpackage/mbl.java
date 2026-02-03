package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbl {
    public final Uri a;
    public final String b;
    public final mbi c;
    public final List e;
    public final ekgb g;
    public final Object h;
    public final long i;
    public final mbc d = null;
    public final String f = null;

    static {
        mgb.O(0);
        mgb.O(1);
        mgb.O(2);
        mgb.O(3);
        mgb.O(4);
        mgb.O(5);
        mgb.O(6);
        mgb.O(7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mbl(Uri uri, String str, mbi mbiVar, List list, ekgb ekgbVar, long j) {
        this.a = uri;
        this.b = mbw.f(str);
        this.c = mbiVar;
        this.e = list;
        this.g = ekgbVar;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        if (((ekoe) ekgbVar).c > 0) {
            throw null;
        }
        ekfwVar.g();
        this.h = null;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbl)) {
            return false;
        }
        mbl mblVar = (mbl) obj;
        if (this.a.equals(mblVar.a) && Objects.equals(this.b, mblVar.b) && Objects.equals(this.c, mblVar.c)) {
            mbc mbcVar = mblVar.d;
            if (Objects.equals(null, null) && this.e.equals(mblVar.e)) {
                String str = mblVar.f;
                if (Objects.equals(null, null) && ekjz.h(this.g, mblVar.g)) {
                    Object obj2 = mblVar.h;
                    if (Objects.equals(null, null) && this.i == mblVar.i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        return (int) (((((((iHashCode2 + (this.c != null ? r1.hashCode() : 0)) * 961) + this.e.hashCode()) * 961) + this.g.hashCode()) * 31 * 31) + this.i);
    }
}
