package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqw {
    public final List a;
    public final zqy b;
    public final boolean c;
    public final Boolean d;
    private final fctc e;

    public zqw() {
        this(null, 15);
    }

    public final zqx a() {
        return (zqx) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqw)) {
            return false;
        }
        zqw zqwVar = (zqw) obj;
        return fdbq.f(this.a, zqwVar.a) && fdbq.f(this.b, zqwVar.b) && this.c == zqwVar.c && fdbq.f(this.d, zqwVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zqy zqyVar = this.b;
        int iHashCode2 = (((iHashCode + (zqyVar == null ? 0 : zqyVar.hashCode())) * 31) + (true != this.c ? 1237 : 1231)) * 31;
        Boolean bool = this.d;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SelectionData(messages=" + this.a + ", offset=" + this.b + ", isOnFirstSelection=" + this.c + ", isSpatulaSettingsEnabled=" + this.d + ")";
    }

    public zqw(List list, zqy zqyVar, boolean z, Boolean bool) {
        list.getClass();
        this.a = list;
        this.b = zqyVar;
        this.c = z;
        this.d = bool;
        this.e = fctd.a(new fdae() { // from class: zqv
            @Override // defpackage.fdae
            public final Object invoke() {
                Boolean bool2;
                zqw zqwVar = this.a;
                List list2 = zqwVar.a;
                boolean z2 = false;
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        amvr amvrVarG = ((ajlt) it.next()).g();
                        if (crtr.e() && (bool2 = zqwVar.d) != null && bool2.booleanValue() && (amvrVarG instanceof amvy)) {
                            amvy amvyVar = (amvy) amvrVarG;
                            if (amvyVar.h() == amvx.HIDE_AND_ALLOW_SHOWING || amvyVar.h() == amvx.HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                int size = list2.size();
                return size != 0 ? size != 1 ? z2 ? zqx.e : zqx.c : z2 ? zqx.d : zqx.b : zqx.a;
            }
        });
    }

    public /* synthetic */ zqw(List list, int i) {
        this((i & 1) != 0 ? fcvo.a : list, null, false, null);
    }
}
