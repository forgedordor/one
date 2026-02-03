package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olk extends ojx {
    private String a;

    public olk(oky okyVar) {
        super(okyVar);
    }

    @Override // defpackage.ojx
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, ome.a);
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
        return obj != null && (obj instanceof olk) && super.equals(obj) && fdbq.f(this.a, ((olk) obj).a);
    }

    @Override // defpackage.ojx
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String j() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }
}
