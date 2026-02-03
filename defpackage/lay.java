package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lay implements lbz {
    final /* synthetic */ String a;

    public lay(String str) {
        this.a = str;
    }

    @Override // defpackage.lbz
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        laz lazVar = (laz) obj;
        synchronized (lba.c) {
            cvw cvwVar = lba.d;
            String str = this.a;
            ArrayList arrayList = (ArrayList) cvwVar.get(str);
            if (arrayList == null) {
                return;
            }
            cvwVar.remove(str);
            for (int i = 0; i < arrayList.size(); i++) {
                ((lbz) arrayList.get(i)).accept(lazVar);
            }
        }
    }
}
