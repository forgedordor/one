package defpackage;

import com.android.vcard.VCardBuilder;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class femz implements Serializable {
    private static final long serialVersionUID = 4943193483665822201L;
    public String a;
    public ferc b;

    protected femz(String str, ferc fercVar) {
        this.a = str;
        this.b = fercVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final feou a(String str) {
        ferc fercVar = this.b;
        int size = fercVar.size();
        int i = 0;
        while (i < size) {
            feou feouVar = (feou) fercVar.get(i);
            i++;
            if (feouVar.a.equalsIgnoreCase(str)) {
                return feouVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ferc b(String str) {
        ferc fercVar = this.b;
        ferc fercVar2 = new ferc();
        int size = fercVar.size();
        for (int i = 0; i < size; i++) {
            feou feouVar = (feou) fercVar.get(i);
            if (feouVar.a.equalsIgnoreCase(str)) {
                fercVar2.add(feouVar);
            }
        }
        return fercVar2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof femz)) {
            return super.equals(obj);
        }
        femz femzVar = (femz) obj;
        ffhf ffhfVar = new ffhf();
        ffhfVar.c(this.a, femzVar.a);
        ffhfVar.c(this.b, femzVar.b);
        return ffhfVar.a;
    }

    public int hashCode() {
        ffhg ffhgVar = new ffhg();
        ffhgVar.c(this.a);
        ffhgVar.c(this.b);
        return ffhgVar.a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BEGIN:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        stringBuffer.append(this.b);
        stringBuffer.append("END:");
        stringBuffer.append(this.a);
        stringBuffer.append(VCardBuilder.VCARD_END_OF_LINE);
        return stringBuffer.toString();
    }

    protected femz(String str) {
        this(str, new ferc());
    }
}
