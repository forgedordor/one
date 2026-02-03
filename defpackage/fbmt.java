package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbmt {
    static ArrayList a;
    public Object b;

    private fbmt() {
    }

    public static synchronized fbmt a() {
        fbmt fbmtVar;
        if (a == null) {
            a = new ArrayList();
        }
        fbmtVar = new fbmt();
        a.add(fbmtVar);
        return fbmtVar;
    }
}
