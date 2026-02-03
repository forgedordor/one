package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class joh {
    public static final View a(jkr jkrVar, int i) {
        Object next;
        Iterator it = jkrVar.b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((jcr) ((Map.Entry) next).getKey()).c == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (kkt) entry.getValue();
        }
        return null;
    }

    public static final jof b(List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((jof) list.get(i2)).a == i) {
                return (jof) list.get(i2);
            }
        }
        return null;
    }

    public static final jyi c(jsc jscVar) {
        ArrayList arrayList = new ArrayList();
        jrn jrnVar = (jrn) jsd.a(jscVar, jsa.a);
        if (jrnVar == null || !((Boolean) ((fdap) jrnVar.b).invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (jyi) arrayList.get(0);
    }

    public static final String d(int i) {
        if (jrw.a(i, 0)) {
            return "android.widget.Button";
        }
        if (jrw.a(i, 1)) {
            return "android.widget.CheckBox";
        }
        if (jrw.a(i, 3)) {
            return "android.widget.RadioButton";
        }
        if (jrw.a(i, 5)) {
            return "android.widget.ImageView";
        }
        if (jrw.a(i, 6)) {
            return "android.widget.Spinner";
        }
        if (jrw.a(i, 7)) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
