package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebuc extends lzn {
    private List j;

    public ebuc(Context context) {
        super(context.getApplicationContext());
    }

    @Override // defpackage.lzn
    public final /* bridge */ /* synthetic */ Object a() {
        TreeSet treeSet = new TreeSet();
        String[] strArrSplit = ebug.a(this.c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            int iIndexOf = str.indexOf(32);
            String[] strArrSplit2 = str.substring(0, iIndexOf).split(":");
            ejwl.p(strArrSplit2.length == 2 && iIndexOf > 0, "Invalid license meta-data line:\n%s", str);
            arrayList.add(new ebua(str.substring(iIndexOf + 1), Long.parseLong(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])));
        }
        Collections.sort(arrayList);
        treeSet.addAll(arrayList);
        return DesugarCollections.unmodifiableList(new ArrayList(treeSet));
    }

    @Override // defpackage.lzp
    protected final void m() {
        List list = this.j;
        if (list != null) {
            j(list);
        } else {
            f();
        }
    }

    @Override // defpackage.lzp
    protected final void n() {
        h();
    }

    @Override // defpackage.lzp
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void j(List list) {
        this.j = list;
        super.j(list);
    }
}
