package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgte extends ArrayList {
    public fgte() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        int size = size();
        int i = 0;
        while (i < size) {
            fgrs fgrsVar = (fgrs) get(i);
            i++;
            if (fgrsVar.W(str)) {
                return fgrsVar.hS(str);
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList
    public final /* bridge */ /* synthetic */ Object clone() {
        fgte fgteVar = new fgte(size());
        int size = size();
        for (int i = 0; i < size; i++) {
            fgteVar.add(((fgrs) get(i)).d());
        }
        return fgteVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sbE = fgre.e();
        int size = size();
        for (int i = 0; i < size; i++) {
            fgrs fgrsVar = (fgrs) get(i);
            if (sbE.length() != 0) {
                sbE.append("\n");
            }
            sbE.append(fgrsVar.hQ());
        }
        return fgre.c(sbE);
    }

    public fgte(int i) {
        super(i);
    }

    public fgte(List list) {
        super(list);
    }
}
