package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnl extends dhnh {
    public dhnj b;
    public List c;
    public String d;
    public Map e;
    public dhni f = dhni.NONE;

    public dhnl() {
    }

    @Override // defpackage.dhnh
    public final boolean equals(Object obj) {
        if (!(obj instanceof dhnl)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        dhnl dhnlVar = (dhnl) obj;
        List list = this.c;
        if (list == null) {
            if (dhnlVar.c != null) {
                return false;
            }
        } else if (!list.equals(dhnlVar.c)) {
            return false;
        }
        dhnj dhnjVar = this.b;
        if (dhnjVar == null) {
            if (dhnlVar.b != null) {
                return false;
            }
        } else if (!dhnjVar.equals(dhnlVar.b)) {
            return false;
        }
        if (this.f != dhnlVar.f) {
            return false;
        }
        Map map = this.e;
        if (map == null) {
            if (dhnlVar.e != null) {
                return false;
            }
        } else if (!map.equals(dhnlVar.e)) {
            return false;
        }
        String str = this.d;
        if (str != null || dhnlVar.d == null) {
            return str.equals(dhnlVar.d);
        }
        return false;
    }

    @Override // defpackage.dhnh
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        List list = this.c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        dhnj dhnjVar = this.b;
        int iHashCode3 = (iHashCode2 + (dhnjVar == null ? 0 : dhnjVar.hashCode())) * 31;
        dhni dhniVar = this.f;
        int iHashCode4 = (iHashCode3 + (dhniVar == null ? 0 : dhniVar.hashCode())) * 31;
        Map map = this.e;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public dhnl(String str) {
        this.d = str;
    }
}
