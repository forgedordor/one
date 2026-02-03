package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qin implements qik {
    public final pex a;

    public qin(pex pexVar) {
        this.a = pexVar;
    }

    public final void a(HashMap map) throws IOException {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pib.a(map, new fdap() { // from class: qim
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    this.a.a((HashMap) obj);
                    return fctx.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        pii.a(sb, size);
        sb.append(")");
        pff pffVarA = pff.a(sb.toString(), size);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            pffVarA.g(i, (String) it.next());
            i++;
        }
        Cursor cursorA = phn.a(this.a, pffVarA, false);
        try {
            int iA = phm.a(cursorA, "work_spec_id");
            if (iA != -1) {
                while (cursorA.moveToNext()) {
                    ArrayList arrayList = (ArrayList) map.get(cursorA.getString(iA));
                    if (arrayList != null) {
                        arrayList.add(pzs.c(cursorA.getBlob(0)));
                    }
                }
            }
        } finally {
            cursorA.close();
        }
    }

    public final void b(HashMap map) throws IOException {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pib.a(map, new fdap() { // from class: qil
                @Override // defpackage.fdap
                public final Object invoke(Object obj) throws IOException {
                    this.a.b((HashMap) obj);
                    return fctx.a;
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        pii.a(sb, size);
        sb.append(")");
        pff pffVarA = pff.a(sb.toString(), size);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            pffVarA.g(i, (String) it.next());
            i++;
        }
        Cursor cursorA = phn.a(this.a, pffVarA, false);
        try {
            int iA = phm.a(cursorA, "work_spec_id");
            if (iA != -1) {
                while (cursorA.moveToNext()) {
                    ArrayList arrayList = (ArrayList) map.get(cursorA.getString(iA));
                    if (arrayList != null) {
                        arrayList.add(cursorA.getString(0));
                    }
                }
            }
        } finally {
            cursorA.close();
        }
    }
}
