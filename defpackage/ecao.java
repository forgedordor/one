package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecao implements rzw {
    private final Context a;

    public ecao(Context context) {
        this.a = context;
    }

    @Override // defpackage.rzw
    public final String a() {
        return "poke";
    }

    @Override // defpackage.rzw
    public final void b(rzv rzvVar) {
        String strI;
        String strC;
        String[] strArrD;
        ecaq ecaqVar = ecaf.a;
        PrintStream printStream = rzvVar.a;
        if (!ecad.b) {
            printStream.println("ERROR: poke is not enabled");
            return;
        }
        ListIterator listIterator = rzvVar.b.listIterator();
        String str = listIterator.hasNext() ? (String) listIterator.next() : null;
        Context context = this.a;
        ebzy ebzyVarC = ecaf.c();
        if ("autocomplete".equals(str)) {
            ebzv ebzvVarC = ecah.c(listIterator, ebzyVarC);
            if (listIterator.hasNext()) {
                ebzu ebzuVarA = ecaf.a(ebzvVarC, (String) listIterator.next());
                strArrD = ebzuVarA == null ? ecah.a : ebzuVarA.d(context, ecah.b(listIterator));
            } else {
                HashSet hashSet = new HashSet();
                Iterator it = ebzvVarC.d().iterator();
                while (it.hasNext()) {
                    hashSet.add(((ebzu) it.next()).b());
                }
                Iterator it2 = ebzvVarC.e().iterator();
                while (it2.hasNext()) {
                    hashSet.add(((ebzv) it2.next()).c());
                }
                strArrD = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
            strI = TextUtils.join(" ", strArrD);
        } else if ("run".equals(str)) {
            ebzv ebzvVarC2 = ecah.c(listIterator, ebzyVarC);
            if (listIterator.hasNext()) {
                String str2 = (String) listIterator.next();
                String[] strArrB = ecah.b(listIterator);
                ebzu ebzuVarA2 = ecaf.a(ebzvVarC2, str2);
                if (ebzuVarA2 != null) {
                    try {
                        strC = ebzuVarA2.c(context, strArrB);
                    } catch (Exception e) {
                        strC = "Action failed:\n" + e.toString() + "\n  " + TextUtils.join("\n  ", e.getStackTrace());
                    }
                } else {
                    strC = "Invalid action: ".concat(String.valueOf(str2));
                }
                strI = String.valueOf(strC).concat("\n");
            } else {
                ecak ecakVar = new ecak();
                ecah.a(ebzvVarC2, 0, ecakVar);
                strI = ecakVar.toString();
            }
        } else {
            strI = a.I(listIterator, "Invalid command: ", "\n");
        }
        printStream.print(strI);
    }
}
