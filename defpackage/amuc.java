package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuc implements amvz {
    public final amub a;
    public final int b;
    private final amwf c;
    private final amwf d;
    private final List e;

    public amuc(amwf amwfVar, amwf amwfVar2, amub amubVar, List list, int i) {
        list.getClass();
        this.c = amwfVar;
        this.d = amwfVar2;
        this.a = amubVar;
        this.e = list;
        this.b = i;
        if (amwfVar == null && amwfVar2 == null && amubVar == null) {
            throw new IllegalStateException("One of title, description, or attachment must be provided.");
        }
        if (amubVar != null && amwfVar == null && amwfVar2 == null && list.isEmpty()) {
            throw new IllegalStateException("Horizontal rich card cannot only have an attachment.");
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
        return this.d;
    }

    @Override // defpackage.amvz
    public final amwf d() {
        return this.c;
    }

    @Override // defpackage.amvz
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amuc)) {
            return false;
        }
        amuc amucVar = (amuc) obj;
        return fdbq.f(this.c, amucVar.c) && fdbq.f(this.d, amucVar.d) && fdbq.f(this.a, amucVar.a) && fdbq.f(this.e, amucVar.e) && this.b == amucVar.b;
    }

    public final int hashCode() {
        amwf amwfVar = this.c;
        int iHashCode = amwfVar == null ? 0 : amwfVar.hashCode();
        amwf amwfVar2 = this.d;
        int iHashCode2 = amwfVar2 == null ? 0 : amwfVar2.hashCode();
        int i = iHashCode * 31;
        amub amubVar = this.a;
        return ((((((i + iHashCode2) * 31) + (amubVar != null ? amubVar.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BugleHorizontalRichCardContent(title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", attachment=");
        sb.append(this.a);
        sb.append(", suggestions=");
        sb.append(this.e);
        sb.append(", alignment=");
        sb.append((Object) (this.b != 1 ? VCardConstants.PROPERTY_END : "START"));
        sb.append(")");
        return sb.toString();
    }
}
