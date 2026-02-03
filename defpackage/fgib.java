package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgib extends fgmf {
    private final fght a = new fght();
    private final List b;
    private final List c;
    private boolean d;

    public fgib(List list, fgly fglyVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.d = true;
        this.c = list;
        arrayList.add(fglyVar);
    }

    public static List a(fgly fglyVar) {
        CharSequence charSequence = fglyVar.a;
        int iC = fgmp.c(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(iC) == '|') {
            iC++;
            length = fgmp.d(charSequence, charSequence.length() - 1, iC) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = iC;
        while (iC < length) {
            char cCharAt = charSequence.charAt(iC);
            if (cCharAt == '\\') {
                int i2 = iC + 1;
                if (i2 >= length || charSequence.charAt(i2) != '|') {
                    sb.append('\\');
                } else {
                    sb.append('|');
                    iC = i2;
                }
            } else if (cCharAt != '|') {
                sb.append(cCharAt);
            } else {
                String string = sb.toString();
                fglyVar.a(i, iC);
                arrayList.add(new fgly(string, null));
                sb.setLength(0);
                i = iC + 1;
            }
            iC++;
        }
        if (sb.length() > 0) {
            String string2 = sb.toString();
            fglyVar.a(i, charSequence.length());
            arrayList.add(new fgly(string2, null));
        }
        return arrayList;
    }

    private final fghv j(fgly fglyVar, int i, fglr fglrVar) {
        fghv fghvVar = new fghv();
        fgll fgllVar = fglyVar.b;
        List list = this.c;
        if (i < list.size()) {
            fgia fgiaVar = (fgia) list.get(i);
            int i2 = fgiaVar.b;
            int i3 = fgiaVar.a;
        }
        CharSequence charSequence = fglyVar.a;
        int iC = fgmp.c(charSequence, 0, charSequence.length());
        fglrVar.a(fglz.c(fglyVar.a(iC, fgmp.d(charSequence, charSequence.length() - 1, iC) + 1)), fghvVar);
        return fghvVar;
    }

    @Override // defpackage.fgmi
    public final fgkk b() {
        return this.a;
    }

    @Override // defpackage.fgmi
    public final fgmh c(fgml fgmlVar) {
        fgin fginVar = (fgin) fgmlVar;
        CharSequence charSequence = fginVar.c.a;
        int iA = fgmp.a('|', charSequence, fginVar.f);
        if (iA == -1) {
            return null;
        }
        if (iA != fginVar.f || fgmp.c(charSequence, iA + 1, charSequence.length()) != charSequence.length()) {
            return new fgid(fginVar.d, -1, false);
        }
        this.d = false;
        return null;
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void d(fgly fglyVar) {
        this.b.add(fglyVar);
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final void e(fglr fglrVar) {
        fght fghtVar = this.a;
        List listF = fghtVar.f();
        fgll fgllVar = !listF.isEmpty() ? (fgll) listF.get(0) : null;
        fghw fghwVar = new fghw();
        if (fgllVar != null) {
            fghwVar.g(fgllVar);
        }
        fghtVar.h(fghwVar);
        fghx fghxVar = new fghx();
        fghxVar.j(fghwVar.f());
        fghwVar.h(fghxVar);
        List list = this.b;
        List listA = a((fgly) list.get(0));
        int size = listA.size();
        for (int i = 0; i < size; i++) {
            fghxVar.h(j((fgly) listA.get(i), i, fglrVar));
        }
        int i2 = 2;
        fghu fghuVar = null;
        while (i2 < list.size()) {
            fgly fglyVar = (fgly) list.get(i2);
            fgll fgllVar2 = i2 < listF.size() ? (fgll) listF.get(i2) : null;
            List listA2 = a(fglyVar);
            fghx fghxVar2 = new fghx();
            if (fgllVar2 != null) {
                fghxVar2.g(fgllVar2);
            }
            int i3 = 0;
            while (i3 < size) {
                fghxVar2.h(j(i3 < listA2.size() ? (fgly) listA2.get(i3) : new fgly("", null), i3, fglrVar));
                i3++;
            }
            if (fghuVar == null) {
                fghuVar = new fghu();
                fghtVar.h(fghuVar);
            }
            fghuVar.h(fghxVar2);
            fghuVar.g(fgllVar2);
            i2++;
        }
    }

    @Override // defpackage.fgmf, defpackage.fgmi
    public final boolean f() {
        return this.d;
    }
}
