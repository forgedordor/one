package defpackage;

import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amux implements amvz {
    public final amuw a;
    private final amwf b;
    private final amwf c;
    private final List d;

    public amux(amwf amwfVar, amwf amwfVar2, amuw amuwVar, List list) {
        list.getClass();
        this.b = amwfVar;
        this.c = amwfVar2;
        this.a = amuwVar;
        this.d = list;
        if (amwfVar == null && amwfVar2 == null && amuwVar == null) {
            throw new IllegalStateException("One of title, description, or attachment must be provided.");
        }
    }

    @Override // defpackage.amvz
    public final /* synthetic */ amuz a() {
        return this.a;
    }

    @Override // defpackage.amvr
    public final String b() {
        return RbmSpecificMessage.CONTENT_TYPE;
    }

    @Override // defpackage.amvz
    public final amwf c() {
        return this.c;
    }

    @Override // defpackage.amvz
    public final amwf d() {
        return this.b;
    }

    @Override // defpackage.amvz
    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amux)) {
            return false;
        }
        amux amuxVar = (amux) obj;
        return fdbq.f(this.b, amuxVar.b) && fdbq.f(this.c, amuxVar.c) && fdbq.f(this.a, amuxVar.a) && fdbq.f(this.d, amuxVar.d);
    }

    public final int hashCode() {
        amwf amwfVar = this.b;
        int iHashCode = amwfVar == null ? 0 : amwfVar.hashCode();
        amwf amwfVar2 = this.c;
        int iHashCode2 = amwfVar2 == null ? 0 : amwfVar2.hashCode();
        int i = iHashCode * 31;
        amuw amuwVar = this.a;
        return ((((i + iHashCode2) * 31) + (amuwVar != null ? amuwVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BugleVerticalRichCardContent(title=" + this.b + ", description=" + this.c + ", attachment=" + this.a + ", suggestions=" + this.d + ")";
    }
}
