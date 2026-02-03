package defpackage;

import com.android.vcard.VCardBuilder;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feou extends fenc {
    private static final long serialVersionUID = 7048785558435608687L;
    public String a;
    public feor b;

    protected feou(String str, feor feorVar) {
        this.a = str;
        this.b = feorVar;
    }

    public final feno b(String str) {
        for (feno fenoVar : this.b.a) {
            if (str.equalsIgnoreCase(fenoVar.a)) {
                return fenoVar;
            }
        }
        return null;
    }

    public abstract void c(String str);

    public final boolean equals(Object obj) {
        if (!(obj instanceof feou)) {
            return super.equals(obj);
        }
        feou feouVar = (feou) obj;
        if (!this.a.equals(feouVar.a)) {
            return false;
        }
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(a(), feouVar.a());
        ffhfVar.c(this.b, feouVar.b);
        return ffhfVar.a;
    }

    public int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a.toUpperCase());
        ffhgVar.c(a());
        ffhgVar.c(this.b);
        return ffhgVar.a;
    }

    public final String toString() {
        fety fetyVar;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        feor feorVar = this.b;
        if (feorVar != null) {
            stringBuffer.append(feorVar);
        }
        stringBuffer.append(':');
        if (!(this instanceof fewq) ? (this instanceof fenk) : (fetyVar = (fety) b(VCardConstants.PARAM_VALUE)) == null || fetyVar.equals(fety.l)) {
            stringBuffer.append(fexb.f(a()));
        } else {
            stringBuffer.append(fexb.a(fexb.f(a())));
        }
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    protected feou(String str) {
        this(str, new feor());
    }
}
