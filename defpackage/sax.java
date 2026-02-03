package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sax {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    public final synchronized say a(String str) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((saw) arrayList.get(i)).a.equals(str)) {
                return (say) this.b.get(i);
            }
        }
        return null;
    }

    public final synchronized void b(saw sawVar, say sayVar) {
        this.a.add(sawVar);
        this.b.add(sayVar);
    }
}
