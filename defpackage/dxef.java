package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxef implements dwwx {
    public final dxed b;
    public final dwwy c;
    private final dvip d;
    private final dwje e;
    private dwwx g;
    public ekgb a = null;
    private dwxc f = null;

    public dxef(dxed dxedVar, dwje dwjeVar, dwpx dwpxVar, dvip dvipVar, dviy dviyVar) {
        this.b = dxedVar;
        this.e = dwjeVar;
        this.d = dvipVar;
        this.c = dviyVar.a(dwpxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwwx
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final ekgb ekgbVar = (ekgb) obj;
        b();
        this.a = ekgbVar;
        final ArrayList arrayList = new ArrayList();
        if (ekgbVar.isEmpty()) {
            this.b.b(Arrays.asList(new dwpf[0]));
        }
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            dwpk dwpkVar = (dwpk) ekgbVar.get(i);
            arrayList.add(((dvli) this.d).e(this.e, dwpkVar, new ejwm() { // from class: dvlc
                @Override // defpackage.ejwm
                public final boolean a(Object obj2) {
                    return ((dwpf) obj2).a() == -1;
                }
            }));
        }
        this.g = new dwwx() { // from class: dxee
            @Override // defpackage.dwwx
            public final void a(Object obj2) {
                ekgb ekgbVar2 = ekgbVar;
                dxef dxefVar = this.a;
                dwxb dwxbVar = (dwxb) obj2;
                if (ejwh.a(ekgbVar2, dxefVar.a)) {
                    List list = arrayList;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add((dwpf) dwxbVar.a.get((dwwy) it.next()));
                    }
                    dxefVar.b.b(arrayList2);
                }
            }
        };
        dwxc dwxcVar = new dwxc(arrayList);
        this.f = dwxcVar;
        dwxcVar.j(this.g);
    }

    public final void b() {
        dwxc dwxcVar = this.f;
        if (dwxcVar != null) {
            dwxcVar.l(this.g);
            this.f = null;
            this.g = null;
        }
    }
}
