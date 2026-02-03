package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmu {
    public static final String a = qas.d("DiagnosticsWrkr");

    public static final String a(qiy qiyVar, qkn qknVar, qiq qiqVar, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qjn qjnVar = (qjn) it.next();
            qio qioVarA = qip.a(qiqVar, qkl.a(qjnVar));
            Integer numValueOf = qioVarA != null ? Integer.valueOf(qioVarA.c) : null;
            String str = qjnVar.c;
            pff pffVarA = pff.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            pffVarA.g(1, str);
            pex pexVar = ((qja) qiyVar).a;
            pexVar.m();
            Cursor cursorA = phn.a(pexVar, pffVarA, false);
            try {
                ArrayList arrayList = new ArrayList(cursorA.getCount());
                while (cursorA.moveToNext()) {
                    arrayList.add(cursorA.getString(0));
                }
                cursorA.close();
                pffVarA.j();
                sb.append("\n" + str + "\t " + qjnVar.e + "\t " + numValueOf + "\t " + qjnVar.d.name() + "\t " + fcva.aF(arrayList, ",", null, null, null, 62) + "\t " + fcva.aF(qknVar.a(str), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                cursorA.close();
                pffVarA.j();
                throw th;
            }
        }
        return sb.toString();
    }
}
