package defpackage;

import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eboc extends ebob {
    public final List a;

    public eboc() {
        this.a = new ArrayList();
    }

    @Override // defpackage.ebob
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return stringBuffer.toString();
            }
            stringBuffer.append(((ebob) list.get(i)).a());
            i++;
            if (i < list.size()) {
                stringBuffer.append(",");
            }
        }
    }

    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public final String c() {
        List list = this.a;
        if (list.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (this.c.equals("WWW-Authenticate") || this.c.equals("Via") || this.c.equals("Proxy-Authenticate") || this.c.equals("Authorization") || this.c.equals("Proxy-Authorization")) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(((ebob) list.get(i)).c());
            }
            return stringBuffer.toString();
        }
        return this.c + ": " + a() + VCardBuilder.VCARD_END_OF_LINE;
    }

    @Override // defpackage.ebob, defpackage.ebmd
    public Object clone() {
        eboc ebocVar = new eboc();
        String str = this.c;
        if (str != null) {
            ebocVar.c = str;
        }
        String str2 = this.d;
        int i = 0;
        if (str2 != null) {
            ebocVar.d = str2;
        }
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return ebocVar;
            }
            ebocVar.a.add((ebob) ((ebob) list.get(i)).clone());
            i++;
        }
    }

    @Override // defpackage.ebob
    public final ebmk d() {
        return null;
    }

    public final ebob e(int i) {
        return (ebob) this.a.get(i);
    }

    @Override // defpackage.ebob
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof eboc) && this.a.equals(((eboc) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    public final ebob f() {
        List list = this.a;
        if (list.size() == 0) {
            return null;
        }
        return (ebob) list.get(0);
    }

    public final void g(ebob ebobVar) {
        if (!this.c.equals(ebobVar.c)) {
            throw new IllegalArgumentException("bad type");
        }
        this.a.add(ebobVar);
    }

    @Override // defpackage.ebob
    public final int hashCode() {
        int iHashCode = super.hashCode();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 37) + ((ebob) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.a.isEmpty();
    }

    public eboc(String str) {
        this.a = new ArrayList();
        this.c = str;
    }

    public eboc(ebob... ebobVarArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ebob ebobVar = ebobVarArr[0];
        if (ebobVar == null) {
            return;
        }
        this.c = ebobVar.c;
        Collections.addAll(arrayList, ebobVarArr);
    }
}
