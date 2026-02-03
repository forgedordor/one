package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyrm extends dyrj {
    public final dxxk a;
    public final dyvi b;
    public final dxyj c;
    public final View.OnClickListener d;

    public dyrm(dxxk dxxkVar, dyvi dyviVar, dxyj dxyjVar, View.OnClickListener onClickListener) {
        this.a = dxxkVar;
        this.b = dyviVar;
        this.c = dxyjVar;
        this.d = onClickListener;
    }

    @Override // defpackage.dyrj
    public final View.OnClickListener a() {
        return this.d;
    }

    @Override // defpackage.dyrj
    public final dxxk b() {
        return this.a;
    }

    @Override // defpackage.dyrj
    public final dxyj c() {
        return this.c;
    }

    @Override // defpackage.dyrj
    public final dyvi d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dyvi dyviVar;
        dxyj dxyjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyrj) {
            dyrj dyrjVar = (dyrj) obj;
            if (this.a.equals(dyrjVar.b()) && ((dyviVar = this.b) != null ? dyviVar.equals(dyrjVar.d()) : dyrjVar.d() == null) && ((dxyjVar = this.c) != null ? dxyjVar.equals(dyrjVar.c()) : dyrjVar.c() == null) && this.d.equals(dyrjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        dyvi dyviVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (dyviVar == null ? 0 : dyviVar.hashCode())) * 1000003;
        dxyj dxyjVar = this.c;
        return ((iHashCode2 ^ (dxyjVar != null ? dxyjVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        View.OnClickListener onClickListener = this.d;
        dxyj dxyjVar = this.c;
        dyvi dyviVar = this.b;
        return "AccountLayer{accountConverter=" + this.a.toString() + ", avatarRetriever=" + String.valueOf(dyviVar) + ", avatarImageLoader=" + String.valueOf(dxyjVar) + ", onAddAccount=" + onClickListener.toString() + "}";
    }
}
