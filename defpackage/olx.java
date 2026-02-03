package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olx extends ojx {
    public String a;

    public olx(oky okyVar) {
        super(okyVar);
    }

    @Override // defpackage.ojx
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ome.b);
        typedArrayObtainAttributes.getClass();
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            this.a = string;
        }
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.ojx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof olx) && super.equals(obj) && fdbq.f(this.a, ((olx) obj).a);
    }

    @Override // defpackage.ojx
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.ojx
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        return sb.toString();
    }
}
