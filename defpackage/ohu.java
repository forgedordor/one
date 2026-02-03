package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ohu extends ojx {
    public Intent a;
    public String b;

    public ohu(oky okyVar) {
        super(okyVar);
    }

    private static final String j(Context context, String str) {
        if (str == null) {
            return null;
        }
        String packageName = context.getPackageName();
        packageName.getClass();
        return fdgn.q(str, "${applicationId}", packageName);
    }

    @Override // defpackage.ojx
    public final void a(Context context, AttributeSet attributeSet) {
        super.a(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, old.a);
        typedArrayObtainAttributes.getClass();
        String strJ = j(context, typedArrayObtainAttributes.getString(4));
        if (this.a == null) {
            this.a = new Intent();
        }
        Intent intent = this.a;
        intent.getClass();
        intent.setPackage(strJ);
        String string = typedArrayObtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = String.valueOf(context.getPackageName()).concat(string);
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.a == null) {
                this.a = new Intent();
            }
            Intent intent2 = this.a;
            intent2.getClass();
            intent2.setComponent(componentName);
        }
        String string2 = typedArrayObtainAttributes.getString(1);
        if (this.a == null) {
            this.a = new Intent();
        }
        Intent intent3 = this.a;
        intent3.getClass();
        intent3.setAction(string2);
        String strJ2 = j(context, typedArrayObtainAttributes.getString(2));
        if (strJ2 != null) {
            Uri uri = Uri.parse(strJ2);
            if (this.a == null) {
                this.a = new Intent();
            }
            Intent intent4 = this.a;
            intent4.getClass();
            intent4.setData(uri);
        }
        this.b = j(context, typedArrayObtainAttributes.getString(3));
        typedArrayObtainAttributes.recycle();
    }

    @Override // defpackage.ojx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ojx
    public final boolean equals(Object obj) {
        Intent intent;
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof ohu) && super.equals(obj) && ((intent = this.a) == null ? ((ohu) obj).a == null : intent.filterEquals(((ohu) obj).a)) && fdbq.f(this.b, ((ohu) obj).b);
    }

    @Override // defpackage.ojx
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.a;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.b;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.ojx
    public final String toString() {
        Intent intent = this.a;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.a;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
